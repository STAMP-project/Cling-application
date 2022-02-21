import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime2 = java.nio.file.attribute.FileTime.from(1L, timeUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: unit");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByName("hi!");
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.ofLocale(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: locale");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = org.mockito.cglib.core.CodeEmitter.USHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 124 + "'", int0 == 124);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = java.time.Instant.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.time.Month month1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of(0, month1, 124, (int) (byte) 100, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.LITTLE_ENDIAN;
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.WEDNESDAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate1 = java.time.chrono.ChronoLocalDate.from((java.time.temporal.TemporalAccessor) dayOfWeek0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ChronoLocalDate from TemporalAccessor: class java.time.DayOfWeek");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.WEDNESDAY));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = new java.net.URI("", "1970-01-02", "", (int) (byte) 1, "", "1970-01-02", "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Expected scheme name at index 0: ://1970-01-02@:1?1970-01-02#hi!");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.time.ZoneOffset zoneOffset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.ofEpochSecond((long) 1, (-1), zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.time.Month month0 = java.time.Month.APRIL;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.APRIL + "'", month0.equals(java.time.Month.APRIL));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.stream.Collector.Characteristics characteristics0 = java.util.stream.Collector.Characteristics.CONCURRENT;
        org.junit.Assert.assertTrue("'" + characteristics0 + "' != '" + java.util.stream.Collector.Characteristics.CONCURRENT + "'", characteristics0.equals(java.util.stream.Collector.Characteristics.CONCURRENT));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period1 = java.time.Period.parse((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.parse((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.time.Clock clock0 = null;
        java.time.Duration duration2 = java.time.Duration.ofHours((-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock3 = java.time.Clock.tick(clock0, duration2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseClock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.security.GeneralSecurityException generalSecurityException2 = new java.security.GeneralSecurityException("");
        java.security.GeneralSecurityException generalSecurityException3 = new java.security.GeneralSecurityException("", (java.lang.Throwable) generalSecurityException2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.security.NoSuchProviderException noSuchProviderException0 = new java.security.NoSuchProviderException();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        int int2 = optionalInt0.orElse((int) (byte) -1);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Comparator<java.time.OffsetDateTime> offsetDateTimeComparator0 = java.time.OffsetDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(offsetDateTimeComparator0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = java.time.temporal.ValueRange.of(0L, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value must be less than maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.nio.charset.CharacterCodingException characterCodingException0 = new java.nio.charset.CharacterCodingException();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("", "1970-01-02");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1970-01-02");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.security.AccessControlContext accessControlContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.Subject subject1 = javax.security.auth.Subject.getSubject(accessControlContext0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: invalid null AccessControlContext provided");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.time.Month month0 = java.time.Month.AUGUST;
        java.time.DayOfWeek dayOfWeek2 = java.time.DayOfWeek.WEDNESDAY;
        java.time.LocalTime localTime3 = java.time.LocalTime.MAX;
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition5 = null;
        java.time.ZoneOffset zoneOffset6 = null;
        java.time.ZoneOffset zoneOffset7 = null;
        java.time.ZoneOffset zoneOffset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransitionRule zoneOffsetTransitionRule9 = java.time.zone.ZoneOffsetTransitionRule.of(month0, (int) (byte) 1, dayOfWeek2, localTime3, true, timeDefinition5, zoneOffset6, zoneOffset7, zoneOffset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: timeDefnition");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.AUGUST + "'", month0.equals(java.time.Month.AUGUST));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.WEDNESDAY));
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.stream.Collector.Characteristics characteristics0 = java.util.stream.Collector.Characteristics.UNORDERED;
        org.junit.Assert.assertTrue("'" + characteristics0 + "' != '" + java.util.stream.Collector.Characteristics.UNORDERED + "'", characteristics0.equals(java.util.stream.Collector.Characteristics.UNORDERED));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.function.Predicate<java.util.concurrent.TimeUnit> timeUnitPredicate1 = java.util.function.Predicate.isEqual((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(timeUnitPredicate1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.security.NoSuchProviderException noSuchProviderException1 = new java.security.NoSuchProviderException("");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption openOption1 = null;
        java.nio.file.OpenOption[] openOptionArray2 = new java.nio.file.OpenOption[] { openOption1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.FileChannel fileChannel3 = java.nio.channels.FileChannel.open(path0, openOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str2 = localDate1.toString();
        int int3 = localDate1.lengthOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime4 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDate1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalTime from TemporalAccessor: 1970-01-02 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-02" + "'", str2, "1970-01-02");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        long[] longArray1 = new long[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray1, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[1]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.time.Month month0 = java.time.Month.AUGUST;
        int int1 = month0.maxLength();
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.AUGUST + "'", month0.equals(java.time.Month.AUGUST));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException("");
        java.lang.String str2 = generalSecurityException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.security.GeneralSecurityException: " + "'", str2, "java.security.GeneralSecurityException: ");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate3 = localDate1.plusMonths((long) (short) 100);
        java.time.Duration duration5 = java.time.Duration.ofHours((-1L));
        long long6 = duration5.toHours();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal7 = localDate1.plus((java.time.temporal.TemporalAmount) duration5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.time.Instant instant0 = null;
        java.time.ZoneId zoneId1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock2 = java.time.Clock.fixed(instant0, zoneId1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: fixedInstant");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.security.cert.CertPath certPath0 = null;
        java.security.Timestamp timestamp1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.CodeSigner codeSigner2 = new java.security.CodeSigner(certPath0, timestamp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.net.SocketException socketException1 = new java.net.SocketException("CN");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.IOException iOException0 = new java.io.IOException();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.time.Duration duration1 = java.time.Duration.ofHours((-1L));
        java.time.LocalDate localDate3 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str4 = localDate3.toString();
        int int5 = localDate3.lengthOfMonth();
        int int6 = localDate3.lengthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal7 = duration1.addTo((java.time.temporal.Temporal) localDate3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-02" + "'", str4, "1970-01-02");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.nio.charset.Charset charset2 = null;
        java.nio.charset.Charset charset3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strMap0.replace("", charset2, charset3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.from((java.time.temporal.TemporalAccessor) localTime0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: 23:59:59.999999999 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = java.time.LocalTime.parse((java.lang.CharSequence) "1970-01-02", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1970-01-02' could not be parsed at index 10");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate10 = localDate8.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime14 = localDate8.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal15 = localTime4.adjustInto((java.time.temporal.Temporal) localDateTime14);
        long long16 = localTime4.toNanoOfDay();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(temporal15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2101000000010L + "'", long16 == 2101000000010L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.time.LocalTime localTime2 = java.time.LocalTime.of((int) (short) 1, (int) '#');
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.net.URL uRL0 = null;
        java.net.URLStreamHandler uRLStreamHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL(uRL0, "1970-01-02", uRLStreamHandler2);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: 1970-01-02");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 100, 16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 100 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.UnsupportedEncodingException unsupportedEncodingException2 = new java.io.UnsupportedEncodingException("hi!");
        java.io.UnsupportedEncodingException unsupportedEncodingException4 = new java.io.UnsupportedEncodingException("hi!");
        unsupportedEncodingException2.addSuppressed((java.lang.Throwable) unsupportedEncodingException4);
        java.security.NoSuchAlgorithmException noSuchAlgorithmException6 = new java.security.NoSuchAlgorithmException("", (java.lang.Throwable) unsupportedEncodingException2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.time.Duration duration1 = java.time.Duration.ZERO;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = strMap0.containsKey((java.lang.Object) duration1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.time.Duration cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(outputStream0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.net.URLConnection.setDefaultAllowUserInteraction(true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int int0 = org.mockito.cglib.core.CodeEmitter.AND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 126 + "'", int0 == 126);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getDisplayCountry(locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL;
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.time.Instant instant0 = null;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MIN;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: instant");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.InvalidObjectException invalidObjectException1 = new java.io.InvalidObjectException("zho");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition(field0, 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer3 = java.nio.LongBuffer.wrap(longArray0, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("zho", "CN", 256, "\u661f\u671f\u4e94", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: zho");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str1 = java.net.URLConnection.getDefaultRequestProperty("zho");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit8 = chronoField7.getBaseUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime9 = localTime4.truncatedTo(temporalUnit8);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit is too large to be used for truncation");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField7.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit8 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit8.equals(java.time.temporal.ChronoUnit.MONTHS));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = null;
        org.mockito.asm.Label label6 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("zho", "hi!", "\u661f\u671f\u4e94", label5, label6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of((int) 'a', (int) (short) 1, (int) (short) 10, (int) (short) -1, (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate3 = localDate1.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime7 = localDate1.atTime(0, (int) '4', (int) (byte) 1);
        java.time.format.DateTimeFormatter dateTimeFormatter8 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localDateTime7.format(dateTimeFormatter8);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate3 = localDate1.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime7 = localDate1.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField8.getBaseUnit();
        boolean boolean10 = temporalUnit9.isTimeBased();
        boolean boolean11 = localDateTime7.equals((java.lang.Object) temporalUnit9);
        java.time.LocalTime localTime12 = localDateTime7.toLocalTime();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField8.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.time.Period period1 = java.time.Period.ofDays(256);
        java.time.Duration duration3 = java.time.Duration.ofDays((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period4 = period1.minus((java.time.temporal.TemporalAmount) duration3);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.security.InvalidKeyException invalidKeyException0 = new java.security.InvalidKeyException();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = new java.net.URI("", "CN", "\u661f\u671f\u4e94");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Expected scheme name at index 0: :CN#???");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range(10L, (long) 256);
        java.util.stream.LongStream longStream3 = longStream2.unordered();
        java.util.function.LongPredicate longPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = longStream2.anyMatch(longPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("1970-01-02");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1970-01-02");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.net.MalformedURLException malformedURLException0 = new java.net.MalformedURLException();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("java.security.GeneralSecurityException: ");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        int int2 = optionalInt0.orElse(124);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 124 + "'", int2 == 124);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.duplicate();
        java.lang.Object obj3 = floatBuffer2.array();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Comparator<java.time.chrono.ChronoLocalDate> chronoLocalDateComparator0 = java.time.chrono.ChronoLocalDate.timeLineOrder();
        org.junit.Assert.assertNotNull(chronoLocalDateComparator0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField0.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        int int1 = localTime0.getMinute();
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime8 = localTime6.minusNanos((long) 0);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate12 = localDate10.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime16 = localDate10.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal17 = localTime6.adjustInto((java.time.temporal.Temporal) localDateTime16);
        java.util.OptionalInt optionalInt18 = java.util.OptionalInt.empty();
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit20 = chronoField19.getBaseUnit();
        boolean boolean21 = optionalInt18.equals((java.lang.Object) temporalUnit20);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = localTime0.until(temporal17, temporalUnit20);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 59 + "'", int1 == 59);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(temporal17);
        org.junit.Assert.assertNotNull(optionalInt18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField19.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit20 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit20.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.duplicate();
        float[] floatArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer6 = floatBuffer1.put(floatArray3, (int) '#', (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long3 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) localDate2);
        java.time.temporal.TemporalUnit temporalUnit4 = chronoField0.getRangeUnit();
        java.time.LocalDate localDate6 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate8 = localDate6.plusMonths((long) (short) 100);
        java.time.chrono.Era era9 = localDate8.getEra();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate11 = temporalUnit4.addTo(localDate8, (long) '+');
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField0.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 23640L + "'", long3 == 23640L);
        org.junit.Assert.assertTrue("'" + temporalUnit4 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit4.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + era9 + "' != '" + java.time.chrono.IsoEra.CE + "'", era9.equals(java.time.chrono.IsoEra.CE));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (byte) -1);
        java.util.OptionalInt optionalInt2 = intStream1.findAny();
        java.util.stream.IntStream.Builder builder3 = java.util.stream.IntStream.builder();
        // The following exception was thrown during execution in test generation
        try {
            intStream1.forEachOrdered((java.util.function.IntConsumer) builder3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int int0 = org.mockito.asm.ClassReader.EXPAND_FRAMES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.function.UnaryOperator<java.net.SocketException> socketExceptionUnaryOperator0 = java.util.function.UnaryOperator.identity();
        org.junit.Assert.assertNotNull(socketExceptionUnaryOperator0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1.0f);
        java.util.stream.DoubleStream doubleStream3 = doubleStream1.skip((long) 0);
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleStream3.forEach(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Optional<java.lang.String[]> strArrayOptional0 = java.util.Optional.empty();
        java.lang.String str1 = strArrayOptional0.toString();
        org.junit.Assert.assertNotNull(strArrayOptional0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Optional.empty" + "'", str1, "Optional.empty");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.duplicate();
        boolean boolean3 = floatBuffer2.isReadOnly();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.ofLocale(locale0);
        boolean boolean3 = chronology1.isLeapYear(0L);
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate7 = localDate5.plusMonths((long) (short) 100);
        java.time.chrono.Era era8 = localDate7.getEra();
        java.time.chrono.ChronoLocalDate chronoLocalDate11 = chronology1.dateYearDay(era8, (int) '#', 126);
        boolean boolean13 = chronology1.isLeapYear((long) 0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + era8 + "' != '" + java.time.chrono.IsoEra.CE + "'", era8.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoLocalDate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate3 = localDate1.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime7 = localDate1.atTime(0, (int) '4', (int) (byte) 1);
        java.time.LocalDate localDate9 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.temporal.Temporal temporal10 = localDate1.adjustInto((java.time.temporal.Temporal) localDate9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant11 = java.time.Instant.from((java.time.temporal.TemporalAccessor) localDate1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain Instant from TemporalAccessor: 1970-01-02 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(temporal10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        short[] shortArray2 = new short[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer5 = java.nio.ShortBuffer.wrap(shortArray2, (int) (byte) 100, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 10]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "fr_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "fr_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "fr_CA");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (byte) -1);
        java.util.OptionalInt optionalInt2 = intStream1.findAny();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.Integer> intSpliterator3 = intStream1.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition1 = new java.text.FieldPosition(field0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int int0 = org.mockito.cglib.core.CodeEmitter.REM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 112 + "'", int0 == 112);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range(10L, (long) 256);
        java.util.stream.LongStream longStream3 = longStream2.sequential();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = longStream2.onClose(runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn(124, "", "CN", "-18:00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.File file1 = new java.io.File("java.security.GeneralSecurityException: ");
        boolean boolean2 = file1.isAbsolute();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.security.GeneralSecurityException: ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.parse((java.lang.CharSequence) "Optional.empty", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Optional.empty' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        java.lang.String[] strArray4 = java.util.Locale.getISOCountries();
        java.io.UnsupportedEncodingException unsupportedEncodingException7 = new java.io.UnsupportedEncodingException("hi!");
        java.io.UnsupportedEncodingException unsupportedEncodingException9 = new java.io.UnsupportedEncodingException("hi!");
        unsupportedEncodingException7.addSuppressed((java.lang.Throwable) unsupportedEncodingException9);
        java.lang.Throwable[] throwableArray11 = unsupportedEncodingException7.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame((int) '+', (int) (short) 10, (java.lang.Object[]) strArray4, (int) (short) 1, (java.lang.Object[]) throwableArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.duplicate();
        boolean boolean3 = floatBuffer2.isDirect();
        int int4 = floatBuffer2.arrayOffset();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLdcInsn(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.OffsetTime offsetTime12 = offsetTime10.minusSeconds((long) 59);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate15 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long16 = chronoField13.getFrom((java.time.temporal.TemporalAccessor) localDate15);
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField13.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = offsetTime12.get((java.time.temporal.TemporalField) chronoField13);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ProlepticMonth");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField13.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 23640L + "'", long16 == 23640L);
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.Optional<java.time.LocalDateTime> localDateTimeOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(localDateTimeOptional0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.THURSDAY;
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.THURSDAY));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = null;
        org.mockito.asm.Label label5 = null;
        org.mockito.asm.Label[] labelArray6 = new org.mockito.asm.Label[] { label5 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn(0, (int) (byte) 0, label4, labelArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        boolean boolean1 = strMap0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strMap0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.nio.channels.FileChannel.MapMode mapMode0 = java.nio.channels.FileChannel.MapMode.PRIVATE;
        org.junit.Assert.assertNotNull(mapMode0);
        org.junit.Assert.assertEquals(mapMode0.toString(), "PRIVATE");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate3 = localDate1.plusMonths((long) (short) 100);
        java.time.Month month4 = localDate1.getMonth();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.JANUARY + "'", month4.equals(java.time.Month.JANUARY));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap1 = null;
        java.time.Month month2 = java.time.Month.FEBRUARY;
        java.time.LocalTime localTime7 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime9 = localTime7.minusNanos((long) 0);
        java.time.LocalTime localTime11 = localTime9.minusMinutes((long) 'a');
        java.time.format.ResolverStyle resolverStyle12 = java.time.format.ResolverStyle.STRICT;
        boolean boolean13 = localTime11.equals((java.lang.Object) resolverStyle12);
        java.time.temporal.TemporalAccessor temporalAccessor14 = chronoField0.resolve(temporalFieldMap1, (java.time.temporal.TemporalAccessor) month2, resolverStyle12);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField0.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.FEBRUARY + "'", month2.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + resolverStyle12 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle12.equals(java.time.format.ResolverStyle.STRICT));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(temporalAccessor14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.LocalTime localTime10 = localTime6.plusHours((long) '+');
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1.0f);
        java.util.stream.DoubleStream doubleStream3 = doubleStream1.skip((long) 0);
        java.util.OptionalDouble optionalDouble4 = doubleStream1.max();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleStream1.forEachOrdered(doubleConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        char char0 = java.io.File.separatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '/' + "'", char0 == '/');
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField0.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean1 = strSet0.isEmpty();
        java.lang.Object[] objArray2 = strSet0.toArray();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        java.time.format.DecimalStyle decimalStyle2 = dateTimeFormatter1.getDecimalStyle();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate3 = java.time.LocalDate.parse((java.lang.CharSequence) "CN", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'CN' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(decimalStyle2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long3 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) localDate2);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate6 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long7 = chronoField4.getFrom((java.time.temporal.TemporalAccessor) localDate6);
        long long9 = chronoField4.checkValidValue((-1L));
        boolean boolean10 = localDate2.isSupported((java.time.temporal.TemporalField) chronoField4);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField0.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 23640L + "'", long3 == 23640L);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField4.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 23640L + "'", long7 == 23640L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long3 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) localDate2);
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str6 = localDate5.toString();
        int int7 = localDate5.lengthOfMonth();
        java.time.LocalDate localDate9 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str10 = localDate9.toString();
        int int11 = localDate9.lengthOfMonth();
        boolean boolean12 = localDate5.isEqual((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.temporal.ValueRange valueRange13 = chronoField0.rangeRefinedBy((java.time.temporal.TemporalAccessor) localDate9);
        long long14 = valueRange13.getMaximum();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField0.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 23640L + "'", long3 == 23640L);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-02" + "'", str6, "1970-01-02");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-02" + "'", str10, "1970-01-02");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11999999999L + "'", long14 == 11999999999L);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.time.Month month0 = java.time.Month.JUNE;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JUNE + "'", month0.equals(java.time.Month.JUNE));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str2 = localDate1.toString();
        java.time.LocalDate localDate4 = localDate1.minusYears(23640L);
        java.time.LocalTime localTime9 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime11 = localTime9.minusNanos((long) 0);
        java.time.LocalTime localTime13 = localTime11.minusMinutes((long) 'a');
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime20 = localTime18.minusNanos((long) 0);
        java.time.LocalTime localTime22 = localTime20.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime24 = localTime22.atOffset(zoneOffset23);
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.of(localDate1, localTime13, zoneOffset23);
        java.time.temporal.TemporalAmount temporalAmount26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime27 = offsetDateTime25.minus(temporalAmount26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-02" + "'", str2, "1970-01-02");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.zone.ZoneRules zoneRules11 = zoneOffset9.getRules();
        java.time.Clock clock12 = java.time.Clock.tickMinutes((java.time.ZoneId) zoneOffset9);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(clock12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = null;
        org.mockito.asm.Label label6 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("java.security.GeneralSecurityException: ", "1970-01-02", "CN", label5, label6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException0 = new java.security.NoSuchAlgorithmException();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.text.FieldPosition fieldPosition1 = new java.text.FieldPosition((int) '#');
        int int2 = fieldPosition1.getField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.duplicate();
        java.util.Locale locale3 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology4 = java.time.chrono.Chronology.ofLocale(locale3);
        java.lang.String str5 = locale3.getCountry();
        boolean boolean6 = floatBuffer1.equals((java.lang.Object) str5);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CN" + "'", str5, "CN");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode(100);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        int int0 = org.mockito.cglib.core.CodeEmitter.DIV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 108 + "'", int0 == 108);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(365, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream1 = longStream0.sorted();
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = longStream0.reduce((long) (byte) 1, longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLoopbackAddress();
        boolean boolean2 = inetAddress0.isReachable(35);
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MIN;
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.ofEpochSecond((long) '4', (int) (byte) 10, zoneOffset2);
        java.time.LocalDateTime localDateTime5 = localDateTime3.plusNanos(2101000000010L);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str2 = localDate1.toString();
        java.time.LocalDate localDate4 = localDate1.minusYears(23640L);
        java.time.LocalTime localTime9 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime11 = localTime9.minusNanos((long) 0);
        java.time.LocalTime localTime13 = localTime11.minusMinutes((long) 'a');
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime20 = localTime18.minusNanos((long) 0);
        java.time.LocalTime localTime22 = localTime20.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime24 = localTime22.atOffset(zoneOffset23);
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.of(localDate1, localTime13, zoneOffset23);
        java.time.LocalTime localTime27 = localTime13.plusMinutes((long) (byte) -1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-02" + "'", str2, "1970-01-02");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        char char0 = java.text.CharacterIterator.DONE;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\uffff' + "'", char0 == '\uffff');
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.format.ResolverStyle resolverStyle9 = java.time.format.ResolverStyle.STRICT;
        boolean boolean10 = localTime8.equals((java.lang.Object) resolverStyle9);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        java.lang.String str12 = chronoField11.toString();
        java.time.temporal.ValueRange valueRange13 = localTime8.range((java.time.temporal.TemporalField) chronoField11);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + resolverStyle9 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle9.equals(java.time.format.ResolverStyle.STRICT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField11.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NanoOfSecond" + "'", str12, "NanoOfSecond");
        org.junit.Assert.assertNotNull(valueRange13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.zone.ZoneRules zoneRules11 = zoneOffset9.getRules();
        java.util.List<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList12 = zoneRules11.getTransitionRules();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleList12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate10 = localDate8.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime14 = localDate8.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal15 = localTime4.adjustInto((java.time.temporal.Temporal) localDateTime14);
        java.time.LocalDate localDate17 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate19 = localDate17.plusMonths((long) (short) 100);
        java.time.chrono.Era era20 = localDate19.getEra();
        boolean boolean21 = localDateTime14.equals((java.lang.Object) localDate19);
        java.time.LocalDateTime localDateTime23 = localDateTime14.plusDays((long) 256);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(temporal15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + era20 + "' != '" + java.time.chrono.IsoEra.CE + "'", era20.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (byte) -1);
        java.util.OptionalInt optionalInt2 = intStream1.findAny();
        java.util.stream.IntStream intStream3 = intStream1.sequential();
        java.util.stream.IntStream intStream4 = intStream3.unordered();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.Integer> intItor5 = intStream3.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = java.time.Duration.parse((java.lang.CharSequence) "Optional.empty");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Duration");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.NANOSECONDS;
        long long2 = timeUnit0.toMinutes((long) 35);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (byte) -1);
        java.util.stream.IntStream intStream2 = intStream1.sequential();
        boolean boolean3 = intStream2.isParallel();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.String[] strArray8 = new java.lang.String[] { "zho", "hi!", "Optional.empty", "NanoOfSecond", "hi!", "-18:00", "-18:00", "\u661f\u671f\u4e94" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Spliterator<java.lang.String> strSpliterator11 = strSet9.spliterator();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit13 = chronoField12.getBaseUnit();
        boolean boolean14 = temporalUnit13.isTimeBased();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal15 = offsetTime10.minus((long) '+', temporalUnit13);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField12.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit13 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit13.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str2 = localDate1.toString();
        int int3 = localDate1.lengthOfMonth();
        int int4 = localDate1.lengthOfYear();
        java.lang.String str5 = localDate1.toString();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-02" + "'", str2, "1970-01-02");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-02" + "'", str5, "1970-01-02");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.function.Function<java.time.format.ResolverStyle, java.time.format.ResolverStyle> resolverStyleFunction0 = java.util.function.Function.identity();
        org.junit.Assert.assertNotNull(resolverStyleFunction0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long3 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) localDate2);
        java.time.temporal.Temporal temporal4 = null;
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getBaseUnit();
        boolean boolean7 = temporalUnit6.isTimeBased();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = localDate2.until(temporal4, temporalUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField0.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 23640L + "'", long3 == 23640L);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField5.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str2 = localDate1.toString();
        int int3 = localDate1.lengthOfMonth();
        int int4 = localDate1.getMonthValue();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-02" + "'", str2, "1970-01-02");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.time.LocalDate localDate0 = java.time.LocalDate.MAX;
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate4 = localDate2.plusMonths((long) (short) 100);
        boolean boolean5 = localDate0.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = new java.net.URL("");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.io.File file1 = new java.io.File("java.security.GeneralSecurityException: ");
        boolean boolean2 = file1.setReadOnly();
        boolean boolean3 = file1.isAbsolute();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.security.GeneralSecurityException: ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1.0f);
        java.util.stream.DoubleStream doubleStream3 = doubleStream1.skip((long) 0);
        java.util.stream.DoubleStream doubleStream4 = doubleStream1.parallel();
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.MONDAY;
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.MONDAY));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.fromMillis(1L);
        org.junit.Assert.assertNotNull(fileTime1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (byte) -1);
        java.util.OptionalInt optionalInt2 = intStream1.findAny();
        java.util.stream.IntStream intStream4 = java.util.stream.IntStream.of((int) (byte) -1);
        java.util.OptionalInt optionalInt5 = intStream4.findAny();
        java.util.stream.IntStream intStream6 = intStream4.sequential();
        java.util.stream.IntStream intStream7 = intStream6.unordered();
        java.util.stream.IntStream intStream8 = intStream7.unordered();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = java.util.stream.IntStream.concat(intStream1, intStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(optionalInt5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        int int0 = org.mockito.asm.ClassWriter.COMPUTE_FRAMES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range(10L, (long) 256);
        java.util.stream.LongStream longStream3 = longStream2.unordered();
        java.util.function.LongToIntFunction longToIntFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = longStream3.mapToInt(longToIntFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.List<java.nio.file.spi.FileSystemProvider> fileSystemProviderList0 = java.nio.file.spi.FileSystemProvider.installedProviders();
        java.time.LocalTime localTime5 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime7 = localTime5.minusNanos((long) 0);
        java.time.LocalTime localTime9 = localTime7.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime11 = localTime9.atOffset(zoneOffset10);
        java.time.OffsetTime offsetTime13 = offsetTime11.minusSeconds((long) 59);
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime20 = localTime18.minusNanos((long) 0);
        java.time.LocalTime localTime22 = localTime20.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime24 = localTime22.atOffset(zoneOffset23);
        java.time.OffsetTime offsetTime26 = offsetTime24.minusSeconds((long) 59);
        java.time.LocalTime localTime31 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime33 = localTime31.minusNanos((long) 0);
        java.time.LocalTime localTime35 = localTime33.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime37 = localTime35.atOffset(zoneOffset36);
        java.time.OffsetTime offsetTime39 = offsetTime37.minusSeconds((long) 59);
        java.time.LocalTime localTime44 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime46 = localTime44.minusNanos((long) 0);
        java.time.LocalTime localTime48 = localTime46.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset49 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime50 = localTime48.atOffset(zoneOffset49);
        java.time.OffsetTime offsetTime52 = offsetTime50.minusSeconds((long) 59);
        java.time.LocalTime localTime57 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime59 = localTime57.minusNanos((long) 0);
        java.time.LocalTime localTime61 = localTime59.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset62 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime63 = localTime61.atOffset(zoneOffset62);
        java.time.Duration duration65 = java.time.Duration.ofDays((long) 0);
        java.time.OffsetTime offsetTime66 = offsetTime63.plus((java.time.temporal.TemporalAmount) duration65);
        java.time.LocalTime localTime71 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime73 = localTime71.minusNanos((long) 0);
        java.time.LocalTime localTime75 = localTime73.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset76 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime77 = localTime75.atOffset(zoneOffset76);
        java.time.OffsetTime[] offsetTimeArray78 = new java.time.OffsetTime[] { offsetTime11, offsetTime26, offsetTime39, offsetTime52, offsetTime63, offsetTime77 };
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime[] offsetTimeArray79 = fileSystemProviderList0.toArray(offsetTimeArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileSystemProviderList0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetTime39);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(zoneOffset49);
        org.junit.Assert.assertNotNull(offsetTime50);
        org.junit.Assert.assertNotNull(offsetTime52);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(zoneOffset62);
        org.junit.Assert.assertNotNull(offsetTime63);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(offsetTime66);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(zoneOffset76);
        org.junit.Assert.assertNotNull(offsetTime77);
        org.junit.Assert.assertNotNull(offsetTimeArray78);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.ofLocale(locale0);
        boolean boolean3 = chronology1.isLeapYear(0L);
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate7 = localDate5.plusMonths((long) (short) 100);
        java.time.chrono.Era era8 = localDate7.getEra();
        java.time.chrono.ChronoLocalDate chronoLocalDate11 = chronology1.dateYearDay(era8, (int) '#', 126);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime18 = localTime16.minusNanos((long) 0);
        java.time.LocalDate localDate20 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate22 = localDate20.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime26 = localDate20.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal27 = localTime16.adjustInto((java.time.temporal.Temporal) localDateTime26);
        java.time.LocalDateTime localDateTime29 = localDateTime26.plusMonths((long) 1);
        java.time.temporal.Temporal temporal30 = era8.adjustInto((java.time.temporal.Temporal) localDateTime29);
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology32 = java.time.chrono.Chronology.ofLocale(locale31);
        boolean boolean34 = chronology32.isLeapYear(0L);
        java.time.LocalDate localDate36 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate38 = localDate36.plusMonths((long) (short) 100);
        java.time.chrono.Era era39 = localDate38.getEra();
        java.time.chrono.ChronoLocalDate chronoLocalDate42 = chronology32.dateYearDay(era39, (int) '#', 126);
        java.time.temporal.Temporal temporal43 = era8.adjustInto((java.time.temporal.Temporal) chronoLocalDate42);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + era8 + "' != '" + java.time.chrono.IsoEra.CE + "'", era8.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoLocalDate11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(temporal27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(temporal30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + era39 + "' != '" + java.time.chrono.IsoEra.CE + "'", era39.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoLocalDate42);
        org.junit.Assert.assertNotNull(temporal43);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLoopbackAddress();
        boolean boolean1 = inetAddress0.isMulticastAddress();
        boolean boolean2 = inetAddress0.isSiteLocalAddress();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.io.File file1 = new java.io.File("java.security.GeneralSecurityException: ");
        boolean boolean4 = file1.setWritable(true, true);
        java.io.File file6 = new java.io.File("java.security.GeneralSecurityException: ");
        boolean boolean7 = file6.setReadOnly();
        int int8 = file1.compareTo(file6);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.security.GeneralSecurityException: ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "java.security.GeneralSecurityException: ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = byteBuffer4.getInt((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            longStream0.forEach(longConsumer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int int0 = org.mockito.asm.ClassWriter.COMPUTE_MAXS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.ofLocale(locale0);
        boolean boolean3 = chronology1.isLeapYear(0L);
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate7 = localDate5.plusMonths((long) (short) 100);
        java.time.chrono.Era era8 = localDate7.getEra();
        java.time.chrono.ChronoLocalDate chronoLocalDate11 = chronology1.dateYearDay(era8, (int) '#', 126);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime18 = localTime16.minusNanos((long) 0);
        java.time.LocalDate localDate20 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate22 = localDate20.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime26 = localDate20.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal27 = localTime16.adjustInto((java.time.temporal.Temporal) localDateTime26);
        java.time.LocalDateTime localDateTime29 = localDateTime26.plusMonths((long) 1);
        java.time.temporal.Temporal temporal30 = era8.adjustInto((java.time.temporal.Temporal) localDateTime29);
        java.time.LocalTime localTime35 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime37 = localTime35.minusNanos((long) 0);
        java.time.LocalDate localDate39 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate41 = localDate39.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime45 = localDate39.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal46 = localTime35.adjustInto((java.time.temporal.Temporal) localDateTime45);
        java.time.LocalDateTime localDateTime48 = localDateTime45.plusMonths((long) 1);
        boolean boolean49 = localDateTime29.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime45);
        java.time.temporal.ChronoField chronoField50 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate52 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long53 = chronoField50.getFrom((java.time.temporal.TemporalAccessor) localDate52);
        java.time.temporal.TemporalUnit temporalUnit54 = chronoField50.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime56 = localDateTime29.with((java.time.temporal.TemporalField) chronoField50, (long) (short) 100);
        java.time.format.DateTimeFormatter dateTimeFormatter57 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        java.time.format.DecimalStyle decimalStyle58 = dateTimeFormatter57.getDecimalStyle();
        java.time.temporal.ChronoField chronoField59 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        java.time.temporal.ChronoField chronoField60 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate62 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long63 = chronoField60.getFrom((java.time.temporal.TemporalAccessor) localDate62);
        java.time.temporal.TemporalUnit temporalUnit64 = chronoField60.getRangeUnit();
        java.time.temporal.ChronoField chronoField65 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.ChronoField chronoField66 = java.time.temporal.ChronoField.YEAR_OF_ERA;
        java.time.temporal.TemporalField[] temporalFieldArray67 = new java.time.temporal.TemporalField[] { chronoField59, chronoField60, chronoField65, chronoField66 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet68 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet68, temporalFieldArray67);
        java.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter57.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = localDateTime29.format(dateTimeFormatter57);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + era8 + "' != '" + java.time.chrono.IsoEra.CE + "'", era8.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoLocalDate11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(temporal27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(temporal30);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(temporal46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + chronoField50 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField50.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 23640L + "'", long53 == 23640L);
        org.junit.Assert.assertTrue("'" + temporalUnit54 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit54.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime56);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(decimalStyle58);
        org.junit.Assert.assertTrue("'" + chronoField59 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField59.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + chronoField60 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField60.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 23640L + "'", long63 == 23640L);
        org.junit.Assert.assertTrue("'" + temporalUnit64 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit64.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + chronoField65 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField65.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + chronoField66 + "' != '" + java.time.temporal.ChronoField.YEAR_OF_ERA + "'", chronoField66.equals(java.time.temporal.ChronoField.YEAR_OF_ERA));
        org.junit.Assert.assertNotNull(temporalFieldArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        short[] shortArray3 = new short[] { (short) 100, (byte) -1, (short) -1 };
        java.nio.ShortBuffer shortBuffer4 = java.nio.ShortBuffer.wrap(shortArray3);
        short short5 = shortBuffer4.get();
        short[] shortArray9 = new short[] { (short) 100, (byte) -1, (short) -1 };
        java.nio.ShortBuffer shortBuffer10 = java.nio.ShortBuffer.wrap(shortArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer13 = shortBuffer4.get(shortArray9, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, -1, -1]");
        org.junit.Assert.assertNotNull(shortBuffer4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[100, -1, -1]");
        org.junit.Assert.assertNotNull(shortBuffer10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate3 = localDate1.plusMonths((long) (short) 100);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField4.getBaseUnit();
        boolean boolean6 = localDate3.isSupported(temporalUnit5);
        java.time.LocalTime localTime11 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime13 = localTime11.minusNanos((long) 0);
        java.time.LocalTime localTime15 = localTime13.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime17 = localTime15.atOffset(zoneOffset16);
        java.time.Duration duration19 = java.time.Duration.ofDays((long) 0);
        java.time.OffsetTime offsetTime20 = offsetTime17.plus((java.time.temporal.TemporalAmount) duration19);
        java.time.LocalDate localDate22 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate24 = localDate22.plusMonths((long) (short) 100);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit26 = chronoField25.getBaseUnit();
        boolean boolean27 = localDate24.isSupported(temporalUnit26);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = localDate3.until((java.time.temporal.Temporal) offsetTime20, temporalUnit26);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDate from TemporalAccessor: 22:58:01.000000010-18:00 of type java.time.OffsetTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField4.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField25.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit26 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit26.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.time.Month month0 = java.time.Month.FEBRUARY;
        int int1 = month0.getValue();
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.FEBRUARY + "'", month0.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(31);
        java.nio.IntBuffer intBuffer2 = intBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = intBuffer2.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(intBuffer2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1.0f);
        java.util.Spliterator.OfDouble ofDouble2 = doubleStream1.spliterator();
        long long3 = ofDouble2.estimateSize();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = ofDouble2.tryAdvance(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(ofDouble2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate10 = localDate8.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime14 = localDate8.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal15 = localTime4.adjustInto((java.time.temporal.Temporal) localDateTime14);
        java.time.LocalDate localDate17 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate19 = localDate17.plusMonths((long) (short) 100);
        java.time.chrono.Era era20 = localDate19.getEra();
        boolean boolean21 = localDateTime14.equals((java.lang.Object) localDate19);
        java.time.LocalDate localDate23 = localDate19.plusDays((long) '/');
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(temporal15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + era20 + "' != '" + java.time.chrono.IsoEra.CE + "'", era20.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.reflect.Method method0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes(method0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn(256, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1.0f);
        java.util.Spliterator.OfDouble ofDouble2 = doubleStream1.spliterator();
        long long3 = ofDouble2.estimateSize();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            ofDouble2.forEachRemaining(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(ofDouble2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (byte) -1);
        java.util.OptionalInt optionalInt2 = intStream1.findAny();
        java.util.stream.IntStream intStream3 = intStream1.sequential();
        java.util.stream.IntStream intStream4 = intStream3.unordered();
        java.util.stream.IntStream intStream5 = intStream4.unordered();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = intStream4.limit((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.OffsetTime offsetTime12 = offsetTime10.minusSeconds((long) 59);
        java.util.OptionalInt optionalInt14 = java.util.OptionalInt.empty();
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit16 = chronoField15.getBaseUnit();
        boolean boolean17 = optionalInt14.equals((java.lang.Object) temporalUnit16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime18 = offsetTime12.minus((long) 126, temporalUnit16);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(optionalInt14);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField15.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit16 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit16.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean1 = strSet0.isEmpty();
        java.util.Set<java.lang.String> strSet2 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean3 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet2);
        boolean boolean4 = strSet2.isEmpty();
        java.lang.Object[] objArray5 = strSet2.toArray();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.time.Month month0 = java.time.Month.NOVEMBER;
        java.time.DayOfWeek dayOfWeek1 = java.time.DayOfWeek.WEDNESDAY;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long5 = chronoField2.getFrom((java.time.temporal.TemporalAccessor) localDate4);
        long long7 = chronoField2.checkValidValue((-1L));
        boolean boolean8 = dayOfWeek1.isSupported((java.time.temporal.TemporalField) chronoField2);
        boolean boolean9 = month0.isSupported((java.time.temporal.TemporalField) chronoField2);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.NOVEMBER + "'", month0.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertTrue("'" + dayOfWeek1 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek1.equals(java.time.DayOfWeek.WEDNESDAY));
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField2.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 23640L + "'", long5 == 23640L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1.0f);
        java.util.stream.DoubleStream doubleStream3 = doubleStream1.skip((long) 0);
        java.util.OptionalDouble optionalDouble4 = doubleStream1.max();
        java.lang.String str5 = optionalDouble4.toString();
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[1.0]" + "'", str5, "OptionalDouble[1.0]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate10 = localDate8.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime14 = localDate8.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal15 = localTime4.adjustInto((java.time.temporal.Temporal) localDateTime14);
        java.time.LocalDateTime localDateTime17 = localDateTime14.plusMonths((long) 1);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localDateTime17.format(dateTimeFormatter18);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(temporal15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException("\u661f\u671f\u4e94");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream2 = longStream0.skip((long) '/');
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate3 = localDate1.plusMonths((long) (short) 100);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField4.getBaseUnit();
        boolean boolean6 = localDate3.isSupported(temporalUnit5);
        int int7 = localDate3.lengthOfYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField4.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        boolean boolean1 = strMap0.isEmpty();
        java.nio.charset.Charset charset3 = null;
        java.nio.charset.Charset charset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strMap0.replace("localhost/127.0.0.1", charset3, charset4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MONTH_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.MONTH_OF_YEAR));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        int int0 = org.mockito.cglib.core.CodeEmitter.OR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.net.Proxy proxy0 = java.net.Proxy.NO_PROXY;
        java.net.Proxy.Type type1 = proxy0.type();
        org.junit.Assert.assertNotNull(proxy0);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + java.net.Proxy.Type.DIRECT + "'", type1.equals(java.net.Proxy.Type.DIRECT));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.ofLocale(locale0);
        boolean boolean3 = chronology1.isLeapYear(0L);
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate7 = localDate5.plusMonths((long) (short) 100);
        java.time.chrono.Era era8 = localDate7.getEra();
        java.time.chrono.ChronoLocalDate chronoLocalDate11 = chronology1.dateYearDay(era8, (int) '#', 126);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime18 = localTime16.minusNanos((long) 0);
        java.time.LocalDate localDate20 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate22 = localDate20.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime26 = localDate20.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal27 = localTime16.adjustInto((java.time.temporal.Temporal) localDateTime26);
        java.time.LocalDateTime localDateTime29 = localDateTime26.plusMonths((long) 1);
        java.time.temporal.Temporal temporal30 = era8.adjustInto((java.time.temporal.Temporal) localDateTime29);
        java.time.LocalTime localTime35 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime37 = localTime35.minusNanos((long) 0);
        java.time.LocalDate localDate39 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate41 = localDate39.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime45 = localDate39.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal46 = localTime35.adjustInto((java.time.temporal.Temporal) localDateTime45);
        java.time.LocalDateTime localDateTime48 = localDateTime45.plusMonths((long) 1);
        boolean boolean49 = localDateTime29.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime45);
        java.time.LocalDateTime localDateTime51 = localDateTime45.plusMonths((long) 4096);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + era8 + "' != '" + java.time.chrono.IsoEra.CE + "'", era8.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoLocalDate11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(temporal27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(temporal30);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(temporal46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(localDateTime51);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.io.UnsupportedEncodingException unsupportedEncodingException0 = new java.io.UnsupportedEncodingException();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray3);
        boolean boolean5 = byteBuffer4.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer7 = byteBuffer4.position(4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.net.Proxy proxy0 = java.net.Proxy.NO_PROXY;
        java.util.stream.DoubleStream doubleStream2 = java.util.stream.DoubleStream.of((double) 1.0f);
        java.util.stream.DoubleStream doubleStream4 = doubleStream2.skip((long) 0);
        boolean boolean5 = proxy0.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(proxy0);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.net.SocketException socketException0 = new java.net.SocketException();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.LocalTime localTime12 = localTime8.plusNanos((long) 1);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (byte) -1);
        java.util.OptionalInt optionalInt2 = intStream1.findAny();
        java.util.stream.IntStream intStream3 = intStream1.parallel();
        java.util.function.IntPredicate intPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = intStream3.anyMatch(intPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        boolean boolean1 = strMap0.isEmpty();
        java.util.Set<java.lang.String> strSet2 = strMap0.keySet();
        java.util.Set<java.lang.String> strSet3 = strMap0.keySet();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.net.FileNameMap fileNameMap0 = null;
        java.net.URLConnection.setFileNameMap(fileNameMap0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime8 = localTime4.withMinute((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.ofLocale(locale0);
        boolean boolean3 = chronology1.isLeapYear(0L);
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate7 = localDate5.plusMonths((long) (short) 100);
        java.time.chrono.Era era8 = localDate7.getEra();
        java.time.chrono.ChronoLocalDate chronoLocalDate11 = chronology1.dateYearDay(era8, (int) '#', 126);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime18 = localTime16.minusNanos((long) 0);
        java.time.LocalDate localDate20 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate22 = localDate20.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime26 = localDate20.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal27 = localTime16.adjustInto((java.time.temporal.Temporal) localDateTime26);
        java.time.LocalDateTime localDateTime29 = localDateTime26.plusMonths((long) 1);
        java.time.temporal.Temporal temporal30 = era8.adjustInto((java.time.temporal.Temporal) localDateTime29);
        java.time.LocalTime localTime35 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime37 = localTime35.minusNanos((long) 0);
        java.time.LocalDate localDate39 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate41 = localDate39.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime45 = localDate39.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal46 = localTime35.adjustInto((java.time.temporal.Temporal) localDateTime45);
        java.time.LocalDateTime localDateTime48 = localDateTime45.plusMonths((long) 1);
        boolean boolean49 = localDateTime29.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime45);
        java.time.temporal.ChronoField chronoField50 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate52 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long53 = chronoField50.getFrom((java.time.temporal.TemporalAccessor) localDate52);
        java.time.temporal.TemporalUnit temporalUnit54 = chronoField50.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime56 = localDateTime29.with((java.time.temporal.TemporalField) chronoField50, (long) (short) 100);
        java.time.LocalDate localDate57 = java.time.LocalDate.MAX;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal58 = localDateChronoLocalDateTime56.adjustInto((java.time.temporal.Temporal) localDate57);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + era8 + "' != '" + java.time.chrono.IsoEra.CE + "'", era8.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoLocalDate11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(temporal27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(temporal30);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(temporal46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + chronoField50 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField50.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 23640L + "'", long53 == 23640L);
        org.junit.Assert.assertTrue("'" + temporalUnit54 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit54.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime56);
        org.junit.Assert.assertNotNull(localDate57);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.ofLocale(locale0);
        boolean boolean3 = chronology1.isLeapYear(0L);
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate7 = localDate5.plusMonths((long) (short) 100);
        java.time.chrono.Era era8 = localDate7.getEra();
        java.time.chrono.ChronoLocalDate chronoLocalDate11 = chronology1.dateYearDay(era8, (int) '#', 126);
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology13 = java.time.chrono.Chronology.ofLocale(locale12);
        boolean boolean15 = chronology13.isLeapYear(0L);
        java.time.LocalDate localDate17 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate19 = localDate17.plusMonths((long) (short) 100);
        java.time.chrono.Era era20 = localDate19.getEra();
        java.time.chrono.ChronoLocalDate chronoLocalDate23 = chronology13.dateYearDay(era20, (int) '#', 126);
        java.time.LocalTime localTime28 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime30 = localTime28.minusNanos((long) 0);
        java.time.LocalDate localDate32 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate34 = localDate32.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime38 = localDate32.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal39 = localTime28.adjustInto((java.time.temporal.Temporal) localDateTime38);
        java.time.LocalDateTime localDateTime41 = localDateTime38.plusMonths((long) 1);
        java.time.temporal.Temporal temporal42 = era20.adjustInto((java.time.temporal.Temporal) localDateTime41);
        java.time.chrono.ChronoLocalDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoLocalDateTime43 = chronology1.localDateTime((java.time.temporal.TemporalAccessor) localDateTime41);
        java.time.ZoneOffset zoneOffset46 = java.time.ZoneOffset.MIN;
        java.time.LocalDateTime localDateTime47 = java.time.LocalDateTime.ofEpochSecond((long) '4', (int) (byte) 10, zoneOffset46);
        java.time.format.TextStyle textStyle48 = java.time.format.TextStyle.SHORT_STANDALONE;
        java.util.Locale locale49 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale50 = locale49.stripExtensions();
        java.lang.String str51 = zoneOffset46.getDisplayName(textStyle48, locale50);
        java.time.OffsetDateTime offsetDateTime52 = java.time.OffsetDateTime.of(localDateTime41, zoneOffset46);
        java.time.OffsetDateTime offsetDateTime54 = offsetDateTime52.withYear(16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + era8 + "' != '" + java.time.chrono.IsoEra.CE + "'", era8.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoLocalDate11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + era20 + "' != '" + java.time.chrono.IsoEra.CE + "'", era20.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoLocalDate23);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(temporal39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(temporal42);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime43);
        org.junit.Assert.assertNotNull(zoneOffset46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + textStyle48 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle48.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-18:00" + "'", str51, "-18:00");
        org.junit.Assert.assertNotNull(offsetDateTime52);
        org.junit.Assert.assertNotNull(offsetDateTime54);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.net.UnknownHostException unknownHostException1 = new java.net.UnknownHostException("OptionalDouble[1.0]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.OVERFLOW;
        boolean boolean1 = coderResult0.isMalformed();
        org.junit.Assert.assertNotNull(coderResult0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream1 = longStream0.sorted();
        java.util.function.LongPredicate longPredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream3 = longStream1.filter(longPredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        short[] shortArray3 = new short[] { (short) 100, (byte) -1, (short) -1 };
        java.nio.ShortBuffer shortBuffer4 = java.nio.ShortBuffer.wrap(shortArray3);
        java.nio.ShortBuffer shortBuffer5 = shortBuffer4.asReadOnlyBuffer();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, -1, -1]");
        org.junit.Assert.assertNotNull(shortBuffer4);
        org.junit.Assert.assertNotNull(shortBuffer5);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 16);
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime8 = localTime6.minusNanos((long) 0);
        java.time.LocalTime localTime10 = localTime8.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime12 = localTime10.atOffset(zoneOffset11);
        java.time.zone.ZoneRules zoneRules13 = zoneOffset11.getRules();
        java.time.Instant instant15 = java.time.Instant.ofEpochMilli((long) 16);
        java.time.ZoneOffset zoneOffset16 = zoneRules13.getOffset(instant15);
        boolean boolean17 = instant1.equals((java.lang.Object) zoneRules13);
        java.time.LocalTime localTime22 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime24 = localTime22.minusNanos((long) 0);
        java.time.LocalTime localTime26 = localTime24.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime28 = localTime26.atOffset(zoneOffset27);
        java.time.zone.ZoneRules zoneRules29 = zoneOffset27.getRules();
        java.time.Instant instant31 = java.time.Instant.ofEpochMilli((long) 16);
        java.time.ZoneOffset zoneOffset32 = zoneRules29.getOffset(instant31);
        java.time.LocalTime localTime37 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime39 = localTime37.minusNanos((long) 0);
        java.time.LocalTime localTime41 = localTime39.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime43 = localTime41.atOffset(zoneOffset42);
        java.time.Clock clock44 = java.time.Clock.fixed(instant31, (java.time.ZoneId) zoneOffset42);
        java.time.OffsetTime offsetTime45 = java.time.OffsetTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset42);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(zoneRules13);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(offsetTime43);
        org.junit.Assert.assertNotNull(clock44);
        org.junit.Assert.assertNotNull(offsetTime45);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str2 = localDate1.toString();
        int int3 = localDate1.lengthOfMonth();
        int int4 = localDate1.lengthOfYear();
        java.time.DayOfWeek dayOfWeek5 = java.time.DayOfWeek.from((java.time.temporal.TemporalAccessor) localDate1);
        java.time.format.TextStyle textStyle6 = java.time.format.TextStyle.SHORT_STANDALONE;
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = dayOfWeek5.getDisplayName(textStyle6, locale7);
        java.util.Locale.setDefault(locale7);
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MIN;
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) '4', (int) (byte) 10, zoneOffset13);
        java.time.format.TextStyle textStyle15 = java.time.format.TextStyle.SHORT_STANDALONE;
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = zoneOffset13.getDisplayName(textStyle15, locale17);
        boolean boolean19 = locale7.equals((java.lang.Object) zoneOffset13);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-02" + "'", str2, "1970-01-02");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertTrue("'" + dayOfWeek5 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek5.equals(java.time.DayOfWeek.FRIDAY));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle6.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u661f\u671f\u4e94" + "'", str9, "\u661f\u671f\u4e94");
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + textStyle15 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle15.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-18:00" + "'", str18, "-18:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        boolean boolean1 = strMap0.isEmpty();
        java.util.Set<java.lang.String> strSet2 = strMap0.keySet();
        java.nio.charset.Charset charset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset5 = strMap0.put("\u661f\u671f\u4e94", charset4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate10 = localDate8.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime14 = localDate8.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal15 = localTime4.adjustInto((java.time.temporal.Temporal) localDateTime14);
        java.time.LocalDateTime localDateTime17 = localDateTime14.plusMonths((long) 1);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean19 = localDateTime17.isSupported((java.time.temporal.TemporalField) chronoField18);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(temporal15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField18.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.WEDNESDAY;
        java.time.DayOfWeek dayOfWeek2 = dayOfWeek0.plus((long) 'u');
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.WEDNESDAY));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.MONDAY));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(31);
        java.nio.IntBuffer intBuffer2 = intBuffer1.compact();
        java.nio.IntBuffer intBuffer4 = java.nio.IntBuffer.allocate(31);
        java.nio.IntBuffer intBuffer5 = intBuffer4.compact();
        int int6 = intBuffer1.compareTo(intBuffer5);
        int[] intArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer8 = intBuffer1.put(intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(intBuffer2);
        org.junit.Assert.assertNotNull(intBuffer4);
        org.junit.Assert.assertNotNull(intBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLoopbackAddress();
        boolean boolean1 = inetAddress0.isMulticastAddress();
        java.net.NetworkInterface networkInterface2 = java.net.NetworkInterface.getByInetAddress(inetAddress0);
        java.util.List<java.net.InterfaceAddress> interfaceAddressList3 = networkInterface2.getInterfaceAddresses();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(networkInterface2);
        org.junit.Assert.assertNotNull(interfaceAddressList3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress2 = java.net.InetAddress.getByAddress(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Optional.empty");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            printStream1.write(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.time.Month month0 = java.time.Month.AUGUST;
        java.time.Month month2 = month0.minus((long) 2);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.AUGUST + "'", month0.equals(java.time.Month.AUGUST));
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.JUNE + "'", month2.equals(java.time.Month.JUNE));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.Duration duration12 = java.time.Duration.ofDays((long) 0);
        java.time.OffsetTime offsetTime13 = offsetTime10.plus((java.time.temporal.TemporalAmount) duration12);
        java.time.OffsetTime offsetTime15 = offsetTime10.minusNanos(23640L);
        java.time.LocalTime localTime20 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime22 = localTime20.minusNanos((long) 0);
        java.time.LocalTime localTime24 = localTime22.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime26 = localTime24.atOffset(zoneOffset25);
        java.time.Duration duration28 = java.time.Duration.ofDays((long) 0);
        java.time.OffsetTime offsetTime29 = offsetTime26.plus((java.time.temporal.TemporalAmount) duration28);
        java.time.OffsetTime offsetTime31 = offsetTime26.minusNanos(23640L);
        java.time.OffsetTime offsetTime33 = offsetTime26.plusHours(10L);
        boolean boolean34 = offsetTime10.isBefore(offsetTime26);
        java.time.OffsetTime offsetTime36 = offsetTime10.minusNanos((long) 365);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(offsetTime29);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(offsetTime36);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1.0f);
        java.util.stream.DoubleStream doubleStream3 = doubleStream1.skip((long) 0);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = doubleStream1.reduce((double) 'a', doubleBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.asm.Type.getDescriptor(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLoopbackAddress();
        boolean boolean1 = inetAddress0.isMulticastAddress();
        java.lang.String str2 = inetAddress0.toString();
        boolean boolean3 = inetAddress0.isLoopbackAddress();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "localhost/127.0.0.1" + "'", str2, "localhost/127.0.0.1");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Enumeration<java.lang.Object> objEnumeration2 = properties1.elements();
        org.junit.Assert.assertNotNull(objEnumeration2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.duplicate();
        boolean boolean3 = floatBuffer2.isDirect();
        float[] floatArray4 = new float[] {};
        java.nio.FloatBuffer floatBuffer5 = java.nio.FloatBuffer.wrap(floatArray4);
        java.nio.FloatBuffer floatBuffer6 = floatBuffer5.duplicate();
        java.nio.FloatBuffer floatBuffer7 = floatBuffer2.put(floatBuffer5);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatBuffer5);
        org.junit.Assert.assertNotNull(floatBuffer6);
        org.junit.Assert.assertNotNull(floatBuffer7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.function.LongUnaryOperator longUnaryOperator0 = java.util.function.LongUnaryOperator.identity();
        long long2 = longUnaryOperator0.applyAsLong((long) (byte) 100);
        org.junit.Assert.assertNotNull(longUnaryOperator0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.time.Duration duration1 = java.time.Duration.ofHours((long) (short) 100);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.Duration duration12 = java.time.Duration.ofDays((long) 0);
        java.time.OffsetTime offsetTime13 = offsetTime10.plus((java.time.temporal.TemporalAmount) duration12);
        java.time.OffsetTime offsetTime15 = offsetTime10.minusNanos(23640L);
        java.time.OffsetTime offsetTime17 = offsetTime10.plusHours(10L);
        java.time.OffsetTime offsetTime19 = offsetTime10.minusNanos((long) 256);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.stream.IntStream.Builder builder0 = java.util.stream.IntStream.builder();
        builder0.accept((-1));
        java.util.stream.IntStream.Builder builder4 = builder0.add(256);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.io.FileNotFoundException fileNotFoundException1 = new java.io.FileNotFoundException("-18:00");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.lang.Throwable throwable1 = null;
        java.security.SignatureException signatureException2 = new java.security.SignatureException("CN", throwable1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.security.KeyException keyException0 = new java.security.KeyException();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.LocalTime localTime5 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime7 = localTime5.minusNanos((long) 0);
        java.time.LocalDate localDate9 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate11 = localDate9.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime15 = localDate9.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal16 = localTime5.adjustInto((java.time.temporal.Temporal) localDateTime15);
        int int17 = localDateTime15.getDayOfYear();
        java.time.temporal.ValueRange valueRange18 = chronoField0.rangeRefinedBy((java.time.temporal.TemporalAccessor) localDateTime15);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(temporal16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(valueRange18);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        java.time.format.DecimalStyle decimalStyle1 = dateTimeFormatter0.getDecimalStyle();
        char char2 = decimalStyle1.getPositiveSign();
        java.time.format.DecimalStyle decimalStyle4 = decimalStyle1.withZeroDigit('+');
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '+' + "'", char2 == '+');
        org.junit.Assert.assertNotNull(decimalStyle4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.stream.LongStream longStream1 = longStream0.sorted();
        java.util.OptionalLong optionalLong2 = longStream1.findFirst();
        java.util.function.LongSupplier longSupplier3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = optionalLong2.orElseGet(longSupplier3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(optionalLong2);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn(31, "OptionalDouble[1.0]", "OptionalDouble[1.0]", "OptionalDouble[1.0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        java.time.format.DecimalStyle decimalStyle1 = dateTimeFormatter0.getDecimalStyle();
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long6 = chronoField3.getFrom((java.time.temporal.TemporalAccessor) localDate5);
        java.time.temporal.TemporalUnit temporalUnit7 = chronoField3.getRangeUnit();
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR_OF_ERA;
        java.time.temporal.TemporalField[] temporalFieldArray10 = new java.time.temporal.TemporalField[] { chronoField2, chronoField3, chronoField8, chronoField9 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet11 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet11, temporalFieldArray10);
        java.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter0.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        java.time.format.DecimalStyle decimalStyle15 = dateTimeFormatter14.getDecimalStyle();
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate19 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long20 = chronoField17.getFrom((java.time.temporal.TemporalAccessor) localDate19);
        java.time.temporal.TemporalUnit temporalUnit21 = chronoField17.getRangeUnit();
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.YEAR_OF_ERA;
        java.time.temporal.TemporalField[] temporalFieldArray24 = new java.time.temporal.TemporalField[] { chronoField16, chronoField17, chronoField22, chronoField23 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet25 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet25, temporalFieldArray24);
        java.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter14.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet25);
        java.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter13.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet25);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField2.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField3.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 23640L + "'", long6 == 23640L);
        org.junit.Assert.assertTrue("'" + temporalUnit7 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit7.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField8.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR_OF_ERA + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR_OF_ERA));
        org.junit.Assert.assertNotNull(temporalFieldArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(decimalStyle15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField16.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField17.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 23640L + "'", long20 == 23640L);
        org.junit.Assert.assertTrue("'" + temporalUnit21 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit21.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField22.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.YEAR_OF_ERA + "'", chronoField23.equals(java.time.temporal.ChronoField.YEAR_OF_ERA));
        org.junit.Assert.assertNotNull(temporalFieldArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray3);
        boolean boolean5 = byteBuffer4.hasArray();
        java.nio.Buffer buffer6 = byteBuffer4.rewind();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(buffer6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.nio.charset.CodingErrorAction codingErrorAction0 = java.nio.charset.CodingErrorAction.REPLACE;
        org.junit.Assert.assertNotNull(codingErrorAction0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.io.File file1 = new java.io.File("java.security.GeneralSecurityException: ");
        boolean boolean4 = file1.setWritable(true, true);
        java.nio.file.Path path5 = file1.toPath();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.security.GeneralSecurityException: ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(path5);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str2 = localDate1.toString();
        java.time.LocalDate localDate4 = localDate1.minusYears(23640L);
        java.time.LocalDate localDate6 = localDate4.minusYears((long) 10);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-02" + "'", str2, "1970-01-02");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray3);
        boolean boolean5 = byteBuffer4.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = byteBuffer4.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.net.InetAddress inetAddress1 = java.net.InetAddress.getLoopbackAddress();
        byte[] byteArray2 = inetAddress1.getAddress();
        java.net.InetAddress inetAddress3 = java.net.InetAddress.getByAddress("zho", byteArray2);
        org.junit.Assert.assertNotNull(inetAddress1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[127, 0, 0, 1]");
        org.junit.Assert.assertNotNull(inetAddress3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.io.File file1 = new java.io.File("java.security.GeneralSecurityException: ");
        java.io.PrintStream printStream2 = new java.io.PrintStream(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.security.GeneralSecurityException: ");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.parse((java.lang.CharSequence) "java.security.GeneralSecurityException: ");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'java.security.GeneralSecurityException: ' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1.0f);
        java.util.stream.DoubleStream doubleStream3 = doubleStream1.skip((long) 0);
        java.util.OptionalDouble optionalDouble4 = doubleStream1.max();
        boolean boolean5 = doubleStream1.isParallel();
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((long) 16384);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (byte) -1);
        java.util.OptionalInt optionalInt2 = intStream1.findAny();
        java.util.stream.IntStream intStream3 = intStream1.parallel();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.Integer> intSpliterator4 = intStream1.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate3 = localDate1.plusMonths((long) (short) 100);
        java.time.temporal.TemporalField temporalField4 = null;
        boolean boolean5 = localDate3.isSupported(temporalField4);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.net.MalformedURLException malformedURLException1 = new java.net.MalformedURLException("Optional.empty");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1.0f);
        java.util.Spliterator.OfDouble ofDouble2 = doubleStream1.spliterator();
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = doubleStream1.onClose(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(ofDouble2);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean1 = strSet0.isEmpty();
        java.util.Set<java.lang.String> strSet2 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean3 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet2);
        boolean boolean4 = strSet2.isEmpty();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MICRO_OF_DAY;
        boolean boolean6 = strSet2.equals((java.lang.Object) chronoField5);
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        boolean boolean9 = strSet2.equals((java.lang.Object) localDate8);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MICRO_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.ofLocale(locale0);
        boolean boolean3 = chronology1.isLeapYear(0L);
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate7 = localDate5.plusMonths((long) (short) 100);
        java.time.chrono.Era era8 = localDate7.getEra();
        java.time.chrono.ChronoLocalDate chronoLocalDate11 = chronology1.dateYearDay(era8, (int) '#', 126);
        boolean boolean13 = chronology1.isLeapYear((long) 'a');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + era8 + "' != '" + java.time.chrono.IsoEra.CE + "'", era8.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoLocalDate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.MissingResourceException missingResourceException3 = new java.util.MissingResourceException("", "OptionalDouble[1.0]", "");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(31);
        java.nio.IntBuffer intBuffer2 = intBuffer1.compact();
        java.nio.IntBuffer intBuffer4 = java.nio.IntBuffer.allocate(31);
        java.nio.IntBuffer intBuffer5 = intBuffer4.compact();
        int int6 = intBuffer1.compareTo(intBuffer5);
        java.nio.IntBuffer intBuffer8 = java.nio.IntBuffer.allocate(31);
        java.nio.IntBuffer intBuffer9 = intBuffer8.compact();
        int int10 = intBuffer1.compareTo(intBuffer9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = intBuffer1.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(intBuffer2);
        org.junit.Assert.assertNotNull(intBuffer4);
        org.junit.Assert.assertNotNull(intBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intBuffer8);
        org.junit.Assert.assertNotNull(intBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range(10L, (long) 256);
        long long3 = longStream2.sum();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32595L + "'", long3 == 32595L);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.net.URISyntaxException uRISyntaxException2 = new java.net.URISyntaxException("1970-01-02", "java.security.GeneralSecurityException: ");
        int int3 = uRISyntaxException2.getIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.LocalDateTime localDateTime3 = localDateTime0.with((java.time.temporal.TemporalField) chronoField1, 10L);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField1.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 16);
        java.time.Instant instant3 = instant1.minusMillis((long) 365);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getBaseUnit();
        boolean boolean7 = temporalUnit6.isTimeBased();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant8 = instant1.plus((long) 16384, temporalUnit6);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField5.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.malformedForLength(1);
        java.lang.String str2 = coderResult1.toString();
        org.junit.Assert.assertNotNull(coderResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MALFORMED[1]" + "'", str2, "MALFORMED[1]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate10 = localDate8.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime14 = localDate8.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal15 = localTime4.adjustInto((java.time.temporal.Temporal) localDateTime14);
        java.time.LocalDateTime localDateTime17 = localDateTime14.plusMonths((long) 1);
        java.time.LocalDateTime localDateTime19 = localDateTime14.withYear((int) '#');
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(temporal15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.Duration duration12 = java.time.Duration.ofDays((long) 0);
        java.time.OffsetTime offsetTime13 = offsetTime10.plus((java.time.temporal.TemporalAmount) duration12);
        java.time.LocalDate localDate15 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str16 = localDate15.toString();
        int int17 = localDate15.lengthOfMonth();
        java.time.LocalDate localDate19 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str20 = localDate19.toString();
        int int21 = localDate19.lengthOfMonth();
        boolean boolean22 = localDate15.isEqual((java.time.chrono.ChronoLocalDate) localDate19);
        java.util.OptionalInt optionalInt24 = java.util.OptionalInt.empty();
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit26 = chronoField25.getBaseUnit();
        boolean boolean27 = optionalInt24.equals((java.lang.Object) temporalUnit26);
        java.time.chrono.ChronoLocalDate chronoLocalDate28 = localDate15.plus((long) 4, temporalUnit26);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime29 = offsetTime13.truncatedTo(temporalUnit26);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit is too large to be used for truncation");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-02" + "'", str16, "1970-01-02");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-02" + "'", str20, "1970-01-02");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(optionalInt24);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField25.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit26 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit26.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(chronoLocalDate28);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        int int1 = localTime0.getMinute();
        java.time.LocalTime localTime2 = java.time.LocalTime.MAX;
        boolean boolean3 = localTime0.isAfter(localTime2);
        java.time.LocalTime localTime5 = localTime2.plusNanos((long) 100);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 59 + "'", int1 == 59);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        int int11 = zoneOffset9.getTotalSeconds();
        java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.now((java.time.ZoneId) zoneOffset9);
        java.time.ZoneId zoneId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime14 = zonedDateTime12.withZoneSameLocal(zoneId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-64800) + "'", int11 == (-64800));
        org.junit.Assert.assertNotNull(zonedDateTime12);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        int int11 = zoneOffset9.getTotalSeconds();
        java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.now((java.time.ZoneId) zoneOffset9);
        int int13 = zonedDateTime12.getHour();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-64800) + "'", int11 == (-64800));
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        boolean boolean2 = floatBuffer1.hasArray();
        float[] floatArray3 = new float[] {};
        java.nio.FloatBuffer floatBuffer4 = java.nio.FloatBuffer.wrap(floatArray3);
        java.nio.FloatBuffer floatBuffer5 = floatBuffer4.duplicate();
        float[] floatArray6 = new float[] {};
        java.nio.FloatBuffer floatBuffer7 = java.nio.FloatBuffer.wrap(floatArray6);
        java.nio.FloatBuffer floatBuffer8 = floatBuffer5.get(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer11 = floatBuffer1.put(floatArray6, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(floatBuffer5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatBuffer7);
        org.junit.Assert.assertNotNull(floatBuffer8);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.ofLocale(locale0);
        java.time.chrono.ChronoLocalDate chronoLocalDate3 = chronology1.dateEpochDay((long) 126);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronoLocalDate3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (byte) -1);
        java.util.OptionalInt optionalInt2 = intStream1.findAny();
        java.util.stream.IntStream intStream3 = intStream1.sequential();
        java.util.stream.IntStream intStream4 = intStream1.unordered();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.text.ParseException parseException2 = new java.text.ParseException("", (int) (short) -1);
        int int3 = parseException2.getErrorOffset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str2 = localDate1.toString();
        java.time.LocalDate localDate4 = localDate1.minusYears(23640L);
        java.time.LocalTime localTime9 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime11 = localTime9.minusNanos((long) 0);
        java.time.LocalTime localTime13 = localTime11.minusMinutes((long) 'a');
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime20 = localTime18.minusNanos((long) 0);
        java.time.LocalTime localTime22 = localTime20.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime24 = localTime22.atOffset(zoneOffset23);
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.of(localDate1, localTime13, zoneOffset23);
        java.time.OffsetDateTime offsetDateTime27 = offsetDateTime25.minusNanos((long) 365);
        java.time.OffsetDateTime offsetDateTime29 = offsetDateTime27.minusSeconds((long) 10);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-02" + "'", str2, "1970-01-02");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(offsetDateTime29);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.security.cert.CertificateException certificateException0 = new java.security.cert.CertificateException();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str2 = localDate1.toString();
        java.time.LocalDate localDate4 = localDate1.minusYears(23640L);
        java.time.LocalTime localTime9 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime11 = localTime9.minusNanos((long) 0);
        java.time.LocalTime localTime13 = localTime11.minusMinutes((long) 'a');
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime20 = localTime18.minusNanos((long) 0);
        java.time.LocalTime localTime22 = localTime20.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime24 = localTime22.atOffset(zoneOffset23);
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.of(localDate1, localTime13, zoneOffset23);
        java.time.Duration duration27 = java.time.Duration.ofHours((-1L));
        long long28 = duration27.toHours();
        java.time.Duration duration30 = duration27.minusNanos((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate31 = localDate1.plus((java.time.temporal.TemporalAmount) duration27);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-02" + "'", str2, "1970-01-02");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(duration30);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        short[] shortArray3 = new short[] { (short) 100, (byte) -1, (short) -1 };
        java.nio.ShortBuffer shortBuffer4 = java.nio.ShortBuffer.wrap(shortArray3);
        short short5 = shortBuffer4.get();
        short[] shortArray9 = new short[] { (byte) 10, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer10 = shortBuffer4.get(shortArray9);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, -1, -1]");
        org.junit.Assert.assertNotNull(shortBuffer4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[10, 100, -1]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        java.time.format.DecimalStyle decimalStyle1 = dateTimeFormatter0.getDecimalStyle();
        java.util.Locale locale2 = dateTimeFormatter0.getLocale();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 16);
        java.time.Instant instant3 = instant1.minusMillis((long) 365);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.YEAR_OF_ERA;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant6 = instant3.with((java.time.temporal.TemporalField) chronoField4, 0L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for YearOfEra (valid values 1 - 999999999/1000000000): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.YEAR_OF_ERA + "'", chronoField4.equals(java.time.temporal.ChronoField.YEAR_OF_ERA));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        short[] shortArray3 = new short[] { (short) 100, (byte) -1, (short) -1 };
        java.nio.ShortBuffer shortBuffer4 = java.nio.ShortBuffer.wrap(shortArray3);
        java.nio.ShortBuffer shortBuffer5 = shortBuffer4.compact();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, -1, -1]");
        org.junit.Assert.assertNotNull(shortBuffer4);
        org.junit.Assert.assertNotNull(shortBuffer5);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.Date date5 = new java.util.Date((int) (short) -1, (int) (byte) 100, (int) '/', 105, 108);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jun 20 10:48:00 UTC 1907");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(31);
        java.nio.IntBuffer intBuffer2 = intBuffer1.compact();
        java.nio.IntBuffer intBuffer3 = intBuffer2.compact();
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(intBuffer2);
        org.junit.Assert.assertNotNull(intBuffer3);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.time.Month month0 = java.time.Month.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.SEPTEMBER + "'", month0.equals(java.time.Month.SEPTEMBER));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.Instant instant3 = java.time.Instant.ofEpochMilli((long) 16);
        java.time.LocalTime localTime8 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime10 = localTime8.minusNanos((long) 0);
        java.time.LocalTime localTime12 = localTime10.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime14 = localTime12.atOffset(zoneOffset13);
        java.time.zone.ZoneRules zoneRules15 = zoneOffset13.getRules();
        java.time.Instant instant17 = java.time.Instant.ofEpochMilli((long) 16);
        java.time.ZoneOffset zoneOffset18 = zoneRules15.getOffset(instant17);
        boolean boolean19 = instant3.equals((java.lang.Object) zoneRules15);
        boolean boolean21 = properties1.remove((java.lang.Object) zoneRules15, (java.lang.Object) (-1.0d));
        java.io.PrintStream printStream23 = new java.io.PrintStream("Optional.empty");
        properties1.list(printStream23);
        printStream23.print(false);
        printStream23.print((float) 11999999999L);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneRules15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.time.Month month0 = java.time.Month.AUGUST;
        java.time.format.TextStyle textStyle1 = java.time.format.TextStyle.SHORT_STANDALONE;
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = month0.getDisplayName(textStyle1, locale2);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.AUGUST + "'", month0.equals(java.time.Month.AUGUST));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle1.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6708" + "'", str4, "\u6708");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(4096);
        org.junit.Assert.assertNotNull(shortBuffer1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        int int0 = org.mockito.cglib.core.CodeEmitter.NE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 154 + "'", int0 == 154);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofTotalSeconds(128);
        org.junit.Assert.assertNotNull(zoneOffset1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.LocalDate localDate12 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate14 = localDate12.plusMonths((long) (short) 100);
        java.time.LocalDate localDate16 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate18 = localDate16.plusMonths((long) (short) 100);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit20 = chronoField19.getBaseUnit();
        boolean boolean21 = localDate18.isSupported(temporalUnit20);
        boolean boolean22 = localDate12.isEqual((java.time.chrono.ChronoLocalDate) localDate18);
        java.time.LocalDate localDate24 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate26 = localDate24.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime30 = localDate24.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit32 = chronoField31.getBaseUnit();
        boolean boolean33 = temporalUnit32.isTimeBased();
        boolean boolean34 = localDateTime30.equals((java.lang.Object) temporalUnit32);
        java.lang.String str35 = temporalUnit32.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long36 = localTime8.until((java.time.temporal.Temporal) localDate12, temporalUnit32);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalTime from TemporalAccessor: 1970-01-02 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField19.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit20 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit20.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField31.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit32 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit32.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Months" + "'", str35, "Months");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        java.util.Set<java.lang.String> strSet1 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean2 = strSet1.isEmpty();
        java.util.Set<java.lang.String> strSet3 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean4 = strSet1.containsAll((java.util.Collection<java.lang.String>) strSet3);
        boolean boolean5 = strSet3.isEmpty();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.MICRO_OF_DAY;
        boolean boolean7 = strSet3.equals((java.lang.Object) chronoField6);
        boolean boolean8 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet3);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_DAY + "'", chronoField6.equals(java.time.temporal.ChronoField.MICRO_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.zone.ZoneRules zoneRules11 = zoneOffset9.getRules();
        java.time.Instant instant13 = java.time.Instant.ofEpochMilli((long) 16);
        java.time.ZoneOffset zoneOffset14 = zoneRules11.getOffset(instant13);
        java.util.Date date15 = java.util.Date.from(instant13);
        boolean boolean17 = date15.equals((java.lang.Object) "Optional.empty");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.io.IOException iOException1 = new java.io.IOException("zho");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.io.UnsupportedEncodingException unsupportedEncodingException3 = new java.io.UnsupportedEncodingException("hi!");
        java.io.UnsupportedEncodingException unsupportedEncodingException5 = new java.io.UnsupportedEncodingException("hi!");
        unsupportedEncodingException3.addSuppressed((java.lang.Throwable) unsupportedEncodingException5);
        java.security.GeneralSecurityException generalSecurityException7 = new java.security.GeneralSecurityException("1970-01-02", (java.lang.Throwable) unsupportedEncodingException3);
        java.security.NoSuchAlgorithmException noSuchAlgorithmException8 = new java.security.NoSuchAlgorithmException("\u661f\u671f\u4e94", (java.lang.Throwable) generalSecurityException7);
        java.security.SignatureException signatureException9 = new java.security.SignatureException((java.lang.Throwable) generalSecurityException7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.Duration duration12 = java.time.Duration.ofDays((long) 0);
        java.time.OffsetTime offsetTime13 = offsetTime10.plus((java.time.temporal.TemporalAmount) duration12);
        java.time.OffsetTime offsetTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = offsetTime13.isEqual(offsetTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(offsetTime13);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.util.List<java.nio.file.spi.FileSystemProvider> fileSystemProviderList0 = java.nio.file.spi.FileSystemProvider.installedProviders();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.spi.FileSystemProvider fileSystemProvider2 = fileSystemProviderList0.get((-64800));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -64800");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileSystemProviderList0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.Instant instant3 = java.time.Instant.ofEpochMilli((long) 16);
        java.time.LocalTime localTime8 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime10 = localTime8.minusNanos((long) 0);
        java.time.LocalTime localTime12 = localTime10.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime14 = localTime12.atOffset(zoneOffset13);
        java.time.zone.ZoneRules zoneRules15 = zoneOffset13.getRules();
        java.time.Instant instant17 = java.time.Instant.ofEpochMilli((long) 16);
        java.time.ZoneOffset zoneOffset18 = zoneRules15.getOffset(instant17);
        boolean boolean19 = instant3.equals((java.lang.Object) zoneRules15);
        boolean boolean21 = properties1.remove((java.lang.Object) zoneRules15, (java.lang.Object) (-1.0d));
        java.io.PrintStream printStream23 = new java.io.PrintStream("Optional.empty");
        properties1.list(printStream23);
        printStream23.println('#');
        printStream23.println();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneRules15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology6 = java.time.chrono.Chronology.ofLocale(locale5);
        boolean boolean8 = chronology6.isLeapYear(0L);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate12 = localDate10.plusMonths((long) (short) 100);
        java.time.chrono.Era era13 = localDate12.getEra();
        java.time.chrono.ChronoLocalDate chronoLocalDate16 = chronology6.dateYearDay(era13, (int) '#', 126);
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.time.chrono.Chronology chronology18 = java.time.chrono.Chronology.ofLocale(locale17);
        boolean boolean20 = chronology18.isLeapYear(0L);
        java.time.LocalDate localDate22 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate24 = localDate22.plusMonths((long) (short) 100);
        java.time.chrono.Era era25 = localDate24.getEra();
        java.time.chrono.ChronoLocalDate chronoLocalDate28 = chronology18.dateYearDay(era25, (int) '#', 126);
        java.time.LocalTime localTime33 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime35 = localTime33.minusNanos((long) 0);
        java.time.LocalDate localDate37 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate39 = localDate37.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime43 = localDate37.atTime(0, (int) '4', (int) (byte) 1);
        java.time.temporal.Temporal temporal44 = localTime33.adjustInto((java.time.temporal.Temporal) localDateTime43);
        java.time.LocalDateTime localDateTime46 = localDateTime43.plusMonths((long) 1);
        java.time.temporal.Temporal temporal47 = era25.adjustInto((java.time.temporal.Temporal) localDateTime46);
        java.time.chrono.ChronoLocalDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoLocalDateTime48 = chronology6.localDateTime((java.time.temporal.TemporalAccessor) localDateTime46);
        java.time.chrono.ChronoLocalDate chronoLocalDate49 = chronology6.dateNow();
        java.time.LocalTime localTime54 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime56 = localTime54.minusNanos((long) 0);
        java.time.LocalTime localTime58 = localTime56.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset59 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime60 = localTime58.atOffset(zoneOffset59);
        java.time.OffsetTime offsetTime62 = offsetTime60.minusSeconds((long) 59);
        java.time.temporal.ChronoField chronoField63 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate65 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long66 = chronoField63.getFrom((java.time.temporal.TemporalAccessor) localDate65);
        java.time.temporal.TemporalUnit temporalUnit67 = chronoField63.getRangeUnit();
        boolean boolean68 = offsetTime62.isSupported(temporalUnit67);
        // The following exception was thrown during execution in test generation
        try {
            long long69 = localTime4.until((java.time.temporal.Temporal) chronoLocalDate49, temporalUnit67);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalTime from TemporalAccessor: 2022-02-21 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + era13 + "' != '" + java.time.chrono.IsoEra.CE + "'", era13.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoLocalDate16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + era25 + "' != '" + java.time.chrono.IsoEra.CE + "'", era25.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoLocalDate28);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(temporal44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(temporal47);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime48);
        org.junit.Assert.assertNotNull(chronoLocalDate49);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(zoneOffset59);
        org.junit.Assert.assertNotNull(offsetTime60);
        org.junit.Assert.assertNotNull(offsetTime62);
        org.junit.Assert.assertTrue("'" + chronoField63 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField63.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 23640L + "'", long66 == 23640L);
        org.junit.Assert.assertTrue("'" + temporalUnit67 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit67.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.time.Period period1 = java.time.Period.ofMonths(59);
        java.time.Period period3 = java.time.Period.ofDays(256);
        java.time.Period period4 = period3.negated();
        java.time.Period period5 = period1.plus((java.time.temporal.TemporalAmount) period4);
        java.time.Period period7 = period1.plusMonths((long) 4);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList8 = period1.getUnits();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(temporalUnitList8);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray6);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putShort((short) (byte) 0);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer7.compact();
        boolean boolean11 = properties1.remove((java.lang.Object) 0.0d, (java.lang.Object) byteBuffer10);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet12 = properties1.entrySet();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 1]");
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objEntrySet12);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1.0f);
        java.util.stream.DoubleStream doubleStream3 = doubleStream1.skip((long) 0);
        java.util.OptionalDouble optionalDouble4 = doubleStream1.max();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = doubleStream1.onClose(runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime6 = localTime4.minusNanos((long) 0);
        java.time.LocalTime localTime8 = localTime6.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime10 = localTime8.atOffset(zoneOffset9);
        java.time.zone.ZoneRules zoneRules11 = zoneOffset9.getRules();
        java.time.Instant instant13 = java.time.Instant.ofEpochMilli((long) 16);
        java.time.ZoneOffset zoneOffset14 = zoneRules11.getOffset(instant13);
        java.time.LocalTime localTime19 = java.time.LocalTime.of((int) (byte) 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        java.time.LocalTime localTime21 = localTime19.minusNanos((long) 0);
        java.time.LocalTime localTime23 = localTime21.minusMinutes((long) 'a');
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.MIN;
        java.time.OffsetTime offsetTime25 = localTime23.atOffset(zoneOffset24);
        java.time.Clock clock26 = java.time.Clock.fixed(instant13, (java.time.ZoneId) zoneOffset24);
        long long27 = clock26.millis();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(clock26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 16L + "'", long27 == 16L);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.DayOfWeek dayOfWeek1 = java.time.DayOfWeek.WEDNESDAY;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        long long5 = chronoField2.getFrom((java.time.temporal.TemporalAccessor) localDate4);
        long long7 = chronoField2.checkValidValue((-1L));
        boolean boolean8 = dayOfWeek1.isSupported((java.time.temporal.TemporalField) chronoField2);
        java.time.LocalDate localDate10 = localDate0.with((java.time.temporal.TemporalField) chronoField2, 0L);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + dayOfWeek1 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek1.equals(java.time.DayOfWeek.WEDNESDAY));
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField2.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 23640L + "'", long5 == 23640L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLoopbackAddress();
        byte[] byteArray1 = inetAddress0.getAddress();
        boolean boolean3 = inetAddress0.equals((java.lang.Object) 16);
        java.lang.String str4 = inetAddress0.getCanonicalHostName();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[127, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(2, type1);
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str2 = localDate1.toString();
        int int3 = localDate1.lengthOfMonth();
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.lang.String str6 = localDate5.toString();
        int int7 = localDate5.lengthOfMonth();
        boolean boolean8 = localDate1.isEqual((java.time.chrono.ChronoLocalDate) localDate5);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate12 = localDate10.plusMonths((long) (short) 100);
        java.time.LocalDateTime localDateTime16 = localDate10.atTime(0, (int) '4', (int) (byte) 1);
        java.time.LocalTime localTime17 = localDateTime16.toLocalTime();
        java.time.LocalDate localDate19 = java.time.LocalDate.ofEpochDay((long) (byte) 1);
        java.time.LocalDate localDate21 = localDate19.plusMonths((long) (short) 100);
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        java.time.temporal.TemporalUnit temporalUnit23 = chronoField22.getBaseUnit();
        boolean boolean24 = localDate21.isSupported(temporalUnit23);
        long long25 = localDate1.until((java.time.temporal.Temporal) localDateTime16, temporalUnit23);
        java.time.format.DateTimeFormatter dateTimeFormatter26 = java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = localDateTime16.format(dateTimeFormatter26);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-02" + "'", str2, "1970-01-02");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-02" + "'", str6, "1970-01-02");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField22.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit23 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit23.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MINUTES;
        timeUnit0.sleep((long) (byte) 10);
        org.junit.Assert.assertNotNull(timeUnit0);
    }
}

