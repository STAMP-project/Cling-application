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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, readableInstant2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"en-US\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = dateTimeFormatter0.parseLocalDate("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"und\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeFormatter3.parseMillis("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"und\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = dateTimeFormatter5.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale[] localeArray6 = new java.util.Locale[] { locale4 };
        java.util.ArrayList<java.util.Locale> localeList7 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList7, localeArray6);
        java.util.List<java.util.Locale> localeList9 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList11 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList7, filteringMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-US" + "'", str5, "en-US");
        org.junit.Assert.assertNotNull(localeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localeList9);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.io.Writer writer6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer6, readableInstant7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: ");
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
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZone(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = dateTimeFormatter8.parseLocalTime("und");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter6.print((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.lang.Appendable appendable1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, readablePartial2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
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
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        boolean boolean2 = locale0.equals((java.lang.Object) "English (United States)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
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
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyear();
        boolean boolean12 = languageRange1.equals((java.lang.Object) chronology10);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray16 = new int[] { '4', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            chronology8.validate(readablePartial12, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[52, 97, 32]");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = dateTimeFormatter3.parseLocalTime("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"und\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        java.io.Writer writer7 = null;
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale13, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        java.util.Locale locale20 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology18, locale20, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str26 = dateTimeZone24.getName((long) 2000);
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale29.toLanguageTag();
        java.util.Locale locale32 = new java.util.Locale("hi!");
        java.lang.String str33 = locale32.getDisplayCountry();
        java.lang.String str34 = locale32.toLanguageTag();
        java.lang.String str35 = locale29.getDisplayName(locale32);
        java.lang.String str36 = locale27.getDisplayCountry(locale32);
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        java.lang.String str39 = locale32.getDisplayVariant(locale37);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter6.printTo(writer7, (long) (short) 10, chronology18, (int) '#', dateTimeZone24, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertEquals(locale20.toString(), "eng");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en-US" + "'", str30, "en-US");
        org.junit.Assert.assertEquals(locale32.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "und" + "'", str34, "und");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "English (United States)" + "'", str35, "English (United States)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "United States" + "'", str36, "United States");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        java.lang.Appendable appendable7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: UTC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        java.lang.Appendable appendable5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable5, readablePartial6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology9.getDateTimeMillis((int) (short) 0, 10, (int) (short) 1, (int) (byte) 1, (int) 'a', (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology9.getDateTimeMillis((int) ' ', 2000, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        int int7 = dateTimeFormatter6.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = dateTimeFormatter6.parseMutableDateTime("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setLanguageTag("United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.lang.Appendable appendable6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(appendable6, readableInstant7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = chronology8.get(readablePeriod11, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology9.get(readablePeriod14, 1L, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZone(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter8.print((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTimeFormatter0.parseDateTime("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        java.io.Writer writer7 = null;
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.year();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        long long25 = dateTimeZone22.adjustOffset((long) 0, true);
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale26.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter6.printTo(writer7, (long) '4', chronology17, 1, dateTimeZone22, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "it" + "'", str27, "it");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.io.Writer writer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer6, readablePartial7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.year();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology8.get(readablePeriod13, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("1/1/70");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1/1/70\" is malformed at \"/1/70\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.joda.time.format.DateTimeFormat.patternForStyle("+00:00", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: +00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology8.getDateTimeMillis(1L, 2000, (int) (byte) 100, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray14 = new int[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            chronology8.validate(readablePartial12, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DurationField durationField11 = chronology8.eras();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.joda.time.format.DateTimeFormat.mediumTime();
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        boolean boolean5 = locale0.equals((java.lang.Object) chronology4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale locale7 = locale6.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setLocale(locale6);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        int int6 = dateTimeFormatter3.getDefaultYear();
        java.lang.Appendable appendable7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(appendable7, readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setRegion("United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, readableInstant2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("+00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        org.joda.time.Chronology chronology7 = dateTimeFormatter4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = dateTimeFormatter4.parseLocalDate("1/1/70");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = dateTimeFormatter0.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.io.IOException iOException4 = new java.io.IOException();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        boolean boolean6 = locale1.equals((java.lang.Object) iOException4);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        java.lang.StringBuffer stringBuffer2 = null;
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer2, readablePartial3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'und' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology8.getDateTimeMillis((long) (short) 1, 100, (int) (short) 10, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        long long16 = chronology8.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = chronology8.getDateTimeMillis((int) (byte) 1, 100, (int) (byte) 0, (int) '#', (int) (byte) -1, (int) 'x', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter3.getPrinter();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        java.util.Locale locale19 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology17, locale19, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField22 = chronology17.millis();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        long long27 = dateTimeZone24.adjustOffset((long) 0, true);
        java.lang.String str29 = dateTimeZone24.getNameKey((long) (-1));
        java.util.Locale locale30 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter5.printTo(stringBuffer6, (long) (byte) -1, chronology17, (int) (short) 100, dateTimeZone24, locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimePrinter5);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertEquals(locale19.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: en-US");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
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
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getName((long) 2000);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer7, readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        long long6 = dateTimeZone0.convertUTCToLocal((long) 10);
        java.lang.Class<?> wildcardClass7 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getName((long) 2000);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter0.getParser();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter9.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser11);
        int int13 = dateTimePrinter6.estimatePrintedLength();
        java.io.Writer writer14 = null;
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale20 = new java.util.Locale("hi!");
        java.lang.String str21 = locale20.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale20, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        java.util.Locale locale27 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology25, locale27, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField30 = chronology25.days();
        org.joda.time.DurationField durationField31 = chronology25.halfdays();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale36 = new java.util.Locale("hi!");
        java.lang.String str37 = locale36.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(0L, chronology34, locale36, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.days();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.year();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter45.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str49 = dateTimeZone47.getName((long) 2000);
        boolean boolean50 = dateTimeZone47.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter45.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology52 = chronology41.withZone(dateTimeZone47);
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale53.toLanguageTag();
        java.lang.String str55 = locale53.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter6.printTo(writer14, (long) (byte) -1, chronology25, (int) (byte) 0, dateTimeZone47, locale53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeParser11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 40 + "'", int13 == 40);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertEquals(locale27.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertEquals(locale36.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00" + "'", str49, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "en-US" + "'", str54, "en-US");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "eng" + "'", str55, "eng");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setLanguage("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.util.Locale locale1 = new java.util.Locale("eng");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "eng");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        int int7 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.ReadWritableInstant readWritableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dateTimeFormatter6.parseInto(readWritableInstant8, "\u82f1\u6587\u7f8e\u570b)", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale.Builder builder6 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguage("1/1/70");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 1/1/70 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        int int1 = dateTimeFormatter0.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = dateTimeFormatter0.parseLocalDate("1/1/70");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1/1/70\" is malformed at \"/1/70\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2000 + "'", int1 == 2000);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology9.getDateTimeMillis((int) 'x', 40, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        java.io.Writer writer2 = null;
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer2, readablePartial3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("+00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.days();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        long long19 = chronology9.add(0L, (long) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology9.getDateTimeMillis((int) (short) 10, 2000, (int) 'u', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale9.toLanguageTag();
        java.lang.String str12 = locale6.getDisplayName(locale9);
        java.lang.String str13 = locale4.getDisplayCountry(locale9);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.lang.String str16 = locale9.getDisplayVariant(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder0.setLocale(locale9);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-US" + "'", str7, "en-US");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "und" + "'", str11, "und");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English (United States)" + "'", str12, "English (United States)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "United States" + "'", str13, "United States");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = dateTimeFormatter5.parseMutableDateTime("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United States\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        int int7 = dateTimeFormatter6.getDefaultYear();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
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
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology9.getDateTimeMillis((-1), 10, (int) (byte) 1, (int) '#', (int) (short) -1, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        int int8 = dateTimeParserBucket7.getOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        java.util.Locale locale13 = new java.util.Locale("it");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket7.saveField(dateTimeFieldType10, "", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        int int8 = dateTimeParserBucket7.getOffset();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket7.saveField(dateTimeFieldType9, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("giapponese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=giapponese");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setLanguage("giapponese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: giapponese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable7, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str6 = locale2.toString();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter8.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withZoneUTC();
        java.lang.Appendable appendable22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter21.printTo(appendable22, readableInstant23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTimeFormatter6.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.toLanguageTag();
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale6.toLanguageTag();
        java.lang.String str9 = locale3.getDisplayName(locale6);
        java.lang.String str10 = locale1.getDisplayCountry(locale6);
        java.lang.String str11 = locale0.getDisplayScript(locale1);
        java.util.Locale.Category category12 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = java.util.Locale.getDefault(category12);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = locale13.getDisplayVariant(locale14);
        java.lang.String str16 = locale0.getDisplayName(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale14.getUnicodeLocaleType("\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese (China)" + "'", str9, "Chinese (China)");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category12.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str16, "\u4e2d\u6587\u4e2d\u570b)");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale.Builder builder6 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology8.getDateTimeMillis((int) (byte) 1, (int) (short) 100, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.millis();
        long long18 = chronology9.add((long) (byte) 100, (long) (byte) 1, 0);
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = chronology9.get(readablePartial19, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter3.getZone();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(stringBuffer7, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter8.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withZoneUTC();
        java.util.Locale locale22 = dateTimeFormatter20.getLocale();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNull(locale22);
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
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter4.print((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter2.print((long) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter6.print(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = dateTimeFormatter0.parseLocalDateTime("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = null;
        dateTimeParserBucket7.saveField(dateTimeField8, 10);
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket7.saveField(dateTimeFieldType12, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = chronology9.months();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = chronology9.get(readablePartial17, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"und\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.util.Locale locale1 = new java.util.Locale("China");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "china");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "china" + "'", str2, "china");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("china");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: china");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setLanguage("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Chinese (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        java.io.Writer writer1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, readableInstant2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder6.addUnicodeLocaleAttribute("en-us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTimeFormatter2.print(readablePartial6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.removeUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology8.get(readablePartial15, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("giapponese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: giapponese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.String str6 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException" + "'", str6, "java.io.IOException");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("it");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"it\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("", "en-us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getName((long) 2000);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter0.getPrinter();
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, readablePartial2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.Locale locale1 = new java.util.Locale("it");
        java.lang.String str3 = locale1.getExtension('a');
        java.lang.Object obj4 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "it");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        int int6 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = dateTimeFormatter8.parseMutableDateTime("+00:00:00.035");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00:00.035\" is malformed at \":00:00.035\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter3.getPrinter();
        int int6 = dateTimePrinter5.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale13, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        java.util.Locale locale20 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology18, locale20, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField23 = chronology18.days();
        org.joda.time.DurationField durationField24 = chronology18.halfdays();
        long long28 = chronology18.add(0L, (long) (short) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        long long33 = dateTimeZone30.adjustOffset((long) 0, true);
        java.lang.String str35 = dateTimeZone30.getNameKey((long) (-1));
        boolean boolean36 = dateTimeZone30.isFixed();
        java.util.Locale locale38 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology40, locale41, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str45 = locale38.getDisplayCountry(locale41);
        java.lang.String str46 = dateTimeZone30.getName((long) (short) 100, locale38);
        java.util.Locale locale47 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter5.printTo(stringBuffer7, (long) 0, chronology18, (int) (byte) 0, dateTimeZone30, locale47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimePrinter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertEquals(locale20.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ja");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        java.lang.String str2 = dateTimeFormatter0.print((long) (byte) 10);
        java.lang.Appendable appendable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable3, (long) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "70-1-1" + "'", str2, "70-1-1");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setRegion("en-us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en-us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("Chinese (China)", "Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Chinese (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        int int1 = dateTimeFormatter0.getDefaultYear();
        java.io.Writer writer2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer2, readableInstant3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2000 + "'", int1 == 2000);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder10 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setScript("en-us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en-us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable2, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology12.get(readablePartial13, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("it");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style character: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        boolean boolean8 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withChronology(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeFormatter5.parseMillis("\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?? (??)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        boolean boolean5 = dateTimeFormatter4.isParser();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer6, readablePartial7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = dateTimeFormatter0.parseLocalTime("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Etc/UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        org.joda.time.ReadWritableInstant readWritableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dateTimeFormatter0.parseInto(readWritableInstant1, "und", (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale6.getUnicodeLocaleType("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: United States");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u6587", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=52.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        int int6 = dateTimeZone0.getOffsetFromLocal(100L);
        long long8 = dateTimeZone0.nextTransition((long) ' ');
        java.lang.String str9 = dateTimeZone0.toString();
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Etc/UTC" + "'", str9, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        java.lang.Appendable appendable2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter1.printTo(appendable2, readableInstant3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "it");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder12 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.setExtension('x', "\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        java.lang.Integer int14 = dateTimeParserBucket13.getOffsetInteger();
        long long17 = dateTimeParserBucket13.computeMillis(true, "\u82f1\u6587\u7f8e\u570b)");
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale25 = new java.util.Locale("hi!");
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = locale25.toLanguageTag();
        java.lang.String str28 = locale22.getDisplayName(locale25);
        java.lang.String str29 = locale20.getDisplayCountry(locale25);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket13.saveField(dateTimeFieldType18, "\u82f1\u6587\u7f8e\u570b)", locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "und" + "'", str27, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chinese (China)" + "'", str28, "Chinese (China)");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology8.get(readablePartial13, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology8.set(readablePartial11, (long) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronology19.getDateTimeMillis((-99L), 1, (int) (byte) 1, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        int int8 = dateTimeParserBucket7.getOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket7.getZone();
        long long12 = dateTimeZone9.adjustOffset((-1L), true);
        long long15 = dateTimeZone9.adjustOffset((long) 'a', true);
        boolean boolean17 = dateTimeZone9.isStandardOffset((long) 100);
        boolean boolean18 = dateTimeZone9.isFixed();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology22, locale23, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str27 = locale20.getDisplayCountry(locale23);
        java.lang.String str28 = dateTimeZone9.getShortName((long) (short) -1, locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = locale20.getUnicodeLocaleType("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Chinese (China)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguage("United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter3.getZone();
        org.joda.time.Chronology chronology7 = dateTimeFormatter3.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withOffsetParsed();
        java.io.Writer writer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(writer9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimePrinter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.adjustOffset((long) 0, true);
        java.lang.String str11 = dateTimeZone6.getNameKey((long) (-1));
        boolean boolean12 = dateTimeZone6.isFixed();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str21 = locale14.getDisplayCountry(locale17);
        java.lang.String str22 = dateTimeZone6.getName((long) (short) 100, locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withDefaultYear(100);
        org.joda.time.ReadableInstant readableInstant26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dateTimeFormatter2.print(readableInstant26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("70-1-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: 70-1-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = chronology8.get(readablePeriod13, (long) (byte) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("\u5fb7\u6587\u5fb7\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: ?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setLanguageTag("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = chronology8.get(readablePeriod10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter9.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = dateTimeFormatter12.parseLocalDate("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"eng\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeParser11);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.Object obj1 = null;
        boolean boolean2 = locale0.equals(obj1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.lang.String str10 = locale9.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(0L, chronology7, locale9, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        java.util.Locale locale16 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology14, locale16, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField19 = chronology14.weekyearOfCentury();
        org.joda.time.DurationField durationField20 = chronology14.months();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        long long24 = dateTimeZone21.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone25 = dateTimeZone21.toTimeZone();
        int int27 = dateTimeZone21.getOffsetFromLocal(100L);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology29, locale30, (java.lang.Integer) (-1), (int) (byte) 10);
        boolean boolean34 = dateTimeZone21.equals((java.lang.Object) chronology29);
        java.lang.String str36 = dateTimeZone21.getShortName((long) 'a');
        org.joda.time.Chronology chronology37 = chronology14.withZone(dateTimeZone21);
        boolean boolean38 = languageRange1.equals((java.lang.Object) chronology14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals(locale16.toString(), "eng");
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = chronology9.get(readablePeriod16, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter2.parseMutableDateTime("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        boolean boolean2 = dateTimeFormatter0.isOffsetParsed();
        java.lang.Appendable appendable3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable3, readableInstant4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.adjustOffset((long) 0, true);
        java.lang.String str11 = dateTimeZone6.getNameKey((long) (-1));
        boolean boolean12 = dateTimeZone6.isFixed();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str21 = locale14.getDisplayCountry(locale17);
        java.lang.String str22 = dateTimeZone6.getName((long) (short) 100, locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withDefaultYear(100);
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter25.printTo(stringBuffer26, readableInstant27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withOffsetParsed();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable5, 5044L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.year();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = chronology15.get(readablePeriod18, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField15 = chronology8.centuries();
        org.joda.time.ReadablePartial readablePartial16 = null;
        int[] intArray23 = new int[] { 100, (short) 10, 1, (byte) 10, 40, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            chronology8.validate(readablePartial16, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 1, 10, 40, 0]");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getName((long) 2000);
        long long6 = dateTimeZone2.nextTransition((long) 'a');
        java.lang.String str8 = dateTimeZone2.getNameKey((long) 2000);
        boolean boolean9 = languageRange1.equals((java.lang.Object) str8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfDay();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology8.set(readablePartial13, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        int int6 = dateTimeFormatter3.getDefaultYear();
        java.io.Writer writer7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(writer7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTimeFormatter0.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology8.add(readablePeriod11, (long) (-1), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = chronology8.get(readablePeriod16, 0L, (long) 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chinese (China)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.halfdayOfDay();
        long long17 = chronology9.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.monthOfYear();
        java.util.Locale.Category category20 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale25 = new java.util.Locale("hi!");
        java.lang.String str26 = locale25.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(0L, chronology23, locale25, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        java.util.Locale locale32 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology30, locale32, (java.lang.Integer) 10);
        java.util.Locale.setDefault(category20, locale32);
        java.util.Locale locale36 = java.util.Locale.getDefault(category20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology9, locale36, (java.lang.Integer) 2000, (int) ' ');
        dateTimeParserBucket39.setPivotYear((java.lang.Integer) 2000);
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale45 = new java.util.Locale("hi!");
        java.lang.String str46 = locale45.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology43, locale45, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology50 = dateTimeParserBucket49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.days();
        org.joda.time.DurationField durationField52 = chronology50.weekyears();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.year();
        dateTimeParserBucket39.saveField(dateTimeField53, 0);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.FORMAT + "'", category20.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertEquals(locale32.toString(), "eng");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "eng");
        org.junit.Assert.assertEquals(locale45.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.io.IOException iOException1 = new java.io.IOException("en-US");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: en-US" + "'", str3, "java.io.IOException: en-US");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale0.getDisplayName(locale3);
        java.lang.Class<?> wildcardClass7 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese (China)" + "'", str6, "Chinese (China)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension('u', "English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setLanguage("+10:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +10:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology7, locale8, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str12 = locale5.getDisplayCountry(locale8);
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale5.getDisplayLanguage(locale13);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str21 = locale17.toLanguageTag();
        java.lang.String str22 = locale5.getDisplayCountry(locale17);
        java.util.Locale.Builder builder23 = builder3.setLocale(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder3.setRegion("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinese (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "giapponese" + "'", str14, "giapponese");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket(0L, chronology4, locale6, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        java.util.Locale locale13 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology11, locale13, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = chronology11.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale20);
        java.lang.String str22 = dateTimeZone18.getShortName((long) 'u', locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter1.withLocale(locale20);
        java.lang.Appendable appendable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter23.printTo(appendable24, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertEquals(locale13.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone15.adjustOffset((long) 0, true);
        java.lang.String str20 = dateTimeZone15.getNameKey((long) (-1));
        boolean boolean21 = dateTimeZone15.isFixed();
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology25, locale26, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str30 = locale23.getDisplayCountry(locale26);
        java.lang.String str31 = dateTimeZone15.getName((long) (short) 100, locale23);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology9, locale23, (java.lang.Integer) 10, (int) '4');
        java.lang.String str35 = chronology9.toString();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = chronology9.get(readablePeriod36, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ISOChronology[UTC]" + "'", str35, "ISOChronology[UTC]");
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField13 = chronology8.months();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology8.get(readablePeriod14, (long) 10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        boolean boolean2 = dateTimeFormatter0.isOffsetParsed();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withLocale(locale3);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer5, (long) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.ReadWritableInstant readWritableInstant2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dateTimeFormatter0.parseInto(readWritableInstant2, "+00:00", (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology8.add(readablePeriod12, (long) 'u', (int) (short) -1);
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology16.getDateTimeMillis((-1), (int) 'x', 0, (int) (byte) 10, (-1), (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 117L + "'", long15 == 117L);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str4 = dateTimeZone0.toString();
        boolean boolean6 = dateTimeZone0.isStandardOffset(5044L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Etc/UTC" + "'", str4, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setScript("United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getName((long) 2000);
        boolean boolean12 = dateTimeZone9.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter7.getParser();
        int int15 = dateTimeParser14.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser14);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter16.getPrinter();
        java.lang.StringBuffer stringBuffer18 = null;
        org.joda.time.ReadablePartial readablePartial19 = null;
        java.util.Locale locale21 = new java.util.Locale("hi!");
        java.lang.String str22 = locale21.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter17.printTo(stringBuffer18, readablePartial19, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertNotNull(dateTimePrinter17);
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        int int6 = dateTimeFormatter3.getDefaultYear();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(stringBuffer7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        int int6 = dateTimeFormatter3.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTimeFormatter3.parseDateTime("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"und\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: +00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        org.joda.time.ReadablePartial readablePartial17 = null;
        int[] intArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            chronology15.validate(readablePartial17, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("+00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("USA", "China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: USA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.year();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology8.set(readablePartial13, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = dateTimeFormatter0.parseLocalDate("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh-CN\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder10 = builder3.clear();
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology13, locale14, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str18 = locale11.getDisplayCountry(locale14);
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale11.getDisplayLanguage(locale19);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology22, locale23, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str27 = locale23.toLanguageTag();
        java.lang.String str28 = locale11.getDisplayCountry(locale23);
        java.util.Locale.Builder builder29 = builder3.setLocale(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder31 = builder3.setRegion("1/1/70");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 1/1/70 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "giapponese" + "'", str20, "giapponese");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "it" + "'", str27, "it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateTimeFormatter0.print(readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale2.getDisplayName(locale5);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        java.lang.String str10 = locale5.getScript();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale14.toLanguageTag();
        java.util.Locale locale17 = new java.util.Locale("hi!");
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale17.toLanguageTag();
        java.lang.String str20 = locale14.getDisplayName(locale17);
        java.lang.String str21 = locale12.getDisplayCountry(locale17);
        java.lang.String str22 = locale11.getDisplayScript(locale12);
        java.util.Locale.Category category23 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale24 = java.util.Locale.getDefault(category23);
        java.util.Locale locale25 = java.util.Locale.TAIWAN;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale11.getDisplayName(locale25);
        java.lang.String str28 = locale5.getDisplayScript(locale11);
        java.lang.Object obj29 = locale11.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (China)" + "'", str8, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "und" + "'", str19, "und");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Chinese (China)" + "'", str20, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category23.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str27, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "zh_CN");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.yearOfEra();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray16 = new int[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            chronology8.validate(readablePartial14, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35]");
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setUnicodeLocaleKeyword("java.io.IOException: en-US", "it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.io.IOException: en-US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.joda.time.Chronology chronology2 = dateTimeFormatter0.getChronology();
        org.joda.time.ReadWritableInstant readWritableInstant3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dateTimeFormatter0.parseInto(readWritableInstant3, "en-US", 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNull(chronology2);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter4.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = dateTimeFormatter4.parseMutableDateTime("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimePrinter7);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getName((long) 2000);
        boolean boolean12 = dateTimeZone9.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter7.getParser();
        int int15 = dateTimeParser14.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = dateTimeFormatter16.parseLocalTime("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"und\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter4.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter4.print(5044L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimePrinter7);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withOffsetParsed();
        java.lang.Appendable appendable5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(appendable5, readablePartial6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setVariant("\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        java.io.Writer writer4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(writer4, readableInstant5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((-99L), chronology9, locale15, (java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology9.getDateTimeMillis((long) '4', (int) (byte) 10, (int) 'a', (int) 'u', 40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "it");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder12 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setExtension('a', "United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getName((long) 2000);
        boolean boolean12 = dateTimeZone9.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter7.getParser();
        int int15 = dateTimeParser14.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser14);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter16.getPrinter();
        java.io.Writer writer18 = null;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.lang.String str24 = locale23.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology21, locale23, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology28 = dateTimeParserBucket27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.weekyear();
        org.joda.time.DurationField durationField30 = chronology28.years();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        long long35 = dateTimeZone32.adjustOffset((long) 0, true);
        java.lang.String str37 = dateTimeZone32.getNameKey((long) (-1));
        java.lang.String str39 = dateTimeZone32.getNameKey((long) 0);
        boolean boolean41 = dateTimeZone32.isStandardOffset((long) ' ');
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet44 = locale43.getExtensionKeys();
        java.util.Locale locale45 = locale43.stripExtensions();
        java.lang.String str46 = dateTimeZone32.getShortName(117L, locale43);
        java.util.Locale locale48 = new java.util.Locale("eng");
        boolean boolean49 = locale48.hasExtensions();
        java.lang.String str50 = locale48.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter17.printTo(writer18, (long) (short) 1, chronology28, 100, dateTimeZone32, locale48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertNotNull(dateTimePrinter17);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertEquals(locale48.toString(), "eng");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.joda.time.format.DateTimeFormat.patternForStyle("giapponese", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: giapponese");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer5, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.joda.time.Chronology chronology2 = dateTimeFormatter0.getChronology();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer3, (long) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNull(chronology2);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.io.IOException iOException1 = new java.io.IOException("UTC");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: UTC" + "'", str2, "java.io.IOException: UTC");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter5.print(readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology12.getDateTimeMillis((int) (byte) 0, (int) (short) -1, (int) 'u', (int) 'a', (int) 'u', (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.util.Locale locale3 = new java.util.Locale("English (United States)", "und", "en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "english (united states)_UND_en-US");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(2000);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.ReadWritableInstant readWritableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dateTimeFormatter3.parseInto(readWritableInstant5, "zh-CN", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeParser4);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter3.getZone();
        org.joda.time.Chronology chronology7 = dateTimeFormatter3.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter3.getZone();
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(writer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimePrinter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        java.lang.Appendable appendable2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter1.printTo(appendable2, readableInstant3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser2 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withOffsetParsed();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer4, readableInstant5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeParser2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale7.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '??' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.dayOfYear();
        org.joda.time.ReadablePartial readablePartial19 = null;
        int[] intArray20 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            chronology15.validate(readablePartial19, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = chronology8.get(readablePartial11, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology15.getDateTimeMillis((int) ' ', (int) (short) 100, (-101), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.toLanguageTag();
        java.lang.Object obj4 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "hi!");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 120");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        int int2 = dateTimeFormatter1.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2000 + "'", int2 == 2000);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getName((long) 2000);
        boolean boolean12 = dateTimeZone9.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter7.getParser();
        int int15 = dateTimeParser14.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeFormatter16.parseMillis("\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?? (??)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter8.withChronology(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = dateTimeFormatter20.parseLocalTime("china");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        int int8 = dateTimeParserBucket7.getOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket7.getZone();
        long long10 = dateTimeParserBucket7.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone11.convertLocalToUTC((-1L), true, (long) (byte) 100);
        dateTimeParserBucket7.setZone(dateTimeZone11);
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket7.saveField(dateTimeFieldType19, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setLocale(locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.adjustOffset((long) 0, true);
        java.lang.String str11 = dateTimeZone6.getNameKey((long) (-1));
        boolean boolean12 = dateTimeZone6.isFixed();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str21 = locale14.getDisplayCountry(locale17);
        java.lang.String str22 = dateTimeZone6.getName((long) (short) 100, locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withDefaultYear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTimeFormatter25.parseDateTime("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter5.getZone();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withDefaultYear((int) (short) 10);
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.adjustOffset((long) 0, true);
        java.lang.String str11 = dateTimeZone6.getNameKey((long) (-1));
        boolean boolean12 = dateTimeZone6.isFixed();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str21 = locale14.getDisplayCountry(locale17);
        java.lang.String str22 = dateTimeZone6.getName((long) (short) 100, locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter2.withZoneUTC();
        java.lang.StringBuffer stringBuffer25 = null;
        org.joda.time.ReadablePartial readablePartial26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter24.printTo(stringBuffer25, readablePartial26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.io.IOException iOException1 = new java.io.IOException("en-US");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        java.io.IOException iOException4 = new java.io.IOException();
        java.io.IOException iOException5 = new java.io.IOException();
        iOException4.addSuppressed((java.lang.Throwable) iOException5);
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray8 = iOException5.getSuppressed();
        iOException1.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.String str10 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: en-US" + "'", str10, "java.io.IOException: en-US");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        java.util.Locale.setDefault(category0, locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = locale12.getUnicodeLocaleType("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals(locale12.toString(), "eng");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser2 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter0.parseMutableDateTime("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United States\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeParser2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("java.io.IOException: en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception:en-us");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        int int6 = dateTimeFormatter3.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dateTimeFormatter3.parseMillis("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?? (??)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale2.getDisplayScript(locale3);
        java.lang.String str6 = locale2.toString();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ja" + "'", str6, "ja");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.util.Locale.Category category1 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category1);
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology6, locale7, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str11 = locale4.getDisplayCountry(locale7);
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale4.getDisplayLanguage(locale12);
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology15, locale16, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str20 = locale16.toLanguageTag();
        java.lang.String str21 = locale4.getDisplayCountry(locale16);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Locale locale23 = java.util.Locale.getDefault(category1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.joda.time.format.DateTimeFormat.patternForStyle("\u4e2d\u6587", locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style character: ?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "giapponese" + "'", str13, "giapponese");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "it" + "'", str20, "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setLanguage("\u5fb7\u6587\u5fb7\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter5.getZone();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withLocale(locale9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        long long14 = dateTimeZone11.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone15 = dateTimeZone11.toTimeZone();
        boolean boolean16 = dateTimeZone11.isFixed();
        boolean boolean17 = dateTimeZone11.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter10.withZone(dateTimeZone11);
        java.io.Writer writer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter18.printTo(writer19, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = chronology8.get(readablePeriod11, 0L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: zh-CN");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter5.getZone();
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimeZone8);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        java.lang.Appendable appendable2 = null;
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter1.printTo(appendable2, readablePartial3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str18 = dateTimeZone16.getName((long) 2000);
        boolean boolean19 = dateTimeZone16.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter14.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology21 = chronology10.withZone(dateTimeZone16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter0.withZone(dateTimeZone16);
        org.joda.time.ReadWritableInstant readWritableInstant23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dateTimeFormatter22.parseInto(readWritableInstant23, "english (united states) (UND,en-US)", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.ReadWritableInstant readWritableInstant4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dateTimeFormatter0.parseInto(readWritableInstant4, "java.io.IOException", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        java.lang.Integer int14 = dateTimeParserBucket13.getOffsetInteger();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket13.saveField(dateTimeFieldType15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = chronology9.months();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronology9.getDateTimeMillis((-1), (int) (short) 0, 0, (int) (byte) 10, (int) (short) 1, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.setRegion("");
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.removeUnicodeLocaleAttribute("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.io.IOException [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        java.lang.String str2 = dateTimeFormatter0.print((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter0.getZone();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer4, readableInstant5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "70/01/01" + "'", str2, "70/01/01");
        org.junit.Assert.assertNull(dateTimeZone3);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setRegion("+00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: +00:00:00.010 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter4.print(readablePartial5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale0.getDisplayName(locale3);
        java.lang.String str7 = locale3.getISO3Language();
        boolean boolean9 = locale3.equals((java.lang.Object) "United States");
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Japanese" + "'", str6, "Japanese");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int) '#');
        org.joda.time.ReadWritableInstant readWritableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dateTimeFormatter6.parseInto(readWritableInstant7, "fr", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.days();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.clockhourOfDay();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 0);
        java.lang.Appendable appendable3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable3, readableInstant4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.toLanguageTag();
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale6.toLanguageTag();
        java.lang.String str9 = locale3.getDisplayName(locale6);
        java.lang.String str10 = locale1.getDisplayCountry(locale6);
        java.lang.String str11 = locale0.getDisplayScript(locale1);
        java.lang.String str12 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ja" + "'", str4, "ja");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Japanese" + "'", str9, "Japanese");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology8.getZone();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology8.get(readablePeriod15, 117L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffset((long) (short) 0);
        long long11 = dateTimeZone0.convertLocalToUTC(0L, true);
        long long14 = dateTimeZone0.adjustOffset((long) (short) 1, true);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone15.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone19 = dateTimeZone15.toTimeZone();
        int int21 = dateTimeZone15.getOffsetFromLocal(100L);
        long long23 = dateTimeZone15.nextTransition((long) ' ');
        long long25 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, (long) 40);
        int int27 = dateTimeZone15.getOffsetFromLocal((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 40L + "'", long25 == 40L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology8.getDateTimeMillis((int) (byte) 10, 0, (int) '4', (int) (byte) -1, (int) (byte) 0, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.lang.String str12 = locale10.getScript();
        java.util.Locale.Builder builder13 = builder7.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder7.addUnicodeLocaleAttribute("zh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u5fb7\u6587\u5fb7\u56fd)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale3.getUnicodeLocaleType("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "en-US");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("it");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = locale9.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale10.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getName((long) 2000);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter0.getPrinter();
        java.io.Writer writer9 = null;
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale14 = new java.util.Locale("hi!");
        java.lang.String str15 = locale14.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale14, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.days();
        org.joda.time.DurationField durationField21 = chronology19.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        long long28 = dateTimeZone25.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone29 = dateTimeZone25.toTimeZone();
        int int31 = dateTimeZone25.getOffsetFromLocal(100L);
        long long33 = dateTimeZone25.nextTransition((long) ' ');
        java.lang.String str34 = dateTimeZone25.toString();
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.lang.String str39 = locale38.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology36, locale38, (java.lang.Integer) 10, (int) 'a');
        java.lang.String str43 = locale38.getLanguage();
        java.lang.String str44 = locale38.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter8.printTo(writer9, (long) (short) 1, chronology19, (-101), dateTimeZone25, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Etc/UTC" + "'", str34, "Etc/UTC");
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder4.setExtension('a', "en-US");
        boolean boolean8 = languageRange1.equals((java.lang.Object) builder4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser2 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.ReadWritableInstant readWritableInstant4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dateTimeFormatter3.parseInto(readWritableInstant4, "english (united states)", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeParser2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter8.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withZoneUTC();
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = locale22.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter20.withLocale(locale23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime26 = dateTimeFormatter24.parseMutableDateTime("1/1/70");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        long long10 = dateTimeParserBucket7.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket7.saveField(dateTimeFieldType12, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = chronology15.get(readablePeriod17, (long) 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder6.setUnicodeLocaleKeyword("ISOChronology[UTC]", "+10:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ISOChronology[UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean6 = dateTimeZone0.isFixed();
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology10, locale11, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str15 = locale8.getDisplayCountry(locale11);
        java.lang.String str16 = dateTimeZone0.getName((long) (short) 100, locale8);
        java.lang.String str17 = locale8.getISO3Country();
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = locale8.getDisplayName(locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        java.lang.Appendable appendable7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = dateTimeFormatter11.parseLocalTime("java.io.IOException: UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.IOException: UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeParser10);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket(0L, chronology4, locale6, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        java.util.Locale locale13 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology11, locale13, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = chronology11.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale20);
        java.lang.String str22 = dateTimeZone18.getShortName((long) 'u', locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter1.withLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime25 = dateTimeFormatter1.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertEquals(locale13.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray6 = iOException3.getSuppressed();
        java.lang.String str7 = iOException3.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException" + "'", str7, "java.io.IOException");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        int int7 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZone(dateTimeZone9);
        java.io.Writer writer11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(writer11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.removeUnicodeLocaleAttribute("en-us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str3 = locale0.getExtension('a');
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        java.io.IOException iOException6 = new java.io.IOException();
        java.io.IOException iOException7 = new java.io.IOException();
        iOException6.addSuppressed((java.lang.Throwable) iOException7);
        iOException5.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray10 = iOException5.getSuppressed();
        boolean boolean11 = locale0.equals((java.lang.Object) throwableArray10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "zh_CN");
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        int int7 = dateTimeFormatter6.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = dateTimeFormatter6.parseLocalDate("70/01/01");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'zh-CN' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField13 = chronology8.months();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = chronology8.get(readablePeriod14, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        double double2 = languageRange1.getWeight();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket(0L, chronology4, locale6, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.days();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.halfdayOfDay();
        org.joda.time.Chronology chronology16 = chronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.halfdayOfDay();
        boolean boolean18 = languageRange1.equals((java.lang.Object) chronology11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDate();
        int int1 = dateTimeFormatter0.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone2 = dateTimeFormatter0.getZone();
        java.io.Writer writer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer3, readablePartial4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2000 + "'", int1 == 2000);
        org.junit.Assert.assertNull(dateTimeZone2);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone15.adjustOffset((long) 0, true);
        java.lang.String str20 = dateTimeZone15.getNameKey((long) (-1));
        boolean boolean21 = dateTimeZone15.isFixed();
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology25, locale26, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str30 = locale23.getDisplayCountry(locale26);
        java.lang.String str31 = dateTimeZone15.getName((long) (short) 100, locale23);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology9, locale23, (java.lang.Integer) 10, (int) '4');
        java.lang.String str35 = locale23.toString();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ja" + "'", str35, "ja");
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.lang.String str17 = locale16.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals(locale12.toString(), "eng");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "eng");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-US");
        java.lang.String str2 = languageRange1.getRange();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getName((long) 2000);
        boolean boolean8 = dateTimeZone5.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withZone(dateTimeZone5);
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter3.getPrinter();
        org.joda.time.Chronology chronology12 = dateTimeFormatter3.getChronolgy();
        boolean boolean13 = languageRange1.equals((java.lang.Object) chronology12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-us" + "'", str2, "en-us");
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimePrinter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("70/01/01");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 70/01/01 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("+32:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+32:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket(0L, chronology4, locale6, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        java.util.Locale locale13 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology11, locale13, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = chronology11.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale20);
        java.lang.String str22 = dateTimeZone18.getShortName((long) 'u', locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter1.withLocale(locale20);
        java.lang.StringBuffer stringBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter23.printTo(stringBuffer24, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertEquals(locale13.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.secondOfDay();
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.lang.String str19 = locale17.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 40, chronology10, locale17);
        java.lang.String str21 = locale17.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.joda.time.format.DateTimeFormat.patternForStyle("fr", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style character: f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category15.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "TW" + "'", str21, "TW");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setRegion("\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        java.lang.Integer int14 = dateTimeParserBucket13.getOffsetInteger();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        java.util.Locale locale20 = new java.util.Locale("UTC", "1/1/70", "it");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket13.saveField(dateTimeFieldType15, "ISOChronology[UTC]", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertEquals(locale20.toString(), "utc_1/1/70_it");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        boolean boolean8 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withChronology(chronology9);
        boolean boolean11 = dateTimeFormatter5.isOffsetParsed();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("China", "United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser10);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder14.setExtension('a', "en-US");
        java.util.Locale.Builder builder19 = builder17.setVariant("");
        java.util.Locale.Builder builder21 = builder17.setScript("");
        java.util.Locale.Builder builder23 = builder17.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder24 = builder17.clear();
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology27, locale28, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str32 = locale25.getDisplayCountry(locale28);
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.lang.String str34 = locale25.getDisplayLanguage(locale33);
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology36, locale37, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str41 = locale37.toLanguageTag();
        java.lang.String str42 = locale25.getDisplayCountry(locale37);
        java.util.Locale.Builder builder43 = builder17.setLocale(locale37);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter7.printTo(stringBuffer12, readablePartial13, locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "giapponese" + "'", str34, "giapponese");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "it" + "'", str41, "it");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale11);
        java.util.Locale.setDefault(locale11);
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale14.getLanguage();
        java.lang.String str16 = locale11.getDisplayLanguage(locale14);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter6.printTo(writer9, readablePartial10, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "it" + "'", str15, "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "cinese" + "'", str16, "cinese");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZone(dateTimeZone5);
        int int7 = dateTimeFormatter6.getDefaultYear();
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable8, 971L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology3, locale4, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str8 = locale1.getDisplayCountry(locale4);
        java.lang.String str9 = locale1.getDisplayCountry();
        java.lang.String str10 = locale1.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.joda.time.format.DateTimeFormat.patternForStyle("zh", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style character: z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "jpn" + "'", str10, "jpn");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("+00:00", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=97.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.io.IOException iOException1 = new java.io.IOException("en-US");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: en-US" + "'", str2, "java.io.IOException: en-US");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.lang.String str12 = locale10.getScript();
        java.util.Locale.Builder builder13 = builder7.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder7.setLanguageTag("\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        boolean boolean2 = dateTimeFormatter0.isOffsetParsed();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withLocale(locale3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = dateTimeFormatter0.parseMutableDateTime("english (united states) (UND,en-US)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"english (united states) (UND,en-US)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.String str1 = iOException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.IOException" + "'", str1, "java.io.IOException");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.util.Locale locale4 = new java.util.Locale("UTC", "1/1/70", "it");
        java.lang.String str5 = locale4.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.joda.time.format.DateTimeFormat.patternForStyle("United States", locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: United States");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "utc_1/1/70_it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1/1/70" + "'", str5, "1/1/70");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.util.Locale.Builder builder10 = builder3.setLocale(locale7);
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder13 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setUnicodeLocaleKeyword("\u82f1\u6587\u7f8e\u570b)", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        int int6 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter3.getParser();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter3.print(readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone15.adjustOffset((long) 0, true);
        java.lang.String str20 = dateTimeZone15.getNameKey((long) (-1));
        boolean boolean21 = dateTimeZone15.isFixed();
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology25, locale26, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str30 = locale23.getDisplayCountry(locale26);
        java.lang.String str31 = dateTimeZone15.getName((long) (short) 100, locale23);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology9, locale23, (java.lang.Integer) 10, (int) '4');
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale35.toLanguageTag();
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.lang.String str39 = locale38.getDisplayCountry();
        java.lang.String str40 = locale38.toLanguageTag();
        java.lang.String str41 = locale35.getDisplayName(locale38);
        java.lang.String str42 = locale23.getDisplayLanguage(locale35);
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale46 = new java.util.Locale("hi!");
        java.lang.String str47 = locale46.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket(0L, chronology44, locale46, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology51 = dateTimeParserBucket50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.days();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.year();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField55 = chronology51.year();
        org.joda.time.Chronology chronology56 = chronology51.withUTC();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.weekyearOfCentury();
        boolean boolean58 = locale23.equals((java.lang.Object) chronology56);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "zh-CN" + "'", str36, "zh-CN");
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "und" + "'", str40, "und");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Chinese (China)" + "'", str41, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u65e5\u6587" + "'", str42, "\u65e5\u6587");
        org.junit.Assert.assertEquals(locale46.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = null;
        dateTimeParserBucket7.saveField(dateTimeField8, 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket7.saveField(dateTimeFieldType11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getName((long) 2000);
        boolean boolean12 = dateTimeZone9.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter7.getParser();
        int int15 = dateTimeParser14.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser14);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter16.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = dateTimeFormatter16.parseMutableDateTime("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertNotNull(dateTimePrinter17);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        org.joda.time.Chronology chronology2 = dateTimeFormatter0.getChronology();
        org.joda.time.Chronology chronology3 = dateTimeFormatter0.getChronology();
        org.joda.time.Chronology chronology4 = dateTimeFormatter0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter0.parseLocalTime("1/1/70");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1/1/70\" is malformed at \"/1/70\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNull(chronology2);
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology8.getDateTimeMillis((long) (byte) -1, (-1), (int) (short) 10, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = dateTimeFormatter3.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer8, (-2000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology8.get(readablePartial15, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u5fb7\u6587\u5fb7\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        long long16 = chronology8.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = chronology8.getDateTimeMillis((int) '#', 2000, (int) (byte) 1, (int) '#', 0, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer2, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-53), (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 117");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology10.months();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale23.toLanguageTag();
        java.lang.String str26 = locale20.getDisplayName(locale23);
        java.lang.String str27 = locale18.getDisplayCountry(locale23);
        java.lang.String str28 = locale17.getDisplayScript(locale18);
        java.util.Locale.Category category29 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale30 = java.util.Locale.getDefault(category29);
        java.util.Locale locale31 = java.util.Locale.TAIWAN;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.lang.String str33 = locale17.getDisplayName(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 2000, chronology10, locale17, (java.lang.Integer) 0, (int) 'x');
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.lang.String str41 = locale40.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale40, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.days();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.year();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.weekyearOfCentury();
        dateTimeParserBucket36.saveField(dateTimeField48, 2000);
        dateTimeParserBucket36.setPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        java.util.Locale locale58 = new java.util.Locale("UTC", "1/1/70", "it");
        java.util.Locale locale59 = locale58.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket36.saveField(dateTimeFieldType53, "TW", locale58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals(locale12.toString(), "eng");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "de" + "'", str21, "de");
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "und" + "'", str25, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "German" + "'", str26, "German");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + category29 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category29.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u5fb7\u6587" + "'", str33, "\u5fb7\u6587");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertEquals(locale58.toString(), "utc_1/1/70_it");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "utc_1/1/70_it");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setScript("+00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale.Builder builder6 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("ja");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ja [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'u');
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology8.add(readablePeriod12, (long) 'u', (int) (short) -1);
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology16.getDateTimeMillis((long) ' ', (-53), (-53), (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 117L + "'", long15 == 117L);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter12.getParser();
        int int20 = dateTimeParser19.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser19);
        java.io.Writer writer22 = null;
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = new java.util.Locale("");
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter7.printTo(writer22, readablePartial23, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeParser19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertEquals(locale25.toString(), "");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("en-us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en-us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.lang.String str12 = locale10.getScript();
        java.util.Locale.Builder builder13 = builder7.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.addUnicodeLocaleAttribute("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology8.get(readablePeriod13, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("eng");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("eng");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.FilteringMode filteringMode21 = null;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList19, filteringMode21);
        java.lang.String str23 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList19);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        java.util.Locale locale26 = new java.util.Locale("hi!");
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale31.toLanguageTag();
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.lang.String str35 = locale34.getDisplayCountry();
        java.lang.String str36 = locale34.toLanguageTag();
        java.lang.String str37 = locale31.getDisplayName(locale34);
        java.lang.String str38 = locale29.getDisplayCountry(locale34);
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.util.Locale locale41 = locale40.stripExtensions();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale46 = new java.util.Locale("hi!");
        java.lang.String str47 = locale46.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket(0L, chronology44, locale46, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology51 = dateTimeParserBucket50.getChronology();
        java.util.Locale locale53 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology51, locale53, (java.lang.Integer) 10);
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.lang.String str59 = locale56.getExtension('a');
        java.util.Locale locale61 = new java.util.Locale("hi!");
        java.lang.String str62 = locale61.getDisplayCountry();
        java.lang.String str63 = locale61.toLanguageTag();
        java.util.Locale locale64 = java.util.Locale.ITALIAN;
        java.lang.String str65 = locale64.getLanguage();
        java.util.Locale locale66 = java.util.Locale.ITALIAN;
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale68.toLanguageTag();
        java.util.Locale locale71 = new java.util.Locale("hi!");
        java.lang.String str72 = locale71.getDisplayCountry();
        java.lang.String str73 = locale71.toLanguageTag();
        java.lang.String str74 = locale68.getDisplayName(locale71);
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale24, locale27, locale28, locale29, locale41, locale53, locale56, locale61, locale64, locale66, locale67, locale71 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Locale.LanguageRange[] languageRangeArray79 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList80 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList80, languageRangeArray79);
        java.util.Locale.LanguageRange[] languageRangeArray82 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList83 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83, languageRangeArray82);
        java.lang.String[] strArray86 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        java.util.Locale.FilteringMode filteringMode89 = null;
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList83, (java.util.Collection<java.lang.String>) strList87, filteringMode89);
        java.lang.String str91 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList80, (java.util.Collection<java.lang.String>) strList87);
        java.util.Locale.FilteringMode filteringMode92 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList87, filteringMode92);
        java.util.Locale.FilteringMode filteringMode94 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList87, filteringMode94);
        java.util.Locale locale96 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet97 = locale96.getUnicodeLocaleKeys();
        java.lang.String str98 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "it" + "'", str32, "it");
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "und" + "'", str36, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Italian" + "'", str37, "Italian");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!");
        org.junit.Assert.assertEquals(locale46.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertEquals(locale53.toString(), "eng");
        org.junit.Assert.assertNotNull(locale56);
// flaky:         org.junit.Assert.assertEquals(locale56.toString(), "it");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "und" + "'", str63, "und");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "it");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "it" + "'", str65, "it");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it");
        org.junit.Assert.assertNotNull(locale67);
// flaky:         org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "it" + "'", str69, "it");
        org.junit.Assert.assertEquals(locale71.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "und" + "'", str73, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Italian" + "'", str74, "Italian");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNotNull(languageRangeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(languageRangeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertTrue("'" + filteringMode92 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode92.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertTrue("'" + filteringMode94 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode94.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNotNull(locale96);
        org.junit.Assert.assertEquals(locale96.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffset((long) (short) 0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        boolean boolean20 = dateTimeZone0.equals((java.lang.Object) chronology17);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = chronology17.get(readablePeriod21, 385L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale10.getDisplayName();
        java.util.Locale.Builder builder13 = builder7.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguage("70-1-1");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 70-1-1 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tedesco (Germania)" + "'", str12, "tedesco (Germania)");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        java.util.Locale locale9 = new java.util.Locale("it");
        java.lang.String str11 = locale9.getExtension('a');
        java.lang.String str12 = locale3.getDisplayName(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale3.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.toLanguageTag();
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale6.toLanguageTag();
        java.lang.String str9 = locale3.getDisplayName(locale6);
        java.lang.String str10 = locale1.getDisplayCountry(locale6);
        java.lang.String str11 = locale0.getDisplayLanguage(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale0.getUnicodeLocaleType("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ISOChronology[UTC]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        int int8 = dateTimeFormatter5.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withPivotYear(0);
        boolean boolean11 = dateTimeFormatter10.isOffsetParsed();
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable12, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        long long19 = dateTimeZone16.adjustOffset((long) 0, true);
        java.lang.String str21 = dateTimeZone16.getNameKey((long) (-1));
        boolean boolean22 = dateTimeZone16.isFixed();
        java.util.Locale locale24 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology26, locale27, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str31 = locale24.getDisplayCountry(locale27);
        java.lang.String str32 = dateTimeZone16.getName((long) (short) 100, locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology10, locale24, (java.lang.Integer) 10, (int) '4');
        java.lang.String str36 = locale24.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = org.joda.time.format.DateTimeFormat.patternForStyle("china", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: china");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ja");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.adjustOffset((long) 0, true);
        java.lang.String str11 = dateTimeZone6.getNameKey((long) (-1));
        boolean boolean12 = dateTimeZone6.isFixed();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str21 = locale14.getDisplayCountry(locale17);
        java.lang.String str22 = dateTimeZone6.getName((long) (short) 100, locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withDefaultYear(100);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale30 = new java.util.Locale("hi!");
        java.lang.String str31 = locale30.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale30, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.days();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.year();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.millisOfDay();
        org.joda.time.DateTimeField dateTimeField39 = chronology35.millisOfDay();
        org.joda.time.DateTimeField dateTimeField40 = chronology35.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        long long44 = dateTimeZone41.adjustOffset((long) 0, true);
        java.lang.String str46 = dateTimeZone41.getNameKey((long) (-1));
        boolean boolean47 = dateTimeZone41.isFixed();
        java.util.Locale locale49 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology51, locale52, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str56 = locale49.getDisplayCountry(locale52);
        java.lang.String str57 = dateTimeZone41.getName((long) (short) 100, locale49);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology35, locale49, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter2.withChronology(chronology35);
        java.io.Writer writer62 = null;
        org.joda.time.ReadablePartial readablePartial63 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter61.printTo(writer62, readablePartial63);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertEquals(locale30.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ja");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00" + "'", str57, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.year();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = chronology15.get(readablePeriod18, (long) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField15 = chronology10.days();
        org.joda.time.DurationField durationField16 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = chronology10.weekyear();
        java.util.Locale locale19 = new java.util.Locale("China");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology10, locale19, (java.lang.Integer) (-1), (int) 'x');
        org.joda.time.DateTimeField dateTimeField23 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = chronology10.secondOfMinute();
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals(locale12.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals(locale19.toString(), "china");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("Japanese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setRegion("China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DurationField durationField11 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.year();
        java.util.Locale.Category category14 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology9, locale15, (java.lang.Integer) 0);
        java.util.Locale locale19 = new java.util.Locale("it");
        java.lang.String str20 = locale15.getDisplayName(locale19);
        java.lang.String str21 = locale19.toString();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category14.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals(locale19.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "italiano" + "'", str20, "italiano");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.joda.time.format.DateTimeFormat.patternForStyle("ENGLISH (UNITED STATES) (UND,EN-US)", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: ENGLISH (UNITED STATES) (UND,EN-US)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = dateTimeFormatter6.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter6.getParser();
        boolean boolean11 = languageRange1.equals((java.lang.Object) dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder10 = builder3.clear();
        java.util.Locale.Builder builder12 = builder3.setLanguageTag("zh-CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder3.setLanguageTag("cinese (Cina)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: cinese (Cina) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'eng' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology15.getDateTimeMillis((int) (byte) 0, (int) '#', (int) (short) 1, 1, 100, (int) (byte) 100, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.halfdayOfDay();
        org.joda.time.DurationField durationField17 = chronology10.centuries();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology10.getZone();
        boolean boolean19 = locale0.equals((java.lang.Object) chronology10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTimeFormatter0.parseDateTime("en-us");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"en-us\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (-53));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -53");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = chronology9.months();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        long long19 = dateTimeZone16.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone20 = dateTimeZone16.toTimeZone();
        int int22 = dateTimeZone16.getOffsetFromLocal(100L);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology24, locale25, (java.lang.Integer) (-1), (int) (byte) 10);
        boolean boolean29 = dateTimeZone16.equals((java.lang.Object) chronology24);
        java.lang.String str31 = dateTimeZone16.getShortName((long) 'a');
        org.joda.time.Chronology chronology32 = chronology9.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField33 = chronology9.year();
        org.joda.time.ReadablePartial readablePartial34 = null;
        int[] intArray38 = new int[] { '4', 2000, (-53) };
        // The following exception was thrown during execution in test generation
        try {
            chronology9.validate(readablePartial34, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[52, 2000, -53]");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology9 = chronology8.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray18 = new int[] { (short) 10, (-121), (byte) -1, (byte) 100, '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            chronology9.validate(readablePartial11, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, -121, -1, 100, 52, 52]");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket(0L, chronology4, locale6, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        java.util.Locale locale13 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology11, locale13, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = chronology11.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale20);
        java.lang.String str22 = dateTimeZone18.getShortName((long) 'u', locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter1.withLocale(locale20);
        java.lang.Appendable appendable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter1.printTo(appendable24, (-62111231999999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertEquals(locale13.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter3.getPrinter();
        int int6 = dateTimePrinter5.estimatePrintedLength();
        int int7 = dateTimePrinter5.estimatePrintedLength();
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("\u4e2d\u6587\u4e2d\u570b)");
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter5.printTo(writer8, readablePartial9, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimePrinter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 40 + "'", int7 == 40);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: ?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter5.getZone();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withLocale(locale9);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter5.getZone();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter5.withChronology(chronology12);
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter13.print(readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getName((long) 2000);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((int) (short) 0);
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("italiano");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italiano");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.util.Locale locale1 = new java.util.Locale("zh-CN");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cn");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = chronology8.get(readablePartial14, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology10.months();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale23.toLanguageTag();
        java.lang.String str26 = locale20.getDisplayName(locale23);
        java.lang.String str27 = locale18.getDisplayCountry(locale23);
        java.lang.String str28 = locale17.getDisplayScript(locale18);
        java.util.Locale.Category category29 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale30 = java.util.Locale.getDefault(category29);
        java.util.Locale locale31 = java.util.Locale.TAIWAN;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.lang.String str33 = locale17.getDisplayName(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 2000, chronology10, locale17, (java.lang.Integer) 0, (int) 'x');
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.lang.String str41 = locale40.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale40, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.days();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.year();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.weekyearOfCentury();
        dateTimeParserBucket36.saveField(dateTimeField48, 2000);
        dateTimeParserBucket36.setPivotYear((java.lang.Integer) 2000);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        java.util.Locale locale56 = java.util.Locale.forLanguageTag("\u5fb7\u6587\u5fb7\u56fd)");
        java.util.Locale.setDefault(locale56);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket36.saveField(dateTimeFieldType53, "", locale56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals(locale12.toString(), "eng");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-CN" + "'", str21, "zh-CN");
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "und" + "'", str25, "und");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chinese (China)" + "'", str26, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + category29 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category29.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str33, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("deu");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: u");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder10 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder3.setRegion("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) (short) 1);
        long long12 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false, 1L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.adjustOffset((long) 0, true);
        java.lang.String str11 = dateTimeZone6.getNameKey((long) (-1));
        boolean boolean12 = dateTimeZone6.isFixed();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str21 = locale14.getDisplayCountry(locale17);
        java.lang.String str22 = dateTimeZone6.getName((long) (short) 100, locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withDefaultYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology27 = dateTimeFormatter26.getChronolgy();
        boolean boolean28 = dateTimeFormatter26.isParser();
        int int29 = dateTimeFormatter26.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNull(chronology27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2000 + "'", int29 == 2000);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("+32:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: +32:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(2000);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(0);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer8, 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology8.getDateTimeMillis(0, 0, (int) 'x', (int) (byte) 10, (int) (byte) 0, 0, (-101));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -101 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfYear();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray16 = new int[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            chronology8.validate(readablePartial14, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        int int8 = dateTimeFormatter5.getDefaultYear();
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.util.Locale locale11 = locale9.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter5.withLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale9.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getName((long) 2000);
        boolean boolean18 = dateTimeZone15.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter13.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology20 = chronology9.withZone(dateTimeZone15);
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet22 = locale21.getExtensionKeys();
        java.util.Locale locale23 = locale21.stripExtensions();
        java.lang.String str24 = locale21.getDisplayLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (-101), chronology20, locale21, (java.lang.Integer) 100, (-1));
        java.lang.Integer int28 = dateTimeParserBucket27.getOffsetInteger();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket27.saveField(dateTimeFieldType29, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587" + "'", str24, "\u4e2d\u6587");
        org.junit.Assert.assertNull(int28);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("utc-x-lvariant-it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: utc-x-lvariant-it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension(' ', "1970-1-1");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = chronology8.getDateTimeMillis((long) (-121), 100, 0, (int) '4', (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getName((long) 2000);
        boolean boolean12 = dateTimeZone9.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter7.getParser();
        int int15 = dateTimeParser14.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser14);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter16.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withPivotYear((java.lang.Integer) 40);
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuffer20, (-117119900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertNotNull(dateTimePrinter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology19.add(readablePeriod20, (long) (short) -1, 10);
        org.joda.time.DateTimeField dateTimeField24 = chronology19.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        long long28 = dateTimeZone25.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone29 = dateTimeZone25.toTimeZone();
        boolean boolean30 = dateTimeZone25.isFixed();
        boolean boolean31 = dateTimeZone25.isFixed();
        org.joda.time.Chronology chronology32 = chronology19.withZone(dateTimeZone25);
        org.joda.time.ReadablePartial readablePartial33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = chronology19.get(readablePartial33, 2000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setUnicodeLocaleKeyword("01/01/70", "english (united states) (UND,en-US)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 01/01/70 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.removeUnicodeLocaleAttribute("\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(2000);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = dateTimeFormatter5.parseLocalDateTime("java.io.IOException: UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.IOException: UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "it");
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology12, locale13, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str17 = locale13.toLanguageTag();
        java.util.Locale.Builder builder18 = builder6.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder6.setExtension('4', "+00:00:00.035");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "it" + "'", str17, "it");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ENGLISH (UNITED STATES) (UND,EN-US)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english(unitedstates)(und");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "it");
        java.util.Locale locale11 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder6.setVariant("\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        int int8 = dateTimeFormatter5.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter5.getZone();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale13, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DurationField durationField20 = chronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter5.withChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.clockhourOfDay();
        java.lang.Class<?> wildcardClass25 = dateTimeField24.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("cinese (Cina)", "+32:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: cinese (Cina) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology9.add(readablePeriod18, 1L, 0);
        org.joda.time.DateTimeField dateTimeField22 = chronology9.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial23 = null;
        int[] intArray25 = new int[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            chronology9.validate(readablePartial23, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52]");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
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
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter3.getPrinter();
        java.io.Writer writer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale8.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter5.printTo(writer6, readablePartial7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str10, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = null;
        dateTimeParserBucket7.saveField(dateTimeField8, 10);
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        dateTimeParserBucket7.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket7.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket7.saveField(dateTimeFieldType18, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter3.getParser();
        java.lang.Appendable appendable9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(appendable9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeParser8);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) 10);
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        java.lang.Object obj8 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffset((long) (short) 0);
        long long11 = dateTimeZone0.convertLocalToUTC(0L, true);
        long long14 = dateTimeZone0.convertLocalToUTC((long) 'u', false);
        java.util.Locale locale17 = new java.util.Locale("hi!");
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale17.getISO3Language();
        java.lang.String str20 = dateTimeZone0.getName(5044L, locale17);
        java.util.Set<java.lang.String> strSet21 = locale17.getUnicodeLocaleAttributes();
        java.util.Locale locale22 = locale17.stripExtensions();
        java.lang.String str23 = locale17.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 117L + "'", long14 == 117L);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        java.lang.String str12 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale20 };
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList25);
        java.util.Locale.LanguageRange languageRange28 = new java.util.Locale.LanguageRange("eng");
        double double29 = languageRange28.getWeight();
        java.lang.String str30 = languageRange28.getRange();
        java.lang.String str31 = languageRange28.getRange();
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("eng");
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("eng");
        double double36 = languageRange35.getWeight();
        java.lang.String str37 = languageRange35.getRange();
        java.util.Locale.LanguageRange languageRange39 = new java.util.Locale.LanguageRange("eng");
        double double40 = languageRange39.getWeight();
        java.util.Locale.LanguageRange languageRange42 = new java.util.Locale.LanguageRange("eng");
        double double43 = languageRange42.getWeight();
        java.lang.String str44 = languageRange42.getRange();
        java.util.Locale.LanguageRange languageRange46 = new java.util.Locale.LanguageRange("eng");
        double double47 = languageRange46.getWeight();
        double double48 = languageRange46.getWeight();
        java.lang.String str49 = languageRange46.getRange();
        java.util.Locale.LanguageRange languageRange51 = new java.util.Locale.LanguageRange("eng");
        double double52 = languageRange51.getWeight();
        java.lang.String str53 = languageRange51.getRange();
        java.lang.String str54 = languageRange51.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] { languageRange28, languageRange33, languageRange35, languageRange39, languageRange42, languageRange46, languageRange51 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale locale58 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet59 = locale58.getUnicodeLocaleKeys();
        java.lang.String str60 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strSet59);
        java.lang.String str61 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap62);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-CN" + "'", str21, "zh-CN");
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "eng" + "'", str30, "eng");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "eng" + "'", str31, "eng");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "eng" + "'", str37, "eng");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "eng" + "'", str44, "eng");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "eng" + "'", str49, "eng");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "eng" + "'", str53, "eng");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "eng" + "'", str54, "eng");
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(languageRangeList63);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        int int8 = dateTimeFormatter5.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter5.getZone();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale13, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DurationField durationField20 = chronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter5.withChronology(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime25 = dateTimeFormatter23.parseMutableDateTime("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United States\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "it");
        java.util.Locale locale11 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder6.setScript("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? (????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder10 = builder3.clear();
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology13, locale14, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str18 = locale11.getDisplayCountry(locale14);
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale11.getDisplayLanguage(locale19);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology22, locale23, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str27 = locale23.toLanguageTag();
        java.lang.String str28 = locale11.getDisplayCountry(locale23);
        java.util.Locale.Builder builder29 = builder3.setLocale(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder31 = builder29.addUnicodeLocaleAttribute("ENGLISH (UNITED STATES) (UND,EN-US)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ENGLISH (UNITED STATES) (UND,EN-US) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "giapponese" + "'", str20, "giapponese");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "it" + "'", str27, "it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Locale.FilteringMode filteringMode9 = null;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList7, filteringMode9);
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.FilteringMode filteringMode25 = null;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList23, filteringMode25);
        java.lang.String str27 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.util.Locale locale30 = new java.util.Locale("hi!");
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet34 = locale33.getExtensionKeys();
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale35.toLanguageTag();
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.lang.String str39 = locale38.getDisplayCountry();
        java.lang.String str40 = locale38.toLanguageTag();
        java.lang.String str41 = locale35.getDisplayName(locale38);
        java.lang.String str42 = locale33.getDisplayCountry(locale38);
        java.util.Locale locale44 = new java.util.Locale("hi!");
        java.util.Locale locale45 = locale44.stripExtensions();
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale50 = new java.util.Locale("hi!");
        java.lang.String str51 = locale50.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket(0L, chronology48, locale50, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology55 = dateTimeParserBucket54.getChronology();
        java.util.Locale locale57 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology55, locale57, (java.lang.Integer) 10);
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet61 = locale60.getExtensionKeys();
        java.lang.String str63 = locale60.getExtension('a');
        java.util.Locale locale65 = new java.util.Locale("hi!");
        java.lang.String str66 = locale65.getDisplayCountry();
        java.lang.String str67 = locale65.toLanguageTag();
        java.util.Locale locale68 = java.util.Locale.ITALIAN;
        java.lang.String str69 = locale68.getLanguage();
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.lang.String str73 = locale72.toLanguageTag();
        java.util.Locale locale75 = new java.util.Locale("hi!");
        java.lang.String str76 = locale75.getDisplayCountry();
        java.lang.String str77 = locale75.toLanguageTag();
        java.lang.String str78 = locale72.getDisplayName(locale75);
        java.util.Locale[] localeArray79 = new java.util.Locale[] { locale28, locale31, locale32, locale33, locale45, locale57, locale60, locale65, locale68, locale70, locale71, locale75 };
        java.util.ArrayList<java.util.Locale> localeList80 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList80, localeArray79);
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList82, filteringMode84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "zh-CN" + "'", str36, "zh-CN");
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "und" + "'", str40, "und");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Chinese (China)" + "'", str41, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "China" + "'", str42, "China");
        org.junit.Assert.assertEquals(locale44.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "hi!");
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertEquals(locale57.toString(), "eng");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertEquals(locale65.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "und" + "'", str67, "und");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "it");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "it" + "'", str69, "it");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "zh-CN" + "'", str73, "zh-CN");
        org.junit.Assert.assertEquals(locale75.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "und" + "'", str77, "und");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Chinese (China)" + "'", str78, "Chinese (China)");
        org.junit.Assert.assertNotNull(localeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode84.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology8.getDateTimeMillis((-53), (int) (short) 1, (-121), (int) (byte) 0, (int) (byte) 0, (int) (short) 10, (-53));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -53 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "zh_CN");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(2000);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        boolean boolean2 = dateTimeFormatter0.isOffsetParsed();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withLocale(locale3);
        java.util.Locale locale5 = dateTimeFormatter0.getLocale();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer6, readableInstant7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("\ub144\uc6d4\uc77c\ubaa9\uc694\uc77c");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 1970??? 1??? 1??? ???????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(2000);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter3.print(readablePartial5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeParser4);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = chronology9.months();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronology9.getDateTimeMillis((int) 'x', (int) (short) 100, (-121), (-53), (-1), (int) (short) 10, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter1.printTo(stringBuffer2, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale locale10 = new java.util.Locale("\u5e74\u6708\u65e5\u6642\u5206\u79d2 +00:00", "giapponese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setLocale(locale10);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 1970?1?1? 0?00?00? +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale10.toString(), "\u5e74\u6708\u65e5\u6642\u5206\u79d2 +00:00_GIAPPONESE");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.util.Locale locale2 = new java.util.Locale("hi!");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Locale locale4 = locale3.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.joda.time.format.DateTimeFormat.patternForStyle("Chinese (China)", locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: Chinese (China)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.year();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronology8.getDateTimeMillis(0, (int) 'x', 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.Locale locale2 = new java.util.Locale("\u5e74\u6708\u65e5\u6642\u5206\u79d2 +00:00", "giapponese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for 1970?1?1? 0?00?00? +00:00");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "\u5e74\u6708\u65e5\u6642\u5206\u79d2 +00:00_GIAPPONESE");
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Japanese", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.lang.String str24 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList20);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList20, filteringMode25);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.Locale.FilteringMode filteringMode37 = null;
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList35, filteringMode37);
        java.lang.String str39 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList35);
        java.util.Locale locale40 = java.util.Locale.ROOT;
        java.util.Locale locale42 = new java.util.Locale("hi!");
        java.util.Locale locale43 = locale42.stripExtensions();
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet46 = locale45.getExtensionKeys();
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale47.toLanguageTag();
        java.util.Locale locale50 = new java.util.Locale("hi!");
        java.lang.String str51 = locale50.getDisplayCountry();
        java.lang.String str52 = locale50.toLanguageTag();
        java.lang.String str53 = locale47.getDisplayName(locale50);
        java.lang.String str54 = locale45.getDisplayCountry(locale50);
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale57 = locale56.stripExtensions();
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale62 = new java.util.Locale("hi!");
        java.lang.String str63 = locale62.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket(0L, chronology60, locale62, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology67 = dateTimeParserBucket66.getChronology();
        java.util.Locale locale69 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology67, locale69, (java.lang.Integer) 10);
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet73 = locale72.getExtensionKeys();
        java.lang.String str75 = locale72.getExtension('a');
        java.util.Locale locale77 = new java.util.Locale("hi!");
        java.lang.String str78 = locale77.getDisplayCountry();
        java.lang.String str79 = locale77.toLanguageTag();
        java.util.Locale locale80 = java.util.Locale.ITALIAN;
        java.lang.String str81 = locale80.getLanguage();
        java.util.Locale locale82 = java.util.Locale.ITALIAN;
        java.util.Locale locale83 = java.util.Locale.getDefault();
        java.util.Locale locale84 = java.util.Locale.getDefault();
        java.lang.String str85 = locale84.toLanguageTag();
        java.util.Locale locale87 = new java.util.Locale("hi!");
        java.lang.String str88 = locale87.getDisplayCountry();
        java.lang.String str89 = locale87.toLanguageTag();
        java.lang.String str90 = locale84.getDisplayName(locale87);
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale40, locale43, locale44, locale45, locale57, locale69, locale72, locale77, locale80, locale82, locale83, locale87 };
        java.util.ArrayList<java.util.Locale> localeList92 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList92, localeArray91);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.Locale locale95 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList92);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode25.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals(locale42.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet46);
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "und" + "'", str48, "und");
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "und" + "'", str52, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertEquals(locale69.toString(), "eng");
        org.junit.Assert.assertNotNull(locale72);
// flaky:         org.junit.Assert.assertEquals(locale72.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet73);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "und" + "'", str79, "und");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "it");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "it" + "'", str81, "it");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "it");
        org.junit.Assert.assertNotNull(locale83);
// flaky:         org.junit.Assert.assertEquals(locale83.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale84);
// flaky:         org.junit.Assert.assertEquals(locale84.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "und" + "'", str85, "und");
        org.junit.Assert.assertEquals(locale87.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "und" + "'", str89, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertNotNull(localeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNull(locale95);
        org.junit.Assert.assertNotNull(localeList96);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer2, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology8.hours();
        org.joda.time.DurationField durationField14 = chronology8.months();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = chronology8.get(readablePeriod15, 32L, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.lang.String str12 = locale10.getScript();
        java.util.Locale.Builder builder13 = builder7.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder7.removeUnicodeLocaleAttribute("70/01/01");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 70/01/01 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter6.printTo(writer9, readablePartial10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withChronology(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter5.getZone();
        java.lang.Appendable appendable10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        java.lang.String str7 = dateTimeZone0.getNameKey((long) 0);
        boolean boolean9 = dateTimeZone0.isStandardOffset((long) ' ');
        java.lang.String str10 = dateTimeZone0.getID();
        java.util.Locale locale12 = new java.util.Locale("hi!");
        boolean boolean13 = dateTimeZone0.equals((java.lang.Object) locale12);
        java.util.Locale locale14 = locale12.stripExtensions();
        java.lang.Class<?> wildcardClass15 = locale12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Etc/UTC" + "'", str10, "Etc/UTC");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone15.adjustOffset((long) 0, true);
        java.lang.String str20 = dateTimeZone15.getNameKey((long) (-1));
        boolean boolean21 = dateTimeZone15.isFixed();
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology25, locale26, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str30 = locale23.getDisplayCountry(locale26);
        java.lang.String str31 = dateTimeZone15.getName((long) (short) 100, locale23);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology9, locale23, (java.lang.Integer) 10, (int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket34.saveField(dateTimeFieldType35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.year();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology15.getDateTimeMillis(32L, 2000, 0, 40, (-41));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withDefaultYear((int) (short) -1);
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale8, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.days();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = chronology13.era();
        java.lang.String str21 = chronology13.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter4.withChronology(chronology13);
        java.lang.StringBuffer stringBuffer23 = null;
        org.joda.time.ReadablePartial readablePartial24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer23, readablePartial24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ISOChronology[UTC]" + "'", str21, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale11 = new java.util.Locale("hi!");
        java.lang.String str12 = locale11.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology9, locale11, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.days();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.year();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        long long25 = dateTimeZone22.adjustOffset((long) 0, true);
        java.lang.String str27 = dateTimeZone22.getNameKey((long) (-1));
        boolean boolean28 = dateTimeZone22.isFixed();
        java.util.Locale locale30 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology32, locale33, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str37 = locale30.getDisplayCountry(locale33);
        java.lang.String str38 = dateTimeZone22.getName((long) (short) 100, locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology16, locale30, (java.lang.Integer) 10, (int) '4');
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale42.toLanguageTag();
        java.util.Locale locale45 = new java.util.Locale("hi!");
        java.lang.String str46 = locale45.getDisplayCountry();
        java.lang.String str47 = locale45.toLanguageTag();
        java.lang.String str48 = locale42.getDisplayName(locale45);
        java.lang.String str49 = locale30.getDisplayLanguage(locale42);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder50 = builder6.setLocale(locale42);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "und" + "'", str43, "und");
        org.junit.Assert.assertEquals(locale45.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "und" + "'", str47, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Japanese" + "'", str49, "Japanese");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("java.io.IOException: UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: java.io.IOException: UTC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology10.months();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale23.toLanguageTag();
        java.lang.String str26 = locale20.getDisplayName(locale23);
        java.lang.String str27 = locale18.getDisplayCountry(locale23);
        java.lang.String str28 = locale17.getDisplayScript(locale18);
        java.util.Locale.Category category29 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale30 = java.util.Locale.getDefault(category29);
        java.util.Locale locale31 = java.util.Locale.TAIWAN;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.lang.String str33 = locale17.getDisplayName(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 2000, chronology10, locale17, (java.lang.Integer) 0, (int) 'x');
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.lang.String str41 = locale40.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale40, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.days();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.year();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.weekyearOfCentury();
        dateTimeParserBucket36.saveField(dateTimeField48, 2000);
        dateTimeParserBucket36.setPivotYear((java.lang.Integer) 2000);
        // The following exception was thrown during execution in test generation
        try {
            long long54 = dateTimeParserBucket36.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for weekyearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals(locale12.toString(), "eng");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "und" + "'", str21, "und");
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "und" + "'", str25, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + category29 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category29.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getName((long) 2000);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter0.getPrinter();
        java.io.Writer writer10 = null;
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = new java.util.Locale("hi!");
        java.lang.String str16 = locale15.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale15, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology20.year();
        java.lang.String str26 = chronology20.toString();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale32 = new java.util.Locale("hi!");
        java.lang.String str33 = locale32.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(0L, chronology30, locale32, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology37 = dateTimeParserBucket36.getChronology();
        java.util.Locale locale39 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology37, locale39, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.Chronology chronology43 = chronology37.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = chronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField45 = chronology37.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        long long49 = chronology37.add(readablePeriod46, 1L, 0);
        org.joda.time.DateTimeZone dateTimeZone50 = chronology37.getZone();
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.lang.String str55 = locale54.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket(0L, chronology52, locale54, (java.lang.Integer) 10, (int) 'a');
        int int59 = dateTimeParserBucket58.getOffset();
        org.joda.time.DateTimeZone dateTimeZone60 = dateTimeParserBucket58.getZone();
        long long63 = dateTimeZone60.adjustOffset((-1L), true);
        long long66 = dateTimeZone60.adjustOffset((long) 'a', true);
        boolean boolean68 = dateTimeZone60.isStandardOffset((long) 100);
        boolean boolean69 = dateTimeZone60.isFixed();
        java.util.Locale locale71 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology73 = null;
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology73, locale74, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str78 = locale71.getDisplayCountry(locale74);
        java.lang.String str79 = dateTimeZone60.getShortName((long) (short) -1, locale71);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter9.printTo(writer10, (long) (-53), chronology20, (int) (short) 100, dateTimeZone50, locale71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ISOChronology[UTC]" + "'", str26, "ISOChronology[UTC]");
        org.junit.Assert.assertEquals(locale32.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertEquals(locale39.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 97L + "'", long66 == 97L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "ja");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "it");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "+00:00" + "'", str79, "+00:00");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter8.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = dateTimeFormatter20.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withChronology(chronology27);
        int int29 = dateTimeFormatter26.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter26.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeParser dateTimeParser32 = dateTimeFormatter26.getParser();
        int int33 = dateTimeParser32.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser32);
        java.lang.StringBuffer stringBuffer35 = null;
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale37 = java.util.Locale.CHINA;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter22.printTo(stringBuffer35, readablePartial36, locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimePrinter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2000 + "'", int29 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeParser32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40 + "'", int33 == 40);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffset((long) (short) 0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        boolean boolean20 = dateTimeZone0.equals((java.lang.Object) chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.monthOfYear();
        java.lang.Class<?> wildcardClass22 = dateTimeField21.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology2, locale3, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str7 = locale0.getDisplayCountry(locale3);
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale0.getDisplayLanguage(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale8.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale8.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "giapponese" + "'", str9, "giapponese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "it" + "'", str10, "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.adjustOffset((long) 0, true);
        java.lang.String str11 = dateTimeZone6.getNameKey((long) (-1));
        boolean boolean12 = dateTimeZone6.isFixed();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str21 = locale14.getDisplayCountry(locale17);
        java.lang.String str22 = dateTimeZone6.getName((long) (short) 100, locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTimeFormatter24.parseDateTime("22/02/11");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("it");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.Locale.FilteringMode filteringMode12 = null;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList10, filteringMode12);
        java.lang.String str14 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList10);
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.util.Locale locale17 = new java.util.Locale("hi!");
        java.util.Locale locale18 = locale17.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale25 = new java.util.Locale("hi!");
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = locale25.toLanguageTag();
        java.lang.String str28 = locale22.getDisplayName(locale25);
        java.lang.String str29 = locale20.getDisplayCountry(locale25);
        java.util.Locale locale31 = new java.util.Locale("hi!");
        java.util.Locale locale32 = locale31.stripExtensions();
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale37 = new java.util.Locale("hi!");
        java.lang.String str38 = locale37.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(0L, chronology35, locale37, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        java.util.Locale locale44 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology42, locale44, (java.lang.Integer) 10);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet48 = locale47.getExtensionKeys();
        java.lang.String str50 = locale47.getExtension('a');
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.lang.String str53 = locale52.getDisplayCountry();
        java.lang.String str54 = locale52.toLanguageTag();
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        java.lang.String str56 = locale55.getLanguage();
        java.util.Locale locale57 = java.util.Locale.ITALIAN;
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.util.Locale locale59 = java.util.Locale.getDefault();
        java.lang.String str60 = locale59.toLanguageTag();
        java.util.Locale locale62 = new java.util.Locale("hi!");
        java.lang.String str63 = locale62.getDisplayCountry();
        java.lang.String str64 = locale62.toLanguageTag();
        java.lang.String str65 = locale59.getDisplayName(locale62);
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale15, locale18, locale19, locale20, locale32, locale44, locale47, locale52, locale55, locale57, locale58, locale62 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        java.util.Locale.FilteringMode filteringMode80 = null;
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList78, filteringMode80);
        java.lang.String str82 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.lang.String>) strList78);
        java.util.Locale.FilteringMode filteringMode83 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList78, filteringMode83);
        java.util.Locale.LanguageRange[] languageRangeArray85 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList86 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList86, languageRangeArray85);
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        java.util.Locale.FilteringMode filteringMode93 = null;
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList86, (java.util.Collection<java.lang.String>) strList91, filteringMode93);
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList91);
        java.lang.String str96 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList95);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap97 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList98 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap97);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "und" + "'", str23, "und");
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "und" + "'", str27, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale31.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!");
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertEquals(locale44.toString(), "eng");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "und" + "'", str54, "und");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "it" + "'", str56, "it");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale59);
// flaky:         org.junit.Assert.assertEquals(locale59.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "und" + "'", str60, "und");
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "und" + "'", str64, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + filteringMode83 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode83.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(languageRangeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNull(str96);
        org.junit.Assert.assertNotNull(languageRangeList98);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getDisplayVariant();
        java.util.Locale locale3 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en-US");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology8.set(readablePartial14, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket(0L, chronology4, locale6, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        java.util.Locale locale13 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology11, locale13, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = chronology11.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale20);
        java.lang.String str22 = dateTimeZone18.getShortName((long) 'u', locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter1.withLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTimeFormatter23.parseDateTime("cinese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"cinese\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertEquals(locale13.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        boolean boolean5 = languageRange1.equals((java.lang.Object) 40);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("cinese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("70-1-1", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=70-1-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withChronology(chronology7);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer9, (-62111231999999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfMinute();
        java.util.Locale locale17 = new java.util.Locale("United States", "hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(10L, chronology9, locale17, (java.lang.Integer) 0);
        java.lang.String str21 = locale17.getExtension('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = locale17.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for HI!");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals(locale17.toString(), "united states_HI!");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"????\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = null;
        dateTimeParserBucket7.saveField(dateTimeField8, 10);
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        dateTimeParserBucket7.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket7.setOffset((java.lang.Integer) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket7.saveField(dateTimeFieldType16, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("1/1/70");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 1/1/70 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 1);
        java.lang.Integer int4 = dateTimeFormatter0.getPivotYear();
        org.joda.time.Chronology chronology5 = dateTimeFormatter0.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = dateTimeFormatter0.parseLocalTime("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(chronology5);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withOffsetParsed();
        boolean boolean3 = locale0.equals((java.lang.Object) dateTimeFormatter1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = chronology8.get(readablePartial14, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setExtension('4', "01/01/70");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone15.adjustOffset((long) 0, true);
        java.lang.String str20 = dateTimeZone15.getNameKey((long) (-1));
        boolean boolean21 = dateTimeZone15.isFixed();
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology25, locale26, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str30 = locale23.getDisplayCountry(locale26);
        java.lang.String str31 = dateTimeZone15.getName((long) (short) 100, locale23);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology9, locale23, (java.lang.Integer) 10, (int) '4');
        java.lang.String str35 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField36 = chronology9.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long42 = chronology9.getDateTimeMillis(10L, (int) (byte) 1, (int) (short) -1, (int) 'a', (-53));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ISOChronology[UTC]" + "'", str35, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        int int6 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter3.getParser();
        int int10 = dateTimeParser9.estimateParsedLength();
        int int11 = dateTimeParser9.estimateParsedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeFormatter7.parseMillis("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"English\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimePrinter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology8.get(readablePeriod15, (long) (-121));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getName((long) 2000);
        boolean boolean12 = dateTimeZone9.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter7.getParser();
        int int15 = dateTimeParser14.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser14);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale20 = new java.util.Locale("hi!");
        java.lang.String str21 = locale20.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale20, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.monthOfYear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.secondOfDay();
        org.joda.time.Chronology chronology29 = chronology25.withUTC();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        long long33 = dateTimeZone30.adjustOffset((long) 0, true);
        java.lang.String str35 = dateTimeZone30.getNameKey((long) (-1));
        boolean boolean36 = dateTimeZone30.isFixed();
        int int38 = dateTimeZone30.getOffset((long) (short) 0);
        long long41 = dateTimeZone30.convertLocalToUTC(0L, true);
        long long44 = dateTimeZone30.convertLocalToUTC((long) 'u', false);
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = dateTimeZone30.getOffset(readableInstant45);
        org.joda.time.Chronology chronology47 = chronology25.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter16.withChronology(chronology47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime50 = dateTimeFormatter48.parseLocalDateTime("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"und\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 117L + "'", long44 == 117L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setRegion("giapponese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: giapponese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.minuteOfHour();
        org.joda.time.DurationField durationField11 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfHour();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter9.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTimeFormatter12.parseDateTime("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeParser11);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField16 = chronology9.minutes();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronology9.getDateTimeMillis((int) (byte) 1, 2000, 0, (int) (short) -1, (int) '#', (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter5.getPrinter();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale12 = new java.util.Locale("cinese (Cina)", "DE");
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter7.printTo(stringBuffer8, readablePartial9, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertEquals(locale12.toString(), "cinese (cina)_DE");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale13, (java.lang.Integer) 10, (int) 'a');
        java.lang.String str18 = locale13.getLanguage();
        java.lang.String str19 = locale13.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder7.setLocale(locale13);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.lang.String str12 = locale10.getScript();
        java.util.Locale.Builder builder13 = builder7.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.addUnicodeLocaleAttribute("en-us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = chronology8.get(readablePeriod17, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '?? (????)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.util.Locale locale3 = new java.util.Locale("UTC", "1/1/70", "it");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.Class<?> wildcardClass5 = locale3.getClass();
        org.junit.Assert.assertEquals(locale3.toString(), "utc_1/1/70_it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "utc-x-lvariant-it" + "'", str4, "utc-x-lvariant-it");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology2, locale3, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str7 = locale0.getDisplayCountry(locale3);
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale0.getDisplayLanguage(locale8);
        java.lang.String str10 = locale8.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "giapponese" + "'", str9, "giapponese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        boolean boolean8 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withChronology(chronology9);
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.adjustOffset((long) 0, true);
        java.lang.String str11 = dateTimeZone6.getNameKey((long) (-1));
        boolean boolean12 = dateTimeZone6.isFixed();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str21 = locale14.getDisplayCountry(locale17);
        java.lang.String str22 = dateTimeZone6.getName((long) (short) 100, locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withDefaultYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale29 = locale27.stripExtensions();
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.lang.String str31 = locale29.getDisplayScript(locale30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter2.withLocale(locale29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withPivotYear((java.lang.Integer) 0);
        java.io.Writer writer35 = null;
        org.joda.time.ReadablePartial readablePartial36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter32.printTo(writer35, readablePartial36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '?? (??)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = null;
        dateTimeParserBucket7.saveField(dateTimeField8, 10);
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket7.getChronology();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology12.get(readablePeriod13, (long) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronology19.getDateTimeMillis(2000, (-41), (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter4.print((-82200000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }
}
