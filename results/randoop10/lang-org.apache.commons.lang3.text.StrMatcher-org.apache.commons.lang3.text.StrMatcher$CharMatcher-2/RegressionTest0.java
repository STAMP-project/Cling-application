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
        java.time.ZoneOffset zoneOffset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime5 = java.time.OffsetTime.of((int) (byte) 1, (int) '#', (int) (short) 1, (int) 'a', zoneOffset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.net.InetAddress inetAddress0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByInetAddress(inetAddress0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = java.time.Instant.parse((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.net.MalformedURLException malformedURLException1 = new java.net.MalformedURLException();
        boolean boolean2 = locale0.equals((java.lang.Object) malformedURLException1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate1 = java.time.chrono.ChronoLocalDate.from((java.time.temporal.TemporalAccessor) offsetTime0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ChronoLocalDate from TemporalAccessor: class java.time.OffsetTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = java.time.Duration.parse((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Duration");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.net.Proxy.Type type0 = null;
        java.net.SocketAddress socketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Proxy proxy2 = new java.net.Proxy(type0, socketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type null is not compatible with address null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime1 = java.time.chrono.ChronoLocalDateTime.from((java.time.temporal.TemporalAccessor) localDate0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: -999999999-01-01 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.UnsupportedEncodingException unsupportedEncodingException0 = new java.io.UnsupportedEncodingException();
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException((java.lang.Throwable) unsupportedEncodingException0);
        java.security.NoSuchAlgorithmException noSuchAlgorithmException2 = new java.security.NoSuchAlgorithmException((java.lang.Throwable) unsupportedEncodingException0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.stream.DoubleStream.Builder builder0 = java.util.stream.DoubleStream.builder();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange3 = java.time.temporal.ValueRange.of((long) '4', (long) 'a', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.time.Month month0 = java.time.Month.SEPTEMBER;
        java.time.temporal.TemporalField temporalField1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = month0.range(temporalField1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: field");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.SEPTEMBER + "'", month0.equals(java.time.Month.SEPTEMBER));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.time.ZoneId zoneId0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime1 = java.time.OffsetTime.now(zoneId0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.Duration duration2 = java.time.Duration.ofDays((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate3 = localDate0.minus((java.time.temporal.TemporalAmount) duration2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer3 = java.nio.DoubleBuffer.wrap(doubleArray0, 1024, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal2 = localDate0.adjustInto((java.time.temporal.Temporal) offsetTime1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(offsetTime1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime1 = java.time.OffsetTime.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.nio.file.LinkOption linkOption0 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        org.junit.Assert.assertTrue("'" + linkOption0 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption0.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period1 = java.time.Period.parse((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.time.Duration duration2 = java.time.Duration.ofSeconds((long) '4', (long) 1024);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.ZoneId zoneId3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime4 = localDate0.atStartOfDay(zoneId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.TemporalQuery[] temporalQueryArray3 = new java.time.temporal.TemporalQuery[0];
        @SuppressWarnings("unchecked")
        java.time.temporal.TemporalQuery<?>[] wildcardTemporalQueryArray4 = (java.time.temporal.TemporalQuery<?>[]) temporalQueryArray3;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor5 = dateTimeFormatter0.parseBest((java.lang.CharSequence) "", (java.time.temporal.TemporalQuery<?>[]) temporalQueryArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least two queries must be specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(temporalQueryArray3);
        org.junit.Assert.assertNotNull(wildcardTemporalQueryArray4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.time.ZoneOffset zoneOffset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneRules zoneRules1 = java.time.zone.ZoneRules.of(zoneOffset0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        short[] shortArray6 = new short[] { (short) -1, (short) 100, (byte) -1, (byte) 100, (byte) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer9 = java.nio.ShortBuffer.wrap(shortArray6, 1024, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, -1, 100, 100, 10]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        boolean boolean4 = file3.isHidden();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!6078818179141892389hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.stream.IntStream intStream0 = java.util.stream.IntStream.empty();
        int int1 = intStream0.sum();
        java.util.function.IntPredicate intPredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = intStream0.filter(intPredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = java.nio.charset.Charset.isSupported("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        long long4 = file3.getTotalSpace();
        long long5 = file3.getUsableSpace();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!1398805464221252707hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 364740218880L + "'", long4 == 364740218880L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 280506515456L + "'", long5 == 280506515456L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        boolean boolean2 = locale0.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.stream.IntStream intStream0 = java.util.stream.IntStream.empty();
        java.util.function.IntPredicate intPredicate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = intStream0.allMatch(intPredicate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(9);
        int int2 = intBuffer1.capacity();
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.time.Month month0 = java.time.Month.SEPTEMBER;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        boolean boolean2 = month0.isSupported((java.time.temporal.TemporalField) chronoField1);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.SEPTEMBER + "'", month0.equals(java.time.Month.SEPTEMBER));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField1.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.File file2 = new java.io.File("hi!", "");
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHoursMinutesSeconds(64, (int) (byte) -1, 16);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 64 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.THURSDAY;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime3 = offsetTime1.withNano(0);
        java.time.LocalTime localTime4 = offsetTime1.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal5 = dayOfWeek0.adjustInto((java.time.temporal.Temporal) offsetTime1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfWeek");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate4 = localDate2.plusWeeks((long) (byte) -1);
        java.time.Duration duration6 = java.time.Duration.ofDays((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal7 = localDate4.minus((java.time.temporal.TemporalAmount) duration6);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        long long4 = file3.getTotalSpace();
        boolean boolean6 = file3.setLastModified((long) 100);
        long long7 = file3.lastModified();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!9110479755440245420hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 364740218880L + "'", long4 == 364740218880L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.THURSDAY;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId2 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal3 = dayOfWeek0.adjustInto((java.time.temporal.Temporal) offsetTime1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfWeek");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(zoneId2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.BCE;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = isoEra0.get((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ProlepticMonth");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra0.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField1.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        float[] floatArray6 = new float[] { (short) 1, 0L, 0L, (-1L), 0.0f, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer9 = java.nio.FloatBuffer.wrap(floatArray6, 256, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 0.0, 0.0, -1.0, 0.0, 52.0]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.security.SignatureException signatureException1 = new java.security.SignatureException("Subject:\n");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.format.DateTimeFormatter dateTimeFormatter3 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = offsetTime2.format(dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: WeekBasedYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.THURSDAY;
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate3 = localDate1.plusWeeks((long) 256);
        java.time.LocalDate localDate5 = localDate1.minusDays((long) (-1));
        java.time.temporal.Temporal temporal6 = dayOfWeek0.adjustInto((java.time.temporal.Temporal) localDate5);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dayOfWeek0.getLong((java.time.temporal.TemporalField) chronoField7);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ProlepticMonth");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField7.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.LocalTime localTime3 = offsetTime0.toLocalTime();
        java.time.LocalTime localTime4 = offsetTime0.toLocalTime();
        java.time.temporal.TemporalUnit temporalUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime6 = offsetTime0.truncatedTo(temporalUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.security.KeyException keyException1 = new java.security.KeyException("");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.Duration duration4 = java.time.Duration.ofMillis(0L);
        java.time.temporal.Temporal temporal5 = offsetTime2.plus((java.time.temporal.TemporalAmount) duration4);
        java.time.temporal.TemporalUnit temporalUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration8 = duration4.plus((long) (byte) 1, temporalUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: unit");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(temporal5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Throwable throwable0 = null;
        java.security.cert.CertificateEncodingException certificateEncodingException1 = new java.security.cert.CertificateEncodingException(throwable0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.security.SignatureException signatureException0 = new java.security.SignatureException();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.Duration duration4 = java.time.Duration.ofMillis(0L);
        java.time.Duration duration6 = duration4.plusNanos((long) (byte) -1);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime9 = offsetTime7.withNano(0);
        java.time.temporal.Temporal temporal10 = duration4.subtractFrom((java.time.temporal.Temporal) offsetTime7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal11 = localDate0.adjustInto(temporal10);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(temporal10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.format.DecimalStyle decimalStyle1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDecimalStyle(decimalStyle1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: decimalStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Hashtable<byte[], int[]> byteArrayMap2 = new java.util.Hashtable<byte[], int[]>((int) (byte) 100, (float) 9);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        boolean boolean8 = byteArrayMap2.containsKey((java.lang.Object) (byte) -1);
        boolean boolean9 = byteArrayMap2.isEmpty();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.lang.String str2 = locale1.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.nio.channels.FileChannel.MapMode mapMode0 = java.nio.channels.FileChannel.MapMode.PRIVATE;
        java.lang.String str1 = mapMode0.toString();
        org.junit.Assert.assertNotNull(mapMode0);
        org.junit.Assert.assertEquals(mapMode0.toString(), "PRIVATE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PRIVATE" + "'", str1, "PRIVATE");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray4 = new java.util.Locale[] { locale3 };
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.Locale locale7 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList5);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor8 = languageRangeList1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange10 = languageRangeList1.get(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(languageRangeItor8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int[] intArray5 = new int[] { (byte) 10, 64, 256, (short) 100, (short) 0 };
        java.util.stream.IntStream intStream6 = java.util.stream.IntStream.of(intArray5);
        long long7 = intStream6.count();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = intStream6.onClose(runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 64, 256, 100, 0]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5L + "'", long7 == 5L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        char char0 = java.io.File.pathSeparatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ':' + "'", char0 == ':');
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        boolean boolean4 = file3.createNewFile();
        boolean boolean5 = file3.isAbsolute();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!2100037705317879888hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        boolean boolean1 = chronoField0.isTimeBased();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange3 = offsetTime0.range((java.time.temporal.TemporalField) chronoField2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ProlepticMonth");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField2.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.lang3.text.StrMatcher strMatcher0 = org.apache.commons.lang3.text.StrMatcher.singleQuoteMatcher();
        org.junit.Assert.assertNotNull(strMatcher0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        java.time.Month month5 = offsetDateTime4.getMonth();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange7 = offsetDateTime4.range((java.time.temporal.TemporalField) chronoField6);
        boolean boolean8 = valueRange7.isIntValue();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField6.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = org.apache.commons.lang3.text.StrMatcher.stringMatcher("/tmp/hi!7428662059353686806hi!");
        org.junit.Assert.assertNotNull(strMatcher1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.stream.IntStream intStream0 = java.util.stream.IntStream.empty();
        java.util.stream.IntStream intStream2 = intStream0.skip((long) (byte) 10);
        org.junit.Assert.assertNotNull(intStream0);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Enumeration<java.net.NetworkInterface> networkInterfaceEnumeration0 = java.net.NetworkInterface.getNetworkInterfaces();
        org.junit.Assert.assertNotNull(networkInterfaceEnumeration0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        short[] shortArray0 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray0, (-1), 256);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate4 = localDate2.plusWeeks((long) (byte) -1);
        java.time.Duration duration6 = java.time.Duration.ofDays((long) (byte) 1);
        java.time.Duration duration8 = duration6.plusHours((long) (byte) -1);
        java.time.Duration duration10 = duration8.minusSeconds(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate11 = localDate2.plus((java.time.temporal.TemporalAmount) duration8);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.UnsupportedEncodingException unsupportedEncodingException0 = new java.io.UnsupportedEncodingException();
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException((java.lang.Throwable) unsupportedEncodingException0);
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) unsupportedEncodingException0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.time.Duration duration1 = java.time.Duration.ofMillis(0L);
        java.time.Duration duration3 = duration1.plusMinutes(10L);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.NANOSECONDS;
        org.junit.Assert.assertNotNull(timeUnit0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        int int5 = offsetDateTime4.getDayOfMonth();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of((-1), (int) 'a', (int) (short) -1, 10, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("/tmp/hi!3847920127589186503hi!", "hi!");
        java.lang.String str4 = uRISyntaxException3.getInput();
        java.io.IOException iOException5 = new java.io.IOException("France", (java.lang.Throwable) uRISyntaxException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/tmp/hi!3847920127589186503hi!" + "'", str4, "/tmp/hi!3847920127589186503hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray4 = new java.util.Locale[] { locale3 };
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.Locale locale7 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList5);
        java.util.Locale.LanguageRange languageRange9 = null;
        languageRangeList1.add((int) (short) 0, languageRange9);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.time.Instant instant0 = null;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.lang.String str2 = zoneOffset1.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime3 = java.time.OffsetTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: instant");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+18:00" + "'", str2, "+18:00");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.File file4 = null;
        java.io.File file5 = java.io.File.createTempFile("hi!", "hi!", file4);
        boolean boolean6 = file5.canRead();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = java.io.File.createTempFile("hi!", "hi!", file5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Not a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file5.toString(), "/tmp/hi!537433364257910892hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.flush();
        char[] charArray7 = new char[] { ' ', ' ', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write(charArray7, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4, a]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.nio.charset.CodingErrorAction codingErrorAction0 = java.nio.charset.CodingErrorAction.REPORT;
        org.junit.Assert.assertNotNull(codingErrorAction0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(9);
        int int2 = intBuffer1.remaining();
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int[] intArray5 = new int[] { (byte) 10, 64, 256, (short) 100, (short) 0 };
        java.util.stream.IntStream intStream6 = java.util.stream.IntStream.of(intArray5);
        java.util.function.IntToDoubleFunction intToDoubleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = intStream6.mapToDouble(intToDoubleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 64, 256, 100, 0]");
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.LocalTime localTime3 = offsetTime0.toLocalTime();
        int int4 = localTime3.getHour();
        java.time.LocalTime localTime6 = localTime3.minusNanos((long) (short) 100);
        java.time.LocalTime localTime8 = localTime6.plusHours((-1L));
        java.time.LocalTime localTime10 = localTime8.plusSeconds(0L);
        java.time.temporal.TemporalUnit temporalUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime12 = localTime8.truncatedTo(temporalUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.time.Instant instant0 = null;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId2 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime1);
        java.time.Clock clock3 = java.time.Clock.system(zoneId2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime4 = java.time.ZonedDateTime.ofInstant(instant0, zoneId2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: instant");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(clock3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.nio.charset.CharacterCodingException characterCodingException0 = new java.nio.charset.CharacterCodingException();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.List<java.nio.file.spi.FileSystemProvider> fileSystemProviderList0 = java.nio.file.spi.FileSystemProvider.installedProviders();
        org.junit.Assert.assertNotNull(fileSystemProviderList0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        java.time.Period period8 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.LocalDate localDate10 = localDate0.plusDays(280506515456L);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.LocalTime localTime3 = offsetTime0.toLocalTime();
        int int4 = localTime3.getHour();
        java.time.LocalTime localTime6 = localTime3.minusNanos((long) (short) 100);
        java.time.LocalTime localTime8 = localTime6.plusHours((-1L));
        long long9 = localTime6.toNanoOfDay();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86399999999900L + "'", long9 == 86399999999900L);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.net.URLStreamHandlerFactory uRLStreamHandlerFactory0 = null;
        java.net.URL.setURLStreamHandlerFactory(uRLStreamHandlerFactory0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray4, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 10, 10]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.nio.channels.ClosedChannelException closedChannelException0 = new java.nio.channels.ClosedChannelException();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.parse((java.lang.CharSequence) "/tmp/hi!3847920127589186503hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(9);
        boolean boolean2 = intBuffer1.hasArray();
        java.lang.String str3 = intBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer4 = intBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]" + "'", str3, "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.Duration duration4 = java.time.Duration.ofMillis(0L);
        java.time.temporal.Temporal temporal5 = offsetTime2.plus((java.time.temporal.TemporalAmount) duration4);
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate8 = localDate6.plusWeeks((long) 256);
        java.time.LocalDate localDate10 = localDate8.plusWeeks((long) (byte) -1);
        java.time.DayOfWeek dayOfWeek11 = localDate8.getDayOfWeek();
        boolean boolean12 = localDate8.isLeapYear();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime13 = offsetTime2.with((java.time.temporal.TemporalAdjuster) localDate8);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(temporal5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + dayOfWeek11 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek11.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(9);
        java.nio.IntBuffer intBuffer4 = intBuffer1.put((int) (byte) 0, (int) (short) 100);
        boolean boolean5 = intBuffer1.isDirect();
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(intBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate4 = localDate2.plusWeeks((long) (byte) -1);
        java.time.DayOfWeek dayOfWeek5 = localDate2.getDayOfWeek();
        boolean boolean6 = localDate2.isLeapYear();
        int int7 = localDate2.lengthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = localDate2.atTime(64, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 64");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + dayOfWeek5 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek5.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime4.withNano((int) (short) 100);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId8 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime7);
        java.time.Clock clock9 = java.time.Clock.system(zoneId8);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.now(clock9);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now(clock9);
        java.time.Month month12 = offsetDateTime11.getMonth();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange14 = offsetDateTime11.range((java.time.temporal.TemporalField) chronoField13);
        int int15 = offsetDateTime4.get((java.time.temporal.TemporalField) chronoField13);
        java.time.temporal.TemporalUnit temporalUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime18 = offsetDateTime4.plus(280506515456L, temporalUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + month12 + "' != '" + java.time.Month.FEBRUARY + "'", month12.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField13.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        java.time.Period period8 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.temporal.TemporalUnit temporalUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate11 = localDate7.minus(0L, temporalUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.net.URLConnection.setDefaultAllowUserInteraction(false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByIndex((int) (byte) 0);
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.format.DecimalStyle decimalStyle1 = dateTimeFormatter0.getDecimalStyle();
        java.time.format.DecimalStyle decimalStyle2 = dateTimeFormatter0.getDecimalStyle();
        java.time.format.DecimalStyle decimalStyle4 = decimalStyle2.withDecimalSeparator('4');
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertNotNull(decimalStyle4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        java.time.Period period8 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId10 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime9);
        java.time.Clock clock11 = java.time.Clock.system(zoneId10);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.now(clock11);
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now(clock11);
        java.time.Duration duration15 = java.time.Duration.ofMillis(0L);
        java.time.Duration duration17 = duration15.plusNanos((long) (byte) -1);
        java.time.OffsetTime offsetTime18 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime20 = offsetTime18.withNano(0);
        java.time.temporal.Temporal temporal21 = duration15.subtractFrom((java.time.temporal.Temporal) offsetTime18);
        java.time.Clock clock22 = java.time.Clock.offset(clock11, duration15);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.now(clock11);
        java.time.temporal.TemporalUnit temporalUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = localDate0.until((java.time.temporal.Temporal) offsetTime23, temporalUnit24);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDate from TemporalAccessor: 03:14:00.268+18:00 of type java.time.OffsetTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(temporal21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertNotNull(offsetTime23);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isMCLinkLocal();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        boolean boolean4 = file3.createNewFile();
        boolean boolean5 = file3.canRead();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!2311638550828271612hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.text.ParseException parseException2 = new java.text.ParseException("/tmp/hi!7428662059353686806hi!", (int) '#');
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.time.Duration duration1 = java.time.Duration.ofDays((long) (byte) 1);
        java.time.Duration duration3 = duration1.plusHours((long) (byte) -1);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId5 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime4);
        java.time.Clock clock6 = java.time.Clock.system(zoneId5);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.now(clock6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now(clock6);
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.withNano((int) (short) 100);
        java.time.temporal.Temporal temporal11 = duration3.subtractFrom((java.time.temporal.Temporal) offsetDateTime8);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(temporal11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.lang.String str4 = file3.getAbsolutePath();
        boolean boolean6 = file3.setExecutable(false);
        file3.deleteOnExit();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!5947512368546913200hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/tmp/hi!5947512368546913200hi!" + "'", str4, "/tmp/hi!5947512368546913200hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition1 = new java.text.FieldPosition(field0);
        java.util.Locale locale3 = new java.util.Locale("hi!");
        boolean boolean4 = fieldPosition1.equals((java.lang.Object) locale3);
        int int5 = fieldPosition1.getEndIndex();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        java.time.Period period8 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.Period period9 = period8.negated();
        java.time.Duration duration11 = java.time.Duration.ofDays((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod12 = period8.plus((java.time.temporal.TemporalAmount) duration11);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        java.time.Period period8 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.Period period9 = period8.negated();
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime12 = offsetTime10.withNano(0);
        java.time.LocalTime localTime13 = offsetTime10.toLocalTime();
        int int14 = localTime13.getHour();
        java.time.OffsetTime offsetTime15 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime17 = offsetTime15.withNano(0);
        java.time.LocalTime localTime18 = offsetTime15.toLocalTime();
        int int19 = localTime18.getHour();
        boolean boolean20 = localTime13.isBefore(localTime18);
        long long21 = localTime18.toNanoOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal22 = period9.subtractFrom((java.time.temporal.Temporal) localTime18);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String str1 = java.net.URLConnection.guessContentTypeFromName("Subject:\n");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.lang3.text.StrMatcher strMatcher0 = org.apache.commons.lang3.text.StrMatcher.noneMatcher();
        org.junit.Assert.assertNotNull(strMatcher0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        java.time.Month month5 = offsetDateTime4.getMonth();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate8 = localDate6.plusWeeks((long) 256);
        java.time.LocalDate localDate10 = localDate8.plusWeeks((long) (byte) -1);
        boolean boolean11 = offsetDateTime4.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        org.junit.Assert.assertNotNull(offsetTime0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.stream.Collector.Characteristics characteristics0 = java.util.stream.Collector.Characteristics.UNORDERED;
        org.junit.Assert.assertTrue("'" + characteristics0 + "' != '" + java.util.stream.Collector.Characteristics.UNORDERED + "'", characteristics0.equals(java.util.stream.Collector.Characteristics.UNORDERED));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.time.Instant instant0 = java.time.Instant.now();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.from((java.time.temporal.TemporalAccessor) instant0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: 2022-02-21T09:14:00.977Z of type java.time.Instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.text.Format.Field field2 = null;
        java.text.FieldPosition fieldPosition3 = new java.text.FieldPosition(field2);
        java.util.Locale locale5 = new java.util.Locale("hi!");
        boolean boolean6 = fieldPosition3.equals((java.lang.Object) locale5);
        java.lang.String str7 = locale1.getDisplayLanguage(locale5);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.util.Locale locale2 = dateTimeFormatter1.getLocale();
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime5 = offsetTime3.withNano(0);
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId7 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime6);
        java.time.Clock clock8 = java.time.Clock.system(zoneId7);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.now(clock8);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now(clock8);
        java.time.Month month11 = offsetDateTime10.getMonth();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange13 = offsetDateTime10.range((java.time.temporal.TemporalField) chronoField12);
        boolean boolean14 = offsetTime5.isSupported((java.time.temporal.TemporalField) chronoField12);
        java.time.chrono.IsoEra isoEra15 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime18 = offsetTime16.withNano(0);
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId20 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime19);
        java.time.Clock clock21 = java.time.Clock.system(zoneId20);
        java.time.OffsetTime offsetTime22 = java.time.OffsetTime.now(clock21);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now(clock21);
        java.time.Month month24 = offsetDateTime23.getMonth();
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange26 = offsetDateTime23.range((java.time.temporal.TemporalField) chronoField25);
        boolean boolean27 = offsetTime18.isSupported((java.time.temporal.TemporalField) chronoField25);
        long long28 = isoEra15.getLong((java.time.temporal.TemporalField) chronoField25);
        java.time.chrono.IsoEra isoEra29 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime30 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime32 = offsetTime30.withNano(0);
        java.time.OffsetTime offsetTime33 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId34 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime33);
        java.time.Clock clock35 = java.time.Clock.system(zoneId34);
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.now(clock35);
        java.time.OffsetDateTime offsetDateTime37 = java.time.OffsetDateTime.now(clock35);
        java.time.Month month38 = offsetDateTime37.getMonth();
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange40 = offsetDateTime37.range((java.time.temporal.TemporalField) chronoField39);
        boolean boolean41 = offsetTime32.isSupported((java.time.temporal.TemporalField) chronoField39);
        long long42 = isoEra29.getLong((java.time.temporal.TemporalField) chronoField39);
        java.time.temporal.TemporalField[] temporalFieldArray43 = new java.time.temporal.TemporalField[] { chronoField12, chronoField25, chronoField39 };
        java.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter1.withResolverFields(temporalFieldArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime45 = java.time.LocalTime.parse((java.lang.CharSequence) "+18:00", dateTimeFormatter44);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '+18:00' could not be parsed at index 1");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertTrue("'" + month11 + "' != '" + java.time.Month.FEBRUARY + "'", month11.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField12.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + isoEra15 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra15.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertTrue("'" + month24 + "' != '" + java.time.Month.FEBRUARY + "'", month24.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField25.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + isoEra29 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra29.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertNotNull(clock35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(offsetDateTime37);
        org.junit.Assert.assertTrue("'" + month38 + "' != '" + java.time.Month.FEBRUARY + "'", month38.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField39.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.temporal.TemporalField temporalField1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = instant0.get(temporalField1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: field");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]", "PRIVATE", "France", "", "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]", "+18:00", "/tmp/hi!3847920127589186503hi!", "/tmp/hi!7428662059353686806hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.Object[] objArray14 = languageRangeList12.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.Object[] objArray18 = languageRangeList16.toArray();
        int int20 = languageRangeList16.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale24 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList26);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.Object[] objArray32 = languageRangeList30.toArray();
        int int34 = languageRangeList30.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray35 = new java.util.RandomAccess[] { languageRangeList16, localeList26, languageRangeList30 };
        java.util.RandomAccess[] randomAccessArray36 = languageRangeList12.toArray(randomAccessArray35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.Object[] objArray40 = languageRangeList38.toArray();
        int int42 = languageRangeList38.indexOf((java.lang.Object) 1.0d);
        boolean boolean43 = languageRangeList12.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        boolean boolean44 = strSet9.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        java.util.Locale.LanguageRange languageRange46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange47 = languageRangeList38.set(0, languageRange46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray35);
        org.junit.Assert.assertNotNull(randomAccessArray36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.time.Duration duration1 = java.time.Duration.ofMillis(0L);
        java.time.Duration duration3 = duration1.plusDays((long) (byte) 10);
        java.time.Duration duration4 = java.time.Duration.from((java.time.temporal.TemporalAmount) duration3);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.format.DecimalStyle decimalStyle1 = dateTimeFormatter0.getDecimalStyle();
        java.time.format.DecimalStyle decimalStyle2 = dateTimeFormatter0.getDecimalStyle();
        java.time.format.DecimalStyle decimalStyle4 = decimalStyle2.withNegativeSign('#');
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertNotNull(decimalStyle4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.security.AccessControlException accessControlException1 = new java.security.AccessControlException("java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.lang.String str4 = file3.getAbsolutePath();
        boolean boolean5 = file3.canWrite();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!6466040413251194584hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/tmp/hi!6466040413251194584hi!" + "'", str4, "/tmp/hi!6466040413251194584hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.Object[] objArray3 = languageRangeList1.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.Object[] objArray7 = languageRangeList5.toArray();
        int int9 = languageRangeList5.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale13 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale locale17 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.Object[] objArray21 = languageRangeList19.toArray();
        int int23 = languageRangeList19.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray24 = new java.util.RandomAccess[] { languageRangeList5, localeList15, languageRangeList19 };
        java.util.RandomAccess[] randomAccessArray25 = languageRangeList1.toArray(randomAccessArray24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.Object[] objArray29 = languageRangeList27.toArray();
        int int31 = languageRangeList27.indexOf((java.lang.Object) 1.0d);
        boolean boolean32 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream33 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange languageRange34 = null;
        boolean boolean35 = languageRangeList1.add(languageRange34);
        java.util.Locale.LanguageRange languageRange36 = null;
        boolean boolean37 = languageRangeList1.add(languageRange36);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray24);
        org.junit.Assert.assertNotNull(randomAccessArray25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(languageRangeStream33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MINUTES;
        long long2 = timeUnit0.toSeconds(364740218880L);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21884413132800L + "'", long2 == 21884413132800L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_INSTANT;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.LongSummaryStatistics longSummaryStatistics0 = new java.util.LongSummaryStatistics();
        double double1 = longSummaryStatistics0.getAverage();
        org.junit.Assert.assertEquals(longSummaryStatistics0.toString(), "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "France" + "'", str1, "France");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRA" + "'", str2, "FRA");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("-999999999-W01-1");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        long long4 = file3.getTotalSpace();
        boolean boolean6 = file3.setLastModified((long) 100);
        java.net.URI uRI7 = file3.toURI();
        java.io.File file10 = null;
        java.io.File file11 = java.io.File.createTempFile("hi!", "hi!", file10);
        long long12 = file11.getTotalSpace();
        boolean boolean14 = file11.setLastModified((long) 100);
        java.net.URI uRI15 = file11.toURI();
        java.net.URI uRI16 = uRI7.resolve(uRI15);
        java.net.URI uRI18 = uRI15.resolve("PRIVATE");
        java.lang.String str19 = uRI15.getRawSchemeSpecificPart();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!9089669294385939149hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 364740218880L + "'", long4 == 364740218880L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file11.toString(), "/tmp/hi!7097461245081546947hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 364740218880L + "'", long12 == 364740218880L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(uRI15);
        org.junit.Assert.assertNotNull(uRI16);
        org.junit.Assert.assertNotNull(uRI18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/tmp/hi!7097461245081546947hi!" + "'", str19, "/tmp/hi!7097461245081546947hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.Hashtable<byte[], int[]> byteArrayMap2 = new java.util.Hashtable<byte[], int[]>((int) (byte) 100, (float) 9);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        boolean boolean8 = byteArrayMap2.containsKey((java.lang.Object) (byte) -1);
        java.util.Set<byte[]> byteArraySet9 = byteArrayMap2.keySet();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArraySet9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.time.Month month0 = java.time.Month.SEPTEMBER;
        int int1 = month0.getValue();
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = month0.getLong((java.time.temporal.TemporalField) chronoField2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: AlignedDayOfWeekInMonth");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.SEPTEMBER + "'", month0.equals(java.time.Month.SEPTEMBER));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField2.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.unmappableForLength(1);
        boolean boolean2 = coderResult1.isMalformed();
        org.junit.Assert.assertNotNull(coderResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.format.DecimalStyle decimalStyle1 = dateTimeFormatter0.getDecimalStyle();
        java.time.format.DecimalStyle decimalStyle2 = dateTimeFormatter0.getDecimalStyle();
        char char3 = decimalStyle2.getZeroDigit();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate4 = localDate2.plusWeeks((long) (byte) -1);
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) 256);
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate10 = localDate8.plusWeeks((long) 256);
        java.time.LocalDate localDate12 = localDate10.plusWeeks((long) (byte) -1);
        java.time.Period period13 = localDate5.until((java.time.chrono.ChronoLocalDate) localDate12);
        java.time.LocalDate localDate15 = localDate12.plusMonths((long) 9);
        java.time.LocalDate localDate17 = localDate15.minusMonths((long) 29);
        boolean boolean18 = localDate4.isBefore((java.time.chrono.ChronoLocalDate) localDate15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.time.Month month0 = java.time.Month.NOVEMBER;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.NOVEMBER + "'", month0.equals(java.time.Month.NOVEMBER));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        java.time.Period period8 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.Duration duration10 = java.time.Duration.ofMillis(0L);
        java.time.Duration duration12 = duration10.plusNanos((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period13 = period8.plus((java.time.temporal.TemporalAmount) duration12);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException("/tmp/hi!6466040413251194584hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.lang.String str4 = file3.getAbsolutePath();
        boolean boolean7 = file3.setReadable(true, false);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!2131055779263864112hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/tmp/hi!2131055779263864112hi!" + "'", str4, "/tmp/hi!2131055779263864112hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.security.cert.CertificateException certificateException0 = new java.security.cert.CertificateException();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.Object[] objArray3 = languageRangeList1.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.Object[] objArray7 = languageRangeList5.toArray();
        int int9 = languageRangeList5.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale13 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale locale17 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.Object[] objArray21 = languageRangeList19.toArray();
        int int23 = languageRangeList19.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray24 = new java.util.RandomAccess[] { languageRangeList5, localeList15, languageRangeList19 };
        java.util.RandomAccess[] randomAccessArray25 = languageRangeList1.toArray(randomAccessArray24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.Object[] objArray29 = languageRangeList27.toArray();
        int int31 = languageRangeList27.indexOf((java.lang.Object) 1.0d);
        boolean boolean32 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream33 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange languageRange34 = null;
        boolean boolean35 = languageRangeList1.add(languageRange34);
        java.util.Locale locale36 = java.util.Locale.ROOT;
        java.lang.String str37 = locale36.getDisplayCountry();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.lang.String str39 = locale38.getDisplayCountry();
        java.text.Format.Field field40 = null;
        java.text.FieldPosition fieldPosition41 = new java.text.FieldPosition(field40);
        java.util.Locale locale43 = new java.util.Locale("hi!");
        boolean boolean44 = fieldPosition41.equals((java.lang.Object) locale43);
        java.util.Locale locale45 = java.util.Locale.ROOT;
        java.lang.String str46 = locale45.getDisplayCountry();
        java.util.Locale locale48 = new java.util.Locale("hi!");
        java.text.Format.Field field49 = null;
        java.text.FieldPosition fieldPosition50 = new java.text.FieldPosition(field49);
        java.util.Locale locale52 = new java.util.Locale("hi!");
        boolean boolean53 = fieldPosition50.equals((java.lang.Object) locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale52);
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.text.Format.Field field60 = null;
        java.text.FieldPosition fieldPosition61 = new java.text.FieldPosition(field60);
        java.util.Locale locale63 = new java.util.Locale("hi!");
        boolean boolean64 = fieldPosition61.equals((java.lang.Object) locale63);
        java.lang.String str65 = locale59.getDisplayCountry(locale63);
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale36, locale38, locale43, locale45, locale48, locale56, locale59 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray24);
        org.junit.Assert.assertNotNull(randomAccessArray25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(languageRangeStream33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId2 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime1);
        java.time.Clock clock3 = java.time.Clock.system(zoneId2);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.now(clock3);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now(clock3);
        java.time.Month month6 = offsetDateTime5.getMonth();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.of((int) (short) 1, month6, (int) (byte) 1, (int) (byte) 100, (-1), 100, 4096);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.FEBRUARY + "'", month6.equals(java.time.Month.FEBRUARY));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.LocalTime localTime3 = offsetTime0.toLocalTime();
        java.time.LocalTime localTime4 = offsetTime0.toLocalTime();
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MIN;
        boolean boolean6 = offsetTime0.isBefore(offsetTime5);
        java.lang.String str7 = offsetTime0.toString();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00:00+18:00" + "'", str7, "00:00+18:00");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        java.net.InetAddress inetAddress5 = java.net.InetAddress.getByAddress(byteArray4);
        boolean boolean6 = inetAddress5.isLinkLocalAddress();
        boolean boolean8 = inetAddress5.isReachable(365);
        java.lang.String str9 = inetAddress5.getCanonicalHostName();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(inetAddress5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0.0.10" + "'", str9, "1.0.0.10");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.time.Instant instant0 = java.time.Instant.now();
        int int1 = instant0.getNano();
        java.time.DayOfWeek dayOfWeek2 = java.time.DayOfWeek.THURSDAY;
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate3.minusDays((long) (-1));
        java.time.temporal.Temporal temporal8 = dayOfWeek2.adjustInto((java.time.temporal.Temporal) localDate7);
        java.time.LocalDateTime localDateTime11 = localDate7.atTime(0, (int) (short) 10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        boolean boolean13 = localDate7.isSupported((java.time.temporal.TemporalField) chronoField12);
        boolean boolean14 = instant0.isSupported((java.time.temporal.TemporalField) chronoField12);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 152000000 + "'", int1 == 152000000);
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(temporal8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField12.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.security.AccessControlException accessControlException1 = new java.security.AccessControlException("Subject:\n");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.flush();
        java.io.PrintWriter printWriter4 = printWriter1.append((java.lang.CharSequence) "1.0.0.10");
        org.junit.Assert.assertNotNull(printWriter4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.format.DecimalStyle decimalStyle1 = dateTimeFormatter0.getDecimalStyle();
        java.time.format.ResolverStyle resolverStyle2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withResolverStyle(resolverStyle2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: resolverStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.Hashtable<byte[], int[]> byteArrayMap2 = new java.util.Hashtable<byte[], int[]>((int) (byte) 100, (float) 9);
        java.util.Collection<int[]> intArrayCollection3 = byteArrayMap2.values();
        java.util.Enumeration<byte[]> byteArrayEnumeration4 = byteArrayMap2.keys();
        org.junit.Assert.assertNotNull(intArrayCollection3);
        org.junit.Assert.assertNotNull(byteArrayEnumeration4);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.Hashtable<byte[], int[]> byteArrayMap2 = new java.util.Hashtable<byte[], int[]>((int) (byte) 100, (float) 9);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        boolean boolean8 = byteArrayMap2.containsKey((java.lang.Object) (byte) -1);
        java.util.Collection<int[]> intArrayCollection9 = byteArrayMap2.values();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArrayCollection9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.time.chrono.ChronoLocalDate chronoLocalDate0 = null;
        java.time.DayOfWeek dayOfWeek1 = java.time.DayOfWeek.THURSDAY;
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate4 = localDate2.plusWeeks((long) 256);
        java.time.LocalDate localDate6 = localDate2.minusDays((long) (-1));
        java.time.temporal.Temporal temporal7 = dayOfWeek1.adjustInto((java.time.temporal.Temporal) localDate6);
        java.time.temporal.TemporalUnit temporalUnit8 = null;
        boolean boolean9 = localDate6.isSupported(temporalUnit8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod10 = java.time.chrono.ChronoPeriod.between(chronoLocalDate0, (java.time.chrono.ChronoLocalDate) localDate6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: startDateInclusive");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek1 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek1.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(temporal7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.Object[] objArray3 = languageRangeList1.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.Object[] objArray7 = languageRangeList5.toArray();
        int int9 = languageRangeList5.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale13 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale locale17 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.Object[] objArray21 = languageRangeList19.toArray();
        int int23 = languageRangeList19.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray24 = new java.util.RandomAccess[] { languageRangeList5, localeList15, languageRangeList19 };
        java.util.RandomAccess[] randomAccessArray25 = languageRangeList1.toArray(randomAccessArray24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.Object[] objArray29 = languageRangeList27.toArray();
        int int31 = languageRangeList27.indexOf((java.lang.Object) 1.0d);
        boolean boolean32 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream33 = languageRangeList1.parallelStream();
        java.lang.Object[] objArray34 = languageRangeStream33.toArray();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray24);
        org.junit.Assert.assertNotNull(randomAccessArray25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(languageRangeStream33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.security.AccessControlException accessControlException1 = new java.security.AccessControlException("");
        java.security.Permission permission2 = accessControlException1.getPermission();
        org.junit.Assert.assertNull(permission2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.util.Locale locale2 = dateTimeFormatter1.getLocale();
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime5 = offsetTime3.withNano(0);
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId7 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime6);
        java.time.Clock clock8 = java.time.Clock.system(zoneId7);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.now(clock8);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now(clock8);
        java.time.Month month11 = offsetDateTime10.getMonth();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange13 = offsetDateTime10.range((java.time.temporal.TemporalField) chronoField12);
        boolean boolean14 = offsetTime5.isSupported((java.time.temporal.TemporalField) chronoField12);
        java.time.chrono.IsoEra isoEra15 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime18 = offsetTime16.withNano(0);
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId20 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime19);
        java.time.Clock clock21 = java.time.Clock.system(zoneId20);
        java.time.OffsetTime offsetTime22 = java.time.OffsetTime.now(clock21);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now(clock21);
        java.time.Month month24 = offsetDateTime23.getMonth();
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange26 = offsetDateTime23.range((java.time.temporal.TemporalField) chronoField25);
        boolean boolean27 = offsetTime18.isSupported((java.time.temporal.TemporalField) chronoField25);
        long long28 = isoEra15.getLong((java.time.temporal.TemporalField) chronoField25);
        java.time.chrono.IsoEra isoEra29 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime30 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime32 = offsetTime30.withNano(0);
        java.time.OffsetTime offsetTime33 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId34 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime33);
        java.time.Clock clock35 = java.time.Clock.system(zoneId34);
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.now(clock35);
        java.time.OffsetDateTime offsetDateTime37 = java.time.OffsetDateTime.now(clock35);
        java.time.Month month38 = offsetDateTime37.getMonth();
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange40 = offsetDateTime37.range((java.time.temporal.TemporalField) chronoField39);
        boolean boolean41 = offsetTime32.isSupported((java.time.temporal.TemporalField) chronoField39);
        long long42 = isoEra29.getLong((java.time.temporal.TemporalField) chronoField39);
        java.time.temporal.TemporalField[] temporalFieldArray43 = new java.time.temporal.TemporalField[] { chronoField12, chronoField25, chronoField39 };
        java.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter1.withResolverFields(temporalFieldArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime45 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "France", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'France' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertTrue("'" + month11 + "' != '" + java.time.Month.FEBRUARY + "'", month11.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField12.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + isoEra15 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra15.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertTrue("'" + month24 + "' != '" + java.time.Month.FEBRUARY + "'", month24.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField25.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + isoEra29 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra29.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertNotNull(clock35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(offsetDateTime37);
        org.junit.Assert.assertTrue("'" + month38 + "' != '" + java.time.Month.FEBRUARY + "'", month38.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField39.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.LocalTime localTime3 = offsetTime0.toLocalTime();
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.util.Locale locale5 = dateTimeFormatter4.getLocale();
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime8 = offsetTime6.withNano(0);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId10 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime9);
        java.time.Clock clock11 = java.time.Clock.system(zoneId10);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.now(clock11);
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now(clock11);
        java.time.Month month14 = offsetDateTime13.getMonth();
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange16 = offsetDateTime13.range((java.time.temporal.TemporalField) chronoField15);
        boolean boolean17 = offsetTime8.isSupported((java.time.temporal.TemporalField) chronoField15);
        java.time.chrono.IsoEra isoEra18 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime21 = offsetTime19.withNano(0);
        java.time.OffsetTime offsetTime22 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId23 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime22);
        java.time.Clock clock24 = java.time.Clock.system(zoneId23);
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.now(clock24);
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now(clock24);
        java.time.Month month27 = offsetDateTime26.getMonth();
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange29 = offsetDateTime26.range((java.time.temporal.TemporalField) chronoField28);
        boolean boolean30 = offsetTime21.isSupported((java.time.temporal.TemporalField) chronoField28);
        long long31 = isoEra18.getLong((java.time.temporal.TemporalField) chronoField28);
        java.time.chrono.IsoEra isoEra32 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime33 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime35 = offsetTime33.withNano(0);
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId37 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime36);
        java.time.Clock clock38 = java.time.Clock.system(zoneId37);
        java.time.OffsetTime offsetTime39 = java.time.OffsetTime.now(clock38);
        java.time.OffsetDateTime offsetDateTime40 = java.time.OffsetDateTime.now(clock38);
        java.time.Month month41 = offsetDateTime40.getMonth();
        java.time.temporal.ChronoField chronoField42 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange43 = offsetDateTime40.range((java.time.temporal.TemporalField) chronoField42);
        boolean boolean44 = offsetTime35.isSupported((java.time.temporal.TemporalField) chronoField42);
        long long45 = isoEra32.getLong((java.time.temporal.TemporalField) chronoField42);
        java.time.temporal.TemporalField[] temporalFieldArray46 = new java.time.temporal.TemporalField[] { chronoField15, chronoField28, chronoField42 };
        java.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter4.withResolverFields(temporalFieldArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = offsetTime0.format(dateTimeFormatter47);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: WeekBasedYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertTrue("'" + month14 + "' != '" + java.time.Month.FEBRUARY + "'", month14.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField15.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + isoEra18 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra18.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertNotNull(clock24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertTrue("'" + month27 + "' != '" + java.time.Month.FEBRUARY + "'", month27.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField28.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + isoEra32 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra32.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(offsetTime35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertNotNull(clock38);
        org.junit.Assert.assertNotNull(offsetTime39);
        org.junit.Assert.assertNotNull(offsetDateTime40);
        org.junit.Assert.assertTrue("'" + month41 + "' != '" + java.time.Month.FEBRUARY + "'", month41.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField42 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField42.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId1 = java.time.ZoneId.of("-999999999-W01-1");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: -999999999-W01-1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.lang.String str6 = locale5.getScript();
        java.text.Format.Field field7 = null;
        java.text.FieldPosition fieldPosition8 = new java.text.FieldPosition(field7);
        java.util.Locale locale10 = new java.util.Locale("hi!");
        boolean boolean11 = fieldPosition8.equals((java.lang.Object) locale10);
        java.lang.String str12 = locale5.getDisplayName(locale10);
        boolean boolean13 = offsetDateTime4.equals((java.lang.Object) str12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime15 = offsetDateTime4.withNano((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for NanoOfSecond (valid values 0 - 999999999): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.LocalTime localTime3 = offsetTime0.toLocalTime();
        int int4 = localTime3.getHour();
        java.time.LocalTime localTime6 = localTime3.minusNanos((long) (short) 100);
        java.time.LocalTime localTime8 = localTime6.plusHours((-1L));
        int int9 = localTime8.getMinute();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        long long4 = file3.getTotalSpace();
        boolean boolean5 = file3.canRead();
        boolean boolean6 = file3.canWrite();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!3349770614459984691hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 364740218880L + "'", long4 == 364740218880L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        long long4 = file3.getTotalSpace();
        boolean boolean6 = file3.setLastModified((long) 100);
        java.net.URI uRI7 = file3.toURI();
        java.io.File file10 = null;
        java.io.File file11 = java.io.File.createTempFile("hi!", "hi!", file10);
        long long12 = file11.getTotalSpace();
        boolean boolean14 = file11.setLastModified((long) 100);
        java.net.URI uRI15 = file11.toURI();
        java.net.URI uRI16 = uRI7.resolve(uRI15);
        java.lang.String str17 = uRI15.getSchemeSpecificPart();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!4920072181803549493hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 364740218880L + "'", long4 == 364740218880L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file11.toString(), "/tmp/hi!6288073446570085602hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 364740218880L + "'", long12 == 364740218880L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(uRI15);
        org.junit.Assert.assertNotNull(uRI16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/tmp/hi!6288073446570085602hi!" + "'", str17, "/tmp/hi!6288073446570085602hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.unmappableForLength(10);
        boolean boolean2 = coderResult1.isOverflow();
        org.junit.Assert.assertNotNull(coderResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.time.Duration duration1 = java.time.Duration.ofMillis(0L);
        java.time.Duration duration3 = duration1.plusNanos((long) (byte) -1);
        long long4 = duration3.toMinutes();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(9);
        java.nio.Buffer buffer2 = intBuffer1.mark();
        boolean boolean3 = intBuffer1.isReadOnly();
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate3 = java.time.LocalDate.of((int) '0', 0, 16384);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset1 = java.nio.charset.Charset.forName("PRIVATE");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: PRIVATE");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.time.Duration duration1 = java.time.Duration.ofDays((long) (byte) 1);
        java.time.Duration duration3 = duration1.plusHours((long) (byte) -1);
        java.time.Duration duration5 = duration3.minusSeconds(10L);
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime8 = offsetTime6.withNano(0);
        java.time.temporal.TemporalUnit temporalUnit9 = null;
        boolean boolean10 = offsetTime6.isSupported(temporalUnit9);
        java.time.temporal.Temporal temporal11 = duration3.addTo((java.time.temporal.Temporal) offsetTime6);
        java.time.OffsetTime offsetTime13 = offsetTime6.plusHours((-1L));
        java.time.DayOfWeek dayOfWeek14 = java.time.DayOfWeek.THURSDAY;
        java.time.LocalDate localDate15 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate17 = localDate15.plusWeeks((long) 256);
        java.time.LocalDate localDate19 = localDate15.minusDays((long) (-1));
        java.time.temporal.Temporal temporal20 = dayOfWeek14.adjustInto((java.time.temporal.Temporal) localDate19);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery21 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period22 = dayOfWeek14.query(periodTemporalQuery21);
        java.time.OffsetTime offsetTime23 = offsetTime13.plus((java.time.temporal.TemporalAmount) period22);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(temporal11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + dayOfWeek14 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek14.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(temporal20);
        org.junit.Assert.assertNotNull(periodTemporalQuery21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(offsetTime23);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        java.time.Period period8 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.Period period9 = period8.negated();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate12 = localDate10.plusWeeks((long) 256);
        java.time.LocalDate localDate13 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate15 = localDate13.plusWeeks((long) 256);
        java.time.LocalDate localDate17 = localDate15.plusWeeks((long) (byte) -1);
        java.time.Period period18 = localDate10.until((java.time.chrono.ChronoLocalDate) localDate17);
        java.time.Period period19 = period18.negated();
        boolean boolean20 = period19.isNegative();
        java.time.Period period21 = period8.minus((java.time.temporal.TemporalAmount) period19);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.stream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeStream3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId2 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime1);
        java.time.Clock clock3 = java.time.Clock.system(zoneId2);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.now(clock3);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now(clock3);
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.withNano((int) (short) 100);
        java.time.OffsetTime offsetTime8 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId9 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime8);
        java.time.Clock clock10 = java.time.Clock.system(zoneId9);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.now(clock10);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now(clock10);
        java.time.Month month13 = offsetDateTime12.getMonth();
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange15 = offsetDateTime12.range((java.time.temporal.TemporalField) chronoField14);
        int int16 = offsetDateTime5.get((java.time.temporal.TemporalField) chronoField14);
        java.time.temporal.Temporal temporal17 = localDateTime0.adjustInto((java.time.temporal.Temporal) offsetDateTime5);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(clock10);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertTrue("'" + month13 + "' != '" + java.time.Month.FEBRUARY + "'", month13.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField14.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(temporal17);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.stream.DoubleStream doubleStream0 = null;
        java.util.stream.DoubleStream doubleStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream2 = java.util.stream.DoubleStream.concat(doubleStream0, doubleStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException1 = new java.util.InvalidPropertiesFormatException("/tmp/hi!2131055779263864112hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.Date date0 = new java.util.Date();
        java.lang.String str1 = date0.toGMTString();
        java.lang.Object obj2 = date0.clone();
        org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 09:14:03 UTC 2022");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "21 Feb 2022 09:14:03 GMT" + "'", str1, "21 Feb 2022 09:14:03 GMT");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "Mon Feb 21 09:14:03 UTC 2022");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "Mon Feb 21 09:14:03 UTC 2022");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "Mon Feb 21 09:14:03 UTC 2022");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.THURSDAY;
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate3 = localDate1.plusWeeks((long) 256);
        java.time.LocalDate localDate5 = localDate1.minusDays((long) (-1));
        java.time.temporal.Temporal temporal6 = dayOfWeek0.adjustInto((java.time.temporal.Temporal) localDate5);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery7 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period8 = dayOfWeek0.query(periodTemporalQuery7);
        java.time.DayOfWeek dayOfWeek10 = dayOfWeek0.minus((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNotNull(periodTemporalQuery7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + dayOfWeek10 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek10.equals(java.time.DayOfWeek.TUESDAY));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.Date date0 = new java.util.Date();
        java.lang.String str1 = date0.toGMTString();
        int int2 = date0.getHours();
        org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 09:14:03 UTC 2022");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "21 Feb 2022 09:14:03 GMT" + "'", str1, "21 Feb 2022 09:14:03 GMT");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.Locale locale1 = new java.util.Locale("1.0.0.10");
        org.junit.Assert.assertEquals(locale1.toString(), "1.0.0.10");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("00:00+18:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 00:00+18:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer3 = java.nio.IntBuffer.wrap(intArray0, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.Set<java.time.chrono.Chronology> chronologySet0 = java.time.chrono.Chronology.getAvailableChronologies();
        org.junit.Assert.assertNotNull(chronologySet0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.of("/tmp/hi!5947512368546913200hi!");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: /tmp/hi!5947512368546913200hi!");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of((long) 22);
        java.util.function.LongUnaryOperator longUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream3 = longStream1.map(longUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(9);
        java.nio.Buffer buffer2 = intBuffer1.mark();
        java.nio.IntBuffer intBuffer3 = intBuffer1.asReadOnlyBuffer();
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(intBuffer3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.lang3.text.StrMatcher strMatcher0 = org.apache.commons.lang3.text.StrMatcher.trimMatcher();
        org.junit.Assert.assertNotNull(strMatcher0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Subject:\n", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=subject:?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.io.File file2 = java.io.File.createTempFile("/tmp/hi!7428662059353686806hi!", "hi!");
        long long3 = file2.getUsableSpace();
        boolean boolean6 = file2.setWritable(true, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file2.toString(), "/tmp/hi!7428662059353686806hi!5162005760036511949hi!");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 280506507264L + "'", long3 == 280506507264L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.LongSummaryStatistics longSummaryStatistics0 = new java.util.LongSummaryStatistics();
        java.util.LongSummaryStatistics longSummaryStatistics1 = new java.util.LongSummaryStatistics();
        java.util.function.IntConsumer intConsumer2 = longSummaryStatistics0.andThen((java.util.function.IntConsumer) longSummaryStatistics1);
        long long3 = longSummaryStatistics0.getMax();
        org.junit.Assert.assertEquals(longSummaryStatistics0.toString(), "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}");
        org.junit.Assert.assertEquals(longSummaryStatistics1.toString(), "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}");
        org.junit.Assert.assertNotNull(intConsumer2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-9223372036854775808L) + "'", long3 == (-9223372036854775808L));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.LocalTime localTime3 = offsetTime0.toLocalTime();
        java.time.LocalTime localTime4 = offsetTime0.toLocalTime();
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId7 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime6);
        java.time.Clock clock8 = java.time.Clock.system(zoneId7);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.now(clock8);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now(clock8);
        java.time.Month month11 = offsetDateTime10.getMonth();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange13 = offsetDateTime10.range((java.time.temporal.TemporalField) chronoField12);
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal15 = offsetTime0.plus(364740218880L, temporalUnit14);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertTrue("'" + month11 + "' != '" + java.time.Month.FEBRUARY + "'", month11.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField12.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.Optional<java.io.Serializable> serializableOptional0 = java.util.Optional.empty();
        boolean boolean1 = serializableOptional0.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(9);
        java.util.Spliterator.OfInt ofInt2 = intStream1.spliterator();
        int int3 = ofInt2.characteristics();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(ofInt2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17488 + "'", int3 == 17488);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.Object[] objArray3 = languageRangeList1.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.Object[] objArray7 = languageRangeList5.toArray();
        int int9 = languageRangeList5.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale13 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale locale17 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.Object[] objArray21 = languageRangeList19.toArray();
        int int23 = languageRangeList19.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray24 = new java.util.RandomAccess[] { languageRangeList5, localeList15, languageRangeList19 };
        java.util.RandomAccess[] randomAccessArray25 = languageRangeList1.toArray(randomAccessArray24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.Object[] objArray29 = languageRangeList27.toArray();
        int int31 = languageRangeList27.indexOf((java.lang.Object) 1.0d);
        boolean boolean32 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream33 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange languageRange34 = null;
        boolean boolean35 = languageRangeList1.add(languageRange34);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream36 = languageRangeList1.stream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray24);
        org.junit.Assert.assertNotNull(randomAccessArray25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(languageRangeStream33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(languageRangeStream36);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.time.Duration duration1 = java.time.Duration.ofDays((long) (byte) 1);
        java.time.Duration duration3 = duration1.plusSeconds(5L);
        java.time.Duration duration4 = java.time.Duration.from((java.time.temporal.TemporalAmount) duration3);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) 10);
        boolean boolean5 = localDate0.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('0', "1.0.0.10");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition1 = new java.text.FieldPosition(field0);
        boolean boolean3 = fieldPosition1.equals((java.lang.Object) 1);
        int int4 = fieldPosition1.getBeginIndex();
        fieldPosition1.setEndIndex(16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.time.Duration duration1 = java.time.Duration.ofDays((long) (byte) 1);
        java.time.Duration duration3 = duration1.plusHours((long) (byte) -1);
        java.time.Duration duration5 = duration3.minusSeconds(10L);
        java.time.Duration duration7 = duration3.minusMillis((long) 17488);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate3 = localDate1.plusWeeks((long) 256);
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) (byte) -1);
        java.time.DayOfWeek dayOfWeek6 = localDate3.getDayOfWeek();
        boolean boolean7 = localDate3.isLeapYear();
        java.time.OffsetTime offsetTime8 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId9 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime8);
        java.time.Clock clock10 = java.time.Clock.system(zoneId9);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.now(clock10);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now(clock10);
        java.time.Month month13 = offsetDateTime12.getMonth();
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange15 = offsetDateTime12.range((java.time.temporal.TemporalField) chronoField14);
        java.time.temporal.TemporalUnit temporalUnit16 = chronoField14.getRangeUnit();
        java.time.LocalTime localTime17 = java.time.LocalTime.MAX;
        java.time.OffsetTime offsetTime18 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime20 = offsetTime18.withNano(0);
        java.time.LocalTime localTime21 = offsetTime18.toLocalTime();
        java.time.LocalTime localTime22 = offsetTime18.toLocalTime();
        java.time.LocalTime localTime23 = localTime17.with((java.time.temporal.TemporalAdjuster) localTime22);
        boolean boolean24 = temporalUnit16.isSupportedBy((java.time.temporal.Temporal) localTime17);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = localDateTime0.until((java.time.temporal.Temporal) localDate3, temporalUnit16);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: -999999995-11-28 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + dayOfWeek6 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek6.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(clock10);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertTrue("'" + month13 + "' != '" + java.time.Month.FEBRUARY + "'", month13.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField14.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertTrue("'" + temporalUnit16 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit16.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.time.Month month0 = java.time.Month.OCTOBER;
        java.time.DayOfWeek dayOfWeek2 = java.time.DayOfWeek.THURSDAY;
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate3.minusDays((long) (-1));
        java.time.temporal.Temporal temporal8 = dayOfWeek2.adjustInto((java.time.temporal.Temporal) localDate7);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery9 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period10 = dayOfWeek2.query(periodTemporalQuery9);
        java.time.LocalTime localTime11 = java.time.LocalTime.MAX;
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime14 = offsetTime12.withNano(0);
        java.time.LocalTime localTime15 = offsetTime12.toLocalTime();
        java.time.LocalTime localTime16 = offsetTime12.toLocalTime();
        java.time.LocalTime localTime17 = localTime11.with((java.time.temporal.TemporalAdjuster) localTime16);
        java.time.OffsetTime offsetTime18 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime20 = offsetTime18.withNano(0);
        java.time.LocalTime localTime21 = offsetTime18.toLocalTime();
        java.time.LocalTime localTime22 = offsetTime18.toLocalTime();
        java.time.LocalTime localTime23 = java.time.LocalTime.MAX;
        int int24 = localTime22.compareTo(localTime23);
        boolean boolean25 = localTime16.equals((java.lang.Object) localTime23);
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition27 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC;
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.MAX;
        java.lang.String str30 = zoneOffset29.getId();
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.MIN;
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransitionRule zoneOffsetTransitionRule32 = java.time.zone.ZoneOffsetTransitionRule.of(month0, (int) (byte) 0, dayOfWeek2, localTime16, true, timeDefinition27, zoneOffset28, zoneOffset29, zoneOffset31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day of month indicator must be between -28 and 31 inclusive excluding zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.OCTOBER + "'", month0.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(temporal8);
        org.junit.Assert.assertNotNull(periodTemporalQuery9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + timeDefinition27 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC + "'", timeDefinition27.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC));
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+18:00" + "'", str30, "+18:00");
        org.junit.Assert.assertNotNull(zoneOffset31);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.parse((java.lang.CharSequence) "iso8601");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'iso8601' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.OVERFLOW;
        boolean boolean1 = coderResult0.isOverflow();
        boolean boolean2 = coderResult0.isOverflow();
        org.junit.Assert.assertNotNull(coderResult0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.util.Locale locale3 = dateTimeFormatter2.getLocale();
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime6 = offsetTime4.withNano(0);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId8 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime7);
        java.time.Clock clock9 = java.time.Clock.system(zoneId8);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.now(clock9);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now(clock9);
        java.time.Month month12 = offsetDateTime11.getMonth();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange14 = offsetDateTime11.range((java.time.temporal.TemporalField) chronoField13);
        boolean boolean15 = offsetTime6.isSupported((java.time.temporal.TemporalField) chronoField13);
        java.time.chrono.IsoEra isoEra16 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime19 = offsetTime17.withNano(0);
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId21 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime20);
        java.time.Clock clock22 = java.time.Clock.system(zoneId21);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.now(clock22);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now(clock22);
        java.time.Month month25 = offsetDateTime24.getMonth();
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange27 = offsetDateTime24.range((java.time.temporal.TemporalField) chronoField26);
        boolean boolean28 = offsetTime19.isSupported((java.time.temporal.TemporalField) chronoField26);
        long long29 = isoEra16.getLong((java.time.temporal.TemporalField) chronoField26);
        java.time.chrono.IsoEra isoEra30 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime31 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime33 = offsetTime31.withNano(0);
        java.time.OffsetTime offsetTime34 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId35 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime34);
        java.time.Clock clock36 = java.time.Clock.system(zoneId35);
        java.time.OffsetTime offsetTime37 = java.time.OffsetTime.now(clock36);
        java.time.OffsetDateTime offsetDateTime38 = java.time.OffsetDateTime.now(clock36);
        java.time.Month month39 = offsetDateTime38.getMonth();
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange41 = offsetDateTime38.range((java.time.temporal.TemporalField) chronoField40);
        boolean boolean42 = offsetTime33.isSupported((java.time.temporal.TemporalField) chronoField40);
        long long43 = isoEra30.getLong((java.time.temporal.TemporalField) chronoField40);
        java.time.temporal.TemporalField[] temporalFieldArray44 = new java.time.temporal.TemporalField[] { chronoField13, chronoField26, chronoField40 };
        java.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter2.withResolverFields(temporalFieldArray44);
        java.lang.String str46 = localDateTime1.format(dateTimeFormatter45);
        int int47 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime49 = localDateTime0.plusDays((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + month12 + "' != '" + java.time.Month.FEBRUARY + "'", month12.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField13.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + isoEra16 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra16.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertTrue("'" + month25 + "' != '" + java.time.Month.FEBRUARY + "'", month25.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField26.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + isoEra30 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra30.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(offsetTime34);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertNotNull(clock36);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertTrue("'" + month39 + "' != '" + java.time.Month.FEBRUARY + "'", month39.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField40.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-999999999-W01-1" + "'", str46, "-999999999-W01-1");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.util.Locale locale2 = dateTimeFormatter1.getLocale();
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime5 = offsetTime3.withNano(0);
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId7 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime6);
        java.time.Clock clock8 = java.time.Clock.system(zoneId7);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.now(clock8);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now(clock8);
        java.time.Month month11 = offsetDateTime10.getMonth();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange13 = offsetDateTime10.range((java.time.temporal.TemporalField) chronoField12);
        boolean boolean14 = offsetTime5.isSupported((java.time.temporal.TemporalField) chronoField12);
        java.time.chrono.IsoEra isoEra15 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime18 = offsetTime16.withNano(0);
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId20 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime19);
        java.time.Clock clock21 = java.time.Clock.system(zoneId20);
        java.time.OffsetTime offsetTime22 = java.time.OffsetTime.now(clock21);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now(clock21);
        java.time.Month month24 = offsetDateTime23.getMonth();
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange26 = offsetDateTime23.range((java.time.temporal.TemporalField) chronoField25);
        boolean boolean27 = offsetTime18.isSupported((java.time.temporal.TemporalField) chronoField25);
        long long28 = isoEra15.getLong((java.time.temporal.TemporalField) chronoField25);
        java.time.chrono.IsoEra isoEra29 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime30 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime32 = offsetTime30.withNano(0);
        java.time.OffsetTime offsetTime33 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId34 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime33);
        java.time.Clock clock35 = java.time.Clock.system(zoneId34);
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.now(clock35);
        java.time.OffsetDateTime offsetDateTime37 = java.time.OffsetDateTime.now(clock35);
        java.time.Month month38 = offsetDateTime37.getMonth();
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange40 = offsetDateTime37.range((java.time.temporal.TemporalField) chronoField39);
        boolean boolean41 = offsetTime32.isSupported((java.time.temporal.TemporalField) chronoField39);
        long long42 = isoEra29.getLong((java.time.temporal.TemporalField) chronoField39);
        java.time.temporal.TemporalField[] temporalFieldArray43 = new java.time.temporal.TemporalField[] { chronoField12, chronoField25, chronoField39 };
        java.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter1.withResolverFields(temporalFieldArray43);
        java.lang.String str45 = localDateTime0.format(dateTimeFormatter44);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime47 = localDateTime0.minusSeconds(280506515456L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000008888");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertTrue("'" + month11 + "' != '" + java.time.Month.FEBRUARY + "'", month11.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField12.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + isoEra15 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra15.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertTrue("'" + month24 + "' != '" + java.time.Month.FEBRUARY + "'", month24.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField25.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + isoEra29 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra29.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertNotNull(clock35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(offsetDateTime37);
        org.junit.Assert.assertTrue("'" + month38 + "' != '" + java.time.Month.FEBRUARY + "'", month38.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField39.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-999999999-W01-1" + "'", str45, "-999999999-W01-1");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getMinutes();
        java.util.Date date2 = new java.util.Date();
        boolean boolean3 = date0.after(date2);
        org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 09:14:03 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
        org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 09:14:03 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.time.Duration duration1 = java.time.Duration.ofDays((long) (byte) 1);
        long long2 = duration1.getSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 86400L + "'", long2 == 86400L);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        java.time.Month month5 = offsetDateTime4.getMonth();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange7 = offsetDateTime4.range((java.time.temporal.TemporalField) chronoField6);
        java.time.temporal.TemporalUnit temporalUnit8 = chronoField6.getRangeUnit();
        java.time.LocalTime localTime9 = java.time.LocalTime.MAX;
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime12 = offsetTime10.withNano(0);
        java.time.LocalTime localTime13 = offsetTime10.toLocalTime();
        java.time.LocalTime localTime14 = offsetTime10.toLocalTime();
        java.time.LocalTime localTime15 = localTime9.with((java.time.temporal.TemporalAdjuster) localTime14);
        boolean boolean16 = temporalUnit8.isSupportedBy((java.time.temporal.Temporal) localTime9);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId18 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.Clock clock19 = java.time.Clock.system(zoneId18);
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.now(clock19);
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now(clock19);
        java.time.OffsetDateTime offsetDateTime23 = offsetDateTime21.withNano((int) (short) 100);
        java.time.OffsetTime offsetTime24 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId25 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime24);
        java.time.Clock clock26 = java.time.Clock.system(zoneId25);
        java.time.OffsetTime offsetTime27 = java.time.OffsetTime.now(clock26);
        java.time.OffsetDateTime offsetDateTime28 = java.time.OffsetDateTime.now(clock26);
        java.time.Month month29 = offsetDateTime28.getMonth();
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange31 = offsetDateTime28.range((java.time.temporal.TemporalField) chronoField30);
        int int32 = offsetDateTime21.get((java.time.temporal.TemporalField) chronoField30);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = localTime9.get((java.time.temporal.TemporalField) chronoField30);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Era");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField6.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange7);
        org.junit.Assert.assertTrue("'" + temporalUnit8 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit8.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(clock26);
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertTrue("'" + month29 + "' != '" + java.time.Month.FEBRUARY + "'", month29.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField30.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.stream.IntStream.Builder builder0 = java.util.stream.IntStream.builder();
        java.util.stream.IntStream intStream1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream.Builder builder3 = builder0.add((int) ':');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.net.UnknownHostException unknownHostException0 = new java.net.UnknownHostException();
        java.net.UnknownHostException unknownHostException1 = new java.net.UnknownHostException();
        unknownHostException0.addSuppressed((java.lang.Throwable) unknownHostException1);
        java.io.UnsupportedEncodingException unsupportedEncodingException4 = new java.io.UnsupportedEncodingException();
        java.util.concurrent.ExecutionException executionException5 = new java.util.concurrent.ExecutionException("", (java.lang.Throwable) unsupportedEncodingException4);
        unknownHostException1.addSuppressed((java.lang.Throwable) executionException5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        java.time.Period period8 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.LocalDate localDate10 = localDate7.plusMonths((long) 9);
        java.time.LocalDate localDate12 = localDate10.minusMonths((long) 29);
        java.time.chrono.ChronoLocalDate chronoLocalDate13 = java.time.chrono.ChronoLocalDate.from((java.time.temporal.TemporalAccessor) localDate10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronoLocalDate13);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress3 = java.net.InetAddress.getByAddress("+18:00", byteArray2);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.LocalTime localTime3 = offsetTime0.toLocalTime();
        int int4 = localTime3.getHour();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.from((java.time.temporal.TemporalAccessor) localTime3);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZoneOffset from TemporalAccessor: 00:00 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.now(clock2);
        int int4 = offsetDateTime3.getSecond();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate4 = localDate2.plusWeeks((long) (byte) -1);
        int int5 = localDate2.lengthOfYear();
        java.time.chrono.IsoChronology isoChronology6 = localDate2.getChronology();
        java.lang.String str7 = isoChronology6.getCalendarType();
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.time.temporal.ValueRange valueRange9 = isoChronology6.range(chronoField8);
        java.lang.Object obj10 = null;
        boolean boolean11 = isoChronology6.equals(obj10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "iso8601" + "'", str7, "iso8601");
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField8.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(9);
        java.util.Spliterator.OfInt ofInt2 = intStream1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt3 = intStream1.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(ofInt2);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery0 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        org.junit.Assert.assertNotNull(booleanTemporalQuery0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        java.time.Period period8 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.LocalDate localDate10 = localDate7.plusMonths((long) 9);
        java.time.temporal.TemporalField temporalField11 = null;
        boolean boolean12 = localDate10.isSupported(temporalField11);
        boolean boolean14 = localDate10.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime2 = localDateTime0.plusHours((long) 751000000);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        java.io.Writer writer3 = printWriter1.append((java.lang.CharSequence) "/tmp/hi!6466040413251194584hi!");
        java.io.Writer writer5 = printWriter1.append((java.lang.CharSequence) "/tmp/hi!7428662059353686806hi!");
        org.junit.Assert.assertNotNull(writer3);
        org.junit.Assert.assertNotNull(writer5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate4 = localDate2.plusWeeks((long) (byte) -1);
        java.time.DayOfWeek dayOfWeek5 = localDate2.getDayOfWeek();
        boolean boolean6 = localDate2.isLeapYear();
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime9 = offsetTime7.withNano(0);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId11 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime10);
        java.time.Clock clock12 = java.time.Clock.system(zoneId11);
        java.time.OffsetTime offsetTime13 = java.time.OffsetTime.now(clock12);
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now(clock12);
        java.time.Month month15 = offsetDateTime14.getMonth();
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange17 = offsetDateTime14.range((java.time.temporal.TemporalField) chronoField16);
        boolean boolean18 = offsetTime9.isSupported((java.time.temporal.TemporalField) chronoField16);
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId20 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime19);
        java.time.Clock clock21 = java.time.Clock.system(zoneId20);
        java.time.OffsetTime offsetTime22 = java.time.OffsetTime.now(clock21);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now(clock21);
        java.time.Month month24 = offsetDateTime23.getMonth();
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange26 = offsetDateTime23.range((java.time.temporal.TemporalField) chronoField25);
        java.time.temporal.TemporalUnit temporalUnit27 = chronoField25.getRangeUnit();
        boolean boolean28 = temporalUnit27.isDurationEstimated();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = localDate2.until((java.time.temporal.Temporal) offsetTime9, temporalUnit27);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDate from TemporalAccessor: 00:00+18:00 of type java.time.OffsetTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + dayOfWeek5 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek5.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNotNull(clock12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertTrue("'" + month15 + "' != '" + java.time.Month.FEBRUARY + "'", month15.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField16.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertTrue("'" + month24 + "' != '" + java.time.Month.FEBRUARY + "'", month24.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField25.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange26);
        org.junit.Assert.assertTrue("'" + temporalUnit27 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit27.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = org.apache.commons.lang3.text.StrMatcher.charMatcher('a');
        char[] charArray6 = new char[] { '#', '#', ':', ':' };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = strMatcher1.isMatch(charArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "##::");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "##::");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, :, :]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MINUTES;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        long long3 = timeUnit0.convert((long) (byte) 1, timeUnit2);
        long long5 = timeUnit0.toDays((long) (short) -1);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertNotNull(timeUnit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.time.Period period1 = java.time.Period.ofYears((int) '4');
        java.time.chrono.Chronology chronology2 = period1.getChronology();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        boolean boolean1 = chronoField0.isTimeBased();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("/tmp/hi!6288073446570085602hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream0, false, "/tmp/hi!6466040413251194584hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray4 = new java.util.Locale[] { locale3 };
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.Locale locale7 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList5);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor8 = languageRangeList1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(languageRangeItor8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.util.Locale locale3 = dateTimeFormatter2.getLocale();
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime6 = offsetTime4.withNano(0);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId8 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime7);
        java.time.Clock clock9 = java.time.Clock.system(zoneId8);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.now(clock9);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now(clock9);
        java.time.Month month12 = offsetDateTime11.getMonth();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange14 = offsetDateTime11.range((java.time.temporal.TemporalField) chronoField13);
        boolean boolean15 = offsetTime6.isSupported((java.time.temporal.TemporalField) chronoField13);
        java.time.chrono.IsoEra isoEra16 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime19 = offsetTime17.withNano(0);
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId21 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime20);
        java.time.Clock clock22 = java.time.Clock.system(zoneId21);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.now(clock22);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now(clock22);
        java.time.Month month25 = offsetDateTime24.getMonth();
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange27 = offsetDateTime24.range((java.time.temporal.TemporalField) chronoField26);
        boolean boolean28 = offsetTime19.isSupported((java.time.temporal.TemporalField) chronoField26);
        long long29 = isoEra16.getLong((java.time.temporal.TemporalField) chronoField26);
        java.time.chrono.IsoEra isoEra30 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime31 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime33 = offsetTime31.withNano(0);
        java.time.OffsetTime offsetTime34 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId35 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime34);
        java.time.Clock clock36 = java.time.Clock.system(zoneId35);
        java.time.OffsetTime offsetTime37 = java.time.OffsetTime.now(clock36);
        java.time.OffsetDateTime offsetDateTime38 = java.time.OffsetDateTime.now(clock36);
        java.time.Month month39 = offsetDateTime38.getMonth();
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange41 = offsetDateTime38.range((java.time.temporal.TemporalField) chronoField40);
        boolean boolean42 = offsetTime33.isSupported((java.time.temporal.TemporalField) chronoField40);
        long long43 = isoEra30.getLong((java.time.temporal.TemporalField) chronoField40);
        java.time.temporal.TemporalField[] temporalFieldArray44 = new java.time.temporal.TemporalField[] { chronoField13, chronoField26, chronoField40 };
        java.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter2.withResolverFields(temporalFieldArray44);
        java.lang.String str46 = localDateTime1.format(dateTimeFormatter45);
        int int47 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime49 = localDateTime0.withHour(240);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 240");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + month12 + "' != '" + java.time.Month.FEBRUARY + "'", month12.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField13.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + isoEra16 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra16.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertTrue("'" + month25 + "' != '" + java.time.Month.FEBRUARY + "'", month25.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField26.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + isoEra30 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra30.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(offsetTime34);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertNotNull(clock36);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertTrue("'" + month39 + "' != '" + java.time.Month.FEBRUARY + "'", month39.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField40.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-999999999-W01-1" + "'", str46, "-999999999-W01-1");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.FRIDAY;
        java.time.DayOfWeek dayOfWeek2 = dayOfWeek0.plus((long) 16384);
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.FRIDAY));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.TUESDAY));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of((long) 22);
        java.util.function.LongBinaryOperator longBinaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalLong optionalLong3 = longStream1.reduce(longBinaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant2 = instant0.minusMillis(21884413132800L);
        java.time.Instant instant4 = instant2.minusMillis((long) 29);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId6 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.LocalTime localTime7 = java.time.LocalTime.now(zoneId6);
        java.time.ZonedDateTime zonedDateTime8 = java.time.ZonedDateTime.ofInstant(instant2, zoneId6);
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.plusMinutes(10L);
        int int11 = zonedDateTime8.getYear();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1328 + "'", int11 == 1328);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]", "PRIVATE", "France", "", "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]", "+18:00", "/tmp/hi!3847920127589186503hi!", "/tmp/hi!7428662059353686806hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.Object[] objArray14 = languageRangeList12.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.Object[] objArray18 = languageRangeList16.toArray();
        int int20 = languageRangeList16.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale24 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList26);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.Object[] objArray32 = languageRangeList30.toArray();
        int int34 = languageRangeList30.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray35 = new java.util.RandomAccess[] { languageRangeList16, localeList26, languageRangeList30 };
        java.util.RandomAccess[] randomAccessArray36 = languageRangeList12.toArray(randomAccessArray35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.Object[] objArray40 = languageRangeList38.toArray();
        int int42 = languageRangeList38.indexOf((java.lang.Object) 1.0d);
        boolean boolean43 = languageRangeList12.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        boolean boolean44 = strSet9.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        boolean boolean46 = strSet9.add("/tmp/hi!7097461245081546947hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray35);
        org.junit.Assert.assertNotNull(randomAccessArray36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(9);
        java.nio.Buffer buffer2 = intBuffer1.clear();
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Subject:\n" + "'", str1, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]", "PRIVATE", "France", "", "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]", "+18:00", "/tmp/hi!3847920127589186503hi!", "/tmp/hi!7428662059353686806hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.Object[] objArray14 = languageRangeList12.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.Object[] objArray18 = languageRangeList16.toArray();
        int int20 = languageRangeList16.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale24 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList26);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.Object[] objArray32 = languageRangeList30.toArray();
        int int34 = languageRangeList30.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray35 = new java.util.RandomAccess[] { languageRangeList16, localeList26, languageRangeList30 };
        java.util.RandomAccess[] randomAccessArray36 = languageRangeList12.toArray(randomAccessArray35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.Object[] objArray40 = languageRangeList38.toArray();
        int int42 = languageRangeList38.indexOf((java.lang.Object) 1.0d);
        boolean boolean43 = languageRangeList12.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        boolean boolean44 = strSet9.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.lang.Object[] objArray48 = languageRangeList46.toArray();
        boolean boolean49 = languageRangeList38.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray35);
        org.junit.Assert.assertNotNull(randomAccessArray36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.time.Month month0 = java.time.Month.FEBRUARY;
        int int1 = month0.maxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.from((java.time.temporal.TemporalAccessor) month0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: FEBRUARY of type java.time.Month");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.FEBRUARY + "'", month0.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.text.Format.Field field2 = null;
        java.text.FieldPosition fieldPosition3 = new java.text.FieldPosition(field2);
        java.util.Locale locale5 = new java.util.Locale("hi!");
        boolean boolean6 = fieldPosition3.equals((java.lang.Object) locale5);
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.util.Set<java.lang.String> strSet8 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.Object[] objArray12 = languageRangeList10.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.Object[] objArray16 = languageRangeList14.toArray();
        int int18 = languageRangeList14.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray23 = new java.util.Locale[] { locale22 };
        java.util.ArrayList<java.util.Locale> localeList24 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList24, localeArray23);
        java.util.Locale locale26 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList24);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.Object[] objArray30 = languageRangeList28.toArray();
        int int32 = languageRangeList28.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray33 = new java.util.RandomAccess[] { languageRangeList14, localeList24, languageRangeList28 };
        java.util.RandomAccess[] randomAccessArray34 = languageRangeList10.toArray(randomAccessArray33);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.lang.Object[] objArray38 = languageRangeList36.toArray();
        int int40 = languageRangeList36.indexOf((java.lang.Object) 1.0d);
        boolean boolean41 = languageRangeList10.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
        boolean boolean42 = strSet8.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(localeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray33);
        org.junit.Assert.assertNotNull(randomAccessArray34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.HOUR_OF_AMPM;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.HOUR_OF_AMPM));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.SHORT;
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.SHORT + "'", formatStyle0.equals(java.time.format.FormatStyle.SHORT));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.util.Locale locale3 = dateTimeFormatter2.getLocale();
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime6 = offsetTime4.withNano(0);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId8 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime7);
        java.time.Clock clock9 = java.time.Clock.system(zoneId8);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.now(clock9);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now(clock9);
        java.time.Month month12 = offsetDateTime11.getMonth();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange14 = offsetDateTime11.range((java.time.temporal.TemporalField) chronoField13);
        boolean boolean15 = offsetTime6.isSupported((java.time.temporal.TemporalField) chronoField13);
        java.time.chrono.IsoEra isoEra16 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime19 = offsetTime17.withNano(0);
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId21 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime20);
        java.time.Clock clock22 = java.time.Clock.system(zoneId21);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.now(clock22);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now(clock22);
        java.time.Month month25 = offsetDateTime24.getMonth();
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange27 = offsetDateTime24.range((java.time.temporal.TemporalField) chronoField26);
        boolean boolean28 = offsetTime19.isSupported((java.time.temporal.TemporalField) chronoField26);
        long long29 = isoEra16.getLong((java.time.temporal.TemporalField) chronoField26);
        java.time.chrono.IsoEra isoEra30 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime31 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime33 = offsetTime31.withNano(0);
        java.time.OffsetTime offsetTime34 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId35 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime34);
        java.time.Clock clock36 = java.time.Clock.system(zoneId35);
        java.time.OffsetTime offsetTime37 = java.time.OffsetTime.now(clock36);
        java.time.OffsetDateTime offsetDateTime38 = java.time.OffsetDateTime.now(clock36);
        java.time.Month month39 = offsetDateTime38.getMonth();
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange41 = offsetDateTime38.range((java.time.temporal.TemporalField) chronoField40);
        boolean boolean42 = offsetTime33.isSupported((java.time.temporal.TemporalField) chronoField40);
        long long43 = isoEra30.getLong((java.time.temporal.TemporalField) chronoField40);
        java.time.temporal.TemporalField[] temporalFieldArray44 = new java.time.temporal.TemporalField[] { chronoField13, chronoField26, chronoField40 };
        java.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter2.withResolverFields(temporalFieldArray44);
        java.lang.String str46 = localDateTime1.format(dateTimeFormatter45);
        int int47 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.chrono.Chronology chronology48 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.OffsetTime offsetTime49 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime51 = offsetTime49.withNano(0);
        java.time.LocalTime localTime52 = offsetTime49.toLocalTime();
        java.time.LocalTime localTime53 = offsetTime49.toLocalTime();
        java.time.LocalTime localTime54 = java.time.LocalTime.MAX;
        int int55 = localTime53.compareTo(localTime54);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime56 = localDateTime1.with((java.time.temporal.TemporalAdjuster) localTime53);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + month12 + "' != '" + java.time.Month.FEBRUARY + "'", month12.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField13.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + isoEra16 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra16.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertTrue("'" + month25 + "' != '" + java.time.Month.FEBRUARY + "'", month25.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField26.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + isoEra30 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra30.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(offsetTime34);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertNotNull(clock36);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertTrue("'" + month39 + "' != '" + java.time.Month.FEBRUARY + "'", month39.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField40.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-999999999-W01-1" + "'", str46, "-999999999-W01-1");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(offsetTime49);
        org.junit.Assert.assertNotNull(offsetTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime56);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.net.SocketException socketException1 = new java.net.SocketException("");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.util.Hashtable<byte[], int[]> byteArrayMap2 = new java.util.Hashtable<byte[], int[]>((int) (byte) 100, (float) 9);
        java.util.Collection<int[]> intArrayCollection3 = byteArrayMap2.values();
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.text.Format.Field field6 = null;
        java.text.FieldPosition fieldPosition7 = new java.text.FieldPosition(field6);
        java.util.Locale locale9 = new java.util.Locale("hi!");
        boolean boolean10 = fieldPosition7.equals((java.lang.Object) locale9);
        java.lang.String str11 = locale5.getDisplayCountry(locale9);
        int[] intArray12 = byteArrayMap2.remove((java.lang.Object) locale9);
        org.junit.Assert.assertNotNull(intArrayCollection3);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.net.SocketException socketException1 = new java.net.SocketException("/tmp/hi!7097461245081546947hi!");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.time.Duration duration1 = java.time.Duration.ofDays((long) (byte) 1);
        java.time.Duration duration3 = duration1.plusSeconds(5L);
        java.time.Duration duration5 = java.time.Duration.ofMillis(0L);
        java.time.Duration duration7 = duration5.plusDays((long) (byte) 10);
        java.time.Duration duration8 = duration3.minus(duration7);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate4 = localDate2.plusWeeks((long) (byte) -1);
        int int5 = localDate2.lengthOfYear();
        java.time.chrono.IsoChronology isoChronology6 = localDate2.getChronology();
        java.lang.String str7 = isoChronology6.getCalendarType();
        java.time.Instant instant8 = java.time.Instant.now();
        java.time.LocalDate localDate9 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate11 = localDate9.plusWeeks((long) 256);
        java.time.LocalDate localDate13 = localDate11.plusWeeks((long) (byte) -1);
        java.time.DayOfWeek dayOfWeek14 = localDate11.getDayOfWeek();
        boolean boolean15 = localDate11.isLeapYear();
        int int16 = localDate11.getMonthValue();
        boolean boolean17 = instant8.equals((java.lang.Object) localDate11);
        java.time.OffsetTime offsetTime18 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId19 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime18);
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime20 = isoChronology6.zonedDateTime(instant8, zoneId19);
        java.time.Month month21 = java.time.Month.FEBRUARY;
        int int22 = month21.maxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime23 = isoChronology6.zonedDateTime((java.time.temporal.TemporalAccessor) month21);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: FEBRUARY of type java.time.Month");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "iso8601" + "'", str7, "iso8601");
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + dayOfWeek14 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek14.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + month21 + "' != '" + java.time.Month.FEBRUARY + "'", month21.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        java.net.InetAddress inetAddress5 = java.net.InetAddress.getByAddress(byteArray4);
        java.net.InetAddress inetAddress6 = java.net.InetAddress.getByAddress(byteArray4);
        java.net.NetworkInterface networkInterface7 = null;
        boolean boolean10 = inetAddress6.isReachable(networkInterface7, 29, 365);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(inetAddress5);
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.Duration duration4 = java.time.Duration.ofMillis(0L);
        java.time.temporal.Temporal temporal5 = offsetTime2.plus((java.time.temporal.TemporalAmount) duration4);
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId7 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime6);
        java.time.Clock clock8 = java.time.Clock.system(zoneId7);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.now(clock8);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now(clock8);
        java.time.OffsetDateTime offsetDateTime12 = offsetDateTime10.withNano((int) (short) 100);
        java.time.OffsetTime offsetTime13 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId14 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime13);
        java.time.Clock clock15 = java.time.Clock.system(zoneId14);
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.now(clock15);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now(clock15);
        java.time.Month month18 = offsetDateTime17.getMonth();
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange20 = offsetDateTime17.range((java.time.temporal.TemporalField) chronoField19);
        int int21 = offsetDateTime10.get((java.time.temporal.TemporalField) chronoField19);
        java.time.temporal.TemporalUnit temporalUnit22 = chronoField19.getBaseUnit();
        boolean boolean23 = offsetTime2.isSupported(temporalUnit22);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(temporal5);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertTrue("'" + month18 + "' != '" + java.time.Month.FEBRUARY + "'", month18.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField19.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + temporalUnit22 + "' != '" + java.time.temporal.ChronoUnit.ERAS + "'", temporalUnit22.equals(java.time.temporal.ChronoUnit.ERAS));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate4 = localDate2.plusWeeks((long) (byte) -1);
        int int5 = localDate2.lengthOfYear();
        java.time.chrono.IsoChronology isoChronology6 = localDate2.getChronology();
        java.lang.String str7 = isoChronology6.getCalendarType();
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.time.temporal.ValueRange valueRange9 = isoChronology6.range(chronoField8);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId11 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime10);
        java.time.Clock clock12 = java.time.Clock.system(zoneId11);
        java.time.chrono.ChronoLocalDate chronoLocalDate13 = isoChronology6.dateNow(clock12);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "iso8601" + "'", str7, "iso8601");
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField8.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNotNull(clock12);
        org.junit.Assert.assertNotNull(chronoLocalDate13);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 29);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.util.stream.IntStream.Builder builder0 = java.util.stream.IntStream.builder();
        java.util.stream.IntStream intStream1 = builder0.build();
        java.util.OptionalDouble optionalDouble2 = intStream1.average();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.stream.LongStream.Builder builder0 = java.util.stream.LongStream.builder();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        java.time.Month month5 = offsetDateTime4.getMonth();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange7 = offsetDateTime4.range((java.time.temporal.TemporalField) chronoField6);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.MAX;
        java.lang.String str9 = zoneOffset8.getId();
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime4.withOffsetSameLocal(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField6.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+18:00" + "'", str9, "+18:00");
        org.junit.Assert.assertNotNull(offsetDateTime10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime4.plusDays((long) (byte) 10);
        java.time.OffsetTime offsetTime7 = offsetDateTime6.toOffsetTime();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetTime7);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.time.Duration duration2 = java.time.Duration.ofSeconds((long) '#', (long) 11);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("/tmp/hi!3847920127589186503hi!", "/tmp/hi!6288073446570085602hi!", "21 Feb 2022 09:14:02 GMT");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: /tmp/hi!3847920127589186503hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.LocalTime localTime3 = offsetTime0.toLocalTime();
        int int4 = localTime3.getHour();
        java.time.LocalTime localTime6 = localTime3.minusNanos((long) (short) 100);
        java.time.LocalTime localTime8 = localTime6.plusHours((-1L));
        java.time.LocalTime localTime10 = localTime8.minusNanos((long) 100);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLoopbackAddress();
        boolean boolean1 = inetAddress0.isMCNodeLocal();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.THURSDAY;
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate3 = localDate1.plusWeeks((long) 256);
        java.time.LocalDate localDate5 = localDate1.minusDays((long) (-1));
        java.time.temporal.Temporal temporal6 = dayOfWeek0.adjustInto((java.time.temporal.Temporal) localDate5);
        java.time.LocalDateTime localDateTime9 = localDate5.atTime(0, (int) (short) 10);
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        boolean boolean11 = localDate5.isSupported((java.time.temporal.TemporalField) chronoField10);
        java.time.chrono.Chronology chronology12 = localDate5.getChronology();
        int int13 = localDate5.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField10.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate6 = localDate4.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate9 = localDate7.plusWeeks((long) 256);
        java.time.LocalDate localDate11 = localDate9.plusWeeks((long) (byte) -1);
        java.time.Period period12 = localDate4.until((java.time.chrono.ChronoLocalDate) localDate11);
        java.time.Period period13 = period12.negated();
        java.time.Period period15 = period12.withDays((int) (byte) -1);
        java.time.Period period17 = period15.plusDays((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime18 = offsetTime3.minus((java.time.temporal.TemporalAmount) period15);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        java.time.Period period8 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.Period period9 = period8.negated();
        java.time.Period period11 = period8.withDays((int) (byte) -1);
        java.time.Period period13 = period11.plusDays((long) 'a');
        int int14 = period11.getYears();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant2 = instant0.minusMillis(21884413132800L);
        long long3 = instant0.getEpochSecond();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645434845L + "'", long3 == 1645434845L);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        java.time.Month month5 = offsetDateTime4.getMonth();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange7 = offsetDateTime4.range((java.time.temporal.TemporalField) chronoField6);
        long long8 = valueRange7.getLargestMinimum();
        long long9 = valueRange7.getMaximum();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField6.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.time.Month month0 = java.time.Month.JULY;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JULY + "'", month0.equals(java.time.Month.JULY));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.Duration duration4 = java.time.Duration.ofMillis(0L);
        java.time.Duration duration6 = duration4.plusNanos((long) (byte) -1);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime9 = offsetTime7.withNano(0);
        java.time.temporal.Temporal temporal10 = duration4.subtractFrom((java.time.temporal.Temporal) offsetTime7);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime13 = offsetTime11.withNano(0);
        boolean boolean14 = offsetTime7.isAfter(offsetTime11);
        boolean boolean15 = offsetTime2.isEqual(offsetTime11);
        java.time.LocalDate localDate16 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate18 = localDate16.plusWeeks((long) 256);
        java.time.LocalDate localDate19 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate21 = localDate19.plusWeeks((long) 256);
        java.time.LocalDate localDate23 = localDate21.plusWeeks((long) (byte) -1);
        java.time.Period period24 = localDate16.until((java.time.chrono.ChronoLocalDate) localDate23);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime25 = offsetTime11.with((java.time.temporal.TemporalAdjuster) localDate23);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(temporal10);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("FRA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.util.Hashtable<byte[], int[]> byteArrayMap2 = new java.util.Hashtable<byte[], int[]>((int) (byte) 100, (float) 9);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime5 = offsetTime3.withNano(0);
        boolean boolean6 = byteArrayMap2.equals((java.lang.Object) offsetTime5);
        int int7 = byteArrayMap2.size();
        java.util.Collection<int[]> intArrayCollection8 = byteArrayMap2.values();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        int[] intArray20 = new int[] { 100, 256, (short) 1, (byte) 100, (short) -1 };
        int[] intArray26 = new int[] { (byte) 10, 64, 256, (short) 100, (short) 0 };
        java.util.stream.IntStream intStream27 = java.util.stream.IntStream.of(intArray26);
        boolean boolean28 = byteArrayMap2.replace(byteArray14, intArray20, intArray26);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArrayCollection8);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 0, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 256, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 64, 256, 100, 0]");
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.util.Locale locale2 = dateTimeFormatter1.getLocale();
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime5 = offsetTime3.withNano(0);
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId7 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime6);
        java.time.Clock clock8 = java.time.Clock.system(zoneId7);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.now(clock8);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now(clock8);
        java.time.Month month11 = offsetDateTime10.getMonth();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange13 = offsetDateTime10.range((java.time.temporal.TemporalField) chronoField12);
        boolean boolean14 = offsetTime5.isSupported((java.time.temporal.TemporalField) chronoField12);
        java.time.chrono.IsoEra isoEra15 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime18 = offsetTime16.withNano(0);
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId20 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime19);
        java.time.Clock clock21 = java.time.Clock.system(zoneId20);
        java.time.OffsetTime offsetTime22 = java.time.OffsetTime.now(clock21);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now(clock21);
        java.time.Month month24 = offsetDateTime23.getMonth();
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange26 = offsetDateTime23.range((java.time.temporal.TemporalField) chronoField25);
        boolean boolean27 = offsetTime18.isSupported((java.time.temporal.TemporalField) chronoField25);
        long long28 = isoEra15.getLong((java.time.temporal.TemporalField) chronoField25);
        java.time.chrono.IsoEra isoEra29 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime30 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime32 = offsetTime30.withNano(0);
        java.time.OffsetTime offsetTime33 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId34 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime33);
        java.time.Clock clock35 = java.time.Clock.system(zoneId34);
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.now(clock35);
        java.time.OffsetDateTime offsetDateTime37 = java.time.OffsetDateTime.now(clock35);
        java.time.Month month38 = offsetDateTime37.getMonth();
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange40 = offsetDateTime37.range((java.time.temporal.TemporalField) chronoField39);
        boolean boolean41 = offsetTime32.isSupported((java.time.temporal.TemporalField) chronoField39);
        long long42 = isoEra29.getLong((java.time.temporal.TemporalField) chronoField39);
        java.time.temporal.TemporalField[] temporalFieldArray43 = new java.time.temporal.TemporalField[] { chronoField12, chronoField25, chronoField39 };
        java.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter1.withResolverFields(temporalFieldArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime45 = java.time.LocalDateTime.parse((java.lang.CharSequence) "/tmp/hi!2131055779263864112hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '/tmp/hi!2131055779263864112hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertTrue("'" + month11 + "' != '" + java.time.Month.FEBRUARY + "'", month11.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField12.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + isoEra15 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra15.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertTrue("'" + month24 + "' != '" + java.time.Month.FEBRUARY + "'", month24.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField25.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + isoEra29 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra29.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertNotNull(clock35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(offsetDateTime37);
        org.junit.Assert.assertTrue("'" + month38 + "' != '" + java.time.Month.FEBRUARY + "'", month38.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField39.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime4.withNano((int) (short) 100);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period8 = offsetDateTime6.query(periodTemporalQuery7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle1 = textStyle0.asNormal();
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle0.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle1.equals(java.time.format.TextStyle.NARROW));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByIndex((int) (short) 100);
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.text.Format.Field field2 = null;
        java.text.FieldPosition fieldPosition3 = new java.text.FieldPosition(field2);
        java.util.Locale locale5 = new java.util.Locale("hi!");
        boolean boolean6 = fieldPosition3.equals((java.lang.Object) locale5);
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.util.Set<java.lang.String> strSet8 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.Object[] objArray12 = languageRangeList10.toArray();
        int int13 = languageRangeList10.size();
        boolean boolean14 = strSet8.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10);
        java.io.File file17 = null;
        java.io.File file18 = java.io.File.createTempFile("hi!", "hi!", file17);
        java.io.File file19 = file18.getAbsoluteFile();
        boolean boolean20 = languageRangeList10.contains((java.lang.Object) file19);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file18.toString(), "/tmp/hi!5550829629667851672hi!");
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file19.toString(), "/tmp/hi!5550829629667851672hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.format.DecimalStyle decimalStyle1 = dateTimeFormatter0.getDecimalStyle();
        java.time.format.DecimalStyle decimalStyle3 = decimalStyle1.withZeroDigit(' ');
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
        org.junit.Assert.assertNotNull(decimalStyle3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) 10);
        java.time.LocalDate localDate3 = localDate1.withDayOfYear(9);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.WEDNESDAY));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.flush();
        printWriter1.flush();
        char[] charArray7 = new char[] { ' ', 'a', ':' };
        printWriter1.println(charArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.Object[] objArray13 = languageRangeList11.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.Object[] objArray17 = languageRangeList15.toArray();
        int int19 = languageRangeList15.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale23 };
        java.util.ArrayList<java.util.Locale> localeList25 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList25, localeArray24);
        java.util.Locale locale27 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList25);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.Object[] objArray31 = languageRangeList29.toArray();
        int int33 = languageRangeList29.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray34 = new java.util.RandomAccess[] { languageRangeList15, localeList25, languageRangeList29 };
        java.util.RandomAccess[] randomAccessArray35 = languageRangeList11.toArray(randomAccessArray34);
        java.io.PrintWriter printWriter36 = printWriter1.printf("21 Feb 2022 09:14:03 GMT", (java.lang.Object[]) randomAccessArray35);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " a:");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " a:");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , a, :]");
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(localeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray34);
        org.junit.Assert.assertNotNull(randomAccessArray35);
        org.junit.Assert.assertNotNull(printWriter36);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.util.function.Predicate<java.lang.Enum<java.time.Month>> monthEnumPredicate1 = java.util.function.Predicate.isEqual((java.lang.Object) 152000000);
        java.time.Month month2 = java.time.Month.SEPTEMBER;
        boolean boolean3 = monthEnumPredicate1.test((java.lang.Enum<java.time.Month>) month2);
        org.junit.Assert.assertNotNull(monthEnumPredicate1);
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.SEPTEMBER + "'", month2.equals(java.time.Month.SEPTEMBER));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.util.Hashtable<byte[], int[]> byteArrayMap5 = new java.util.Hashtable<byte[], int[]>((int) (byte) 100, (float) 9);
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime8 = offsetTime6.withNano(0);
        boolean boolean9 = byteArrayMap5.equals((java.lang.Object) offsetTime8);
        int int10 = byteArrayMap5.size();
        java.util.Collection<int[]> intArrayCollection11 = byteArrayMap5.values();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.DAY_OF_MONTH;
        java.time.Duration duration14 = java.time.Duration.ofDays((long) (byte) 1);
        boolean boolean15 = byteArrayMap5.remove((java.lang.Object) chronoField12, (java.lang.Object) duration14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime17 = offsetTime2.with((java.time.temporal.TemporalField) chronoField12, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfMonth");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArrayCollection11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.DAY_OF_MONTH + "'", chronoField12.equals(java.time.temporal.ChronoField.DAY_OF_MONTH));
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(9);
        java.util.Spliterator.OfInt ofInt2 = intStream1.spliterator();
        long long3 = ofInt2.estimateSize();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(ofInt2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.util.Date date1 = new java.util.Date((long) '0');
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale2.getDisplayCountry(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Canada" + "'", str6, "Canada");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant2 = instant0.minusMillis(21884413132800L);
        java.time.Instant instant4 = instant2.minusMillis((long) 29);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId6 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.LocalTime localTime7 = java.time.LocalTime.now(zoneId6);
        java.time.ZonedDateTime zonedDateTime8 = java.time.ZonedDateTime.ofInstant(instant2, zoneId6);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.ERA;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange10 = instant2.range((java.time.temporal.TemporalField) chronoField9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Era");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField9.equals(java.time.temporal.ChronoField.ERA));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant2 = instant0.minusMillis(21884413132800L);
        java.time.Instant instant4 = instant2.minusMillis((long) 29);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId6 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.LocalTime localTime7 = java.time.LocalTime.now(zoneId6);
        java.time.ZonedDateTime zonedDateTime8 = java.time.ZonedDateTime.ofInstant(instant2, zoneId6);
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.plusMinutes(10L);
        int int11 = zonedDateTime8.getDayOfYear();
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId13 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime12);
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime8.with((java.time.temporal.TemporalAdjuster) offsetTime12);
        java.time.Instant instant15 = java.time.Instant.now();
        java.time.Instant instant17 = instant15.minusMillis(21884413132800L);
        java.time.Instant instant19 = instant17.minusMillis((long) 29);
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId21 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime20);
        java.time.LocalTime localTime22 = java.time.LocalTime.now(zoneId21);
        java.time.ZonedDateTime zonedDateTime23 = java.time.ZonedDateTime.ofInstant(instant17, zoneId21);
        java.time.ZonedDateTime zonedDateTime24 = zonedDateTime8.withZoneSameLocal(zoneId21);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 240 + "'", int11 == 240);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertNotNull(zonedDateTime24);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.time.format.ResolverStyle resolverStyle0 = java.time.format.ResolverStyle.LENIENT;
        org.junit.Assert.assertTrue("'" + resolverStyle0 + "' != '" + java.time.format.ResolverStyle.LENIENT + "'", resolverStyle0.equals(java.time.format.ResolverStyle.LENIENT));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.ZoneId zoneId1 = dateTimeFormatter0.getZone();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(zoneId1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.util.Hashtable<byte[], int[]> byteArrayMap2 = new java.util.Hashtable<byte[], int[]>((int) (byte) 100, (float) 9);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        boolean boolean8 = byteArrayMap2.containsKey((java.lang.Object) (byte) -1);
        java.io.File file11 = null;
        java.io.File file12 = java.io.File.createTempFile("hi!", "hi!", file11);
        boolean boolean13 = file12.createNewFile();
        boolean boolean14 = byteArrayMap2.containsValue((java.lang.Object) boolean13);
        java.util.Hashtable<byte[], int[]> byteArrayMap17 = new java.util.Hashtable<byte[], int[]>((int) (byte) 100, (float) 9);
        byteArrayMap2.putAll((java.util.Map<byte[], int[]>) byteArrayMap17);
        boolean boolean19 = byteArrayMap2.isEmpty();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertEquals(file12.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file12.toString(), "/tmp/hi!3482250161804277036hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of((long) 22);
        java.util.stream.Stream<java.lang.Long> longStream2 = longStream1.boxed();
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]", "PRIVATE", "France", "", "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]", "+18:00", "/tmp/hi!3847920127589186503hi!", "/tmp/hi!7428662059353686806hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.Object[] objArray14 = languageRangeList12.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.Object[] objArray18 = languageRangeList16.toArray();
        int int20 = languageRangeList16.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale24 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList26);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.Object[] objArray32 = languageRangeList30.toArray();
        int int34 = languageRangeList30.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray35 = new java.util.RandomAccess[] { languageRangeList16, localeList26, languageRangeList30 };
        java.util.RandomAccess[] randomAccessArray36 = languageRangeList12.toArray(randomAccessArray35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.Object[] objArray40 = languageRangeList38.toArray();
        int int42 = languageRangeList38.indexOf((java.lang.Object) 1.0d);
        boolean boolean43 = languageRangeList12.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        boolean boolean44 = strSet9.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        boolean boolean48 = strSet9.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray35);
        org.junit.Assert.assertNotNull(randomAccessArray36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate4 = localDate2.plusWeeks((long) (byte) -1);
        int int5 = localDate2.lengthOfYear();
        java.time.chrono.IsoChronology isoChronology6 = localDate2.getChronology();
        java.lang.String str7 = isoChronology6.getCalendarType();
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.time.temporal.ValueRange valueRange9 = isoChronology6.range(chronoField8);
        java.time.chrono.IsoEra isoEra10 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime13 = offsetTime11.withNano(0);
        java.time.OffsetTime offsetTime14 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId15 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime14);
        java.time.Clock clock16 = java.time.Clock.system(zoneId15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.now(clock16);
        java.time.OffsetDateTime offsetDateTime18 = java.time.OffsetDateTime.now(clock16);
        java.time.Month month19 = offsetDateTime18.getMonth();
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange21 = offsetDateTime18.range((java.time.temporal.TemporalField) chronoField20);
        boolean boolean22 = offsetTime13.isSupported((java.time.temporal.TemporalField) chronoField20);
        long long23 = isoEra10.getLong((java.time.temporal.TemporalField) chronoField20);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.ERA;
        boolean boolean25 = isoEra10.isSupported((java.time.temporal.TemporalField) chronoField24);
        java.time.temporal.ValueRange valueRange26 = isoChronology6.range(chronoField24);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "iso8601" + "'", str7, "iso8601");
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField8.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertTrue("'" + isoEra10 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra10.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(clock16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertTrue("'" + month19 + "' != '" + java.time.Month.FEBRUARY + "'", month19.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField20.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField24.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(valueRange26);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        java.time.Month month5 = offsetDateTime4.getMonth();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.YEAR_OF_ERA;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = month5.getLong((java.time.temporal.TemporalField) chronoField6);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: YearOfEra");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.YEAR_OF_ERA + "'", chronoField6.equals(java.time.temporal.ChronoField.YEAR_OF_ERA));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.util.LongSummaryStatistics longSummaryStatistics0 = new java.util.LongSummaryStatistics();
        java.util.LongSummaryStatistics longSummaryStatistics1 = new java.util.LongSummaryStatistics();
        java.util.function.IntConsumer intConsumer2 = longSummaryStatistics0.andThen((java.util.function.IntConsumer) longSummaryStatistics1);
        long long3 = longSummaryStatistics0.getCount();
        org.junit.Assert.assertEquals(longSummaryStatistics0.toString(), "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}");
        org.junit.Assert.assertEquals(longSummaryStatistics1.toString(), "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}");
        org.junit.Assert.assertNotNull(intConsumer2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.Clock clock2 = java.time.Clock.system(zoneId1);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now(clock2);
        java.time.Duration duration6 = java.time.Duration.ofMillis(0L);
        java.time.Duration duration8 = duration6.plusNanos((long) (byte) -1);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime11 = offsetTime9.withNano(0);
        java.time.temporal.Temporal temporal12 = duration6.subtractFrom((java.time.temporal.Temporal) offsetTime9);
        java.time.Clock clock13 = java.time.Clock.offset(clock2, duration6);
        java.time.OffsetTime offsetTime14 = java.time.OffsetTime.now(clock2);
        java.time.OffsetTime offsetTime16 = offsetTime14.minusHours((long) 9);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(temporal12);
        org.junit.Assert.assertNotNull(clock13);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(offsetTime16);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.nio.DoubleBuffer doubleBuffer1 = java.nio.DoubleBuffer.allocate(16384);
        org.junit.Assert.assertNotNull(doubleBuffer1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(9);
        boolean boolean2 = intStream1.isParallel();
        java.util.stream.IntStream intStream3 = intStream1.unordered();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = localDate0.plusWeeks((long) 256);
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = localDate3.plusWeeks((long) 256);
        java.time.LocalDate localDate7 = localDate5.plusWeeks((long) (byte) -1);
        java.time.Period period8 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate7);
        java.lang.String str9 = localDate7.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-999999995-11-21" + "'", str9, "-999999995-11-21");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.time.Duration duration1 = java.time.Duration.ofMillis(0L);
        java.time.Duration duration3 = duration1.plusNanos((long) (byte) -1);
        java.time.Duration duration5 = duration1.dividedBy((long) 1024);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]", "-999999995-11-21", (int) (short) 100);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.util.Locale locale3 = dateTimeFormatter2.getLocale();
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime6 = offsetTime4.withNano(0);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId8 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime7);
        java.time.Clock clock9 = java.time.Clock.system(zoneId8);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.now(clock9);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now(clock9);
        java.time.Month month12 = offsetDateTime11.getMonth();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange14 = offsetDateTime11.range((java.time.temporal.TemporalField) chronoField13);
        boolean boolean15 = offsetTime6.isSupported((java.time.temporal.TemporalField) chronoField13);
        java.time.chrono.IsoEra isoEra16 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime19 = offsetTime17.withNano(0);
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId21 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime20);
        java.time.Clock clock22 = java.time.Clock.system(zoneId21);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.now(clock22);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now(clock22);
        java.time.Month month25 = offsetDateTime24.getMonth();
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange27 = offsetDateTime24.range((java.time.temporal.TemporalField) chronoField26);
        boolean boolean28 = offsetTime19.isSupported((java.time.temporal.TemporalField) chronoField26);
        long long29 = isoEra16.getLong((java.time.temporal.TemporalField) chronoField26);
        java.time.chrono.IsoEra isoEra30 = java.time.chrono.IsoEra.BCE;
        java.time.OffsetTime offsetTime31 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime33 = offsetTime31.withNano(0);
        java.time.OffsetTime offsetTime34 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId35 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime34);
        java.time.Clock clock36 = java.time.Clock.system(zoneId35);
        java.time.OffsetTime offsetTime37 = java.time.OffsetTime.now(clock36);
        java.time.OffsetDateTime offsetDateTime38 = java.time.OffsetDateTime.now(clock36);
        java.time.Month month39 = offsetDateTime38.getMonth();
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange41 = offsetDateTime38.range((java.time.temporal.TemporalField) chronoField40);
        boolean boolean42 = offsetTime33.isSupported((java.time.temporal.TemporalField) chronoField40);
        long long43 = isoEra30.getLong((java.time.temporal.TemporalField) chronoField40);
        java.time.temporal.TemporalField[] temporalFieldArray44 = new java.time.temporal.TemporalField[] { chronoField13, chronoField26, chronoField40 };
        java.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter2.withResolverFields(temporalFieldArray44);
        java.lang.String str46 = localDateTime1.format(dateTimeFormatter45);
        int int47 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.chrono.Chronology chronology48 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.OffsetTime offsetTime49 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId50 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime49);
        java.time.Clock clock51 = java.time.Clock.system(zoneId50);
        java.time.OffsetTime offsetTime52 = java.time.OffsetTime.now(clock51);
        java.time.OffsetDateTime offsetDateTime53 = java.time.OffsetDateTime.now(clock51);
        java.time.Duration duration55 = java.time.Duration.ofMillis(0L);
        java.time.Duration duration57 = duration55.plusNanos((long) (byte) -1);
        java.time.OffsetTime offsetTime58 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime60 = offsetTime58.withNano(0);
        java.time.temporal.Temporal temporal61 = duration55.subtractFrom((java.time.temporal.Temporal) offsetTime58);
        java.time.Clock clock62 = java.time.Clock.offset(clock51, duration55);
        java.time.OffsetTime offsetTime63 = java.time.OffsetTime.now(clock51);
        java.time.chrono.ChronoLocalDate chronoLocalDate64 = chronology48.dateNow(clock51);
        java.time.OffsetDateTime offsetDateTime65 = java.time.OffsetDateTime.now(clock51);
        java.time.LocalDate localDate66 = java.time.LocalDate.now(clock51);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + month12 + "' != '" + java.time.Month.FEBRUARY + "'", month12.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField13.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + isoEra16 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra16.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertTrue("'" + month25 + "' != '" + java.time.Month.FEBRUARY + "'", month25.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField26.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + isoEra30 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra30.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(offsetTime34);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertNotNull(clock36);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertTrue("'" + month39 + "' != '" + java.time.Month.FEBRUARY + "'", month39.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField40.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-999999999-W01-1" + "'", str46, "-999999999-W01-1");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(offsetTime49);
        org.junit.Assert.assertNotNull(zoneId50);
        org.junit.Assert.assertNotNull(clock51);
        org.junit.Assert.assertNotNull(offsetTime52);
        org.junit.Assert.assertNotNull(offsetDateTime53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(offsetTime58);
        org.junit.Assert.assertNotNull(offsetTime60);
        org.junit.Assert.assertNotNull(temporal61);
        org.junit.Assert.assertNotNull(clock62);
        org.junit.Assert.assertNotNull(offsetTime63);
        org.junit.Assert.assertNotNull(chronoLocalDate64);
        org.junit.Assert.assertNotNull(offsetDateTime65);
        org.junit.Assert.assertNotNull(localDate66);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(outputStream0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant2 = instant0.minusMillis(21884413132800L);
        java.time.Instant instant4 = instant2.minusMillis((long) 29);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId6 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.LocalTime localTime7 = java.time.LocalTime.now(zoneId6);
        java.time.ZonedDateTime zonedDateTime8 = java.time.ZonedDateTime.ofInstant(instant2, zoneId6);
        java.lang.String str9 = zoneId6.getId();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+18:00" + "'", str9, "+18:00");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano(0);
        java.time.LocalTime localTime3 = offsetTime0.toLocalTime();
        java.time.LocalTime localTime4 = offsetTime0.toLocalTime();
        java.time.LocalTime localTime5 = java.time.LocalTime.MAX;
        int int6 = localTime4.compareTo(localTime5);
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate9 = localDate7.plusWeeks((long) 256);
        java.time.LocalDate localDate11 = localDate9.plusWeeks((long) (byte) -1);
        int int12 = localDate9.lengthOfYear();
        java.time.chrono.IsoChronology isoChronology13 = localDate9.getChronology();
        java.lang.String str14 = isoChronology13.getCalendarType();
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.time.temporal.ValueRange valueRange16 = isoChronology13.range(chronoField15);
        boolean boolean17 = localTime4.isSupported((java.time.temporal.TemporalField) chronoField15);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 365 + "'", int12 == 365);
        org.junit.Assert.assertNotNull(isoChronology13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "iso8601" + "'", str14, "iso8601");
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField15.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(valueRange16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId2 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime1);
        java.time.Clock clock3 = java.time.Clock.system(zoneId2);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.now(clock3);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now(clock3);
        java.time.Month month6 = offsetDateTime5.getMonth();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.ERA;
        java.time.temporal.ValueRange valueRange8 = offsetDateTime5.range((java.time.temporal.TemporalField) chronoField7);
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField7.getRangeUnit();
        java.time.LocalTime localTime10 = java.time.LocalTime.MAX;
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime13 = offsetTime11.withNano(0);
        java.time.LocalTime localTime14 = offsetTime11.toLocalTime();
        java.time.LocalTime localTime15 = offsetTime11.toLocalTime();
        java.time.LocalTime localTime16 = localTime10.with((java.time.temporal.TemporalAdjuster) localTime15);
        boolean boolean17 = temporalUnit9.isSupportedBy((java.time.temporal.Temporal) localTime10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration18 = java.time.Duration.of((-1L), temporalUnit9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit must not have an estimated duration");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.FEBRUARY + "'", month6.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField7.equals(java.time.temporal.ChronoField.ERA));
        org.junit.Assert.assertNotNull(valueRange8);
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.time.Duration duration2 = java.time.Duration.ofSeconds((long) 1024, (long) (short) 0);
        java.time.Duration duration4 = java.time.Duration.ofDays((long) (byte) 1);
        java.time.Duration duration6 = duration4.plusSeconds(5L);
        java.time.Duration duration7 = duration2.plus(duration4);
        java.time.Duration duration9 = duration4.multipliedBy(5L);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate4 = localDate2.plusWeeks((long) 256);
        java.time.LocalDate localDate6 = localDate4.plusWeeks((long) (byte) -1);
        int int7 = localDate4.lengthOfYear();
        java.time.chrono.IsoChronology isoChronology8 = localDate4.getChronology();
        java.lang.String str9 = isoChronology8.getCalendarType();
        java.time.Instant instant10 = java.time.Instant.now();
        java.time.LocalDate localDate11 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate13 = localDate11.plusWeeks((long) 256);
        java.time.LocalDate localDate15 = localDate13.plusWeeks((long) (byte) -1);
        java.time.DayOfWeek dayOfWeek16 = localDate13.getDayOfWeek();
        boolean boolean17 = localDate13.isLeapYear();
        int int18 = localDate13.getMonthValue();
        boolean boolean19 = instant10.equals((java.lang.Object) localDate13);
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MIN;
        java.time.ZoneId zoneId21 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetTime20);
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime22 = isoChronology8.zonedDateTime(instant10, zoneId21);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter0.withChronology((java.time.chrono.Chronology) isoChronology8);
        java.util.Locale locale24 = dateTimeFormatter0.getLocale();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(isoChronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "iso8601" + "'", str9, "iso8601");
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + dayOfWeek16 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek16.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]", "PRIVATE", "France", "", "java.nio.HeapIntBuffer[pos=0 lim=9 cap=9]", "+18:00", "/tmp/hi!3847920127589186503hi!", "/tmp/hi!7428662059353686806hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.Object[] objArray14 = languageRangeList12.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.Object[] objArray18 = languageRangeList16.toArray();
        int int20 = languageRangeList16.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale24 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList26);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.Object[] objArray32 = languageRangeList30.toArray();
        int int34 = languageRangeList30.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray35 = new java.util.RandomAccess[] { languageRangeList16, localeList26, languageRangeList30 };
        java.util.RandomAccess[] randomAccessArray36 = languageRangeList12.toArray(randomAccessArray35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.Object[] objArray40 = languageRangeList38.toArray();
        int int42 = languageRangeList38.indexOf((java.lang.Object) 1.0d);
        boolean boolean43 = languageRangeList12.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        boolean boolean44 = strSet9.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        int int45 = languageRangeList38.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = languageRangeList38.subList((int) '0', 256);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 256");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray35);
        org.junit.Assert.assertNotNull(randomAccessArray36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MINUTES;
        java.lang.Thread thread1 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeUnit0.timedJoin(thread1, 21884413132800L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeUnit0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.Object[] objArray3 = languageRangeList1.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.Object[] objArray7 = languageRangeList5.toArray();
        int int9 = languageRangeList5.indexOf((java.lang.Object) 1.0d);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale13 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale locale17 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.Object[] objArray21 = languageRangeList19.toArray();
        int int23 = languageRangeList19.indexOf((java.lang.Object) 1.0d);
        java.util.RandomAccess[] randomAccessArray24 = new java.util.RandomAccess[] { languageRangeList5, localeList15, languageRangeList19 };
        java.util.RandomAccess[] randomAccessArray25 = languageRangeList1.toArray(randomAccessArray24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.Object[] objArray29 = languageRangeList27.toArray();
        int int31 = languageRangeList27.indexOf((java.lang.Object) 1.0d);
        boolean boolean32 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream33 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange languageRange34 = null;
        boolean boolean35 = languageRangeList1.add(languageRange34);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange37 = languageRangeList1.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(randomAccessArray24);
        org.junit.Assert.assertNotNull(randomAccessArray25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(languageRangeStream33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MINUTES;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        long long3 = timeUnit0.convert((long) (byte) 1, timeUnit2);
        timeUnit0.sleep((long) 11);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertNotNull(timeUnit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }
}

