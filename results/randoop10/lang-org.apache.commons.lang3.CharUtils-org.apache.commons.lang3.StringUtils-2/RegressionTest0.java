import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.time.ZoneId zoneId0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.now(zoneId0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.time.Instant instant0 = null;
        java.time.ZoneId zoneId1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime2 = java.time.OffsetTime.ofInstant(instant0, zoneId1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: instant");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.time.Instant instant0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: instant");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.DayOfWeek dayOfWeek1 = java.time.DayOfWeek.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str1 = java.net.URLConnection.guessContentTypeFromName("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.nio.file.LinkOption linkOption0 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        org.junit.Assert.assertTrue("'" + linkOption0 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption0.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.function.IntBinaryOperator intBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = intStream1.reduce((int) (byte) 1, intBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        boolean boolean0 = java.net.URLConnection.getDefaultAllowUserInteraction();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.DayOfWeek dayOfWeek2 = java.time.DayOfWeek.from((java.time.temporal.TemporalAccessor) zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain DayOfWeek from TemporalAccessor: Z of type java.time.ZoneOffset");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration2 = java.time.Duration.of((long) ' ', temporalUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: unit");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.nio.charset.CharacterCodingException characterCodingException0 = new java.nio.charset.CharacterCodingException();
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        boolean boolean1 = java.nio.charset.Charset.isSupported("Minute");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.OffsetTime offsetTime1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = localDate0.atTime(offsetTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.from((java.time.temporal.TemporalAccessor) localTime0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: 09:13:54.864 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.time.Period period1 = java.time.Period.ofWeeks((int) (byte) -1);
        java.time.Period period2 = period1.normalized();
        java.time.LocalTime localTime3 = java.time.LocalTime.now();
        int int4 = localTime3.getNano();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal5 = period1.addTo((java.time.temporal.Temporal) localTime3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Days");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 887000000 + "'", int4 == 887000000);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(" ", "Minute");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("Minute");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.security.KeyException keyException1 = new java.security.KeyException(" ");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.function.Function<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableFunction0 = java.util.function.Function.identity();
        java.lang.Comparable<java.lang.String> strComparable2 = strComparableFunction0.apply((java.lang.Comparable<java.lang.String>) "GBR");
        org.junit.Assert.assertNotNull(strComparableFunction0);
        org.junit.Assert.assertEquals("'" + strComparable2 + "' != '" + "GBR" + "'", strComparable2, "GBR");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Minute");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "etuniM" + "'", str1, "etuniM");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.time.Month month0 = java.time.Month.DECEMBER;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        java.util.Locale locale2 = java.util.Locale.UK;
        java.lang.String str3 = locale2.getISO3Country();
        java.lang.String str4 = chronoField1.getDisplayName(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange5 = month0.range((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MinuteOfHour");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.DECEMBER + "'", month0.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField1.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBR" + "'", str3, "GBR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Minute" + "'", str4, "Minute");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.plusWeeks((long) '#');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.security.NoSuchProviderException noSuchProviderException0 = new java.security.NoSuchProviderException();
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException1 = new java.util.InvalidPropertiesFormatException((java.lang.Throwable) noSuchProviderException0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.lang.String str2 = dateTimeFormatter1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.parse((java.lang.CharSequence) "GBR", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'GBR' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)" + "'", str2, "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.time.Period period1 = java.time.Period.ofWeeks((int) (byte) -1);
        java.time.Period period2 = period1.normalized();
        java.time.LocalDate localDate3 = java.time.LocalDate.now();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        boolean boolean5 = localDate3.isEqual((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        boolean boolean7 = localDate4.isSupported((java.time.temporal.TemporalField) chronoField6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal8 = period2.addTo((java.time.temporal.Temporal) localDate4);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField6.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("etuniM", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("GBR", " ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR" + "'", str3, "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)", 0, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)" + "'", str3, "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.temporal.TemporalUnit temporalUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime6 = offsetDateTime3.plus((long) 64, temporalUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("eng");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!", "(null <no signer certificates>)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.Integer> intSpliterator3 = intStream1.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException0 = new java.security.NoSuchAlgorithmException();
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Comparator<java.time.Instant> instantComparator0 = java.util.Comparator.reverseOrder();
        org.junit.Assert.assertNotNull(instantComparator0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress4 = java.net.InetAddress.getByAddress(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, -1, 0]");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.lang.String str1 = dateTimeFormatter0.toString();
        java.time.temporal.TemporalQuery[] temporalQueryArray4 = new java.time.temporal.TemporalQuery[0];
        @SuppressWarnings("unchecked")
        java.time.temporal.TemporalQuery<?>[] wildcardTemporalQueryArray5 = (java.time.temporal.TemporalQuery<?>[]) temporalQueryArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor6 = dateTimeFormatter0.parseBest((java.lang.CharSequence) "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)", wildcardTemporalQueryArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least two queries must be specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)" + "'", str1, "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
        org.junit.Assert.assertNotNull(temporalQueryArray4);
        org.junit.Assert.assertNotNull(wildcardTemporalQueryArray5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = intStream1.asDoubleStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress1 = java.net.InetAddress.getByName("GBR");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: GBR: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.WatchService watchService5 = null;
        java.nio.file.WatchEvent.Kind<?> wildcardKind6 = null;
        java.nio.file.WatchEvent.Kind[] kindArray8 = new java.nio.file.WatchEvent.Kind[1];
        @SuppressWarnings("unchecked")
        java.nio.file.WatchEvent.Kind<?>[] wildcardKindArray9 = (java.nio.file.WatchEvent.Kind<?>[]) kindArray8;
        wildcardKindArray9[0] = wildcardKind6;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.WatchKey watchKey12 = path4.register(watchService5, wildcardKindArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(kindArray8);
        org.junit.Assert.assertNotNull(wildcardKindArray9);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.lang.Runnable runnable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = intStream1.onClose(runnable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        java.util.stream.Stream<java.lang.Integer> intStream4 = intStream2.skip(10L);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = intStream2.count();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt3 = intStream1.findAny();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHoursMinutes((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 97 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        java.util.function.IntToDoubleFunction intToDoubleFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = intStream1.mapToDouble(intToDoubleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int[] intArray2 = new int[] { 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer5 = java.nio.IntBuffer.wrap(intArray2, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "GBR", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime13 = zonedDateTime11.plusSeconds((long) 4096);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("(null <no signer certificates>)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange5 = instant3.range((java.time.temporal.TemporalField) chronoField4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MinuteOfHour");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField4.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery2 = java.time.format.DateTimeFormatter.parsedExcessDays();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period3 = dateTimeFormatter0.parse((java.lang.CharSequence) " ", periodTemporalQuery2);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text ' ' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(periodTemporalQuery2);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.time.chrono.ChronoLocalDate chronoLocalDate0 = null;
        java.time.LocalDate localDate1 = java.time.LocalDate.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        boolean boolean3 = localDate1.isEqual((java.time.chrono.ChronoLocalDate) localDate2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod4 = java.time.chrono.ChronoPeriod.between(chronoLocalDate0, (java.time.chrono.ChronoLocalDate) localDate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: startDateInclusive");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer3 = charBuffer1.put("Minute");
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        java.util.stream.Stream<java.lang.Integer> intStream4 = intStream2.skip(10L);
        java.util.function.BinaryOperator<java.lang.Integer> intBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Integer> intOptional6 = intStream4.reduce(intBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020" + "'", str1, "\\u0020");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!", "(null <no signer certificates>)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ZoneRules[currentStandardOffset=Z]", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("GBR", (double) 13L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=13.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.io.IOException iOException1 = new java.io.IOException("(null <no signer certificates>)");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration2 = java.time.Duration.of((long) (byte) 100, temporalUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: unit");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime4 = localDateTime1.atOffset(zoneOffset3);
        int int5 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        int int10 = localDateTime1.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = localDateTime6.plusNanos((long) 399000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.function.DoubleToLongFunction doubleToLongFunction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream2 = doubleStream0.mapToLong(doubleToLongFunction1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.time.Month month0 = java.time.Month.OCTOBER;
        java.time.Month month2 = month0.plus(0L);
        java.time.LocalTime localTime3 = java.time.LocalTime.now();
        int int4 = localTime3.getNano();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal5 = month0.adjustInto((java.time.temporal.Temporal) localTime3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MonthOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.OCTOBER + "'", month0.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.OCTOBER + "'", month2.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 872000000 + "'", int4 == 872000000);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = chronoField0.getDisplayName(locale1);
        java.time.Period period5 = java.time.Period.ofWeeks((int) (byte) -1);
        java.time.Period period6 = period5.normalized();
        int int7 = period6.getDays();
        boolean boolean8 = locale1.equals((java.lang.Object) int7);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField0.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Minute" + "'", str3, "Minute");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        java.time.temporal.TemporalUnit temporalUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant6 = instant1.minus((long) '#', temporalUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.io.InvalidObjectException invalidObjectException1 = new java.io.InvalidObjectException("");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        long long4 = instant1.getEpochSecond();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime5 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) instant1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 1970-01-01T00:00:32Z of type java.time.Instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble2 = doubleStream0.findFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.lang.String str1 = dateTimeFormatter0.toString();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor4 = dateTimeFormatter0.parse((java.lang.CharSequence) "\\u0020", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)" + "'", str1, "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        java.time.temporal.TemporalUnit temporalUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant6 = instant1.plus((long) 10, temporalUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "Minute");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = localTime0.withHour(4096);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 4096");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.withSecond((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.plusYears((long) 1024);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000001023");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        java.util.function.IntBinaryOperator intBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt4 = intStream1.reduce(intBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.WatchService watchService5 = null;
        java.nio.file.WatchEvent.Kind<?> wildcardKind6 = null;
        java.nio.file.WatchEvent.Kind[] kindArray8 = new java.nio.file.WatchEvent.Kind[1];
        @SuppressWarnings("unchecked")
        java.nio.file.WatchEvent.Kind<?>[] wildcardKindArray9 = (java.nio.file.WatchEvent.Kind<?>[]) kindArray8;
        wildcardKindArray9[0] = wildcardKind6;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.WatchKey watchKey12 = path4.register(watchService5, wildcardKindArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(kindArray8);
        org.junit.Assert.assertNotNull(wildcardKindArray9);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.Date date0 = null;
        java.security.cert.CertPath certPath1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.Timestamp timestamp2 = new java.security.Timestamp(date0, certPath1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.Spliterator.OfInt ofInt2 = intStream1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = intStream1.sorted();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(ofInt2);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.time.Period period3 = java.time.Period.ofWeeks((int) (byte) -1);
        java.time.Period period4 = java.time.Period.from((java.time.temporal.TemporalAmount) period3);
        java.time.format.DateTimeFormatter dateTimeFormatter5 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.lang.String str6 = dateTimeFormatter5.toString();
        boolean boolean7 = period4.equals((java.lang.Object) dateTimeFormatter5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime8 = java.time.LocalTime.parse((java.lang.CharSequence) charBuffer1, dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)" + "'", str6, "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MICRO_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = chronoField0.checkValidIntValue((long) (-7));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MicroOfDay (valid values 0 - 86399999999): -7");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.MICRO_OF_DAY));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByIndex(1024);
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours((-999999999));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value -999999999 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble1 = doubleStream0.min();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.Double> doubleStream2 = doubleStream0.boxed();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate3 = java.time.LocalDate.of((-1), 1024, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 1024");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.net.URL uRL0 = null;
        java.net.URLStreamHandler uRLStreamHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL(uRL0, "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)", uRLStreamHandler2);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = java.time.Instant.parse((java.lang.CharSequence) "GBR");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'GBR' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime4 = java.time.LocalTime.of(0, (int) '4', 385000000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 385000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("OptionalInt[10]", "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = localDate0.range((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MinuteOfHour");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField1.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        java.util.stream.Stream<java.lang.Integer> intStream4 = intStream2.skip(10L);
        java.util.function.BinaryOperator<java.lang.Integer> intBinaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int7 = intStream4.reduce((java.lang.Integer) 64, intBinaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.temporal.TemporalUnit temporalUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime6 = localDateTime0.minus((long) (short) 100, temporalUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        char char0 = org.apache.commons.lang3.CharUtils.CR;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\r' + "'", char0 == '\r');
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("(null <no signer certificates>)", "Minute(null <no signer certificates>)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)" + "'", str2, "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        long long4 = instant1.getEpochSecond();
        java.time.temporal.TemporalUnit temporalUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant7 = instant1.plus((long) 10, temporalUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" ", "GBR", "United Kingdom");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble1 = doubleStream0.min();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = doubleStream0.map(doubleUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.security.Provider provider0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "(null <no signer certificates>)", "(null <no signer certificates>)", "Minute", "Minute", "(null <no signer certificates>)" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "(null <no signer certificates>)", "(null <no signer certificates>)", "Minute", "Minute", "(null <no signer certificates>)" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!", "(null <no signer certificates>)", "(null <no signer certificates>)", "Minute", "Minute", "(null <no signer certificates>)" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList43);
        boolean boolean46 = strList29.removeAll((java.util.Collection<java.lang.String>) strList45);
        boolean boolean47 = strList17.retainAll((java.util.Collection<java.lang.String>) strList45);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.Provider.Service service49 = new java.security.Provider.Service(provider0, "", "etuniM", "", strList45, strMap48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0020", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_TIME;
        java.nio.CharBuffer charBuffer2 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer3 = charBuffer2.flip();
        int int4 = charBuffer2.capacity();
        boolean boolean5 = charBuffer2.hasArray();
        java.time.temporal.TemporalQuery[] temporalQueryArray7 = new java.time.temporal.TemporalQuery[0];
        @SuppressWarnings("unchecked")
        java.time.temporal.TemporalQuery<?>[] wildcardTemporalQueryArray8 = (java.time.temporal.TemporalQuery<?>[]) temporalQueryArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor9 = dateTimeFormatter0.parseBest((java.lang.CharSequence) charBuffer2, (java.time.temporal.TemporalQuery<?>[]) temporalQueryArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least two queries must be specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(charBuffer2);
        org.junit.Assert.assertNotNull(buffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(temporalQueryArray7);
        org.junit.Assert.assertNotNull(wildcardTemporalQueryArray8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.security.KeyException keyException1 = new java.security.KeyException("GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt3 = intStream1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.parallel();
        java.util.OptionalDouble optionalDouble3 = doubleStream2.average();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = optionalDouble3.orElseGet(doubleSupplier4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(optionalDouble3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime4 = localDateTime1.atOffset(zoneOffset3);
        int int5 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime7 = localDateTime1.minusNanos((long) (short) 100);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit10 = chronoField9.getBaseUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime11 = localDateTime1.minus((long) (-1), temporalUnit10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit10 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit10.equals(java.time.temporal.ChronoUnit.WEEKS));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("etuniM", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "etuniM" + "'", str2, "etuniM");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" ", "\\u0020");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "eng");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        boolean boolean3 = byteBuffer1.hasArray();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.put(byteArray6, 23, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1]");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("OptionalInt[10]", "Minute(null <no signer certificates>)", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.EMPTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = java.time.LocalDate.ofYearDay(256, 385000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 385000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress4 = java.net.InetAddress.getByAddress("GBR", byteArray3);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.net.ContentHandlerFactory contentHandlerFactory0 = null;
        java.net.URLConnection.setContentHandlerFactory(contentHandlerFactory0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "etuniM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        int int12 = zonedDateTime11.getDayOfMonth();
        int int13 = zonedDateTime11.getMinute();
        java.time.LocalDateTime localDateTime14 = zonedDateTime11.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = zonedDateTime11.withSecond(100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String[] strArray3 = new java.lang.String[] { "Minute", "(null <no signer certificates>)", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "GBR");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 31, 31);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'G');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Minute(null <no signer certificates>)" + "'", str10, "Minute(null <no signer certificates>)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MinuteG(null <no signer certificates>)G" + "'", str12, "MinuteG(null <no signer certificates>)G");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer2 = charBuffer1.flip();
        char[] charArray6 = new char[] { '\r', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer9 = charBuffer1.get(charArray6, 33237, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r,  , #]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress[] inetAddressArray1 = java.net.InetAddress.getAllByName("java.nio.ByteBufferAsLongBufferB[pos=1 lim=4 cap=4]");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: java.nio.ByteBufferAsLongBufferB[pos=1 lim=4 cap=4]: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        long long6 = java.util.Date.UTC((int) (byte) -1, (int) 'a', (int) (byte) 0, 399000000, (int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1434414441700000L + "'", long6 == 1434414441700000L);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.time.Month month0 = java.time.Month.DECEMBER;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = month0.get((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MilliOfSecond");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.DECEMBER + "'", month0.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField1.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.withSecond((int) (byte) 0);
        java.time.LocalDate localDate6 = offsetDateTime3.toLocalDate();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        boolean boolean8 = offsetDateTime3.isSupported((java.time.temporal.TemporalField) chronoField7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime10 = offsetDateTime3.plusWeeks((long) 385000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1007378659");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField7.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.time.Month month0 = java.time.Month.OCTOBER;
        java.time.Month month2 = month0.plus(0L);
        java.time.DayOfWeek dayOfWeek4 = null;
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime8 = localDateTime5.atOffset(zoneOffset7);
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime14 = localDateTime11.atOffset(zoneOffset13);
        java.time.zone.ZoneRules zoneRules15 = zoneOffset13.getRules();
        java.time.ZonedDateTime zonedDateTime16 = offsetDateTime8.atZoneSameInstant((java.time.ZoneId) zoneOffset13);
        int int17 = zonedDateTime16.getDayOfMonth();
        int int18 = zonedDateTime16.getMinute();
        java.time.LocalDateTime localDateTime19 = zonedDateTime16.toLocalDateTime();
        java.time.LocalTime localTime20 = localDateTime19.toLocalTime();
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition22 = null;
        java.time.ZoneOffset zoneOffset23 = null;
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime29 = localDateTime26.atOffset(zoneOffset28);
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset28);
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap32 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap36 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime41 = localDateTime38.atOffset(zoneOffset40);
        java.time.zone.ZoneRules zoneRules42 = zoneOffset40.getRules();
        java.time.zone.ZoneRules zoneRules43 = zoneIdMap36.getOrDefault((java.lang.Object) 1.0d, zoneRules42);
        java.time.zone.ZoneRules zoneRules44 = zoneIdMap32.put((java.time.ZoneId) zoneOffset34, zoneRules42);
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransitionRule zoneOffsetTransitionRule45 = java.time.zone.ZoneOffsetTransitionRule.of(month2, (-7), dayOfWeek4, localTime20, false, timeDefinition22, zoneOffset23, zoneOffset28, zoneOffset34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: timeDefnition");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.OCTOBER + "'", month0.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.OCTOBER + "'", month2.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(zoneRules15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(offsetDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertNotNull(offsetDateTime41);
        org.junit.Assert.assertNotNull(zoneRules42);
        org.junit.Assert.assertNotNull(zoneRules43);
        org.junit.Assert.assertNull(zoneRules44);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("ZoneRules[currentStandardOffset=Z]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.time.LocalTime localTime0 = java.time.LocalTime.MIN;
        java.time.LocalTime localTime2 = localTime0.minusNanos((long) 100);
        java.time.temporal.TemporalField temporalField3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange4 = localTime2.range(temporalField3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: field");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDate localDate1 = localDateTime0.toLocalDate();
        java.time.LocalDateTime localDateTime3 = localDateTime0.plusWeeks(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1434414441700000L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -27490053455992");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.lang.String str1 = dateTimeFormatter0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor3 = dateTimeFormatter0.parse((java.lang.CharSequence) "Minute(null <no signer certificates>)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Minute(null <no signer certificates>)' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)" + "'", str1, "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("eng", "java.nio.ByteBufferAsLongBufferB[pos=1 lim=4 cap=4]", "United Kingdom");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.time.Month month2 = java.time.Month.OCTOBER;
        java.time.Month month4 = month2.plus(0L);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        int int10 = localDateTime5.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime14 = localDateTime11.atOffset(zoneOffset13);
        int int15 = localDateTime6.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime11);
        java.time.temporal.Temporal temporal16 = month4.adjustInto((java.time.temporal.Temporal) localDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant17 = instant1.with((java.time.temporal.TemporalAdjuster) localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.OCTOBER + "'", month2.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.OCTOBER + "'", month4.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(temporal16);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.stream.Stream.Builder<java.util.OptionalDouble> optionalDoubleBuilder0 = java.util.stream.Stream.builder();
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble2 = doubleStream1.min();
        boolean boolean3 = optionalDouble2.isPresent();
        java.util.stream.Stream.Builder<java.util.OptionalDouble> optionalDoubleBuilder4 = optionalDoubleBuilder0.add(optionalDouble2);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = optionalDouble2.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDoubleBuilder0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionalDoubleBuilder4);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.WatchService watchService5 = null;
        java.nio.file.WatchEvent.Kind[] kindArray7 = new java.nio.file.WatchEvent.Kind[0];
        @SuppressWarnings("unchecked")
        java.nio.file.WatchEvent.Kind<?>[] wildcardKindArray8 = (java.nio.file.WatchEvent.Kind<?>[]) kindArray7;
        java.nio.file.WatchEvent.Modifier[] modifierArray9 = new java.nio.file.WatchEvent.Modifier[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.WatchKey watchKey10 = path4.register(watchService5, wildcardKindArray8, modifierArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(kindArray7);
        org.junit.Assert.assertNotNull(wildcardKindArray8);
        org.junit.Assert.assertNotNull(modifierArray9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.time.Duration duration2 = java.time.Duration.ofSeconds((long) 10, 0L);
        boolean boolean3 = duration2.isNegative();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("zh-CN", "MinuteG(null <no signer certificates>)G", "/experiment/GBR/");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: zh-cn");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("eng", "etuniM");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        int int1 = offsetDateTime0.getDayOfMonth();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        boolean boolean3 = byteBuffer1.hasArray();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.put(byteArray5, 16, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR G..." + "'", str2, "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR G...");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime11.withLaterOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        long long14 = zonedDateTime11.getLong((java.time.temporal.TemporalField) chronoField13);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField16.getBaseUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime18 = zonedDateTime11.minus((long) (short) -1, temporalUnit17);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField13.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 999999999L + "'", long14 == 999999999L);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField16.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.WEEKS));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery0 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        org.junit.Assert.assertNotNull(booleanTemporalQuery0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.WatchService watchService7 = null;
        java.nio.file.WatchEvent.Kind<?> wildcardKind8 = null;
        java.nio.file.WatchEvent.Kind[] kindArray10 = new java.nio.file.WatchEvent.Kind[1];
        @SuppressWarnings("unchecked")
        java.nio.file.WatchEvent.Kind<?>[] wildcardKindArray11 = (java.nio.file.WatchEvent.Kind<?>[]) kindArray10;
        wildcardKindArray11[0] = wildcardKind8;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.WatchKey watchKey14 = path4.register(watchService7, wildcardKindArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertNotNull(kindArray10);
        org.junit.Assert.assertNotNull(wildcardKindArray11);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("MinuteG(null <no signer certificates>)G", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MinuteG(null <no signer certificates>)G" + "'", str2, "MinuteG(null <no signer certificates>)G");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.UNDERFLOW;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = coderResult0.length();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(coderResult0);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.OptionalInt optionalInt2 = intStream1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt3 = intStream1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime5 = localDateTime2.atOffset(zoneOffset4);
        java.time.Clock clock6 = java.time.Clock.fixed(instant1, (java.time.ZoneId) zoneOffset4);
        java.time.LocalTime localTime7 = java.time.LocalTime.now(clock6);
        java.time.LocalTime localTime9 = localTime7.plusMinutes((long) 10);
        java.time.Instant instant11 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant13 = instant11.minusNanos((long) 'a');
        java.nio.file.attribute.FileTime fileTime14 = java.nio.file.attribute.FileTime.from(instant11);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery15 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period16 = instant11.query(periodTemporalQuery15);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit18 = chronoField17.getBaseUnit();
        boolean boolean19 = instant11.isSupported(temporalUnit18);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime20 = localTime9.truncatedTo(temporalUnit18);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit is too large to be used for truncation");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(fileTime14);
        org.junit.Assert.assertNotNull(periodTemporalQuery15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField17.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit18 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit18.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: C");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.time.ZonedDateTime zonedDateTime0 = java.time.ZonedDateTime.now();
        org.junit.Assert.assertNotNull(zonedDateTime0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime3 = java.time.LocalTime.of(100, 999999999, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime5 = localDateTime2.atOffset(zoneOffset4);
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime11 = localDateTime8.atOffset(zoneOffset10);
        java.time.zone.ZoneRules zoneRules12 = zoneOffset10.getRules();
        java.time.ZonedDateTime zonedDateTime13 = offsetDateTime5.atZoneSameInstant((java.time.ZoneId) zoneOffset10);
        int int14 = zonedDateTime13.getDayOfMonth();
        java.time.ZonedDateTime zonedDateTime16 = zonedDateTime13.withDayOfYear(10);
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime22 = localDateTime19.atOffset(zoneOffset21);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset21);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit26 = chronoField25.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime27 = localDateTime23.minus((long) (-999999999), temporalUnit26);
        boolean boolean28 = zonedDateTime13.isSupported(temporalUnit26);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate29 = localDate0.minus((long) 399000000, temporalUnit26);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1007646974");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField25.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit26 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit26.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.function.DoubleSupplier doubleSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.generate(doubleSupplier0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "(null <no signer certificates>)", "(null <no signer certificates>)", "Minute", "Minute", "(null <no signer certificates>)" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "(null <no signer certificates>)", "(null <no signer certificates>)", "Minute", "Minute", "(null <no signer certificates>)" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList25);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!", "(null <no signer certificates>)", "(null <no signer certificates>)", "Minute", "Minute", "(null <no signer certificates>)" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList39);
        boolean boolean42 = strList25.removeAll((java.util.Collection<java.lang.String>) strList41);
        boolean boolean43 = strList13.retainAll((java.util.Collection<java.lang.String>) strList41);
        java.util.Spliterator<java.lang.String> strSpliterator44 = strList41.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = strList41.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strSpliterator44);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDate localDate1 = localDateTime0.toLocalDate();
        java.time.LocalDateTime localDateTime3 = localDateTime0.plusWeeks(0L);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        boolean boolean5 = localDateTime0.isSupported((java.time.temporal.TemporalField) chronoField4);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit8 = chronoField7.getBaseUnit();
        boolean boolean9 = temporalUnit8.isTimeBased();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = localDateTime0.plus((long) 100, temporalUnit8);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000001");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField4.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit8 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit8.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.time.Period period1 = java.time.Period.ofWeeks((int) (byte) -1);
        java.time.Period period2 = period1.normalized();
        long long3 = period1.toTotalMonths();
        java.time.chrono.ChronoPeriod chronoPeriod5 = period1.multipliedBy((int) (short) 100);
        int int6 = period1.getMonths();
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime10 = localDateTime7.atOffset(zoneOffset9);
        java.time.OffsetDateTime offsetDateTime12 = offsetDateTime10.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime16 = localDateTime13.atOffset(zoneOffset15);
        java.time.zone.ZoneRules zoneRules17 = zoneOffset15.getRules();
        java.time.ZonedDateTime zonedDateTime18 = offsetDateTime10.atZoneSameInstant((java.time.ZoneId) zoneOffset15);
        java.time.ZonedDateTime zonedDateTime19 = zonedDateTime18.withLaterOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        long long21 = zonedDateTime18.getLong((java.time.temporal.TemporalField) chronoField20);
        java.time.ZoneId zoneId22 = zonedDateTime18.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal23 = period1.subtractFrom((java.time.temporal.Temporal) zonedDateTime18);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(chronoPeriod5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(zoneRules17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField20.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 999999999L + "'", long21 == 999999999L);
        org.junit.Assert.assertNotNull(zoneId22);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        boolean boolean5 = file1.setWritable(true);
        java.net.URI uRI6 = file1.toURI();
        java.io.File file8 = new java.io.File("GBR");
        boolean boolean10 = file8.setWritable(true);
        boolean boolean12 = file8.setWritable(true);
        java.net.URI uRI13 = file8.toURI();
        java.net.URI uRI14 = uRI6.relativize(uRI13);
        java.lang.String str15 = uRI6.getRawSchemeSpecificPart();
        java.io.File file17 = new java.io.File("GBR");
        boolean boolean19 = file17.setWritable(true);
        boolean boolean21 = file17.setWritable(true);
        java.net.URI uRI22 = file17.toURI();
        java.io.File file24 = new java.io.File("GBR");
        boolean boolean26 = file24.setWritable(true);
        boolean boolean28 = file24.setWritable(true);
        java.net.URI uRI29 = file24.toURI();
        java.net.URI uRI30 = uRI22.relativize(uRI29);
        java.net.URI uRI31 = uRI6.relativize(uRI30);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file32 = new java.io.File(uRI30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URI is not absolute");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "GBR");
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(uRI13);
        org.junit.Assert.assertNotNull(uRI14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/experiment/GBR/" + "'", str15, "/experiment/GBR/");
        org.junit.Assert.assertNull("file17.getParent() == null", file17.getParent());
        org.junit.Assert.assertEquals(file17.toString(), "GBR");
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(uRI22);
        org.junit.Assert.assertNull("file24.getParent() == null", file24.getParent());
        org.junit.Assert.assertEquals(file24.toString(), "GBR");
// flaky:         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(uRI29);
        org.junit.Assert.assertNotNull(uRI30);
        org.junit.Assert.assertNotNull(uRI31);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL;
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.time.Period period2 = java.time.Period.ofWeeks((int) (byte) -1);
        java.time.Period period3 = java.time.Period.from((java.time.temporal.TemporalAmount) period2);
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.lang.String str5 = dateTimeFormatter4.toString();
        boolean boolean6 = period3.equals((java.lang.Object) dateTimeFormatter4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.parse((java.lang.CharSequence) "eng", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'eng' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)" + "'", str5, "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = new java.net.URI("(null <no signer certificates>)", "United Kingdom", "Chinese", "java.nio.ByteBufferAsLongBufferB[pos=1 lim=4 cap=4]");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: (null <no signer certificates>)://United KingdomChinese#java.nio.ByteBufferAsLongBufferB[pos=1%20lim=4%20cap=4]");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble2 = doubleStream0.min();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.time.Instant instant2 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant4 = instant2.minusNanos((long) 'a');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime8 = localDateTime5.atOffset(zoneOffset7);
        java.time.zone.ZoneRules zoneRules9 = zoneOffset7.getRules();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.ofInstant(instant2, (java.time.ZoneId) zoneOffset7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId11 = java.time.ZoneId.ofOffset("etuniM", zoneOffset7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prefix should be GMT, UTC or UT, is: etuniM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(zoneRules9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Z", 59, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaZaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaZaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime11.withLaterOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        long long14 = zonedDateTime11.getLong((java.time.temporal.TemporalField) chronoField13);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery15 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period16 = zonedDateTime11.query(periodTemporalQuery15);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime20 = localDateTime17.atOffset(zoneOffset19);
        java.time.OffsetDateTime offsetDateTime22 = offsetDateTime20.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime26 = localDateTime23.atOffset(zoneOffset25);
        java.time.zone.ZoneRules zoneRules27 = zoneOffset25.getRules();
        java.time.ZonedDateTime zonedDateTime28 = offsetDateTime20.atZoneSameInstant((java.time.ZoneId) zoneOffset25);
        int int29 = zonedDateTime28.getDayOfMonth();
        java.time.ZonedDateTime zonedDateTime31 = zonedDateTime28.withDayOfYear(10);
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime37 = localDateTime34.atOffset(zoneOffset36);
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset36);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit41 = chronoField40.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime42 = localDateTime38.minus((long) (-999999999), temporalUnit41);
        boolean boolean43 = zonedDateTime28.isSupported(temporalUnit41);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime44 = zonedDateTime11.truncatedTo(temporalUnit41);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit is too large to be used for truncation");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField13.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 999999999L + "'", long14 == 999999999L);
        org.junit.Assert.assertNotNull(periodTemporalQuery15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(zoneRules27);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 31 + "'", int29 == 31);
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertNotNull(offsetDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit41 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit41.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.OptionalInt optionalInt2 = intStream1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = intStream1.limit((long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        int int1 = localTime0.getNano();
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        long long3 = localTime0.getLong((java.time.temporal.TemporalField) chronoField2);
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime7 = localDateTime4.atOffset(zoneOffset6);
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime7.withSecond((int) (byte) 0);
        boolean boolean10 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) offsetDateTime7);
        java.time.Period period12 = java.time.Period.ofWeeks((int) (byte) -1);
        java.time.Period period13 = java.time.Period.from((java.time.temporal.TemporalAmount) period12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime14 = offsetDateTime7.minus((java.time.temporal.TemporalAmount) period13);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 761000000 + "'", int1 == 761000000);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField2.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.io.InvalidObjectException invalidObjectException1 = new java.io.InvalidObjectException("Z");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator0 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.parallel();
        java.util.OptionalDouble optionalDouble3 = doubleStream2.average();
        boolean boolean4 = doubleStream2.isParallel();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = doubleStream2.limit((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String str0 = java.io.File.pathSeparator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble3 = intStream1.average();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter(writer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("MinuteG(null <no signer certificates>)G", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.HOUR_OF_AMPM;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.LocalDate localDate2 = localDateTime1.toLocalDate();
        java.time.LocalDateTime localDateTime4 = localDateTime1.plusWeeks(0L);
        java.time.temporal.ValueRange valueRange5 = chronoField0.rangeRefinedBy((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalField temporalField7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = valueRange5.checkValidIntValue((long) 399000000, temporalField7);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value (valid values 0 - 11): 399000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.HOUR_OF_AMPM));
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(valueRange5);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.lang.String str2 = dateTimeFormatter1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "Minute", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Minute' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)" + "'", str2, "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer2 = charBuffer1.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer4 = charBuffer1.put('G');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaZaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("eng", "etuniM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        char char0 = java.text.CharacterIterator.DONE;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\uffff' + "'", char0 == '\uffff');
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.function.IntSupplier intSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream1 = java.util.stream.IntStream.generate(intSupplier0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.net.URLStreamHandlerFactory uRLStreamHandlerFactory0 = null;
        java.net.URL.setURLStreamHandlerFactory(uRLStreamHandlerFactory0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.withSecond((int) (byte) 0);
        java.time.LocalDate localDate6 = offsetDateTime3.toLocalDate();
        java.time.LocalDate localDate8 = localDate6.minusWeeks((long) 834000000);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate8.get((java.time.temporal.TemporalField) chronoField9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MinuteOfHour");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField9.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBR" + "'", str1, "GBR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer2 = charBuffer1.flip();
        int int3 = charBuffer1.capacity();
        boolean boolean4 = charBuffer1.hasArray();
        char[] charArray12 = new char[] { 'a', '#', '4', '#' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Minute", charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer18 = charBuffer1.put(charArray12, 256, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setExecutable(true);
        boolean boolean4 = file1.canExecute();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter5 = new java.io.PrintWriter(file1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: GBR (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime7 = localDateTime4.atOffset(zoneOffset6);
        java.time.zone.ZoneRules zoneRules8 = zoneOffset6.getRules();
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset6);
        java.time.LocalDate localDate10 = java.time.LocalDate.now();
        java.time.LocalDate localDate11 = java.time.LocalDate.MIN;
        boolean boolean12 = localDate10.isEqual((java.time.chrono.ChronoLocalDate) localDate11);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        boolean boolean14 = localDate11.isSupported((java.time.temporal.TemporalField) chronoField13);
        int int15 = localDate11.getDayOfYear();
        java.time.LocalDate localDate17 = localDate11.withYear((int) '4');
        java.time.LocalTime localTime18 = java.time.LocalTime.MIN;
        java.time.LocalTime localTime20 = localTime18.plusHours((long) 16384);
        java.time.LocalDateTime localDateTime21 = localDate11.atTime(localTime18);
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime25 = localDateTime22.atOffset(zoneOffset24);
        java.time.OffsetDateTime offsetDateTime27 = offsetDateTime25.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime31 = localDateTime28.atOffset(zoneOffset30);
        java.time.zone.ZoneRules zoneRules32 = zoneOffset30.getRules();
        java.time.ZonedDateTime zonedDateTime33 = offsetDateTime25.atZoneSameInstant((java.time.ZoneId) zoneOffset30);
        int int34 = zonedDateTime33.getDayOfMonth();
        java.time.ZonedDateTime zonedDateTime36 = zonedDateTime33.withDayOfYear(10);
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime42 = localDateTime39.atOffset(zoneOffset41);
        java.time.LocalDateTime localDateTime43 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset41);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit46 = chronoField45.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime47 = localDateTime43.minus((long) (-999999999), temporalUnit46);
        boolean boolean48 = zonedDateTime33.isSupported(temporalUnit46);
        // The following exception was thrown during execution in test generation
        try {
            long long49 = instant1.until((java.time.temporal.Temporal) localTime18, temporalUnit46);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain Instant from TemporalAccessor: 00:00 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(zoneRules8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField13.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(offsetDateTime31);
        org.junit.Assert.assertNotNull(zoneRules32);
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 31 + "'", int34 == 31);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertNotNull(offsetDateTime42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField45.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit46 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit46.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime4 = localDateTime1.atOffset(zoneOffset3);
        int int5 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        int int10 = localDateTime1.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime15 = localDateTime12.atOffset(zoneOffset14);
        int int16 = localDateTime11.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime20 = localDateTime17.atOffset(zoneOffset19);
        int int21 = localDateTime12.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime26 = localDateTime23.atOffset(zoneOffset25);
        int int27 = localDateTime22.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime31 = localDateTime28.atOffset(zoneOffset30);
        int int32 = localDateTime23.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime28);
        boolean boolean33 = localDateTime12.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime28);
        java.time.temporal.Temporal temporal34 = localDateTime6.adjustInto((java.time.temporal.Temporal) localDateTime12);
        java.time.LocalDateTime localDateTime36 = localDateTime6.withYear((-999999999));
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime37 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) localDateTime36);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: -999999999-12-31T23:59:59.999999999 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(offsetDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(temporal34);
        org.junit.Assert.assertNotNull(localDateTime36);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.time.Month month0 = java.time.Month.OCTOBER;
        java.time.Month month2 = month0.minus((long) 64);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime6 = localDateTime3.atOffset(zoneOffset5);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.withSecond((int) (byte) 0);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.MICRO_OF_DAY;
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime6.with((java.time.temporal.TemporalField) chronoField9, (long) 31);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = month0.getLong((java.time.temporal.TemporalField) chronoField9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MicroOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.OCTOBER + "'", month0.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.JUNE + "'", month2.equals(java.time.Month.JUNE));
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_DAY + "'", chronoField9.equals(java.time.temporal.ChronoField.MICRO_OF_DAY));
        org.junit.Assert.assertNotNull(offsetDateTime11);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str1, "1969-12-31T23:59:59.999Z");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("1969-12-31T23:59:59.999Z", "OptionalInt[10]", 14);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.EXECUTE;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.EXECUTE + "'", accessMode0.equals(java.nio.file.AccessMode.EXECUTE));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer2 = charBuffer1.flip();
        boolean boolean3 = buffer2.hasArray();
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(" ", "-999999999-01-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress1 = java.net.InetAddress.getByName("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: United Kingdom: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.parallel();
        java.util.function.DoubleBinaryOperator doubleBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble4 = doubleStream2.reduce(doubleBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond(0L);
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        int int12 = zonedDateTime11.getDayOfMonth();
        int int13 = zonedDateTime11.getMinute();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime11.minusWeeks((long) 1);
        java.time.ZonedDateTime zonedDateTime17 = zonedDateTime15.minusMinutes(0L);
        int int18 = zonedDateTime17.getYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 999999999 + "'", int18 == 999999999);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream2 = doubleStream0.skip((long) (byte) 10);
        java.util.DoubleSummaryStatistics doubleSummaryStatistics3 = new java.util.DoubleSummaryStatistics();
        java.util.stream.DoubleStream doubleStream4 = doubleStream2.peek((java.util.function.DoubleConsumer) doubleSummaryStatistics3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble5 = doubleStream2.max();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertEquals(doubleSummaryStatistics3.toString(), "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}");
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = java.nio.charset.Charset.isSupported("\\u0020");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: \\u0020");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        long long6 = java.util.Date.UTC(256, 4096, 794000000, 100, (int) (short) -1, 23);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 68618241259163000L + "'", long6 == 68618241259163000L);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.time.Duration duration2 = java.time.Duration.ofSeconds((long) 10, 0L);
        int int3 = duration2.getNano();
        java.time.Duration duration5 = duration2.plusNanos((long) '\uffff');
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.ofLocale(locale1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("ZoneRules[currentStandardOffset=Z]", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zonerules[currentstandardoffset=z]" + "'", str4, "zonerules[currentstandardoffset=z]");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path6 = path4.getName((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String[] strArray3 = new java.lang.String[] { "Minute", "(null <no signer certificates>)", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "GBR");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime7 = localDateTime4.atOffset(zoneOffset6);
        java.time.zone.ZoneRules zoneRules8 = zoneOffset6.getRules();
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset6);
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime13 = localDateTime10.atOffset(zoneOffset12);
        java.time.OffsetDateTime offsetDateTime15 = offsetDateTime13.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime19 = localDateTime16.atOffset(zoneOffset18);
        java.time.zone.ZoneRules zoneRules20 = zoneOffset18.getRules();
        java.time.ZonedDateTime zonedDateTime21 = offsetDateTime13.atZoneSameInstant((java.time.ZoneId) zoneOffset18);
        java.time.ZoneId zoneId22 = zonedDateTime21.getZone();
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap24 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap28 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime33 = localDateTime30.atOffset(zoneOffset32);
        java.time.zone.ZoneRules zoneRules34 = zoneOffset32.getRules();
        java.time.zone.ZoneRules zoneRules35 = zoneIdMap28.getOrDefault((java.lang.Object) 1.0d, zoneRules34);
        java.time.zone.ZoneRules zoneRules36 = zoneIdMap24.put((java.time.ZoneId) zoneOffset26, zoneRules34);
        java.time.ZoneId[] zoneIdArray37 = new java.time.ZoneId[] { zoneOffset6, zoneId22, zoneOffset26 };
        java.util.LinkedHashSet<java.time.ZoneId> zoneIdSet38 = new java.util.LinkedHashSet<java.time.ZoneId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.time.ZoneId>) zoneIdSet38, zoneIdArray37);
        java.lang.String[] strArray43 = new java.lang.String[] { "Minute", "(null <no signer certificates>)", "" };
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.stripAll(strArray43, "GBR");
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray45);
        boolean boolean47 = zoneIdSet38.remove((java.lang.Object) strArray45);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray45);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(zoneRules8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(zoneRules20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertNotNull(zoneRules34);
        org.junit.Assert.assertNotNull(zoneRules35);
        org.junit.Assert.assertNull(zoneRules36);
        org.junit.Assert.assertNotNull(zoneIdArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Minute(null <no signer certificates>)" + "'", str46, "Minute(null <no signer certificates>)");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption9 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray10 = new java.nio.file.OpenOption[] { linkOption7, linkOption8, linkOption9 };
        java.nio.channels.FileChannel fileChannel11 = java.nio.channels.FileChannel.open(path4, openOptionArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.FileLock fileLock12 = fileChannel11.tryLock();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption9 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption9.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.io.IOException iOException1 = new java.io.IOException("eng");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ERA;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField0.equals(java.time.temporal.ChronoField.ERA));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap1 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime6 = localDateTime3.atOffset(zoneOffset5);
        java.time.zone.ZoneRules zoneRules7 = zoneOffset5.getRules();
        java.time.zone.ZoneRules zoneRules8 = zoneIdMap1.getOrDefault((java.lang.Object) 1.0d, zoneRules7);
        java.util.Set<java.time.ZoneId> zoneIdSet9 = zoneIdMap1.keySet();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "(null <no signer certificates>)", "(null <no signer certificates>)", "Minute", "Minute", "(null <no signer certificates>)" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "(null <no signer certificates>)", "(null <no signer certificates>)", "Minute", "Minute", "(null <no signer certificates>)" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList35);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "(null <no signer certificates>)", "(null <no signer certificates>)", "Minute", "Minute", "(null <no signer certificates>)" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList49);
        boolean boolean52 = strList35.removeAll((java.util.Collection<java.lang.String>) strList51);
        boolean boolean53 = strList23.retainAll((java.util.Collection<java.lang.String>) strList51);
        boolean boolean54 = zoneIdSet9.removeAll((java.util.Collection<java.lang.String>) strList23);
        java.util.Spliterator<java.lang.String> strSpliterator55 = strList23.spliterator();
        java.util.stream.Stream<java.lang.String> strStream56 = strList23.stream();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(zoneRules7);
        org.junit.Assert.assertNotNull(zoneRules8);
        org.junit.Assert.assertNotNull(zoneIdSet9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strSpliterator55);
        org.junit.Assert.assertNotNull(strStream56);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061" + "'", str1, "\\u0061");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        boolean boolean2 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        boolean boolean4 = localDate1.isSupported((java.time.temporal.TemporalField) chronoField3);
        int int5 = localDate1.getDayOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.now();
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        boolean boolean8 = localDate6.isEqual((java.time.chrono.ChronoLocalDate) localDate7);
        int int9 = localDate7.getYear();
        java.lang.String str10 = localDate7.toString();
        java.time.chrono.ChronoPeriod chronoPeriod11 = java.time.chrono.ChronoPeriod.between((java.time.chrono.ChronoLocalDate) localDate1, (java.time.chrono.ChronoLocalDate) localDate7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<?> wildcardChronoZonedDateTime12 = java.time.chrono.ChronoZonedDateTime.from((java.time.temporal.TemporalAccessor) localDate1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: -999999999-01-01 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField3.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-999999999) + "'", int9 == (-999999999));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-999999999-01-01" + "'", str10, "-999999999-01-01");
        org.junit.Assert.assertNotNull(chronoPeriod11);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer2 = charBuffer1.flip();
        java.nio.CharBuffer charBuffer4 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer5 = charBuffer4.flip();
        int int6 = charBuffer1.compareTo(charBuffer4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant7 = java.time.Instant.parse((java.lang.CharSequence) charBuffer1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setExecutable(true);
        java.io.File file4 = file1.getCanonicalFile();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter6 = new java.io.PrintWriter(file4, "Chinese");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Chinese");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(file4);
// flaky:         org.junit.Assert.assertEquals(file4.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file4.toString(), "/experiment/GBR");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        char char0 = org.apache.commons.lang3.CharUtils.LF;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\n' + "'", char0 == '\n');
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.security.KeyException keyException0 = new java.security.KeyException();
        java.security.SignatureException signatureException1 = new java.security.SignatureException((java.lang.Throwable) keyException0);
        java.lang.Throwable[] throwableArray2 = keyException0.getSuppressed();
        java.util.function.Predicate<java.nio.file.AccessMode> accessModePredicate3 = java.util.function.Predicate.isEqual((java.lang.Object) keyException0);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(accessModePredicate3);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("MinuteG(null <no signer certificates>)G", "Z");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDate localDate1 = localDateTime0.toLocalDate();
        java.time.LocalDateTime localDateTime3 = localDateTime0.plusWeeks(0L);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        boolean boolean5 = localDateTime0.isSupported((java.time.temporal.TemporalField) chronoField4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = localDateTime0.plusWeeks((long) '\r');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField4.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 256);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("/experiment/GBR/", "5");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException1 = new java.util.InvalidPropertiesFormatException("/experiment/GBR");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = java.time.LocalDate.parse((java.lang.CharSequence) "ISO");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'ISO' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.withSecond((int) (byte) 0);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.MICRO_OF_DAY;
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime3.with((java.time.temporal.TemporalField) chronoField6, (long) 31);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.plusDays((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_DAY + "'", chronoField6.equals(java.time.temporal.ChronoField.MICRO_OF_DAY));
        org.junit.Assert.assertNotNull(offsetDateTime8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId1 = java.time.ZoneId.of("hi!");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: hi!");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('\n');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime4 = localDateTime1.atOffset(zoneOffset3);
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime4.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime10 = localDateTime7.atOffset(zoneOffset9);
        java.time.zone.ZoneRules zoneRules11 = zoneOffset9.getRules();
        java.time.ZonedDateTime zonedDateTime12 = offsetDateTime4.atZoneSameInstant((java.time.ZoneId) zoneOffset9);
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime12.withLaterOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        long long15 = zonedDateTime12.getLong((java.time.temporal.TemporalField) chronoField14);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = isoEra0.get((java.time.temporal.TemporalField) chronoField14);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfSecond");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra0.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 999999999L + "'", long15 == 999999999L);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime11.withLaterOffsetAtOverlap();
        java.lang.String str13 = zonedDateTime11.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+999999999-12-31T23:59:59.999999999Z" + "'", str13, "+999999999-12-31T23:59:59.999999999Z");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer2 = charBuffer1.flip();
        java.nio.CharBuffer charBuffer4 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer5 = charBuffer4.flip();
        int int6 = charBuffer1.compareTo(charBuffer4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer8 = charBuffer1.put('G');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.OptionalDouble optionalDouble2 = doubleStream1.findAny();
        // The following exception was thrown during execution in test generation
        try {
            java.util.DoubleSummaryStatistics doubleSummaryStatistics3 = doubleStream1.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("DIRECT", (int) (short) 0, 722000000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer5 = longBuffer2.put(64, (long) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Z", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap3 = strMap0.subMap("zh-CN", "-999999999-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = new java.net.URI("MinuteG(null <no signer certificates>)G", "/experiment/GBR", "Z", "1969-12-31T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: MinuteG(null <no signer certificates>)G:///experiment/GBRZ#1969-12-31T23:59:59.999Z");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime4 = localDateTime1.atOffset(zoneOffset3);
        int int5 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime7 = localDateTime1.minusNanos((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime9 = localDateTime1.withHour(256);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 256");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = chronoField0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getISO3Country();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField0.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Minute" + "'", str3, "Minute");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GBR" + "'", str4, "GBR");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime11.withLaterOffsetAtOverlap();
        java.time.LocalTime localTime13 = zonedDateTime11.toLocalTime();
        int int14 = zonedDateTime11.getMinute();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        java.nio.LongBuffer longBuffer4 = longBuffer2.put(0L);
        boolean boolean5 = longBuffer2.isDirect();
        long[] longArray8 = new long[] { 533000000, 16384 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer11 = longBuffer2.get(longArray8, 1024, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[533000000, 16384]");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.concat(longStream0, longStream1);
        java.util.function.LongPredicate longPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = longStream0.allMatch(longPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.ofLocale(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate6 = chronology2.date((int) (short) 1, (int) (short) 10, 1024);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 1024");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt((int) (byte) -1, 533000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.LocalTime localTime2 = java.time.LocalTime.now();
        int int3 = localTime2.getNano();
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        long long5 = localTime2.getLong((java.time.temporal.TemporalField) chronoField4);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.withSecond((int) (byte) 0);
        boolean boolean12 = chronoField4.isSupportedBy((java.time.temporal.TemporalAccessor) offsetDateTime9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant14 = instant1.with((java.time.temporal.TemporalField) chronoField4, (long) 999999999);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 999999999");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(localTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 312000000 + "'", int3 == 312000000);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField4.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 14L + "'", long5 == 14L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.OptionalInt optionalInt2 = intStream1.min();
        java.lang.String str3 = optionalInt2.toString();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MAX;
        java.time.LocalDate localDate5 = localDateTime4.toLocalDate();
        boolean boolean6 = optionalInt2.equals((java.lang.Object) localDate5);
        java.time.LocalTime localTime8 = java.time.LocalTime.NOON;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.temporal.TemporalUnit temporalUnit10 = chronoField9.getBaseUnit();
        boolean boolean11 = localTime8.isSupported(temporalUnit10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate12 = localDate5.plus((long) 1999999998, temporalUnit10);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Micros");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[10]" + "'", str3, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField9.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + temporalUnit10 + "' != '" + java.time.temporal.ChronoUnit.MICROS + "'", temporalUnit10.equals(java.time.temporal.ChronoUnit.MICROS));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        boolean boolean2 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        boolean boolean4 = localDate1.isSupported((java.time.temporal.TemporalField) chronoField3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.now();
        java.time.OffsetTime offsetTime7 = offsetTime5.withSecond(16);
        java.time.OffsetDateTime offsetDateTime8 = localDate1.atTime(offsetTime7);
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit11 = chronoField10.getBaseUnit();
        boolean boolean12 = temporalUnit11.isTimeBased();
        java.time.Duration duration13 = temporalUnit11.getDuration();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime14 = offsetDateTime8.plus(68618241259163000L, temporalUnit11);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 52454798466505");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField3.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit11 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit11.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        java.nio.LongBuffer longBuffer4 = longBuffer2.put(0L);
        java.lang.String str5 = longBuffer2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = longBuffer2.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.nio.ByteBufferAsLongBufferB[pos=1 lim=4 cap=4]" + "'", str5, "java.nio.ByteBufferAsLongBufferB[pos=1 lim=4 cap=4]");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "5");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(64);
        short[] shortArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer3 = shortBuffer1.put(shortArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortBuffer1);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        boolean boolean2 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime6 = localDateTime3.atOffset(zoneOffset5);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.withSecond((int) (byte) 0);
        java.time.LocalDate localDate9 = offsetDateTime6.toLocalDate();
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        boolean boolean11 = offsetDateTime6.isSupported((java.time.temporal.TemporalField) chronoField10);
        boolean boolean12 = localDate0.isSupported((java.time.temporal.TemporalField) chronoField10);
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime17 = localDateTime14.atOffset(zoneOffset16);
        int int18 = localDateTime13.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime22 = localDateTime19.atOffset(zoneOffset21);
        int int23 = localDateTime14.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime19);
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime28 = localDateTime25.atOffset(zoneOffset27);
        int int29 = localDateTime24.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime25);
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime33 = localDateTime30.atOffset(zoneOffset32);
        int int34 = localDateTime25.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime30);
        boolean boolean35 = localDateTime14.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime30);
        java.time.format.DateTimeFormatter dateTimeFormatter36 = java.time.format.DateTimeFormatter.ISO_DATE_TIME;
        java.lang.String str37 = localDateTime30.format(dateTimeFormatter36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = localDate0.format(dateTimeFormatter36);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: HourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField10.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+999999999-12-31T23:59:59.999999999" + "'", str37, "+999999999-12-31T23:59:59.999999999");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.concat(longStream0, longStream1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.LongSummaryStatistics longSummaryStatistics3 = longStream0.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setExecutable(true);
        java.time.Instant instant5 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant7 = instant5.minusNanos((long) 'a');
        int int8 = instant5.getNano();
        boolean boolean9 = file1.equals((java.lang.Object) instant5);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime7 = localDateTime4.atOffset(zoneOffset6);
        java.time.zone.ZoneRules zoneRules8 = zoneOffset6.getRules();
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset6);
        java.time.LocalDate localDate10 = java.time.LocalDate.now();
        java.time.LocalDate localDate11 = java.time.LocalDate.MIN;
        boolean boolean12 = localDate10.isEqual((java.time.chrono.ChronoLocalDate) localDate11);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        boolean boolean14 = localDate11.isSupported((java.time.temporal.TemporalField) chronoField13);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = instant1.get((java.time.temporal.TemporalField) chronoField13);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MinuteOfHour");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(zoneRules8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField13.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC;
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset1 = java.nio.charset.Charset.forName("Minute(null <no signer certificates>)");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Minute(null <no signer certificates>)");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime4 = localDateTime1.atOffset(zoneOffset3);
        int int5 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        int int10 = localDateTime1.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime15 = localDateTime12.atOffset(zoneOffset14);
        int int16 = localDateTime11.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime20 = localDateTime17.atOffset(zoneOffset19);
        int int21 = localDateTime12.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        boolean boolean22 = localDateTime1.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        java.time.DayOfWeek dayOfWeek23 = localDateTime17.getDayOfWeek();
        java.time.format.TextStyle textStyle24 = java.time.format.TextStyle.NARROW_STANDALONE;
        java.util.Locale locale25 = java.util.Locale.UK;
        java.lang.String str26 = locale25.getISO3Country();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.lang.String str28 = locale25.getDisplayScript(locale27);
        java.lang.String str29 = dayOfWeek23.getDisplayName(textStyle24, locale25);
        java.time.DayOfWeek dayOfWeek31 = dayOfWeek23.plus((long) 100);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + dayOfWeek23 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek23.equals(java.time.DayOfWeek.FRIDAY));
        org.junit.Assert.assertTrue("'" + textStyle24 + "' != '" + java.time.format.TextStyle.NARROW_STANDALONE + "'", textStyle24.equals(java.time.format.TextStyle.NARROW_STANDALONE));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GBR" + "'", str26, "GBR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "5" + "'", str29, "5");
        org.junit.Assert.assertTrue("'" + dayOfWeek31 + "' != '" + java.time.DayOfWeek.SUNDAY + "'", dayOfWeek31.equals(java.time.DayOfWeek.SUNDAY));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Hashtable<java.nio.file.Watchable, java.time.zone.ZoneOffsetTransitionRule.TimeDefinition> watchableMap1 = new java.util.Hashtable<java.nio.file.Watchable, java.time.zone.ZoneOffsetTransitionRule.TimeDefinition>(12);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.time.Period period1 = java.time.Period.ofWeeks((int) (byte) -1);
        java.time.Period period2 = period1.normalized();
        long long3 = period1.toTotalMonths();
        java.time.chrono.ChronoPeriod chronoPeriod5 = period1.multipliedBy((int) (short) 100);
        boolean boolean7 = chronoPeriod5.equals((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(chronoPeriod5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.security.InvalidKeyException invalidKeyException0 = new java.security.InvalidKeyException();
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime4 = localDateTime1.atOffset(zoneOffset3);
        int int5 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        int int10 = localDateTime1.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime15 = localDateTime12.atOffset(zoneOffset14);
        int int16 = localDateTime11.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime20 = localDateTime17.atOffset(zoneOffset19);
        int int21 = localDateTime12.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime26 = localDateTime23.atOffset(zoneOffset25);
        int int27 = localDateTime22.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime31 = localDateTime28.atOffset(zoneOffset30);
        int int32 = localDateTime23.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime28);
        boolean boolean33 = localDateTime12.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime28);
        java.time.temporal.Temporal temporal34 = localDateTime6.adjustInto((java.time.temporal.Temporal) localDateTime12);
        java.time.LocalDateTime localDateTime36 = localDateTime6.withYear((-999999999));
        java.time.LocalTime localTime37 = java.time.LocalTime.now();
        int int38 = localTime37.getNano();
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        long long40 = localTime37.getLong((java.time.temporal.TemporalField) chronoField39);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime42 = localDateTime36.with((java.time.temporal.TemporalField) chronoField39, 68618241259163000L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 68618241259163000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(offsetDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(temporal34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localTime37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 916000000 + "'", int38 == 916000000);
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField39.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 14L + "'", long40 == 14L);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Language();
        java.time.format.DecimalStyle decimalStyle2 = java.time.format.DecimalStyle.of(locale0);
        java.time.format.DecimalStyle decimalStyle4 = decimalStyle2.withPositiveSign('a');
        java.time.LocalDate localDate5 = java.time.LocalDate.now();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate5.isEqual((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        boolean boolean9 = localDate6.isSupported((java.time.temporal.TemporalField) chronoField8);
        boolean boolean10 = decimalStyle4.equals((java.lang.Object) localDate6);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate13 = localDate6.with((java.time.temporal.TemporalField) chronoField11, 100L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for AlignedDayOfWeekInMonth (valid values 1 - 7): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertNotNull(decimalStyle4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField8.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField11.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of(12, (-999999999), 1024, 413000000, 1999999998);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -999999999");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR", 1024);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR" + "'", str2, "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.concat(longStream0, longStream1);
        java.util.OptionalLong optionalLong3 = longStream2.findFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong4 = longStream2.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        java.nio.LongBuffer longBuffer4 = longBuffer2.put(0L);
        boolean boolean5 = longBuffer2.isDirect();
        long long6 = longBuffer2.get();
        java.nio.ByteOrder byteOrder7 = longBuffer2.order();
        java.nio.LongBuffer longBuffer9 = longBuffer2.put((long) 12);
        long[] longArray11 = new long[] { 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer14 = longBuffer9.put(longArray11, (int) (short) 0, 1999999998);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(longBuffer9);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[4]");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.OVERFLOW;
        boolean boolean1 = coderResult0.isMalformed();
        boolean boolean2 = coderResult0.isUnmappable();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = coderResult0.length();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(coderResult0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.fromMillis((long) 16384);
        org.junit.Assert.assertNotNull(fileTime1);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023" + "'", str1, "\\u0023");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        boolean boolean3 = intStream1.isParallel();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = intStream1.onClose(runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.Spliterator.OfInt ofInt2 = intStream1.spliterator();
        java.util.stream.IntStream intStream4 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.Spliterator.OfInt ofInt5 = intStream4.spliterator();
        java.util.stream.IntStream.Builder builder6 = java.util.stream.IntStream.builder();
        boolean boolean7 = ofInt5.tryAdvance((java.util.function.IntConsumer) builder6);
        // The following exception was thrown during execution in test generation
        try {
            intStream1.forEachOrdered((java.util.function.IntConsumer) builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(ofInt2);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(ofInt5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KOR" + "'", str1, "KOR");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.OffsetTime offsetTime2 = offsetTime0.withSecond(16);
        java.time.OffsetTime offsetTime4 = offsetTime2.plusNanos(1434414441700000L);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = offsetTime4.get((java.time.temporal.TemporalField) chronoField5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: AlignedWeekOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.time.format.FormatStyle formatStyle0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: dateStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.time.format.FormatStyle formatStyle0 = null;
        java.time.format.FormatStyle formatStyle1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle0, formatStyle1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: dateStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("MinuteG(null <no signer certificates>)G", (-999999999));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MinuteG(null <no signer certificates>)G" + "'", str2, "MinuteG(null <no signer certificates>)G");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption9 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray10 = new java.nio.file.OpenOption[] { linkOption7, linkOption8, linkOption9 };
        java.nio.channels.FileChannel fileChannel11 = java.nio.channels.FileChannel.open(path4, openOptionArray10);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer14 = byteBuffer13.asLongBuffer();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.duplicate();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer20 = byteBuffer19.asLongBuffer();
        float float22 = byteBuffer19.getFloat(4);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer19.putChar('\r');
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer27 = byteBuffer26.asLongBuffer();
        float float29 = byteBuffer26.getFloat(4);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer26.putChar('\r');
        boolean boolean32 = byteBuffer31.isDirect();
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.ByteBuffer[] byteBufferArray35 = new java.nio.ByteBuffer[] { byteBuffer15, byteBuffer17, byteBuffer24, byteBuffer31, byteBuffer34 };
        // The following exception was thrown during execution in test generation
        try {
            long long38 = fileChannel11.write(byteBufferArray35, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption9 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption9.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(longBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(longBuffer20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(longBuffer27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBufferArray35);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) 52);
        java.time.ZoneId zoneId2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime3 = instant1.atZone(zoneId2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption9 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray10 = new java.nio.file.OpenOption[] { linkOption7, linkOption8, linkOption9 };
        java.nio.channels.FileChannel fileChannel11 = java.nio.channels.FileChannel.open(path4, openOptionArray10);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer16 = byteBuffer15.asLongBuffer();
        float float18 = byteBuffer15.getFloat(4);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer15.putChar('\r');
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer23 = byteBuffer22.asLongBuffer();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.duplicate();
        java.nio.ByteBuffer[] byteBufferArray25 = new java.nio.ByteBuffer[] { byteBuffer13, byteBuffer20, byteBuffer22 };
        // The following exception was thrown during execution in test generation
        try {
            long long26 = fileChannel11.write(byteBufferArray25);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption9 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption9.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(longBuffer16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(longBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBufferArray25);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime5 = localDateTime2.atOffset(zoneOffset4);
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime11 = localDateTime8.atOffset(zoneOffset10);
        java.time.zone.ZoneRules zoneRules12 = zoneOffset10.getRules();
        java.time.ZonedDateTime zonedDateTime13 = offsetDateTime5.atZoneSameInstant((java.time.ZoneId) zoneOffset10);
        int int14 = zonedDateTime13.getDayOfMonth();
        java.time.ZonedDateTime zonedDateTime16 = zonedDateTime13.withDayOfYear(10);
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime22 = localDateTime19.atOffset(zoneOffset21);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset21);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit26 = chronoField25.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime27 = localDateTime23.minus((long) (-999999999), temporalUnit26);
        boolean boolean28 = zonedDateTime13.isSupported(temporalUnit26);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal29 = offsetTime0.minus((long) 399000000, temporalUnit26);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Weeks");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField25.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit26 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit26.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        boolean boolean2 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        int int3 = localDate1.getYear();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime7 = localDateTime4.atOffset(zoneOffset6);
        java.time.temporal.Temporal temporal8 = localDate1.adjustInto((java.time.temporal.Temporal) localDateTime4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000001");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-999999999) + "'", int3 == (-999999999));
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(temporal8);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException("US-ASCII");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.time.Period period1 = java.time.Period.ofDays((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("1969-12-31T23:59:59.999Z", "GBR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str2, "1969-12-31T23:59:59.999Z");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str1 = charset0.displayName();
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US-ASCII" + "'", str1, "US-ASCII");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.OffsetTime offsetTime2 = offsetTime0.withSecond(16);
        java.time.Instant instant4 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant6 = instant4.minusNanos((long) 'a');
        java.nio.file.attribute.FileTime fileTime7 = java.nio.file.attribute.FileTime.from(instant4);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery8 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period9 = instant4.query(periodTemporalQuery8);
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit11 = chronoField10.getBaseUnit();
        boolean boolean12 = instant4.isSupported(temporalUnit11);
        boolean boolean13 = offsetTime0.isSupported(temporalUnit11);
        java.time.Instant instant15 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant17 = instant15.minusNanos((long) 'a');
        java.nio.file.attribute.FileTime fileTime18 = java.nio.file.attribute.FileTime.from(instant15);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery19 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period20 = instant15.query(periodTemporalQuery19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit22 = chronoField21.getBaseUnit();
        boolean boolean23 = instant15.isSupported(temporalUnit22);
        java.time.Instant instant25 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant27 = instant25.minusNanos((long) 'a');
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime31 = localDateTime28.atOffset(zoneOffset30);
        java.time.zone.ZoneRules zoneRules32 = zoneOffset30.getRules();
        java.time.ZonedDateTime zonedDateTime33 = java.time.ZonedDateTime.ofInstant(instant25, (java.time.ZoneId) zoneOffset30);
        java.time.ZoneId zoneId34 = zonedDateTime33.getZone();
        java.time.Clock clock35 = java.time.Clock.fixed(instant15, zoneId34);
        boolean boolean36 = offsetTime0.equals((java.lang.Object) zoneId34);
        java.time.Instant instant39 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant41 = instant39.minusNanos((long) 'a');
        java.nio.file.attribute.FileTime fileTime42 = java.nio.file.attribute.FileTime.from(instant39);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery43 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period44 = instant39.query(periodTemporalQuery43);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit46 = chronoField45.getBaseUnit();
        boolean boolean47 = instant39.isSupported(temporalUnit46);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime48 = offsetTime0.plus(0L, temporalUnit46);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Weeks");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(fileTime7);
        org.junit.Assert.assertNotNull(periodTemporalQuery8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit11 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit11.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(fileTime18);
        org.junit.Assert.assertNotNull(periodTemporalQuery19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit22 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit22.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(offsetDateTime31);
        org.junit.Assert.assertNotNull(zoneRules32);
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertNotNull(clock35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(fileTime42);
        org.junit.Assert.assertNotNull(periodTemporalQuery43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField45.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit46 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit46.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.time.Instant instant2 = java.time.Instant.ofEpochSecond((long) 365, (long) 52);
        org.junit.Assert.assertNotNull(instant2);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime3 = java.time.LocalTime.of(16384, 10, (-7));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 16384");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.security.KeyException keyException1 = new java.security.KeyException("\\u0061");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_ORDINAL_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = java.time.LocalTime.parse((java.lang.CharSequence) "zh-CN", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'zh-CN' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.Spliterator.OfInt ofInt2 = intStream1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<? super java.lang.Integer> wildcardComparator3 = ofInt2.getComparator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(ofInt2);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.ofLocale(locale0);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime6 = localDateTime3.atOffset(zoneOffset5);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime12 = localDateTime9.atOffset(zoneOffset11);
        java.time.zone.ZoneRules zoneRules13 = zoneOffset11.getRules();
        java.time.ZonedDateTime zonedDateTime14 = offsetDateTime6.atZoneSameInstant((java.time.ZoneId) zoneOffset11);
        java.time.ZoneId zoneId15 = zonedDateTime14.getZone();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime16 = zonedDateTime14.withEarlierOffsetAtOverlap();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime20 = localDateTime17.atOffset(zoneOffset19);
        java.time.OffsetDateTime offsetDateTime22 = offsetDateTime20.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime26 = localDateTime23.atOffset(zoneOffset25);
        java.time.zone.ZoneRules zoneRules27 = zoneOffset25.getRules();
        java.time.ZonedDateTime zonedDateTime28 = offsetDateTime20.atZoneSameInstant((java.time.ZoneId) zoneOffset25);
        java.time.ZonedDateTime zonedDateTime29 = zonedDateTime28.withLaterOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        long long31 = zonedDateTime28.getLong((java.time.temporal.TemporalField) chronoField30);
        long long32 = zonedDateTime14.getLong((java.time.temporal.TemporalField) chronoField30);
        java.time.ZonedDateTime zonedDateTime34 = zonedDateTime14.minusSeconds((long) 999999999);
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime35 = chronology2.zonedDateTime((java.time.temporal.TemporalAccessor) zonedDateTime34);
        java.time.Instant instant37 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant39 = instant37.minusNanos((long) 'a');
        java.nio.file.attribute.FileTime fileTime40 = java.nio.file.attribute.FileTime.from(instant37);
        java.time.temporal.ChronoField chronoField41 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit42 = chronoField41.getBaseUnit();
        boolean boolean43 = temporalUnit42.isTimeBased();
        java.time.Duration duration44 = temporalUnit42.getDuration();
        // The following exception was thrown during execution in test generation
        try {
            long long45 = zonedDateTime34.until((java.time.temporal.Temporal) instant37, temporalUnit42);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 1970-01-01T00:00:32Z of type java.time.Instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(zoneRules13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(zoneRules27);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField30.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 999999999L + "'", long31 == 999999999L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 999999999L + "'", long32 == 999999999L);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime35);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(fileTime40);
        org.junit.Assert.assertTrue("'" + chronoField41 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField41.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit42 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit42.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(duration44);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime4 = localDateTime1.atOffset(zoneOffset3);
        int int5 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        int int10 = localDateTime1.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime15 = localDateTime12.atOffset(zoneOffset14);
        int int16 = localDateTime11.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime20 = localDateTime17.atOffset(zoneOffset19);
        int int21 = localDateTime12.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        boolean boolean22 = localDateTime1.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime27 = localDateTime24.atOffset(zoneOffset26);
        int int28 = localDateTime23.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime24);
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime32 = localDateTime29.atOffset(zoneOffset31);
        boolean boolean33 = localDateTime23.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime29);
        boolean boolean34 = localDateTime17.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime29);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime36 = localDateTime29.plusMinutes(32L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        java.time.LocalTime localTime2 = localTime0.plusHours(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime3 = java.time.chrono.ChronoLocalDateTime.from((java.time.temporal.TemporalAccessor) localTime2);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ChronoLocalDateTime from TemporalAccessor: class java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Language();
        java.time.format.DecimalStyle decimalStyle2 = java.time.format.DecimalStyle.of(locale0);
        java.time.format.DecimalStyle decimalStyle4 = decimalStyle2.withPositiveSign('a');
        char char5 = decimalStyle2.getNegativeSign();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertNotNull(decimalStyle4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '-' + "'", char5 == '-');
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        boolean boolean3 = intStream1.isParallel();
        java.util.stream.IntStream.Builder builder4 = java.util.stream.IntStream.builder();
        // The following exception was thrown during execution in test generation
        try {
            intStream1.forEachOrdered((java.util.function.IntConsumer) builder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble1 = doubleStream0.min();
        java.util.function.DoublePredicate doublePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = doubleStream0.filter(doublePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.concat(longStream0, longStream1);
        java.util.OptionalLong optionalLong3 = longStream2.findFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.util.LongSummaryStatistics longSummaryStatistics4 = longStream2.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("+999999999-12-31T23:59:59.999999999Z", '\n');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '+' + "'", char2 == '+');
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        java.time.Instant instant5 = instant3.minusMillis((long) 399000000);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime10 = localDateTime7.atOffset(zoneOffset9);
        java.time.OffsetDateTime offsetDateTime12 = offsetDateTime10.minusSeconds((long) (byte) 0);
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime10.minusYears((long) 722000000);
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime21 = localDateTime18.atOffset(zoneOffset20);
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset20);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit25 = chronoField24.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime26 = localDateTime22.minus((long) (-999999999), temporalUnit25);
        java.lang.String str27 = temporalUnit25.toString();
        java.time.OffsetDateTime offsetDateTime28 = offsetDateTime14.plus((long) (byte) 100, temporalUnit25);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant29 = instant3.minus((long) 256, temporalUnit25);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Weeks");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField24.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit25 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit25.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Weeks" + "'", str27, "Weeks");
        org.junit.Assert.assertNotNull(offsetDateTime28);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Minute", "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.security.ProtectionDomain[] protectionDomainArray0 = new java.security.ProtectionDomain[] {};
        java.security.AccessControlContext accessControlContext1 = new java.security.AccessControlContext(protectionDomainArray0);
        java.security.Permission permission2 = null;
        // The following exception was thrown during execution in test generation
        try {
            accessControlContext1.checkPermission(permission2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: permission can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(protectionDomainArray0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.Locale locale2 = new java.util.Locale("ZoneRules[currentStandardOffset=Z]", "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
        org.junit.Assert.assertEquals(locale2.toString(), "zonerules[currentstandardoffset=z]_VALUE(YEAR,4,10,EXCEEDS_PAD)'-'VALUE(MONTHOFYEAR,2)'-'VALUE(DAYOFMONTH,2)");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.time.ZoneOffset zoneOffset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.ofOffset("Weeks", zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.concat(longStream0, longStream1);
        java.util.OptionalLong optionalLong3 = longStream2.findFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble4 = longStream2.average();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character ? is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption9 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray10 = new java.nio.file.OpenOption[] { linkOption7, linkOption8, linkOption9 };
        java.nio.channels.FileChannel fileChannel11 = java.nio.channels.FileChannel.open(path4, openOptionArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel13 = fileChannel11.truncate(68618241259163000L);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption9 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption9.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        java.time.LocalTime localTime2 = localTime0.plusHours(0L);
        java.time.temporal.Temporal temporal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal4 = localTime0.adjustInto(temporal3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.WatchService watchService7 = null;
        java.nio.file.WatchEvent.Kind<?> wildcardKind8 = null;
        java.nio.file.WatchEvent.Kind[] kindArray10 = new java.nio.file.WatchEvent.Kind[1];
        @SuppressWarnings("unchecked")
        java.nio.file.WatchEvent.Kind<?>[] wildcardKindArray11 = (java.nio.file.WatchEvent.Kind<?>[]) kindArray10;
        wildcardKindArray11[0] = wildcardKind8;
        java.nio.file.WatchEvent.Modifier modifier14 = null;
        java.nio.file.WatchEvent.Modifier[] modifierArray15 = new java.nio.file.WatchEvent.Modifier[] { modifier14 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.WatchKey watchKey16 = path4.register(watchService7, wildcardKindArray11, modifierArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertNotNull(kindArray10);
        org.junit.Assert.assertNotNull(wildcardKindArray11);
        org.junit.Assert.assertNotNull(modifierArray15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption9 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray10 = new java.nio.file.OpenOption[] { linkOption7, linkOption8, linkOption9 };
        java.nio.channels.FileChannel fileChannel11 = java.nio.channels.FileChannel.open(path4, openOptionArray10);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer14 = byteBuffer13.asLongBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putLong((long) 829000000);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer19 = byteBuffer18.asLongBuffer();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.duplicate();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate(33237);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer25 = byteBuffer24.asLongBuffer();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.duplicate();
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer29 = byteBuffer28.asLongBuffer();
        float float31 = byteBuffer28.getFloat(4);
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer34 = byteBuffer33.asLongBuffer();
        java.nio.ByteBuffer[] byteBufferArray35 = new java.nio.ByteBuffer[] { byteBuffer16, byteBuffer18, byteBuffer22, byteBuffer24, byteBuffer28, byteBuffer33 };
        // The following exception was thrown during execution in test generation
        try {
            long long36 = fileChannel11.read(byteBufferArray35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Is a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption9 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption9.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(longBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(longBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(longBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(longBuffer29);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(longBuffer34);
        org.junit.Assert.assertNotNull(byteBufferArray35);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.of(999999999, 999999999, 256, (int) (byte) 1, 413000000, (int) (byte) 0, (-7));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 999999999");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.time.chrono.Chronology chronology1 = dateTimeFormatter0.getChronology();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor4 = dateTimeFormatter0.parse((java.lang.CharSequence) "hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.time.Duration duration0 = java.time.Duration.ZERO;
        long long1 = duration0.toDays();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.io.File file1 = new java.io.File("United Kingdom");
        boolean boolean2 = file1.isDirectory();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "eng", "MinuteOfHour");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = byteBuffer1.getChar(437000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        boolean boolean5 = file1.setWritable(true);
        java.lang.String str6 = file1.getPath();
        long long7 = file1.length();
        java.io.File file9 = new java.io.File("GBR");
        boolean boolean11 = file9.setExecutable(true);
        int int12 = file1.compareTo(file9);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GBR" + "'", str6, "GBR");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4096L + "'", long7 == 4096L);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        java.time.Instant instant5 = instant3.minusMillis((long) 399000000);
        java.util.Set<java.lang.String> strSet6 = java.time.ZoneId.getAvailableZoneIds();
        java.time.Month month7 = java.time.Month.OCTOBER;
        java.time.Month month9 = month7.plus(0L);
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime14 = localDateTime11.atOffset(zoneOffset13);
        int int15 = localDateTime10.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime11);
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime19 = localDateTime16.atOffset(zoneOffset18);
        int int20 = localDateTime11.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime16);
        java.time.temporal.Temporal temporal21 = month9.adjustInto((java.time.temporal.Temporal) localDateTime11);
        boolean boolean22 = strSet6.equals((java.lang.Object) month9);
        java.security.ProtectionDomain[] protectionDomainArray23 = new java.security.ProtectionDomain[] {};
        java.security.AccessControlContext accessControlContext24 = new java.security.AccessControlContext(protectionDomainArray23);
        java.time.LocalDate localDate25 = java.time.LocalDate.MIN;
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery26 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period27 = localDate25.query(periodTemporalQuery26);
        boolean boolean28 = accessControlContext24.equals((java.lang.Object) periodTemporalQuery26);
        java.time.Period period29 = month9.query(periodTemporalQuery26);
        java.time.Period period30 = instant5.query(periodTemporalQuery26);
        java.time.LocalDateTime localDateTime31 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime32 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime35 = localDateTime32.atOffset(zoneOffset34);
        int int36 = localDateTime31.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime32);
        java.time.LocalDateTime localDateTime37 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset39 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime40 = localDateTime37.atOffset(zoneOffset39);
        int int41 = localDateTime32.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime37);
        java.time.LocalDateTime localDateTime43 = localDateTime32.minusSeconds((long) 31);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal44 = instant5.adjustInto((java.time.temporal.Temporal) localDateTime43);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + month7 + "' != '" + java.time.Month.OCTOBER + "'", month7.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + month9 + "' != '" + java.time.Month.OCTOBER + "'", month9.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(temporal21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(protectionDomainArray23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(periodTemporalQuery26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(zoneOffset39);
        org.junit.Assert.assertNotNull(offsetDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        int int1 = localTime0.getNano();
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        long long3 = localTime0.getLong((java.time.temporal.TemporalField) chronoField2);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = chronoField2.checkValidValue((long) 10000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 10000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65000000 + "'", int1 == 65000000);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField2.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        boolean boolean2 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        int int3 = localDate1.getYear();
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate6 = localDate1.with((java.time.temporal.TemporalField) chronoField4, (-1L));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for AlignedWeekOfYear (valid values 1 - 53): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-999999999) + "'", int3 == (-999999999));
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.withSecond((int) (byte) 0);
        java.time.LocalDate localDate6 = offsetDateTime3.toLocalDate();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        boolean boolean8 = offsetDateTime3.isSupported((java.time.temporal.TemporalField) chronoField7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime10 = offsetDateTime3.withMonth((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField7.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.security.cert.CertificateEncodingException certificateEncodingException1 = new java.security.cert.CertificateEncodingException("GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR G...");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.NARROW;
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle0.equals(java.time.format.TextStyle.NARROW));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime11.withLaterOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        long long14 = zonedDateTime11.getLong((java.time.temporal.TemporalField) chronoField13);
        java.time.ZoneId zoneId15 = zonedDateTime11.getZone();
        java.time.ZonedDateTime zonedDateTime17 = zonedDateTime11.plusHours((long) (short) 0);
        java.time.LocalTime localTime18 = zonedDateTime17.toLocalTime();
        java.time.Duration duration21 = java.time.Duration.ofSeconds((long) 10, 0L);
        int int22 = duration21.getNano();
        java.time.Duration duration23 = duration21.abs();
        java.time.Duration duration24 = duration23.abs();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime25 = zonedDateTime17.plus((java.time.temporal.TemporalAmount) duration24);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField13.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 999999999L + "'", long14 == 999999999L);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        int int12 = zonedDateTime11.getDayOfMonth();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime11.withDayOfYear(10);
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime19 = localDateTime16.atOffset(zoneOffset18);
        java.time.OffsetDateTime offsetDateTime21 = offsetDateTime19.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime25 = localDateTime22.atOffset(zoneOffset24);
        java.time.zone.ZoneRules zoneRules26 = zoneOffset24.getRules();
        java.time.ZonedDateTime zonedDateTime27 = offsetDateTime19.atZoneSameInstant((java.time.ZoneId) zoneOffset24);
        java.time.ZonedDateTime zonedDateTime28 = zonedDateTime27.withLaterOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        java.time.temporal.ValueRange valueRange30 = zonedDateTime27.range((java.time.temporal.TemporalField) chronoField29);
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getBaseUnit();
        boolean boolean34 = temporalUnit33.isTimeBased();
        java.time.ZonedDateTime zonedDateTime35 = zonedDateTime27.minus(0L, temporalUnit33);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime36 = zonedDateTime11.plus((long) 12, temporalUnit33);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(zoneRules26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField29.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertNotNull(valueRange30);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField32.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zonedDateTime35);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("Minute");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'M' + "'", char1 == 'M');
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        float[] floatArray2 = new float[] { 16, 21 };
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.wrap(floatArray2);
        java.nio.FloatBuffer floatBuffer4 = floatBuffer3.compact();
        float[] floatArray6 = new float[] { '\n' };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer9 = floatBuffer3.get(floatArray6, (-1), 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 21.0]");
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0]");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Minute(null <no signer certificates>)", "\\u0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.Optional<java.time.chrono.IsoEra> isoEraOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(isoEraOptional0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer3 = java.nio.LongBuffer.wrap(longArray0, 12, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "eng");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Eng" + "'", str1, "Eng");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] { linkOption7, linkOption8 };
        java.nio.file.Path path10 = path4.toRealPath(linkOptionArray9);
        java.nio.file.WatchService watchService11 = null;
        java.nio.file.WatchEvent.Kind[] kindArray13 = new java.nio.file.WatchEvent.Kind[0];
        @SuppressWarnings("unchecked")
        java.nio.file.WatchEvent.Kind<?>[] wildcardKindArray14 = (java.nio.file.WatchEvent.Kind<?>[]) kindArray13;
        java.nio.file.WatchEvent.Modifier modifier15 = null;
        java.nio.file.WatchEvent.Modifier[] modifierArray16 = new java.nio.file.WatchEvent.Modifier[] { modifier15 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.WatchKey watchKey17 = path4.register(watchService11, (java.nio.file.WatchEvent.Kind<?>[]) kindArray13, modifierArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(linkOptionArray9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(kindArray13);
        org.junit.Assert.assertNotNull(wildcardKindArray14);
        org.junit.Assert.assertNotNull(modifierArray16);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours(1024);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 1024 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.function.LongUnaryOperator longUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream2 = java.util.stream.LongStream.iterate((long) 'M', longUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime1 = java.time.LocalTime.now();
        int int2 = localTime1.getNano();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        long long4 = localTime1.getLong((java.time.temporal.TemporalField) chronoField3);
        java.time.LocalTime localTime6 = localTime0.with((java.time.temporal.TemporalField) chronoField3, 0L);
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime13 = localDateTime10.atOffset(zoneOffset12);
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset12);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField16.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime18 = localDateTime14.minus((long) (-999999999), temporalUnit17);
        java.lang.String str19 = temporalUnit17.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime20 = localTime0.plus((long) 16, temporalUnit17);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Weeks");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 775000000 + "'", int2 == 775000000);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField3.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 14L + "'", long4 == 14L);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField16.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Weeks" + "'", str19, "Weeks");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] { linkOption7, linkOption8 };
        java.nio.file.Path path10 = path4.toRealPath(linkOptionArray9);
        java.io.File file12 = new java.io.File("GBR");
        boolean boolean13 = file12.mkdirs();
        java.nio.file.Path path14 = file12.toPath();
        java.nio.file.Path path15 = path14.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = path4.endsWith(path15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(linkOptionArray9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNull(path15);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime11.withLaterOffsetAtOverlap();
        java.time.temporal.TemporalUnit temporalUnit13 = null;
        boolean boolean14 = zonedDateTime12.isSupported(temporalUnit13);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period16 = zonedDateTime12.query(periodTemporalQuery15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble1 = doubleStream0.min();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble2 = doubleStream0.min();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange3 = java.time.temporal.ValueRange.of((long) 52, 32000L, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption9 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray10 = new java.nio.file.OpenOption[] { linkOption7, linkOption8, linkOption9 };
        java.nio.channels.FileChannel fileChannel11 = java.nio.channels.FileChannel.open(path4, openOptionArray10);
        java.nio.channels.FileChannel fileChannel13 = fileChannel11.position((long) 'x');
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer16 = byteBuffer15.asLongBuffer();
        short short17 = byteBuffer15.getShort();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.putChar('G');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = fileChannel13.write(byteBuffer15);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption9 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption9.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(longBuffer16);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.nativeOrder();
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.Instant instant5 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant7 = instant5.minusNanos((long) 'a');
        int int8 = instant5.getNano();
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime3.with((java.time.temporal.TemporalAdjuster) instant5);
        java.time.temporal.TemporalUnit temporalUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime12 = offsetDateTime3.plus(1L, temporalUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(offsetDateTime9);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_ORDINAL_DATE;
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getISO3Language();
        java.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withLocale(locale1);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.HOUR_OF_AMPM;
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MAX;
        java.time.LocalDate localDate6 = localDateTime5.toLocalDate();
        java.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks(0L);
        java.time.temporal.ValueRange valueRange9 = chronoField4.rangeRefinedBy((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.LocalTime localTime10 = localDateTime5.toLocalTime();
        java.nio.CharBuffer charBuffer12 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer13 = charBuffer12.flip();
        java.nio.CharBuffer charBuffer14 = charBuffer12.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.formatTo((java.time.temporal.TemporalAccessor) localDateTime5, (java.lang.Appendable) charBuffer14);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_AMPM + "'", chronoField4.equals(java.time.temporal.ChronoField.HOUR_OF_AMPM));
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(charBuffer12);
        org.junit.Assert.assertNotNull(buffer13);
        org.junit.Assert.assertNotNull(charBuffer14);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.withSecond((int) (byte) 0);
        java.time.OffsetTime offsetTime6 = offsetDateTime5.toOffsetTime();
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime13 = localDateTime10.atOffset(zoneOffset12);
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset12);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField16.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime18 = localDateTime14.minus((long) (-999999999), temporalUnit17);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime19 = offsetTime6.minus(32000L, temporalUnit17);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Weeks");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField16.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime18);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.time.Month month1 = java.time.Month.MARCH;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of(533000000, month1, 31, 12, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.MARCH + "'", month1.equals(java.time.Month.MARCH));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        double double1 = doubleStream0.sum();
        // The following exception was thrown during execution in test generation
        try {
            java.util.DoubleSummaryStatistics doubleSummaryStatistics2 = doubleStream0.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        int int12 = zonedDateTime11.getDayOfMonth();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime11.withDayOfYear(10);
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime18 = localDateTime15.atOffset(zoneOffset17);
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime18.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime24 = localDateTime21.atOffset(zoneOffset23);
        java.time.zone.ZoneRules zoneRules25 = zoneOffset23.getRules();
        java.time.ZonedDateTime zonedDateTime26 = offsetDateTime18.atZoneSameInstant((java.time.ZoneId) zoneOffset23);
        java.time.ZoneId zoneId27 = zonedDateTime26.getZone();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime28 = zonedDateTime26.withEarlierOffsetAtOverlap();
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime32 = localDateTime29.atOffset(zoneOffset31);
        java.time.OffsetDateTime offsetDateTime34 = offsetDateTime32.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset37 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime38 = localDateTime35.atOffset(zoneOffset37);
        java.time.zone.ZoneRules zoneRules39 = zoneOffset37.getRules();
        java.time.ZonedDateTime zonedDateTime40 = offsetDateTime32.atZoneSameInstant((java.time.ZoneId) zoneOffset37);
        java.time.ZonedDateTime zonedDateTime41 = zonedDateTime40.withLaterOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField42 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        long long43 = zonedDateTime40.getLong((java.time.temporal.TemporalField) chronoField42);
        long long44 = zonedDateTime26.getLong((java.time.temporal.TemporalField) chronoField42);
        int int45 = zonedDateTime14.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime26);
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit47 = chronoField46.getBaseUnit();
        java.time.temporal.ValueRange valueRange48 = zonedDateTime14.range((java.time.temporal.TemporalField) chronoField46);
        boolean boolean49 = valueRange48.isFixed();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(zoneRules25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(zoneOffset37);
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertNotNull(zoneRules39);
        org.junit.Assert.assertNotNull(zonedDateTime40);
        org.junit.Assert.assertNotNull(zonedDateTime41);
        org.junit.Assert.assertTrue("'" + chronoField42 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField42.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 999999999L + "'", long43 == 999999999L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 999999999L + "'", long44 == 999999999L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField46.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit47 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit47.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(valueRange48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.security.KeyException keyException1 = new java.security.KeyException("\\u0020");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Minute", 'x', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Minute" + "'", str3, "Minute");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "ISO");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'ISO' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption9 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray10 = new java.nio.file.OpenOption[] { linkOption7, linkOption8, linkOption9 };
        java.nio.channels.FileChannel fileChannel11 = java.nio.channels.FileChannel.open(path4, openOptionArray10);
        java.io.File file15 = new java.io.File("GBR");
        boolean boolean17 = file15.setWritable(true);
        java.nio.file.Path path18 = file15.toPath();
        java.nio.file.Path path20 = path18.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption21 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption22 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption23 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray24 = new java.nio.file.OpenOption[] { linkOption21, linkOption22, linkOption23 };
        java.nio.channels.FileChannel fileChannel25 = java.nio.channels.FileChannel.open(path18, openOptionArray24);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = fileChannel11.transferTo((long) 23, (long) (short) 0, (java.nio.channels.WritableByteChannel) fileChannel25);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption9 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption9.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(path18);
        org.junit.Assert.assertNotNull(path20);
        org.junit.Assert.assertTrue("'" + linkOption21 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption21.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption22 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption22.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption23 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption23.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray24);
        org.junit.Assert.assertNotNull(fileChannel25);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("zonerules[currentstandardoffset=z]", "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zonerules[currentstandardoffset=z]" + "'", str2, "zonerules[currentstandardoffset=z]");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.parse((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("hi!", "GBR", 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from(instant1);
        java.time.Instant instant6 = instant1.plusMillis((long) 10);
        java.time.Instant instant8 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant10 = instant8.minusNanos((long) 'a');
        java.nio.file.attribute.FileTime fileTime11 = java.nio.file.attribute.FileTime.from(instant8);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery12 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period13 = instant8.query(periodTemporalQuery12);
        java.time.Period period14 = instant6.query(periodTemporalQuery12);
        java.time.Period period16 = period14.withDays(10000);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(fileTime4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(fileTime11);
        org.junit.Assert.assertNotNull(periodTemporalQuery12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.ofNanoOfDay((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for NanoOfDay (valid values 0 - 86399999999999): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress[] inetAddressArray1 = java.net.InetAddress.getAllByName("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.net.URL uRL0 = null;
        java.security.CodeSigner[] codeSignerArray1 = new java.security.CodeSigner[] {};
        java.security.CodeSource codeSource2 = new java.security.CodeSource(uRL0, codeSignerArray1);
        boolean boolean4 = codeSource2.equals((java.lang.Object) 4);
        java.lang.String str5 = codeSource2.toString();
        boolean boolean7 = codeSource2.equals((java.lang.Object) " ");
        org.junit.Assert.assertNotNull(codeSignerArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(null <no signer certificates>)" + "'", str5, "(null <no signer certificates>)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        boolean boolean5 = file1.setWritable(true);
        java.net.URI uRI6 = file1.toURI();
        java.io.File file8 = new java.io.File("GBR");
        boolean boolean10 = file8.setWritable(true);
        boolean boolean12 = file8.setWritable(true);
        java.net.URI uRI13 = file8.toURI();
        java.net.URI uRI14 = uRI6.relativize(uRI13);
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime19 = localDateTime16.atOffset(zoneOffset18);
        int int20 = localDateTime15.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime16);
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime24 = localDateTime21.atOffset(zoneOffset23);
        boolean boolean25 = localDateTime15.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime21);
        boolean boolean26 = uRI14.equals((java.lang.Object) localDateTime15);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(uRI13);
        org.junit.Assert.assertNotNull(uRI14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime5 = localDateTime2.atOffset(zoneOffset4);
        int int6 = localDateTime1.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime2);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime10 = localDateTime7.atOffset(zoneOffset9);
        int int11 = localDateTime2.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime16 = localDateTime13.atOffset(zoneOffset15);
        int int17 = localDateTime12.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime13);
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime21 = localDateTime18.atOffset(zoneOffset20);
        int int22 = localDateTime13.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime27 = localDateTime24.atOffset(zoneOffset26);
        int int28 = localDateTime23.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime24);
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime32 = localDateTime29.atOffset(zoneOffset31);
        int int33 = localDateTime24.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime29);
        boolean boolean34 = localDateTime13.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime29);
        java.time.temporal.Temporal temporal35 = localDateTime7.adjustInto((java.time.temporal.Temporal) localDateTime13);
        java.time.LocalDateTime localDateTime37 = localDateTime7.minusWeeks((long) (short) 0);
        java.time.Month month38 = localDateTime37.getMonth();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate40 = java.time.LocalDate.of((-7), month38, 999999999);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 999999999");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(temporal35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + month38 + "' != '" + java.time.Month.DECEMBER + "'", month38.equals(java.time.Month.DECEMBER));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.Comparator<java.time.OffsetDateTime> offsetDateTimeComparator0 = java.time.OffsetDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(offsetDateTimeComparator0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.time.LocalDate localDate2 = java.time.LocalDate.ofYearDay((int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate4 = localDate2.plusMonths(57632000000000L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 4802666666665");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'G', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime5 = localDateTime2.atOffset(zoneOffset4);
        java.time.Clock clock6 = java.time.Clock.fixed(instant1, (java.time.ZoneId) zoneOffset4);
        java.time.LocalTime localTime7 = java.time.LocalTime.now(clock6);
        java.time.LocalTime localTime9 = localTime7.plusMinutes((long) 10);
        java.time.Instant instant12 = java.time.Instant.ofEpochSecond((long) (short) 10, (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal13 = localTime9.adjustInto((java.time.temporal.Temporal) instant12);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(instant12);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        boolean boolean3 = intStream1.isParallel();
        java.util.stream.IntStream intStream4 = intStream1.parallel();
        java.util.function.IntPredicate intPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = intStream1.allMatch(intPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.HOUR_OF_AMPM;
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        java.time.LocalDate localDate3 = localDateTime2.toLocalDate();
        java.time.LocalDateTime localDateTime5 = localDateTime2.plusWeeks(0L);
        java.time.temporal.ValueRange valueRange6 = chronoField1.rangeRefinedBy((java.time.temporal.TemporalAccessor) localDateTime2);
        int int7 = localTime0.get((java.time.temporal.TemporalField) chronoField1);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime11 = localDateTime8.atOffset(zoneOffset10);
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTime11.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime17 = localDateTime14.atOffset(zoneOffset16);
        java.time.zone.ZoneRules zoneRules18 = zoneOffset16.getRules();
        java.time.ZonedDateTime zonedDateTime19 = offsetDateTime11.atZoneSameInstant((java.time.ZoneId) zoneOffset16);
        int int20 = zonedDateTime19.getDayOfMonth();
        int int21 = zonedDateTime19.getMinute();
        java.time.LocalDateTime localDateTime22 = zonedDateTime19.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime24 = chronoField1.adjustInto((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime22, 57632000000000L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfAmPm (valid values 0 - 11): 57632000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_AMPM + "'", chronoField1.equals(java.time.temporal.ChronoField.HOUR_OF_AMPM));
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(valueRange6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneRules18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 31 + "'", int20 == 31);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.OffsetTime offsetTime2 = offsetTime0.withSecond(16);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        int int4 = offsetTime2.get((java.time.temporal.TemporalField) chronoField3);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        int int10 = localDateTime5.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime14 = localDateTime11.atOffset(zoneOffset13);
        int int15 = localDateTime6.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime11);
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime20 = localDateTime17.atOffset(zoneOffset19);
        int int21 = localDateTime16.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime25 = localDateTime22.atOffset(zoneOffset24);
        int int26 = localDateTime17.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime22);
        boolean boolean27 = localDateTime6.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime22);
        java.time.DayOfWeek dayOfWeek28 = localDateTime22.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal29 = offsetTime2.adjustInto((java.time.temporal.Temporal) localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField3.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + dayOfWeek28 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek28.equals(java.time.DayOfWeek.FRIDAY));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer2 = charBuffer1.flip();
        int int3 = charBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer7 = charBuffer1.put("GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR G...", 14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("eng", "Weeks", "java.nio.ByteBufferAsLongBufferB[pos=1 lim=4 cap=4]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.ofLocale(locale0);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime6 = localDateTime3.atOffset(zoneOffset5);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime12 = localDateTime9.atOffset(zoneOffset11);
        java.time.zone.ZoneRules zoneRules13 = zoneOffset11.getRules();
        java.time.ZonedDateTime zonedDateTime14 = offsetDateTime6.atZoneSameInstant((java.time.ZoneId) zoneOffset11);
        java.time.ZoneId zoneId15 = zonedDateTime14.getZone();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime16 = zonedDateTime14.withEarlierOffsetAtOverlap();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime20 = localDateTime17.atOffset(zoneOffset19);
        java.time.OffsetDateTime offsetDateTime22 = offsetDateTime20.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime26 = localDateTime23.atOffset(zoneOffset25);
        java.time.zone.ZoneRules zoneRules27 = zoneOffset25.getRules();
        java.time.ZonedDateTime zonedDateTime28 = offsetDateTime20.atZoneSameInstant((java.time.ZoneId) zoneOffset25);
        java.time.ZonedDateTime zonedDateTime29 = zonedDateTime28.withLaterOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        long long31 = zonedDateTime28.getLong((java.time.temporal.TemporalField) chronoField30);
        long long32 = zonedDateTime14.getLong((java.time.temporal.TemporalField) chronoField30);
        java.time.ZonedDateTime zonedDateTime34 = zonedDateTime14.minusSeconds((long) 999999999);
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime35 = chronology2.zonedDateTime((java.time.temporal.TemporalAccessor) zonedDateTime34);
        boolean boolean37 = chronology2.isLeapYear((long) 'G');
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime42 = localDateTime39.atOffset(zoneOffset41);
        int int43 = localDateTime38.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime39);
        java.time.LocalDateTime localDateTime44 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset46 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime47 = localDateTime44.atOffset(zoneOffset46);
        int int48 = localDateTime39.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime44);
        java.time.LocalDateTime localDateTime49 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime50 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset52 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime53 = localDateTime50.atOffset(zoneOffset52);
        int int54 = localDateTime49.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime50);
        java.time.LocalDateTime localDateTime55 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime58 = localDateTime55.atOffset(zoneOffset57);
        int int59 = localDateTime50.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime55);
        boolean boolean60 = localDateTime39.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime55);
        java.time.DayOfWeek dayOfWeek61 = localDateTime55.getDayOfWeek();
        java.time.format.TextStyle textStyle62 = java.time.format.TextStyle.NARROW_STANDALONE;
        java.util.Locale locale63 = java.util.Locale.UK;
        java.lang.String str64 = locale63.getISO3Country();
        java.util.Locale locale65 = java.util.Locale.CHINA;
        java.lang.String str66 = locale63.getDisplayScript(locale65);
        java.lang.String str67 = dayOfWeek61.getDisplayName(textStyle62, locale63);
        java.util.Locale locale68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = chronology2.getDisplayName(textStyle62, locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: locale");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(zoneRules13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(zoneRules27);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField30.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 999999999L + "'", long31 == 999999999L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 999999999L + "'", long32 == 999999999L);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertNotNull(offsetDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(zoneOffset46);
        org.junit.Assert.assertNotNull(offsetDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(zoneOffset52);
        org.junit.Assert.assertNotNull(offsetDateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertNotNull(offsetDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + dayOfWeek61 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek61.equals(java.time.DayOfWeek.FRIDAY));
        org.junit.Assert.assertTrue("'" + textStyle62 + "' != '" + java.time.format.TextStyle.NARROW_STANDALONE + "'", textStyle62.equals(java.time.format.TextStyle.NARROW_STANDALONE));
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "GBR" + "'", str64, "GBR");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "5" + "'", str67, "5");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.HOUR_OF_AMPM;
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        java.time.LocalDate localDate3 = localDateTime2.toLocalDate();
        java.time.LocalDateTime localDateTime5 = localDateTime2.plusWeeks(0L);
        java.time.temporal.ValueRange valueRange6 = chronoField1.rangeRefinedBy((java.time.temporal.TemporalAccessor) localDateTime2);
        boolean boolean7 = localDate0.equals((java.lang.Object) valueRange6);
        java.time.LocalDate localDate8 = java.time.LocalDate.now();
        java.time.LocalDate localDate9 = java.time.LocalDate.MIN;
        boolean boolean10 = localDate8.isEqual((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        boolean boolean12 = localDate9.isSupported((java.time.temporal.TemporalField) chronoField11);
        int int13 = localDate9.getDayOfYear();
        java.time.Period period14 = java.time.Period.between(localDate0, localDate9);
        java.time.format.DateTimeFormatter dateTimeFormatter15 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.lang.String str16 = dateTimeFormatter15.toString();
        java.lang.String str17 = localDate0.format(dateTimeFormatter15);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = localDate0.atTime((int) 'x', 4096, 31, (int) '\uffff');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 120");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_AMPM + "'", chronoField1.equals(java.time.temporal.ChronoField.HOUR_OF_AMPM));
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(valueRange6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField11.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)" + "'", str16, "Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-999999999-01-01" + "'", str17, "-999999999-01-01");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.ofLocale(locale0);
        java.lang.String str3 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "+999999999-12-31T23:59:59.999999999");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.nio.channels.AsynchronousCloseException asynchronousCloseException0 = new java.nio.channels.AsynchronousCloseException();
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (short) 10);
        java.util.stream.Stream<java.lang.Integer> intStream2 = intStream1.boxed();
        java.util.stream.Stream<java.lang.Integer> intStream3 = intStream2.distinct();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.parse((java.lang.CharSequence) "/experiment/GBR");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '/experiment/GBR' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.withSecond((int) (byte) 0);
        int int6 = offsetDateTime5.getMinute();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime8 = offsetDateTime5.plusMonths(14L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000001");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("MINUTE", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: MINUTE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.concat(longStream0, longStream1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong3 = longStream1.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.function.LongUnaryOperator longUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream2 = java.util.stream.LongStream.iterate((long) (-999999999), longUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter3 = java.time.format.DateTimeFormatter.ofPattern("Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Pattern letter count must be 2: V");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("/experiment/GBR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: /experiment/GBR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.net.URL uRL0 = null;
        java.security.CodeSigner[] codeSignerArray1 = new java.security.CodeSigner[] {};
        java.security.CodeSource codeSource2 = new java.security.CodeSource(uRL0, codeSignerArray1);
        java.security.PermissionCollection permissionCollection3 = null;
        java.lang.ClassLoader classLoader4 = null;
        java.security.Principal principal5 = null;
        java.security.Principal[] principalArray6 = new java.security.Principal[] { principal5 };
        java.security.ProtectionDomain protectionDomain7 = new java.security.ProtectionDomain(codeSource2, permissionCollection3, classLoader4, principalArray6);
        java.security.Principal[] principalArray8 = protectionDomain7.getPrincipals();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) principalArray8, "\\u0020", 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeSignerArray1);
        org.junit.Assert.assertNotNull(principalArray6);
        org.junit.Assert.assertNotNull(principalArray8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream2 = doubleStream0.skip((long) (byte) 10);
        java.util.DoubleSummaryStatistics doubleSummaryStatistics3 = new java.util.DoubleSummaryStatistics();
        double double4 = doubleSummaryStatistics3.getSum();
        double double5 = doubleSummaryStatistics3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            doubleStream0.forEach((java.util.function.DoubleConsumer) doubleSummaryStatistics3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertEquals(doubleSummaryStatistics3.toString(), "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI5 = new java.net.URI("ISO", "English (United Kingdom)", "English (United Kingdom)", "1969-12-31T23:59:59.999Z", "MinuteG(null <no signer certificates>)G");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: ISO://English%20(United%20Kingdom)English%20(United%20Kingdom)?1969-12-31T23:59:59.999Z#MinuteG(null%20%3Cno%20signer%20certificates%3E)G");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap1 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime6 = localDateTime3.atOffset(zoneOffset5);
        java.time.zone.ZoneRules zoneRules7 = zoneOffset5.getRules();
        java.time.zone.ZoneRules zoneRules8 = zoneIdMap1.getOrDefault((java.lang.Object) 1.0d, zoneRules7);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime14 = localDateTime11.atOffset(zoneOffset13);
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset13);
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap17 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime22 = localDateTime19.atOffset(zoneOffset21);
        java.time.zone.ZoneRules zoneRules23 = zoneOffset21.getRules();
        java.time.zone.ZoneRules zoneRules24 = zoneIdMap17.getOrDefault((java.lang.Object) 1.0d, zoneRules23);
        java.lang.String str25 = zoneRules23.toString();
        java.util.List<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList26 = zoneRules23.getTransitions();
        java.time.zone.ZoneRules zoneRules27 = zoneIdMap1.putIfAbsent((java.time.ZoneId) zoneOffset13, zoneRules23);
        java.util.Enumeration<java.time.zone.ZoneRules> zoneRulesEnumeration28 = zoneIdMap1.elements();
        java.util.Enumeration<java.time.ZoneId> zoneIdEnumeration29 = zoneIdMap1.keys();
        java.time.ZoneId zoneId30 = zoneIdEnumeration29.nextElement();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(zoneRules7);
        org.junit.Assert.assertNotNull(zoneRules8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(zoneRules23);
        org.junit.Assert.assertNotNull(zoneRules24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ZoneRules[currentStandardOffset=Z]" + "'", str25, "ZoneRules[currentStandardOffset=Z]");
        org.junit.Assert.assertNotNull(zoneOffsetTransitionList26);
        org.junit.Assert.assertNull(zoneRules27);
        org.junit.Assert.assertNotNull(zoneRulesEnumeration28);
        org.junit.Assert.assertNotNull(zoneIdEnumeration29);
        org.junit.Assert.assertNotNull(zoneId30);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("English (United Kingdom)", "ISO", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English (United Kingdom)" + "'", str3, "English (United Kingdom)");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap1 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap5 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime10 = localDateTime7.atOffset(zoneOffset9);
        java.time.zone.ZoneRules zoneRules11 = zoneOffset9.getRules();
        java.time.zone.ZoneRules zoneRules12 = zoneIdMap5.getOrDefault((java.lang.Object) 1.0d, zoneRules11);
        java.time.zone.ZoneRules zoneRules13 = zoneIdMap1.put((java.time.ZoneId) zoneOffset3, zoneRules11);
        java.time.Instant instant15 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime19 = localDateTime16.atOffset(zoneOffset18);
        java.time.Clock clock20 = java.time.Clock.fixed(instant15, (java.time.ZoneId) zoneOffset18);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime26 = localDateTime23.atOffset(zoneOffset25);
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset25);
        java.time.zone.ZoneRules zoneRules28 = zoneOffset25.getRules();
        java.time.LocalDateTime localDateTime31 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset33 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime34 = localDateTime31.atOffset(zoneOffset33);
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset33);
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition36 = zoneRules28.getTransition(localDateTime35);
        java.time.zone.ZoneRules zoneRules37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = zoneIdMap1.replace((java.time.ZoneId) zoneOffset18, zoneRules28, zoneRules37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNull(zoneRules13);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(clock20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(zoneRules28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNull(zoneOffsetTransition36);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.OVERFLOW;
        boolean boolean1 = coderResult0.isMalformed();
        boolean boolean2 = coderResult0.isUnmappable();
        // The following exception was thrown during execution in test generation
        try {
            coderResult0.throwException();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(coderResult0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(64);
        short[] shortArray2 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer5 = shortBuffer1.get(shortArray2, 4096, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortBuffer1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.security.NoSuchProviderException noSuchProviderException1 = new java.security.NoSuchProviderException("(null <no signer certificates>)");
        java.util.concurrent.ExecutionException executionException2 = new java.util.concurrent.ExecutionException((java.lang.Throwable) noSuchProviderException1);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        float float4 = byteBuffer1.getFloat(4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putChar('\r');
        boolean boolean7 = byteBuffer6.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            char char9 = byteBuffer6.getChar((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(64);
        java.nio.ShortBuffer shortBuffer2 = shortBuffer1.compact();
        java.nio.ShortBuffer shortBuffer3 = shortBuffer2.compact();
        // The following exception was thrown during execution in test generation
        try {
            short short5 = shortBuffer3.get(999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 999999999");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR ...' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption9 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray10 = new java.nio.file.OpenOption[] { linkOption7, linkOption8, linkOption9 };
        java.nio.channels.FileChannel fileChannel11 = java.nio.channels.FileChannel.open(path4, openOptionArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.FileLock fileLock15 = fileChannel11.tryLock((long) 12, (long) 365, false);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption9 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption9.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ISO", 274);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISO" + "'", str2, "ISO");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.concat(longStream0, longStream1);
        java.util.stream.LongStream longStream3 = longStream0.unordered();
        // The following exception was thrown during execution in test generation
        try {
            java.util.LongSummaryStatistics longSummaryStatistics4 = longStream3.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        boolean boolean2 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        boolean boolean4 = localDate1.isSupported((java.time.temporal.TemporalField) chronoField3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.now();
        java.time.OffsetTime offsetTime7 = offsetTime5.withSecond(16);
        java.time.OffsetDateTime offsetDateTime8 = localDate1.atTime(offsetTime7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.withHour((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField3.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime4 = localDateTime1.atOffset(zoneOffset3);
        int int5 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        int int10 = localDateTime1.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime15 = localDateTime12.atOffset(zoneOffset14);
        int int16 = localDateTime11.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime20 = localDateTime17.atOffset(zoneOffset19);
        int int21 = localDateTime12.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime26 = localDateTime23.atOffset(zoneOffset25);
        int int27 = localDateTime22.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime31 = localDateTime28.atOffset(zoneOffset30);
        int int32 = localDateTime23.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime28);
        boolean boolean33 = localDateTime12.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime28);
        java.time.temporal.Temporal temporal34 = localDateTime6.adjustInto((java.time.temporal.Temporal) localDateTime12);
        java.lang.String str35 = localDateTime6.toString();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.MAX;
        java.time.LocalDate localDate37 = localDateTime36.toLocalDate();
        java.time.LocalDateTime localDateTime39 = localDateTime36.plusWeeks(0L);
        int int40 = localDateTime6.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime39);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime42 = localDateTime6.withDayOfYear(1999999998);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 1999999998");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(offsetDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(temporal34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+999999999-12-31T23:59:59.999999999" + "'", str35, "+999999999-12-31T23:59:59.999999999");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        long long0 = java.security.Key.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 6603384152749567654L + "'", long0 == 6603384152749567654L);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.Set<java.lang.String> strSet1 = java.time.ZoneId.getAvailableZoneIds();
        java.time.Month month2 = java.time.Month.OCTOBER;
        java.time.Month month4 = month2.plus(0L);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        int int10 = localDateTime5.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime14 = localDateTime11.atOffset(zoneOffset13);
        int int15 = localDateTime6.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime11);
        java.time.temporal.Temporal temporal16 = month4.adjustInto((java.time.temporal.Temporal) localDateTime6);
        boolean boolean17 = strSet1.equals((java.lang.Object) month4);
        int int18 = month4.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.of(0, month4, (int) '\r', 413000000, 227000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 413000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.OCTOBER + "'", month2.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.OCTOBER + "'", month4.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(temporal16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.time.Month month0 = java.time.Month.OCTOBER;
        java.time.Month month2 = month0.plus(0L);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime7 = localDateTime4.atOffset(zoneOffset6);
        int int8 = localDateTime3.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime4);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime12 = localDateTime9.atOffset(zoneOffset11);
        int int13 = localDateTime4.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.temporal.Temporal temporal14 = month2.adjustInto((java.time.temporal.Temporal) localDateTime4);
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MAX;
        java.time.LocalDate localDate16 = localDateTime15.toLocalDate();
        java.time.LocalDateTime localDateTime18 = localDateTime15.plusWeeks(0L);
        boolean boolean19 = localDateTime4.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime15);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime21 = localDateTime15.plusDays(100L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.OCTOBER + "'", month0.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.OCTOBER + "'", month2.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(temporal14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.time.Duration duration0 = java.time.Duration.ZERO;
        boolean boolean2 = duration0.equals((java.lang.Object) (short) 0);
        java.time.Duration duration3 = duration0.abs();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList4 = duration0.getUnits();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(temporalUnitList4);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e0b\u5348\u65f6\u5206\u79d2");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.security.KeyException keyException2 = new java.security.KeyException();
        java.security.SignatureException signatureException3 = new java.security.SignatureException((java.lang.Throwable) keyException2);
        java.security.cert.CertificateException certificateException4 = new java.security.cert.CertificateException(":", (java.lang.Throwable) signatureException3);
        java.io.IOException iOException5 = new java.io.IOException(" ", (java.lang.Throwable) certificateException4);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByName("etuniM");
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        java.time.Month month1 = java.time.Month.OCTOBER;
        java.time.Month month3 = month1.plus(0L);
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime8 = localDateTime5.atOffset(zoneOffset7);
        int int9 = localDateTime4.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime5);
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime13 = localDateTime10.atOffset(zoneOffset12);
        int int14 = localDateTime5.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime10);
        java.time.temporal.Temporal temporal15 = month3.adjustInto((java.time.temporal.Temporal) localDateTime5);
        boolean boolean16 = strSet0.equals((java.lang.Object) month3);
        int int17 = month3.getValue();
        int int19 = month3.firstDayOfYear(false);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        boolean boolean21 = month3.isSupported((java.time.temporal.TemporalField) chronoField20);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.OCTOBER + "'", month1.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + month3 + "' != '" + java.time.Month.OCTOBER + "'", month3.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(temporal15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 274 + "'", int19 == 274);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField20.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption9 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray10 = new java.nio.file.OpenOption[] { linkOption7, linkOption8, linkOption9 };
        java.nio.channels.FileChannel fileChannel11 = java.nio.channels.FileChannel.open(path4, openOptionArray10);
        fileChannel11.close();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.FileLock fileLock13 = fileChannel11.tryLock();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption9 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption9.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        boolean boolean1 = chronoField0.isTimeBased();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.lang3.StringUtils stringUtils0 = new org.apache.commons.lang3.StringUtils();
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime4 = localDateTime1.atOffset(zoneOffset3);
        int int5 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        int int10 = localDateTime1.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime15 = localDateTime12.atOffset(zoneOffset14);
        int int16 = localDateTime11.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime20 = localDateTime17.atOffset(zoneOffset19);
        int int21 = localDateTime12.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        boolean boolean22 = localDateTime1.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime24 = localDateTime1.withSecond(794000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 794000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("MINUTE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MINUTE" + "'", str1, "MINUTE");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.net.URI uRI1 = new java.net.URI("Z");
        java.lang.String str2 = uRI1.getRawUserInfo();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        java.nio.file.Path path4 = file1.toPath();
        java.nio.file.Path path6 = path4.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption7 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption8 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption9 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray10 = new java.nio.file.OpenOption[] { linkOption7, linkOption8, linkOption9 };
        java.nio.channels.FileChannel fileChannel11 = java.nio.channels.FileChannel.open(path4, openOptionArray10);
        java.io.File file13 = new java.io.File("GBR");
        boolean boolean15 = file13.setWritable(true);
        java.nio.file.Path path16 = file13.toPath();
        java.nio.file.Path path18 = path16.resolveSibling("ZoneRules[currentStandardOffset=Z]");
        java.nio.file.LinkOption linkOption19 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption20 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.LinkOption linkOption21 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        java.nio.file.OpenOption[] openOptionArray22 = new java.nio.file.OpenOption[] { linkOption19, linkOption20, linkOption21 };
        java.nio.channels.FileChannel fileChannel23 = java.nio.channels.FileChannel.open(path16, openOptionArray22);
        java.nio.channels.FileChannel fileChannel25 = fileChannel23.position((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            long long28 = fileChannel11.transferFrom((java.nio.channels.ReadableByteChannel) fileChannel23, (long) 413000000, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertTrue("'" + linkOption7 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption7.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption8 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption8.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption9 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption9.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(path18);
        org.junit.Assert.assertTrue("'" + linkOption19 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption19.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption20 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption20.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertTrue("'" + linkOption21 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption21.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
        org.junit.Assert.assertNotNull(openOptionArray22);
        org.junit.Assert.assertNotNull(fileChannel23);
        org.junit.Assert.assertNotNull(fileChannel25);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        boolean boolean2 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        boolean boolean4 = localDate1.isSupported((java.time.temporal.TemporalField) chronoField3);
        int int5 = localDate1.getDayOfYear();
        java.time.temporal.TemporalUnit temporalUnit6 = null;
        boolean boolean7 = localDate1.isSupported(temporalUnit6);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal10 = localDate1.with((java.time.temporal.TemporalField) chronoField8, (long) 829000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for AlignedDayOfWeekInMonth (valid values 1 - 7): 829000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField3.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField8.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "(null <no signer certificates>)", "(null <no signer certificates>)", "Minute", "Minute", "(null <no signer certificates>)" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList11);
        java.util.Iterator<java.lang.String> strItor14 = strList11.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.time.Duration duration1 = java.time.Duration.ofMillis((long) 399000000);
        java.time.Duration duration4 = java.time.Duration.ofSeconds((long) 10, 0L);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList5 = duration4.getUnits();
        java.time.Duration duration6 = duration1.minus(duration4);
        java.time.Duration duration8 = duration1.plusNanos((long) 722000000);
        java.time.Duration duration10 = duration1.withNanos(413000000);
        java.lang.Object obj11 = null;
        boolean boolean12 = duration10.equals(obj11);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(temporalUnitList5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.HOUR_OF_AMPM;
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        java.time.LocalDate localDate3 = localDateTime2.toLocalDate();
        java.time.LocalDateTime localDateTime5 = localDateTime2.plusWeeks(0L);
        java.time.temporal.ValueRange valueRange6 = chronoField1.rangeRefinedBy((java.time.temporal.TemporalAccessor) localDateTime2);
        boolean boolean7 = localDate0.equals((java.lang.Object) valueRange6);
        java.time.temporal.TemporalUnit temporalUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate10 = localDate0.minus((long) 4096, temporalUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_AMPM + "'", chronoField1.equals(java.time.temporal.ChronoField.HOUR_OF_AMPM));
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(valueRange6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        java.time.ZoneId zoneId12 = zonedDateTime11.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime14 = zonedDateTime11.withDayOfMonth(33237);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 33237");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zoneId12);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        java.nio.LongBuffer longBuffer4 = longBuffer2.put(0L);
        java.nio.LongBuffer longBuffer5 = longBuffer2.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray6 = longBuffer5.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longBuffer5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.withSecond((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.withMonth((-999999999));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -999999999");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime5 = localDateTime2.atOffset(zoneOffset4);
        java.time.Clock clock6 = java.time.Clock.fixed(instant1, (java.time.ZoneId) zoneOffset4);
        java.time.LocalDate localDate7 = java.time.LocalDate.now(clock6);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.io.File file1 = new java.io.File("GBR");
        boolean boolean3 = file1.setWritable(true);
        boolean boolean5 = file1.setWritable(true);
        java.net.URI uRI6 = file1.toURI();
        java.io.File file8 = new java.io.File("GBR");
        boolean boolean10 = file8.setWritable(true);
        boolean boolean12 = file8.setWritable(true);
        java.net.URI uRI13 = file8.toURI();
        java.net.URI uRI14 = uRI6.relativize(uRI13);
        int int15 = uRI14.getPort();
        java.lang.String str16 = uRI14.getRawQuery();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "GBR");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(uRI13);
        org.junit.Assert.assertNotNull(uRI14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        boolean boolean2 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        boolean boolean4 = localDate1.isSupported((java.time.temporal.TemporalField) chronoField3);
        int int5 = localDate1.getDayOfYear();
        java.time.LocalDate localDate7 = localDate1.withYear((int) '4');
        java.time.LocalDate localDate9 = localDate1.plusYears(4096L);
        java.time.format.DateTimeFormatter dateTimeFormatter10 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.time.chrono.Chronology chronology11 = dateTimeFormatter10.getChronology();
        java.time.format.TextStyle textStyle12 = java.time.format.TextStyle.NARROW_STANDALONE;
        java.util.Locale locale13 = java.util.Locale.UK;
        java.lang.String str14 = locale13.getISO3Language();
        java.time.format.DecimalStyle decimalStyle15 = java.time.format.DecimalStyle.of(locale13);
        java.lang.String str16 = chronology11.getDisplayName(textStyle12, locale13);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.now();
        java.time.OffsetTime offsetTime19 = offsetTime17.withSecond(16);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        int int21 = offsetTime19.get((java.time.temporal.TemporalField) chronoField20);
        java.time.temporal.ValueRange valueRange22 = chronology11.range(chronoField20);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDate9.get((java.time.temporal.TemporalField) chronoField20);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MinuteOfHour");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField3.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + textStyle12 + "' != '" + java.time.format.TextStyle.NARROW_STANDALONE + "'", textStyle12.equals(java.time.format.TextStyle.NARROW_STANDALONE));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "eng" + "'", str14, "eng");
        org.junit.Assert.assertNotNull(decimalStyle15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ISO" + "'", str16, "ISO");
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField20.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertNotNull(valueRange22);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        int int12 = zonedDateTime11.getDayOfMonth();
        int int13 = zonedDateTime11.getMinute();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime11.minusWeeks((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime17 = zonedDateTime11.plusHours((long) 794000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000090579");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertNotNull(zonedDateTime15);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("-999999999-01-01", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Language();
        java.time.format.DecimalStyle decimalStyle2 = java.time.format.DecimalStyle.of(locale0);
        java.lang.String str3 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBR" + "'", str3, "GBR");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character u is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of(399000000, (int) (byte) 100, (int) (short) 100, (-7), 31);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap1 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap5 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime10 = localDateTime7.atOffset(zoneOffset9);
        java.time.zone.ZoneRules zoneRules11 = zoneOffset9.getRules();
        java.time.zone.ZoneRules zoneRules12 = zoneIdMap5.getOrDefault((java.lang.Object) 1.0d, zoneRules11);
        java.time.zone.ZoneRules zoneRules13 = zoneIdMap1.put((java.time.ZoneId) zoneOffset3, zoneRules11);
        char[] charArray21 = new char[] { 'a', '#', '4', '#' };
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("", charArray21);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR", charArray21);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Minute", charArray21);
        java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules> zoneIdMap26 = new java.util.Hashtable<java.time.ZoneId, java.time.zone.ZoneRules>(100);
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime31 = localDateTime28.atOffset(zoneOffset30);
        java.time.zone.ZoneRules zoneRules32 = zoneOffset30.getRules();
        java.time.zone.ZoneRules zoneRules33 = zoneIdMap26.getOrDefault((java.lang.Object) 1.0d, zoneRules32);
        java.lang.String str34 = zoneRules32.toString();
        java.util.List<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList35 = zoneRules32.getTransitions();
        java.time.zone.ZoneRules zoneRules36 = zoneIdMap1.getOrDefault((java.lang.Object) charArray21, zoneRules32);
        java.util.stream.Stream<java.time.zone.ZoneRules> zoneRulesStream37 = java.util.stream.Stream.of(zoneRules32);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNull(zoneRules13);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(offsetDateTime31);
        org.junit.Assert.assertNotNull(zoneRules32);
        org.junit.Assert.assertNotNull(zoneRules33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ZoneRules[currentStandardOffset=Z]" + "'", str34, "ZoneRules[currentStandardOffset=Z]");
        org.junit.Assert.assertNotNull(zoneOffsetTransitionList35);
        org.junit.Assert.assertNotNull(zoneRules36);
        org.junit.Assert.assertNotNull(zoneRulesStream37);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.security.NoSuchProviderException noSuchProviderException2 = new java.security.NoSuchProviderException();
        java.security.NoSuchProviderException noSuchProviderException3 = new java.security.NoSuchProviderException();
        noSuchProviderException2.addSuppressed((java.lang.Throwable) noSuchProviderException3);
        java.security.InvalidKeyException invalidKeyException5 = new java.security.InvalidKeyException(" ", (java.lang.Throwable) noSuchProviderException3);
        java.io.IOException iOException6 = new java.io.IOException("Chinese", (java.lang.Throwable) invalidKeyException5);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        boolean boolean2 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        boolean boolean4 = localDate1.isSupported((java.time.temporal.TemporalField) chronoField3);
        int int5 = localDate1.getDayOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.now();
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        boolean boolean8 = localDate6.isEqual((java.time.chrono.ChronoLocalDate) localDate7);
        int int9 = localDate7.getYear();
        java.lang.String str10 = localDate7.toString();
        java.time.chrono.ChronoPeriod chronoPeriod11 = java.time.chrono.ChronoPeriod.between((java.time.chrono.ChronoLocalDate) localDate1, (java.time.chrono.ChronoLocalDate) localDate7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = localDate1.atTime(16384, (int) '\n', (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 16384");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField3.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-999999999) + "'", int9 == (-999999999));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-999999999-01-01" + "'", str10, "-999999999-01-01");
        org.junit.Assert.assertNotNull(chronoPeriod11);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "+999999999-12-31T23:59:59.999999999");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("-999999999-01-01", "GBR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.stream.Stream.Builder<java.util.OptionalDouble> optionalDoubleBuilder0 = java.util.stream.Stream.builder();
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble2 = doubleStream1.min();
        boolean boolean3 = optionalDouble2.isPresent();
        java.util.stream.Stream.Builder<java.util.OptionalDouble> optionalDoubleBuilder4 = optionalDoubleBuilder0.add(optionalDouble2);
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.distinct();
        java.util.stream.DoubleStream doubleStream7 = doubleStream6.parallel();
        java.util.OptionalDouble optionalDouble8 = doubleStream7.average();
        optionalDoubleBuilder0.accept(optionalDouble8);
        double double11 = optionalDouble8.orElse((double) (short) 1);
        org.junit.Assert.assertNotNull(optionalDoubleBuilder0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionalDoubleBuilder4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(optionalDouble8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        double double1 = doubleStream0.sum();
        java.util.function.DoublePredicate doublePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = doubleStream0.allMatch(doublePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime4 = localDateTime1.atOffset(zoneOffset3);
        java.time.Month month5 = java.time.Month.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime10 = localDateTime7.atOffset(zoneOffset9);
        int int11 = localDateTime6.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime15 = localDateTime12.atOffset(zoneOffset14);
        int int16 = localDateTime7.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime18 = localDateTime12.withHour(4);
        int int19 = localDateTime1.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        java.time.LocalDate localDate20 = localDateTime1.toLocalDate();
        java.time.format.FormatStyle formatStyle21 = java.time.format.FormatStyle.LONG;
        java.time.format.DateTimeFormatter dateTimeFormatter22 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle21);
        java.lang.String str23 = null; // flaky: localDateTime1.format(dateTimeFormatter22);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate24 = java.time.LocalDate.parse((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaZaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", dateTimeFormatter22);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaZaaaaaaaaaaaaaaaaaaaaaaaaaaaaa' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.DECEMBER + "'", month5.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + formatStyle21 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle21.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e0b\u5348\u65f6\u5206\u79d2" + "'", str23, "\u4e0b\u5348\u65f6\u5206\u79d2");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.parse((java.lang.CharSequence) "hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        float[] floatArray2 = new float[] { 16, 21 };
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.wrap(floatArray2);
        java.nio.ByteOrder byteOrder4 = floatBuffer3.order();
        java.nio.FloatBuffer floatBuffer6 = floatBuffer3.put((float) 256);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[256.0, 21.0]");
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(floatBuffer6);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.String str1 = java.net.URLConnection.getDefaultRequestProperty("1 - 53");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer2 = charBuffer1.flip();
        java.nio.CharBuffer charBuffer4 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer5 = charBuffer4.flip();
        int int6 = charBuffer1.compareTo(charBuffer4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer9 = charBuffer1.subSequence(999999999, (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.time.chrono.Chronology chronology1 = dateTimeFormatter0.getChronology();
        java.nio.CharBuffer charBuffer3 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer4 = charBuffer3.flip();
        int int5 = charBuffer3.capacity();
        boolean boolean6 = charBuffer3.hasArray();
        boolean boolean7 = chronology1.equals((java.lang.Object) charBuffer3);
        java.util.List<java.time.chrono.Era> eraList8 = chronology1.eras();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate11 = chronology1.dateYearDay(33237, 437000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 437000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eraList8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.stream.Stream<java.nio.charset.CharsetDecoder> charsetDecoderStream0 = java.util.stream.Stream.empty();
        org.junit.Assert.assertNotNull(charsetDecoderStream0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        double[] doubleArray5 = new double[] { 'M', 1024, 0.0d, 1999999998, 'u' };
        java.util.stream.DoubleStream doubleStream6 = java.util.stream.DoubleStream.of(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer9 = java.nio.DoubleBuffer.wrap(doubleArray5, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[77.0, 1024.0, 0.0, 1.999999998E9, 117.0]");
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        short short3 = byteBuffer1.getShort();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = byteBuffer1.getInt((-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(64);
        java.nio.ShortBuffer shortBuffer2 = shortBuffer1.compact();
        java.lang.String str3 = shortBuffer2.toString();
        org.junit.Assert.assertNotNull(shortBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.nio.HeapShortBuffer[pos=64 lim=64 cap=64]" + "'", str3, "java.nio.HeapShortBuffer[pos=64 lim=64 cap=64]");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.concat(longStream0, longStream1);
        java.util.stream.LongStream longStream3 = longStream2.sorted();
        java.util.stream.Stream<java.lang.Long> longStream4 = longStream3.boxed();
        java.util.function.LongToDoubleFunction longToDoubleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = longStream3.mapToDouble(longToDoubleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.time.Duration duration2 = java.time.Duration.ofSeconds((long) 10, 0L);
        int int3 = duration2.getNano();
        java.time.Duration duration4 = duration2.abs();
        java.time.Duration duration6 = duration2.plusMinutes((long) ' ');
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Enumeration<java.net.NetworkInterface> networkInterfaceEnumeration0 = java.net.NetworkInterface.getNetworkInterfaces();
        org.junit.Assert.assertNotNull(networkInterfaceEnumeration0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime3 = localDateTime0.atOffset(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusSeconds((long) (byte) 0);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime9 = localDateTime6.atOffset(zoneOffset8);
        java.time.zone.ZoneRules zoneRules10 = zoneOffset8.getRules();
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime3.atZoneSameInstant((java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime11.withLaterOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        java.time.temporal.ValueRange valueRange14 = zonedDateTime11.range((java.time.temporal.TemporalField) chronoField13);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField16.getBaseUnit();
        boolean boolean18 = temporalUnit17.isTimeBased();
        java.time.ZonedDateTime zonedDateTime19 = zonedDateTime11.minus(0L, temporalUnit17);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime21 = zonedDateTime19.plusMonths((long) 'u');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000009");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField13.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertNotNull(valueRange14);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField16.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zonedDateTime19);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant3 = instant1.minusNanos((long) 'a');
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from(instant1);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery5 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period6 = instant1.query(periodTemporalQuery5);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit8 = chronoField7.getBaseUnit();
        boolean boolean9 = instant1.isSupported(temporalUnit8);
        java.time.Instant instant11 = java.time.Instant.ofEpochSecond((long) ' ');
        java.time.Instant instant13 = instant11.minusNanos((long) 'a');
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime17 = localDateTime14.atOffset(zoneOffset16);
        java.time.zone.ZoneRules zoneRules18 = zoneOffset16.getRules();
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.ofInstant(instant11, (java.time.ZoneId) zoneOffset16);
        java.time.ZoneId zoneId20 = zonedDateTime19.getZone();
        java.time.Clock clock21 = java.time.Clock.fixed(instant1, zoneId20);
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.MAX;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.ofHours((int) (short) 0);
        java.time.OffsetDateTime offsetDateTime27 = localDateTime24.atOffset(zoneOffset26);
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.ofEpochSecond((long) (short) 10, 10, zoneOffset26);
        java.time.zone.ZoneRules zoneRules29 = zoneOffset26.getRules();
        java.time.OffsetDateTime offsetDateTime30 = instant1.atOffset(zoneOffset26);
        int int31 = offsetDateTime30.getDayOfYear();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(fileTime4);
        org.junit.Assert.assertNotNull(periodTemporalQuery5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit8 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit8.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneRules18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(offsetDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.OVERFLOW;
        boolean boolean1 = coderResult0.isMalformed();
        boolean boolean2 = coderResult0.isUnmappable();
        boolean boolean3 = coderResult0.isMalformed();
        org.junit.Assert.assertNotNull(coderResult0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        float float4 = byteBuffer1.getFloat(4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putChar('\r');
        byte[] byteArray8 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer6.put(byteArray8, (int) 'G', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer2 = charBuffer1.flip();
        java.nio.CharBuffer charBuffer4 = java.nio.CharBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer5 = charBuffer4.flip();
        java.nio.CharBuffer charBuffer6 = charBuffer4.duplicate();
        char[] charArray14 = new char[] { 'a', '#', '4', '#' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR GBR", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Minute", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) charBuffer6, charArray14);
        boolean boolean19 = charBuffer6.isDirect();
        java.nio.CharBuffer charBuffer20 = charBuffer1.append((java.lang.CharSequence) charBuffer6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.parse((java.lang.CharSequence) charBuffer1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a#4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a#4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a, #, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charBuffer20);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "MinuteOfHour");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
}
