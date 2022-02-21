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
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.io.FileNotFoundException fileNotFoundException0 = new java.io.FileNotFoundException();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = java.time.LocalDate.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.temporal.TemporalAccessor temporalAccessor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = isoChronology0.localDateTime(temporalAccessor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.time.ZoneOffset zoneOffset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime5 = java.time.OffsetTime.of((int) (byte) 100, (int) 'a', 0, (int) (short) 0, zoneOffset4);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str1 = java.net.URLConnection.guessContentTypeFromName("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.parse((java.lang.CharSequence) "hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.io.FileNotFoundException fileNotFoundException1 = new java.io.FileNotFoundException("");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.TUESDAY;
        java.time.temporal.TemporalField temporalField1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = dayOfWeek0.range(temporalField1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: field");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.TUESDAY));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.format.TextStyle textStyle1 = null;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = isoChronology0.getDisplayName(textStyle1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: textStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.net.SocketException socketException1 = new java.net.SocketException("hi!");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.time.Duration duration0 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal1 = null;
        java.time.temporal.Temporal temporal2 = duration0.subtractFrom(temporal1);
        long long3 = duration0.toDays();
        boolean boolean4 = duration0.isNegative();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNull(temporal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.parse((java.lang.CharSequence) charBuffer1, dateTimeFormatter2);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '????????????????' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.from((java.time.temporal.TemporalAccessor) zoneOffset0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: +18:00 of type java.time.ZoneOffset");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.LITTLE_ENDIAN;
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Era era2 = isoChronology0.eraOf((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid era: 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 1, (int) (short) 0, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        double[] doubleArray6 = new double[] { (-1.0d), 1.0f, 'x', 'x', 1.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer9 = java.nio.DoubleBuffer.wrap(doubleArray6, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 1.0, 120.0, 120.0, 1.0, 0.0]");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj2 = charBuffer1.array();
        boolean boolean3 = charBuffer1.isReadOnly();
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime5 = java.time.OffsetTime.parse((java.lang.CharSequence) charBuffer1, dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '????????????????' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        intStream3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.IntSummaryStatistics intSummaryStatistics5 = intStream3.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = java.time.Instant.parse((java.lang.CharSequence) "Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Etc/UTC' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.net.URL uRL0 = null;
        java.net.URLStreamHandler uRLStreamHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL(uRL0, "italiano", uRLStreamHandler2);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: italiano");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.time.ZoneId zoneId7 = java.time.ZoneId.systemDefault();
        java.lang.String str8 = zoneId7.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.of(100, 0, 16, 16, 0, (int) '4', (int) (short) 10, zoneId7);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Etc/UTC" + "'", str8, "Etc/UTC");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        intStream3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = intStream3.limit((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.WRITE;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.WRITE + "'", accessMode0.equals(java.nio.file.AccessMode.WRITE));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleStream1.forEach(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        intStream3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfInt ofInt5 = intStream3.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Stati Uniti" + "'", str2, "Stati Uniti");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "it");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.of("italiano", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: aliasMap");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.security.cert.CertificateException certificateException0 = new java.security.cert.CertificateException();
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        // The following exception was thrown during execution in test generation
        try {
            strMap0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        long long0 = java.security.PublicKey.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 7187392471159151072L + "'", long0 == 7187392471159151072L);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.sorted();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = doubleStream1.distinct();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray0 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList1 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList1, zoneOffsetTransitionArray0);
        java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream3 = zoneOffsetTransitionList1.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream5 = zoneOffsetTransitionStream3.limit((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionStream3);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.OffsetTime offsetTime13 = localTime0.atOffset(zoneOffset1);
        java.time.temporal.TemporalUnit temporalUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal16 = localTime0.minus((long) 0, temporalUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(offsetTime13);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.time.Month month0 = java.time.Month.JANUARY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) month0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalTime from TemporalAccessor: JANUARY of type java.time.Month");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JANUARY + "'", month0.equals(java.time.Month.JANUARY));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.put((int) '4', (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray0 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList1 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList1, zoneOffsetTransitionArray0);
        java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream3 = zoneOffsetTransitionList1.stream();
        java.util.function.BinaryOperator<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionBinaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionOptional5 = zoneOffsetTransitionStream3.reduce(zoneOffsetTransitionBinaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionStream3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.sorted();
        java.util.function.DoublePredicate doublePredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = doubleStream1.allMatch(doublePredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = java.time.Instant.parse((java.lang.CharSequence) "+18:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '+18:00' could not be parsed at index 1");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap3 = java.nio.charset.Charset.availableCharsets();
        boolean boolean4 = strMap3.isEmpty();
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.Cloneable cloneable8 = strMapMap0.put(strMap3, (java.lang.Cloneable) locale6);
        // The following exception was thrown during execution in test generation
        try {
            strMap3.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stati Uniti" + "'", str7, "Stati Uniti");
        org.junit.Assert.assertNull(cloneable8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap3 = java.nio.charset.Charset.availableCharsets();
        boolean boolean4 = strMap3.isEmpty();
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.Cloneable cloneable8 = strMapMap0.put(strMap3, (java.lang.Cloneable) locale6);
        java.nio.charset.Charset charset10 = null;
        java.nio.charset.Charset charset11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = strMap3.replace("italiano", charset10, charset11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stati Uniti" + "'", str7, "Stati Uniti");
        org.junit.Assert.assertNull(cloneable8);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.BCE;
        java.time.format.TextStyle textStyle1 = null;
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap2 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology3 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean4 = strMapMap2.containsKey((java.lang.Object) isoChronology3);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap5 = java.nio.charset.Charset.availableCharsets();
        boolean boolean6 = strMap5.isEmpty();
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.Cloneable cloneable10 = strMapMap2.put(strMap5, (java.lang.Cloneable) locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = isoEra0.getDisplayName(textStyle1, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: textStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra0.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(isoChronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Stati Uniti" + "'", str9, "Stati Uniti");
        org.junit.Assert.assertNull(cloneable10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        intStream3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = intStream3.sorted();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.EXECUTE;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.EXECUTE + "'", accessMode0.equals(java.nio.file.AccessMode.EXECUTE));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.OptionalDouble optionalDouble2 = doubleStream1.findAny();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = doubleStream1.peek(doubleConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.function.LongPredicate longPredicate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream2 = longStream0.filter(longPredicate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.TUESDAY;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = dayOfWeek0.get((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.nio.CharBuffer charBuffer4 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj5 = charBuffer4.array();
        boolean boolean6 = charBuffer4.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.formatTo((java.time.temporal.TemporalAccessor) isoEra2, (java.lang.Appendable) charBuffer4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.net.URI uRI4 = new java.net.URI("italiano", "Etc/UTC", "", "Etc/UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = new java.io.File(uRI4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URI scheme is not \"file\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=etc/utc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.time.format.DecimalStyle decimalStyle0 = java.time.format.DecimalStyle.STANDARD;
        char char1 = decimalStyle0.getDecimalSeparator();
        org.junit.Assert.assertNotNull(decimalStyle0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '.' + "'", char1 == '.');
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("1970-01-01T18:01:37.00000012", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) (short) 1, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = longStream2.limit((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.OptionalDouble optionalDouble2 = doubleStream1.findAny();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble2.ifPresent(doubleConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.time.Month month0 = java.time.Month.JANUARY;
        java.time.Month month1 = month0.firstMonthOfQuarter();
        java.time.LocalTime localTime2 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray8 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList9, zoneOffsetTransitionArray8);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray11 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList12 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList12, zoneOffsetTransitionRuleArray11);
        java.time.zone.ZoneRules zoneRules14 = java.time.zone.ZoneRules.of(zoneOffset3, zoneOffset4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList9, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList12);
        java.time.OffsetTime offsetTime15 = localTime2.atOffset(zoneOffset3);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange17 = offsetTime15.range((java.time.temporal.TemporalField) chronoField16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange18 = month1.range((java.time.temporal.TemporalField) chronoField16);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JANUARY + "'", month0.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.JANUARY + "'", month1.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zoneRules14);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField16.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange17);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.nio.CharBuffer charBuffer3 = charBuffer1.append((java.lang.CharSequence) "Etc/UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Etc/UTC", 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(charBuffer3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.net.Proxy proxy0 = java.net.Proxy.NO_PROXY;
        java.net.Proxy.Type type1 = proxy0.type();
        java.net.SocketAddress socketAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Proxy proxy3 = new java.net.Proxy(type1, socketAddress2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type DIRECT is not compatible with address null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(proxy0);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + java.net.Proxy.Type.DIRECT + "'", type1.equals(java.net.Proxy.Type.DIRECT));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.nio.channels.AsynchronousCloseException asynchronousCloseException0 = new java.nio.channels.AsynchronousCloseException();
        java.lang.String str1 = asynchronousCloseException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.nio.channels.AsynchronousCloseException" + "'", str1, "java.nio.channels.AsynchronousCloseException");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.LocalTime localTime2 = localTime0.plusMinutes((long) 'x');
        java.time.chrono.IsoChronology isoChronology3 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra5 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate8 = isoChronology3.dateYearDay((java.time.chrono.Era) isoEra5, 0, 16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal9 = localTime0.adjustInto((java.time.temporal.Temporal) localDate8);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(isoChronology3);
        org.junit.Assert.assertTrue("'" + isoEra5 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra5.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.MAX;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate7 = isoChronology0.date((java.time.temporal.TemporalAccessor) zoneOffset6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDate from TemporalAccessor: +18:00 of type java.time.ZoneOffset");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(zoneOffset6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = new java.net.URL("{}");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: {}");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("{}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Hashtable<java.util.Spliterator<java.lang.Long>, java.nio.ByteBuffer> longSpliteratorMap0 = new java.util.Hashtable<java.util.Spliterator<java.lang.Long>, java.nio.ByteBuffer>();
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        java.util.stream.DoubleStream doubleStream4 = intStream3.asDoubleStream();
        java.util.function.DoublePredicate doublePredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = doubleStream4.filter(doublePredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.time.Duration duration0 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal1 = null;
        java.time.temporal.Temporal temporal2 = duration0.subtractFrom(temporal1);
        long long3 = duration0.toDays();
        java.time.temporal.TemporalUnit temporalUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = duration0.get(temporalUnit4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: null");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNull(temporal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.time.Clock clock0 = null;
        java.time.Duration duration1 = java.time.Duration.ZERO;
        java.time.Duration duration2 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal3 = null;
        java.time.temporal.Temporal temporal4 = duration2.subtractFrom(temporal3);
        long long5 = duration2.toDays();
        java.time.Duration duration6 = duration1.plus(duration2);
        long long7 = duration2.toDays();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock8 = java.time.Clock.tick(clock0, duration2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseClock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNull(temporal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.TUESDAY;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = dayOfWeek0.range((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime6 = java.time.chrono.ChronoLocalDateTime.from((java.time.temporal.TemporalAccessor) localDate5);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: 0001-01-16 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        int int6 = byteBuffer5.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            short short7 = byteBuffer5.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = byteBuffer5.getInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", "java.nio.channels.AsynchronousCloseException", (int) '.', "DIRECT");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ???????????????");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.TUESDAY;
        int int1 = dayOfWeek0.getValue();
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.time.format.DecimalStyle decimalStyle1 = java.time.format.DecimalStyle.ofDefaultLocale();
        java.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDecimalStyle(decimalStyle1);
        java.lang.String str3 = decimalStyle1.toString();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DecimalStyle[0+-.]" + "'", str3, "DecimalStyle[0+-.]");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap1 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology2 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean3 = strMapMap1.containsKey((java.lang.Object) isoChronology2);
        java.time.Duration duration4 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal5 = null;
        java.time.temporal.Temporal temporal6 = duration4.subtractFrom(temporal5);
        long long7 = duration4.toDays();
        boolean boolean8 = strMapMap1.contains((java.lang.Object) duration4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.BASIC_ISO_DATE;
        java.lang.Cloneable cloneable10 = strMapMap1.get((java.lang.Object) dateTimeFormatter9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime11 = java.time.LocalTime.parse((java.lang.CharSequence) "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", dateTimeFormatter9);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '???????????????' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNull(temporal6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(cloneable10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        int[] intArray4 = intStream3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer7 = java.nio.IntBuffer.wrap(intArray4, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.LocalTime localTime6 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime7 = localDate5.atTime(localTime6);
        java.time.LocalDate localDate9 = localDate5.withMonth(1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime10 = java.time.OffsetTime.from((java.time.temporal.TemporalAccessor) localDate5);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetTime from TemporalAccessor: 0001-01-16 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.Instant instant1 = null;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray8 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList9, zoneOffsetTransitionArray8);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray11 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList12 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList12, zoneOffsetTransitionRuleArray11);
        java.time.zone.ZoneRules zoneRules14 = java.time.zone.ZoneRules.of(zoneOffset3, zoneOffset4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList9, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList12);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray17 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList18 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList18, zoneOffsetTransitionArray17);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray20 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, zoneOffsetTransitionArray20);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray23 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList24 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList24, zoneOffsetTransitionRuleArray23);
        java.time.zone.ZoneRules zoneRules26 = java.time.zone.ZoneRules.of(zoneOffset15, zoneOffset16, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList18, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList24);
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray29 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList30 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, zoneOffsetTransitionArray29);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray32 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, zoneOffsetTransitionArray32);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray35 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList36 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList36, zoneOffsetTransitionRuleArray35);
        java.time.zone.ZoneRules zoneRules38 = java.time.zone.ZoneRules.of(zoneOffset27, zoneOffset28, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList36);
        boolean boolean39 = zoneOffsetTransitionList18.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33);
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray42 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList43 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList43, zoneOffsetTransitionArray42);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray45 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList46 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList46, zoneOffsetTransitionArray45);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray48 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList49 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList49, zoneOffsetTransitionRuleArray48);
        java.time.zone.ZoneRules zoneRules51 = java.time.zone.ZoneRules.of(zoneOffset40, zoneOffset41, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList43, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList46, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList49);
        int int53 = zoneOffsetTransitionList46.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset54 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray56 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList57 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList57, zoneOffsetTransitionArray56);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray59 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList60 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList60, zoneOffsetTransitionArray59);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray62 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList63 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList63, zoneOffsetTransitionRuleArray62);
        java.time.zone.ZoneRules zoneRules65 = java.time.zone.ZoneRules.of(zoneOffset54, zoneOffset55, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList57, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList60, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList63);
        java.time.zone.ZoneRules zoneRules66 = java.time.zone.ZoneRules.of(zoneOffset2, zoneOffset3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList46, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList63);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime67 = isoChronology0.zonedDateTime(instant1, (java.time.ZoneId) zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: instant");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zoneRules14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneRules26);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneRules38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(zoneRules51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset54);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(zoneRules65);
        org.junit.Assert.assertNotNull(zoneRules66);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.time.Instant instant0 = null;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.lang.String str2 = zoneId1.getId();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime4 = java.time.ZonedDateTime.ofInstant(instant0, zoneId1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: instant");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Etc/UTC" + "'", str2, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime3);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.String str0 = java.io.File.pathSeparator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.nio.CharBuffer charBuffer3 = charBuffer1.append((java.lang.CharSequence) "Etc/UTC");
        int int4 = charBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            char char6 = charBuffer1.charAt((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.lang.String str1 = zoneId0.getId();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId0);
        java.time.ZonedDateTime zonedDateTime4 = zonedDateTime2.withYear((int) (short) 1);
        java.time.LocalTime localTime5 = zonedDateTime4.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime7 = localTime5.withNano((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for NanoOfSecond (valid values 0 - 999999999): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        int int6 = byteBuffer5.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.put((byte) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.OptionalDouble optionalDouble2 = doubleStream1.findAny();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        double double4 = optionalDouble2.orElseGet(doubleSupplier3);
        double double5 = optionalDouble2.getAsDouble();
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        java.util.stream.DoubleStream doubleStream4 = intStream3.asDoubleStream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt5 = intStream3.min();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.ofLocale(locale0);
        java.lang.String str2 = chronology1.getId();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISO" + "'", str2, "ISO");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.sorted();
        java.util.function.DoublePredicate doublePredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = doubleStream2.filter(doublePredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.OptionalDouble optionalDouble1 = longStream0.average();
        java.util.function.LongToIntFunction longToIntFunction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = longStream0.mapToInt(longToIntFunction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.malformedForLength((int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Non-positive length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer6 = byteBuffer5.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.net.URLConnection.setDefaultRequestProperty(":", "java.nio.channels.AsynchronousCloseException");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("//Etc/UTC", "/UTC", "Stati Uniti");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: //etc/utc");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = new java.net.URI("en-GB", "", "");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Expected scheme-specific part at index 6: en-GB:#");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.io.IOException iOException1 = new java.io.IOException("en-GB");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream0, false, "+18:00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.lang.Object obj1 = strMapMap0.clone();
        java.lang.String str2 = strMapMap0.toString();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap3 = null;
        java.util.Date date5 = new java.util.Date((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable6 = strMapMap0.put(strMap3, (java.lang.Cloneable) date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.stream.IntStream intStream0 = java.util.stream.IntStream.empty();
        java.util.function.IntToDoubleFunction intToDoubleFunction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream2 = intStream0.mapToDouble(intToDoubleFunction1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.OffsetTime offsetTime13 = localTime0.atOffset(zoneOffset1);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange15 = offsetTime13.range((java.time.temporal.TemporalField) chronoField14);
        java.time.Duration duration16 = java.time.Duration.ZERO;
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal18 = null;
        java.time.temporal.Temporal temporal19 = duration17.subtractFrom(temporal18);
        long long20 = duration17.toDays();
        java.time.Duration duration21 = duration16.minus(duration17);
        java.time.OffsetTime offsetTime22 = offsetTime13.minus((java.time.temporal.TemporalAmount) duration17);
        java.time.LocalTime localTime23 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray26 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList27, zoneOffsetTransitionArray26);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray29 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList30 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, zoneOffsetTransitionArray29);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray32 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList33, zoneOffsetTransitionRuleArray32);
        java.time.zone.ZoneRules zoneRules35 = java.time.zone.ZoneRules.of(zoneOffset24, zoneOffset25, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList27, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList33);
        java.time.OffsetTime offsetTime36 = localTime23.atOffset(zoneOffset24);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange38 = offsetTime36.range((java.time.temporal.TemporalField) chronoField37);
        java.time.Duration duration39 = java.time.Duration.ZERO;
        java.time.Duration duration40 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal41 = null;
        java.time.temporal.Temporal temporal42 = duration40.subtractFrom(temporal41);
        long long43 = duration40.toDays();
        java.time.Duration duration44 = duration39.minus(duration40);
        java.time.OffsetTime offsetTime45 = offsetTime36.minus((java.time.temporal.TemporalAmount) duration40);
        boolean boolean46 = offsetTime22.isAfter(offsetTime36);
        java.time.ZoneOffset zoneOffset49 = java.time.ZoneOffset.MAX;
        java.lang.String str50 = zoneOffset49.getId();
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset49);
        java.time.temporal.ChronoField chronoField52 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        boolean boolean53 = localDateTime51.isSupported((java.time.temporal.TemporalField) chronoField52);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange54 = offsetTime36.range((java.time.temporal.TemporalField) chronoField52);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(temporal19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneRules35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField37.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNull(temporal42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(offsetTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zoneOffset49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+18:00" + "'", str50, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + chronoField52 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField52.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        boolean boolean10 = localDateTime4.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.format.DateTimeFormatter dateTimeFormatter11 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.lang.String str12 = localDateTime9.format(dateTimeFormatter11);
        java.time.chrono.Chronology chronology13 = dateTimeFormatter11.getChronology();
        java.lang.String str14 = chronology13.toString();
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T18:01:37.00000012" + "'", str12, "1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISO" + "'", str14, "ISO");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = byteBuffer5.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.sorted();
        java.util.function.DoublePredicate doublePredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = doubleStream1.noneMatch(doublePredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer14.putLong((long) '#');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.nio.charset.CharacterCodingException characterCodingException0 = new java.nio.charset.CharacterCodingException();
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.FULL_STANDALONE;
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.FULL_STANDALONE + "'", textStyle0.equals(java.time.format.TextStyle.FULL_STANDALONE));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        boolean boolean1 = strMap0.isEmpty();
        java.util.Set<java.lang.String> strSet2 = strMap0.keySet();
        // The following exception was thrown during execution in test generation
        try {
            strSet2.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.nio.CharBuffer charBuffer3 = charBuffer1.append((java.lang.CharSequence) "Etc/UTC");
        int int4 = charBuffer1.arrayOffset();
        char[] charArray11 = new char[] { 'a', 'a', '\000', ' ', 'x', 'x' };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer14 = charBuffer1.get(charArray11, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "aa\000 xx");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "aa\000 xx");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, a, \000,  , x, x]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.READ;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.READ + "'", accessMode0.equals(java.nio.file.AccessMode.READ));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray0 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList1 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList1, zoneOffsetTransitionArray0);
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray9 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList10, zoneOffsetTransitionArray9);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray12 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList13 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList13, zoneOffsetTransitionRuleArray12);
        java.time.zone.ZoneRules zoneRules15 = java.time.zone.ZoneRules.of(zoneOffset4, zoneOffset5, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList10, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = zoneOffsetTransitionList1.addAll(171, (java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 171, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zoneRules15);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        boolean boolean10 = localDateTime4.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MAX;
        java.lang.String str14 = zoneOffset13.getId();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset13);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.lang.String str19 = zoneOffset18.getId();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset18);
        boolean boolean21 = localDateTime15.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime20);
        java.time.format.DateTimeFormatter dateTimeFormatter22 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.lang.String str23 = localDateTime20.format(dateTimeFormatter22);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        int int25 = localDateTime20.get((java.time.temporal.TemporalField) chronoField24);
        boolean boolean26 = localDateTime9.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime20);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime28 = localDateTime9.withMonth((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+18:00" + "'", str14, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+18:00" + "'", str19, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01T18:01:37.00000012" + "'", str23, "1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField24.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        intStream3.close();
        boolean boolean5 = intStream3.isParallel();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intStream3.sum();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.nio.channels.AsynchronousCloseException asynchronousCloseException0 = new java.nio.channels.AsynchronousCloseException();
        java.util.concurrent.ExecutionException executionException1 = new java.util.concurrent.ExecutionException((java.lang.Throwable) asynchronousCloseException0);
        java.lang.String str2 = asynchronousCloseException0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.nio.channels.AsynchronousCloseException" + "'", str2, "java.nio.channels.AsynchronousCloseException");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI1 = java.net.URI.create("Stati Uniti");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 5: Stati Uniti");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.time.chrono.IsoEra isoEra3 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate6 = isoChronology1.dateYearDay((java.time.chrono.Era) isoEra3, (-1), 10);
        java.time.temporal.Temporal temporal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal8 = isoEra3.adjustInto(temporal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + isoEra3 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra3.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.OptionalDouble optionalDouble2 = doubleStream1.findAny();
        java.util.function.DoublePredicate doublePredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = doubleStream1.anyMatch(doublePredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.Spliterator<java.lang.Long> longSpliterator1 = longStream0.spliterator();
        java.util.stream.LongStream longStream2 = longStream0.sequential();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfLong ofLong3 = longStream0.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longSpliterator1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.io.UnsupportedEncodingException unsupportedEncodingException1 = new java.io.UnsupportedEncodingException();
        java.security.NoSuchAlgorithmException noSuchAlgorithmException2 = new java.security.NoSuchAlgorithmException("/UTC", (java.lang.Throwable) unsupportedEncodingException1);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.time.Instant instant0 = java.time.Instant.MAX;
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra3 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate6 = isoChronology1.dateYearDay((java.time.chrono.Era) isoEra3, 0, 16);
        java.time.LocalTime localTime7 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime8 = localDate6.atTime(localTime7);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray11 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList12 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList12, zoneOffsetTransitionArray11);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray14 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList15 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList15, zoneOffsetTransitionArray14);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray17 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList18 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList18, zoneOffsetTransitionRuleArray17);
        java.time.zone.ZoneRules zoneRules20 = java.time.zone.ZoneRules.of(zoneOffset9, zoneOffset10, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList12, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList15, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList18);
        long long21 = localDateTime8.toEpochSecond(zoneOffset9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime22 = instant0.atOffset(zoneOffset9);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000001");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + isoEra3 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra3.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneRules20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-62134279201L) + "'", long21 == (-62134279201L));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.Date date5 = new java.util.Date(1, (int) 'x', (int) '0', 16, 256);
        java.util.Date date7 = new java.util.Date((long) (byte) 1);
        int int8 = date7.getTimezoneOffset();
        int int9 = date5.compareTo(date7);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Feb 17 20:16:00 UTC 1911");
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.NARROW_STANDALONE + "'", textStyle0.equals(java.time.format.TextStyle.NARROW_STANDALONE));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        int int6 = byteBuffer5.arrayOffset();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        short[] shortArray13 = new short[] { (short) 10, (byte) 10, (short) 100, (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer16 = shortBuffer7.put(shortArray13, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[10, 10, 100, -1, 1]");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException1 = new java.security.NoSuchAlgorithmException("hi!");
        java.net.MalformedURLException malformedURLException3 = new java.net.MalformedURLException("");
        noSuchAlgorithmException1.addSuppressed((java.lang.Throwable) malformedURLException3);
        java.security.SignatureException signatureException5 = new java.security.SignatureException((java.lang.Throwable) malformedURLException3);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream0, true, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange3 = java.time.temporal.ValueRange.of((long) 16, (long) (short) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.temporal.TemporalAdjuster temporalAdjuster5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime6 = localDateTime4.with(temporalAdjuster5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        intStream3.close();
        boolean boolean5 = intStream3.isParallel();
        java.util.function.IntBinaryOperator intBinaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt7 = intStream3.reduce(intBinaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = java.time.ZoneId.SHORT_IDS;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.of("", strMap1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: ");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        boolean boolean16 = byteBuffer5.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            float float17 = byteBuffer5.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.time.Period period1 = java.time.Period.ofYears((int) '\000');
        java.time.chrono.ChronoPeriod chronoPeriod2 = period1.normalized();
        java.time.temporal.TemporalUnit temporalUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = period1.get(temporalUnit3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: null");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(chronoPeriod2);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.TUESDAY;
        java.time.DayOfWeek dayOfWeek2 = dayOfWeek0.minus(0L);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.LocalTime localTime4 = java.time.LocalTime.MAX;
        long long5 = chronoField3.getFrom((java.time.temporal.TemporalAccessor) localTime4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dayOfWeek2.get((java.time.temporal.TemporalField) chronoField3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 23L + "'", long5 == 23L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.LocalTime localTime6 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime7 = localDate5.atTime(localTime6);
        java.time.LocalDate localDate9 = localDate5.withMonth(1);
        java.time.temporal.TemporalUnit temporalUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate12 = localDate9.minus((long) (short) -1, temporalUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.OffsetTime offsetTime13 = localTime0.atOffset(zoneOffset1);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange15 = offsetTime13.range((java.time.temporal.TemporalField) chronoField14);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        boolean boolean17 = offsetTime13.isSupported((java.time.temporal.TemporalField) chronoField16);
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.MAX;
        java.lang.String str21 = zoneOffset20.getId();
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset20);
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.MAX;
        java.lang.String str26 = zoneOffset25.getId();
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset25);
        boolean boolean28 = localDateTime22.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime27);
        java.time.format.DateTimeFormatter dateTimeFormatter29 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.lang.String str30 = localDateTime27.format(dateTimeFormatter29);
        java.time.chrono.Chronology chronology31 = dateTimeFormatter29.getChronology();
        java.time.chrono.ChronoPeriod chronoPeriod35 = chronology31.period((int) (short) 1, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime36 = offsetTime13.minus((java.time.temporal.TemporalAmount) chronoPeriod35);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Years");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField16.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+18:00" + "'", str21, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+18:00" + "'", str26, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01T18:01:37.00000012" + "'", str30, "1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronoPeriod35);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        boolean boolean1 = strMap0.isEmpty();
        java.util.Set<java.lang.String> strSet2 = strMap0.keySet();
        boolean boolean3 = strSet2.isEmpty();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.sorted();
        java.util.stream.DoubleStream.Builder builder3 = java.util.stream.DoubleStream.builder();
        java.util.stream.DoubleStream doubleStream4 = doubleStream2.peek((java.util.function.DoubleConsumer) builder3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = doubleStream2.sorted();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) (short) 1, (long) 10);
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
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        org.junit.Assert.assertNotNull(optionalLong0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter4 = new java.io.PrintWriter(file2, "en-GB");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: en-GB");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(256);
        // The following exception was thrown during execution in test generation
        try {
            float float3 = floatBuffer1.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatBuffer1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray2 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList3 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, zoneOffsetTransitionArray2);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray8 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9, zoneOffsetTransitionRuleArray8);
        java.time.zone.ZoneRules zoneRules11 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9);
        java.lang.String str12 = zoneOffset1.toString();
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.MAX;
        java.lang.String str16 = zoneOffset15.getId();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset15);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        boolean boolean19 = localDateTime17.isSupported((java.time.temporal.TemporalField) chronoField18);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = zoneOffset1.getLong((java.time.temporal.TemporalField) chronoField18);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+18:00" + "'", str12, "+18:00");
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+18:00" + "'", str16, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField18.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.time.Instant instant0 = java.time.Instant.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.Clock clock13 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000001");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(clock13);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = new java.net.URL("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = java.time.LocalDate.parse((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        boolean boolean3 = file2.isDirectory();
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        long[] longArray1 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer2 = java.nio.LongBuffer.wrap(longArray1);
        long[] longArray4 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer5 = java.nio.LongBuffer.wrap(longArray4);
        java.nio.LongBuffer longBuffer6 = longBuffer2.put(longBuffer5);
        java.nio.LongBuffer[] longBufferArray7 = new java.nio.LongBuffer[] { longBuffer5 };
        java.util.stream.Stream<java.nio.LongBuffer> longBufferStream8 = java.util.stream.Stream.of(longBufferArray7);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[10]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(longBuffer6);
        org.junit.Assert.assertNotNull(longBufferArray7);
        org.junit.Assert.assertNotNull(longBufferStream8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.Spliterator<java.lang.Long> longSpliterator1 = longStream0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = longStream0.count();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longSpliterator1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap3 = java.nio.charset.Charset.availableCharsets();
        boolean boolean4 = strMap3.isEmpty();
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.Cloneable cloneable8 = strMapMap0.put(strMap3, (java.lang.Cloneable) locale6);
        int int9 = strMap3.size();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.nio.charset.Charset>> strEntrySet10 = strMap3.entrySet();
        java.lang.String str11 = strMap3.firstKey();
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stati Uniti" + "'", str7, "Stati Uniti");
        org.junit.Assert.assertNull(cloneable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 171 + "'", int9 == 171);
        org.junit.Assert.assertNotNull(strEntrySet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Big5" + "'", str11, "Big5");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.MAX;
        java.lang.String str4 = zoneOffset3.getId();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.MAX;
        java.lang.String str9 = zoneOffset8.getId();
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset8);
        boolean boolean11 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime10);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.lang.String str13 = zoneOffset12.getId();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.of(localDateTime10, (java.time.ZoneId) zoneOffset12);
        java.util.Date date16 = new java.util.Date((long) (byte) 1);
        java.lang.Cloneable cloneable17 = strMapMap0.getOrDefault((java.lang.Object) localDateTime10, (java.lang.Cloneable) date16);
        int int18 = date16.getMinutes();
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+18:00" + "'", str4, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+18:00" + "'", str9, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+18:00" + "'", str13, "+18:00");
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(cloneable17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = new java.net.URL("en-GB");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: en-GB");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.time.Instant instant0 = java.time.Instant.MAX;
        java.time.ZoneId zoneId1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.ofInstant(instant0, zoneId1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.time.Instant instant0 = java.time.Instant.MAX;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = instant0.getLong((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: SecondOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.lang.String str3 = zoneId2.getId();
        java.time.ZonedDateTime zonedDateTime4 = java.time.ZonedDateTime.now(zoneId2);
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.withDayOfMonth((int) (short) 10);
        java.time.temporal.TemporalUnit temporalUnit7 = null;
        boolean boolean8 = zonedDateTime4.isSupported(temporalUnit7);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology15 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean16 = byteBuffer14.equals((java.lang.Object) isoChronology15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = properties1.replace((java.lang.Object) temporalUnit7, (java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Etc/UTC" + "'", str3, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(isoChronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime1 = java.time.OffsetTime.parse((java.lang.CharSequence) "DecimalStyle[0+-.]");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'DecimalStyle[0+-.]' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours(171);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 171 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.time.Month month1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of((int) '#', month1, (int) '#', (int) 'u', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.LocalTime localTime1 = java.time.LocalTime.MAX;
        long long2 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) localTime1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.from((java.time.temporal.TemporalAccessor) localTime1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: 23:59:59.999999999 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23L + "'", long2 == 23L);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        java.net.InetAddress inetAddress21 = java.net.InetAddress.getByAddress(byteArray20);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer15.put(byteArray20, (int) '\000', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = byteBuffer24.getInt((-34));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0, 0, 100]");
        org.junit.Assert.assertNotNull(inetAddress21);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.time.format.DecimalStyle decimalStyle2 = java.time.format.DecimalStyle.ofDefaultLocale();
        java.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withDecimalStyle(decimalStyle2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate4 = java.time.LocalDate.parse((java.lang.CharSequence) "1970-01-01T18:01:37.00000012", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1970-01-01T18:01:37.00000012' could not be parsed, unparsed text found at index 10");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.OffsetTime offsetTime13 = localTime0.atOffset(zoneOffset1);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange15 = offsetTime13.range((java.time.temporal.TemporalField) chronoField14);
        java.time.Duration duration16 = java.time.Duration.ZERO;
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal18 = null;
        java.time.temporal.Temporal temporal19 = duration17.subtractFrom(temporal18);
        long long20 = duration17.toDays();
        java.time.Duration duration21 = duration16.minus(duration17);
        java.time.OffsetTime offsetTime22 = offsetTime13.minus((java.time.temporal.TemporalAmount) duration17);
        java.time.LocalTime localTime23 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray26 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList27, zoneOffsetTransitionArray26);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray29 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList30 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, zoneOffsetTransitionArray29);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray32 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList33, zoneOffsetTransitionRuleArray32);
        java.time.zone.ZoneRules zoneRules35 = java.time.zone.ZoneRules.of(zoneOffset24, zoneOffset25, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList27, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList33);
        java.time.OffsetTime offsetTime36 = localTime23.atOffset(zoneOffset24);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange38 = offsetTime36.range((java.time.temporal.TemporalField) chronoField37);
        java.time.Duration duration39 = java.time.Duration.ZERO;
        java.time.Duration duration40 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal41 = null;
        java.time.temporal.Temporal temporal42 = duration40.subtractFrom(temporal41);
        long long43 = duration40.toDays();
        java.time.Duration duration44 = duration39.minus(duration40);
        java.time.OffsetTime offsetTime45 = offsetTime36.minus((java.time.temporal.TemporalAmount) duration40);
        boolean boolean46 = offsetTime22.isAfter(offsetTime36);
        java.time.ZoneOffset zoneOffset49 = java.time.ZoneOffset.MAX;
        java.lang.String str50 = zoneOffset49.getId();
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset49);
        java.time.temporal.ChronoField chronoField52 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        boolean boolean53 = localDateTime51.isSupported((java.time.temporal.TemporalField) chronoField52);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = offsetTime22.get((java.time.temporal.TemporalField) chronoField52);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(temporal19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneRules35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField37.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNull(temporal42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(offsetTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zoneOffset49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+18:00" + "'", str50, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + chronoField52 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField52.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.security.cert.CertificateException certificateException1 = new java.security.cert.CertificateException("Di");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        long[] longArray1 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer2 = java.nio.LongBuffer.wrap(longArray1);
        long[] longArray4 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer5 = java.nio.LongBuffer.wrap(longArray4);
        java.nio.LongBuffer longBuffer6 = longBuffer2.put(longBuffer5);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = longBuffer5.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[10]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(longBuffer6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.LocalTime localTime6 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime7 = localDate5.atTime(localTime6);
        java.time.DayOfWeek dayOfWeek8 = localDate5.getDayOfWeek();
        java.time.chrono.IsoChronology isoChronology9 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra11 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate14 = isoChronology9.dateYearDay((java.time.chrono.Era) isoEra11, 0, 16);
        java.time.LocalTime localTime15 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime16 = localDate14.atTime(localTime15);
        java.time.LocalDate localDate18 = localDate14.withMonth(1);
        java.time.Period period19 = localDate5.until((java.time.chrono.ChronoLocalDate) localDate14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate21 = localDate5.plusYears(1645434841L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1645434842");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertNotNull(isoChronology9);
        org.junit.Assert.assertTrue("'" + isoEra11 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra11.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.time.LocalDate localDate0 = null;
        java.time.LocalTime localTime1 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray4 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList5 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList5, zoneOffsetTransitionArray4);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray7 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList8 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList8, zoneOffsetTransitionArray7);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray10 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList11 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList11, zoneOffsetTransitionRuleArray10);
        java.time.zone.ZoneRules zoneRules13 = java.time.zone.ZoneRules.of(zoneOffset2, zoneOffset3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList5, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList8, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList11);
        java.time.OffsetTime offsetTime14 = localTime1.atOffset(zoneOffset2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.of(localDate0, localTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneRules13);
        org.junit.Assert.assertNotNull(offsetTime14);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.time.Instant instant0 = java.time.Instant.MAX;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.ofInstant(instant0, zoneId1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneId1);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.net.Proxy.Type type0 = java.net.Proxy.Type.SOCKS;
        java.net.SocketAddress socketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Proxy proxy2 = new java.net.Proxy(type0, socketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type SOCKS is not compatible with address null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + java.net.Proxy.Type.SOCKS + "'", type0.equals(java.net.Proxy.Type.SOCKS));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.LocalTime localTime6 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime7 = localDate5.atTime(localTime6);
        java.time.DayOfWeek dayOfWeek8 = localDate5.getDayOfWeek();
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDate5.format(dateTimeFormatter9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: HourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream0, true, "+18:00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.lang.String str1 = zoneId0.getId();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId0);
        java.time.ZoneId zoneId3 = java.time.ZoneId.systemDefault();
        java.lang.String str4 = zoneId3.getId();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime2.withZoneSameInstant(zoneId3);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.lang.String str7 = zoneId6.getId();
        java.time.ZonedDateTime zonedDateTime8 = java.time.ZonedDateTime.now(zoneId6);
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.withYear((int) (short) 1);
        boolean boolean11 = zonedDateTime5.equals((java.lang.Object) zonedDateTime10);
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime5.minusMonths((long) (byte) -1);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = zonedDateTime5.with((java.time.temporal.TemporalField) chronoField14, 0L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for AlignedWeekOfYear (valid values 1 - 53): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Etc/UTC" + "'", str4, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Etc/UTC" + "'", str7, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField14.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.time.ZoneOffset zoneOffset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.ofEpochSecond((long) 1969, 0, zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed((int) (byte) 1, (int) ' ');
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray2 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList3 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, zoneOffsetTransitionArray2);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray8 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9, zoneOffsetTransitionRuleArray8);
        java.time.zone.ZoneRules zoneRules11 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9);
        boolean boolean12 = zoneRules11.isFixedOffset();
        java.time.Instant instant13 = null;
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition14 = zoneRules11.previousTransition(instant13);
        java.util.List<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList15 = zoneRules11.getTransitionRules();
        java.time.Instant instant16 = null;
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition17 = zoneRules11.previousTransition(instant16);
        java.time.Instant instant18 = java.time.Instant.MAX;
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition19 = zoneRules11.previousTransition(instant18);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(zoneOffsetTransition14);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleList15);
        org.junit.Assert.assertNull(zoneOffsetTransition17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNull(zoneOffsetTransition19);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.OffsetTime offsetTime13 = localTime0.atOffset(zoneOffset1);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange15 = offsetTime13.range((java.time.temporal.TemporalField) chronoField14);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        boolean boolean17 = offsetTime13.isSupported((java.time.temporal.TemporalField) chronoField16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.time.LocalTime localTime19 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray22 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList23 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList23, zoneOffsetTransitionArray22);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray25 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList26 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList26, zoneOffsetTransitionArray25);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray28 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList29 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList29, zoneOffsetTransitionRuleArray28);
        java.time.zone.ZoneRules zoneRules31 = java.time.zone.ZoneRules.of(zoneOffset20, zoneOffset21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList23, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList26, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList29);
        java.time.OffsetTime offsetTime32 = localTime19.atOffset(zoneOffset20);
        java.time.temporal.ChronoField chronoField33 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange34 = offsetTime32.range((java.time.temporal.TemporalField) chronoField33);
        java.time.OffsetTime offsetTime36 = chronoField18.adjustInto(offsetTime32, (long) 16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange37 = chronoField16.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetTime36);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: AlignedWeekOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField16.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField18.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(zoneRules31);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertTrue("'" + chronoField33 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField33.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange34);
        org.junit.Assert.assertNotNull(offsetTime36);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Properties properties3 = null;
        java.util.Properties properties4 = new java.util.Properties(properties3);
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.lang.String str6 = zoneId5.getId();
        java.time.ZonedDateTime zonedDateTime7 = java.time.ZonedDateTime.now(zoneId5);
        java.time.ZonedDateTime zonedDateTime9 = zonedDateTime7.withYear((int) (short) 1);
        java.time.LocalTime localTime10 = zonedDateTime9.toLocalTime();
        java.util.stream.DoubleStream doubleStream12 = java.util.stream.DoubleStream.of(0.0d);
        java.lang.Object obj13 = properties4.getOrDefault((java.lang.Object) zonedDateTime9, (java.lang.Object) doubleStream12);
        boolean boolean14 = locale1.equals(obj13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Etc/UTC" + "'", str6, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) 'a');
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        intStream3.close();
        boolean boolean5 = intStream3.isParallel();
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfInt ofInt6 = intStream3.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.sorted();
        java.util.stream.DoubleStream.Builder builder3 = java.util.stream.DoubleStream.builder();
        java.util.stream.DoubleStream doubleStream4 = doubleStream2.peek((java.util.function.DoubleConsumer) builder3);
        java.util.function.DoubleToLongFunction doubleToLongFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = doubleStream2.mapToLong(doubleToLongFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.lang.String str1 = zoneId0.getId();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId0);
        java.time.ZoneId zoneId3 = java.time.ZoneId.systemDefault();
        java.lang.String str4 = zoneId3.getId();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime2.withZoneSameInstant(zoneId3);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.lang.String str7 = zoneId6.getId();
        java.time.ZonedDateTime zonedDateTime8 = java.time.ZonedDateTime.now(zoneId6);
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.withYear((int) (short) 1);
        java.time.LocalTime localTime11 = zonedDateTime10.toLocalTime();
        java.time.temporal.TemporalUnit temporalUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = zonedDateTime5.until((java.time.temporal.Temporal) localTime11, temporalUnit12);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 09:14:02.593 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Etc/UTC" + "'", str4, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Etc/UTC" + "'", str7, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String[] strArray13 = new java.lang.String[] { "Stati Uniti", "{}", "italiano://Etc/UTC#Etc/UTC", "en-GB", "P0D", ":", "hi!", "{}", "java.nio.channels.AsynchronousCloseException", "italiano://Etc/UTC#Etc/UTC", "ISO", "+18:00", "P0D" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray18 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList19 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, zoneOffsetTransitionArray18);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray21 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList22 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList22, zoneOffsetTransitionArray21);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray24 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList25 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList25, zoneOffsetTransitionRuleArray24);
        java.time.zone.ZoneRules zoneRules27 = java.time.zone.ZoneRules.of(zoneOffset16, zoneOffset17, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList22, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList25);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray30 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList31 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, zoneOffsetTransitionArray30);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray33 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList34 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList34, zoneOffsetTransitionArray33);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray36 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList37 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList37, zoneOffsetTransitionRuleArray36);
        java.time.zone.ZoneRules zoneRules39 = java.time.zone.ZoneRules.of(zoneOffset28, zoneOffset29, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList34, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList37);
        boolean boolean40 = zoneOffsetTransitionList19.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList34);
        zoneOffsetTransitionList19.clear();
        boolean boolean42 = strSet14.removeAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19);
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransition zoneOffsetTransition44 = zoneOffsetTransitionList19.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zoneRules27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(zoneRules39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isSiteLocalAddress();
        boolean boolean2 = inetAddress0.isMCGlobal();
        boolean boolean3 = inetAddress0.isMCGlobal();
        boolean boolean4 = inetAddress0.isLoopbackAddress();
        boolean boolean5 = inetAddress0.isMCGlobal();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.time.Month month1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate3 = java.time.LocalDate.of((int) (byte) 10, month1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.LocalTime localTime2 = localTime0.plusMinutes((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime3 = java.time.OffsetTime.from((java.time.temporal.TemporalAccessor) localTime0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetTime from TemporalAccessor: 23:59:59.999999999 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        boolean boolean10 = localDateTime4.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.MAX;
        java.lang.String str12 = zoneOffset11.getId();
        java.time.ZonedDateTime zonedDateTime13 = java.time.ZonedDateTime.of(localDateTime9, (java.time.ZoneId) zoneOffset11);
        java.time.temporal.TemporalUnit temporalUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime16 = zonedDateTime13.plus(97L, temporalUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+18:00" + "'", str12, "+18:00");
        org.junit.Assert.assertNotNull(zonedDateTime13);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) (short) 1, (long) 10);
        java.util.stream.LongStream longStream3 = longStream2.unordered();
        java.util.stream.LongStream.Builder builder4 = java.util.stream.LongStream.builder();
        // The following exception was thrown during execution in test generation
        try {
            longStream2.forEach((java.util.function.LongConsumer) builder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.Comparator<java.time.OffsetDateTime> offsetDateTimeComparator0 = java.time.OffsetDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(offsetDateTimeComparator0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        strSet3.clear();
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray7 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList8 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList8, zoneOffsetTransitionArray7);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray10 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList11 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList11, zoneOffsetTransitionArray10);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray13 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList14 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList14, zoneOffsetTransitionRuleArray13);
        java.time.zone.ZoneRules zoneRules16 = java.time.zone.ZoneRules.of(zoneOffset5, zoneOffset6, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList8, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList11, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList14);
        boolean boolean17 = strSet3.retainAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Stati Uniti" + "'", str2, "Stati Uniti");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneRules16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        java.util.stream.IntStream intStream4 = intStream3.distinct();
        // The following exception was thrown during execution in test generation
        try {
            java.util.IntSummaryStatistics intSummaryStatistics5 = intStream3.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.time.format.DecimalStyle decimalStyle1 = java.time.format.DecimalStyle.ofDefaultLocale();
        java.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDecimalStyle(decimalStyle1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor4 = dateTimeFormatter0.parse((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.stream.Collector.Characteristics characteristics0 = java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
        org.junit.Assert.assertTrue("'" + characteristics0 + "' != '" + java.util.stream.Collector.Characteristics.IDENTITY_FINISH + "'", characteristics0.equals(java.util.stream.Collector.Characteristics.IDENTITY_FINISH));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray0 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList1 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList1, zoneOffsetTransitionArray0);
        java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream3 = zoneOffsetTransitionList1.stream();
        java.util.Optional<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionOptional4 = zoneOffsetTransitionStream3.findFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionOptional5 = zoneOffsetTransitionStream3.findFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionStream3);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionOptional4);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.net.SocketException socketException1 = new java.net.SocketException("ISO");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.time.Duration duration0 = java.time.Duration.ZERO;
        java.time.Duration duration2 = duration0.minusMillis((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period3 = java.time.Period.from((java.time.temporal.TemporalAmount) duration2);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        boolean boolean10 = localDateTime4.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MAX;
        java.lang.String str14 = zoneOffset13.getId();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset13);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.lang.String str19 = zoneOffset18.getId();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset18);
        boolean boolean21 = localDateTime15.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime20);
        java.time.format.DateTimeFormatter dateTimeFormatter22 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.lang.String str23 = localDateTime20.format(dateTimeFormatter22);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        int int25 = localDateTime20.get((java.time.temporal.TemporalField) chronoField24);
        boolean boolean26 = localDateTime9.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime20);
        java.time.temporal.TemporalUnit temporalUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime29 = localDateTime9.plus((long) '.', temporalUnit28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+18:00" + "'", str14, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+18:00" + "'", str19, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01T18:01:37.00000012" + "'", str23, "1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField24.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long3 = file2.lastModified();
        java.net.URL uRL4 = file2.toURL();
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = uRL4.getContent(classArray5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /1970-01-01T18:01:37.00000012 (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(uRL4);
        org.junit.Assert.assertEquals(uRL4.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(classArray5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        java.lang.String str1 = inetAddress0.getHostName();
        java.lang.String str2 = inetAddress0.getCanonicalHostName();
        boolean boolean3 = inetAddress0.isMCSiteLocal();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "599b081c1808" + "'", str1, "599b081c1808");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "599b081c1808" + "'", str2, "599b081c1808");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("1970-01-01T18:01:37.000000120");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj2 = charBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.parse((java.lang.CharSequence) charBuffer1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '????????????????' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.time.Duration duration0 = java.time.Duration.ZERO;
        java.time.Duration duration2 = duration0.minusMillis((long) (byte) 0);
        java.time.temporal.TemporalUnit temporalUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration5 = duration0.plus((long) 10, temporalUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: unit");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MIN;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime8 = java.time.ZonedDateTime.of((-1), (int) '\000', (int) '#', 4, (int) (short) 1, (int) 'a', 0, (java.time.ZoneId) zoneOffset7);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj2 = charBuffer1.array();
        java.nio.CharBuffer charBuffer4 = charBuffer1.append('.');
        java.lang.String str5 = charBuffer1.toString();
        int int6 = charBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period7 = java.time.Period.parse((java.lang.CharSequence) charBuffer1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str5, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        boolean boolean3 = file2.isHidden();
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.MAX;
        java.lang.String str4 = zoneOffset3.getId();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.MAX;
        java.lang.String str9 = zoneOffset8.getId();
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset8);
        boolean boolean11 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime10);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.lang.String str13 = zoneOffset12.getId();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.of(localDateTime10, (java.time.ZoneId) zoneOffset12);
        java.util.Date date16 = new java.util.Date((long) (byte) 1);
        java.lang.Cloneable cloneable17 = strMapMap0.getOrDefault((java.lang.Object) localDateTime10, (java.lang.Cloneable) date16);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray20 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, zoneOffsetTransitionArray20);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray23 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList24 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, zoneOffsetTransitionArray23);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray26 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27, zoneOffsetTransitionRuleArray26);
        java.time.zone.ZoneRules zoneRules29 = java.time.zone.ZoneRules.of(zoneOffset18, zoneOffset19, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27);
        java.time.Clock clock30 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset18);
        java.time.format.TextStyle textStyle31 = java.time.format.TextStyle.SHORT_STANDALONE;
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = zoneOffset18.getDisplayName(textStyle31, locale32);
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.MIN;
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransition zoneOffsetTransition35 = java.time.zone.ZoneOffsetTransition.of(localDateTime10, zoneOffset18, zoneOffset34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nano-of-second must be zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+18:00" + "'", str4, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+18:00" + "'", str9, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+18:00" + "'", str13, "+18:00");
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(cloneable17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(clock30);
        org.junit.Assert.assertTrue("'" + textStyle31 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle31.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+18:00" + "'", str33, "+18:00");
        org.junit.Assert.assertNotNull(zoneOffset34);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer3 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "//Etc/UTC", (int) '#', 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.lang.String str13 = zoneOffset12.getId();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset12);
        boolean boolean15 = localDateTime9.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        boolean boolean16 = localDateTime4.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray20 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, zoneOffsetTransitionArray20);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray23 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList24 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, zoneOffsetTransitionArray23);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray26 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27, zoneOffsetTransitionRuleArray26);
        java.time.zone.ZoneRules zoneRules29 = java.time.zone.ZoneRules.of(zoneOffset18, zoneOffset19, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray32 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, zoneOffsetTransitionArray32);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray35 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList36 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, zoneOffsetTransitionArray35);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray38 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList39 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39, zoneOffsetTransitionRuleArray38);
        java.time.zone.ZoneRules zoneRules41 = java.time.zone.ZoneRules.of(zoneOffset30, zoneOffset31, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray44 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList45 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, zoneOffsetTransitionArray44);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray47 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList48 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, zoneOffsetTransitionArray47);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray50 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList51 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51, zoneOffsetTransitionRuleArray50);
        java.time.zone.ZoneRules zoneRules53 = java.time.zone.ZoneRules.of(zoneOffset42, zoneOffset43, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51);
        boolean boolean54 = zoneOffsetTransitionList33.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48);
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset56 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray57 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList58 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, zoneOffsetTransitionArray57);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray60 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList61 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, zoneOffsetTransitionArray60);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray63 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList64 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64, zoneOffsetTransitionRuleArray63);
        java.time.zone.ZoneRules zoneRules66 = java.time.zone.ZoneRules.of(zoneOffset55, zoneOffset56, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64);
        int int68 = zoneOffsetTransitionList61.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset69 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset70 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray71 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList72 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, zoneOffsetTransitionArray71);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray74 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList75 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, zoneOffsetTransitionArray74);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray77 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList78 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78, zoneOffsetTransitionRuleArray77);
        java.time.zone.ZoneRules zoneRules80 = java.time.zone.ZoneRules.of(zoneOffset69, zoneOffset70, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.zone.ZoneRules zoneRules81 = java.time.zone.ZoneRules.of(zoneOffset17, zoneOffset18, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.ZoneOffset zoneOffset84 = java.time.ZoneOffset.MAX;
        java.lang.String str85 = zoneOffset84.getId();
        java.time.LocalDateTime localDateTime86 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset84);
        int int87 = zoneOffset18.compareTo(zoneOffset84);
        java.time.OffsetDateTime offsetDateTime88 = java.time.OffsetDateTime.of(localDateTime9, zoneOffset18);
        java.time.LocalTime localTime89 = offsetDateTime88.toLocalTime();
        java.time.OffsetDateTime offsetDateTime91 = offsetDateTime88.withDayOfMonth((int) (byte) 10);
        java.time.temporal.ChronoField chronoField92 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime94 = offsetDateTime91.with((java.time.temporal.TemporalField) chronoField92, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+18:00" + "'", str13, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(zoneRules41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(zoneRules53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertNotNull(zoneOffset56);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(zoneRules66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset69);
        org.junit.Assert.assertNotNull(zoneOffset70);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(zoneRules80);
        org.junit.Assert.assertNotNull(zoneRules81);
        org.junit.Assert.assertNotNull(zoneOffset84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+18:00" + "'", str85, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(offsetDateTime88);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertNotNull(offsetDateTime91);
        org.junit.Assert.assertTrue("'" + chronoField92 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField92.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.io.File file4 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long5 = file4.lastModified();
        java.net.URL uRL6 = file4.toURL();
        java.nio.file.Path path7 = file4.toPath();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = java.io.File.createTempFile("Optional.empty", "P0D", file4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(file4.getParent(), "/");
        org.junit.Assert.assertEquals(file4.toString(), "/1970-01-01T18:01:37.00000012");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(uRL6);
        org.junit.Assert.assertEquals(uRL6.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(path7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap8 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.format.ResolverStyle resolverStyle10 = dateTimeFormatter9.getResolverStyle();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate11 = isoChronology6.resolveDate(temporalFieldMap8, resolverStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + resolverStyle10 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle10.equals(java.time.format.ResolverStyle.STRICT));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.nio.CharBuffer charBuffer3 = charBuffer1.append((java.lang.CharSequence) "Etc/UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period4 = java.time.Period.parse((java.lang.CharSequence) charBuffer1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(charBuffer3);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        char char3 = charBuffer1.get();
        char[] charArray8 = new char[] { 'x', 'a', '4', '.' };
        java.nio.CharBuffer charBuffer9 = charBuffer1.get(charArray8);
        java.nio.CharBuffer charBuffer11 = java.nio.CharBuffer.allocate(16);
        int int12 = charBuffer11.limit();
        char char13 = charBuffer11.get();
        char[] charArray18 = new char[] { 'x', 'a', '4', '.' };
        java.nio.CharBuffer charBuffer19 = charBuffer11.get(charArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer22 = charBuffer1.get(charArray18, 4096, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(charBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charBuffer19);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.lang.String str1 = zoneId0.getId();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId0);
        java.time.ZoneId zoneId3 = zonedDateTime2.getZone();
        java.time.temporal.TemporalUnit temporalUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime5 = zonedDateTime2.truncatedTo(temporalUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertNotNull(zoneId3);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of((int) 'u', (int) '.', (int) (byte) -1, 2, (int) (short) -1, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 46");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int int0 = org.apache.commons.math.util.ResizableDoubleArray.MULTIPLICATIVE_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        intStream3.close();
        java.util.function.IntConsumer intConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            intStream3.forEachOrdered(intConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.time.format.DecimalStyle decimalStyle2 = java.time.format.DecimalStyle.ofDefaultLocale();
        java.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withDecimalStyle(decimalStyle2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime4 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "ClockHourOfDay", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'ClockHourOfDay' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException1 = new java.util.InvalidPropertiesFormatException("en-GB");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        int int6 = byteBuffer5.arrayOffset();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.security.InvalidKeyException invalidKeyException10 = new java.security.InvalidKeyException("+18:00");
        java.security.cert.CertificateException certificateException11 = new java.security.cert.CertificateException("", (java.lang.Throwable) invalidKeyException10);
        boolean boolean12 = shortBuffer7.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = shortBuffer7.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        boolean boolean16 = byteBuffer5.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = byteBuffer5.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.time.Month month1 = java.time.Month.JANUARY;
        java.time.Month month2 = month1.firstMonthOfQuarter();
        java.time.Month month4 = month2.plus((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.of(0, month2, (-1), 365, (int) 'x', (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.JANUARY + "'", month1.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.JANUARY + "'", month2.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.JANUARY + "'", month4.equals(java.time.Month.JANUARY));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer15.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = byteBuffer16.putChar(256, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress2 = java.net.InetAddress.getByAddress("hi!", byteArray1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean3 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray2 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList3 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, zoneOffsetTransitionArray2);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray8 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9, zoneOffsetTransitionRuleArray8);
        java.time.zone.ZoneRules zoneRules11 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray14 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList15 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList15, zoneOffsetTransitionArray14);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray17 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList18 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList18, zoneOffsetTransitionArray17);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray20 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList21, zoneOffsetTransitionRuleArray20);
        java.time.zone.ZoneRules zoneRules23 = java.time.zone.ZoneRules.of(zoneOffset12, zoneOffset13, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList15, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList18, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList21);
        boolean boolean24 = zoneOffsetTransitionList3.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList18);
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition25 = null;
        boolean boolean26 = zoneOffsetTransitionList3.add(zoneOffsetTransition25);
        java.lang.Object[] objArray27 = zoneOffsetTransitionList3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionItor29 = zoneOffsetTransitionList3.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneRules23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[null]");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.time.Clock clock3 = java.time.Clock.systemUTC();
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap4 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap5 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = strMapMap5.containsKey((java.lang.Object) isoChronology6);
        java.time.Duration duration8 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal9 = null;
        java.time.temporal.Temporal temporal10 = duration8.subtractFrom(temporal9);
        long long11 = duration8.toDays();
        boolean boolean12 = strMapMap5.contains((java.lang.Object) duration8);
        java.lang.Cloneable cloneable13 = strMapMap4.get((java.lang.Object) duration8);
        java.time.Duration duration15 = duration8.plusSeconds(1645434841L);
        java.time.Clock clock16 = java.time.Clock.tick(clock3, duration15);
        boolean boolean17 = locale0.equals((java.lang.Object) duration15);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNull(temporal10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(cloneable13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(clock16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long3 = file2.lastModified();
        java.lang.String str4 = file2.getParent();
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.text.ParseException parseException2 = new java.text.ParseException("PT0S", 4096);
        int int3 = parseException2.getErrorOffset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4096 + "'", int3 == 4096);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.time.chrono.IsoEra isoEra3 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate6 = isoChronology1.dateYearDay((java.time.chrono.Era) isoEra3, (-1), 10);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray9, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology13 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean14 = byteBuffer12.equals((java.lang.Object) isoChronology13);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap15 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology16 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean17 = strMapMap15.containsKey((java.lang.Object) isoChronology16);
        java.time.chrono.IsoEra isoEra18 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate21 = isoChronology16.dateYearDay((java.time.chrono.Era) isoEra18, (-1), 10);
        int int23 = isoChronology13.prolepticYear((java.time.chrono.Era) isoEra18, (int) '#');
        java.time.LocalDate localDate26 = isoChronology1.dateYearDay((java.time.chrono.Era) isoEra18, (int) (byte) 0, 2);
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap27 = null;
        java.time.format.ResolverStyle resolverStyle28 = java.time.format.ResolverStyle.SMART;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate29 = isoChronology1.resolveDate(temporalFieldMap27, resolverStyle28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + isoEra3 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra3.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(isoChronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(isoChronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + isoEra18 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra18.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + resolverStyle28 + "' != '" + java.time.format.ResolverStyle.SMART + "'", resolverStyle28.equals(java.time.format.ResolverStyle.SMART));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.net.URLConnection.setDefaultRequestProperty("20220221Z", "");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.of("1970-01-01T18:01:37.000000120");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: 1970-01-01T18:01:37.000000120");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray0 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList1 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList1, zoneOffsetTransitionArray0);
        java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream3 = zoneOffsetTransitionList1.stream();
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition4 = null;
        java.util.function.BinaryOperator<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransition zoneOffsetTransition6 = zoneOffsetTransitionStream3.reduce(zoneOffsetTransition4, zoneOffsetTransitionBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionStream3);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap3 = java.nio.charset.Charset.availableCharsets();
        boolean boolean4 = strMap3.isEmpty();
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.Cloneable cloneable8 = strMapMap0.put(strMap3, (java.lang.Cloneable) locale6);
        int int9 = strMap3.size();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.nio.charset.Charset>> strEntrySet10 = strMap3.entrySet();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.wrap(byteArray13, (int) (short) 0, 0);
        int int17 = byteBuffer16.arrayOffset();
        java.nio.charset.Charset charset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset19 = strMap3.getOrDefault((java.lang.Object) int17, charset18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stati Uniti" + "'", str7, "Stati Uniti");
        org.junit.Assert.assertNull(cloneable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 171 + "'", int9 == 171);
        org.junit.Assert.assertNotNull(strEntrySet10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.Set<java.time.chrono.Chronology> chronologySet0 = java.time.chrono.Chronology.getAvailableChronologies();
        org.junit.Assert.assertNotNull(chronologySet0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.LocalTime localTime6 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime7 = localDate5.atTime(localTime6);
        java.time.LocalDate localDate9 = localDate5.withMonth(1);
        java.time.Duration duration10 = java.time.Duration.ZERO;
        java.time.Duration duration11 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal12 = null;
        java.time.temporal.Temporal temporal13 = duration11.subtractFrom(temporal12);
        long long14 = duration11.toDays();
        java.time.Duration duration15 = duration10.plus(duration11);
        java.time.LocalDate localDate16 = localDate9.minus((java.time.temporal.TemporalAmount) duration10);
        java.time.temporal.TemporalUnit temporalUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal19 = localDate16.minus((long) (short) 100, temporalUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNull(temporal13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.time.Instant instant0 = java.time.Instant.MAX;
        java.time.Instant instant2 = instant0.plusNanos((long) (short) -1);
        long long3 = instant2.getEpochSecond();
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.lang.String str5 = zoneId4.getId();
        java.time.ZonedDateTime zonedDateTime6 = java.time.ZonedDateTime.now(zoneId4);
        java.time.ZonedDateTime zonedDateTime8 = zonedDateTime6.withDayOfMonth((int) (short) 10);
        java.time.temporal.TemporalUnit temporalUnit9 = null;
        boolean boolean10 = zonedDateTime6.isSupported(temporalUnit9);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        java.time.temporal.ValueRange valueRange12 = zonedDateTime6.range((java.time.temporal.TemporalField) chronoField11);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange13 = instant2.range((java.time.temporal.TemporalField) chronoField11);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfWeek");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 31556889864403199L + "'", long3 == 31556889864403199L);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField11.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
        org.junit.Assert.assertNotNull(valueRange12);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.WEDNESDAY));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.concurrent.TimeoutException timeoutException1 = new java.util.concurrent.TimeoutException("hi!");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long3 = file2.lastModified();
        java.net.URL uRL4 = file2.toURL();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = uRL4.getContent();
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /1970-01-01T18:01:37.00000012 (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(uRL4);
        org.junit.Assert.assertEquals(uRL4.toString(), "file:/1970-01-01T18:01:37.00000012");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.security.SignatureException signatureException1 = new java.security.SignatureException("+18:00");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.nio.channels.AsynchronousCloseException asynchronousCloseException1 = new java.nio.channels.AsynchronousCloseException();
        java.util.concurrent.ExecutionException executionException2 = new java.util.concurrent.ExecutionException((java.lang.Throwable) asynchronousCloseException1);
        java.security.cert.CertificateEncodingException certificateEncodingException3 = new java.security.cert.CertificateEncodingException("Etc/UTC", (java.lang.Throwable) executionException2);
        java.lang.String str4 = executionException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.util.concurrent.ExecutionException: java.nio.channels.AsynchronousCloseException" + "'", str4, "java.util.concurrent.ExecutionException: java.nio.channels.AsynchronousCloseException");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj2 = charBuffer1.array();
        boolean boolean3 = charBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap((java.lang.CharSequence) charBuffer1, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        int int6 = byteBuffer5.arrayOffset();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.slice();
        boolean boolean8 = byteBuffer5.isDirect();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.net.FileNameMap fileNameMap0 = null;
        java.net.URLConnection.setFileNameMap(fileNameMap0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long3 = file2.lastModified();
        java.net.URL uRL4 = file2.toURL();
        java.nio.file.Path path5 = file2.toPath();
        java.io.File file8 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long9 = file8.lastModified();
        java.net.URL uRL10 = file8.toURL();
        java.nio.file.Path path11 = file8.toPath();
        java.nio.file.Path path12 = path5.relativize(path11);
        java.io.File file15 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long16 = file15.lastModified();
        java.net.URL uRL17 = file15.toURL();
        java.nio.file.Path path18 = file15.toPath();
        java.io.File file21 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long22 = file21.lastModified();
        java.net.URL uRL23 = file21.toURL();
        java.nio.file.Path path24 = file21.toPath();
        java.nio.file.Path path25 = path18.relativize(path24);
        boolean boolean26 = path11.startsWith(path18);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path28 = path11.getName(16448);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(uRL4);
        org.junit.Assert.assertEquals(uRL4.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertEquals(file8.getParent(), "/");
        org.junit.Assert.assertEquals(file8.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(uRL10);
        org.junit.Assert.assertEquals(uRL10.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertNotNull(path12);
        org.junit.Assert.assertEquals(file15.getParent(), "/");
        org.junit.Assert.assertEquals(file15.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(uRL17);
        org.junit.Assert.assertEquals(uRL17.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(path18);
        org.junit.Assert.assertEquals(file21.getParent(), "/");
        org.junit.Assert.assertEquals(file21.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(uRL23);
        org.junit.Assert.assertEquals(uRL23.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(path24);
        org.junit.Assert.assertNotNull(path25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray2 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList3 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, zoneOffsetTransitionArray2);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray8 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9, zoneOffsetTransitionRuleArray8);
        java.time.zone.ZoneRules zoneRules11 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9);
        boolean boolean12 = zoneRules11.isFixedOffset();
        java.time.Instant instant13 = null;
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition14 = zoneRules11.previousTransition(instant13);
        java.util.List<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList15 = zoneRules11.getTransitionRules();
        java.time.Instant instant16 = null;
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition17 = zoneRules11.previousTransition(instant16);
        java.time.Instant instant18 = java.time.Instant.MAX;
        java.time.Instant instant20 = instant18.plusNanos((long) (short) -1);
        java.time.ZoneOffset zoneOffset21 = zoneRules11.getOffset(instant20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = java.util.Date.from(instant20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.lang.ArithmeticException: long overflow");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(zoneOffsetTransition14);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleList15);
        org.junit.Assert.assertNull(zoneOffsetTransition17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(zoneOffset21);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Era era7 = isoChronology0.eraOf((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid era: 117");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        org.junit.Assert.assertNotNull(offsetTime0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.lang.String str13 = zoneOffset12.getId();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset12);
        boolean boolean15 = localDateTime9.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        boolean boolean16 = localDateTime4.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray20 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, zoneOffsetTransitionArray20);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray23 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList24 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, zoneOffsetTransitionArray23);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray26 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27, zoneOffsetTransitionRuleArray26);
        java.time.zone.ZoneRules zoneRules29 = java.time.zone.ZoneRules.of(zoneOffset18, zoneOffset19, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray32 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, zoneOffsetTransitionArray32);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray35 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList36 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, zoneOffsetTransitionArray35);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray38 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList39 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39, zoneOffsetTransitionRuleArray38);
        java.time.zone.ZoneRules zoneRules41 = java.time.zone.ZoneRules.of(zoneOffset30, zoneOffset31, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray44 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList45 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, zoneOffsetTransitionArray44);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray47 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList48 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, zoneOffsetTransitionArray47);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray50 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList51 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51, zoneOffsetTransitionRuleArray50);
        java.time.zone.ZoneRules zoneRules53 = java.time.zone.ZoneRules.of(zoneOffset42, zoneOffset43, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51);
        boolean boolean54 = zoneOffsetTransitionList33.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48);
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset56 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray57 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList58 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, zoneOffsetTransitionArray57);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray60 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList61 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, zoneOffsetTransitionArray60);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray63 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList64 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64, zoneOffsetTransitionRuleArray63);
        java.time.zone.ZoneRules zoneRules66 = java.time.zone.ZoneRules.of(zoneOffset55, zoneOffset56, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64);
        int int68 = zoneOffsetTransitionList61.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset69 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset70 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray71 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList72 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, zoneOffsetTransitionArray71);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray74 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList75 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, zoneOffsetTransitionArray74);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray77 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList78 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78, zoneOffsetTransitionRuleArray77);
        java.time.zone.ZoneRules zoneRules80 = java.time.zone.ZoneRules.of(zoneOffset69, zoneOffset70, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.zone.ZoneRules zoneRules81 = java.time.zone.ZoneRules.of(zoneOffset17, zoneOffset18, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.ZoneOffset zoneOffset84 = java.time.ZoneOffset.MAX;
        java.lang.String str85 = zoneOffset84.getId();
        java.time.LocalDateTime localDateTime86 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset84);
        int int87 = zoneOffset18.compareTo(zoneOffset84);
        java.time.OffsetDateTime offsetDateTime88 = java.time.OffsetDateTime.of(localDateTime9, zoneOffset18);
        java.time.LocalTime localTime89 = offsetDateTime88.toLocalTime();
        java.time.OffsetDateTime offsetDateTime91 = offsetDateTime88.withDayOfMonth((int) (byte) 10);
        java.time.OffsetDateTime offsetDateTime93 = offsetDateTime91.plusWeeks((long) (short) 10);
        java.time.temporal.TemporalUnit temporalUnit94 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime95 = offsetDateTime91.truncatedTo(temporalUnit94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+18:00" + "'", str13, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(zoneRules41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(zoneRules53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertNotNull(zoneOffset56);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(zoneRules66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset69);
        org.junit.Assert.assertNotNull(zoneOffset70);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(zoneRules80);
        org.junit.Assert.assertNotNull(zoneRules81);
        org.junit.Assert.assertNotNull(zoneOffset84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+18:00" + "'", str85, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(offsetDateTime88);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertNotNull(offsetDateTime91);
        org.junit.Assert.assertNotNull(offsetDateTime93);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByIndex((int) '\000');
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.OffsetTime offsetTime13 = localTime0.atOffset(zoneOffset1);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange15 = offsetTime13.range((java.time.temporal.TemporalField) chronoField14);
        java.time.Duration duration16 = java.time.Duration.ZERO;
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal18 = null;
        java.time.temporal.Temporal temporal19 = duration17.subtractFrom(temporal18);
        long long20 = duration17.toDays();
        java.time.Duration duration21 = duration16.minus(duration17);
        java.time.OffsetTime offsetTime22 = offsetTime13.minus((java.time.temporal.TemporalAmount) duration17);
        java.time.Duration duration24 = duration17.minusMinutes((long) (byte) -1);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(temporal19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        java.time.Period period11 = isoChronology6.period((int) (short) 10, (int) '0', 4);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.wrap(byteArray14, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology18 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean19 = byteBuffer17.equals((java.lang.Object) isoChronology18);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap20 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology21 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean22 = strMapMap20.containsKey((java.lang.Object) isoChronology21);
        java.time.chrono.IsoEra isoEra23 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate26 = isoChronology21.dateYearDay((java.time.chrono.Era) isoEra23, (-1), 10);
        int int28 = isoChronology18.prolepticYear((java.time.chrono.Era) isoEra23, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate32 = isoChronology6.date((java.time.chrono.Era) isoEra23, 16, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(isoChronology18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(isoChronology21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + isoEra23 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra23.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-34) + "'", int28 == (-34));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap1 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology2 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean3 = strMapMap1.containsKey((java.lang.Object) isoChronology2);
        java.time.Duration duration4 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal5 = null;
        java.time.temporal.Temporal temporal6 = duration4.subtractFrom(temporal5);
        long long7 = duration4.toDays();
        boolean boolean8 = strMapMap1.contains((java.lang.Object) duration4);
        java.lang.Cloneable cloneable9 = strMapMap0.get((java.lang.Object) duration4);
        java.time.Duration duration10 = java.time.Duration.ZERO;
        java.time.Duration duration11 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal12 = null;
        java.time.temporal.Temporal temporal13 = duration11.subtractFrom(temporal12);
        long long14 = duration11.toDays();
        java.time.Duration duration15 = duration10.plus(duration11);
        long long16 = duration11.toDays();
        java.time.Duration duration17 = duration4.plus(duration11);
        java.time.Duration duration18 = java.time.Duration.from((java.time.temporal.TemporalAmount) duration4);
        org.junit.Assert.assertNotNull(isoChronology2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNull(temporal6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(cloneable9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNull(temporal13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration18);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.time.format.DecimalStyle decimalStyle2 = java.time.format.DecimalStyle.ofDefaultLocale();
        java.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withDecimalStyle(decimalStyle2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.parse((java.lang.CharSequence) "0001-01-16", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0001-01-16' could not be parsed: Unable to obtain LocalDateTime from TemporalAccessor: {},ISO resolved to 0001-01-16 of type java.time.format.Parsed");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        org.junit.Assert.assertNotNull(zoneOffset0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.function.DoublePredicate doublePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = doubleStream1.allMatch(doublePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("1970-01-01T18:01:37.00000012");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.nio.channels.AsynchronousCloseException asynchronousCloseException0 = new java.nio.channels.AsynchronousCloseException();
        java.util.concurrent.ExecutionException executionException1 = new java.util.concurrent.ExecutionException((java.lang.Throwable) asynchronousCloseException0);
        java.security.InvalidKeyException invalidKeyException2 = new java.security.InvalidKeyException((java.lang.Throwable) executionException1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        long[] longArray1 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer2 = java.nio.LongBuffer.wrap(longArray1);
        long[] longArray4 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer5 = java.nio.LongBuffer.wrap(longArray4);
        java.nio.LongBuffer longBuffer6 = longBuffer2.put(longArray4);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[10]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(longBuffer6);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray0 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList1 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList1, zoneOffsetTransitionArray0);
        java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream3 = zoneOffsetTransitionList1.stream();
        java.util.Optional<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionOptional4 = zoneOffsetTransitionStream3.findFirst();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = zoneOffsetTransitionStream3.count();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionStream3);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionOptional4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.net.URLConnection.setDefaultRequestProperty("PT0S", "italiano://Etc/UTC#Etc/UTC");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset1 = java.nio.charset.Charset.forName("java.nio.channels.AsynchronousCloseException");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: java.nio.channels.AsynchronousCloseException");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByIndex(10);
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) (short) 1, (long) 10);
        java.util.stream.LongStream longStream3 = longStream2.unordered();
        java.util.function.LongToDoubleFunction longToDoubleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = longStream2.mapToDouble(longToDoubleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer15.putFloat((float) 7187392471159151072L);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.time.Instant instant0 = java.time.Instant.MAX;
        java.time.Instant instant2 = instant0.plusNanos((long) (short) -1);
        long long3 = instant2.getEpochSecond();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant5 = instant2.plusSeconds(7187392471159151072L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Instant exceeds minimum or maximum instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 31556889864403199L + "'", long3 == 31556889864403199L);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.concurrent.TimeoutException timeoutException0 = new java.util.concurrent.TimeoutException();
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        descriptiveStatistics0.setWindowSize((int) (short) -1);
        double double3 = descriptiveStatistics0.getSkewness();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = descriptiveStatistics0.getElement(59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 59 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.io.IOException iOException1 = new java.io.IOException("Optional.empty");
        java.security.KeyException keyException2 = new java.security.KeyException((java.lang.Throwable) iOException1);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Comparator<java.nio.file.AccessMode> accessModeComparator0 = java.util.Comparator.naturalOrder();
        org.junit.Assert.assertNotNull(accessModeComparator0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray0 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList1 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList1, zoneOffsetTransitionArray0);
        java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream3 = zoneOffsetTransitionList1.stream();
        java.util.Optional<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionOptional4 = zoneOffsetTransitionStream3.findFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream6 = zoneOffsetTransitionStream3.skip((long) 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionStream3);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionOptional4);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.stream.IntStream intStream0 = java.util.stream.IntStream.empty();
        java.util.function.IntBinaryOperator intBinaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt2 = intStream0.reduce(intBinaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.net.MalformedURLException malformedURLException1 = new java.net.MalformedURLException("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.lang.String str3 = zoneId2.getId();
        java.time.ZonedDateTime zonedDateTime4 = java.time.ZonedDateTime.now(zoneId2);
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.withYear((int) (short) 1);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.util.stream.DoubleStream doubleStream9 = java.util.stream.DoubleStream.of(0.0d);
        java.lang.Object obj10 = properties1.getOrDefault((java.lang.Object) zonedDateTime6, (java.lang.Object) doubleStream9);
        java.lang.Object obj13 = properties1.setProperty("P0D", "DIRECT");
        java.util.stream.LongStream longStream16 = java.util.stream.LongStream.range((long) (short) 1, (long) 10);
        java.util.stream.LongStream.Builder builder17 = java.util.stream.LongStream.builder();
        java.util.stream.LongStream longStream18 = longStream16.peek((java.util.function.LongConsumer) builder17);
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = properties1.replace((java.lang.Object) builder17, obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Etc/UTC" + "'", str3, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(longStream18);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray2 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList3 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, zoneOffsetTransitionArray2);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray8 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9, zoneOffsetTransitionRuleArray8);
        java.time.zone.ZoneRules zoneRules11 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9);
        java.time.Clock clock12 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset0);
        java.time.format.TextStyle textStyle13 = java.time.format.TextStyle.SHORT_STANDALONE;
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = zoneOffset0.getDisplayName(textStyle13, locale14);
        boolean boolean16 = textStyle13.isStandalone();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(clock12);
        org.junit.Assert.assertTrue("'" + textStyle13 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle13.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+18:00" + "'", str15, "+18:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap8 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology9 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean10 = strMapMap8.containsKey((java.lang.Object) isoChronology9);
        java.time.chrono.IsoEra isoEra11 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate14 = isoChronology9.dateYearDay((java.time.chrono.Era) isoEra11, (-1), 10);
        int int16 = isoChronology6.prolepticYear((java.time.chrono.Era) isoEra11, (int) '#');
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.AMPM_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = isoEra11.getLong((java.time.temporal.TemporalField) chronoField17);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: AmPmOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(isoChronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + isoEra11 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra11.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-34) + "'", int16 == (-34));
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.AMPM_OF_DAY + "'", chronoField17.equals(java.time.temporal.ChronoField.AMPM_OF_DAY));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.lang.String str1 = zoneId0.getId();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId0);
        java.time.ZonedDateTime zonedDateTime4 = zonedDateTime2.withYear((int) (short) 1);
        java.time.LocalTime localTime5 = zonedDateTime4.toLocalTime();
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.MAX;
        java.lang.String str9 = zoneOffset8.getId();
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset8);
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray13 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList14 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList14, zoneOffsetTransitionArray13);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray16 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList17 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList17, zoneOffsetTransitionArray16);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray19 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList20 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList20, zoneOffsetTransitionRuleArray19);
        java.time.zone.ZoneRules zoneRules22 = java.time.zone.ZoneRules.of(zoneOffset11, zoneOffset12, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList14, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList17, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList20);
        int int23 = zoneOffset8.compareTo(zoneOffset11);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime24 = zonedDateTime4.withZoneSameLocal((java.time.ZoneId) zoneOffset8);
        java.time.ZoneId zoneId25 = java.time.ZoneId.systemDefault();
        java.lang.String str26 = zoneId25.getId();
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.now(zoneId25);
        java.time.ZonedDateTime zonedDateTime29 = zonedDateTime27.withDayOfMonth((int) (short) 10);
        java.time.temporal.TemporalUnit temporalUnit30 = null;
        boolean boolean31 = zonedDateTime27.isSupported(temporalUnit30);
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        java.time.temporal.ValueRange valueRange33 = zonedDateTime27.range((java.time.temporal.TemporalField) chronoField32);
        java.time.temporal.ChronoField chronoField34 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.LocalTime localTime35 = java.time.LocalTime.MAX;
        long long36 = chronoField34.getFrom((java.time.temporal.TemporalAccessor) localTime35);
        boolean boolean37 = zonedDateTime27.isSupported((java.time.temporal.TemporalField) chronoField34);
        boolean boolean38 = chronoField34.isDateBased();
        int int39 = zonedDateTime4.get((java.time.temporal.TemporalField) chronoField34);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = chronoField34.checkValidIntValue((-719147L));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for ClockHourOfDay (valid values 1 - 24): -719147");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+18:00" + "'", str9, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(zoneRules22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime24);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Etc/UTC" + "'", str26, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField32.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
        org.junit.Assert.assertNotNull(valueRange33);
        org.junit.Assert.assertTrue("'" + chronoField34 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField34.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 23L + "'", long36 == 23L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime3 = offsetTime0.plus((long) 4096, temporalUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        boolean boolean1 = strMap0.isEmpty();
        java.util.Set<java.lang.String> strSet2 = strMap0.keySet();
        int int3 = strMap0.size();
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.lang.String str5 = zoneId4.getId();
        java.time.ZonedDateTime zonedDateTime6 = java.time.ZonedDateTime.now(zoneId4);
        java.time.ZoneId zoneId7 = java.time.ZoneId.systemDefault();
        java.lang.String str8 = zoneId7.getId();
        java.time.ZonedDateTime zonedDateTime9 = zonedDateTime6.withZoneSameInstant(zoneId7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.lang.String str11 = zoneId10.getId();
        java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.now(zoneId10);
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime12.withYear((int) (short) 1);
        boolean boolean15 = zonedDateTime9.equals((java.lang.Object) zonedDateTime14);
        java.time.ZonedDateTime zonedDateTime17 = zonedDateTime9.minusMonths((long) (byte) -1);
        java.nio.charset.Charset charset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset19 = strMap0.getOrDefault((java.lang.Object) zonedDateTime17, charset18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.time.ZonedDateTime cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 171 + "'", int3 == 171);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Etc/UTC" + "'", str8, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Etc/UTC" + "'", str11, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zonedDateTime17);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj2 = charBuffer1.array();
        java.nio.CharBuffer charBuffer4 = charBuffer1.append('.');
        java.lang.String str5 = charBuffer1.toString();
        int int6 = charBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            char char8 = charBuffer1.charAt(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str5, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        boolean boolean1 = strMap0.isEmpty();
        java.util.Set<java.lang.String> strSet2 = strMap0.keySet();
        int int3 = strSet2.size();
        java.util.Locale locale6 = new java.util.Locale("DecimalStyle[0+-.]", "Di");
        boolean boolean7 = strSet2.equals((java.lang.Object) "Di");
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.lang.String str9 = zoneId8.getId();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId8);
        java.time.ZoneId zoneId11 = java.time.ZoneId.systemDefault();
        java.lang.String str12 = zoneId11.getId();
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime10.withZoneSameInstant(zoneId11);
        java.time.ZoneId zoneId14 = java.time.ZoneId.systemDefault();
        java.lang.String str15 = zoneId14.getId();
        java.time.ZonedDateTime zonedDateTime16 = java.time.ZonedDateTime.now(zoneId14);
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime16.withYear((int) (short) 1);
        boolean boolean19 = zonedDateTime13.equals((java.lang.Object) zonedDateTime18);
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.lang.String str21 = zoneId20.getId();
        java.time.ZonedDateTime zonedDateTime22 = java.time.ZonedDateTime.now(zoneId20);
        java.time.ZoneId zoneId23 = java.time.ZoneId.systemDefault();
        java.lang.String str24 = zoneId23.getId();
        java.time.ZonedDateTime zonedDateTime25 = zonedDateTime22.withZoneSameInstant(zoneId23);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap26 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology27 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean28 = strMapMap26.containsKey((java.lang.Object) isoChronology27);
        java.time.Duration duration29 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal30 = null;
        java.time.temporal.Temporal temporal31 = duration29.subtractFrom(temporal30);
        long long32 = duration29.toDays();
        boolean boolean33 = strMapMap26.contains((java.lang.Object) duration29);
        java.time.format.DateTimeFormatter dateTimeFormatter34 = java.time.format.DateTimeFormatter.BASIC_ISO_DATE;
        java.lang.Cloneable cloneable35 = strMapMap26.get((java.lang.Object) dateTimeFormatter34);
        java.lang.String str36 = dateTimeFormatter34.toString();
        java.lang.String str37 = zonedDateTime25.format(dateTimeFormatter34);
        java.time.ZonedDateTime[] zonedDateTimeArray38 = new java.time.ZonedDateTime[] { zonedDateTime13, zonedDateTime25 };
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime[] zonedDateTimeArray39 = strSet2.toArray(zonedDateTimeArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 171 + "'", int3 == 171);
        org.junit.Assert.assertEquals(locale6.toString(), "decimalstyle[0+-.]_DI");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Etc/UTC" + "'", str9, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Etc/UTC" + "'", str12, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Etc/UTC" + "'", str15, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Etc/UTC" + "'", str21, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Etc/UTC" + "'", str24, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(isoChronology27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNull(temporal31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(cloneable35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ParseCaseSensitive(false)Value(Year,4)Value(MonthOfYear,2)Value(DayOfMonth,2)[Offset(+HHMMss,'Z')]" + "'", str36, "ParseCaseSensitive(false)Value(Year,4)Value(MonthOfYear,2)Value(DayOfMonth,2)[Offset(+HHMMss,'Z')]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "20220221Z" + "'", str37, "20220221Z");
        org.junit.Assert.assertNotNull(zonedDateTimeArray38);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.sorted();
        java.util.OptionalDouble optionalDouble3 = doubleStream2.findAny();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble4 = doubleStream2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(optionalDouble3);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.time.Month month0 = java.time.Month.JANUARY;
        java.time.Month month1 = month0.firstMonthOfQuarter();
        java.time.Month month3 = month1.plus((long) 'x');
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = month1.getLong((java.time.temporal.TemporalField) chronoField4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JANUARY + "'", month0.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.JANUARY + "'", month1.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + month3 + "' != '" + java.time.Month.JANUARY + "'", month3.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField4.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.Duration duration6 = java.time.Duration.ZERO;
        java.time.LocalDate localDate7 = localDate5.plus((java.time.temporal.TemporalAmount) duration6);
        java.time.LocalDateTime localDateTime8 = localDate7.atStartOfDay();
        java.time.temporal.TemporalUnit temporalUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime11 = localDateTime8.minus(1645434841L, temporalUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.time.Duration duration2 = java.time.Duration.ofSeconds((long) (-34), (long) 1024);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.time.chrono.IsoEra isoEra3 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate6 = isoChronology1.dateYearDay((java.time.chrono.Era) isoEra3, (-1), 10);
        java.time.temporal.TemporalUnit temporalUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate9 = localDate6.minus((long) '.', temporalUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + isoEra3 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra3.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        java.util.stream.IntStream intStream4 = intStream3.distinct();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt5 = intStream3.min();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = byteBuffer15.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        java.net.InetAddress inetAddress21 = java.net.InetAddress.getByAddress(byteArray20);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer15.put(byteArray20, (int) '\000', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = byteBuffer15.putInt(37, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0, 0, 100]");
        org.junit.Assert.assertNotNull(inetAddress21);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        long[] longArray1 = longStream0.toArray();
        java.util.function.LongToDoubleFunction longToDoubleFunction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = longStream0.mapToDouble(longToDoubleFunction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        boolean boolean10 = localDateTime4.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MAX;
        java.lang.String str14 = zoneOffset13.getId();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset13);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.lang.String str19 = zoneOffset18.getId();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset18);
        boolean boolean21 = localDateTime15.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime20);
        java.time.format.DateTimeFormatter dateTimeFormatter22 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.lang.String str23 = localDateTime20.format(dateTimeFormatter22);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        int int25 = localDateTime20.get((java.time.temporal.TemporalField) chronoField24);
        boolean boolean26 = localDateTime9.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime20);
        java.lang.String str27 = localDateTime20.toString();
        java.time.chrono.Chronology chronology28 = localDateTime20.getChronology();
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.util.Locale locale30 = java.util.Locale.UK;
        java.lang.String str31 = locale30.toLanguageTag();
        java.lang.String str32 = chronoField29.getDisplayName(locale30);
        java.time.LocalDateTime localDateTime34 = localDateTime20.with((java.time.temporal.TemporalField) chronoField29, (long) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = localDateTime20.isAfter(localDateChronoLocalDateTime35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+18:00" + "'", str14, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+18:00" + "'", str19, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01T18:01:37.00000012" + "'", str23, "1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField24.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T18:01:37.000000120" + "'", str27, "1970-01-01T18:01:37.000000120");
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField29.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en-GB" + "'", str31, "en-GB");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AlignedWeekOfYear" + "'", str32, "AlignedWeekOfYear");
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap3 = java.nio.charset.Charset.availableCharsets();
        boolean boolean4 = strMap3.isEmpty();
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.Cloneable cloneable8 = strMapMap0.put(strMap3, (java.lang.Cloneable) locale6);
        int int9 = strMap3.size();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap12 = strMap3.subMap("DecimalStyle[0+-.]", "{}");
        java.util.Collection<java.nio.charset.Charset> charsetCollection13 = strMap12.values();
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stati Uniti" + "'", str7, "Stati Uniti");
        org.junit.Assert.assertNull(cloneable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 171 + "'", int9 == 171);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(charsetCollection13);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.nio.CharBuffer charBuffer2 = java.nio.CharBuffer.allocate(16);
        int int3 = charBuffer2.limit();
        char char4 = charBuffer2.get();
        char[] charArray9 = new char[] { 'x', 'a', '4', '.' };
        java.nio.CharBuffer charBuffer10 = charBuffer2.get(charArray9);
        java.time.temporal.TemporalQuery[] temporalQueryArray12 = new java.time.temporal.TemporalQuery[0];
        @SuppressWarnings("unchecked")
        java.time.temporal.TemporalQuery<?>[] wildcardTemporalQueryArray13 = (java.time.temporal.TemporalQuery<?>[]) temporalQueryArray12;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor14 = dateTimeFormatter0.parseBest((java.lang.CharSequence) charBuffer10, (java.time.temporal.TemporalQuery<?>[]) temporalQueryArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least two queries must be specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(charBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(temporalQueryArray12);
        org.junit.Assert.assertNotNull(wildcardTemporalQueryArray13);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.net.URLConnection.setDefaultAllowUserInteraction(true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress1 = java.net.InetAddress.getByName("java.text.AttributedCharacterIterator$Attribute(reading)");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: java.text.AttributedCharacterIterator$Attribute(reading): Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.MAX;
        java.lang.String str4 = zoneOffset3.getId();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset3);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        boolean boolean7 = localDateTime5.isSupported((java.time.temporal.TemporalField) chronoField6);
        java.time.chrono.IsoChronology isoChronology8 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra10 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate13 = isoChronology8.dateYearDay((java.time.chrono.Era) isoEra10, 0, 16);
        java.time.LocalTime localTime14 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime15 = localDate13.atTime(localTime14);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray18 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList19 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, zoneOffsetTransitionArray18);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray21 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList22 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList22, zoneOffsetTransitionArray21);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray24 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList25 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList25, zoneOffsetTransitionRuleArray24);
        java.time.zone.ZoneRules zoneRules27 = java.time.zone.ZoneRules.of(zoneOffset16, zoneOffset17, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList22, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList25);
        long long28 = localDateTime15.toEpochSecond(zoneOffset16);
        int int29 = localDateTime5.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime15);
        java.time.ZoneId zoneId30 = java.time.ZoneId.systemDefault();
        java.lang.String str31 = zoneId30.getId();
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.now(zoneId30);
        java.time.ZonedDateTime zonedDateTime34 = zonedDateTime32.withYear((int) (short) 1);
        java.time.ZoneOffset zoneOffset37 = java.time.ZoneOffset.MAX;
        java.lang.String str38 = zoneOffset37.getId();
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset37);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.MAX;
        java.lang.String str43 = zoneOffset42.getId();
        java.time.LocalDateTime localDateTime44 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset42);
        boolean boolean45 = localDateTime39.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime44);
        java.time.format.DateTimeFormatter dateTimeFormatter46 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.lang.String str47 = localDateTime44.format(dateTimeFormatter46);
        java.time.chrono.Chronology chronology48 = dateTimeFormatter46.getChronology();
        java.time.chrono.ChronoPeriod chronoPeriod52 = chronology48.period((int) (short) 1, 0, (int) '#');
        java.time.ZonedDateTime zonedDateTime53 = zonedDateTime32.plus((java.time.temporal.TemporalAmount) chronoPeriod52);
        java.time.temporal.Temporal temporal54 = localDateTime5.adjustInto((java.time.temporal.Temporal) zonedDateTime32);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime56 = chronoField0.adjustInto(zonedDateTime32, (long) 13);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for AlignedDayOfWeekInYear (valid values 1 - 7): 13");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+18:00" + "'", str4, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField6.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(isoChronology8);
        org.junit.Assert.assertTrue("'" + isoEra10 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra10.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zoneRules27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-62134279201L) + "'", long28 == (-62134279201L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1969 + "'", int29 == 1969);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Etc/UTC" + "'", str31, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertNotNull(zoneOffset37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+18:00" + "'", str38, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+18:00" + "'", str43, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01T18:01:37.00000012" + "'", str47, "1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(chronoPeriod52);
        org.junit.Assert.assertNotNull(zonedDateTime53);
        org.junit.Assert.assertNotNull(temporal54);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.time.format.DecimalStyle decimalStyle0 = java.time.format.DecimalStyle.STANDARD;
        char char1 = decimalStyle0.getZeroDigit();
        java.time.format.DecimalStyle decimalStyle3 = decimalStyle0.withZeroDigit('a');
        java.lang.String str4 = decimalStyle3.toString();
        org.junit.Assert.assertNotNull(decimalStyle0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
        org.junit.Assert.assertNotNull(decimalStyle3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DecimalStyle[a+-.]" + "'", str4, "DecimalStyle[a+-.]");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        java.time.Period period11 = isoChronology6.period((int) (short) 10, (int) '0', 4);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList12 = period11.getUnits();
        java.time.chrono.ChronoPeriod chronoPeriod13 = period11.negated();
        java.time.chrono.IsoChronology isoChronology14 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra16 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate19 = isoChronology14.dateYearDay((java.time.chrono.Era) isoEra16, 0, 16);
        java.time.LocalTime localTime20 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime21 = localDate19.atTime(localTime20);
        java.time.DayOfWeek dayOfWeek22 = localDate19.getDayOfWeek();
        java.time.chrono.IsoChronology isoChronology23 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra25 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate28 = isoChronology23.dateYearDay((java.time.chrono.Era) isoEra25, 0, 16);
        java.time.LocalTime localTime29 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime30 = localDate28.atTime(localTime29);
        java.time.LocalDate localDate32 = localDate28.withMonth(1);
        java.time.Period period33 = localDate19.until((java.time.chrono.ChronoLocalDate) localDate28);
        java.time.Period period34 = period11.plus((java.time.temporal.TemporalAmount) period33);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap35 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap36 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology37 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean38 = strMapMap36.containsKey((java.lang.Object) isoChronology37);
        java.time.Duration duration39 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal40 = null;
        java.time.temporal.Temporal temporal41 = duration39.subtractFrom(temporal40);
        long long42 = duration39.toDays();
        boolean boolean43 = strMapMap36.contains((java.lang.Object) duration39);
        java.lang.Cloneable cloneable44 = strMapMap35.get((java.lang.Object) duration39);
        java.time.Duration duration45 = java.time.Duration.ZERO;
        java.time.Duration duration46 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal47 = null;
        java.time.temporal.Temporal temporal48 = duration46.subtractFrom(temporal47);
        long long49 = duration46.toDays();
        java.time.Duration duration50 = duration45.plus(duration46);
        long long51 = duration46.toDays();
        java.time.Duration duration52 = duration39.plus(duration46);
        java.time.Duration duration54 = duration52.plusMinutes(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod55 = period34.minus((java.time.temporal.TemporalAmount) duration52);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(temporalUnitList12);
        org.junit.Assert.assertNotNull(chronoPeriod13);
        org.junit.Assert.assertNotNull(isoChronology14);
        org.junit.Assert.assertTrue("'" + isoEra16 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra16.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + dayOfWeek22 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek22.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertNotNull(isoChronology23);
        org.junit.Assert.assertTrue("'" + isoEra25 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra25.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(isoChronology37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNull(temporal41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(cloneable44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNull(temporal48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration54);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        int int6 = byteBuffer5.arrayOffset();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ShortBuffer shortBuffer8 = shortBuffer7.slice();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology15 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean16 = byteBuffer14.equals((java.lang.Object) isoChronology15);
        boolean boolean17 = byteBuffer14.hasArray();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray20, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer14.put(byteBuffer23);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer24.duplicate();
        boolean boolean26 = shortBuffer7.equals((java.lang.Object) byteBuffer25);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.wrap(byteArray29, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer33 = byteBuffer25.put(byteArray29);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(isoChronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer32);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.Properties properties1 = null;
        java.util.Properties properties2 = new java.util.Properties(properties1);
        java.time.ZoneId zoneId3 = java.time.ZoneId.systemDefault();
        java.lang.String str4 = zoneId3.getId();
        java.time.ZonedDateTime zonedDateTime5 = java.time.ZonedDateTime.now(zoneId3);
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.withYear((int) (short) 1);
        java.time.LocalTime localTime8 = zonedDateTime7.toLocalTime();
        java.util.stream.DoubleStream doubleStream10 = java.util.stream.DoubleStream.of(0.0d);
        java.lang.Object obj11 = properties2.getOrDefault((java.lang.Object) zonedDateTime7, (java.lang.Object) doubleStream10);
        java.net.URI uRI16 = new java.net.URI("italiano", "Etc/UTC", "", "Etc/UTC");
        java.net.URI uRI17 = uRI16.normalize();
        java.lang.String str18 = uRI17.getRawSchemeSpecificPart();
        boolean boolean19 = zonedDateTime7.equals((java.lang.Object) uRI17);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap20 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology21 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean22 = strMapMap20.containsKey((java.lang.Object) isoChronology21);
        java.time.Duration duration23 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal24 = null;
        java.time.temporal.Temporal temporal25 = duration23.subtractFrom(temporal24);
        long long26 = duration23.toDays();
        boolean boolean27 = strMapMap20.contains((java.lang.Object) duration23);
        java.time.format.DateTimeFormatter dateTimeFormatter28 = java.time.format.DateTimeFormatter.BASIC_ISO_DATE;
        java.lang.Cloneable cloneable29 = strMapMap20.get((java.lang.Object) dateTimeFormatter28);
        java.lang.String str30 = zonedDateTime7.format(dateTimeFormatter28);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime31 = java.time.OffsetTime.parse((java.lang.CharSequence) "hi!", dateTimeFormatter28);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Etc/UTC" + "'", str4, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(uRI17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//Etc/UTC" + "'", str18, "//Etc/UTC");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(isoChronology21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNull(temporal25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(cloneable29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00010221Z" + "'", str30, "00010221Z");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.Spliterator<java.lang.Long> longSpliterator1 = longStream0.spliterator();
        java.util.stream.LongStream longStream2 = longStream0.sequential();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalLong optionalLong3 = longStream2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longSpliterator1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.lang.String str2 = properties1.toString();
        boolean boolean3 = properties1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.OffsetTime offsetTime13 = localTime0.atOffset(zoneOffset1);
        java.lang.String str14 = offsetTime13.toString();
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap15 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology16 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean17 = strMapMap15.containsKey((java.lang.Object) isoChronology16);
        java.time.chrono.IsoEra isoEra18 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate21 = isoChronology16.dateYearDay((java.time.chrono.Era) isoEra18, (-1), 10);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray24, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology28 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean29 = byteBuffer27.equals((java.lang.Object) isoChronology28);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap30 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology31 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean32 = strMapMap30.containsKey((java.lang.Object) isoChronology31);
        java.time.chrono.IsoEra isoEra33 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate36 = isoChronology31.dateYearDay((java.time.chrono.Era) isoEra33, (-1), 10);
        int int38 = isoChronology28.prolepticYear((java.time.chrono.Era) isoEra33, (int) '#');
        java.time.LocalDate localDate41 = isoChronology16.dateYearDay((java.time.chrono.Era) isoEra33, (int) (byte) 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime42 = offsetTime13.with((java.time.temporal.TemporalAdjuster) isoEra33);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Era");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "23:59:59.999999999+18:00" + "'", str14, "23:59:59.999999999+18:00");
        org.junit.Assert.assertNotNull(isoChronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + isoEra18 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra18.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(isoChronology28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(isoChronology31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + isoEra33 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra33.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-34) + "'", int38 == (-34));
        org.junit.Assert.assertNotNull(localDate41);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.OptionalInt optionalInt2 = intStream1.max();
        java.util.function.IntSupplier intSupplier3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = optionalInt2.orElseGet(intSupplier3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt2);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.Spliterator<java.lang.Long> longSpliterator1 = longStream0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<? super java.lang.Long> wildcardComparator2 = longSpliterator1.getComparator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longSpliterator1);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer5.putInt((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("AlignedWeekOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: l");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.stream.IntStream intStream0 = java.util.stream.IntStream.empty();
        java.util.function.IntUnaryOperator intUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream2 = intStream0.map(intUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) (short) 1, (long) 10);
        longStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.Long> longItor4 = longStream2.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(1);
        // The following exception was thrown during execution in test generation
        try {
            short short2 = byteBuffer1.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray2 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList3 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, zoneOffsetTransitionArray2);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray8 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9, zoneOffsetTransitionRuleArray8);
        java.time.zone.ZoneRules zoneRules11 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9);
        boolean boolean12 = zoneRules11.isFixedOffset();
        java.time.Instant instant13 = null;
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition14 = zoneRules11.previousTransition(instant13);
        java.util.List<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList15 = zoneRules11.getTransitionRules();
        java.time.Instant instant16 = null;
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition17 = zoneRules11.previousTransition(instant16);
        java.time.Instant instant18 = java.time.Instant.MAX;
        java.time.Instant instant20 = instant18.plusNanos((long) (short) -1);
        java.time.ZoneOffset zoneOffset21 = zoneRules11.getOffset(instant20);
        java.time.temporal.TemporalUnit temporalUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant24 = instant20.minus((long) (short) -1, temporalUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(zoneOffsetTransition14);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleList15);
        org.junit.Assert.assertNull(zoneOffsetTransition17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(zoneOffset21);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        int int9 = byteBuffer5.remaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.put((byte) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.time.Instant instant2 = java.time.Instant.ofEpochSecond((long) '4', (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.from((java.time.temporal.TemporalAccessor) instant2);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: 1970-01-01T00:00:52.000000032Z of type java.time.Instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("DecimalStyle[0+-.]");
        printWriter1.println("hi!");
        printWriter1.close();
        printWriter1.println(1L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException();
        java.io.IOException iOException2 = new java.io.IOException("DecimalStyle[a+-.]", (java.lang.Throwable) generalSecurityException1);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress7 = java.net.InetAddress.getByAddress("/UTC", byteArray3);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.malformedForLength((int) '#');
        org.junit.Assert.assertNotNull(coderResult1);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        boolean boolean2 = offsetTime0.isSupported(temporalUnit1);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        java.util.stream.IntStream intStream4 = intStream3.distinct();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = intStream4.onClose(runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap8 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology9 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean10 = strMapMap8.containsKey((java.lang.Object) isoChronology9);
        java.time.chrono.IsoEra isoEra11 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate14 = isoChronology9.dateYearDay((java.time.chrono.Era) isoEra11, (-1), 10);
        int int16 = isoChronology6.prolepticYear((java.time.chrono.Era) isoEra11, (int) '#');
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap17 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.format.ResolverStyle resolverStyle19 = dateTimeFormatter18.getResolverStyle();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate20 = isoChronology6.resolveDate(temporalFieldMap17, resolverStyle19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(isoChronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + isoEra11 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra11.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-34) + "'", int16 == (-34));
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + resolverStyle19 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle19.equals(java.time.format.ResolverStyle.STRICT));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj2 = charBuffer1.array();
        boolean boolean3 = charBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer6 = charBuffer1.put((int) '4', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj2 = charBuffer1.array();
        java.nio.ByteOrder byteOrder3 = charBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period4 = java.time.Period.parse((java.lang.CharSequence) charBuffer1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.OffsetTime offsetTime13 = localTime0.atOffset(zoneOffset1);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange15 = offsetTime13.range((java.time.temporal.TemporalField) chronoField14);
        java.time.Duration duration16 = java.time.Duration.ZERO;
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal18 = null;
        java.time.temporal.Temporal temporal19 = duration17.subtractFrom(temporal18);
        long long20 = duration17.toDays();
        java.time.Duration duration21 = duration16.minus(duration17);
        java.time.OffsetTime offsetTime22 = offsetTime13.minus((java.time.temporal.TemporalAmount) duration17);
        java.time.LocalTime localTime23 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray26 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList27, zoneOffsetTransitionArray26);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray29 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList30 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, zoneOffsetTransitionArray29);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray32 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList33, zoneOffsetTransitionRuleArray32);
        java.time.zone.ZoneRules zoneRules35 = java.time.zone.ZoneRules.of(zoneOffset24, zoneOffset25, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList27, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList33);
        java.time.OffsetTime offsetTime36 = localTime23.atOffset(zoneOffset24);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange38 = offsetTime36.range((java.time.temporal.TemporalField) chronoField37);
        java.time.Duration duration39 = java.time.Duration.ZERO;
        java.time.Duration duration40 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal41 = null;
        java.time.temporal.Temporal temporal42 = duration40.subtractFrom(temporal41);
        long long43 = duration40.toDays();
        java.time.Duration duration44 = duration39.minus(duration40);
        java.time.OffsetTime offsetTime45 = offsetTime36.minus((java.time.temporal.TemporalAmount) duration40);
        boolean boolean46 = offsetTime22.isAfter(offsetTime36);
        java.time.OffsetTime offsetTime48 = offsetTime22.withNano((int) '#');
        java.time.LocalTime localTime49 = java.time.LocalTime.MAX;
        java.time.LocalTime localTime51 = localTime49.plusMinutes((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal52 = offsetTime48.adjustInto((java.time.temporal.Temporal) localTime51);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(temporal19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneRules35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField37.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNull(temporal42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(offsetTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(offsetTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime51);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.sorted();
        java.util.stream.DoubleStream.Builder builder3 = java.util.stream.DoubleStream.builder();
        java.util.stream.DoubleStream doubleStream4 = doubleStream2.peek((java.util.function.DoubleConsumer) builder3);
        java.util.function.DoublePredicate doublePredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = doubleStream4.filter(doublePredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isMCSiteLocal();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        java.util.stream.DoubleStream doubleStream4 = intStream3.asDoubleStream();
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.allocate(16);
        int int7 = charBuffer6.limit();
        java.util.stream.IntStream intStream8 = charBuffer6.chars();
        java.util.stream.DoubleStream doubleStream9 = intStream8.asDoubleStream();
        java.util.stream.DoubleStream doubleStream10 = java.util.stream.DoubleStream.concat(doubleStream4, doubleStream9);
        java.util.function.DoubleToLongFunction doubleToLongFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = doubleStream4.mapToLong(doubleToLongFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.security.Provider provider0 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "599b081c1808", "java.util.concurrent.ExecutionException: java.nio.channels.AsynchronousCloseException", "DecimalStyle[a+-.]", "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", "java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0]", "", "0001-01-16", "en-GB", "iso8601", "italiano://Etc/UTC#Etc/UTC", "java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0]", "AM/PM", "ISO", "0001-01-16T23:59:59.999999999", "iso8601", "italiano", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = java.time.ZoneId.SHORT_IDS;
        // The following exception was thrown during execution in test generation
        try {
            java.security.Provider.Service service25 = new java.security.Provider.Service(provider0, "Di", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", (java.util.List<java.lang.String>) strList22, strMap24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strSet3.add("Optional.empty");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Stati Uniti" + "'", str2, "Stati Uniti");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        long[] longArray1 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer2 = java.nio.LongBuffer.wrap(longArray1);
        long[] longArray4 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer5 = java.nio.LongBuffer.wrap(longArray4);
        java.nio.LongBuffer longBuffer6 = longBuffer2.put(longBuffer5);
        long[] longArray8 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer9 = java.nio.LongBuffer.wrap(longArray8);
        long[] longArray11 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer12 = java.nio.LongBuffer.wrap(longArray11);
        java.nio.LongBuffer longBuffer13 = longBuffer9.put(longBuffer12);
        java.nio.LongBuffer longBuffer14 = longBuffer9.duplicate();
        boolean boolean15 = longBuffer9.isDirect();
        java.nio.LongBuffer longBuffer16 = longBuffer9.duplicate();
        int int17 = longBuffer2.compareTo(longBuffer16);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[10]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(longBuffer6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10]");
        org.junit.Assert.assertNotNull(longBuffer9);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[10]");
        org.junit.Assert.assertNotNull(longBuffer12);
        org.junit.Assert.assertNotNull(longBuffer13);
        org.junit.Assert.assertNotNull(longBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(10, 0.0f, (float) 37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        int int6 = byteBuffer5.arrayOffset();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer10 = shortBuffer7.put((int) (byte) -1, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortBuffer7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(256);
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.allocate(256);
        java.nio.FloatBuffer floatBuffer4 = floatBuffer3.slice();
        java.nio.FloatBuffer floatBuffer5 = floatBuffer1.put(floatBuffer3);
        java.nio.FloatBuffer floatBuffer6 = floatBuffer3.compact();
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(floatBuffer5);
        org.junit.Assert.assertNotNull(floatBuffer6);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        java.nio.Buffer buffer8 = byteBuffer5.mark();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = byteBuffer5.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(buffer8);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.format.ResolverStyle resolverStyle1 = dateTimeFormatter0.getResolverStyle();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor3 = dateTimeFormatter0.parse((java.lang.CharSequence) "/UTC");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '/UTC' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + resolverStyle1 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle1.equals(java.time.format.ResolverStyle.STRICT));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_INSTANT;
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap2 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology3 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean4 = strMapMap2.containsKey((java.lang.Object) isoChronology3);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap5 = java.nio.charset.Charset.availableCharsets();
        boolean boolean6 = strMap5.isEmpty();
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.Cloneable cloneable10 = strMapMap2.put(strMap5, (java.lang.Cloneable) locale8);
        java.lang.String str11 = locale1.getDisplayVariant(locale8);
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale8.getDisplayName(locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(isoChronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Stati Uniti" + "'", str9, "Stati Uniti");
        org.junit.Assert.assertNull(cloneable10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.isReadOnly();
        java.nio.CharBuffer charBuffer10 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj11 = charBuffer10.array();
        java.nio.ByteOrder byteOrder12 = charBuffer10.order();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.order(byteOrder12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer13.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putShort((short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.net.URLConnection.setDefaultRequestProperty("599b081c1808", "ClockHourOfDay");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.lang.String str13 = zoneOffset12.getId();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset12);
        boolean boolean15 = localDateTime9.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        boolean boolean16 = localDateTime4.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray20 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, zoneOffsetTransitionArray20);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray23 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList24 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, zoneOffsetTransitionArray23);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray26 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27, zoneOffsetTransitionRuleArray26);
        java.time.zone.ZoneRules zoneRules29 = java.time.zone.ZoneRules.of(zoneOffset18, zoneOffset19, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray32 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, zoneOffsetTransitionArray32);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray35 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList36 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, zoneOffsetTransitionArray35);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray38 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList39 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39, zoneOffsetTransitionRuleArray38);
        java.time.zone.ZoneRules zoneRules41 = java.time.zone.ZoneRules.of(zoneOffset30, zoneOffset31, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray44 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList45 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, zoneOffsetTransitionArray44);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray47 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList48 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, zoneOffsetTransitionArray47);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray50 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList51 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51, zoneOffsetTransitionRuleArray50);
        java.time.zone.ZoneRules zoneRules53 = java.time.zone.ZoneRules.of(zoneOffset42, zoneOffset43, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51);
        boolean boolean54 = zoneOffsetTransitionList33.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48);
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset56 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray57 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList58 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, zoneOffsetTransitionArray57);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray60 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList61 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, zoneOffsetTransitionArray60);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray63 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList64 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64, zoneOffsetTransitionRuleArray63);
        java.time.zone.ZoneRules zoneRules66 = java.time.zone.ZoneRules.of(zoneOffset55, zoneOffset56, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64);
        int int68 = zoneOffsetTransitionList61.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset69 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset70 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray71 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList72 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, zoneOffsetTransitionArray71);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray74 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList75 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, zoneOffsetTransitionArray74);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray77 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList78 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78, zoneOffsetTransitionRuleArray77);
        java.time.zone.ZoneRules zoneRules80 = java.time.zone.ZoneRules.of(zoneOffset69, zoneOffset70, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.zone.ZoneRules zoneRules81 = java.time.zone.ZoneRules.of(zoneOffset17, zoneOffset18, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.ZoneOffset zoneOffset84 = java.time.ZoneOffset.MAX;
        java.lang.String str85 = zoneOffset84.getId();
        java.time.LocalDateTime localDateTime86 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset84);
        int int87 = zoneOffset18.compareTo(zoneOffset84);
        java.time.OffsetDateTime offsetDateTime88 = java.time.OffsetDateTime.of(localDateTime9, zoneOffset18);
        java.time.LocalTime localTime89 = offsetDateTime88.toLocalTime();
        java.time.DayOfWeek dayOfWeek90 = offsetDateTime88.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime92 = offsetDateTime88.plusWeeks(31556889864403199L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -26519564042595");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+18:00" + "'", str13, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(zoneRules41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(zoneRules53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertNotNull(zoneOffset56);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(zoneRules66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset69);
        org.junit.Assert.assertNotNull(zoneOffset70);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(zoneRules80);
        org.junit.Assert.assertNotNull(zoneRules81);
        org.junit.Assert.assertNotNull(zoneOffset84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+18:00" + "'", str85, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(offsetDateTime88);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertTrue("'" + dayOfWeek90 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek90.equals(java.time.DayOfWeek.THURSDAY));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.time.LocalTime localTime1 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray4 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList5 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList5, zoneOffsetTransitionArray4);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray7 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList8 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList8, zoneOffsetTransitionArray7);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray10 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList11 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList11, zoneOffsetTransitionRuleArray10);
        java.time.zone.ZoneRules zoneRules13 = java.time.zone.ZoneRules.of(zoneOffset2, zoneOffset3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList5, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList8, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList11);
        java.time.OffsetTime offsetTime14 = localTime1.atOffset(zoneOffset2);
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange16 = offsetTime14.range((java.time.temporal.TemporalField) chronoField15);
        java.time.OffsetTime offsetTime18 = chronoField0.adjustInto(offsetTime14, (long) 16);
        java.net.URI uRI23 = new java.net.URI("italiano", "Etc/UTC", "", "Etc/UTC");
        java.net.URI uRI24 = uRI23.normalize();
        java.net.URI uRI29 = new java.net.URI("italiano", "Etc/UTC", "", "Etc/UTC");
        java.net.URI uRI30 = uRI29.normalize();
        java.lang.String str31 = uRI30.getRawPath();
        java.lang.String str32 = uRI30.getFragment();
        java.net.URI uRI33 = uRI23.resolve(uRI30);
        java.lang.String str34 = uRI23.toString();
        boolean boolean35 = offsetTime14.equals((java.lang.Object) str34);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneRules13);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField15.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(uRI24);
        org.junit.Assert.assertNotNull(uRI30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "/UTC" + "'", str31, "/UTC");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Etc/UTC" + "'", str32, "Etc/UTC");
        org.junit.Assert.assertNotNull(uRI33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "italiano://Etc/UTC#Etc/UTC" + "'", str34, "italiano://Etc/UTC#Etc/UTC");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.OffsetTime offsetTime13 = localTime0.atOffset(zoneOffset1);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange15 = offsetTime13.range((java.time.temporal.TemporalField) chronoField14);
        java.time.Duration duration16 = java.time.Duration.ZERO;
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal18 = null;
        java.time.temporal.Temporal temporal19 = duration17.subtractFrom(temporal18);
        long long20 = duration17.toDays();
        java.time.Duration duration21 = duration16.minus(duration17);
        java.time.OffsetTime offsetTime22 = offsetTime13.minus((java.time.temporal.TemporalAmount) duration17);
        java.time.LocalTime localTime23 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray26 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList27, zoneOffsetTransitionArray26);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray29 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList30 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, zoneOffsetTransitionArray29);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray32 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList33, zoneOffsetTransitionRuleArray32);
        java.time.zone.ZoneRules zoneRules35 = java.time.zone.ZoneRules.of(zoneOffset24, zoneOffset25, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList27, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList33);
        java.time.OffsetTime offsetTime36 = localTime23.atOffset(zoneOffset24);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange38 = offsetTime36.range((java.time.temporal.TemporalField) chronoField37);
        java.time.Duration duration39 = java.time.Duration.ZERO;
        java.time.Duration duration40 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal41 = null;
        java.time.temporal.Temporal temporal42 = duration40.subtractFrom(temporal41);
        long long43 = duration40.toDays();
        java.time.Duration duration44 = duration39.minus(duration40);
        java.time.OffsetTime offsetTime45 = offsetTime36.minus((java.time.temporal.TemporalAmount) duration40);
        boolean boolean46 = offsetTime22.isAfter(offsetTime36);
        java.time.LocalTime localTime47 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset48 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset49 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray50 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList51 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList51, zoneOffsetTransitionArray50);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray53 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList54 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList54, zoneOffsetTransitionArray53);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray56 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList57 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList57, zoneOffsetTransitionRuleArray56);
        java.time.zone.ZoneRules zoneRules59 = java.time.zone.ZoneRules.of(zoneOffset48, zoneOffset49, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList51, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList54, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList57);
        java.time.OffsetTime offsetTime60 = localTime47.atOffset(zoneOffset48);
        java.time.temporal.ChronoField chronoField61 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange62 = offsetTime60.range((java.time.temporal.TemporalField) chronoField61);
        java.time.temporal.ChronoField chronoField63 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        boolean boolean64 = offsetTime60.isSupported((java.time.temporal.TemporalField) chronoField63);
        boolean boolean65 = offsetTime22.isAfter(offsetTime60);
        java.time.temporal.TemporalUnit temporalUnit66 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime67 = offsetTime60.truncatedTo(temporalUnit66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(temporal19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneRules35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField37.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNull(temporal42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(offsetTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(zoneOffset48);
        org.junit.Assert.assertNotNull(zoneOffset49);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(zoneRules59);
        org.junit.Assert.assertNotNull(offsetTime60);
        org.junit.Assert.assertTrue("'" + chronoField61 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField61.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange62);
        org.junit.Assert.assertTrue("'" + chronoField63 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField63.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(256);
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.allocate(256);
        java.nio.FloatBuffer floatBuffer4 = floatBuffer3.slice();
        java.nio.FloatBuffer floatBuffer5 = floatBuffer1.put(floatBuffer3);
        float[] floatArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer7 = floatBuffer1.get(floatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(floatBuffer5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray15 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList16 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, zoneOffsetTransitionArray15);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray18 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList19 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, zoneOffsetTransitionArray18);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray21 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList22 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList22, zoneOffsetTransitionRuleArray21);
        java.time.zone.ZoneRules zoneRules24 = java.time.zone.ZoneRules.of(zoneOffset13, zoneOffset14, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList22);
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray27 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList28 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList28, zoneOffsetTransitionArray27);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray30 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList31 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, zoneOffsetTransitionArray30);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray33 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList34 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList34, zoneOffsetTransitionRuleArray33);
        java.time.zone.ZoneRules zoneRules36 = java.time.zone.ZoneRules.of(zoneOffset25, zoneOffset26, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList28, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList34);
        boolean boolean37 = zoneOffsetTransitionList16.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset39 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray40 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList41 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList41, zoneOffsetTransitionArray40);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray43 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList44 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList44, zoneOffsetTransitionArray43);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray46 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList47 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList47, zoneOffsetTransitionRuleArray46);
        java.time.zone.ZoneRules zoneRules49 = java.time.zone.ZoneRules.of(zoneOffset38, zoneOffset39, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList41, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList44, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList47);
        int int51 = zoneOffsetTransitionList44.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset52 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset53 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray54 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList55 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList55, zoneOffsetTransitionArray54);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray57 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList58 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, zoneOffsetTransitionArray57);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray60 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList61 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList61, zoneOffsetTransitionRuleArray60);
        java.time.zone.ZoneRules zoneRules63 = java.time.zone.ZoneRules.of(zoneOffset52, zoneOffset53, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList55, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList61);
        java.time.zone.ZoneRules zoneRules64 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList44, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList61);
        java.time.temporal.ChronoField chronoField65 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        // The following exception was thrown during execution in test generation
        try {
            int int66 = zoneOffset0.get((java.time.temporal.TemporalField) chronoField65);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MicroOfSecond");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneRules24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(zoneRules36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(zoneOffset39);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(zoneRules49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset52);
        org.junit.Assert.assertNotNull(zoneOffset53);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zoneRules63);
        org.junit.Assert.assertNotNull(zoneRules64);
        org.junit.Assert.assertTrue("'" + chronoField65 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField65.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.Spliterator<java.lang.Long> longSpliterator1 = longStream0.spliterator();
        java.util.stream.LongStream longStream2 = longStream0.sequential();
        java.util.stream.LongStream longStream3 = java.util.stream.LongStream.empty();
        java.util.Spliterator<java.lang.Long> longSpliterator4 = longStream3.spliterator();
        java.util.stream.LongStream longStream5 = longStream3.sequential();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = java.util.stream.LongStream.concat(longStream2, longStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longSpliterator1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longSpliterator4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (byte) 1);
        java.util.stream.IntStream intStream3 = java.util.stream.IntStream.of((int) (byte) 1);
        java.util.stream.IntStream intStream4 = java.util.stream.IntStream.concat(intStream1, intStream3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = intStream1.distinct();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.LocalTime localTime2 = localTime0.plusMinutes((long) 'x');
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        intStream3.close();
        intStream3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = intStream3.skip(1645434841L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray0 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList1 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList1, zoneOffsetTransitionArray0);
        java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream3 = zoneOffsetTransitionList1.stream();
        java.util.Optional<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionOptional4 = zoneOffsetTransitionStream3.findFirst();
        java.lang.String str5 = zoneOffsetTransitionOptional4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransition zoneOffsetTransition6 = zoneOffsetTransitionOptional4.get();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionStream3);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionOptional4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional.empty" + "'", str5, "Optional.empty");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        boolean boolean10 = localDateTime4.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.format.DateTimeFormatter dateTimeFormatter11 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.lang.String str12 = localDateTime9.format(dateTimeFormatter11);
        java.time.temporal.TemporalQuery<?> wildcardTemporalQuery14 = null;
        java.time.temporal.TemporalQuery[] temporalQueryArray16 = new java.time.temporal.TemporalQuery[1];
        @SuppressWarnings("unchecked")
        java.time.temporal.TemporalQuery<?>[] wildcardTemporalQueryArray17 = (java.time.temporal.TemporalQuery<?>[]) temporalQueryArray16;
        wildcardTemporalQueryArray17[0] = wildcardTemporalQuery14;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor20 = dateTimeFormatter11.parseBest((java.lang.CharSequence) "1970-01-01T18:01:37.000000120", wildcardTemporalQueryArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least two queries must be specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T18:01:37.00000012" + "'", str12, "1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(temporalQueryArray16);
        org.junit.Assert.assertNotNull(wildcardTemporalQueryArray17);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray0 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList1 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList1, zoneOffsetTransitionArray0);
        java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream3 = zoneOffsetTransitionList1.stream();
        java.util.Optional<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionOptional4 = zoneOffsetTransitionStream3.findFirst();
        boolean boolean5 = zoneOffsetTransitionOptional4.isPresent();
        java.security.NoSuchAlgorithmException noSuchAlgorithmException7 = new java.security.NoSuchAlgorithmException("DIRECT");
        boolean boolean8 = zoneOffsetTransitionOptional4.equals((java.lang.Object) noSuchAlgorithmException7);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionStream3);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionOptional4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = byteBuffer5.getLong((int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        long[] longArray1 = longStream0.toArray();
        java.util.function.LongPredicate longPredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = longStream0.allMatch(longPredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap3 = java.nio.charset.Charset.availableCharsets();
        boolean boolean4 = strMap3.isEmpty();
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.Cloneable cloneable8 = strMapMap0.put(strMap3, (java.lang.Cloneable) locale6);
        int int9 = strMap3.size();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.nio.charset.Charset>> strEntrySet10 = strMap3.entrySet();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap11 = java.nio.charset.Charset.availableCharsets();
        boolean boolean12 = strMap11.isEmpty();
        java.util.Set<java.lang.String> strSet13 = strMap11.keySet();
        int int14 = strMap11.size();
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset16 = strMap3.getOrDefault((java.lang.Object) strMap11, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableSortedMap cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stati Uniti" + "'", str7, "Stati Uniti");
        org.junit.Assert.assertNull(cloneable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 171 + "'", int9 == 171);
        org.junit.Assert.assertNotNull(strEntrySet10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 171 + "'", int14 == 171);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        char char0 = java.io.File.pathSeparatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ':' + "'", char0 == ':');
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        boolean boolean10 = localDateTime4.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.format.DateTimeFormatter dateTimeFormatter11 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.lang.String str12 = localDateTime9.format(dateTimeFormatter11);
        java.time.chrono.Chronology chronology13 = dateTimeFormatter11.getChronology();
        java.time.chrono.ChronoPeriod chronoPeriod17 = chronology13.period((int) (short) 1, 0, (int) '#');
        java.time.Duration duration18 = java.time.Duration.ZERO;
        java.time.Duration duration19 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal20 = null;
        java.time.temporal.Temporal temporal21 = duration19.subtractFrom(temporal20);
        long long22 = duration19.toDays();
        java.time.Duration duration23 = duration18.minus(duration19);
        java.time.Duration duration24 = duration19.negated();
        java.time.Duration duration26 = duration19.withSeconds((long) (byte) 1);
        boolean boolean27 = chronology13.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T18:01:37.00000012" + "'", str12, "1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronoPeriod17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNull(temporal21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.sorted();
        double double3 = doubleStream2.sum();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble4 = doubleStream2.findAny();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.time.Instant instant0 = java.time.Instant.MAX;
        java.time.Instant instant2 = instant0.plusNanos((long) (short) -1);
        java.time.Period period4 = java.time.Period.ofYears((int) '\000');
        java.time.chrono.ChronoPeriod chronoPeriod5 = period4.normalized();
        java.time.Month month6 = java.time.Month.JANUARY;
        java.time.Month month7 = month6.firstMonthOfQuarter();
        java.time.Month month8 = month7.firstMonthOfQuarter();
        boolean boolean9 = period4.equals((java.lang.Object) month7);
        java.time.Instant instant10 = instant2.plus((java.time.temporal.TemporalAmount) period4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = java.util.Date.from(instant10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.lang.ArithmeticException: long overflow");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(chronoPeriod5);
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.JANUARY + "'", month6.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + month7 + "' != '" + java.time.Month.JANUARY + "'", month7.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + month8 + "' != '" + java.time.Month.JANUARY + "'", month8.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) '.');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.lang.String str1 = zoneId0.getId();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId0);
        java.time.ZoneId zoneId3 = java.time.ZoneId.systemDefault();
        java.lang.String str4 = zoneId3.getId();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime2.withZoneSameInstant(zoneId3);
        long long6 = zonedDateTime2.toEpochSecond();
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) 10);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) 10);
        int int11 = localDate8.compareTo((java.time.chrono.ChronoLocalDate) localDate10);
        java.time.LocalTime localTime12 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray15 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList16 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, zoneOffsetTransitionArray15);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray18 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList19 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, zoneOffsetTransitionArray18);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray21 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList22 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList22, zoneOffsetTransitionRuleArray21);
        java.time.zone.ZoneRules zoneRules24 = java.time.zone.ZoneRules.of(zoneOffset13, zoneOffset14, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList22);
        java.time.OffsetTime offsetTime25 = localTime12.atOffset(zoneOffset13);
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray29 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList30 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, zoneOffsetTransitionArray29);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray32 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, zoneOffsetTransitionArray32);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray35 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList36 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList36, zoneOffsetTransitionRuleArray35);
        java.time.zone.ZoneRules zoneRules38 = java.time.zone.ZoneRules.of(zoneOffset27, zoneOffset28, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList36);
        java.time.ZoneOffset zoneOffset39 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray41 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList42 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList42, zoneOffsetTransitionArray41);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray44 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList45 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, zoneOffsetTransitionArray44);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray47 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList48 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList48, zoneOffsetTransitionRuleArray47);
        java.time.zone.ZoneRules zoneRules50 = java.time.zone.ZoneRules.of(zoneOffset39, zoneOffset40, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList42, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList48);
        java.time.ZoneOffset zoneOffset51 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset52 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray53 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList54 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList54, zoneOffsetTransitionArray53);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray56 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList57 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList57, zoneOffsetTransitionArray56);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray59 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList60 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList60, zoneOffsetTransitionRuleArray59);
        java.time.zone.ZoneRules zoneRules62 = java.time.zone.ZoneRules.of(zoneOffset51, zoneOffset52, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList54, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList57, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList60);
        boolean boolean63 = zoneOffsetTransitionList42.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList57);
        java.time.ZoneOffset zoneOffset64 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset65 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray66 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList67 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList67, zoneOffsetTransitionArray66);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray69 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList70 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList70, zoneOffsetTransitionArray69);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray72 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList73 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList73, zoneOffsetTransitionRuleArray72);
        java.time.zone.ZoneRules zoneRules75 = java.time.zone.ZoneRules.of(zoneOffset64, zoneOffset65, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList67, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList70, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList73);
        int int77 = zoneOffsetTransitionList70.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset78 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset79 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray80 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList81 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList81, zoneOffsetTransitionArray80);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray83 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList84 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList84, zoneOffsetTransitionArray83);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray86 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList87 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList87, zoneOffsetTransitionRuleArray86);
        java.time.zone.ZoneRules zoneRules89 = java.time.zone.ZoneRules.of(zoneOffset78, zoneOffset79, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList81, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList84, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList87);
        java.time.zone.ZoneRules zoneRules90 = java.time.zone.ZoneRules.of(zoneOffset26, zoneOffset27, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList57, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList70, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList87);
        java.time.ZoneOffset zoneOffset93 = java.time.ZoneOffset.MAX;
        java.lang.String str94 = zoneOffset93.getId();
        java.time.LocalDateTime localDateTime95 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset93);
        int int96 = zoneOffset27.compareTo(zoneOffset93);
        java.time.ZonedDateTime zonedDateTime97 = java.time.ZonedDateTime.of(localDate8, localTime12, (java.time.ZoneId) zoneOffset93);
        boolean boolean98 = zonedDateTime2.isEqual((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime97);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Etc/UTC" + "'", str4, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645434854L + "'", long6 == 1645434854L);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneRules24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneRules38);
        org.junit.Assert.assertNotNull(zoneOffset39);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(zoneRules50);
        org.junit.Assert.assertNotNull(zoneOffset51);
        org.junit.Assert.assertNotNull(zoneOffset52);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(zoneRules62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(zoneOffset64);
        org.junit.Assert.assertNotNull(zoneOffset65);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(zoneRules75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset78);
        org.junit.Assert.assertNotNull(zoneOffset79);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(zoneRules89);
        org.junit.Assert.assertNotNull(zoneRules90);
        org.junit.Assert.assertNotNull(zoneOffset93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "+18:00" + "'", str94, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap3 = java.nio.charset.Charset.availableCharsets();
        boolean boolean4 = strMap3.isEmpty();
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.Cloneable cloneable8 = strMapMap0.put(strMap3, (java.lang.Cloneable) locale6);
        int int9 = strMap3.size();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.nio.charset.Charset>> strEntrySet10 = strMap3.entrySet();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap12 = strMap3.headMap("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        java.net.URISyntaxException uRISyntaxException15 = new java.net.URISyntaxException("italiano", "");
        java.lang.String str16 = uRISyntaxException15.getReason();
        java.security.cert.CertificateException certificateException17 = new java.security.cert.CertificateException((java.lang.Throwable) uRISyntaxException15);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset18 = strMap12.remove((java.lang.Object) uRISyntaxException15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stati Uniti" + "'", str7, "Stati Uniti");
        org.junit.Assert.assertNull(cloneable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 171 + "'", int9 == 171);
        org.junit.Assert.assertNotNull(strEntrySet10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long3 = file2.lastModified();
        java.net.URL uRL4 = file2.toURL();
        java.security.CodeSigner[] codeSignerArray5 = new java.security.CodeSigner[] {};
        java.security.CodeSource codeSource6 = new java.security.CodeSource(uRL4, codeSignerArray5);
        java.lang.Class class7 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[] { class7 };
        // The following exception was thrown during execution in test generation
{ // flaky:         try {
            java.lang.Object obj9 = null; // flaky: uRL4.getContent(classArray8);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /1970-01-01T18:01:37.00000012 (No such file or directory)");
// flaky:         } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(uRL4);
        org.junit.Assert.assertEquals(uRL4.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(codeSignerArray5);
        org.junit.Assert.assertNotNull(classArray8);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        boolean boolean6 = localDateTime4.isSupported((java.time.temporal.TemporalField) chronoField5);
        java.time.chrono.IsoChronology isoChronology7 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra9 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate12 = isoChronology7.dateYearDay((java.time.chrono.Era) isoEra9, 0, 16);
        java.time.LocalTime localTime13 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime14 = localDate12.atTime(localTime13);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray17 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList18 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList18, zoneOffsetTransitionArray17);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray20 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, zoneOffsetTransitionArray20);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray23 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList24 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList24, zoneOffsetTransitionRuleArray23);
        java.time.zone.ZoneRules zoneRules26 = java.time.zone.ZoneRules.of(zoneOffset15, zoneOffset16, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList18, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList24);
        long long27 = localDateTime14.toEpochSecond(zoneOffset15);
        int int28 = localDateTime4.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        java.time.ZoneId zoneId29 = java.time.ZoneId.systemDefault();
        java.lang.String str30 = zoneId29.getId();
        java.time.ZonedDateTime zonedDateTime31 = java.time.ZonedDateTime.now(zoneId29);
        java.time.ZonedDateTime zonedDateTime33 = zonedDateTime31.withYear((int) (short) 1);
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.MAX;
        java.lang.String str37 = zoneOffset36.getId();
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset36);
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.MAX;
        java.lang.String str42 = zoneOffset41.getId();
        java.time.LocalDateTime localDateTime43 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset41);
        boolean boolean44 = localDateTime38.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime43);
        java.time.format.DateTimeFormatter dateTimeFormatter45 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.lang.String str46 = localDateTime43.format(dateTimeFormatter45);
        java.time.chrono.Chronology chronology47 = dateTimeFormatter45.getChronology();
        java.time.chrono.ChronoPeriod chronoPeriod51 = chronology47.period((int) (short) 1, 0, (int) '#');
        java.time.ZonedDateTime zonedDateTime52 = zonedDateTime31.plus((java.time.temporal.TemporalAmount) chronoPeriod51);
        java.time.temporal.Temporal temporal53 = localDateTime4.adjustInto((java.time.temporal.Temporal) zonedDateTime31);
        java.lang.String str54 = localDateTime4.toString();
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(isoChronology7);
        org.junit.Assert.assertTrue("'" + isoEra9 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra9.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneRules26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-62134279201L) + "'", long27 == (-62134279201L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1969 + "'", int28 == 1969);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Etc/UTC" + "'", str30, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+18:00" + "'", str37, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+18:00" + "'", str42, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01T18:01:37.00000012" + "'", str46, "1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(chronoPeriod51);
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertNotNull(temporal53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1970-01-01T18:01:37.000000120" + "'", str54, "1970-01-01T18:01:37.000000120");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.isReadOnly();
        java.nio.CharBuffer charBuffer10 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj11 = charBuffer10.array();
        java.nio.ByteOrder byteOrder12 = charBuffer10.order();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.order(byteOrder12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer13.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer14.putInt(37, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        boolean boolean10 = localDateTime4.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.format.DateTimeFormatter dateTimeFormatter11 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.lang.String str12 = localDateTime9.format(dateTimeFormatter11);
        java.time.chrono.Chronology chronology13 = dateTimeFormatter11.getChronology();
        java.time.chrono.IsoChronology isoChronology14 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra16 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate19 = isoChronology14.dateYearDay((java.time.chrono.Era) isoEra16, 0, 16);
        java.time.LocalTime localTime20 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime21 = localDate19.atTime(localTime20);
        java.time.LocalDate localDate23 = localDate19.withMonth(1);
        java.time.chrono.ChronoLocalDate chronoLocalDate24 = chronology13.date((java.time.temporal.TemporalAccessor) localDate19);
        java.time.temporal.TemporalUnit temporalUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate27 = chronoLocalDate24.minus((long) '#', temporalUnit26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T18:01:37.00000012" + "'", str12, "1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(isoChronology14);
        org.junit.Assert.assertTrue("'" + isoEra16 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra16.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronoLocalDate24);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.HOURS;
        java.lang.Thread thread1 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeUnit0.timedJoin(thread1, (long) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeUnit0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        java.security.AccessControlException accessControlException9 = new java.security.AccessControlException("{}");
        boolean boolean10 = byteBuffer5.equals((java.lang.Object) "{}");
        java.lang.Object obj11 = byteBuffer5.array();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Iterator<java.lang.String> strItor4 = strSet3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Stati Uniti" + "'", str2, "Stati Uniti");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strItor4);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.Clock clock1 = java.time.Clock.tickMinutes((java.time.ZoneId) zoneOffset0);
        java.time.LocalDate localDate2 = java.time.LocalDate.now(clock1);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(clock1);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Iterator<java.lang.String> strItor4 = strSet3.iterator();
        java.lang.Object[] objArray5 = strSet3.toArray();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Stati Uniti" + "'", str2, "Stati Uniti");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.nio.channels.AsynchronousCloseException asynchronousCloseException1 = new java.nio.channels.AsynchronousCloseException();
        java.util.concurrent.ExecutionException executionException2 = new java.util.concurrent.ExecutionException((java.lang.Throwable) asynchronousCloseException1);
        java.io.IOException iOException3 = new java.io.IOException("Etc/UTC", (java.lang.Throwable) executionException2);
        java.security.InvalidKeyException invalidKeyException4 = new java.security.InvalidKeyException((java.lang.Throwable) iOException3);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.lang.Object obj1 = strMapMap0.clone();
        java.lang.String str2 = strMapMap0.toString();
        java.util.Set<java.util.Map.Entry<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>> strMapEntrySet3 = strMapMap0.entrySet();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap4 = java.nio.charset.Charset.availableCharsets();
        boolean boolean5 = strMap4.isEmpty();
        java.util.Set<java.lang.String> strSet6 = strMap4.keySet();
        java.util.function.Predicate<java.time.format.ResolverStyle> resolverStylePredicate7 = java.util.function.Predicate.isEqual((java.lang.Object) strMap4);
        java.util.Locale locale8 = java.util.Locale.UK;
        java.lang.String str9 = locale8.toLanguageTag();
        java.lang.Cloneable cloneable10 = strMapMap0.replace(strMap4, (java.lang.Cloneable) locale8);
        java.time.ZoneId zoneId11 = java.time.ZoneId.systemDefault();
        java.lang.String str12 = zoneId11.getId();
        java.time.ZonedDateTime zonedDateTime13 = java.time.ZonedDateTime.now(zoneId11);
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime13.withYear((int) (short) 1);
        java.time.LocalTime localTime16 = zonedDateTime15.toLocalTime();
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.MAX;
        java.lang.String str20 = zoneOffset19.getId();
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset19);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray24 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList25 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList25, zoneOffsetTransitionArray24);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray27 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList28 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList28, zoneOffsetTransitionArray27);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray30 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList31 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList31, zoneOffsetTransitionRuleArray30);
        java.time.zone.ZoneRules zoneRules33 = java.time.zone.ZoneRules.of(zoneOffset22, zoneOffset23, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList25, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList28, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList31);
        int int34 = zoneOffset19.compareTo(zoneOffset22);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime35 = zonedDateTime15.withZoneSameLocal((java.time.ZoneId) zoneOffset19);
        java.time.ZoneId zoneId36 = java.time.ZoneId.systemDefault();
        java.lang.String str37 = zoneId36.getId();
        java.time.ZonedDateTime zonedDateTime38 = java.time.ZonedDateTime.now(zoneId36);
        java.time.ZonedDateTime zonedDateTime40 = zonedDateTime38.withDayOfMonth((int) (short) 10);
        java.time.temporal.TemporalUnit temporalUnit41 = null;
        boolean boolean42 = zonedDateTime38.isSupported(temporalUnit41);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        java.time.temporal.ValueRange valueRange44 = zonedDateTime38.range((java.time.temporal.TemporalField) chronoField43);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.LocalTime localTime46 = java.time.LocalTime.MAX;
        long long47 = chronoField45.getFrom((java.time.temporal.TemporalAccessor) localTime46);
        boolean boolean48 = zonedDateTime38.isSupported((java.time.temporal.TemporalField) chronoField45);
        boolean boolean49 = chronoField45.isDateBased();
        int int50 = zonedDateTime15.get((java.time.temporal.TemporalField) chronoField45);
        boolean boolean51 = locale8.equals((java.lang.Object) int50);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertNotNull(strMapEntrySet3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(resolverStylePredicate7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-GB" + "'", str9, "en-GB");
        org.junit.Assert.assertNull(cloneable10);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Etc/UTC" + "'", str12, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+18:00" + "'", str20, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zoneRules33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime35);
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Etc/UTC" + "'", str37, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertNotNull(zonedDateTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField43.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
        org.junit.Assert.assertNotNull(valueRange44);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField45.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 23L + "'", long47 == 23L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 9 + "'", int50 == 9);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.lang.String str13 = zoneOffset12.getId();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset12);
        boolean boolean15 = localDateTime9.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        boolean boolean16 = localDateTime4.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray20 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, zoneOffsetTransitionArray20);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray23 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList24 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, zoneOffsetTransitionArray23);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray26 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27, zoneOffsetTransitionRuleArray26);
        java.time.zone.ZoneRules zoneRules29 = java.time.zone.ZoneRules.of(zoneOffset18, zoneOffset19, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray32 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, zoneOffsetTransitionArray32);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray35 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList36 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, zoneOffsetTransitionArray35);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray38 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList39 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39, zoneOffsetTransitionRuleArray38);
        java.time.zone.ZoneRules zoneRules41 = java.time.zone.ZoneRules.of(zoneOffset30, zoneOffset31, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray44 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList45 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, zoneOffsetTransitionArray44);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray47 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList48 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, zoneOffsetTransitionArray47);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray50 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList51 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51, zoneOffsetTransitionRuleArray50);
        java.time.zone.ZoneRules zoneRules53 = java.time.zone.ZoneRules.of(zoneOffset42, zoneOffset43, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51);
        boolean boolean54 = zoneOffsetTransitionList33.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48);
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset56 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray57 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList58 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, zoneOffsetTransitionArray57);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray60 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList61 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, zoneOffsetTransitionArray60);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray63 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList64 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64, zoneOffsetTransitionRuleArray63);
        java.time.zone.ZoneRules zoneRules66 = java.time.zone.ZoneRules.of(zoneOffset55, zoneOffset56, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64);
        int int68 = zoneOffsetTransitionList61.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset69 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset70 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray71 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList72 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, zoneOffsetTransitionArray71);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray74 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList75 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, zoneOffsetTransitionArray74);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray77 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList78 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78, zoneOffsetTransitionRuleArray77);
        java.time.zone.ZoneRules zoneRules80 = java.time.zone.ZoneRules.of(zoneOffset69, zoneOffset70, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.zone.ZoneRules zoneRules81 = java.time.zone.ZoneRules.of(zoneOffset17, zoneOffset18, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.ZoneOffset zoneOffset84 = java.time.ZoneOffset.MAX;
        java.lang.String str85 = zoneOffset84.getId();
        java.time.LocalDateTime localDateTime86 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset84);
        int int87 = zoneOffset18.compareTo(zoneOffset84);
        java.time.OffsetDateTime offsetDateTime88 = java.time.OffsetDateTime.of(localDateTime9, zoneOffset18);
        java.time.LocalTime localTime89 = offsetDateTime88.toLocalTime();
        java.time.OffsetDateTime offsetDateTime91 = offsetDateTime88.withDayOfMonth((int) (byte) 10);
        java.time.OffsetDateTime offsetDateTime93 = offsetDateTime88.plusHours((long) 256);
        java.time.Duration duration94 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal95 = null;
        java.time.temporal.Temporal temporal96 = duration94.subtractFrom(temporal95);
        long long97 = duration94.toDays();
        java.time.OffsetDateTime offsetDateTime98 = offsetDateTime93.minus((java.time.temporal.TemporalAmount) duration94);
        long long99 = duration94.toMillis();
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+18:00" + "'", str13, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(zoneRules41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(zoneRules53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertNotNull(zoneOffset56);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(zoneRules66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset69);
        org.junit.Assert.assertNotNull(zoneOffset70);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(zoneRules80);
        org.junit.Assert.assertNotNull(zoneRules81);
        org.junit.Assert.assertNotNull(zoneOffset84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+18:00" + "'", str85, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(offsetDateTime88);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertNotNull(offsetDateTime91);
        org.junit.Assert.assertNotNull(offsetDateTime93);
        org.junit.Assert.assertNotNull(duration94);
        org.junit.Assert.assertNull(temporal96);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 0L + "'", long97 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime98);
        org.junit.Assert.assertTrue("'" + long99 + "' != '" + 0L + "'", long99 == 0L);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = new java.net.URL("1970-01-01T18:01:37.00000012");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: 1970-01-01T18:01:37.00000012");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        long[] longArray1 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer2 = java.nio.LongBuffer.wrap(longArray1);
        long[] longArray4 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer5 = java.nio.LongBuffer.wrap(longArray4);
        java.nio.LongBuffer longBuffer6 = longBuffer2.put(longBuffer5);
        java.nio.LongBuffer longBuffer7 = longBuffer2.duplicate();
        boolean boolean8 = longBuffer7.isDirect();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[10]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(longBuffer6);
        org.junit.Assert.assertNotNull(longBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.function.Function<java.nio.FloatBuffer, java.nio.FloatBuffer> floatBufferFunction0 = java.util.function.Function.identity();
        org.junit.Assert.assertNotNull(floatBufferFunction0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj2 = charBuffer1.array();
        java.nio.CharBuffer charBuffer4 = charBuffer1.append('.');
        java.lang.String str5 = charBuffer1.toString();
        int int6 = charBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer10 = charBuffer1.put("//Etc/UTC", 0, 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str5, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(256);
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.allocate(256);
        java.nio.FloatBuffer floatBuffer4 = floatBuffer3.slice();
        java.nio.FloatBuffer floatBuffer5 = floatBuffer1.put(floatBuffer3);
        int int6 = floatBuffer5.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = floatBuffer5.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(floatBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.lang.String str3 = zoneId2.getId();
        java.time.ZonedDateTime zonedDateTime4 = java.time.ZonedDateTime.now(zoneId2);
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.withYear((int) (short) 1);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.util.stream.DoubleStream doubleStream9 = java.util.stream.DoubleStream.of(0.0d);
        java.lang.Object obj10 = properties1.getOrDefault((java.lang.Object) zonedDateTime6, (java.lang.Object) doubleStream9);
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("+18:00");
        java.security.cert.CertificateException certificateException15 = new java.security.cert.CertificateException("", (java.lang.Throwable) invalidKeyException14);
        java.security.InvalidKeyException invalidKeyException16 = new java.security.InvalidKeyException("en-GB", (java.lang.Throwable) invalidKeyException14);
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale17.getDisplayName(locale18);
        java.lang.Object obj20 = properties1.getOrDefault((java.lang.Object) invalidKeyException14, (java.lang.Object) str19);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties1.save(outputStream21, "MALFORMED[10]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Etc/UTC" + "'", str3, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "italiano" + "'", str19, "italiano");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "italiano" + "'", obj20, "italiano");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putFloat((float) '.');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        descriptiveStatistics0.setWindowSize((int) (short) -1);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        descriptiveStatistics3.setWindowSize((int) (short) -1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics3.getGeometricMeanImpl();
        descriptiveStatistics0.setSumsqImpl(univariateStatistic6);
        double[] doubleArray8 = descriptiveStatistics0.getSortedValues();
        java.lang.String str9 = descriptiveStatistics0.toString();
        int int10 = descriptiveStatistics0.getWindowSize();
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str9, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.Comparator<java.time.LocalDateTime> localDateTimeComparator0 = java.util.Comparator.naturalOrder();
        org.junit.Assert.assertNotNull(localDateTimeComparator0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.time.Instant instant2 = java.time.Instant.ofEpochSecond((long) '4', (long) ' ');
        java.time.ZoneId zoneId3 = java.time.ZoneId.systemDefault();
        java.lang.String str4 = zoneId3.getId();
        java.time.ZonedDateTime zonedDateTime5 = java.time.ZonedDateTime.now(zoneId3);
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.withDayOfMonth((int) (short) 10);
        java.time.temporal.TemporalUnit temporalUnit8 = null;
        boolean boolean9 = zonedDateTime5.isSupported(temporalUnit8);
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        java.time.temporal.ValueRange valueRange11 = zonedDateTime5.range((java.time.temporal.TemporalField) chronoField10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.LocalTime localTime13 = java.time.LocalTime.MAX;
        long long14 = chronoField12.getFrom((java.time.temporal.TemporalAccessor) localTime13);
        boolean boolean15 = zonedDateTime5.isSupported((java.time.temporal.TemporalField) chronoField12);
        java.time.ZoneId zoneId16 = java.time.ZoneId.systemDefault();
        java.lang.String str17 = zoneId16.getId();
        java.lang.String str18 = zoneId16.getId();
        java.time.ZonedDateTime zonedDateTime19 = zonedDateTime5.withZoneSameInstant(zoneId16);
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofInstant(instant2, zoneId16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.from((java.time.temporal.TemporalAccessor) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZoneOffset from TemporalAccessor: 1970-01-01T00:00:52.000000032 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Etc/UTC" + "'", str4, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
        org.junit.Assert.assertNotNull(valueRange11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 23L + "'", long14 == 23L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Etc/UTC" + "'", str17, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Etc/UTC" + "'", str18, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(0.0d);
        java.util.OptionalDouble optionalDouble2 = doubleStream1.findAny();
        java.util.function.DoubleBinaryOperator doubleBinaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = doubleStream1.reduce((double) (short) 1, doubleBinaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer5.put(31, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        int int6 = byteBuffer5.arrayOffset();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ShortBuffer shortBuffer8 = shortBuffer7.slice();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology15 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean16 = byteBuffer14.equals((java.lang.Object) isoChronology15);
        boolean boolean17 = byteBuffer14.hasArray();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray20, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer14.put(byteBuffer23);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer24.duplicate();
        boolean boolean26 = shortBuffer7.equals((java.lang.Object) byteBuffer25);
        // The following exception was thrown during execution in test generation
        try {
            short short28 = shortBuffer7.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(isoChronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap1 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology2 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean3 = strMapMap1.containsKey((java.lang.Object) isoChronology2);
        java.time.Duration duration4 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal5 = null;
        java.time.temporal.Temporal temporal6 = duration4.subtractFrom(temporal5);
        long long7 = duration4.toDays();
        boolean boolean8 = strMapMap1.contains((java.lang.Object) duration4);
        java.lang.Cloneable cloneable9 = strMapMap0.get((java.lang.Object) duration4);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap10 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology11 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean12 = strMapMap10.containsKey((java.lang.Object) isoChronology11);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap13 = java.nio.charset.Charset.availableCharsets();
        boolean boolean14 = strMap13.isEmpty();
        java.util.Locale locale15 = java.util.Locale.US;
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale15.getDisplayCountry(locale16);
        java.lang.Cloneable cloneable18 = strMapMap10.put(strMap13, (java.lang.Cloneable) locale16);
        int int19 = strMap13.size();
        java.util.Date date25 = new java.util.Date(1, (int) 'x', (int) '0', 16, 256);
        java.lang.Cloneable cloneable26 = strMapMap0.put(strMap13, (java.lang.Cloneable) date25);
        java.util.Set<java.lang.String> strSet27 = strMap13.keySet();
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray30 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList31 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, zoneOffsetTransitionArray30);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray33 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList34 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList34, zoneOffsetTransitionArray33);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray36 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList37 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList37, zoneOffsetTransitionRuleArray36);
        java.time.zone.ZoneRules zoneRules39 = java.time.zone.ZoneRules.of(zoneOffset28, zoneOffset29, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList34, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = strSet27.retainAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNull(temporal6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(cloneable9);
        org.junit.Assert.assertNotNull(isoChronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Stati Uniti" + "'", str17, "Stati Uniti");
        org.junit.Assert.assertNull(cloneable18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 171 + "'", int19 == 171);
        org.junit.Assert.assertEquals(date25.toString(), "Fri Feb 17 20:16:00 UTC 1911");
        org.junit.Assert.assertNull(cloneable26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(zoneRules39);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(256);
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.allocate(256);
        java.nio.FloatBuffer floatBuffer4 = floatBuffer3.slice();
        java.nio.FloatBuffer floatBuffer5 = floatBuffer1.put(floatBuffer3);
        java.lang.String str6 = floatBuffer5.toString();
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(floatBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapFloatBuffer[pos=256 lim=256 cap=256]" + "'", str6, "java.nio.HeapFloatBuffer[pos=256 lim=256 cap=256]");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        int int2 = charBuffer1.limit();
        java.util.stream.IntStream intStream3 = charBuffer1.chars();
        int[] intArray4 = intStream3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = intStream3.distinct();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.LANGUAGE;
        org.junit.Assert.assertNotNull(attribute0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray0 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList1 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList1, zoneOffsetTransitionArray0);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray4 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList5 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList5, zoneOffsetTransitionArray4);
        java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream7 = zoneOffsetTransitionList5.stream();
        int int8 = zoneOffsetTransitionList5.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = zoneOffsetTransitionList1.addAll(59, (java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 59, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray2 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList3 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, zoneOffsetTransitionArray2);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray8 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9, zoneOffsetTransitionRuleArray8);
        java.time.zone.ZoneRules zoneRules11 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray14 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList15 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList15, zoneOffsetTransitionArray14);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray17 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList18 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList18, zoneOffsetTransitionArray17);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray20 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList21, zoneOffsetTransitionRuleArray20);
        java.time.zone.ZoneRules zoneRules23 = java.time.zone.ZoneRules.of(zoneOffset12, zoneOffset13, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList15, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList18, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList21);
        boolean boolean24 = zoneOffsetTransitionList3.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList18);
        zoneOffsetTransitionList3.clear();
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition26 = null;
        boolean boolean27 = zoneOffsetTransitionList3.add(zoneOffsetTransition26);
        java.util.ListIterator<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionItor28 = zoneOffsetTransitionList3.listIterator();
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition29 = null;
        // The following exception was thrown during execution in test generation
        try {
            zoneOffsetTransitionItor28.set(zoneOffsetTransition29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneRules23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionItor28);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.time.chrono.IsoEra isoEra3 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate6 = isoChronology1.dateYearDay((java.time.chrono.Era) isoEra3, (-1), 10);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray9, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology13 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean14 = byteBuffer12.equals((java.lang.Object) isoChronology13);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap15 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology16 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean17 = strMapMap15.containsKey((java.lang.Object) isoChronology16);
        java.time.chrono.IsoEra isoEra18 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate21 = isoChronology16.dateYearDay((java.time.chrono.Era) isoEra18, (-1), 10);
        int int23 = isoChronology13.prolepticYear((java.time.chrono.Era) isoEra18, (int) '#');
        java.time.LocalDate localDate26 = isoChronology1.dateYearDay((java.time.chrono.Era) isoEra18, (int) (byte) 0, 2);
        java.time.ZoneId zoneId27 = java.time.ZoneId.systemDefault();
        java.lang.String str28 = zoneId27.getId();
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.now(zoneId27);
        java.time.ZoneId zoneId30 = java.time.ZoneId.systemDefault();
        java.lang.String str31 = zoneId30.getId();
        java.time.ZonedDateTime zonedDateTime32 = zonedDateTime29.withZoneSameInstant(zoneId30);
        java.time.ZoneId zoneId33 = java.time.ZoneId.systemDefault();
        java.lang.String str34 = zoneId33.getId();
        java.time.ZonedDateTime zonedDateTime35 = java.time.ZonedDateTime.now(zoneId33);
        java.time.ZonedDateTime zonedDateTime37 = zonedDateTime35.withYear((int) (short) 1);
        boolean boolean38 = zonedDateTime32.equals((java.lang.Object) zonedDateTime37);
        java.time.ZonedDateTime zonedDateTime40 = zonedDateTime32.minusMonths((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration41 = java.time.Duration.between((java.time.temporal.Temporal) localDate26, (java.time.temporal.Temporal) zonedDateTime32);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + isoEra3 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra3.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(isoChronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(isoChronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + isoEra18 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra18.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Etc/UTC" + "'", str28, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Etc/UTC" + "'", str31, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Etc/UTC" + "'", str34, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime35);
        org.junit.Assert.assertNotNull(zonedDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(zonedDateTime40);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.lang.String str3 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.LocalTime localTime6 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime7 = localDate5.atTime(localTime6);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray10 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList11 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList11, zoneOffsetTransitionArray10);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray13 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList14 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList14, zoneOffsetTransitionArray13);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray16 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList17 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList17, zoneOffsetTransitionRuleArray16);
        java.time.zone.ZoneRules zoneRules19 = java.time.zone.ZoneRules.of(zoneOffset8, zoneOffset9, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList11, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList14, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList17);
        long long20 = localDateTime7.toEpochSecond(zoneOffset8);
        java.time.LocalDateTime localDateTime22 = localDateTime7.plusDays((long) (byte) 1);
        java.time.ZoneId zoneId23 = java.time.ZoneId.systemDefault();
        java.lang.String str24 = zoneId23.getId();
        java.time.ZonedDateTime zonedDateTime25 = java.time.ZonedDateTime.now(zoneId23);
        java.time.ZoneId zoneId26 = java.time.ZoneId.systemDefault();
        java.lang.String str27 = zoneId26.getId();
        java.time.ZonedDateTime zonedDateTime28 = zonedDateTime25.withZoneSameInstant(zoneId26);
        java.time.ZoneId zoneId29 = java.time.ZoneId.systemDefault();
        java.lang.String str30 = zoneId29.getId();
        java.time.ZonedDateTime zonedDateTime31 = java.time.ZonedDateTime.now(zoneId29);
        java.time.ZonedDateTime zonedDateTime33 = zonedDateTime31.withYear((int) (short) 1);
        boolean boolean34 = zonedDateTime28.equals((java.lang.Object) zonedDateTime33);
        int int35 = zonedDateTime33.getMinute();
        java.time.Duration duration36 = java.time.Duration.between((java.time.temporal.Temporal) localDateTime7, (java.time.temporal.Temporal) zonedDateTime33);
        java.time.ZoneOffset zoneOffset37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant38 = localDateTime7.toInstant(zoneOffset37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneRules19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-62134279201L) + "'", long20 == (-62134279201L));
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Etc/UTC" + "'", str24, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Etc/UTC" + "'", str27, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Etc/UTC" + "'", str30, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 14 + "'", int35 == 14);
        org.junit.Assert.assertNotNull(duration36);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        java.security.AccessControlException accessControlException9 = new java.security.AccessControlException("{}");
        boolean boolean10 = byteBuffer5.equals((java.lang.Object) "{}");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer5.putLong((int) (byte) 10, 1645434849L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.security.NoSuchProviderException noSuchProviderException1 = new java.security.NoSuchProviderException("Optional.empty");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long3 = file2.lastModified();
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap4 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.lang.String str13 = zoneOffset12.getId();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset12);
        boolean boolean15 = localDateTime9.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.MAX;
        java.lang.String str17 = zoneOffset16.getId();
        java.time.ZonedDateTime zonedDateTime18 = java.time.ZonedDateTime.of(localDateTime14, (java.time.ZoneId) zoneOffset16);
        java.util.Date date20 = new java.util.Date((long) (byte) 1);
        java.lang.Cloneable cloneable21 = strMapMap4.getOrDefault((java.lang.Object) localDateTime14, (java.lang.Cloneable) date20);
        boolean boolean22 = file2.equals((java.lang.Object) localDateTime14);
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+18:00" + "'", str13, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+18:00" + "'", str17, "+18:00");
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(cloneable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray2 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList3 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, zoneOffsetTransitionArray2);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray8 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9, zoneOffsetTransitionRuleArray8);
        java.time.zone.ZoneRules zoneRules11 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9);
        java.time.Clock clock12 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset0);
        java.time.Instant instant13 = java.time.Instant.now(clock12);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(clock12);
        org.junit.Assert.assertNotNull(instant13);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) (short) 1, (long) 10);
        java.util.stream.LongStream longStream3 = longStream2.unordered();
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.time.ZoneOffset zoneOffset0 = null;
        java.time.LocalTime localTime1 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray4 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList5 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList5, zoneOffsetTransitionArray4);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray7 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList8 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList8, zoneOffsetTransitionArray7);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray10 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList11 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList11, zoneOffsetTransitionRuleArray10);
        java.time.zone.ZoneRules zoneRules13 = java.time.zone.ZoneRules.of(zoneOffset2, zoneOffset3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList5, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList8, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList11);
        java.time.OffsetTime offsetTime14 = localTime1.atOffset(zoneOffset2);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray15 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList16 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, zoneOffsetTransitionArray15);
        java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream18 = zoneOffsetTransitionList16.stream();
        int int19 = zoneOffsetTransitionList16.size();
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray22 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList23 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList23, zoneOffsetTransitionArray22);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray25 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList26 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList26, zoneOffsetTransitionArray25);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray28 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList29 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList29, zoneOffsetTransitionRuleArray28);
        java.time.zone.ZoneRules zoneRules31 = java.time.zone.ZoneRules.of(zoneOffset20, zoneOffset21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList23, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList26, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList29);
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.MAX;
        java.lang.String str35 = zoneOffset34.getId();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset34);
        java.time.ZoneOffset zoneOffset39 = java.time.ZoneOffset.MAX;
        java.lang.String str40 = zoneOffset39.getId();
        java.time.LocalDateTime localDateTime41 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset39);
        boolean boolean42 = localDateTime36.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime41);
        java.time.format.DateTimeFormatter dateTimeFormatter43 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.lang.String str44 = localDateTime41.format(dateTimeFormatter43);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        int int46 = localDateTime41.get((java.time.temporal.TemporalField) chronoField45);
        java.time.ZoneId zoneId47 = java.time.ZoneId.systemDefault();
        java.lang.String str48 = zoneId47.getId();
        java.time.ZonedDateTime zonedDateTime49 = java.time.ZonedDateTime.now(zoneId47);
        java.time.ZoneId zoneId50 = java.time.ZoneId.systemDefault();
        java.lang.String str51 = zoneId50.getId();
        java.time.ZonedDateTime zonedDateTime52 = zonedDateTime49.withZoneSameInstant(zoneId50);
        java.time.ZonedDateTime zonedDateTime53 = localDateTime41.atZone(zoneId50);
        java.time.zone.ZoneRules zoneRules54 = zoneId50.getRules();
        java.util.List<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList55 = zoneRules54.getTransitionRules();
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneRules zoneRules56 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList23, zoneOffsetTransitionRuleList55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseStandardOffset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneRules13);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(zoneRules31);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+18:00" + "'", str35, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(zoneOffset39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+18:00" + "'", str40, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01T18:01:37.00000012" + "'", str44, "1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField45.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Etc/UTC" + "'", str48, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime49);
        org.junit.Assert.assertNotNull(zoneId50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Etc/UTC" + "'", str51, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertNotNull(zonedDateTime53);
        org.junit.Assert.assertNotNull(zoneRules54);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleList55);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        boolean boolean10 = localDateTime4.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.MAX;
        java.lang.String str12 = zoneOffset11.getId();
        java.time.ZonedDateTime zonedDateTime13 = java.time.ZonedDateTime.of(localDateTime9, (java.time.ZoneId) zoneOffset11);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime14 = zonedDateTime13.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+18:00" + "'", str12, "+18:00");
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MIN;
        java.lang.String str1 = zoneOffset0.toString();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-18:00" + "'", str1, "-18:00");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.time.chrono.IsoEra isoEra3 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate6 = isoChronology1.dateYearDay((java.time.chrono.Era) isoEra3, (-1), 10);
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap7 = null;
        java.time.format.ResolverStyle resolverStyle8 = java.time.format.ResolverStyle.SMART;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate9 = isoChronology1.resolveDate(temporalFieldMap7, resolverStyle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + isoEra3 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra3.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + resolverStyle8 + "' != '" + java.time.format.ResolverStyle.SMART + "'", resolverStyle8.equals(java.time.format.ResolverStyle.SMART));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("DecimalStyle[0+-.]");
        printWriter1.println();
        java.nio.CharBuffer charBuffer4 = java.nio.CharBuffer.allocate(16);
        java.lang.Object obj5 = charBuffer4.array();
        java.nio.CharBuffer charBuffer7 = charBuffer4.append('.');
        java.lang.String str8 = charBuffer4.toString();
        char char10 = charBuffer4.charAt(0);
        char[] charArray11 = charBuffer4.array();
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write(charArray11, (int) '0', (-34));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str8, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), ".\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), ".\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[., \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.lang.String str13 = zoneOffset12.getId();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset12);
        boolean boolean15 = localDateTime9.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        boolean boolean16 = localDateTime4.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray20 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, zoneOffsetTransitionArray20);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray23 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList24 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, zoneOffsetTransitionArray23);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray26 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27, zoneOffsetTransitionRuleArray26);
        java.time.zone.ZoneRules zoneRules29 = java.time.zone.ZoneRules.of(zoneOffset18, zoneOffset19, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray32 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, zoneOffsetTransitionArray32);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray35 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList36 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, zoneOffsetTransitionArray35);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray38 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList39 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39, zoneOffsetTransitionRuleArray38);
        java.time.zone.ZoneRules zoneRules41 = java.time.zone.ZoneRules.of(zoneOffset30, zoneOffset31, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray44 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList45 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, zoneOffsetTransitionArray44);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray47 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList48 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, zoneOffsetTransitionArray47);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray50 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList51 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51, zoneOffsetTransitionRuleArray50);
        java.time.zone.ZoneRules zoneRules53 = java.time.zone.ZoneRules.of(zoneOffset42, zoneOffset43, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51);
        boolean boolean54 = zoneOffsetTransitionList33.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48);
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset56 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray57 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList58 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, zoneOffsetTransitionArray57);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray60 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList61 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, zoneOffsetTransitionArray60);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray63 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList64 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64, zoneOffsetTransitionRuleArray63);
        java.time.zone.ZoneRules zoneRules66 = java.time.zone.ZoneRules.of(zoneOffset55, zoneOffset56, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64);
        int int68 = zoneOffsetTransitionList61.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset69 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset70 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray71 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList72 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, zoneOffsetTransitionArray71);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray74 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList75 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, zoneOffsetTransitionArray74);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray77 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList78 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78, zoneOffsetTransitionRuleArray77);
        java.time.zone.ZoneRules zoneRules80 = java.time.zone.ZoneRules.of(zoneOffset69, zoneOffset70, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.zone.ZoneRules zoneRules81 = java.time.zone.ZoneRules.of(zoneOffset17, zoneOffset18, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.ZoneOffset zoneOffset84 = java.time.ZoneOffset.MAX;
        java.lang.String str85 = zoneOffset84.getId();
        java.time.LocalDateTime localDateTime86 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset84);
        int int87 = zoneOffset18.compareTo(zoneOffset84);
        java.time.OffsetDateTime offsetDateTime88 = java.time.OffsetDateTime.of(localDateTime9, zoneOffset18);
        java.time.LocalTime localTime89 = offsetDateTime88.toLocalTime();
        java.time.OffsetDateTime offsetDateTime91 = offsetDateTime88.withDayOfMonth((int) (byte) 10);
        java.time.Instant instant92 = offsetDateTime91.toInstant();
        int int93 = offsetDateTime91.getHour();
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+18:00" + "'", str13, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(zoneRules41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(zoneRules53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertNotNull(zoneOffset56);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(zoneRules66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset69);
        org.junit.Assert.assertNotNull(zoneOffset70);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(zoneRules80);
        org.junit.Assert.assertNotNull(zoneRules81);
        org.junit.Assert.assertNotNull(zoneOffset84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+18:00" + "'", str85, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(offsetDateTime88);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertNotNull(offsetDateTime91);
        org.junit.Assert.assertNotNull(instant92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 18 + "'", int93 == 18);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.lang.String str13 = zoneOffset12.getId();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset12);
        boolean boolean15 = localDateTime9.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        boolean boolean16 = localDateTime4.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray20 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, zoneOffsetTransitionArray20);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray23 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList24 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, zoneOffsetTransitionArray23);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray26 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27, zoneOffsetTransitionRuleArray26);
        java.time.zone.ZoneRules zoneRules29 = java.time.zone.ZoneRules.of(zoneOffset18, zoneOffset19, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray32 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, zoneOffsetTransitionArray32);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray35 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList36 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, zoneOffsetTransitionArray35);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray38 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList39 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39, zoneOffsetTransitionRuleArray38);
        java.time.zone.ZoneRules zoneRules41 = java.time.zone.ZoneRules.of(zoneOffset30, zoneOffset31, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray44 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList45 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, zoneOffsetTransitionArray44);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray47 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList48 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, zoneOffsetTransitionArray47);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray50 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList51 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51, zoneOffsetTransitionRuleArray50);
        java.time.zone.ZoneRules zoneRules53 = java.time.zone.ZoneRules.of(zoneOffset42, zoneOffset43, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51);
        boolean boolean54 = zoneOffsetTransitionList33.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48);
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset56 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray57 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList58 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, zoneOffsetTransitionArray57);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray60 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList61 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, zoneOffsetTransitionArray60);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray63 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList64 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64, zoneOffsetTransitionRuleArray63);
        java.time.zone.ZoneRules zoneRules66 = java.time.zone.ZoneRules.of(zoneOffset55, zoneOffset56, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64);
        int int68 = zoneOffsetTransitionList61.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset69 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset70 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray71 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList72 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, zoneOffsetTransitionArray71);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray74 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList75 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, zoneOffsetTransitionArray74);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray77 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList78 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78, zoneOffsetTransitionRuleArray77);
        java.time.zone.ZoneRules zoneRules80 = java.time.zone.ZoneRules.of(zoneOffset69, zoneOffset70, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.zone.ZoneRules zoneRules81 = java.time.zone.ZoneRules.of(zoneOffset17, zoneOffset18, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.ZoneOffset zoneOffset84 = java.time.ZoneOffset.MAX;
        java.lang.String str85 = zoneOffset84.getId();
        java.time.LocalDateTime localDateTime86 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset84);
        int int87 = zoneOffset18.compareTo(zoneOffset84);
        java.time.OffsetDateTime offsetDateTime88 = java.time.OffsetDateTime.of(localDateTime9, zoneOffset18);
        java.time.LocalTime localTime89 = offsetDateTime88.toLocalTime();
        java.time.OffsetDateTime offsetDateTime91 = offsetDateTime88.withDayOfMonth((int) (byte) 10);
        java.time.OffsetDateTime offsetDateTime93 = offsetDateTime88.plusHours((long) 256);
        java.time.OffsetDateTime offsetDateTime95 = offsetDateTime88.minusSeconds((long) '0');
        java.time.LocalDateTime localDateTime96 = offsetDateTime88.toLocalDateTime();
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+18:00" + "'", str13, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(zoneRules41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(zoneRules53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertNotNull(zoneOffset56);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(zoneRules66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset69);
        org.junit.Assert.assertNotNull(zoneOffset70);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(zoneRules80);
        org.junit.Assert.assertNotNull(zoneRules81);
        org.junit.Assert.assertNotNull(zoneOffset84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+18:00" + "'", str85, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(offsetDateTime88);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertNotNull(offsetDateTime91);
        org.junit.Assert.assertNotNull(offsetDateTime93);
        org.junit.Assert.assertNotNull(offsetDateTime95);
        org.junit.Assert.assertNotNull(localDateTime96);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.time.Period period1 = java.time.Period.ofDays((-34));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        int int6 = byteBuffer5.arrayOffset();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ShortBuffer shortBuffer8 = shortBuffer7.slice();
        java.nio.ShortBuffer shortBuffer9 = shortBuffer8.compact();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = shortBuffer8.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.net.URI uRI4 = new java.net.URI("italiano", "Etc/UTC", "", "Etc/UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = uRI4.toURL();
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: italiano");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        int int6 = byteBuffer5.arrayOffset();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar((int) (short) 100, '.');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator0 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer15.put((int) '-', (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray15 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList16 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, zoneOffsetTransitionArray15);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray18 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList19 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, zoneOffsetTransitionArray18);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray21 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList22 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList22, zoneOffsetTransitionRuleArray21);
        java.time.zone.ZoneRules zoneRules24 = java.time.zone.ZoneRules.of(zoneOffset13, zoneOffset14, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList22);
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray27 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList28 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList28, zoneOffsetTransitionArray27);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray30 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList31 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, zoneOffsetTransitionArray30);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray33 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList34 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList34, zoneOffsetTransitionRuleArray33);
        java.time.zone.ZoneRules zoneRules36 = java.time.zone.ZoneRules.of(zoneOffset25, zoneOffset26, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList28, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList34);
        boolean boolean37 = zoneOffsetTransitionList16.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset39 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray40 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList41 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList41, zoneOffsetTransitionArray40);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray43 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList44 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList44, zoneOffsetTransitionArray43);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray46 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList47 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList47, zoneOffsetTransitionRuleArray46);
        java.time.zone.ZoneRules zoneRules49 = java.time.zone.ZoneRules.of(zoneOffset38, zoneOffset39, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList41, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList44, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList47);
        int int51 = zoneOffsetTransitionList44.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset52 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset53 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray54 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList55 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList55, zoneOffsetTransitionArray54);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray57 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList58 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, zoneOffsetTransitionArray57);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray60 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList61 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList61, zoneOffsetTransitionRuleArray60);
        java.time.zone.ZoneRules zoneRules63 = java.time.zone.ZoneRules.of(zoneOffset52, zoneOffset53, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList55, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList61);
        java.time.zone.ZoneRules zoneRules64 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList44, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList61);
        java.util.stream.Stream<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionStream65 = zoneOffsetTransitionList31.parallelStream();
        java.util.Optional<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionOptional66 = zoneOffsetTransitionStream65.findFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray67 = zoneOffsetTransitionStream65.toArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneRules24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(zoneRules36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(zoneOffset39);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(zoneRules49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset52);
        org.junit.Assert.assertNotNull(zoneOffset53);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zoneRules63);
        org.junit.Assert.assertNotNull(zoneRules64);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionStream65);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionOptional66);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        java.io.File file3 = file2.getAbsoluteFile();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter5 = new java.io.PrintWriter(file2, "{}");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: {}");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/1970-01-01T18:01:37.00000012");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.lang.String str3 = zoneId2.getId();
        java.time.ZonedDateTime zonedDateTime4 = java.time.ZonedDateTime.now(zoneId2);
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.withYear((int) (short) 1);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.util.stream.DoubleStream doubleStream9 = java.util.stream.DoubleStream.of(0.0d);
        java.lang.Object obj10 = properties1.getOrDefault((java.lang.Object) zonedDateTime6, (java.lang.Object) doubleStream9);
        java.io.PrintWriter printWriter12 = new java.io.PrintWriter("DecimalStyle[0+-.]");
        printWriter12.println("hi!");
        properties1.list(printWriter12);
        java.lang.Object obj18 = properties1.setProperty("AM/PM", "italiano");
        java.io.Reader reader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties1.load(reader19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Etc/UTC" + "'", str3, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.LocalTime localTime6 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime7 = localDate5.atTime(localTime6);
        java.time.LocalDate localDate9 = localDate5.withMonth(1);
        long long10 = localDate9.toEpochDay();
        java.time.chrono.IsoChronology isoChronology11 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra13 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate16 = isoChronology11.dateYearDay((java.time.chrono.Era) isoEra13, 0, 16);
        java.time.LocalTime localTime17 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime18 = localDate16.atTime(localTime17);
        java.time.LocalDate localDate20 = localDate16.withMonth(1);
        java.time.chrono.ChronoPeriod chronoPeriod21 = localDate9.until((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.LocalDate localDate23 = localDate9.plusDays((long) (short) 0);
        int int24 = localDate23.getDayOfMonth();
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-719147L) + "'", long10 == (-719147L));
        org.junit.Assert.assertNotNull(isoChronology11);
        org.junit.Assert.assertTrue("'" + isoEra13 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra13.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(chronoPeriod21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.Duration duration6 = java.time.Duration.ZERO;
        java.time.LocalDate localDate7 = localDate5.plus((java.time.temporal.TemporalAmount) duration6);
        java.time.LocalDateTime localDateTime8 = localDate7.atStartOfDay();
        java.time.chrono.Era era9 = localDate7.getEra();
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = era9.get((java.time.temporal.TemporalField) chronoField10);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: AlignedWeekOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + era9 + "' != '" + java.time.chrono.IsoEra.CE + "'", era9.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        double[] doubleArray3 = new double[] { '.', (-1), 1.0f };
        java.nio.DoubleBuffer doubleBuffer4 = java.nio.DoubleBuffer.wrap(doubleArray3);
        double[] doubleArray8 = new double[] { '.', (-1), 1.0f };
        java.nio.DoubleBuffer doubleBuffer9 = java.nio.DoubleBuffer.wrap(doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer12 = doubleBuffer4.get(doubleArray8, 365, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[46.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[46.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleBuffer9);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.time.chrono.IsoEra isoEra3 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate6 = isoChronology1.dateYearDay((java.time.chrono.Era) isoEra3, (-1), 10);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray9, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology13 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean14 = byteBuffer12.equals((java.lang.Object) isoChronology13);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap15 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology16 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean17 = strMapMap15.containsKey((java.lang.Object) isoChronology16);
        java.time.chrono.IsoEra isoEra18 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate21 = isoChronology16.dateYearDay((java.time.chrono.Era) isoEra18, (-1), 10);
        int int23 = isoChronology13.prolepticYear((java.time.chrono.Era) isoEra18, (int) '#');
        java.time.LocalDate localDate26 = isoChronology1.dateYearDay((java.time.chrono.Era) isoEra18, (int) (byte) 0, 2);
        java.time.chrono.ChronoPeriod chronoPeriod30 = isoChronology1.period(1, (int) (short) 1, 365);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate34 = isoChronology1.date(171, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + isoEra3 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra3.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(isoChronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(isoChronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + isoEra18 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra18.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronoPeriod30);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap1 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.format.ResolverStyle resolverStyle3 = dateTimeFormatter2.getResolverStyle();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate4 = isoChronology0.resolveDate(temporalFieldMap1, resolverStyle3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + resolverStyle3 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle3.equals(java.time.format.ResolverStyle.STRICT));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.lang.String str3 = zoneOffset2.getId();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset2);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.MAX;
        java.lang.String str8 = zoneOffset7.getId();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.MAX;
        java.lang.String str13 = zoneOffset12.getId();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset12);
        boolean boolean15 = localDateTime9.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        boolean boolean16 = localDateTime4.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime9);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray20 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, zoneOffsetTransitionArray20);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray23 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList24 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, zoneOffsetTransitionArray23);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray26 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27, zoneOffsetTransitionRuleArray26);
        java.time.zone.ZoneRules zoneRules29 = java.time.zone.ZoneRules.of(zoneOffset18, zoneOffset19, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray32 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, zoneOffsetTransitionArray32);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray35 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList36 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, zoneOffsetTransitionArray35);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray38 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList39 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39, zoneOffsetTransitionRuleArray38);
        java.time.zone.ZoneRules zoneRules41 = java.time.zone.ZoneRules.of(zoneOffset30, zoneOffset31, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList36, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList39);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray44 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList45 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, zoneOffsetTransitionArray44);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray47 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList48 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, zoneOffsetTransitionArray47);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray50 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList51 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51, zoneOffsetTransitionRuleArray50);
        java.time.zone.ZoneRules zoneRules53 = java.time.zone.ZoneRules.of(zoneOffset42, zoneOffset43, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList45, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList51);
        boolean boolean54 = zoneOffsetTransitionList33.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48);
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset56 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray57 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList58 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, zoneOffsetTransitionArray57);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray60 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList61 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, zoneOffsetTransitionArray60);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray63 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList64 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64, zoneOffsetTransitionRuleArray63);
        java.time.zone.ZoneRules zoneRules66 = java.time.zone.ZoneRules.of(zoneOffset55, zoneOffset56, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList58, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList64);
        int int68 = zoneOffsetTransitionList61.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset69 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset70 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray71 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList72 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, zoneOffsetTransitionArray71);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray74 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList75 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, zoneOffsetTransitionArray74);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray77 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList78 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78, zoneOffsetTransitionRuleArray77);
        java.time.zone.ZoneRules zoneRules80 = java.time.zone.ZoneRules.of(zoneOffset69, zoneOffset70, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList72, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList75, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.zone.ZoneRules zoneRules81 = java.time.zone.ZoneRules.of(zoneOffset17, zoneOffset18, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList48, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList61, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList78);
        java.time.ZoneOffset zoneOffset84 = java.time.ZoneOffset.MAX;
        java.lang.String str85 = zoneOffset84.getId();
        java.time.LocalDateTime localDateTime86 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset84);
        int int87 = zoneOffset18.compareTo(zoneOffset84);
        java.time.OffsetDateTime offsetDateTime88 = java.time.OffsetDateTime.of(localDateTime9, zoneOffset18);
        java.time.LocalTime localTime89 = offsetDateTime88.toLocalTime();
        java.time.OffsetDateTime offsetDateTime91 = offsetDateTime88.withDayOfMonth((int) (byte) 10);
        java.time.OffsetDateTime offsetDateTime93 = offsetDateTime88.plusHours((long) 256);
        java.time.OffsetDateTime offsetDateTime95 = offsetDateTime88.minusSeconds((long) '0');
        int int96 = offsetDateTime95.getMonthValue();
        java.time.temporal.TemporalUnit temporalUnit98 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime99 = offsetDateTime95.minus((long) (byte) 10, temporalUnit98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+18:00" + "'", str3, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+18:00" + "'", str8, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+18:00" + "'", str13, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(zoneRules41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(zoneRules53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertNotNull(zoneOffset56);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(zoneRules66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset69);
        org.junit.Assert.assertNotNull(zoneOffset70);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(zoneRules80);
        org.junit.Assert.assertNotNull(zoneRules81);
        org.junit.Assert.assertNotNull(zoneOffset84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+18:00" + "'", str85, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(offsetDateTime88);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertNotNull(offsetDateTime91);
        org.junit.Assert.assertNotNull(offsetDateTime93);
        org.junit.Assert.assertNotNull(offsetDateTime95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.net.URI uRI5 = new java.net.URI("DIRECT", "Optional.empty", "", "italiano://Etc/UTC#Etc/UTC", "java.nio.HeapFloatBufferR[pos=0 lim=256 cap=256]");
        java.io.File file8 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long9 = file8.lastModified();
        java.net.URL uRL10 = file8.toURL();
        java.nio.file.Path path11 = file8.toPath();
        java.io.File file14 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long15 = file14.lastModified();
        java.net.URL uRL16 = file14.toURL();
        java.nio.file.Path path17 = file14.toPath();
        java.nio.file.Path path18 = path11.relativize(path17);
        java.io.File file21 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long22 = file21.lastModified();
        java.net.URL uRL23 = file21.toURL();
        java.nio.file.Path path24 = file21.toPath();
        java.io.File file27 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long28 = file27.lastModified();
        java.net.URL uRL29 = file27.toURL();
        java.nio.file.Path path30 = file27.toPath();
        java.nio.file.Path path31 = path24.relativize(path30);
        boolean boolean32 = path17.startsWith(path24);
        java.net.URI uRI33 = path24.toUri();
        java.net.URI uRI34 = uRI5.relativize(uRI33);
        java.lang.String str35 = uRI5.getFragment();
        org.junit.Assert.assertEquals(file8.getParent(), "/");
        org.junit.Assert.assertEquals(file8.toString(), "/1970-01-01T18:01:37.00000012");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(uRL10);
        org.junit.Assert.assertEquals(uRL10.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertEquals(file14.getParent(), "/");
        org.junit.Assert.assertEquals(file14.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(uRL16);
        org.junit.Assert.assertEquals(uRL16.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(path17);
        org.junit.Assert.assertNotNull(path18);
        org.junit.Assert.assertEquals(file21.getParent(), "/");
        org.junit.Assert.assertEquals(file21.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(uRL23);
        org.junit.Assert.assertEquals(uRL23.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(path24);
        org.junit.Assert.assertEquals(file27.getParent(), "/");
        org.junit.Assert.assertEquals(file27.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(uRL29);
        org.junit.Assert.assertEquals(uRL29.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(path30);
        org.junit.Assert.assertNotNull(path31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(uRI33);
        org.junit.Assert.assertNotNull(uRI34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.nio.HeapFloatBufferR[pos=0%20lim=256%20cap=256]" + "'", str35, "java.nio.HeapFloatBufferR[pos=0%20lim=256%20cap=256]");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray2 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList3 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, zoneOffsetTransitionArray2);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray8 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9, zoneOffsetTransitionRuleArray8);
        java.time.zone.ZoneRules zoneRules11 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9);
        java.time.Instant instant12 = null;
        boolean boolean13 = zoneRules11.isDaylightSavings(instant12);
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap14 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.lang.Object obj15 = strMapMap14.clone();
        java.lang.String str16 = strMapMap14.toString();
        java.util.Set<java.util.Map.Entry<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>> strMapEntrySet17 = strMapMap14.entrySet();
        boolean boolean18 = zoneRules11.equals((java.lang.Object) strMapEntrySet17);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertNotNull(strMapEntrySet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer5.putFloat(999999999, (float) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of((int) (byte) 1);
        java.util.stream.IntStream intStream3 = java.util.stream.IntStream.of((int) (byte) 1);
        java.util.stream.IntStream intStream4 = java.util.stream.IntStream.concat(intStream1, intStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intStream3.sum();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        java.net.InetAddress inetAddress5 = java.net.InetAddress.getByAddress(byteArray4);
        java.net.NetworkInterface networkInterface6 = java.net.NetworkInterface.getByInetAddress(inetAddress5);
        java.lang.String str7 = inetAddress5.getCanonicalHostName();
        java.lang.String str8 = inetAddress5.toString();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 100]");
        org.junit.Assert.assertNotNull(inetAddress5);
        org.junit.Assert.assertNull(networkInterface6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0.0.100" + "'", str7, "1.0.0.100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/1.0.0.100" + "'", str8, "/1.0.0.100");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.time.Period period1 = java.time.Period.ofYears((int) '\000');
        java.time.chrono.ChronoPeriod chronoPeriod2 = period1.normalized();
        boolean boolean3 = chronoPeriod2.isNegative();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(chronoPeriod2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putInt(2022);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.time.Period period1 = java.time.Period.ofYears((int) '\000');
        java.time.chrono.Chronology chronology2 = period1.getChronology();
        java.time.Period period4 = period1.withDays((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration5 = java.time.Duration.from((java.time.temporal.TemporalAmount) period1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit must not have an estimated duration");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.lang.String str1 = zoneId0.getId();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId0);
        java.time.ZonedDateTime zonedDateTime4 = zonedDateTime2.withDayOfMonth((int) (short) 10);
        java.time.temporal.TemporalUnit temporalUnit5 = null;
        boolean boolean6 = zonedDateTime2.isSupported(temporalUnit5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime8 = zonedDateTime2.withDayOfMonth(256);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 256");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        long[] longArray1 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer2 = java.nio.LongBuffer.wrap(longArray1);
        long[] longArray4 = new long[] { (byte) 10 };
        java.nio.LongBuffer longBuffer5 = java.nio.LongBuffer.wrap(longArray4);
        java.nio.LongBuffer longBuffer6 = longBuffer2.put(longBuffer5);
        java.nio.LongBuffer longBuffer7 = longBuffer2.duplicate();
        boolean boolean8 = longBuffer2.isDirect();
        java.nio.LongBuffer longBuffer9 = longBuffer2.duplicate();
        long[] longArray13 = new long[] { 999999999, (-62134279201L), 31 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer16 = longBuffer9.put(longArray13, 365, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[10]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(longBuffer6);
        org.junit.Assert.assertNotNull(longBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longBuffer9);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[999999999, -62134279201, 31]");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long3 = file2.lastModified();
        java.net.URL uRL4 = file2.toURL();
        java.nio.file.Path path5 = file2.toPath();
        java.io.File file8 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long9 = file8.lastModified();
        java.net.URL uRL10 = file8.toURL();
        java.nio.file.Path path11 = file8.toPath();
        java.nio.file.Path path12 = path5.relativize(path11);
        boolean boolean14 = path5.startsWith("x-windows-iso2022jp");
        int int15 = path5.getNameCount();
        java.nio.file.WatchService watchService16 = null;
        java.nio.file.WatchEvent.Kind<?>[] wildcardKindArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.WatchKey watchKey18 = path5.register(watchService16, wildcardKindArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(uRL4);
        org.junit.Assert.assertEquals(uRL4.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertEquals(file8.getParent(), "/");
        org.junit.Assert.assertEquals(file8.toString(), "/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(uRL10);
        org.junit.Assert.assertEquals(uRL10.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertNotNull(path12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.io.File file2 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        boolean boolean4 = file2.setWritable(false);
        file2.deleteOnExit();
        org.junit.Assert.assertEquals(file2.getParent(), "/");
        org.junit.Assert.assertEquals(file2.toString(), "/1970-01-01T18:01:37.00000012");
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "599b081c1808");
        java.nio.ByteOrder byteOrder2 = charBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = charBuffer1.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        int int6 = byteBuffer5.arrayOffset();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putShort(16448, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition(field0, (int) (short) 10);
        java.text.Format.Field field3 = fieldPosition2.getFieldAttribute();
        int int4 = fieldPosition2.getField();
        fieldPosition2.setEndIndex((int) '0');
        org.junit.Assert.assertNull(field3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap2 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>((int) 'x', (float) 'u');
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) (short) 1, (long) 10);
        longStream2.close();
        java.util.stream.LongStream longStream4 = longStream2.parallel();
        java.util.function.LongPredicate longPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = longStream2.noneMatch(longPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.MAX;
        java.lang.String str5 = zoneOffset4.getId();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset4);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.MAX;
        java.lang.String str10 = zoneOffset9.getId();
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset9);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.MAX;
        java.lang.String str15 = zoneOffset14.getId();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset14);
        boolean boolean17 = localDateTime11.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime16);
        boolean boolean18 = localDateTime6.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime11);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray22 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList23 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList23, zoneOffsetTransitionArray22);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray25 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList26 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList26, zoneOffsetTransitionArray25);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray28 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList29 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList29, zoneOffsetTransitionRuleArray28);
        java.time.zone.ZoneRules zoneRules31 = java.time.zone.ZoneRules.of(zoneOffset20, zoneOffset21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList23, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList26, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList29);
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset33 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray34 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList35 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList35, zoneOffsetTransitionArray34);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray37 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList38 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList38, zoneOffsetTransitionArray37);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray40 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList41 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList41, zoneOffsetTransitionRuleArray40);
        java.time.zone.ZoneRules zoneRules43 = java.time.zone.ZoneRules.of(zoneOffset32, zoneOffset33, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList35, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList38, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList41);
        java.time.ZoneOffset zoneOffset44 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray46 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList47 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList47, zoneOffsetTransitionArray46);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray49 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList50 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList50, zoneOffsetTransitionArray49);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray52 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList53 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList53, zoneOffsetTransitionRuleArray52);
        java.time.zone.ZoneRules zoneRules55 = java.time.zone.ZoneRules.of(zoneOffset44, zoneOffset45, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList47, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList50, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList53);
        boolean boolean56 = zoneOffsetTransitionList35.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList50);
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset58 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray59 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList60 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList60, zoneOffsetTransitionArray59);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray62 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList63 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList63, zoneOffsetTransitionArray62);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray65 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList66 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList66, zoneOffsetTransitionRuleArray65);
        java.time.zone.ZoneRules zoneRules68 = java.time.zone.ZoneRules.of(zoneOffset57, zoneOffset58, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList60, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList63, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList66);
        int int70 = zoneOffsetTransitionList63.indexOf((java.lang.Object) true);
        java.time.ZoneOffset zoneOffset71 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset72 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray73 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList74 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList74, zoneOffsetTransitionArray73);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray76 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList77 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList77, zoneOffsetTransitionArray76);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray79 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList80 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList80, zoneOffsetTransitionRuleArray79);
        java.time.zone.ZoneRules zoneRules82 = java.time.zone.ZoneRules.of(zoneOffset71, zoneOffset72, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList74, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList77, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList80);
        java.time.zone.ZoneRules zoneRules83 = java.time.zone.ZoneRules.of(zoneOffset19, zoneOffset20, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList50, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList63, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList80);
        java.time.ZoneOffset zoneOffset86 = java.time.ZoneOffset.MAX;
        java.lang.String str87 = zoneOffset86.getId();
        java.time.LocalDateTime localDateTime88 = java.time.LocalDateTime.ofEpochSecond((long) 'a', (int) 'x', zoneOffset86);
        int int89 = zoneOffset20.compareTo(zoneOffset86);
        java.time.OffsetDateTime offsetDateTime90 = java.time.OffsetDateTime.of(localDateTime11, zoneOffset20);
        java.time.LocalTime localTime91 = offsetDateTime90.toLocalTime();
        java.time.OffsetDateTime offsetDateTime93 = offsetDateTime90.withDayOfMonth((int) (byte) 10);
        java.time.OffsetDateTime offsetDateTime95 = offsetDateTime93.plusWeeks((long) (short) 10);
        boolean boolean96 = properties1.contains((java.lang.Object) offsetDateTime93);
        java.lang.String str97 = properties1.toString();
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+18:00" + "'", str5, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+18:00" + "'", str10, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+18:00" + "'", str15, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(zoneRules31);
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zoneRules43);
        org.junit.Assert.assertNotNull(zoneOffset44);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(zoneRules55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertNotNull(zoneOffset58);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(zoneRules68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(zoneOffset71);
        org.junit.Assert.assertNotNull(zoneOffset72);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(zoneRules82);
        org.junit.Assert.assertNotNull(zoneRules83);
        org.junit.Assert.assertNotNull(zoneOffset86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "+18:00" + "'", str87, "+18:00");
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(offsetDateTime90);
        org.junit.Assert.assertNotNull(localTime91);
        org.junit.Assert.assertNotNull(offsetDateTime93);
        org.junit.Assert.assertNotNull(offsetDateTime95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "{}" + "'", str97, "{}");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.net.URLConnection.setDefaultRequestProperty("iso8601", "2022-02-21T09:14:13.599Z[Etc/UTC]");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology1 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean2 = strMapMap0.containsKey((java.lang.Object) isoChronology1);
        java.time.chrono.IsoEra isoEra3 = java.time.chrono.IsoEra.BCE;
        java.time.LocalDate localDate6 = isoChronology1.dateYearDay((java.time.chrono.Era) isoEra3, (-1), 10);
        java.time.Duration duration7 = java.time.Duration.ZERO;
        java.time.Duration duration8 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal9 = null;
        java.time.temporal.Temporal temporal10 = duration8.subtractFrom(temporal9);
        long long11 = duration8.toDays();
        java.time.Duration duration12 = duration7.plus(duration8);
        long long13 = duration8.toDays();
        java.lang.String str14 = duration8.toString();
        java.time.chrono.ChronoLocalDate chronoLocalDate15 = localDate6.plus((java.time.temporal.TemporalAmount) duration8);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.time.LocalTime localTime17 = java.time.LocalTime.MAX;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray20 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList21 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, zoneOffsetTransitionArray20);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray23 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList24 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, zoneOffsetTransitionArray23);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray26 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList27 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27, zoneOffsetTransitionRuleArray26);
        java.time.zone.ZoneRules zoneRules29 = java.time.zone.ZoneRules.of(zoneOffset18, zoneOffset19, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList21, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList24, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList27);
        java.time.OffsetTime offsetTime30 = localTime17.atOffset(zoneOffset18);
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange32 = offsetTime30.range((java.time.temporal.TemporalField) chronoField31);
        java.time.OffsetTime offsetTime34 = chronoField16.adjustInto(offsetTime30, (long) 16);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = localDate6.getLong((java.time.temporal.TemporalField) chronoField16);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MilliOfSecond");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + isoEra3 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra3.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNull(temporal10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0S" + "'", str14, "PT0S");
        org.junit.Assert.assertNotNull(chronoLocalDate15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField16.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField31.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange32);
        org.junit.Assert.assertNotNull(offsetTime34);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.time.Instant instant0 = java.time.Instant.MAX;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray3 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList4 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, zoneOffsetTransitionArray3);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray6 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList7 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, zoneOffsetTransitionArray6);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray9 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList10 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10, zoneOffsetTransitionRuleArray9);
        java.time.zone.ZoneRules zoneRules12 = java.time.zone.ZoneRules.of(zoneOffset1, zoneOffset2, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList4, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList7, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList10);
        java.lang.String str13 = zoneOffset2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000001");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+18:00" + "'", str13, "+18:00");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) 10);
        java.time.chrono.IsoChronology isoChronology2 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate7 = isoChronology2.dateYearDay((java.time.chrono.Era) isoEra4, 0, 16);
        java.time.LocalTime localTime8 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime9 = localDate7.atTime(localTime8);
        java.time.LocalDate localDate11 = localDate7.withMonth(1);
        java.time.chrono.ChronoPeriod chronoPeriod12 = java.time.chrono.ChronoPeriod.between((java.time.chrono.ChronoLocalDate) localDate1, (java.time.chrono.ChronoLocalDate) localDate7);
        java.time.LocalDate localDate14 = java.time.LocalDate.ofEpochDay((long) 10);
        java.time.LocalDate localDate16 = java.time.LocalDate.ofEpochDay((long) 10);
        int int17 = localDate14.compareTo((java.time.chrono.ChronoLocalDate) localDate16);
        java.time.temporal.Temporal temporal18 = localDate1.adjustInto((java.time.temporal.Temporal) localDate16);
        java.time.temporal.TemporalUnit temporalUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate21 = localDate16.plus((long) 1024, temporalUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(isoChronology2);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra4.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronoPeriod12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(temporal18);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        double[] doubleArray0 = new double[] {};
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of(doubleArray0);
        java.util.OptionalDouble optionalDouble2 = doubleStream1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.util.DoubleSummaryStatistics doubleSummaryStatistics3 = doubleStream1.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.net.URLStreamHandlerFactory uRLStreamHandlerFactory0 = null;
        java.net.URL.setURLStreamHandlerFactory(uRLStreamHandlerFactory0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.time.Period period2 = java.time.Period.ofYears((int) '\000');
        java.time.chrono.ChronoPeriod chronoPeriod3 = period2.normalized();
        java.time.Month month4 = java.time.Month.JANUARY;
        java.time.Month month5 = month4.firstMonthOfQuarter();
        java.time.Month month6 = month5.firstMonthOfQuarter();
        boolean boolean7 = period2.equals((java.lang.Object) month5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.of(4096, month5, 31, (int) (short) -1, 16448);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(chronoPeriod3);
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.JANUARY + "'", month4.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.JANUARY + "'", month5.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.JANUARY + "'", month6.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime4 = java.time.LocalTime.of(59, 4, 1969, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 59");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("00010221Z", "1.0.0.100");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1.0.0.100");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range(0L, (long) 100);
        java.util.function.LongUnaryOperator longUnaryOperator3 = java.util.function.LongUnaryOperator.identity();
        long long5 = longUnaryOperator3.applyAsLong(7187392471159151072L);
        java.util.stream.LongStream longStream6 = longStream2.map(longUnaryOperator3);
        long long7 = longStream6.count();
        java.util.function.LongPredicate longPredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = longStream6.anyMatch(longPredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longUnaryOperator3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7187392471159151072L + "'", long5 == 7187392471159151072L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.time.Month month1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.of(16448, month1, 1, (int) '4', 16, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        int int0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.INFINITE_WINDOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(2022, (float) (byte) 0, (float) 24L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.LocalTime localTime6 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime7 = localDate5.atTime(localTime6);
        java.time.DayOfWeek dayOfWeek8 = localDate5.getDayOfWeek();
        java.time.chrono.IsoChronology isoChronology9 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra11 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate14 = isoChronology9.dateYearDay((java.time.chrono.Era) isoEra11, 0, 16);
        java.time.LocalTime localTime15 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime16 = localDate14.atTime(localTime15);
        java.time.LocalDate localDate18 = localDate14.withMonth(1);
        java.time.Period period19 = localDate5.until((java.time.chrono.ChronoLocalDate) localDate14);
        java.time.temporal.TemporalUnit temporalUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate22 = localDate14.minus(1L, temporalUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertNotNull(isoChronology9);
        org.junit.Assert.assertTrue("'" + isoEra11 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra11.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.lang.String str2 = properties1.toString();
        java.util.Set<java.lang.String> strSet3 = properties1.stringPropertyNames();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, (int) (short) 0, 0);
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean7 = byteBuffer5.equals((java.lang.Object) isoChronology6);
        boolean boolean8 = byteBuffer5.hasArray();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray11, (int) (short) 0, 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteBuffer14);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer5.get(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100, 1, 10, 10, 100]");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(13);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer4 = intBuffer1.put(4096, (-34));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        float[] floatArray1 = new float[] { 1645434841L };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer4 = java.nio.FloatBuffer.wrap(floatArray1, (int) '#', 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[1.64543488E9]");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.net.URI uRI4 = new java.net.URI("italiano", "Etc/UTC", "", "Etc/UTC");
        java.net.URI uRI5 = uRI4.normalize();
        java.net.URI uRI10 = new java.net.URI("italiano", "Etc/UTC", "", "Etc/UTC");
        java.net.URI uRI11 = uRI10.normalize();
        java.lang.String str12 = uRI11.getRawPath();
        java.lang.String str13 = uRI11.getFragment();
        java.net.URI uRI14 = uRI4.resolve(uRI11);
        java.lang.String str15 = uRI11.toASCIIString();
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNotNull(uRI11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/UTC" + "'", str12, "/UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(uRI14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italiano://Etc/UTC#Etc/UTC" + "'", str15, "italiano://Etc/UTC#Etc/UTC");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        int int2 = date1.getTimezoneOffset();
        long long3 = date1.getTime();
        int int4 = date1.getDay();
        java.time.chrono.IsoChronology isoChronology5 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra7 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate10 = isoChronology5.dateYearDay((java.time.chrono.Era) isoEra7, 0, 16);
        java.time.LocalTime localTime11 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime12 = localDate10.atTime(localTime11);
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray15 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList16 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, zoneOffsetTransitionArray15);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray18 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList19 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, zoneOffsetTransitionArray18);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray21 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList22 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList22, zoneOffsetTransitionRuleArray21);
        java.time.zone.ZoneRules zoneRules24 = java.time.zone.ZoneRules.of(zoneOffset13, zoneOffset14, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList22);
        long long25 = localDateTime12.toEpochSecond(zoneOffset13);
        java.time.LocalTime localTime26 = java.time.LocalTime.now((java.time.ZoneId) zoneOffset13);
        boolean boolean27 = date1.equals((java.lang.Object) localTime26);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(isoChronology5);
        org.junit.Assert.assertTrue("'" + isoEra7 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra7.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneRules24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-62134279201L) + "'", long25 == (-62134279201L));
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("20220221Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.time.Duration duration0 = java.time.Duration.ZERO;
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration3 = duration0.plus((long) 'x', temporalUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: unit");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("DecimalStyle[0+-.]");
        printWriter1.println(true);
        java.io.File file7 = new java.io.File("", "1970-01-01T18:01:37.00000012");
        long long8 = file7.lastModified();
        java.net.URL uRL9 = file7.toURL();
        java.security.CodeSigner[] codeSignerArray10 = new java.security.CodeSigner[] {};
        java.security.CodeSource codeSource11 = new java.security.CodeSource(uRL9, codeSignerArray10);
        java.io.PrintWriter printWriter12 = printWriter1.printf("x-windows-iso2022jp", (java.lang.Object[]) codeSignerArray10);
        java.io.Writer writer14 = printWriter1.append('0');
        org.junit.Assert.assertEquals(file7.getParent(), "/");
        org.junit.Assert.assertEquals(file7.toString(), "/1970-01-01T18:01:37.00000012");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(uRL9);
        org.junit.Assert.assertEquals(uRL9.toString(), "file:/1970-01-01T18:01:37.00000012");
        org.junit.Assert.assertNotNull(codeSignerArray10);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertNotNull(writer14);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.time.ZoneId zoneId0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock1 = java.time.Clock.tickSeconds(zoneId0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) 10);
        java.time.chrono.IsoChronology isoChronology2 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate7 = isoChronology2.dateYearDay((java.time.chrono.Era) isoEra4, 0, 16);
        java.time.LocalTime localTime8 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime9 = localDate7.atTime(localTime8);
        java.time.LocalDate localDate11 = localDate7.withMonth(1);
        java.time.chrono.ChronoPeriod chronoPeriod12 = java.time.chrono.ChronoPeriod.between((java.time.chrono.ChronoLocalDate) localDate1, (java.time.chrono.ChronoLocalDate) localDate7);
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray15 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList16 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, zoneOffsetTransitionArray15);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray18 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList19 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, zoneOffsetTransitionArray18);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray21 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList22 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList22, zoneOffsetTransitionRuleArray21);
        java.time.zone.ZoneRules zoneRules24 = java.time.zone.ZoneRules.of(zoneOffset13, zoneOffset14, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList19, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList22);
        java.time.Clock clock25 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset13);
        java.time.format.TextStyle textStyle26 = java.time.format.TextStyle.SHORT_STANDALONE;
        java.util.Locale locale27 = java.util.Locale.ITALY;
        java.lang.String str28 = zoneOffset13.getDisplayName(textStyle26, locale27);
        java.time.ZonedDateTime zonedDateTime29 = localDate1.atStartOfDay((java.time.ZoneId) zoneOffset13);
        java.time.ZoneId zoneId30 = java.time.ZoneId.systemDefault();
        java.lang.String str31 = zoneId30.getId();
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.now(zoneId30);
        java.time.ZonedDateTime zonedDateTime34 = zonedDateTime32.withDayOfMonth((int) (short) 10);
        java.time.temporal.TemporalUnit temporalUnit35 = null;
        boolean boolean36 = zonedDateTime32.isSupported(temporalUnit35);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        java.time.temporal.ValueRange valueRange38 = zonedDateTime32.range((java.time.temporal.TemporalField) chronoField37);
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.LocalTime localTime40 = java.time.LocalTime.MAX;
        long long41 = chronoField39.getFrom((java.time.temporal.TemporalAccessor) localTime40);
        boolean boolean42 = zonedDateTime32.isSupported((java.time.temporal.TemporalField) chronoField39);
        boolean boolean43 = chronoField39.isDateBased();
        // The following exception was thrown during execution in test generation
        try {
            long long44 = zoneOffset13.getLong((java.time.temporal.TemporalField) chronoField39);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(isoChronology2);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra4.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronoPeriod12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneRules24);
        org.junit.Assert.assertNotNull(clock25);
        org.junit.Assert.assertTrue("'" + textStyle26 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle26.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+18:00" + "'", str28, "+18:00");
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Etc/UTC" + "'", str31, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField37.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
        org.junit.Assert.assertNotNull(valueRange38);
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField39.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 23L + "'", long41 == 23L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "Di");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Di' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap0 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable> strMapMap1 = new java.util.Hashtable<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>, java.lang.Cloneable>();
        java.time.chrono.IsoChronology isoChronology2 = java.time.chrono.IsoChronology.INSTANCE;
        boolean boolean3 = strMapMap1.containsKey((java.lang.Object) isoChronology2);
        java.time.Duration duration4 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal5 = null;
        java.time.temporal.Temporal temporal6 = duration4.subtractFrom(temporal5);
        long long7 = duration4.toDays();
        boolean boolean8 = strMapMap1.contains((java.lang.Object) duration4);
        java.lang.Cloneable cloneable9 = strMapMap0.get((java.lang.Object) duration4);
        java.time.Duration duration11 = duration4.plusSeconds(1645434841L);
        java.time.Duration duration13 = duration11.plusMinutes((long) ':');
        org.junit.Assert.assertNotNull(isoChronology2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNull(temporal6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(cloneable9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(16);
        java.nio.CharBuffer charBuffer3 = charBuffer1.append((java.lang.CharSequence) "Etc/UTC");
        int int4 = charBuffer3.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            char char6 = charBuffer3.charAt(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("MALFORMED[10]", "iso8601");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: iso8601");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) 70, (float) 1645434851L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay((java.time.chrono.Era) isoEra2, 0, 16);
        java.time.LocalTime localTime6 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime7 = localDate5.atTime(localTime6);
        java.time.LocalDate localDate9 = localDate5.withMonth(1);
        java.time.Duration duration10 = java.time.Duration.ZERO;
        java.time.Duration duration11 = java.time.Duration.ZERO;
        java.time.temporal.Temporal temporal12 = null;
        java.time.temporal.Temporal temporal13 = duration11.subtractFrom(temporal12);
        long long14 = duration11.toDays();
        java.time.Duration duration15 = duration10.plus(duration11);
        java.time.LocalDate localDate16 = localDate9.minus((java.time.temporal.TemporalAmount) duration10);
        java.time.LocalDate localDate18 = localDate9.minusWeeks((long) 100);
        java.time.chrono.IsoChronology isoChronology19 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra21 = java.time.chrono.IsoEra.of((int) (byte) 0);
        java.time.LocalDate localDate24 = isoChronology19.dateYearDay((java.time.chrono.Era) isoEra21, 0, 16);
        java.time.LocalTime localTime25 = java.time.LocalTime.MAX;
        java.time.LocalDateTime localDateTime26 = localDate24.atTime(localTime25);
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.MAX;
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.MAX;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray29 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList30 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, zoneOffsetTransitionArray29);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray32 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList33 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, zoneOffsetTransitionArray32);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray35 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList36 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList36, zoneOffsetTransitionRuleArray35);
        java.time.zone.ZoneRules zoneRules38 = java.time.zone.ZoneRules.of(zoneOffset27, zoneOffset28, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList30, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList33, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList36);
        long long39 = localDateTime26.toEpochSecond(zoneOffset27);
        java.time.LocalDateTime localDateTime41 = localDateTime26.plusDays((long) (byte) 1);
        java.time.ZoneId zoneId42 = java.time.ZoneId.systemDefault();
        java.lang.String str43 = zoneId42.getId();
        java.time.ZonedDateTime zonedDateTime44 = java.time.ZonedDateTime.now(zoneId42);
        java.time.ZoneId zoneId45 = java.time.ZoneId.systemDefault();
        java.lang.String str46 = zoneId45.getId();
        java.time.ZonedDateTime zonedDateTime47 = zonedDateTime44.withZoneSameInstant(zoneId45);
        java.time.ZoneId zoneId48 = java.time.ZoneId.systemDefault();
        java.lang.String str49 = zoneId48.getId();
        java.time.ZonedDateTime zonedDateTime50 = java.time.ZonedDateTime.now(zoneId48);
        java.time.ZonedDateTime zonedDateTime52 = zonedDateTime50.withYear((int) (short) 1);
        boolean boolean53 = zonedDateTime47.equals((java.lang.Object) zonedDateTime52);
        int int54 = zonedDateTime52.getMinute();
        java.time.Duration duration55 = java.time.Duration.between((java.time.temporal.Temporal) localDateTime26, (java.time.temporal.Temporal) zonedDateTime52);
        java.time.temporal.Temporal temporal56 = localDate18.adjustInto((java.time.temporal.Temporal) zonedDateTime52);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.from((java.time.temporal.TemporalAccessor) localDate18);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZoneOffset from TemporalAccessor: -0001-02-16 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNull(temporal13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(isoChronology19);
        org.junit.Assert.assertTrue("'" + isoEra21 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra21.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zoneRules38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-62134279201L) + "'", long39 == (-62134279201L));
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Etc/UTC" + "'", str43, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime44);
        org.junit.Assert.assertNotNull(zoneId45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Etc/UTC" + "'", str46, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime47);
        org.junit.Assert.assertNotNull(zoneId48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Etc/UTC" + "'", str49, "Etc/UTC");
        org.junit.Assert.assertNotNull(zonedDateTime50);
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 14 + "'", int54 == 14);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(temporal56);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.io.File file2 = new java.io.File("+18:00", "DIRECT");
        java.io.File file4 = new java.io.File("+18:00");
        int int5 = file2.compareTo(file4);
        org.junit.Assert.assertEquals(file2.getParent(), "+18:00");
        org.junit.Assert.assertEquals(file2.toString(), "+18:00/DIRECT");
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "+18:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.io.File file2 = java.io.File.createTempFile("1970-01-01T18:01:37.00000012", "PT0S");
        boolean boolean3 = file2.isDirectory();
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/tmp/1970-01-01T18:01:37.000000122582173961942774535PT0S");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}
