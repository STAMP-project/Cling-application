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
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "fr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "fr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "fr");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: " + "'", str3, "java.io.IOException: ");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeParserBucket4.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dateTimeParserBucket4.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateTimeFormatter2.print(readablePartial3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("", throwable4);
        // The following exception was thrown during execution in test generation
        try {
            iOException2.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
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
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateTimeFormatter2.print(readablePartial4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
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
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.ReadWritableInstant readWritableInstant4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dateTimeFormatter2.parseInto(readWritableInstant4, "fran\347ais", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeParser[] dateTimeParserArray5 = new org.joda.time.format.DateTimeParser[] { dateTimeParser4 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.append(dateTimePrinter3, dateTimeParserArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No parser supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeParserArray5);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.io.IOException iOException3 = new java.io.IOException(throwable1);
        java.lang.Throwable throwable5 = null;
        java.io.IOException iOException6 = new java.io.IOException("", throwable5);
        java.io.IOException iOException7 = new java.io.IOException(throwable5);
        // The following exception was thrown during execution in test generation
        try {
            iOException3.addSuppressed(throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("java.io.IOException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception:");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.append(dateTimePrinter2, dateTimeParser3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No printer supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean2 = locale0.equals((java.lang.Object) dateTimeFieldType1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("minuteOfHour", "zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: minuteOfHour [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.util.Locale locale1 = new java.util.Locale("fr");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale1.getDisplayLanguage(locale2);
        java.lang.String str5 = locale2.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais" + "'", str4, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeParser[] dateTimeParserArray7 = new org.joda.time.format.DateTimeParser[] { dateTimeParser6 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.append(dateTimePrinter5, dateTimeParserArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No parser supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeParserArray7);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder4 = builder2.setLanguage("UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setVariant("+00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser[] dateTimeParserArray6 = new org.joda.time.format.DateTimeParser[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.append(dateTimePrinter5, dateTimeParserArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeParserArray6);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 120");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendSecondOfDay((int) '4');
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.append(dateTimePrinter6, dateTimeParser7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No printer supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer6, readablePartial7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder3.appendTimeZoneOffset("it", "zho", false, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = dateTimeFormatter2.parseLocalDate("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = chronology5.get(readablePeriod8, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.addUnicodeLocaleAttribute("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: minuteOfDay [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = chronology5.get(readablePeriod6, (long) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = dateTimeFormatter2.parseLocalTime("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = dateTimeFormatter2.parseMutableDateTime("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = chronology5.get(readablePeriod7, (long) (short) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = dateTimeFormatter2.parseMutableDateTime("secondOfMinute");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr");
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        boolean boolean3 = languageRange1.equals((java.lang.Object) locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("", throwable4);
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.String str7 = iOException5.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: " + "'", str7, "java.io.IOException: ");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = chronology5.get(readablePeriod8, (long) (byte) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = dateTimeFormatter2.parseLocalDateTime("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = chronology5.get(readablePeriod8, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter7.print((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setExtension('a', "ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ISOChronology[UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
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
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        boolean boolean6 = dateTimeFieldType4.isSupported(chronology5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser[] dateTimeParserArray9 = new org.joda.time.format.DateTimeParser[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder2.append(dateTimePrinter8, dateTimeParserArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeParserArray9);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("+01:00", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+01:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfMonth(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendDayOfWeek(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfHour((-1), (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder4 = builder2.setLanguage("UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendTwoDigitYear((int) (short) -1, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder3.appendFractionOfHour((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.append(dateTimePrinter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No printer supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        java.lang.Appendable appendable10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendSecondOfMinute((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = dateTimeFormatter8.parseLocalDate("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = dateTimeZone1.getName(100L, locale5);
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology9, locale11);
        java.lang.String str13 = dateTimeZone1.getName((long) '#', locale11);
        java.lang.String str15 = dateTimeZone1.getShortName((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendLiteral('4');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str8 = dateTimeFieldType7.getName();
        java.lang.String str9 = dateTimeFieldType7.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder4.appendSignedDecimal(dateTimeFieldType7, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "minuteOfHour" + "'", str8, "minuteOfHour");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "minuteOfHour" + "'", str9, "minuteOfHour");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean2 = locale0.equals((java.lang.Object) "secondOfMinute");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=isochronology[utc]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = dateTimeZone1.getName(100L, locale5);
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology9, locale11);
        java.lang.String str13 = dateTimeZone1.getName((long) '#', locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale11.getUnicodeLocaleType("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: franc?ais");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology5.getDateTimeMillis(0, (int) 'a', (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology9.set(readablePartial14, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket4.getZone();
        java.lang.Object obj9 = dateTimeParserBucket4.saveState();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeParserBucket4.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Collection<java.util.Locale> localeCollection3 = null;
        java.util.List<java.util.Locale> localeList4 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection3);
        java.util.Collection<java.util.Locale> localeCollection5 = null;
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection5);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeList4);
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 120");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfMonth(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendDayOfWeek(1);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder4.append(dateTimePrinter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No printer supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        boolean boolean2 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray15 = new int[] { (short) 10, (byte) 1, (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            chronology5.validate(readablePartial10, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 1, 100, 1]");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter2.parseMutableDateTime("+01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTimeFormatter5.print(readablePartial6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.util.Locale locale1 = new java.util.Locale("fr");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale1.getDisplayLanguage(locale2);
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.lang.Object obj7 = null;
        boolean boolean8 = locale5.equals(obj7);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais" + "'", str4, "fran\347ais");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.ReadablePartial readablePartial13 = null;
        int[] intArray20 = new int[] { 10, 'x', (byte) 100, '4', 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            chronology5.validate(readablePartial13, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 120, 100, 52, 10, 10]");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfDay((int) (byte) 10, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder11.appendFractionOfSecond((int) 'u', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder11.appendHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "it");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfDay((int) (byte) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendYearOfEra((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("", throwable4);
        // The following exception was thrown during execution in test generation
        try {
            iOException2.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = dateTimeZone1.getName(100L, locale5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendCenturyOfEra((int) 'a', (int) (short) 100);
        boolean boolean16 = locale5.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter9.printTo(stringBuffer10, readablePartial11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronolgy();
        java.io.Writer writer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(chronology11);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.toLanguageTag();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new org.joda.time.format.DateTimeFormatterBuilder();
        boolean boolean3 = locale0.equals((java.lang.Object) dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italian", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology5.add(readablePeriod7, (long) (byte) 0, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField11 = chronology5.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology5.getDateTimeMillis(10, 0, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setRegion("zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        java.lang.Appendable appendable10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str15 = dateTimeZone13.getNameKey(1L);
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.lang.String str18 = dateTimeZone13.getName(100L, locale17);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        java.lang.String str25 = dateTimeZone13.getName((long) '#', locale23);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter9.printTo(writer10, readablePartial11, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Collection<java.util.Locale> localeCollection6 = null;
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, localeCollection6);
        java.util.List<java.util.Locale> localeList8 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList7);
        java.lang.Class<?> wildcardClass9 = localeList7.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertNotNull(localeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        java.io.Writer writer10 = null;
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.years();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.year();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.util.Locale locale29 = new java.util.Locale("fr");
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter9.printTo(writer10, (long) (short) 1, chronology17, (int) (short) 0, dateTimeZone27, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder4 = builder2.setLanguage("UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setScript("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology5.getDateTimeMillis((int) '#', 10, (int) (byte) 0, (int) (short) 0, (int) (byte) -1, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatterBuilder7.toParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendPattern("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeParser8);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.lang.String str15 = locale13.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter9.printTo(writer10, readablePartial11, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, readableInstant5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr");
        double double2 = languageRange1.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Collection<java.util.Locale> localeCollection6 = null;
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, localeCollection6);
        boolean boolean8 = languageRange1.equals((java.lang.Object) languageRangeList4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("", throwable4);
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException("Italian");
        iOException5.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.String str10 = iOException8.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: Italian" + "'", str10, "java.io.IOException: Italian");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendMillisOfSecond((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeFormatter2.parseMillis("it");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: minuteOfHour [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendYearOfEra((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        dateTimeFormatterBuilder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder3.appendFractionOfHour((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter2.print(readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguage("secondOfMinute");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: secondOfMinute [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'u');
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        java.lang.Class<?> wildcardClass10 = chronology5.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder0.setVariant("");
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.setExtension('#', "Englisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.io.IOException iOException3 = new java.io.IOException(throwable1);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.String str5 = iOException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException" + "'", str5, "java.io.IOException");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("UTC", (double) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=97.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology5.getDateTimeMillis((long) 1, (int) 'a', 0, 100, 2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.year();
        org.joda.time.DurationField durationField10 = chronology5.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("+01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+01:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setRegion("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.Chronology chronology13 = dateTimeFormatter8.getChronolgy();
        boolean boolean14 = dateTimeFormatter8.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeFormatter8.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("", throwable4);
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException5.addSuppressed(throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("java.io.IOException: Italian");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception:italian");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.days();
        java.lang.String str9 = chronology5.toString();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = chronology5.get(readablePartial10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[UTC]" + "'", str9, "ISOChronology[UTC]");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u6cd5\u6587", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        boolean boolean6 = dateTimeFormatter5.isPrinter();
        org.joda.time.ReadWritableInstant readWritableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dateTimeFormatter5.parseInto(readWritableInstant7, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        java.io.Writer writer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = dateTimeFormatter2.parseLocalDate("java.io.IOException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        java.io.Writer writer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
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
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        java.io.Writer writer8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.years();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.year();
        org.joda.time.DurationField durationField25 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone28.convertUTCToLocal((long) 'x');
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale31.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter9.printTo(stringBuffer10, 25L, chronology17, (int) '#', dateTimeZone28, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 120L + "'", long30 == 120L);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "inglese" + "'", str32, "inglese");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter8.print(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        java.lang.Integer int10 = dateTimeFormatter2.getPivotYear();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer11, (long) 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("java.io.IOException: Italian", (double) 25L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=25.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendFractionOfMinute((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendCenturyOfEra((int) 'a', (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.append(dateTimeFormatter12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendDayOfWeek((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension('4', "+01:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.getDisplayScript();
        java.lang.String str9 = locale6.getCountry();
        java.lang.String str10 = locale3.getDisplayCountry(locale6);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        boolean boolean15 = locale3.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology14, locale16);
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfEra();
        org.joda.time.DurationField durationField21 = chronology18.days();
        java.lang.String str22 = chronology18.toString();
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleKeys();
        java.lang.String str26 = locale24.getDisplayScript();
        java.lang.String str27 = locale24.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology18, locale24, (java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter9.printTo(writer10, readablePartial11, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ISOChronology[UTC]" + "'", str22, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology5.set(readablePartial11, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField13 = chronology9.hours();
        org.joda.time.DurationField durationField14 = chronology9.years();
        org.joda.time.DurationField durationField15 = chronology9.hours();
        java.lang.Class<?> wildcardClass16 = chronology9.getClass();
        boolean boolean17 = languageRange1.equals((java.lang.Object) wildcardClass16);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter2.print(readablePartial5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfHour((int) 'u', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder3.appendFractionOfHour((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Italian");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Italian' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology5.getDateTimeMillis(1L, 0, (-1), (int) (short) 0, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendTimeZoneOffset("+01:00", false, 2000, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = dateTimeFormatter8.parseLocalTime("Italian");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("secondOfMinute", "DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: secondOfMinute [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter8.print(readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = dateTimeFormatter9.parseLocalDate("Italian");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendSecondOfDay((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder3.appendLiteral('x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendLiteral("");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.appendTimeZoneOffset("java.io.IOException: ", true, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatterBuilder14.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder4.appendOptional(dateTimeParser15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder4.appendYearOfEra(25, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder19.appendTimeZoneOffset("UTC", true, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeParser15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'minuteOfHour' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: minuteOfHour [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology5.seconds();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology5.set(readablePartial11, 120L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French", (double) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        boolean boolean6 = dateTimeFormatter5.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter5.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((int) 'u');
        boolean boolean15 = languageRange2.equals((java.lang.Object) dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "deu" + "'", str2, "deu");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType4, (int) (short) 100, 0);
        boolean boolean8 = dateTimeFormatterBuilder2.canBuildParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology10 = null;
        boolean boolean11 = dateTimeFieldType9.isSupported(chronology10);
        java.lang.String str12 = dateTimeFieldType9.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder2.appendText(dateTimeFieldType9);
        boolean boolean14 = languageRange1.equals((java.lang.Object) dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "minuteOfDay" + "'", str12, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("", throwable4);
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException("Italian");
        iOException5.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.String str10 = iOException5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: " + "'", str10, "java.io.IOException: ");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = chronology5.get(readablePeriod10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = dateTimeFormatter2.parseLocalDateTime("Chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
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
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendFixedDecimal(dateTimeFieldType17, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = dateTimeFormatterBuilder21.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder25.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendFixedDecimal(dateTimeFieldType27, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap31 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendTimeZoneName(strMap31);
        org.joda.time.format.DateTimeParser dateTimeParser33 = dateTimeFormatterBuilder32.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder7.append(dateTimePrinter22, dateTimeParser33);
        int int35 = dateTimePrinter22.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer36 = null;
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology39, locale41);
        org.joda.time.Chronology chronology43 = dateTimeParserBucket42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.dayOfYear();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.yearOfEra();
        org.joda.time.DurationField durationField46 = chronology43.hours();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.secondOfMinute();
        org.joda.time.Chronology chronology48 = chronology43.withUTC();
        org.joda.time.DurationField durationField49 = chronology48.weeks();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.minuteOfHour();
        org.joda.time.format.DateTimePrinter dateTimePrinter52 = null;
        org.joda.time.format.DateTimeParser dateTimeParser53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter52, dateTimeParser53);
        boolean boolean55 = dateTimeFormatter54.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser56 = dateTimeFormatter54.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter54.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone58 = dateTimeFormatter57.getZone();
        java.util.Locale locale59 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet60 = locale59.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter22.printTo(stringBuffer36, 852076800000L, chronology48, (int) (byte) 1, dateTimeZone58, locale59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimePrinter22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeParser33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 88 + "'", int35 == 88);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(dateTimeParser56);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet60);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str9 = dateTimeZone7.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone7.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter5.withZone(dateTimeZone7);
        org.joda.time.ReadWritableInstant readWritableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dateTimeFormatter5.parseInto(readWritableInstant14, "Deutschland", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTimeFormatter10.parseDateTime("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale19 = dateTimeParserBucket16.getLocale();
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter9.printTo(writer10, readablePartial11, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) ' ', 0);
        java.lang.Class<?> wildcardClass7 = dateTimeFormatterBuilder2.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.Chronology chronology13 = dateTimeFormatter8.getChronolgy();
        boolean boolean14 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter8.getParser();
        java.lang.StringBuffer stringBuffer16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer16, readableInstant17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateTimeParser15);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateTimeFormatter2.print(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder7.appendFractionOfDay((int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder7.appendSecondOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatterBuilder7.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendHourOfHalfday(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendHourOfHalfday((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        boolean boolean7 = dateTimeFormatter6.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder3.append(dateTimeFormatter11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder3.appendMillisOfSecond((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendYear(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        boolean boolean10 = dateTimeFormatter7.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = dateTimeFormatter7.parseLocalDateTime("hourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology5.getDateTimeMillis((int) ' ', 0, (int) (byte) 10, 0, 3, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder4 = builder2.setLanguage("UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("+00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfDay();
        java.util.Locale locale10 = new java.util.Locale("fr");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology6, locale10);
        org.joda.time.DateTimeField dateTimeField12 = chronology6.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology6.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology6.getDateTimeMillis(2000, (int) (short) -1, (-1), (int) (byte) 1, 0, 1, 25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale2.getISO3Language();
        java.lang.String str5 = locale2.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendEraText();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology8 = null;
        boolean boolean9 = dateTimeFieldType7.isSupported(chronology8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendFixedSignedDecimal(dateTimeFieldType7, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder5.appendYearOfCentury(3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "hi!");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendFixedDecimal(dateTimeFieldType17, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = dateTimeFormatterBuilder21.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder25.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendFixedDecimal(dateTimeFieldType27, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap31 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendTimeZoneName(strMap31);
        org.joda.time.format.DateTimeParser dateTimeParser33 = dateTimeFormatterBuilder32.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder7.append(dateTimePrinter22, dateTimeParser33);
        int int35 = dateTimePrinter22.estimatePrintedLength();
        java.io.Writer writer36 = null;
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology39, locale41);
        org.joda.time.Chronology chronology43 = dateTimeParserBucket42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.dayOfYear();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.hourOfHalfday();
        org.joda.time.DurationField durationField46 = chronology43.hours();
        org.joda.time.DurationField durationField47 = chronology43.seconds();
        org.joda.time.DateTimeField dateTimeField48 = chronology43.era();
        org.joda.time.DateTimeField dateTimeField49 = chronology43.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology55, locale57);
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet61 = locale60.getUnicodeLocaleKeys();
        java.lang.String str62 = locale60.getDisplayScript();
        java.lang.String str63 = locale60.getCountry();
        java.lang.String str64 = locale57.getDisplayCountry(locale60);
        java.util.Set<java.lang.String> strSet65 = locale57.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale57);
        java.lang.String str67 = dateTimeZone52.getShortName((long) '#', locale57);
        java.util.Locale locale68 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str69 = locale68.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter22.printTo(writer36, 1L, chronology43, (int) (short) 0, dateTimeZone52, locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimePrinter22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeParser33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 88 + "'", int35 == 88);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00:00.097" + "'", str67, "+00:00:00.097");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.lang.String str4 = locale3.toLanguageTag();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.setVariant("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setRegion("weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: weekOfWeekyear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = dateTimeFormatter2.parseMutableDateTime("minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("fr");
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayLanguage(locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale3.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology1, locale3, (java.lang.Integer) 0);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        dateTimeParserBucket10.setZone(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket10.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology20, locale22);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket23.getChronology();
        java.util.Locale locale25 = dateTimeParserBucket23.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology18, locale25, (java.lang.Integer) 0, (int) (short) 100);
        dateTimeParserBucket10.saveField(dateTimeFieldType15, "hi!", locale25);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = dateTimeParserBucket10.computeMillis();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais" + "'", str6, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale6 = dateTimeParserBucket4.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        boolean boolean10 = dateTimeFormatter9.isOffsetParsed();
        boolean boolean11 = locale6.equals((java.lang.Object) dateTimeFormatter9);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.days();
        java.lang.String str10 = chronology6.toString();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getDisplayScript();
        java.lang.String str15 = locale12.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology6, locale12, (java.lang.Integer) 10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = chronology6.get(readablePeriod18, 1L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[UTC]" + "'", str10, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendCenturyOfEra((int) 'a', (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendDecimal(dateTimeFieldType12, (int) (short) 1, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder11.appendTwoDigitYear(0);
        boolean boolean18 = locale2.equals((java.lang.Object) dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'u');
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.years();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.year();
        org.joda.time.DurationField durationField25 = chronology17.halfdays();
        long long29 = chronology17.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField30 = chronology17.clockhourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter9.withChronology(chronology17);
        org.joda.time.ReadablePartial readablePartial32 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long34 = chronology17.set(readablePartial32, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 520L + "'", long29 == 520L);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setRegion("fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket13.saveField(dateTimeFieldType14, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatterBuilder18.toPrinter();
        int int20 = dateTimePrinter19.estimatePrintedLength();
        java.io.Writer writer21 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology28, locale30);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter26.withChronology(chronology32);
        boolean boolean34 = dateTimeFormatter33.isPrinter();
        org.joda.time.Chronology chronology35 = dateTimeFormatter33.getChronolgy();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.dayOfMonth();
        java.util.Locale locale37 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(0L, chronology35, locale37, (java.lang.Integer) 1, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forID("+00:00");
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.util.Locale locale46 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str47 = locale44.getDisplayLanguage(locale46);
        java.lang.String str48 = locale46.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter19.printTo(writer21, (long) (byte) 0, chronology35, 1, dateTimeZone43, locale46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36 + "'", int20 == 36);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de_DE");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Italian" + "'", str47, "Italian");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.util.Locale locale1 = new java.util.Locale("fr");
        java.util.Locale locale3 = new java.util.Locale("fr");
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayLanguage(locale4);
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.lang.String str10 = locale1.getDisplayVariant(locale7);
        java.lang.String str11 = locale7.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais" + "'", str6, "fran\347ais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u6587" + "'", str8, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese" + "'", str9, "Chinese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh_CN" + "'", str11, "zh_CN");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendEraText();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology8 = null;
        boolean boolean9 = dateTimeFieldType7.isSupported(chronology8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendFixedSignedDecimal(dateTimeFieldType7, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder21.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser27 = dateTimeFormatterBuilder26.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder16.appendOptional(dateTimeParser27);
        int int29 = dateTimeParser27.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder11.appendOptional(dateTimeParser27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder30.appendFractionOfHour((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeParser27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 25 + "'", int29 == 25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("deu");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'deu' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendTwoDigitYear((int) (short) -1, true);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatterBuilder3.toPrinter();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology11, locale13);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        org.joda.time.Chronology chronology16 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 0);
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter7.printTo(stringBuffer8, 0L, chronology16, 100, dateTimeZone20, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear(25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendMonthOfYearText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendDayOfMonth((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear((int) 'x');
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter2.print(readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Collection<java.util.Locale> localeCollection4 = null;
        java.util.List<java.util.Locale> localeList5 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Collection<java.util.Locale> localeCollection12 = null;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, localeCollection12);
        java.util.List<java.util.Locale> localeList14 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList13);
        java.util.Locale locale15 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Collection<java.util.Locale> localeCollection22 = null;
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, localeCollection22);
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.Set<java.lang.String> strSet25 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.String str26 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet25);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Collection<java.util.Locale> localeCollection33 = null;
        java.util.List<java.util.Locale> localeList34 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, localeCollection33);
        java.util.List<java.util.Locale> localeList35 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList34);
        java.util.Set<java.lang.String> strSet36 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strSet36);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList37, filteringMode38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList14, filteringMode38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeList14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localeList34);
        org.junit.Assert.assertNotNull(localeList35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendDecimal(dateTimeFieldType16, (int) (short) 100, 0);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology25.hours();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType16.getField(chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter8.withChronology(chronology25);
        java.io.Writer writer31 = null;
        org.joda.time.ReadablePartial readablePartial32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer31, readablePartial32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("era");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'era' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder0.setVariant("");
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setRegion("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: java.io.IOException [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale7 = dateTimeParserBucket4.getLocale();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = locale7.getISO3Country();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str13 = dateTimeZone11.getNameKey(1L);
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = dateTimeZone11.getName(100L, locale15);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology19, locale21);
        java.lang.String str23 = dateTimeZone11.getName((long) '#', locale21);
        boolean boolean24 = locale7.equals((java.lang.Object) str23);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = dateTimeFormatter2.parseLocalDate("und");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder2.appendMillisOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.Chronology chronology13 = dateTimeFormatter8.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withDefaultYear((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime17 = dateTimeFormatter8.parseMutableDateTime("DE");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        boolean boolean5 = locale0.equals((java.lang.Object) dateTimeZone4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendDecimal(dateTimeFieldType16, (int) (short) 100, 0);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology25.hours();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType16.getField(chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter8.withChronology(chronology25);
        java.lang.Appendable appendable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter30.printTo(appendable31, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.days();
        java.lang.String str10 = chronology6.toString();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getDisplayScript();
        java.lang.String str15 = locale12.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology6, locale12, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField18 = chronology6.days();
        org.joda.time.DateTimeField dateTimeField19 = chronology6.era();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = chronology6.get(readablePeriod20, (long) '#', (long) 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[UTC]" + "'", str10, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendSecondOfDay((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfYear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendTimeZoneOffset("Chinesisch", "French", false, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = dateTimeFormatter2.parseLocalTime("hourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder7.appendFractionOfDay((int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendPattern("hourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguageTag("minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: minuteOfHour [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket13.saveField(dateTimeFieldType14, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendMonthOfYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendTwoDigitWeekyear(25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder20.appendDayOfMonth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = dateTimeZone1.getName(100L, locale5);
        long long8 = dateTimeZone1.previousTransition((-3599999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599999L) + "'", long8 == (-3599999L));
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology12, locale14);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter10.withChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType7.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology16.add(readablePeriod21, (long) 1, (int) (short) 10);
        java.lang.String str25 = chronology16.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter5.withChronology(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = dateTimeFormatter26.parseMillis("Englisch");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[UTC]" + "'", str25, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter9.print(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        java.util.Locale locale11 = dateTimeFormatter9.getLocale();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(locale11);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: weekOfWeekyear");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology11.getDateTimeMillis((int) (short) 10, (int) (byte) 10, 3600000, 0, (int) (short) 10, 3600000, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer8, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer9, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getName(97L);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        java.lang.String str14 = dateTimeZone5.getName((long) (byte) 10, locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withLocale(locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = dateTimeFormatter15.parseLocalDate("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Deutschland", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=deutschland");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendSecondOfDay((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendTimeZoneShortName(strMap11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder8.appendLiteral('u');
        java.lang.Class<?> wildcardClass15 = dateTimeFormatterBuilder8.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("en-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("cinese", (double) 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.872E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'u');
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter9.print(readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendTimeZoneId();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendHourOfHalfday((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguageTag("Franz\366sisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Franzo?sisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder3.appendMillisOfSecond(25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder3.appendMonthOfYearText();
        boolean boolean11 = dateTimeFormatterBuilder10.canBuildPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket13.saveField(dateTimeFieldType14, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendMonthOfYear((int) (byte) 0);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology22, locale24);
        org.joda.time.DateTimeField dateTimeField26 = null;
        dateTimeParserBucket25.saveField(dateTimeField26, (int) (byte) 0);
        java.util.Locale locale29 = dateTimeParserBucket25.getLocale();
        java.lang.Object obj30 = dateTimeParserBucket25.saveState();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder33.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder34.appendFixedDecimal(dateTimeFieldType35, (int) '4');
        dateTimeParserBucket25.saveField(dateTimeFieldType35, (int) (short) 1);
        java.lang.String str40 = dateTimeFieldType35.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder18.appendSignedDecimal(dateTimeFieldType35, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "halfdayOfDay" + "'", str40, "halfdayOfDay");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable6, (long) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("it");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder4.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendFixedDecimal(dateTimeFieldType6, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder5.appendSecondOfDay((int) (byte) 1);
        boolean boolean11 = languageRange1.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter11.print(readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = chronology5.get(readablePeriod8, (long) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendTwoDigitYear((int) (short) -1, true);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatterBuilder3.toPrinter();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology11, locale13);
        dateTimeParserBucket14.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale17 = dateTimeParserBucket14.getLocale();
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.lang.String str19 = locale17.getISO3Country();
        java.util.Set<java.lang.Character> charSet20 = locale17.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter7.printTo(stringBuffer8, readablePartial9, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charSet20);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder4 = builder2.setLanguage("UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setRegion("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: minuteOfDay [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setVariant("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Collection<java.util.Locale> localeCollection3 = null;
        java.util.List<java.util.Locale> localeList4 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Collection<java.util.Locale> localeCollection8 = null;
        java.util.List<java.util.Locale> localeList9 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, localeCollection8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Collection<java.util.Locale> localeCollection13 = null;
        java.util.List<java.util.Locale> localeList14 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, localeCollection13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Collection<java.util.Locale> localeCollection21 = null;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, localeCollection21);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList22);
        java.util.Locale locale24 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap27);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Collection<java.util.Locale> localeCollection32 = null;
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, localeCollection32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Collection<java.util.Locale> localeCollection37 = null;
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, localeCollection37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Collection<java.util.Locale> localeCollection42 = null;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, localeCollection42);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Collection<java.util.Locale> localeCollection50 = null;
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, localeCollection50);
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.util.Locale>) localeList51);
        java.util.Locale locale53 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList52);
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList52);
        java.util.List<java.util.Locale> localeList55 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList52);
        java.util.Locale locale56 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList55);
        java.lang.String[] strArray91 = new java.lang.String[] { "deu", "deu", "cinese", "Chinese (China)", "UTC", "DE", "", "+52:00", "zh_CN", "java.io.IOException: Italian", "Chinese", "+01:00", "+52:00", "+00:00", "minuteOfDay", "+00:00:00.097", "ISOChronology[UTC]", "und", "+01:00", "Italian", "ISOChronology[UTC]", "halfdayOfDay", "+52:00", "+52:00", "ISOChronology[UTC]", "fr", "\u6cd5\u6587", "DE", "+00:00", "DE", "java.io.IOException: ", "cinese", "java.io.IOException: Italian", "Englisch" };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList92);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap95 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList96 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap95);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localeList22);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertNotNull(localeList54);
        org.junit.Assert.assertNotNull(localeList55);
        org.junit.Assert.assertNull(locale56);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(languageRangeList96);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendEraText();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology8 = null;
        boolean boolean9 = dateTimeFieldType7.isSupported(chronology8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendFixedSignedDecimal(dateTimeFieldType7, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder5.appendYearOfEra((int) (short) 0, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendFixedDecimal(dateTimeFieldType19, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = dateTimeFormatterBuilder23.toPrinter();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray25 = new org.joda.time.format.DateTimeParser[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder14.append(dateTimePrinter24, dateTimeParserArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimePrinter24);
        org.junit.Assert.assertNotNull(dateTimeParserArray25);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket13.saveField(dateTimeFieldType14, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder8.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder8.appendMinuteOfDay(25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatterBuilder21.toFormatter();
        java.lang.StringBuffer stringBuffer23 = null;
        org.joda.time.ReadablePartial readablePartial24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter22.printTo(stringBuffer23, readablePartial24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter8.print(readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dateTimeFormatter2.parseMillis("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology11.get(readablePartial15, (long) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.Chronology chronology13 = dateTimeFormatter8.getChronolgy();
        boolean boolean14 = dateTimeFormatter8.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = dateTimeFormatter8.parseLocalTime("Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'u');
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.years();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.year();
        org.joda.time.DurationField durationField25 = chronology17.halfdays();
        long long29 = chronology17.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField30 = chronology17.clockhourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter9.withChronology(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = dateTimeFormatter9.parseLocalDate("und");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 520L + "'", long29 == 520L);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendFixedDecimal(dateTimeFieldType8, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap12 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendTimeZoneName(strMap12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder11.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendFixedDecimal(dateTimeFieldType21, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder20.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatterBuilder25.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder29.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder30.appendFixedDecimal(dateTimeFieldType31, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder30.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap35 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendTimeZoneName(strMap35);
        org.joda.time.format.DateTimeParser dateTimeParser37 = dateTimeFormatterBuilder36.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder11.append(dateTimePrinter26, dateTimeParser37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder2.append(dateTimeParser37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder39.appendTwoDigitWeekyear((int) (short) 100, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder42.appendSignedDecimal(dateTimeFieldType43, (-2), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimePrinter26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeParser37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.dayOfWeek();
        org.joda.time.DurationField durationField11 = chronology5.seconds();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = chronology5.get(readablePartial12, (long) 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.days();
        java.lang.String str10 = chronology6.toString();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getDisplayScript();
        java.lang.String str15 = locale12.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology6, locale12, (java.lang.Integer) 10);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.lang.String str22 = locale19.getDisplayLanguage(locale21);
        java.lang.String str23 = locale12.getDisplayLanguage(locale21);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale21.getDisplayName(locale25);
        java.util.Locale locale28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = locale25.getDisplayName(locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[UTC]" + "'", str10, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "German (Germany)" + "'", str27, "German (Germany)");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.io.Writer writer5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, readableInstant6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.addUnicodeLocaleAttribute("+01:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: +01:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.ReadWritableInstant readWritableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dateTimeFormatter11.parseInto(readWritableInstant12, "cinese", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        boolean boolean14 = dateTimeFormatter13.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter13.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatter13.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter13.withDefaultYear((int) (byte) -1);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter13.withZone(dateTimeZone20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withDefaultYear((int) (short) -1);
        int int24 = dateTimeFormatter21.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder8.append(dateTimeFormatter21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder8.appendPattern("en-CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateTimeParser15);
        org.junit.Assert.assertNull(dateTimePrinter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2000 + "'", int24 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withZone(dateTimeZone11);
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguageTag("Franz\366sisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Franzo?sisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket4.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str10 = dateTimeFieldType9.getName();
        java.lang.String str11 = dateTimeFieldType9.getName();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        dateTimeParserBucket4.saveField(dateTimeFieldType9, "", locale13);
        java.lang.Integer int15 = dateTimeParserBucket4.getOffsetInteger();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 10);
        java.lang.Integer int18 = dateTimeParserBucket4.getOffsetInteger();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "minuteOfHour" + "'", str10, "minuteOfHour");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "minuteOfHour" + "'", str11, "minuteOfHour");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder2.appendHourOfDay((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendSecondOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        boolean boolean10 = dateTimeFormatter7.isPrinter();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('x', "fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("dayOfWeek", "Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: dayOfWeek [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale6 = dateTimeParserBucket4.getLocale();
        long long7 = dateTimeParserBucket4.computeMillis();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronology();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter8.print(readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter7.print(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder4.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter7.getPrinter();
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter8.printTo(writer9, readablePartial10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese (china)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNull(dateTimePrinter6);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter2.getParser();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable7, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimeParser5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology12, locale14);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter10.withChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType7.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology16.add(readablePeriod21, (long) 1, (int) (short) 10);
        java.lang.String str25 = chronology16.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter5.withChronology(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = dateTimeFormatter5.parseLocalDateTime("\ud504\ub791\uc2a4\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[UTC]" + "'", str25, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hourofday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.Chronology chronology13 = dateTimeFormatter8.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withDefaultYear((int) (short) 1);
        org.joda.time.Chronology chronology16 = dateTimeFormatter8.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(chronology16);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getName(97L);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10, locale7);
        java.lang.String str10 = locale7.getVariant();
        java.util.Locale locale11 = locale7.stripExtensions();
        java.lang.String str12 = locale7.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder4.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter7.getPrinter();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology15, locale17);
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter13.withChronology(chronology19);
        boolean boolean21 = dateTimeFormatter20.isPrinter();
        org.joda.time.Chronology chronology22 = dateTimeFormatter20.getChronolgy();
        org.joda.time.DurationField durationField23 = chronology22.hours();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        long long29 = dateTimeZone27.nextTransition((long) 100);
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.lang.String str31 = locale30.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter8.printTo(stringBuffer9, (-3599999L), chronology22, (int) 'u', dateTimeZone27, locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "anglais" + "'", str31, "anglais");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatterBuilder6.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        java.lang.Appendable appendable9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeParser8);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket13.saveField(dateTimeFieldType14, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatterBuilder18.toPrinter();
        int int20 = dateTimePrinter19.estimatePrintedLength();
        java.io.Writer writer21 = null;
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology24, locale26);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.yearOfEra();
        org.joda.time.DurationField durationField31 = chronology28.hours();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.secondOfMinute();
        org.joda.time.Chronology chronology33 = chronology28.withUTC();
        org.joda.time.DurationField durationField34 = chronology33.weeks();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 0);
        java.util.Locale locale40 = java.util.Locale.CHINA;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter19.printTo(writer21, (long) (byte) -1, chronology33, (int) 'a', dateTimeZone39, locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36 + "'", int20 == 36);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology9.add(readablePeriod14, (long) 1, (int) (short) 10);
        java.lang.String str18 = chronology9.toString();
        org.joda.time.Chronology chronology19 = chronology9.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology9.getDateTimeMillis(1, (int) (short) 10, 0, (-2));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[UTC]" + "'", str18, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\ud504\ub791\uc2a4\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket13.saveField(dateTimeFieldType14, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatterBuilder18.toPrinter();
        int int20 = dateTimePrinter19.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer21 = null;
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology24, locale26);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.yearOfEra();
        org.joda.time.DurationField durationField31 = chronology28.days();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.weekOfWeekyear();
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology35, locale37);
        org.joda.time.DateTimeField dateTimeField39 = null;
        dateTimeParserBucket38.saveField(dateTimeField39, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeParserBucket38.getZone();
        boolean boolean44 = dateTimeZone42.isStandardOffset(120L);
        java.util.Locale.Category category45 = java.util.Locale.Category.DISPLAY;
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale49 = new java.util.Locale("fr");
        java.util.Locale locale50 = java.util.Locale.FRENCH;
        java.lang.String str51 = locale50.toLanguageTag();
        java.lang.String str52 = locale49.getDisplayLanguage(locale50);
        java.util.Locale locale53 = null;
        java.lang.String str54 = locale49.getDisplayCountry(locale53);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology47, locale49, (java.lang.Integer) 0);
        java.util.Set<java.lang.Character> charSet57 = locale49.getExtensionKeys();
        java.lang.String str58 = locale49.getISO3Country();
        java.util.Locale.setDefault(category45, locale49);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter19.printTo(stringBuffer21, (long) 3, chronology28, 0, dateTimeZone42, locale49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36 + "'", int20 == 36);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + category45 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category45.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale49.toString(), "fr");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "fr" + "'", str51, "fr");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "fran\347ais" + "'", str52, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendCenturyOfEra((int) 'a', (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.append(dateTimeFormatter12);
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer14, readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendWeekOfWeekyear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        long long17 = chronology5.add(0L, (long) '4', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology5.getDateTimeMillis(10, (int) 'x', 3600000, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 520L + "'", long17 == 520L);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale3);
        java.lang.Object obj7 = locale3.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "it");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder4.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = dateTimeFormatter7.parseLocalTime("halfdayOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"halfdayOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatterBuilder14.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder4.appendOptional(dateTimeParser15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder16.appendSignedDecimal(dateTimeFieldType17, (-2), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeParser15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.hours();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.era();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str15 = dateTimeZone13.getName(97L);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale20);
        java.lang.String str22 = dateTimeZone13.getName((long) (byte) 10, locale20);
        java.lang.String str23 = locale20.getVariant();
        java.util.Locale locale24 = locale20.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder28.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder32.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder33.appendFixedDecimal(dateTimeFieldType34, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder33.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap38 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder37.appendTimeZoneName(strMap38);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder37.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder45.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder46.appendFixedDecimal(dateTimeFieldType47, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder46.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter52 = dateTimeFormatterBuilder51.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder53.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder55.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder56.appendFixedDecimal(dateTimeFieldType57, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder56.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap61 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder60.appendTimeZoneName(strMap61);
        org.joda.time.format.DateTimeParser dateTimeParser63 = dateTimeFormatterBuilder62.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder37.append(dateTimePrinter52, dateTimeParser63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder28.append(dateTimeParser63);
        boolean boolean66 = locale24.equals((java.lang.Object) dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimePrinter52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeParser63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setScript("cinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: cinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.year();
        org.joda.time.DurationField durationField11 = chronology6.weeks();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.hourOfDay();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology6);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology6.get(readablePeriod15, 119L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeParserBucket4.computeMillis(true, "German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        boolean boolean7 = dateTimeFormatter6.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder3.append(dateTimeFormatter11);
        java.lang.Integer int13 = dateTimeFormatter11.getPivotYear();
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer14, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology5.getDateTimeMillis((long) 36, (int) (short) 0, (int) (byte) -1, (int) (byte) 1, 3600000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str9 = dateTimeZone7.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone7.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter5.withZone(dateTimeZone7);
        boolean boolean14 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 36000000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withPivotYear((int) 'a');
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuffer19, 25L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer9, 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneName();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter11.withChronology(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType8.getField(chronology17);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder6.appendSignedDecimal(dateTimeFieldType8, (int) (byte) 10, 3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder6.appendTwoDigitWeekyear(0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder6.appendPattern("Italian");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder0.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setScript("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatterBuilder14.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder4.appendOptional(dateTimeParser15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendSecondOfDay(36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder18.appendTimeZoneOffset("fra", "fran\347ais", false, 187200000, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeParser15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.Chronology chronology13 = dateTimeFormatter8.getChronolgy();
        boolean boolean14 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter8.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = dateTimeFormatter8.parseLocalTime("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateTimeParser15);
        org.junit.Assert.assertNull(dateTimeParser16);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket13.saveField(dateTimeFieldType14, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatterBuilder18.toPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatterBuilder18.toFormatter();
        java.lang.StringBuffer stringBuffer21 = null;
        org.joda.time.ReadablePartial readablePartial22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter20.printTo(stringBuffer21, readablePartial22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        dateTimeParserBucket4.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.convertUTCToLocal((long) 'x');
        dateTimeParserBucket4.setZone(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeParserBucket4.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 120L + "'", long13 == 120L);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfMonth(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendYearOfCentury((int) '#', 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendTimeZoneShortName(strMap10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatterBuilder11.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTimeFormatter13.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withDefaultYear(25);
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter13.print(readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
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
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField14 = chronology5.seconds();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronology5.set(readablePartial15, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("secondOfMinute");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'secondOfMinute' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getName(97L);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        java.lang.String str14 = dateTimeZone5.getName((long) (byte) 10, locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withLocale(locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withZoneUTC();
        org.joda.time.Chronology chronology17 = dateTimeFormatter16.getChronology();
        org.joda.time.ReadWritableInstant readWritableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dateTimeFormatter16.parseInto(readWritableInstant18, "Chinesisch", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(chronology17);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeFormatter2.parseMillis("CA");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (long) 36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        java.lang.String str11 = locale9.getDisplayScript();
        java.lang.String str12 = locale9.getCountry();
        java.lang.String str13 = locale6.getDisplayCountry(locale9);
        java.util.Set<java.lang.String> strSet14 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale6);
        java.lang.String str16 = dateTimeZone1.getShortName((long) '#', locale6);
        java.lang.Object obj17 = locale6.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.097" + "'", str16, "+00:00:00.097");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder4.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter7.getPrinter();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter8.printTo(stringBuffer9, readablePartial10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "it" + "'", str12, "it");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        dateTimeParserBucket4.setOffset((int) '4');
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendDecimal(dateTimeFieldType2, (int) (short) 100, 0);
        boolean boolean6 = dateTimeFormatterBuilder0.canBuildParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology8 = null;
        boolean boolean9 = dateTimeFieldType7.isSupported(chronology8);
        java.lang.String str10 = dateTimeFieldType7.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatterBuilder0.toFormatter();
        org.joda.time.ReadWritableInstant readWritableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dateTimeFormatter12.parseInto(readWritableInstant13, "UTC", 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "minuteOfDay" + "'", str10, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.appendTimeZoneOffset("zh-TW", "fran\347ais", false, 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket4.saveField(dateTimeField9, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeParserBucket4.computeMillis(false, "zh-TW");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguage("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zh_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder4 = builder2.setLanguage("UTC");
        java.util.Locale.Builder builder7 = builder2.setExtension('u', "UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder2.addUnicodeLocaleAttribute("Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Chinesisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology5.add(readablePeriod7, (long) (byte) 0, (int) (byte) -1);
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            chronology5.validate(readablePartial11, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        dateTimeParserBucket4.setZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket4.saveField(dateTimeField11, (int) 'x');
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 10);
        java.lang.Object obj16 = dateTimeParserBucket4.saveState();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = dateTimeParserBucket4.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.weeks();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DurationField durationField11 = chronology5.weeks();
        org.joda.time.Chronology chronology12 = chronology5.withUTC();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology5.get(readablePartial13, (long) 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = dateTimeFormatter2.parseLocalDate("+52:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(chronology11);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZone(dateTimeZone9);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer11, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("hi!", throwable2);
        java.io.IOException iOException4 = new java.io.IOException(throwable2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        iOException0.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray7 = iOException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendFractionOfSecond((int) '4', (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendClockhourOfHalfday((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'u');
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.years();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.year();
        org.joda.time.DurationField durationField25 = chronology17.halfdays();
        long long29 = chronology17.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField30 = chronology17.clockhourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter9.withChronology(chronology17);
        java.io.Writer writer32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter31.printTo(writer32, readableInstant33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 520L + "'", long29 == 520L);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('x', "fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("Englisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Englisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("", throwable2);
        java.io.IOException iOException4 = new java.io.IOException(throwable2);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("ISOChronology[UTC]", (java.lang.Throwable) iOException4);
        java.lang.String str7 = iOException4.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException" + "'", str7, "java.io.IOException");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendSecondOfDay((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear(1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendTimeZoneShortName(strMap11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder8.appendYearOfCentury(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-CA");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Collection<java.util.Locale> localeCollection5 = null;
        java.util.List<java.util.Locale> localeList6 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, localeCollection5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Collection<java.util.Locale> localeCollection10 = null;
        java.util.List<java.util.Locale> localeList11 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, localeCollection10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Collection<java.util.Locale> localeCollection18 = null;
        java.util.List<java.util.Locale> localeList19 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, localeCollection18);
        java.util.List<java.util.Locale> localeList20 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList19);
        java.util.Locale locale21 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList20);
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList20);
        boolean boolean23 = languageRange1.equals((java.lang.Object) localeList22);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localeList19);
        org.junit.Assert.assertNotNull(localeList20);
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNotNull(localeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setUnicodeLocaleKeyword("fr", "\ud504\ub791\uc2a4\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: ????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendEraText();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology8 = null;
        boolean boolean9 = dateTimeFieldType7.isSupported(chronology8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendFixedSignedDecimal(dateTimeFieldType7, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendFixedDecimal(dateTimeFieldType16, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder5.appendDecimal(dateTimeFieldType16, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField16 = chronology5.years();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = chronology5.set(readablePartial17, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.lang.String str4 = locale3.toLanguageTag();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.days();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology5.getDateTimeMillis(10, 97, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        java.io.Writer writer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter8.getLocale();
        java.lang.Appendable appendable10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendHourOfHalfday((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'u');
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable12, 321L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'u');
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.years();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.year();
        org.joda.time.DurationField durationField25 = chronology17.halfdays();
        long long29 = chronology17.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField30 = chronology17.clockhourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter9.withChronology(chronology17);
        java.util.Locale locale32 = dateTimeFormatter9.getLocale();
        org.joda.time.ReadableInstant readableInstant33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = dateTimeFormatter9.print(readableInstant33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 520L + "'", long29 == 520L);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNull(locale32);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendDecimal(dateTimeFieldType16, (int) (short) 100, 0);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology25.hours();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType16.getField(chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter8.withChronology(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = chronology25.getDateTimeMillis(3600000, 36000000, (int) (byte) -1, 0, (int) '4', (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronology();
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setExtension(' ', "Deutschland");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        dateTimeParserBucket4.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone11.convertUTCToLocal((long) 'x');
        dateTimeParserBucket4.setZone(dateTimeZone11);
        long long16 = dateTimeZone11.previousTransition((long) 2000);
        long long19 = dateTimeZone11.adjustOffset((-1L), true);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 120L + "'", long13 == 120L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2000L + "'", long16 == 2000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendDecimal(dateTimeFieldType16, (int) (short) 100, 0);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology25.hours();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType16.getField(chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter8.withChronology(chronology25);
        boolean boolean31 = dateTimeFormatter30.isParser();
        java.lang.StringBuffer stringBuffer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter30.printTo(stringBuffer32, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder0.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setExtension('4', "+00:00:00.097");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        dateTimeParserBucket4.setZone(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeParserBucket4.computeMillis(true, "en-CA");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 1);
        org.joda.time.Chronology chronology18 = chronology9.withZone(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = chronology18.get(readablePeriod19, (long) 1, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology9.set(readablePartial13, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str12 = dateTimeZone10.getNameKey(1L);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = dateTimeZone10.getName(100L, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.Chronology chronology17 = chronology5.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField18 = chronology17.weeks();
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = chronology17.get(readablePartial19, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str9 = locale6.getDisplayLanguage(locale8);
        java.util.Locale.Builder builder10 = builder3.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder3.setUnicodeLocaleKeyword("+01:00", "ko");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: +01:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        org.joda.time.DurationField durationField14 = chronology5.months();
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray22 = new int[] { 100, (short) -1, 10, (byte) 10, (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            chronology5.validate(readablePartial15, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, -1, 10, 10, 100, 10]");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale7 = dateTimeParserBucket4.getLocale();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = locale7.getISO3Country();
        java.lang.String str10 = locale7.toString();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.year();
        org.joda.time.DurationField durationField11 = chronology6.weeks();
        org.joda.time.DurationField durationField12 = chronology6.weekyears();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale15 = locale14.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.lang.String str17 = locale14.getDisplayLanguage(locale16);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology6, locale14, (java.lang.Integer) 3600000, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = chronology6.getDateTimeMillis(1119L, 2000, 25, 88, 3600000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str9 = dateTimeZone7.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone7.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter5.withZone(dateTimeZone7);
        boolean boolean14 = dateTimeFormatter5.isParser();
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer15, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str9 = locale6.getDisplayLanguage(locale8);
        java.util.Locale.Builder builder10 = builder3.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder3.setLanguage("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: minuteOfDay [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale2.getDisplayLanguage();
        java.lang.String str5 = locale2.getISO3Language();
        boolean boolean6 = locale2.hasExtensions();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFixedDecimal(dateTimeFieldType11, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder10.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatterBuilder15.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendTimeZoneShortName();
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser19);
        boolean boolean21 = dateTimeFormatter20.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser22 = dateTimeFormatter20.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = dateTimeFormatter20.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter20.withDefaultYear((int) (byte) -1);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter20.withZone(dateTimeZone27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter28.withDefaultYear((int) (short) -1);
        int int31 = dateTimeFormatter28.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder15.append(dateTimeFormatter28);
        boolean boolean33 = locale2.equals((java.lang.Object) dateTimeFormatter28);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimePrinter16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(dateTimeParser22);
        org.junit.Assert.assertNull(dateTimePrinter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2000 + "'", int31 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTimeFormatter9.parseDateTime("Deutschland");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder4.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter7.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder24.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser30 = dateTimeFormatterBuilder29.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder19.appendOptional(dateTimeParser30);
        int int32 = dateTimeParser30.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder14.appendOptional(dateTimeParser30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser30);
        java.io.Writer writer35 = null;
        org.joda.time.ReadablePartial readablePartial36 = null;
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology38, locale40);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter8.printTo(writer35, readablePartial36, locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeParser30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 25 + "'", int32 == 25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguageTag("+00:00:00.097");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: +00:00:00.097 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR" + "'", str1, "FR");
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("", "zh-TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franc?ais");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatterBuilder14.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder8.append(dateTimeFormatter15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendPattern("ko");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter4.parseLocalTime("Etats-Unis");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        java.lang.Integer int10 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        boolean boolean11 = dateTimeFormatter10.isPrinter();
        org.joda.time.Chronology chronology12 = dateTimeFormatter10.getChronolgy();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfMonth();
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale14, (java.lang.Integer) 1, (int) (short) 10);
        java.lang.String str18 = locale14.getVariant();
        java.lang.String str19 = locale14.toString();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "de_DE" + "'", str19, "de_DE");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendMillisOfDay((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendTimeZoneShortName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendFractionOfDay((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.year();
        org.joda.time.DurationField durationField9 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology5.millis();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray14 = new int[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            chronology5.validate(readablePartial12, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52]");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology6, locale8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter4.withChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology10.add(readablePeriod15, (long) 1, (int) (short) 10);
        java.util.Locale locale21 = new java.util.Locale("+00:00", "era");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology10, locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = locale21.getUnicodeLocaleType("hourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hourOfDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertEquals(locale21.toString(), "+00:00_ERA");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 88);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter7.print(readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("fr");
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayLanguage(locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale3.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology1, locale3, (java.lang.Integer) 0);
        dateTimeParserBucket10.setOffset((java.lang.Integer) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket10.getZone();
        dateTimeParserBucket10.setOffset((java.lang.Integer) 0);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais" + "'", str6, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfDay();
        java.util.Locale locale10 = new java.util.Locale("fr");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology6, locale10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            chronology6.validate(readablePartial12, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, -1]");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfMonth(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendMinuteOfHour((int) (byte) 100);
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.append(dateTimeParser11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No parser supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear((int) 'x');
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(appendable14, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getName(97L);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        java.lang.String str14 = dateTimeZone5.getName((long) (byte) 10, locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withLocale(locale12);
        java.lang.StringBuffer stringBuffer16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(stringBuffer16, readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withDefaultYear(25);
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer14, readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        boolean boolean7 = dateTimeFormatter6.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder3.append(dateTimeFormatter11);
        java.lang.Integer int13 = dateTimeFormatter11.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = dateTimeFormatter11.parseLocalDate("Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder4.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter7.getPrinter();
        java.io.Writer writer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendPattern("Deutschland");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: u");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology5.getDateTimeMillis((int) (short) 1, 120, 0, 120, (-1), 0, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.dayOfYear();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = chronology5.get(readablePartial12, 25L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        java.io.Writer writer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getVariant();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "en");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket13.saveField(dateTimeFieldType14, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendMonthOfYear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendTwoDigitWeekyear(25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendYearOfEra((-1), 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("hi!", throwable1);
        java.io.IOException iOException3 = new java.io.IOException(throwable1);
        java.lang.String str4 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException" + "'", str4, "java.io.IOException");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.Chronology chronology13 = dateTimeFormatter8.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withDefaultYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology18 = dateTimeFormatter8.getChronolgy();
        java.io.Writer writer19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer19, readableInstant20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(chronology18);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology5.getDateTimeMillis((long) 3, 2000, (int) (byte) 100, (int) (short) 100, (-2));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendTwoDigitYear((int) (short) -1, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder3.appendFractionOfDay(100, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(5, true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('x', "fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter11.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withZoneUTC();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder8.append(dateTimeFormatter18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = dateTimeFormatter18.parseLocalDateTime("french");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology5.getDateTimeMillis(2000, 36, (-2), (int) (byte) -1, 0, 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder4.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter7.getPrinter();
        java.io.Writer writer9 = null;
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology12, locale14);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DurationField durationField19 = chronology16.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.Chronology chronology21 = chronology16.withUTC();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 1);
        long long28 = dateTimeZone25.adjustOffset((long) (short) 100, false);
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology31, locale33);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.dayOfYear();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = chronology35.year();
        org.joda.time.DurationField durationField40 = chronology35.weeks();
        org.joda.time.DurationField durationField41 = chronology35.weekyears();
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale44 = locale43.stripExtensions();
        java.util.Locale locale45 = java.util.Locale.GERMANY;
        java.lang.String str46 = locale43.getDisplayLanguage(locale45);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology35, locale43, (java.lang.Integer) 3600000, 0);
        java.util.Locale locale51 = new java.util.Locale("fr");
        java.util.Locale locale52 = java.util.Locale.FRENCH;
        java.lang.String str53 = locale52.toLanguageTag();
        java.lang.String str54 = locale51.getDisplayLanguage(locale52);
        java.util.Locale locale55 = null;
        java.lang.String str56 = locale51.getDisplayCountry(locale55);
        java.lang.String str57 = locale51.getISO3Language();
        java.lang.String str58 = locale43.getDisplayLanguage(locale51);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter8.printTo(writer9, (long) (short) 1, chronology16, 3, dateTimeZone25, locale51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale51.toString(), "fr");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "fr" + "'", str53, "fr");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "fran\347ais" + "'", str54, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "fra" + "'", str57, "fra");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology9.getDateTimeMillis((int) (byte) 10, 36000000, 0, (int) 'x', (int) (byte) 1, 2000, 187200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        long long9 = chronology5.add(119L, (long) 10, 100);
        org.joda.time.DateTimeField dateTimeField10 = chronology5.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = chronology5.get(readablePeriod11, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1119L + "'", long9 == 1119L);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology5.getDateTimeMillis((int) (byte) -1, (int) (short) 100, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: java.io.IOException [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable6, readableInstant7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French", (double) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendEraText();
        boolean boolean10 = dateTimeFormatterBuilder9.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendFractionOfMinute((int) '4', 0);
        boolean boolean14 = languageRange2.equals((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket13.saveField(dateTimeFieldType14, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatterBuilder18.toPrinter();
        int int20 = dateTimePrinter19.estimatePrintedLength();
        java.io.Writer writer21 = null;
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology24, locale26);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.yearOfEra();
        org.joda.time.DurationField durationField31 = chronology28.hours();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.secondOfMinute();
        org.joda.time.Chronology chronology33 = chronology28.withUTC();
        org.joda.time.DurationField durationField34 = chronology33.weeks();
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology38, locale40);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfEra();
        org.joda.time.DurationField durationField45 = chronology42.days();
        java.lang.String str46 = chronology42.toString();
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleKeys();
        java.lang.String str50 = locale48.getDisplayScript();
        java.lang.String str51 = locale48.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology42, locale48, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeParserBucket53.getZone();
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale58 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology56, locale58);
        org.joda.time.Chronology chronology60 = dateTimeParserBucket59.getChronology();
        org.joda.time.DurationField durationField61 = chronology60.halfdays();
        boolean boolean62 = dateTimeZone54.equals((java.lang.Object) durationField61);
        java.util.TimeZone timeZone63 = dateTimeZone54.toTimeZone();
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale67 = new java.util.Locale("fr");
        java.util.Locale locale68 = java.util.Locale.FRENCH;
        java.lang.String str69 = locale68.toLanguageTag();
        java.lang.String str70 = locale67.getDisplayLanguage(locale68);
        java.util.Locale locale71 = null;
        java.lang.String str72 = locale67.getDisplayCountry(locale71);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology65, locale67, (java.lang.Integer) 0);
        java.util.Set<java.lang.Character> charSet75 = locale67.getExtensionKeys();
        java.lang.String str76 = locale67.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter19.printTo(writer21, 3L, chronology33, (int) (byte) 0, dateTimeZone54, locale67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36 + "'", int20 == 36);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ISOChronology[UTC]" + "'", str46, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(timeZone63);
// flaky:         org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertEquals(locale67.toString(), "fr");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "fr" + "'", str69, "fr");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "fran\347ais" + "'", str70, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(charSet75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendFixedDecimal(dateTimeFieldType17, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = dateTimeFormatterBuilder21.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder25.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendFixedDecimal(dateTimeFieldType27, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap31 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendTimeZoneName(strMap31);
        org.joda.time.format.DateTimeParser dateTimeParser33 = dateTimeFormatterBuilder32.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder7.append(dateTimePrinter22, dateTimeParser33);
        int int35 = dateTimePrinter22.estimatePrintedLength();
        java.io.Writer writer36 = null;
        org.joda.time.ReadablePartial readablePartial37 = null;
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder40 = builder38.setVariant("Italian");
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.lang.String str42 = locale41.toLanguageTag();
        java.util.Locale.Builder builder43 = builder40.setLocale(locale41);
        java.util.Locale.Builder builder45 = builder43.setVariant("Chinese");
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale49 = new java.util.Locale("fr");
        java.util.Locale locale50 = java.util.Locale.FRENCH;
        java.lang.String str51 = locale50.toLanguageTag();
        java.lang.String str52 = locale49.getDisplayLanguage(locale50);
        java.util.Locale locale53 = null;
        java.lang.String str54 = locale49.getDisplayCountry(locale53);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology47, locale49, (java.lang.Integer) 0);
        java.util.Set<java.lang.Character> charSet57 = locale49.getExtensionKeys();
        java.util.Locale.Builder builder58 = builder43.setLocale(locale49);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter22.printTo(writer36, readablePartial37, locale49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimePrinter22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeParser33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 88 + "'", int35 == 88);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "fr" + "'", str42, "fr");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertEquals(locale49.toString(), "fr");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "fr" + "'", str51, "fr");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "fran\347ais" + "'", str52, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str14 = dateTimeZone12.getNameKey(1L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str18 = dateTimeZone16.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone16.isLocalDateTimeGap(localDateTime19);
        long long22 = dateTimeZone12.getMillisKeepLocal(dateTimeZone16, (long) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter9.withZone(dateTimeZone16);
        int int24 = dateTimeFormatter9.getDefaultYear();
        java.util.Locale locale25 = dateTimeFormatter9.getLocale();
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer26, readableInstant27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2000 + "'", int24 == 2000);
        org.junit.Assert.assertNull(locale25);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology9.add(readablePeriod14, (long) 1, (int) (short) 10);
        java.lang.String str18 = chronology9.toString();
        org.joda.time.DurationField durationField19 = chronology9.weekyears();
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology9.set(readablePartial20, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[UTC]" + "'", str18, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.days();
        java.lang.String str10 = chronology6.toString();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getDisplayScript();
        java.lang.String str15 = locale12.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology6, locale12, (java.lang.Integer) 10);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.lang.String str22 = locale19.getDisplayLanguage(locale21);
        java.lang.String str23 = locale12.getDisplayLanguage(locale21);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale21.getDisplayName(locale25);
        java.lang.String str28 = locale25.toString();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[UTC]" + "'", str10, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "German (Germany)" + "'", str27, "German (Germany)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeParser9);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeFormatter2.parseMillis("ITA");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendCenturyOfEra((int) 'a', (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendCenturyOfEra(187200000, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendHourOfHalfday((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendCenturyOfEra((int) 'a', (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.append(dateTimeFormatter12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTimeFormatter12.parseDateTime("Chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str9 = dateTimeZone7.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone7.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter5.withZone(dateTimeZone7);
        boolean boolean14 = dateTimeFormatter5.isParser();
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer15, readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("French");
        java.lang.String str2 = languageRange1.getRange();
        boolean boolean4 = languageRange1.equals((java.lang.Object) (-2));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "french" + "'", str2, "french");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getName(97L);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 10, locale7);
        java.lang.String str10 = locale7.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale7.getUnicodeLocaleType("Chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Chinese");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendDayOfMonth(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendClockhourOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendTimeZoneId();
        boolean boolean20 = dateTimeFormatterBuilder18.canBuildParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay((int) (byte) 0);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology12 = null;
        boolean boolean13 = dateTimeFieldType11.isSupported(chronology12);
        java.lang.String str14 = dateTimeFieldType11.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder7.appendShortText(dateTimeFieldType11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendDayOfYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendFractionOfHour((int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "minuteOfDay" + "'", str14, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear((int) 'x');
        java.util.Locale locale16 = new java.util.Locale("Italian", "+00:00");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withLocale(locale16);
        java.lang.String str18 = locale16.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertEquals(locale16.toString(), "italian_+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('x', "fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setUnicodeLocaleKeyword("era", "halfdayOfDay");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: era [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Chinese (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronology5.getDateTimeMillis(97, 100, 3600000, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setScript("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setRegion("Franz\366sisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Franzo?sisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendLiteral('a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendFractionOfMinute(0, (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatterBuilder14.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withPivotYear(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder6.append(dateTimeFormatter15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder6.appendHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendLiteral('a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendText(dateTimeFieldType14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder4.appendFixedSignedDecimal(dateTimeFieldType14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal number of digits: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfDay();
        java.util.Locale locale10 = new java.util.Locale("fr");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology6, locale10);
        org.joda.time.DateTimeField dateTimeField12 = chronology6.era();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronology6.getDateTimeMillis((int) 'u', 120, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.lang.String str4 = locale3.toLanguageTag();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale8 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder0.setUnicodeLocaleKeyword("ko", "CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("fr");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'fr' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str12 = dateTimeZone10.getNameKey(1L);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = dateTimeZone10.getName(100L, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.Chronology chronology17 = chronology5.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = chronology17.get(readablePeriod19, 3L, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendDayOfMonth(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendClockhourOfDay((int) (short) 10);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale20);
        org.joda.time.DateTimeField dateTimeField22 = null;
        dateTimeParserBucket21.saveField(dateTimeField22, (int) (byte) 0);
        java.util.Locale locale25 = dateTimeParserBucket21.getLocale();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket21.getZone();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder29.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendHourOfDay((int) (byte) 0);
        boolean boolean37 = dateTimeFormatterBuilder34.canBuildParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology39 = null;
        boolean boolean40 = dateTimeFieldType38.isSupported(chronology39);
        java.lang.String str41 = dateTimeFieldType38.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder34.appendShortText(dateTimeFieldType38);
        dateTimeParserBucket21.saveField(dateTimeFieldType38, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder14.appendFixedDecimal(dateTimeFieldType38, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal number of digits: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "minuteOfDay" + "'", str41, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.io.IOException iOException1 = new java.io.IOException("CA");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: CA" + "'", str2, "java.io.IOException: CA");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatterBuilder14.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder8.append(dateTimeFormatter15);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale20);
        dateTimeParserBucket21.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale24 = dateTimeParserBucket21.getLocale();
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleKeys();
        java.lang.String str26 = locale24.getISO3Country();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter15.withLocale(locale24);
        java.lang.String str29 = dateTimeFormatter27.print((long) (short) 0);
        org.joda.time.ReadWritableInstant readWritableInstant30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = dateTimeFormatter27.parseInto(readWritableInstant30, "+52:00", 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "04" + "'", str29, "04");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.io.IOException iOException2 = new java.io.IOException("CA");
        boolean boolean3 = locale0.equals((java.lang.Object) "CA");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.year();
        org.joda.time.DurationField durationField10 = chronology5.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology5.getZone();
        java.lang.String str14 = dateTimeZone12.getNameKey((long) (byte) 0);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendSignedDecimal(dateTimeFieldType9, 36, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str9 = dateTimeZone7.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone7.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter5.withZone(dateTimeZone7);
        boolean boolean14 = dateTimeFormatter5.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter5.withDefaultYear(1);
        org.joda.time.ReadWritableInstant readWritableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dateTimeFormatter5.parseInto(readWritableInstant17, "Deutschland", (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay((int) (byte) 0);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendTimeZoneName();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology24, locale26);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket27.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter22.withChronology(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType19.getField(chronology28);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder17.appendSignedDecimal(dateTimeFieldType19, (int) (byte) 10, 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder7.appendFraction(dateTimeFieldType19, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendMillisOfDay((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear((-2), true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder3.appendMonthOfYear((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.util.Locale locale1 = new java.util.Locale("fr");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale1.getDisplayLanguage(locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale6 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str7 = locale6.getDisplayScript();
        java.lang.String str8 = locale2.getDisplayVariant(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale2.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais" + "'", str4, "fran\347ais");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str9 = dateTimeZone7.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone7.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter5.withZone(dateTimeZone7);
        boolean boolean14 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 36000000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withPivotYear((int) 'a');
        java.io.Writer writer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(writer19, 3599999L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("04");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 04 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendShortText(dateTimeFieldType4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.append(dateTimeFormatter8);
        boolean boolean12 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendDecimal(dateTimeFieldType16, (int) (short) 100, 0);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology25.hours();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType16.getField(chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter8.withChronology(chronology25);
        java.lang.StringBuffer stringBuffer31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer31, readableInstant32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer6, readablePartial7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.Locale locale1 = new java.util.Locale("fr");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale1.getDisplayLanguage(locale2);
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.lang.String str7 = locale5.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale5.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais" + "'", str4, "fran\347ais");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket13.saveField(dateTimeFieldType14, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatterBuilder18.toPrinter();
        int int20 = dateTimePrinter19.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer21 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        boolean boolean28 = dateTimeZone26.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str32 = dateTimeZone30.getNameKey(1L);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str36 = dateTimeZone34.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone34.isLocalDateTimeGap(localDateTime37);
        long long40 = dateTimeZone30.getMillisKeepLocal(dateTimeZone34, (long) (byte) 100);
        long long42 = dateTimeZone26.getMillisKeepLocal(dateTimeZone34, 120L);
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("en-CA");
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter19.printTo(stringBuffer21, 3600000L, chronology23, (int) ' ', dateTimeZone26, locale44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36 + "'", int20 == 36);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 119L + "'", long42 == 119L);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_CA");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTimeFormatter5.print(readableInstant6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("fr");
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale4.getDisplayLanguage(locale5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale4.getDisplayCountry(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology2, locale4, (java.lang.Integer) 0);
        java.util.Set<java.lang.Character> charSet12 = locale4.getExtensionKeys();
        java.lang.String str13 = locale4.getISO3Country();
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str15 = locale4.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fran\347ais" + "'", str7, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("Italian");
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setExtension('4', "hourOfDay");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("", throwable2);
        java.io.IOException iOException4 = new java.io.IOException(throwable2);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("ISOChronology[UTC]", (java.lang.Throwable) iOException4);
        java.lang.String str7 = iOException6.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: ISOChronology[UTC]" + "'", str7, "java.io.IOException: ISOChronology[UTC]");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean3 = locale0.equals((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale7 = dateTimeParserBucket4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale7.getUnicodeLocaleType("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: java.io.IOException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendFixedDecimal(dateTimeFieldType17, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = dateTimeFormatterBuilder21.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder25.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendFixedDecimal(dateTimeFieldType27, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap31 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendTimeZoneName(strMap31);
        org.joda.time.format.DateTimeParser dateTimeParser33 = dateTimeFormatterBuilder32.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder7.append(dateTimePrinter22, dateTimeParser33);
        int int35 = dateTimePrinter22.estimatePrintedLength();
        java.io.Writer writer36 = null;
        org.joda.time.ReadablePartial readablePartial37 = null;
        java.util.Locale locale38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter22.printTo(writer36, readablePartial37, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimePrinter22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeParser33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 88 + "'", int35 == 88);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendDayOfMonth(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendYearOfCentury((int) '#', 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendTimeZoneShortName(strMap10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatterBuilder11.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = dateTimeFormatter12.parseLocalDateTime("java.io.IOException: CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.IOException: CA\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendMinuteOfDay(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.appendFractionOfDay((-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str3 = dateTimeZone1.getNameKey(1L);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = dateTimeZone1.getName(100L, locale5);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) (-2));
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str12 = dateTimeZone10.getNameKey(1L);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = dateTimeZone10.getName(100L, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.Chronology chronology17 = chronology5.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField18 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = chronology5.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = chronology5.getDateTimeMillis((int) '4', 25, 0, (int) '#', 0, 1, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology5.add(readablePeriod7, (long) (byte) 0, (int) (byte) -1);
        org.joda.time.DurationField durationField11 = chronology5.months();
        java.lang.Class<?> wildcardClass12 = chronology5.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("hi!", throwable2);
        java.io.IOException iOException4 = new java.io.IOException(throwable2);
        java.io.IOException iOException5 = new java.io.IOException("zh_CN", throwable2);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setScript("java.io.IOException: ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: java.io.IOException: ISOChronology[UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.millisOfDay();
        java.lang.Class<?> wildcardClass10 = dateTimeField9.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chinese");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinese" + "'", str2, "chinese");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getName(97L);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        java.lang.String str14 = dateTimeZone5.getName((long) (byte) 10, locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withLocale(locale12);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale19);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.hourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology21.hours();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str28 = dateTimeZone26.getNameKey(1L);
        java.util.Locale locale30 = java.util.Locale.TAIWAN;
        java.lang.String str31 = dateTimeZone26.getName(100L, locale30);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.Chronology chronology33 = chronology21.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField34 = chronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField35 = chronology21.yearOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter15.withChronology(chronology21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime38 = dateTimeFormatter36.parseDateTime("+52:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology17.hours();
        org.joda.time.DurationField durationField21 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.era();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str30 = dateTimeZone28.getNameKey(1L);
        long long33 = dateTimeZone28.convertLocalToUTC((long) 'a', true);
        java.lang.String str35 = dateTimeZone28.getNameKey((long) (byte) 0);
        java.lang.String str36 = dateTimeZone28.toString();
        long long38 = dateTimeZone28.previousTransition(88L);
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder41 = builder39.setVariant("Italian");
        java.util.Locale.Builder builder44 = builder39.setExtension('u', "");
        java.util.Locale.Builder builder46 = builder39.setVariant("");
        java.util.Locale.Builder builder49 = builder39.setExtension('x', "zh-TW");
        java.util.Locale locale50 = builder39.build();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter9.printTo(stringBuffer10, (long) 187200000, chronology17, 36, dateTimeZone28, locale50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 97L + "'", long33 == 97L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 88L + "'", long38 == 88L);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter2.getParser();
        int int12 = dateTimeFormatter2.getDefaultYear();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale8 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setRegion("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket4.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str10 = dateTimeFieldType9.getName();
        java.lang.String str11 = dateTimeFieldType9.getName();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        dateTimeParserBucket4.saveField(dateTimeFieldType9, "", locale13);
        java.lang.Integer int15 = dateTimeParserBucket4.getOffsetInteger();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeParserBucket4.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "minuteOfHour" + "'", str10, "minuteOfHour");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "minuteOfHour" + "'", str11, "minuteOfHour");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder4 = builder2.setLanguage("UTC");
        java.util.Locale.Builder builder7 = builder2.setExtension('u', "UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder2.setLanguage("en-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: en-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = dateTimeFormatter8.parseLocalTime("chinois (Chine)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfDay((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfYear((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendDayOfYear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.secondOfMinute();
        org.joda.time.Chronology chronology10 = chronology5.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.weeks();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.centuryOfEra();
        org.joda.time.DurationField durationField14 = chronology10.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology10.getDateTimeMillis(0, 97, (int) '#', (int) (byte) 100, 3600000, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        boolean boolean10 = dateTimeFormatter9.isOffsetParsed();
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendCenturyOfEra((int) 'a', (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFixedDecimal(dateTimeFieldType14, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder13.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology23, locale25);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket26.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter21.withChronology(chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter28.withZoneUTC();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder18.append(dateTimeFormatter28);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder33.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendDayOfWeek(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder34.appendTimeZoneShortName(strMap37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder34.appendSecondOfDay(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter41 = dateTimeFormatterBuilder34.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder18.append(dateTimePrinter41);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder45.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder46.appendFixedDecimal(dateTimeFieldType47, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder50.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder52.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder53.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder55.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser58 = dateTimeFormatterBuilder57.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder49.append(dateTimeParser58);
        int int60 = dateTimeParser58.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder9.append(dateTimePrinter41, dateTimeParser58);
        java.lang.StringBuffer stringBuffer62 = null;
        org.joda.time.ReadablePartial readablePartial63 = null;
        java.util.Locale locale64 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter41.printTo(stringBuffer62, readablePartial63, locale64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimePrinter41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeParser58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 25 + "'", int60 == 25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 1);
        java.lang.String str4 = dateTimeZone2.getNameKey((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket4.getZone();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendHourOfDay((int) (byte) 0);
        boolean boolean20 = dateTimeFormatterBuilder17.canBuildParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology22 = null;
        boolean boolean23 = dateTimeFieldType21.isSupported(chronology22);
        java.lang.String str24 = dateTimeFieldType21.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder17.appendShortText(dateTimeFieldType21);
        dateTimeParserBucket4.saveField(dateTimeFieldType21, 1);
        java.util.Locale locale28 = dateTimeParserBucket4.getLocale();
        org.joda.time.Chronology chronology29 = dateTimeParserBucket4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long34 = chronology29.getDateTimeMillis(3, 97, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "minuteOfDay" + "'", str24, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str14 = dateTimeZone12.getNameKey(1L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str18 = dateTimeZone16.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone16.isLocalDateTimeGap(localDateTime19);
        long long22 = dateTimeZone12.getMillisKeepLocal(dateTimeZone16, (long) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter9.withZone(dateTimeZone16);
        int int24 = dateTimeFormatter9.getDefaultYear();
        java.util.Locale locale25 = dateTimeFormatter9.getLocale();
        org.joda.time.ReadableInstant readableInstant26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dateTimeFormatter9.print(readableInstant26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2000 + "'", int24 == 2000);
        org.junit.Assert.assertNull(locale25);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendEraText();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology8 = null;
        boolean boolean9 = dateTimeFieldType7.isSupported(chronology8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendFixedSignedDecimal(dateTimeFieldType7, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendClockhourOfHalfday((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendTimeZoneShortName();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFixedDecimal(dateTimeFieldType14, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser25 = dateTimeFormatterBuilder24.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder16.append(dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser25);
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology31, locale33);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.dayOfYear();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.hourOfHalfday();
        org.joda.time.DurationField durationField38 = chronology35.hours();
        org.joda.time.DurationField durationField39 = chronology35.seconds();
        org.joda.time.DateTimeField dateTimeField40 = chronology35.era();
        org.joda.time.DateTimeField dateTimeField41 = chronology35.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField42 = chronology35.clockhourOfHalfday();
        org.joda.time.DurationField durationField43 = chronology35.halfdays();
        org.joda.time.DateTimeField dateTimeField44 = chronology35.millisOfSecond();
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = null;
        org.joda.time.format.DateTimeParser dateTimeParser47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter46, dateTimeParser47);
        boolean boolean49 = dateTimeFormatter48.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser50 = dateTimeFormatter48.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter48.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str55 = dateTimeZone53.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime56 = null;
        boolean boolean57 = dateTimeZone53.isLocalDateTimeGap(localDateTime56);
        java.lang.String str58 = dateTimeZone53.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter51.withZone(dateTimeZone53);
        java.util.Locale locale60 = java.util.Locale.ENGLISH;
        java.lang.String str61 = locale60.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter9.printTo(stringBuffer28, 3600000L, chronology35, (-2), dateTimeZone53, locale60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeParser25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(dateTimeParser50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "UTC" + "'", str55, "UTC");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "UTC" + "'", str58, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder3.appendSecondOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFixedDecimal(dateTimeFieldType14, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap18 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendTimeZoneName(strMap18);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder25.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendFixedDecimal(dateTimeFieldType27, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder26.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = dateTimeFormatterBuilder31.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder33.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder35.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder36.appendFixedDecimal(dateTimeFieldType37, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder36.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap41 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder40.appendTimeZoneName(strMap41);
        org.joda.time.format.DateTimeParser dateTimeParser43 = dateTimeFormatterBuilder42.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder17.append(dateTimePrinter32, dateTimeParser43);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder3.append(dateTimePrinter32);
        java.io.Writer writer46 = null;
        org.joda.time.ReadablePartial readablePartial47 = null;
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale48.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter32.printTo(writer46, readablePartial47, locale48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimePrinter32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeParser43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(locale48);
// flaky:         org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendPattern("+00:00:00.097");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendPattern("chinois");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.lang.Appendable appendable9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendDecimal(dateTimeFieldType2, (int) (short) 100, 0);
        boolean boolean6 = dateTimeFormatterBuilder0.canBuildParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology8 = null;
        boolean boolean9 = dateTimeFieldType7.isSupported(chronology8);
        java.lang.String str10 = dateTimeFieldType7.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatterBuilder0.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatterBuilder0.toFormatter();
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(writer14, readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "minuteOfDay" + "'", str10, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendFixedDecimal(dateTimeFieldType5, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder4.appendSecondOfDay((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendWeekOfWeekyear(1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap12 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendTimeZoneShortName(strMap12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder9.appendLiteral('u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder9.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder9.appendTwoDigitWeekyear((int) (short) 1, true);
        boolean boolean21 = locale0.equals((java.lang.Object) dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder4.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendCenturyOfEra((int) 'a', (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder10.appendDecimal(dateTimeFieldType11, (int) (short) 1, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder10.appendTwoDigitYear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder10.appendFraction(dateTimeFieldType17, 36, 2000);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = dateTimeFormatterBuilder20.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder0.append(dateTimePrinter21);
        java.io.Writer writer23 = null;
        org.joda.time.ReadablePartial readablePartial24 = null;
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str28 = locale25.getDisplayLanguage(locale27);
        java.lang.String str29 = locale27.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter21.printTo(writer23, readablePartial24, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimePrinter21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Italian" + "'", str28, "Italian");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendEraText();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology8 = null;
        boolean boolean9 = dateTimeFieldType7.isSupported(chronology8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendFixedSignedDecimal(dateTimeFieldType7, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder5.appendYearOfEra((int) (short) 0, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendFractionOfSecond(100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendTimeZoneOffset("en-CA", "zh-TW", false, 5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology5.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = chronology5.getDateTimeMillis(0L, 5, 100, 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMillisOfDay(0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket13.saveField(dateTimeFieldType14, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFixedSignedDecimal(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatterBuilder18.toPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatterBuilder18.toFormatter();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap21 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendTimeZoneShortName(strMap21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder18.appendMonthOfYear(88);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder28.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder31.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder32.appendTwoDigitWeekyear((int) (byte) -1, false);
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale39 = new java.util.Locale("fr");
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.lang.String str41 = locale40.toLanguageTag();
        java.lang.String str42 = locale39.getDisplayLanguage(locale40);
        java.util.Locale locale43 = null;
        java.lang.String str44 = locale39.getDisplayCountry(locale43);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology37, locale39, (java.lang.Integer) 0);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        dateTimeParserBucket46.setZone(dateTimeZone48);
        org.joda.time.Chronology chronology50 = dateTimeParserBucket46.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale58 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology56, locale58);
        org.joda.time.Chronology chronology60 = dateTimeParserBucket59.getChronology();
        java.util.Locale locale61 = dateTimeParserBucket59.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology54, locale61, (java.lang.Integer) 0, (int) (short) 100);
        dateTimeParserBucket46.saveField(dateTimeFieldType51, "hi!", locale61);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder32.appendSignedDecimal(dateTimeFieldType51, (int) ' ', 36);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder25.appendText(dateTimeFieldType51);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = dateTimeFormatterBuilder69.appendTimeZoneOffset("\u6cd5\u6587", false, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "fr" + "'", str41, "fr");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "fran\347ais" + "'", str42, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder69);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear((int) 'x');
        java.util.Locale locale16 = new java.util.Locale("Italian", "+00:00");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withLocale(locale16);
        int int18 = dateTimeFormatter17.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = dateTimeFormatter17.parseLocalDateTime("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertEquals(locale16.toString(), "italian_+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str4 = locale1.getExtension('x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendText(dateTimeFieldType12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendTimeZoneName();
        boolean boolean15 = locale1.equals((java.lang.Object) dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str9 = dateTimeZone7.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone7.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter5.withZone(dateTimeZone7);
        java.lang.StringBuffer stringBuffer14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str9 = dateTimeZone7.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone7.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter5.withZone(dateTimeZone7);
        boolean boolean14 = dateTimeFormatter5.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter5.withDefaultYear(1);
        int int17 = dateTimeFormatter5.getDefaultYear();
        java.lang.Appendable appendable18 = null;
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable18, readablePartial19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2000 + "'", int17 == 2000);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendCenturyOfEra((int) (byte) 1, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendFixedDecimal(dateTimeFieldType17, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = dateTimeFormatterBuilder21.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder25.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendFixedDecimal(dateTimeFieldType27, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap31 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendTimeZoneName(strMap31);
        org.joda.time.format.DateTimeParser dateTimeParser33 = dateTimeFormatterBuilder32.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder7.append(dateTimePrinter22, dateTimeParser33);
        java.io.Writer writer35 = null;
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale38 = new java.util.Locale("fr");
        java.util.Locale locale40 = new java.util.Locale("fr");
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.lang.String str42 = locale41.toLanguageTag();
        java.lang.String str43 = locale40.getDisplayLanguage(locale41);
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str45 = locale40.getDisplayLanguage(locale44);
        java.lang.String str46 = locale44.getDisplayLanguage();
        java.lang.String str47 = locale38.getDisplayVariant(locale44);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter22.printTo(writer35, readablePartial36, locale44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimePrinter22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeParser33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "fr" + "'", str42, "fr");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "fran\347ais" + "'", str43, "fran\347ais");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u6cd5\u6587" + "'", str45, "\u6cd5\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Chinese" + "'", str46, "Chinese");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder4.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(1);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter7.getPrinter();
        int int9 = dateTimePrinter8.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        boolean boolean15 = dateTimeFormatter14.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter14.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withPivotYear((int) 'u');
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology25, locale27);
        org.joda.time.Chronology chronology29 = dateTimeParserBucket28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = chronology29.clockhourOfDay();
        org.joda.time.DurationField durationField33 = chronology29.hours();
        org.joda.time.DurationField durationField34 = chronology29.years();
        org.joda.time.DurationField durationField35 = chronology29.hours();
        org.joda.time.DateTimeField dateTimeField36 = chronology29.year();
        org.joda.time.DurationField durationField37 = chronology29.halfdays();
        long long41 = chronology29.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField42 = chronology29.clockhourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter21.withChronology(chronology29);
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology46, locale48);
        org.joda.time.Chronology chronology50 = dateTimeParserBucket49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.dayOfYear();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField54 = chronology50.year();
        org.joda.time.DurationField durationField55 = chronology50.weeks();
        org.joda.time.DateTimeField dateTimeField56 = chronology50.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology50.getZone();
        org.joda.time.Chronology chronology61 = null;
        java.util.Locale locale63 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology61, locale63);
        org.joda.time.Chronology chronology65 = dateTimeParserBucket64.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.dayOfYear();
        org.joda.time.DateTimeField dateTimeField67 = chronology65.yearOfEra();
        org.joda.time.DurationField durationField68 = chronology65.days();
        java.lang.String str69 = chronology65.toString();
        java.util.Locale locale71 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet72 = locale71.getUnicodeLocaleKeys();
        java.lang.String str73 = locale71.getDisplayScript();
        java.lang.String str74 = locale71.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology65, locale71, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField77 = chronology65.days();
        org.joda.time.DateTimeField dateTimeField78 = chronology65.era();
        org.joda.time.Chronology chronology80 = null;
        java.util.Locale locale82 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket83 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology80, locale82);
        org.joda.time.DateTimeField dateTimeField84 = null;
        dateTimeParserBucket83.saveField(dateTimeField84, (int) (byte) 0);
        java.util.Locale locale87 = dateTimeParserBucket83.getLocale();
        java.lang.String str88 = locale87.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket90 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology65, locale87, (java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter8.printTo(stringBuffer10, 852076800000L, chronology29, (int) 'u', dateTimeZone57, locale87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dateTimeParser16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 520L + "'", long41 == 520L);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(durationField68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ISOChronology[UTC]" + "'", str69, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }
}
