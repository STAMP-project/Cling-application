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
        java.time.format.ResolverStyle resolverStyle0 = java.time.format.ResolverStyle.LENIENT;
        org.junit.Assert.assertTrue("'" + resolverStyle0 + "' != '" + java.time.format.ResolverStyle.LENIENT + "'", resolverStyle0.equals(java.time.format.ResolverStyle.LENIENT));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
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
            java.io.PrintStream printStream1 = new java.io.PrintStream("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.wrap(floatArray0, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.net.URLStreamHandlerFactory uRLStreamHandlerFactory0 = null;
        java.net.URL.setURLStreamHandlerFactory(uRLStreamHandlerFactory0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime1 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = localTime0.until((java.time.temporal.Temporal) localTime1, temporalUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.nio.channels.FileChannel.MapMode mapMode0 = java.nio.channels.FileChannel.MapMode.READ_ONLY;
        org.junit.Assert.assertNotNull(mapMode0);
        org.junit.Assert.assertEquals(mapMode0.toString(), "READ_ONLY");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.LocalDate localDate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = localTime0.atDate(localDate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.net.UnknownHostException unknownHostException1 = new java.net.UnknownHostException("hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.net.Proxy.Type type0 = java.net.Proxy.Type.SOCKS;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + java.net.Proxy.Type.SOCKS + "'", type0.equals(java.net.Proxy.Type.SOCKS));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException1 = new java.util.InvalidPropertiesFormatException("");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str1 = java.net.URLConnection.guessContentTypeFromName("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.time.LocalDate localDate0 = null;
        java.time.LocalDate localDate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period2 = java.time.Period.between(localDate0, localDate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.IsoEra isoEra1 = java.time.chrono.IsoEra.of((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid era: 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Date date6 = new java.util.Date((int) '#', (int) (byte) 10, (int) (short) 0, 0, 100, 1);
        long long7 = date6.getTime();
        int int8 = date6.getMonth();
        org.junit.Assert.assertEquals(date6.toString(), "Thu Oct 31 01:40:01 UTC 1935");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1078352399000L) + "'", long7 == (-1078352399000L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Month month1 = java.time.Month.of(0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear: 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Comparator<java.time.OffsetDateTime> offsetDateTimeComparator0 = java.time.OffsetDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(offsetDateTimeComparator0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.net.ContentHandlerFactory contentHandlerFactory0 = null;
        java.net.URLConnection.setContentHandlerFactory(contentHandlerFactory0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.time.Instant instant0 = java.time.Instant.MIN;
        java.time.temporal.TemporalAmount temporalAmount1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant2 = instant0.plus(temporalAmount1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfDay (valid values 0 - 86399): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException1 = new java.security.NoSuchAlgorithmException();
        java.security.NoSuchAlgorithmException noSuchAlgorithmException2 = new java.security.NoSuchAlgorithmException((java.lang.Throwable) noSuchAlgorithmException1);
        java.security.KeyException keyException3 = new java.security.KeyException("hi!4219725402934053278hi!", (java.lang.Throwable) noSuchAlgorithmException2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.time.format.FormatStyle formatStyle0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: timeStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isMCOrgLocal();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Date date6 = new java.util.Date((int) '#', (int) (byte) 10, (int) (short) 0, 0, 100, 1);
        java.util.Date date13 = new java.util.Date((int) '#', (int) (byte) 10, (int) (short) 0, 0, 100, 1);
        long long14 = date13.getTime();
        boolean boolean15 = date6.before(date13);
        java.lang.Class<?> wildcardClass16 = date6.getClass();
        org.junit.Assert.assertEquals(date6.toString(), "Thu Oct 31 01:40:01 UTC 1935");
        org.junit.Assert.assertEquals(date13.toString(), "Thu Oct 31 01:40:01 UTC 1935");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1078352399000L) + "'", long14 == (-1078352399000L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.security.AccessControlException accessControlException1 = new java.security.AccessControlException("");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.time.Instant instant0 = java.time.Instant.MIN;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = java.util.Date.from(instant0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.lang.ArithmeticException: long overflow");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.FileNotFoundException fileNotFoundException1 = new java.io.FileNotFoundException("iso8601");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.net.URL uRL4 = file3.toURL();
        java.lang.String str5 = uRL4.getQuery();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!5011672566525210254hi!");
        org.junit.Assert.assertNotNull(uRL4);
// flaky:         org.junit.Assert.assertEquals(uRL4.toString(), "file:/tmp/hi!5011672566525210254hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.WRITE;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.WRITE + "'", accessMode0.equals(java.nio.file.AccessMode.WRITE));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.security.cert.CertificateException certificateException1 = new java.security.cert.CertificateException("");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.IntSummaryStatistics intSummaryStatistics0 = new java.util.IntSummaryStatistics();
        int int1 = intSummaryStatistics0.getMax();
        org.junit.Assert.assertEquals(intSummaryStatistics0.toString(), "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByName("iso8601");
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile("iso8601", "/tmp/hi!6254101283195309594hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to create temporary file, /tmp/iso86013800083926459777300/tmp/hi!6254101283195309594hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.time.Duration duration1 = java.time.Duration.ofDays((long) (byte) 100);
        java.time.Duration duration3 = duration1.minusMinutes((long) ' ');
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        java.time.Duration duration7 = temporalUnit6.getDuration();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration8 = duration3.minus((long) (short) -1, temporalUnit6);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit must not have an estimated duration");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream0, true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.SECONDS;
        long long2 = timeUnit0.toMinutes((long) '4');
        java.util.stream.Stream<java.util.concurrent.TimeUnit> timeUnitStream3 = java.util.stream.Stream.of(timeUnit0);
        java.util.stream.Stream<java.util.concurrent.TimeUnit> timeUnitStream4 = timeUnitStream3.sorted();
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(timeUnitStream3);
        org.junit.Assert.assertNotNull(timeUnitStream4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.time.Month month1 = java.time.Month.FEBRUARY;
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery2 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean3 = month1.query(booleanTemporalQuery2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.of(9, month1, (int) (byte) 100, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.FEBRUARY + "'", month1.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.text.ParseException parseException2 = new java.text.ParseException("iso8601", (int) 'a');
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset minutes and seconds must be positive because hours is positive");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("iso8601", "hi!4219725402934053278hi!", "iso8601");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: iso8601");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.time.chrono.ChronoLocalDate chronoLocalDate0 = null;
        java.time.chrono.ChronoLocalDate chronoLocalDate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod2 = java.time.chrono.ChronoPeriod.between(chronoLocalDate0, chronoLocalDate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: startDateInclusive");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.time.Month month0 = java.time.Month.DECEMBER;
        java.time.DayOfWeek dayOfWeek2 = null;
        java.time.LocalTime localTime3 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit4 = null;
        boolean boolean5 = localTime3.isSupported(temporalUnit4);
        java.time.chrono.Chronology chronology6 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime3);
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition8 = null;
        java.time.ZoneOffset zoneOffset9 = null;
        java.time.ZoneOffset zoneOffset10 = null;
        java.time.ZoneOffset zoneOffset11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransitionRule zoneOffsetTransitionRule12 = java.time.zone.ZoneOffsetTransitionRule.of(month0, (int) (short) 100, dayOfWeek2, localTime3, true, timeDefinition8, zoneOffset9, zoneOffset10, zoneOffset11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: timeDefnition");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.DECEMBER + "'", month0.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit4 = chronoField3.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime6 = offsetDateTime0.with((java.time.temporal.TemporalField) chronoField3, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for AlignedWeekOfYear (valid values 1 - 53): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.function.IntUnaryOperator intUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream2 = java.util.stream.IntStream.iterate((int) (byte) -1, intUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime0.minusYears((long) 10);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.time.ZoneOffset zoneOffset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.of((int) ' ', (int) (short) 10, 0, 10, (int) (byte) 100, (int) '#', 0, zoneOffset7);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United States" + "'", str1, "United States");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.security.cert.CertificateException certificateException0 = new java.security.cert.CertificateException();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.net.URLConnection.setDefaultAllowUserInteraction(true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.time.ZoneOffset zoneOffset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.of((int) (short) 0, (int) (short) 100, 100, (int) (short) 1, (int) '4', 10, (int) (short) 100, zoneOffset7);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        org.junit.Assert.assertNotNull(timeUnit0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.lang.String str4 = file3.getName();
        java.lang.String str5 = file3.toString();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!294471157906245816hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!294471157906245816hi!" + "'", str4, "hi!294471157906245816hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/tmp/hi!294471157906245816hi!" + "'", str5, "/tmp/hi!294471157906245816hi!");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = java.time.Duration.parse((java.lang.CharSequence) "hi!4219725402934053278hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Duration");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer1 = java.nio.DoubleBuffer.allocate((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = java.time.temporal.ValueRange.of((long) (byte) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value must be less than maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.OVERFLOW;
        org.junit.Assert.assertNotNull(coderResult0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.security.ProtectionDomain[] protectionDomainArray0 = new java.security.ProtectionDomain[] {};
        java.security.AccessControlContext accessControlContext1 = new java.security.AccessControlContext(protectionDomainArray0);
        javax.security.auth.Subject subject2 = javax.security.auth.Subject.getSubject(accessControlContext1);
        org.junit.Assert.assertNotNull(protectionDomainArray0);
        org.junit.Assert.assertNull(subject2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime2 = localTime0.plusHours((long) 100);
        java.time.LocalTime localTime4 = localTime2.minusHours((long) (byte) -1);
        int int5 = localTime4.getNano();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.time.Instant instant0 = java.time.Instant.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit3 = chronoField2.getRangeUnit();
        java.time.Duration duration4 = temporalUnit3.getDuration();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant5 = instant0.minus(0L, temporalUnit3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Years");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit3 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit3.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.FULL_STANDALONE;
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.FULL_STANDALONE + "'", textStyle0.equals(java.time.format.TextStyle.FULL_STANDALONE));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.net.URL uRL4 = file3.toURL();
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter(file3);
        printWriter5.flush();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!7297211406592177201hi!");
        org.junit.Assert.assertNotNull(uRL4);
// flaky:         org.junit.Assert.assertEquals(uRL4.toString(), "file:/tmp/hi!7297211406592177201hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = java.time.Instant.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.lang.String str4 = file3.getName();
        long long5 = file3.getFreeSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream7 = new java.io.PrintStream(file3, "/tmp/hi!294471157906245816hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: /tmp/hi!294471157906245816hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!3102256648502244498hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!3102256648502244498hi!" + "'", str4, "hi!3102256648502244498hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 299105624064L + "'", long5 == 299105624064L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        boolean boolean2 = localTime0.isSupported(temporalUnit1);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime0);
        java.lang.String str4 = chronology3.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate8 = chronology3.date((int) 'a', (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iso8601" + "'", str4, "iso8601");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.lang.String str4 = file3.getName();
        file3.deleteOnExit();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!4407287824293098254hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!4407287824293098254hi!" + "'", str4, "hi!4407287824293098254hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 9);
        long long2 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        boolean boolean2 = localTime0.isSupported(temporalUnit1);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime0);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        java.time.temporal.ValueRange valueRange5 = chronology3.range(chronoField4);
        long long6 = valueRange5.getMinimum();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField4.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
        org.junit.Assert.assertNotNull(valueRange5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.time.Duration duration1 = java.time.Duration.ofDays((long) (byte) 100);
        java.time.Duration duration3 = duration1.minusMinutes((long) ' ');
        java.time.LocalTime localTime4 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime6 = localTime4.plusNanos((long) (byte) 100);
        java.time.temporal.Temporal temporal7 = duration3.addTo((java.time.temporal.Temporal) localTime6);
        java.time.LocalTime localTime8 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime10 = localTime8.plusHours((long) 100);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery11 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean12 = localTime8.query(booleanTemporalQuery11);
        java.lang.Boolean boolean13 = localTime6.query(booleanTemporalQuery11);
        java.lang.String str14 = localTime6.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(temporal7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(booleanTemporalQuery11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "12:00:00.000000100" + "'", str14, "12:00:00.000000100");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of((int) (short) -1, 100, 9, (int) (short) -1, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getRangeUnit();
        java.time.Duration duration2 = temporalUnit1.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList3 = duration2.getUnits();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!4219725402934053278hi!", "hi!6772702650680601430hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit10 = chronoField9.getRangeUnit();
        java.time.Duration duration11 = temporalUnit10.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList12 = duration11.getUnits();
        boolean boolean13 = strSet7.containsAll((java.util.Collection<java.time.temporal.TemporalUnit>) temporalUnitList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = temporalUnitList3.removeAll((java.util.Collection<java.time.temporal.TemporalUnit>) temporalUnitList12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(temporalUnitList3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit10 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit10.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(temporalUnitList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.time.LocalDateTime localDateTime0 = null;
        java.time.ZoneOffset zoneOffset1 = null;
        java.time.ZoneOffset zoneOffset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransition zoneOffsetTransition3 = java.time.zone.ZoneOffsetTransition.of(localDateTime0, zoneOffset1, zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: transition");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.net.URL uRL4 = file3.toURL();
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter(file3);
        long long6 = file3.length();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!6486397201869914708hi!");
        org.junit.Assert.assertNotNull(uRL4);
// flaky:         org.junit.Assert.assertEquals(uRL4.toString(), "file:/tmp/hi!6486397201869914708hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) (byte) 0);
        long[] longArray6 = new long[] { (byte) 1, (short) 100, '4', 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer9 = longBuffer1.put(longArray6, 1, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 52, 0]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.SECONDS;
        long long2 = timeUnit0.toMinutes((long) '4');
        timeUnit0.sleep((long) (short) 0);
        long long6 = timeUnit0.toMinutes(0L);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Date date3 = new java.util.Date((int) (short) 1, 32, 32);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Oct 02 00:00:00 UTC 1903");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException0 = new java.security.NoSuchAlgorithmException();
        java.security.NoSuchAlgorithmException noSuchAlgorithmException1 = new java.security.NoSuchAlgorithmException((java.lang.Throwable) noSuchAlgorithmException0);
        java.security.KeyException keyException2 = new java.security.KeyException((java.lang.Throwable) noSuchAlgorithmException0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.Date date1 = new java.util.Date((long) (short) 1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.time.LocalDate localDate0 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime1 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        boolean boolean3 = localTime1.isSupported(temporalUnit2);
        java.time.chrono.Chronology chronology4 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        java.time.temporal.ValueRange valueRange6 = chronology4.range(chronoField5);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = localDate0.getLong((java.time.temporal.TemporalField) chronoField5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: SecondOfMinute");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField5.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
        org.junit.Assert.assertNotNull(valueRange6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getRangeUnit();
        java.time.Duration duration2 = temporalUnit1.getDuration();
        java.time.Duration duration4 = java.time.Duration.ofDays((long) (byte) 100);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.plusMinutes((-1078352399000L));
        boolean boolean9 = offsetDateTime5.isBefore(offsetDateTime8);
        java.time.temporal.Temporal temporal10 = duration4.subtractFrom((java.time.temporal.Temporal) offsetDateTime8);
        java.time.Duration duration12 = java.time.Duration.ofDays((long) (byte) 100);
        java.time.Duration duration14 = duration12.minusMinutes((long) ' ');
        java.time.LocalTime localTime15 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime17 = localTime15.plusNanos((long) (byte) 100);
        java.time.temporal.Temporal temporal18 = duration14.addTo((java.time.temporal.Temporal) localTime17);
        java.time.LocalTime localTime19 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime21 = localTime19.plusHours((long) 100);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery22 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean23 = localTime19.query(booleanTemporalQuery22);
        java.lang.Boolean boolean24 = localTime17.query(booleanTemporalQuery22);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = temporalUnit1.between(temporal10, (java.time.temporal.Temporal) localTime17);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: 12:00:00.000000100 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(temporal10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(temporal18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(booleanTemporalQuery22);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
        org.junit.Assert.assertEquals("'" + boolean24 + "' != '" + false + "'", boolean24, false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        boolean boolean2 = localTime0.isSupported(temporalUnit1);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime0);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        java.time.temporal.ValueRange valueRange5 = chronology3.range(chronoField4);
        java.time.Duration duration7 = java.time.Duration.ofDays((long) (byte) 100);
        java.time.Duration duration9 = duration7.minusMinutes((long) ' ');
        java.time.LocalTime localTime10 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime12 = localTime10.plusNanos((long) (byte) 100);
        java.time.temporal.Temporal temporal13 = duration9.addTo((java.time.temporal.Temporal) localTime12);
        java.time.LocalTime localTime14 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime16 = localTime14.plusHours((long) 100);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery17 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean18 = localTime14.query(booleanTemporalQuery17);
        java.lang.Boolean boolean19 = localTime12.query(booleanTemporalQuery17);
        boolean boolean20 = valueRange5.equals((java.lang.Object) booleanTemporalQuery17);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField4.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
        org.junit.Assert.assertNotNull(valueRange5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(temporal13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(booleanTemporalQuery17);
        org.junit.Assert.assertEquals("'" + boolean18 + "' != '" + false + "'", boolean18, false);
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + false + "'", boolean19, false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.LocalDateTime localDateTime6 = zonedDateTime5.toLocalDateTime();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit8 = chronoField7.getRangeUnit();
        java.time.Duration duration9 = temporalUnit8.getDuration();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = localDateTime6.truncatedTo(temporalUnit8);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit is too large to be used for truncation");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit8 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit8.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        boolean boolean2 = localTime0.isSupported(temporalUnit1);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime0);
        java.lang.String str4 = chronology3.getCalendarType();
        java.time.chrono.Era era5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = chronology3.prolepticYear(era5, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Era must be IsoEra");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iso8601" + "'", str4, "iso8601");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.stream.LongStream.Builder builder0 = java.util.stream.LongStream.builder();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime2 = localTime0.plusNanos((long) (byte) 100);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit4 = chronoField3.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime5 = localTime2.truncatedTo(temporalUnit4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit is too large to be used for truncation");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.net.URL uRL4 = file3.toURL();
        java.security.CodeSigner codeSigner5 = null;
        java.security.CodeSigner[] codeSignerArray6 = new java.security.CodeSigner[] { codeSigner5 };
        java.security.CodeSource codeSource7 = new java.security.CodeSource(uRL4, codeSignerArray6);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!8196045845357186791hi!");
        org.junit.Assert.assertNotNull(uRL4);
// flaky:         org.junit.Assert.assertEquals(uRL4.toString(), "file:/tmp/hi!8196045845357186791hi!");
        org.junit.Assert.assertNotNull(codeSignerArray6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.plusSeconds((long) '#');
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime10 = zonedDateTime5.with((java.time.temporal.TemporalField) chronoField8, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for ClockHourOfDay (valid values 1 - 24): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField8.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator0 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getRangeUnit();
        java.time.Duration duration2 = temporalUnit1.getDuration();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit4 = chronoField3.getRangeUnit();
        java.time.temporal.TemporalUnit[] temporalUnitArray5 = new java.time.temporal.TemporalUnit[] { temporalUnit1, temporalUnit4 };
        java.util.ArrayList<java.time.temporal.TemporalUnit> temporalUnitList6 = new java.util.ArrayList<java.time.temporal.TemporalUnit>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalUnit>) temporalUnitList6, temporalUnitArray5);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit10 = chronoField9.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalUnit temporalUnit11 = temporalUnitList6.set((int) 'x', temporalUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 120, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(temporalUnitArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit10 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit10.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ofPattern("iso8601", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.net.URL uRL4 = file3.toURL();
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter(file3);
        printWriter5.println((-1));
        printWriter5.write(9);
        printWriter5.print("");
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!2913903134967618877hi!");
        org.junit.Assert.assertNotNull(uRL4);
// flaky:         org.junit.Assert.assertEquals(uRL4.toString(), "file:/tmp/hi!2913903134967618877hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.time.LocalDate localDate2 = java.time.LocalDate.ofYearDay(32, 16);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.net.URL uRL4 = file3.toURL();
        java.net.Proxy proxy5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URLConnection uRLConnection6 = uRL4.openConnection(proxy5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: proxy can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!4611110411701119408hi!");
        org.junit.Assert.assertNotNull(uRL4);
// flaky:         org.junit.Assert.assertEquals(uRL4.toString(), "file:/tmp/hi!4611110411701119408hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.plusMinutes((-1078352399000L));
        java.time.temporal.Temporal temporal9 = offsetDateTime4.adjustInto((java.time.temporal.Temporal) offsetDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime11 = offsetDateTime4.withHour((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(temporal9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int[] intArray6 = new int[] { (byte) 100, 32, 0, (byte) 1, 9, '4' };
        java.nio.IntBuffer intBuffer7 = java.nio.IntBuffer.wrap(intArray6);
        boolean boolean8 = intBuffer7.hasArray();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 0, 1, 9, 52]");
        org.junit.Assert.assertNotNull(intBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        org.junit.Assert.assertNotNull(charset0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        boolean boolean1 = java.nio.charset.Charset.isSupported("12:00:00.000000100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.SECONDS;
        long long2 = timeUnit0.toMinutes((long) '4');
        timeUnit0.sleep((long) (short) 0);
        long long6 = timeUnit0.toHours((long) (short) 0);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.plusMinutes((-1078352399000L));
        java.time.temporal.Temporal temporal9 = offsetDateTime4.adjustInto((java.time.temporal.Temporal) offsetDateTime6);
        java.time.ZoneOffset zoneOffset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime11 = offsetDateTime4.withOffsetSameInstant(zoneOffset10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(temporal9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("12:00:00.000000100", "/tmp/hi!6254101283195309594hi!", "/tmp/hi!294471157906245816hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: 12:00:00.000000100");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.time.Month month0 = java.time.Month.FEBRUARY;
        int int1 = month0.getValue();
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.FEBRUARY + "'", month0.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.nio.file.LinkOption linkOption0 = java.nio.file.LinkOption.NOFOLLOW_LINKS;
        org.junit.Assert.assertTrue("'" + linkOption0 + "' != '" + java.nio.file.LinkOption.NOFOLLOW_LINKS + "'", linkOption0.equals(java.nio.file.LinkOption.NOFOLLOW_LINKS));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        boolean boolean2 = localTime0.isSupported(temporalUnit1);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime0);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField4.getRangeUnit();
        java.time.Duration duration6 = temporalUnit5.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList7 = duration6.getUnits();
        java.time.temporal.Temporal temporal8 = localTime0.minus((java.time.temporal.TemporalAmount) duration6);
        java.time.Duration duration10 = duration6.minusDays((long) 9);
        boolean boolean11 = duration10.isNegative();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(temporalUnitList7);
        org.junit.Assert.assertNotNull(temporal8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.time.Duration duration1 = java.time.Duration.ofMinutes((long) 14);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.time.Month month0 = java.time.Month.FEBRUARY;
        int int2 = month0.firstDayOfYear(true);
        int int4 = month0.firstDayOfYear(true);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.FEBRUARY + "'", month0.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit4 = chronoField3.getRangeUnit();
        java.time.Duration duration5 = temporalUnit4.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList6 = duration5.getUnits();
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime2.plus((java.time.temporal.TemporalAmount) duration5);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime2.with((java.time.temporal.TemporalField) chronoField8, (long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = chronoField8.checkValidIntValue((-1L));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfDay (valid values 0 - 86399): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(temporalUnitList6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField8.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(offsetDateTime10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.plusSeconds((long) '#');
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime12 = offsetDateTime10.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime13 = offsetDateTime12.toZonedDateTime();
        java.time.chrono.Chronology chronology14 = zonedDateTime13.getChronology();
        boolean boolean15 = zonedDateTime7.isBefore((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.plusSeconds((long) '#');
        java.time.LocalTime localTime8 = zonedDateTime5.toLocalTime();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime9 = zonedDateTime5.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.nio.charset.CoderResult coderResult2 = java.nio.charset.CoderResult.unmappableForLength((int) (byte) 1);
        java.time.LocalTime localTime3 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime5 = localTime3.plusNanos((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = strMap0.remove((java.lang.Object) (byte) 1, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(coderResult2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 9);
        boolean boolean2 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9L + "'", long4 == 9L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getBaseUnit();
        java.time.LocalDate localDate2 = java.time.LocalDate.MAX;
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime4 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime6 = localTime4.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime8 = localTime4.withSecond((int) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime9 = localDate3.atTime(localTime4);
        boolean boolean10 = localDate2.isEqual((java.time.chrono.ChronoLocalDate) localDate3);
        boolean boolean11 = temporalUnit1.isSupportedBy((java.time.temporal.Temporal) localDate2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate13 = localDate2.withDayOfMonth(16384);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 16384");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException1 = new java.security.NoSuchAlgorithmException();
        java.security.cert.CertificateEncodingException certificateEncodingException2 = new java.security.cert.CertificateEncodingException("", (java.lang.Throwable) noSuchAlgorithmException1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.time.Instant instant0 = java.time.Instant.MIN;
        java.time.LocalTime localTime1 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        boolean boolean3 = localTime1.isSupported(temporalUnit2);
        java.time.chrono.Chronology chronology4 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        java.time.temporal.ValueRange valueRange6 = chronology4.range(chronoField5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange7 = instant0.range((java.time.temporal.TemporalField) chronoField5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: SecondOfMinute");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField5.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
        org.junit.Assert.assertNotNull(valueRange6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Date date6 = new java.util.Date((int) '#', (int) (byte) 10, (int) (short) 0, 0, 100, 1);
        int int7 = date6.getSeconds();
        org.junit.Assert.assertEquals(date6.toString(), "Thu Oct 31 01:40:01 UTC 1935");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(outputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.time.LocalDate localDate0 = java.time.LocalDate.MAX;
        java.time.LocalDate localDate1 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime2 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime4 = localTime2.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime6 = localTime2.withSecond((int) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime7 = localDate1.atTime(localTime2);
        boolean boolean8 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.LocalDate localDate9 = java.time.LocalDate.MAX;
        java.time.LocalDate localDate10 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime11 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime13 = localTime11.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime15 = localTime11.withSecond((int) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime16 = localDate10.atTime(localTime11);
        boolean boolean17 = localDate9.isEqual((java.time.chrono.ChronoLocalDate) localDate10);
        int int18 = localDate9.lengthOfYear();
        java.time.chrono.ChronoLocalDate chronoLocalDate19 = localDate1.with((java.time.temporal.TemporalAdjuster) localDate9);
        java.time.LocalDate localDate21 = localDate1.plusMonths((long) (byte) -1);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 365 + "'", int18 == 365);
        org.junit.Assert.assertNotNull(chronoLocalDate19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.time.Month month0 = java.time.Month.FEBRUARY;
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery1 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean2 = month0.query(booleanTemporalQuery1);
        java.time.Month month4 = month0.plus((long) 'a');
        int int6 = month4.length(true);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.FEBRUARY + "'", month0.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.MARCH + "'", month4.equals(java.time.Month.MARCH));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.BIG_ENDIAN;
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter5 = new java.io.PrintWriter(file2, "hi!4407287824293098254hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!4407287824293098254hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!108610430889289622hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.plusMinutes((-1078352399000L));
        java.time.temporal.Temporal temporal9 = offsetDateTime4.adjustInto((java.time.temporal.Temporal) offsetDateTime6);
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime4.plusMinutes((long) 10);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(temporal9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.time.LocalDate localDate0 = java.time.LocalDate.MAX;
        java.time.LocalDate localDate1 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime2 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime4 = localTime2.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime6 = localTime2.withSecond((int) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime7 = localDate1.atTime(localTime2);
        boolean boolean8 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        int int9 = localDate0.getMonthValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException1 = new java.security.NoSuchAlgorithmException();
        java.security.KeyException keyException2 = new java.security.KeyException("iso8601", (java.lang.Throwable) noSuchAlgorithmException1);
        java.security.cert.CertificateException certificateException3 = new java.security.cert.CertificateException((java.lang.Throwable) noSuchAlgorithmException1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE;
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
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!4219725402934053278hi!", "hi!6772702650680601430hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        java.time.Duration duration7 = temporalUnit6.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList8 = duration7.getUnits();
        boolean boolean9 = strSet3.containsAll((java.util.Collection<java.time.temporal.TemporalUnit>) temporalUnitList8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalUnit temporalUnit11 = temporalUnitList8.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(temporalUnitList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime0.minusSeconds((long) 9);
        java.time.Month month5 = offsetDateTime0.getMonth();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.DECEMBER + "'", month5.equals(java.time.Month.DECEMBER));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.IntSummaryStatistics intSummaryStatistics0 = new java.util.IntSummaryStatistics();
        long long1 = intSummaryStatistics0.getCount();
        org.junit.Assert.assertEquals(intSummaryStatistics0.toString(), "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getRangeUnit();
        java.time.Duration duration2 = temporalUnit1.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList3 = duration2.getUnits();
        java.util.stream.Stream<java.time.temporal.TemporalUnit> temporalUnitStream4 = temporalUnitList3.parallelStream();
        java.time.LocalTime localTime5 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit6 = null;
        boolean boolean7 = localTime5.isSupported(temporalUnit6);
        java.time.chrono.Chronology chronology8 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime5);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit10 = chronoField9.getRangeUnit();
        java.time.Duration duration11 = temporalUnit10.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList12 = duration11.getUnits();
        java.time.temporal.Temporal temporal13 = localTime5.minus((java.time.temporal.TemporalAmount) duration11);
        java.time.Duration duration15 = java.time.Duration.ofDays((long) (byte) 100);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime19 = offsetDateTime17.plusMinutes((-1078352399000L));
        boolean boolean20 = offsetDateTime16.isBefore(offsetDateTime19);
        java.time.temporal.Temporal temporal21 = duration15.subtractFrom((java.time.temporal.Temporal) offsetDateTime19);
        java.time.temporal.Temporal temporal22 = localTime5.minus((java.time.temporal.TemporalAmount) duration15);
        int int23 = temporalUnitList3.indexOf((java.lang.Object) duration15);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!4219725402934053278hi!", "hi!6772702650680601430hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit30 = chronoField29.getRangeUnit();
        java.time.Duration duration31 = temporalUnit30.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList32 = duration31.getUnits();
        boolean boolean33 = strSet27.containsAll((java.util.Collection<java.time.temporal.TemporalUnit>) temporalUnitList32);
        boolean boolean34 = temporalUnitList3.containsAll((java.util.Collection<java.time.temporal.TemporalUnit>) temporalUnitList32);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(temporalUnitList3);
        org.junit.Assert.assertNotNull(temporalUnitStream4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit10 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit10.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(temporalUnitList12);
        org.junit.Assert.assertNotNull(temporal13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(temporal21);
        org.junit.Assert.assertNotNull(temporal22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField29.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit30 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit30.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(temporalUnitList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.net.URI uRI1 = new java.net.URI("/tmp/hi!6254101283195309594hi!");
        boolean boolean2 = uRI1.isOpaque();
        java.lang.String str3 = uRI1.getSchemeSpecificPart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/tmp/hi!6254101283195309594hi!" + "'", str3, "/tmp/hi!6254101283195309594hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.LocalDateTime localDateTime6 = zonedDateTime5.toLocalDateTime();
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime7.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime12 = offsetDateTime11.toZonedDateTime();
        java.time.chrono.Chronology chronology13 = zonedDateTime12.getChronology();
        int int14 = zonedDateTime12.getDayOfMonth();
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit16 = chronoField15.getRangeUnit();
        long long17 = zonedDateTime12.getLong((java.time.temporal.TemporalField) chronoField15);
        java.time.temporal.ValueRange valueRange18 = localDateTime6.range((java.time.temporal.TemporalField) chronoField15);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = localDateTime6.withDayOfYear((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): -2147483648");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField15.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit16 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit16.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 15L + "'", long17 == 15L);
        org.junit.Assert.assertNotNull(valueRange18);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.stream.IntStream.Builder builder0 = java.util.stream.IntStream.builder();
        java.util.stream.IntStream intStream1 = builder0.build();
        boolean boolean2 = intStream1.isParallel();
        java.util.stream.IntStream.Builder builder3 = java.util.stream.IntStream.builder();
        java.util.stream.IntStream intStream4 = builder3.build();
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.concat(intStream1, intStream4);
        java.util.function.IntToLongFunction intToLongFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = intStream4.mapToLong(intToLongFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.time.LocalDate localDate0 = java.time.LocalDate.MAX;
        java.time.LocalDate localDate1 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime2 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime4 = localTime2.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime6 = localTime2.withSecond((int) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime7 = localDate1.atTime(localTime2);
        boolean boolean8 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.LocalDate localDate9 = java.time.LocalDate.MAX;
        java.time.LocalDate localDate10 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime11 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime13 = localTime11.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime15 = localTime11.withSecond((int) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime16 = localDate10.atTime(localTime11);
        boolean boolean17 = localDate9.isEqual((java.time.chrono.ChronoLocalDate) localDate10);
        int int18 = localDate9.lengthOfYear();
        java.time.chrono.ChronoLocalDate chronoLocalDate19 = localDate1.with((java.time.temporal.TemporalAdjuster) localDate9);
        java.time.temporal.Temporal temporal20 = null;
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit22 = chronoField21.getBaseUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = localDate9.until(temporal20, temporalUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 365 + "'", int18 == 365);
        org.junit.Assert.assertNotNull(chronoLocalDate19);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit22 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit22.equals(java.time.temporal.ChronoUnit.WEEKS));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.HOUR_OF_AMPM;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.HOUR_OF_AMPM));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap2 = strMap0.headMap("iso8601");
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.FULL;
        java.time.format.TextStyle textStyle1 = textStyle0.asNormal();
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.FULL + "'", textStyle0.equals(java.time.format.TextStyle.FULL));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.FULL + "'", textStyle1.equals(java.time.format.TextStyle.FULL));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.malformedForLength(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Non-positive length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Set<java.lang.String> strSet3 = java.time.ZoneId.getAvailableZoneIds();
        java.util.List<java.lang.String> strList4 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet3);
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale12.getDisplayCountry();
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale6, locale8, locale9, locale10, locale11, locale12 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.List<java.util.Locale> localeList17 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList15);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "United States" + "'", str13, "United States");
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(localeList17);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.time.Instant instant0 = java.time.Instant.MIN;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.ofInstant(instant0, zoneId1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneId1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.Comparator<java.time.Duration> durationComparator0 = java.util.Comparator.naturalOrder();
        org.junit.Assert.assertNotNull(durationComparator0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.READING;
        org.junit.Assert.assertNotNull(attribute0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = java.time.LocalTime.of((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.time.Duration duration2 = java.time.Duration.ofSeconds((long) 1024, (long) (byte) 100);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.of("/tmp/hi!7388875500839471342hi!");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unknown chronology: /tmp/hi!7388875500839471342hi!");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.time.Period period1 = java.time.Period.ofYears((int) (short) 100);
        java.time.Period period3 = period1.multipliedBy(0);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField4.getBaseUnit();
        java.time.LocalDate localDate6 = java.time.LocalDate.MAX;
        java.time.LocalDate localDate7 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime8 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime10 = localTime8.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime12 = localTime8.withSecond((int) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime13 = localDate7.atTime(localTime8);
        boolean boolean14 = localDate6.isEqual((java.time.chrono.ChronoLocalDate) localDate7);
        boolean boolean15 = temporalUnit5.isSupportedBy((java.time.temporal.Temporal) localDate6);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = period3.get(temporalUnit5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Weeks");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = java.time.temporal.ValueRange.of(100L, 9L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value must be less than maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.plusSeconds((long) '#');
        java.lang.String str8 = zonedDateTime7.toString();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime9 = zonedDateTime7.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+997949704-04-14T08:40:34.999999999-18:00" + "'", str8, "+997949704-04-14T08:40:34.999999999-18:00");
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime9);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        boolean boolean2 = localTime0.isSupported(temporalUnit1);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime0);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField4.getRangeUnit();
        java.time.Duration duration6 = temporalUnit5.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList7 = duration6.getUnits();
        java.time.temporal.Temporal temporal8 = localTime0.minus((java.time.temporal.TemporalAmount) duration6);
        java.time.LocalTime localTime10 = localTime0.plusMinutes((long) (short) -1);
        java.time.ZoneOffset zoneOffset11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime12 = java.time.OffsetTime.of(localTime0, zoneOffset11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(temporalUnitList7);
        org.junit.Assert.assertNotNull(temporal8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) (byte) 0, 299105628160L);
        java.util.function.LongPredicate longPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = longStream2.noneMatch(longPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Set<java.lang.String> strSet3 = java.time.ZoneId.getAvailableZoneIds();
        java.util.List<java.lang.String> strList4 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet3);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        java.time.Duration duration7 = temporalUnit6.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList8 = duration7.getUnits();
        boolean boolean9 = strSet3.retainAll((java.util.Collection<java.time.temporal.TemporalUnit>) temporalUnitList8);
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit11 = chronoField10.getRangeUnit();
        java.time.Duration duration12 = temporalUnit11.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList13 = duration12.getUnits();
        java.util.stream.Stream<java.time.temporal.TemporalUnit> temporalUnitStream14 = temporalUnitList13.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = temporalUnitList8.addAll((java.util.Collection<java.time.temporal.TemporalUnit>) temporalUnitList13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(temporalUnitList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit11 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit11.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(temporalUnitList13);
        org.junit.Assert.assertNotNull(temporalUnitStream14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime2 = localTime0.plusHours((long) 100);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localTime0.query(booleanTemporalQuery3);
        java.time.LocalTime localTime5 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit6 = null;
        boolean boolean7 = localTime5.isSupported(temporalUnit6);
        java.time.chrono.Chronology chronology8 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime5);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit10 = chronoField9.getRangeUnit();
        java.time.Duration duration11 = temporalUnit10.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList12 = duration11.getUnits();
        java.time.temporal.Temporal temporal13 = localTime5.minus((java.time.temporal.TemporalAmount) duration11);
        java.time.LocalTime localTime15 = localTime5.plusMinutes((long) (short) -1);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        boolean boolean17 = localTime5.isSupported((java.time.temporal.TemporalField) chronoField16);
        int int18 = localTime0.get((java.time.temporal.TemporalField) chronoField16);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit10 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit10.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(temporalUnitList12);
        org.junit.Assert.assertNotNull(temporal13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField16.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.time.Duration duration1 = java.time.Duration.ofDays((long) (byte) 100);
        long long2 = duration1.toMinutes();
        boolean boolean3 = duration1.isNegative();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144000L + "'", long2 == 144000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.minusMinutes((long) (byte) 1);
        java.time.Instant instant8 = java.time.Instant.from((java.time.temporal.TemporalAccessor) zonedDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.LocalDateTime localDateTime6 = zonedDateTime5.toLocalDateTime();
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime7.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime12 = offsetDateTime11.toZonedDateTime();
        java.time.chrono.Chronology chronology13 = zonedDateTime12.getChronology();
        int int14 = zonedDateTime12.getDayOfMonth();
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit16 = chronoField15.getRangeUnit();
        long long17 = zonedDateTime12.getLong((java.time.temporal.TemporalField) chronoField15);
        java.time.temporal.ValueRange valueRange18 = localDateTime6.range((java.time.temporal.TemporalField) chronoField15);
        java.time.ZoneOffset zoneOffset19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime20 = localDateTime6.atOffset(zoneOffset19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField15.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit16 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit16.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 15L + "'", long17 == 15L);
        org.junit.Assert.assertNotNull(valueRange18);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getRangeUnit();
        java.time.Duration duration2 = temporalUnit1.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList3 = duration2.getUnits();
        java.util.stream.Stream<java.time.temporal.TemporalUnit> temporalUnitStream4 = temporalUnitList3.parallelStream();
        java.time.LocalTime localTime5 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit6 = null;
        boolean boolean7 = localTime5.isSupported(temporalUnit6);
        java.time.chrono.Chronology chronology8 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime5);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit10 = chronoField9.getRangeUnit();
        java.time.Duration duration11 = temporalUnit10.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList12 = duration11.getUnits();
        java.time.temporal.Temporal temporal13 = localTime5.minus((java.time.temporal.TemporalAmount) duration11);
        java.time.Duration duration15 = java.time.Duration.ofDays((long) (byte) 100);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime19 = offsetDateTime17.plusMinutes((-1078352399000L));
        boolean boolean20 = offsetDateTime16.isBefore(offsetDateTime19);
        java.time.temporal.Temporal temporal21 = duration15.subtractFrom((java.time.temporal.Temporal) offsetDateTime19);
        java.time.temporal.Temporal temporal22 = localTime5.minus((java.time.temporal.TemporalAmount) duration15);
        int int23 = temporalUnitList3.indexOf((java.lang.Object) duration15);
        long long24 = duration15.toMillis();
        java.time.Duration duration26 = duration15.plusMillis((long) (short) 1);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(temporalUnitList3);
        org.junit.Assert.assertNotNull(temporalUnitStream4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit10 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit10.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(temporalUnitList12);
        org.junit.Assert.assertNotNull(temporal13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(temporal21);
        org.junit.Assert.assertNotNull(temporal22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 8640000000L + "'", long24 == 8640000000L);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.time.Instant instant0 = java.time.Instant.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit3 = chronoField2.getBaseUnit();
        java.time.LocalDate localDate4 = java.time.LocalDate.MAX;
        java.time.LocalDate localDate5 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime6 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime8 = localTime6.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime10 = localTime6.withSecond((int) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime11 = localDate5.atTime(localTime6);
        boolean boolean12 = localDate4.isEqual((java.time.chrono.ChronoLocalDate) localDate5);
        boolean boolean13 = temporalUnit3.isSupportedBy((java.time.temporal.Temporal) localDate4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant14 = instant0.minus((long) 16, temporalUnit3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Weeks");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit3 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit3.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.chrono.Chronology chronology6 = zonedDateTime5.getChronology();
        java.time.ZonedDateTime zonedDateTime8 = zonedDateTime5.minusDays(8640000000L);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(zonedDateTime8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.LocalDateTime localDateTime6 = zonedDateTime5.toLocalDateTime();
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime7.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime12 = offsetDateTime11.toZonedDateTime();
        java.time.chrono.Chronology chronology13 = zonedDateTime12.getChronology();
        int int14 = zonedDateTime12.getDayOfMonth();
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit16 = chronoField15.getRangeUnit();
        long long17 = zonedDateTime12.getLong((java.time.temporal.TemporalField) chronoField15);
        java.time.temporal.ValueRange valueRange18 = localDateTime6.range((java.time.temporal.TemporalField) chronoField15);
        java.time.LocalTime localTime19 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit20 = null;
        boolean boolean21 = localTime19.isSupported(temporalUnit20);
        java.time.chrono.Chronology chronology22 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime19);
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        java.time.temporal.ValueRange valueRange24 = chronology22.range(chronoField23);
        boolean boolean25 = localDateTime6.equals((java.lang.Object) valueRange24);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField15.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit16 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit16.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 15L + "'", long17 == 15L);
        org.junit.Assert.assertNotNull(valueRange18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField23.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
        org.junit.Assert.assertNotNull(valueRange24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.io.File file3 = null;
        java.io.File file4 = java.io.File.createTempFile("hi!", "hi!", file3);
        java.net.URL uRL5 = file4.toURL();
        boolean boolean6 = strMap0.containsValue((java.lang.Object) file4);
        java.util.Collection<java.nio.charset.Charset> charsetCollection7 = strMap0.values();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file4.toString(), "/tmp/hi!1624105995999751103hi!");
        org.junit.Assert.assertNotNull(uRL5);
// flaky:         org.junit.Assert.assertEquals(uRL5.toString(), "file:/tmp/hi!1624105995999751103hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charsetCollection7);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime0.withNano(9);
        java.time.Instant instant5 = java.time.Instant.from((java.time.temporal.TemporalAccessor) offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(instant5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.security.Permission permission1 = null;
        java.security.AccessControlException accessControlException2 = new java.security.AccessControlException("12:00:00.000000100", permission1);
        java.security.Permission permission3 = accessControlException2.getPermission();
        org.junit.Assert.assertNull(permission3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange1 = chronoField0.range();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        boolean boolean2 = localTime0.isSupported(temporalUnit1);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime0);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField4.getRangeUnit();
        java.time.Duration duration6 = temporalUnit5.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList7 = duration6.getUnits();
        java.time.temporal.Temporal temporal8 = localTime0.minus((java.time.temporal.TemporalAmount) duration6);
        java.time.Duration duration10 = duration6.minusDays((long) 9);
        java.time.Duration duration12 = duration6.minusDays((long) 64);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(temporalUnitList7);
        org.junit.Assert.assertNotNull(temporal8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        boolean boolean2 = localTime0.isSupported(temporalUnit1);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime0);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField4.getRangeUnit();
        java.time.Duration duration6 = temporalUnit5.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList7 = duration6.getUnits();
        java.time.temporal.Temporal temporal8 = localTime0.minus((java.time.temporal.TemporalAmount) duration6);
        java.time.Duration duration10 = duration6.minusDays((long) 9);
        long long11 = duration6.toHours();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(temporalUnitList7);
        org.junit.Assert.assertNotNull(temporal8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 8765L + "'", long11 == 8765L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of((int) 'a', (int) (short) -1, (int) ' ', (int) (short) 0, 64, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.security.GeneralSecurityException generalSecurityException0 = new java.security.GeneralSecurityException();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str0 = java.io.File.pathSeparator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition(1024);
        parsePosition1.setErrorIndex((int) (byte) 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.time.LocalDate localDate0 = java.time.LocalDate.MAX;
        java.time.LocalDate localDate1 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime2 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime4 = localTime2.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime6 = localTime2.withSecond((int) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime7 = localDate1.atTime(localTime2);
        boolean boolean8 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery9 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean10 = localDate0.query(booleanTemporalQuery9);
        java.time.chrono.Era era11 = localDate0.getEra();
        java.io.File file14 = null;
        java.io.File file15 = java.io.File.createTempFile("hi!", "hi!", file14);
        java.net.URL uRL16 = file15.toURL();
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter(file15);
        printWriter17.write((-1));
        char[] charArray20 = new char[] {};
        printWriter17.write(charArray20);
        java.time.LocalDate localDate22 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime23 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime25 = localTime23.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime27 = localTime23.withSecond((int) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime28 = localDate22.atTime(localTime23);
        printWriter17.println((java.lang.Object) localTime23);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal30 = era11.adjustInto((java.time.temporal.Temporal) localTime23);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Era");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanTemporalQuery9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertTrue("'" + era11 + "' != '" + java.time.chrono.IsoEra.CE + "'", era11.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file15.toString(), "/tmp/hi!4142535548069270181hi!");
        org.junit.Assert.assertNotNull(uRL16);
// flaky:         org.junit.Assert.assertEquals(uRL16.toString(), "file:/tmp/hi!4142535548069270181hi!");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[]");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime28);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.LocalDateTime localDateTime6 = zonedDateTime5.toLocalDateTime();
        java.time.LocalDateTime localDateTime8 = localDateTime6.minusSeconds((long) (byte) -1);
        java.time.LocalTime localTime9 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit10 = null;
        boolean boolean11 = localTime9.isSupported(temporalUnit10);
        java.time.chrono.Chronology chronology12 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime9);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        java.time.temporal.ValueRange valueRange14 = chronology12.range(chronoField13);
        java.time.temporal.ValueRange valueRange15 = localDateTime6.range((java.time.temporal.TemporalField) chronoField13);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField13.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
        org.junit.Assert.assertNotNull(valueRange14);
        org.junit.Assert.assertNotNull(valueRange15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.plusSeconds((long) '#');
        java.time.LocalTime localTime8 = zonedDateTime5.toLocalTime();
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime5.plusDays((long) '4');
        int int11 = zonedDateTime10.getDayOfMonth();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.plusSeconds((long) '#');
        java.time.ZonedDateTime zonedDateTime9 = zonedDateTime5.minusMinutes((long) 'a');
        java.time.chrono.Chronology chronology10 = zonedDateTime9.getChronology();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.time.Period period1 = java.time.Period.ofWeeks(0);
        java.time.Period period2 = java.time.Period.from((java.time.temporal.TemporalAmount) period1);
        java.time.chrono.Chronology chronology3 = period1.getChronology();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.io.File file3 = null;
        java.io.File file4 = java.io.File.createTempFile("hi!", "hi!", file3);
        java.net.URL uRL5 = file4.toURL();
        boolean boolean6 = strMap0.containsValue((java.lang.Object) file4);
        java.lang.String str7 = file4.getPath();
        boolean boolean8 = file4.isDirectory();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file4.toString(), "/tmp/hi!1032054417973938377hi!");
        org.junit.Assert.assertNotNull(uRL5);
// flaky:         org.junit.Assert.assertEquals(uRL5.toString(), "file:/tmp/hi!1032054417973938377hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/tmp/hi!1032054417973938377hi!" + "'", str7, "/tmp/hi!1032054417973938377hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.security.Provider provider0 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "/tmp/hi!6254101283195309594hi!", "12:00:00.000000100", "/tmp/hi!6254101283195309594hi!", "hi!4407287824293098254hi!", "/tmp/hi!4581184008457397026hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = java.time.ZoneId.SHORT_IDS;
        // The following exception was thrown during execution in test generation
        try {
            java.security.Provider.Service service13 = new java.security.Provider.Service(provider0, "hi!4407287824293098254hi!", "hi!4407287824293098254hi!", "", (java.util.List<java.lang.String>) strList10, strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime0.minusSeconds((long) 9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime6 = offsetDateTime0.withDayOfYear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.lang.String str4 = file3.getCanonicalPath();
        java.io.File file7 = null;
        java.io.File file8 = java.io.File.createTempFile("hi!", "hi!", file7);
        java.lang.String str9 = file8.getCanonicalPath();
        boolean boolean10 = file3.renameTo(file8);
        boolean boolean11 = file8.isDirectory();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!4455267928687641561hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/tmp/hi!4455267928687641561hi!" + "'", str4, "/tmp/hi!4455267928687641561hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file8.toString(), "/tmp/hi!988655494513151183hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/tmp/hi!988655494513151183hi!" + "'", str9, "/tmp/hi!988655494513151183hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) (byte) 0);
        boolean boolean2 = longBuffer1.isDirect();
        java.nio.ByteOrder byteOrder3 = longBuffer1.order();
        java.nio.LongBuffer longBuffer5 = java.nio.LongBuffer.allocate((int) (byte) 0);
        boolean boolean6 = longBuffer5.isDirect();
        java.nio.ByteOrder byteOrder7 = longBuffer5.order();
        java.nio.LongBuffer longBuffer8 = longBuffer1.put(longBuffer5);
        long[] longArray15 = new long[] { 365, (byte) 100, '#', (short) 0, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer16 = longBuffer5.put(longArray15);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[365, 100, 35, 0, 1, 10]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress[] inetAddressArray1 = java.net.InetAddress.getAllByName("/tmp/hi!4455267928687641561hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: /tmp/hi!4455267928687641561hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.SHORT;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle0);
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.SHORT + "'", formatStyle0.equals(java.time.format.FormatStyle.SHORT));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.time.Instant instant0 = java.time.Instant.MIN;
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime1.plusMinutes((-1078352399000L));
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime3.atZoneSimilarLocal(zoneId4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.ofInstant(instant0, zoneId4);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.time.LocalDate localDate0 = java.time.LocalDate.MAX;
        java.time.LocalDate localDate1 = java.time.LocalDate.MAX;
        java.time.LocalTime localTime2 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime4 = localTime2.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime6 = localTime2.withSecond((int) (byte) 10);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime7 = localDate1.atTime(localTime2);
        boolean boolean8 = localDate0.isEqual((java.time.chrono.ChronoLocalDate) localDate1);
        int int9 = localDate0.lengthOfYear();
        java.time.LocalDate localDate10 = java.time.LocalDate.from((java.time.temporal.TemporalAccessor) localDate0);
        java.time.Month month11 = java.time.Month.NOVEMBER;
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        boolean boolean13 = month11.isSupported((java.time.temporal.TemporalField) chronoField12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange14 = localDate10.range((java.time.temporal.TemporalField) chronoField12);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: SecondOfMinute");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 365 + "'", int9 == 365);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + month11 + "' != '" + java.time.Month.NOVEMBER + "'", month11.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField12.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.plusSeconds((long) '#');
        java.time.LocalTime localTime8 = zonedDateTime5.toLocalTime();
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime5.plusDays((long) '4');
        java.time.ZoneId zoneId11 = zonedDateTime10.getZone();
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime12.plusMinutes((-1078352399000L));
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit16 = chronoField15.getRangeUnit();
        java.time.Duration duration17 = temporalUnit16.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList18 = duration17.getUnits();
        java.time.OffsetDateTime offsetDateTime19 = offsetDateTime14.plus((java.time.temporal.TemporalAmount) duration17);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.OffsetDateTime offsetDateTime22 = offsetDateTime14.with((java.time.temporal.TemporalField) chronoField20, (long) (short) 0);
        java.time.ZonedDateTime zonedDateTime23 = offsetDateTime14.toZonedDateTime();
        int int24 = zonedDateTime10.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField15.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit16 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit16.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(temporalUnitList18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime3 = offsetTime0.plus((long) (-2147483648), temporalUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.ZoneOffset zoneOffset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime2 = offsetTime0.withOffsetSameLocal(zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.security.SignatureException signatureException0 = new java.security.SignatureException();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.time.Clock clock0 = null;
        java.time.Duration duration2 = java.time.Duration.ofDays((long) (byte) 100);
        java.time.Duration duration4 = duration2.minusMinutes((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock5 = java.time.Clock.offset(clock0, duration2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseClock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.time.format.ResolverStyle resolverStyle2 = dateTimeFormatter0.getResolverStyle();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertTrue("'" + resolverStyle2 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle2.equals(java.time.format.ResolverStyle.STRICT));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.lang.String str4 = file3.getName();
        boolean boolean5 = file3.canWrite();
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter(file3);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!4320629406646414325hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!4320629406646414325hi!" + "'", str4, "hi!4320629406646414325hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.nio.channels.FileChannel.MapMode mapMode0 = java.nio.channels.FileChannel.MapMode.PRIVATE;
        org.junit.Assert.assertNotNull(mapMode0);
        org.junit.Assert.assertEquals(mapMode0.toString(), "PRIVATE");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.plusSeconds((long) '#');
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime12 = offsetDateTime10.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime13 = offsetDateTime12.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime13.plusSeconds((long) '#');
        boolean boolean16 = zonedDateTime7.isEqual((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime15);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit18 = chronoField17.getBaseUnit();
        java.time.temporal.ValueRange valueRange19 = zonedDateTime7.range((java.time.temporal.TemporalField) chronoField17);
        boolean boolean21 = valueRange19.isValidValue((long) 365);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField17.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit18 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit18.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(valueRange19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.io.File file3 = null;
        java.io.File file4 = java.io.File.createTempFile("hi!", "hi!", file3);
        java.net.URL uRL5 = file4.toURL();
        boolean boolean6 = strMap0.containsValue((java.lang.Object) file4);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.nio.charset.Charset>> strEntrySet7 = strMap0.entrySet();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file4.toString(), "/tmp/hi!654941816608673034hi!");
        org.junit.Assert.assertNotNull(uRL5);
// flaky:         org.junit.Assert.assertEquals(uRL5.toString(), "file:/tmp/hi!654941816608673034hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strEntrySet7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.of("hi!7186491976796649502hi!");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: hi!7186491976796649502hi!");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.stream.IntStream.Builder builder0 = java.util.stream.IntStream.builder();
        java.util.stream.IntStream intStream1 = builder0.build();
        java.util.function.IntUnaryOperator intUnaryOperator2 = java.util.function.IntUnaryOperator.identity();
        java.util.stream.IntStream intStream3 = intStream1.map(intUnaryOperator2);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intUnaryOperator2);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.time.ZoneOffset zoneOffset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.ofOffset("United States", zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "hi!", file2);
        java.net.URL uRL4 = file3.toURL();
        java.security.cert.Certificate[] certificateArray5 = new java.security.cert.Certificate[] {};
        java.security.CodeSource codeSource6 = new java.security.CodeSource(uRL4, certificateArray5);
        int int7 = uRL4.getPort();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!4138053522540912114hi!");
        org.junit.Assert.assertNotNull(uRL4);
// flaky:         org.junit.Assert.assertEquals(uRL4.toString(), "file:/tmp/hi!4138053522540912114hi!");
        org.junit.Assert.assertNotNull(certificateArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        char char0 = java.io.File.separatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '/' + "'", char0 == '/');
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusHours((long) (-2147483648));
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.plusMinutes((-1078352399000L));
        boolean boolean6 = offsetTime2.equals((java.lang.Object) offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.time.Duration duration1 = java.time.Duration.ofDays((long) (byte) 100);
        java.time.Duration duration3 = duration1.minusMinutes((long) ' ');
        java.time.LocalTime localTime4 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime6 = localTime4.plusNanos((long) (byte) 100);
        java.time.temporal.Temporal temporal7 = duration3.addTo((java.time.temporal.Temporal) localTime6);
        java.time.LocalTime localTime8 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime10 = localTime8.plusHours((long) 100);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery11 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean12 = localTime8.query(booleanTemporalQuery11);
        java.lang.Boolean boolean13 = localTime6.query(booleanTemporalQuery11);
        java.time.Month month14 = java.time.Month.NOVEMBER;
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        boolean boolean16 = month14.isSupported((java.time.temporal.TemporalField) chronoField15);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField15);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(temporal7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(booleanTemporalQuery11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertTrue("'" + month14 + "' != '" + java.time.Month.NOVEMBER + "'", month14.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField15.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.net.Proxy proxy0 = java.net.Proxy.NO_PROXY;
        org.junit.Assert.assertNotNull(proxy0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        boolean boolean2 = localTime0.isSupported(temporalUnit1);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime0);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField4.getRangeUnit();
        java.time.Duration duration6 = temporalUnit5.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList7 = duration6.getUnits();
        java.time.temporal.Temporal temporal8 = localTime0.minus((java.time.temporal.TemporalAmount) duration6);
        java.time.Duration duration10 = java.time.Duration.ofDays((long) (byte) 100);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime12.plusMinutes((-1078352399000L));
        boolean boolean15 = offsetDateTime11.isBefore(offsetDateTime14);
        java.time.temporal.Temporal temporal16 = duration10.subtractFrom((java.time.temporal.Temporal) offsetDateTime14);
        java.time.temporal.Temporal temporal17 = localTime0.minus((java.time.temporal.TemporalAmount) duration10);
        java.time.Month month18 = java.time.Month.FEBRUARY;
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery19 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean20 = month18.query(booleanTemporalQuery19);
        java.time.Month month22 = month18.plus((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal23 = localTime0.with((java.time.temporal.TemporalAdjuster) month18);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MonthOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(temporalUnitList7);
        org.junit.Assert.assertNotNull(temporal8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(temporal16);
        org.junit.Assert.assertNotNull(temporal17);
        org.junit.Assert.assertTrue("'" + month18 + "' != '" + java.time.Month.FEBRUARY + "'", month18.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery19);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertTrue("'" + month22 + "' != '" + java.time.Month.MARCH + "'", month22.equals(java.time.Month.MARCH));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.stream.IntStream.Builder builder0 = java.util.stream.IntStream.builder();
        java.util.stream.IntStream intStream1 = builder0.build();
        boolean boolean2 = intStream1.isParallel();
        java.util.stream.IntStream.Builder builder3 = java.util.stream.IntStream.builder();
        java.util.stream.IntStream intStream4 = builder3.build();
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.concat(intStream1, intStream4);
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = intStream1.onClose(runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusHours((long) (-2147483648));
        java.time.ZoneOffset zoneOffset3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime4 = offsetTime2.withOffsetSameInstant(zoneOffset3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.time.Period period1 = java.time.Period.ofYears((int) (short) 100);
        java.time.LocalDate localDate2 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime8 = offsetDateTime7.toZonedDateTime();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.plusMinutes((-1078352399000L));
        java.time.temporal.Temporal temporal12 = offsetDateTime7.adjustInto((java.time.temporal.Temporal) offsetDateTime9);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getBaseUnit();
        long long15 = localDate2.until(temporal12, temporalUnit14);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = period1.get(temporalUnit14);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Weeks");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(temporal12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField13.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-106979304L) + "'", long15 == (-106979304L));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        int int1 = localDateTime0.getSecond();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        boolean boolean2 = localTime0.isSupported(temporalUnit1);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime0);
        java.time.chrono.ChronoLocalDate chronoLocalDate7 = chronology3.date(0, (int) (short) 1, (int) (short) 1);
        java.io.File file10 = null;
        java.io.File file11 = java.io.File.createTempFile("hi!", "hi!", file10);
        java.net.URL uRL12 = file11.toURL();
        java.io.PrintWriter printWriter13 = new java.io.PrintWriter(file11);
        printWriter13.write((-1));
        char[] charArray16 = new char[] {};
        printWriter13.write(charArray16);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.io.File file22 = null;
        java.io.File file23 = java.io.File.createTempFile("hi!", "hi!", file22);
        java.net.URL uRL24 = file23.toURL();
        java.io.PrintWriter printWriter25 = new java.io.PrintWriter(file23);
        printWriter25.println((-1));
        java.time.Month month29 = java.time.Month.FEBRUARY;
        int int30 = month29.getValue();
        java.lang.Object[] objArray31 = new java.lang.Object[] { int30 };
        java.io.PrintWriter printWriter32 = printWriter25.printf("", objArray31);
        java.io.PrintWriter printWriter33 = printWriter13.printf(locale18, "iso8601", objArray31);
        boolean boolean34 = chronology3.equals((java.lang.Object) objArray31);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronoLocalDate7);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file11.toString(), "/tmp/hi!4739759002852814524hi!");
        org.junit.Assert.assertNotNull(uRL12);
// flaky:         org.junit.Assert.assertEquals(uRL12.toString(), "file:/tmp/hi!4739759002852814524hi!");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file23.toString(), "/tmp/hi!1758113912009903254hi!");
        org.junit.Assert.assertNotNull(uRL24);
        org.junit.Assert.assertEquals(uRL24.toString(), "file:/tmp/hi!1758113912009903254hi!");
        org.junit.Assert.assertTrue("'" + month29 + "' != '" + java.time.Month.FEBRUARY + "'", month29.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[2]");
        org.junit.Assert.assertNotNull(printWriter32);
        org.junit.Assert.assertNotNull(printWriter33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.time.Period period1 = java.time.Period.ofWeeks(0);
        java.time.Period period2 = java.time.Period.from((java.time.temporal.TemporalAmount) period1);
        java.time.Period period4 = period2.withMonths(10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getRangeUnit();
        java.time.Duration duration2 = temporalUnit1.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList3 = duration2.getUnits();
        java.util.stream.Stream<java.time.temporal.TemporalUnit> temporalUnitStream4 = temporalUnitList3.parallelStream();
        boolean boolean5 = temporalUnitList3.isEmpty();
        java.lang.Object[] objArray6 = temporalUnitList3.toArray();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit8 = chronoField7.getRangeUnit();
        java.time.Duration duration9 = temporalUnit8.getDuration();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList10 = duration9.getUnits();
        java.time.LocalTime localTime11 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime13 = localTime11.plusHours((long) 100);
        java.time.LocalTime localTime15 = localTime13.minusHours((long) (byte) -1);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField16.getRangeUnit();
        boolean boolean18 = localTime15.isSupported((java.time.temporal.TemporalField) chronoField16);
        boolean boolean19 = temporalUnitList10.equals((java.lang.Object) boolean18);
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        boolean boolean21 = temporalUnitList10.equals((java.lang.Object) locale20);
        boolean boolean22 = temporalUnitList3.containsAll((java.util.Collection<java.time.temporal.TemporalUnit>) temporalUnitList10);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(temporalUnitList3);
        org.junit.Assert.assertNotNull(temporalUnitStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Seconds, Nanos]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Seconds, Nanos]");
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit8 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit8.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(temporalUnitList10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField16.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.text.FieldPosition fieldPosition1 = new java.text.FieldPosition(1024);
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.util.Locale locale3 = locale2.stripExtensions();
        boolean boolean4 = fieldPosition1.equals((java.lang.Object) locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime5 = offsetDateTime4.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.plusSeconds((long) '#');
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.MAX;
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.plusMinutes((-1078352399000L));
        java.time.OffsetDateTime offsetDateTime12 = offsetDateTime10.plusWeeks(100L);
        java.time.ZonedDateTime zonedDateTime13 = offsetDateTime12.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime13.plusSeconds((long) '#');
        boolean boolean16 = zonedDateTime7.isEqual((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime15);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.temporal.TemporalUnit temporalUnit18 = chronoField17.getBaseUnit();
        java.time.temporal.ValueRange valueRange19 = zonedDateTime7.range((java.time.temporal.TemporalField) chronoField17);
        int int20 = zonedDateTime7.getDayOfMonth();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField17.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + temporalUnit18 + "' != '" + java.time.temporal.ChronoUnit.WEEKS + "'", temporalUnit18.equals(java.time.temporal.ChronoUnit.WEEKS));
        org.junit.Assert.assertNotNull(valueRange19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 14 + "'", int20 == 14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) (byte) 0, 299105628160L);
        long long3 = longStream2.sum();
        java.util.function.LongToDoubleFunction longToDoubleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = longStream2.mapToDouble(longToDoubleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1265980401122990080L) + "'", long3 == (-1265980401122990080L));
    }
}
