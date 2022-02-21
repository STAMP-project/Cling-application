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
        java.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.parse((java.lang.CharSequence) "hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = new java.net.URL(uRL0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.function.LongSupplier longSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream1 = java.util.stream.LongStream.generate(longSupplier0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress1 = java.net.InetAddress.getByName("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.time.Month month0 = java.time.Month.JULY;
        java.time.DayOfWeek dayOfWeek2 = null;
        java.time.LocalTime localTime3 = null;
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition5 = null;
        java.time.ZoneOffset zoneOffset6 = null;
        java.time.ZoneOffset zoneOffset7 = null;
        java.time.ZoneOffset zoneOffset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransitionRule zoneOffsetTransitionRule9 = java.time.zone.ZoneOffsetTransitionRule.of(month0, (int) ' ', dayOfWeek2, localTime3, false, timeDefinition5, zoneOffset6, zoneOffset7, zoneOffset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: time");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JULY + "'", month0.equals(java.time.Month.JULY));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.function.IntConsumer intConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            intStream7.forEachOrdered(intConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.function.IntPredicate intPredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = intStream7.anyMatch(intPredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.Month month1 = java.time.Month.JULY;
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.formatTo((java.time.temporal.TemporalAccessor) month1, appendable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: appendable");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.JULY + "'", month1.equals(java.time.Month.JULY));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange4 = java.time.temporal.ValueRange.of((long) '#', (long) (-1), (long) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest minimum value must be less than largest minimum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.time.LocalDate localDate0 = null;
        java.time.LocalTime localTime1 = null;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.UTC;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.of(localDate0, localTime1, zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer3 = shortBuffer1.limit((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortBuffer1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.net.URLConnection.setDefaultRequestProperty("", "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Locale locale2 = new java.util.Locale("");
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter3 = java.time.format.DateTimeFormatter.ofPattern("hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("OptionalLong[0]", "", "OptionalLong[0]");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: optionallong[0]");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress7 = java.net.InetAddress.getByAddress(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, 0, 10, 100]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.time.LocalDateTime localDateTime0 = null;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.of(localDateTime0, zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: dateTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.function.DoubleBinaryOperator doubleBinaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble8 = doubleStream5.reduce(doubleBinaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str0 = org.apache.commons.lang3.ClassUtils.INNER_CLASS_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "$" + "'", str0, "$");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.net.URL uRL0 = null;
        java.net.URLStreamHandler uRLStreamHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL(uRL0, "hi!", uRLStreamHandler2);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("hi!", "$");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: $");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.chrono.Era era3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = chronology2.prolepticYear(era3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Era must be IsoEra");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            java.time.DayOfWeek dayOfWeek1 = java.time.DayOfWeek.of((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfWeek: 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream5.parallel();
        java.util.function.DoubleToIntFunction doubleToIntFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = doubleStream5.mapToInt(doubleToIntFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream7 = doubleStream5.limit(10L);
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = doubleStream5.onClose(runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = doubleStream6.onClose(runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Enumeration<java.net.NetworkInterface> networkInterfaceEnumeration0 = java.net.NetworkInterface.getNetworkInterfaces();
        org.junit.Assert.assertNotNull(networkInterfaceEnumeration0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange2 = chronoField1.range();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = zoneOffset0.getLong((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = new java.io.File(uRI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress1 = java.net.InetAddress.getByName("$");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: $: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.function.IntBinaryOperator intBinaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = intStream7.reduce(0, intBinaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        long long0 = java.security.Key.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 6603384152749567654L + "'", long0 == 6603384152749567654L);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.lang.String str7 = locale4.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.Month month3 = java.time.Month.JULY;
        int int4 = month3.minLength();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime5 = chronology2.zonedDateTime((java.time.temporal.TemporalAccessor) month3);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: JULY of type java.time.Month");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + month3 + "' != '" + java.time.Month.JULY + "'", month3.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException0 = new java.security.NoSuchAlgorithmException();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.net.FileNameMap fileNameMap0 = null;
        java.net.URLConnection.setFileNameMap(fileNameMap0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.lang.String str3 = chronology2.toString();
        java.time.chrono.Era era4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate7 = chronology2.dateYearDay(era4, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Era must be IsoEra");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISO" + "'", str3, "ISO");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Hashtable<java.time.DayOfWeek, java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>> dayOfWeekMap1 = new java.util.Hashtable<java.time.DayOfWeek, java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.function.IntPredicate intPredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = intStream7.noneMatch(intPredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        java.lang.String str2 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.function.LongConsumer longConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.time.temporal.ValueRange valueRange3 = java.time.temporal.ValueRange.of((-1L), (long) (byte) 10, (long) 31);
        org.junit.Assert.assertNotNull(valueRange3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField0.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange4 = chronology2.range(chronoField3);
        java.time.Month month5 = java.time.Month.JULY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate6 = chronology2.date((java.time.temporal.TemporalAccessor) month5);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDate from TemporalAccessor: JULY of type java.time.Month");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.JULY + "'", month5.equals(java.time.Month.JULY));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.time.Clock clock0 = null;
        java.time.Duration duration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock2 = java.time.Clock.tick(clock0, duration1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseClock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        char[] charArray4 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        char[] charArray7 = new char[] { 'x' };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer10 = charBuffer5.get(charArray7, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "x");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "x");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[x]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.time.format.TextStyle textStyle3 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle4 = textStyle3.asNormal();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale6.getDisplayScript(locale9);
        java.lang.String str12 = zoneOffset1.getDisplayName(textStyle3, locale6);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        long long15 = chronoField13.checkValidValue((long) 16);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = zoneOffset1.get((java.time.temporal.TemporalField) chronoField13);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MilliOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + textStyle3 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle3.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField13.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 16L + "'", long15 == 16L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream5.parallel();
        java.util.function.DoublePredicate doublePredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = doubleStream5.allMatch(doublePredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream5.parallel();
        java.util.stream.Stream<java.lang.Double> doubleStream8 = doubleStream7.boxed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = doubleStream7.limit((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.THURSDAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.from((java.time.temporal.TemporalAccessor) dayOfWeek0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: THURSDAY of type java.time.DayOfWeek");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.THURSDAY));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = localTime1.minusHours(1L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime6 = localTime4.withMinute((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 120");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream5.parallel();
        java.util.stream.Stream<java.lang.Double> doubleStream8 = doubleStream7.boxed();
        java.util.function.BinaryOperator<java.lang.Double> doubleBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double11 = doubleStream8.reduce((java.lang.Double) (-1.0d), doubleBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        byte byte7 = byteBuffer6.get();
        java.time.Period period9 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period11 = period9.plusYears((long) (short) 0);
        java.time.Period period13 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod14 = period11.plus((java.time.temporal.TemporalAmount) period13);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.wrap(byteArray20);
        boolean boolean22 = period13.equals((java.lang.Object) byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer6.put(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(chronoPeriod14);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.of("Z", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: aliasMap");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.concurrent.TimeoutException timeoutException0 = new java.util.concurrent.TimeoutException();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap5 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean7 = charListMap5.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray9 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList10 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList10, charArray9);
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream19 = java.util.stream.IntStream.of(intArray18);
        java.util.stream.IntStream intStream20 = charListMap5.put(charList10, intStream19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = charSet2.addAll((java.util.Collection<java.lang.Character>) charList10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNull(intStream20);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.time.LocalTime localTime3 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology4 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime3);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange6 = chronology4.range(chronoField5);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer1, (java.lang.Object) valueRange6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteOrder byteOrder7 = byteBuffer6.order();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.function.IntUnaryOperator intUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = intStream7.map(intUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Comparator<java.time.OffsetDateTime> offsetDateTimeComparator0 = java.time.OffsetDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(offsetDateTimeComparator0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList2 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList2, charArray1);
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList6 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList6, charArray5);
        boolean boolean8 = charList2.removeAll((java.util.Collection<java.lang.Character>) charList6);
        java.util.ListIterator<java.lang.Character> charItor9 = charList2.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            charItor9.set((java.lang.Character) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charItor9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        char char0 = java.io.File.pathSeparatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ':' + "'", char0 == ':');
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.time.chrono.Chronology chronology7 = java.time.chrono.Chronology.ofLocale(locale4);
        java.time.LocalTime localTime9 = java.time.LocalTime.ofSecondOfDay((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate10 = chronology7.date((java.time.temporal.TemporalAccessor) localTime9);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDate from TemporalAccessor: 00:00 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        byte byte7 = byteBuffer6.get();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer6.put(byteArray13, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet3 = charListMap2.entrySet();
        java.util.ArrayList<java.lang.Character> charList4 = null;
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream12 = java.util.stream.IntStream.of(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = charListMap2.replace(charList4, intStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charListEntrySet3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.net.Proxy.Type type2 = java.net.Proxy.Type.DIRECT;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer1, (java.lang.Object) type2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + java.net.Proxy.Type.DIRECT + "'", type2.equals(java.net.Proxy.Type.DIRECT));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer6.get(byteArray12, (int) 'x', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        // The following exception was thrown during execution in test generation
        try {
            intStream17.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.LocalTime localTime22 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology23 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime22);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal24 = localDateTime18.adjustInto((java.time.temporal.Temporal) localTime22);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        java.time.temporal.ValueRange valueRange4 = chronoField3.range();
        boolean boolean5 = charSet2.remove((java.lang.Object) valueRange4);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField3.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        org.junit.Assert.assertNotNull(valueRange4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(16);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream18 = intStream17.sorted();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.lang.String str10 = locale7.getScript();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.util.Locale locale19 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale19.getDisplayScript(locale22);
        java.time.chrono.Chronology chronology25 = java.time.chrono.Chronology.ofLocale(locale22);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale29 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getDisplayCountry();
        java.lang.String str34 = locale29.getDisplayScript(locale32);
        java.util.Locale locale36 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getDisplayCountry();
        java.lang.String str41 = locale36.getDisplayScript(locale39);
        java.time.temporal.ChronoField chronoField42 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.UTC;
        boolean boolean44 = chronoField42.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset43);
        java.time.format.TextStyle textStyle45 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle46 = textStyle45.asNormal();
        java.util.Locale locale48 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.util.Locale locale51 = new java.util.Locale("");
        java.lang.String str52 = locale51.getDisplayCountry();
        java.lang.String str53 = locale48.getDisplayScript(locale51);
        java.lang.String str54 = zoneOffset43.getDisplayName(textStyle45, locale48);
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale56.getDisplayCountry();
        java.util.Locale locale59 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale61 = new java.util.Locale("");
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale7, locale15, locale22, locale27, locale29, locale36, locale48, locale56, locale59, locale61 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList63);
        java.lang.String str67 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList1, "ISO");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + chronoField42 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField42.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + textStyle45 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle45.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle46 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle46.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Z" + "'", str54, "Z");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ArrayList" + "'", str67, "ArrayList");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.lang.String str7 = locale1.getDisplayCountry();
        java.lang.String str9 = locale1.getExtension('x');
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.THURSDAY;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) dayOfWeek0, "Z");
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.time" + "'", str2, "java.time");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.LocalDate localDate21 = localDateChronoZonedDateTime20.toLocalDate();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime22 = localDateChronoZonedDateTime20.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime22);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray2 = new java.time.temporal.TemporalField[] { chronoField1 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet3 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet3, temporalFieldArray2);
        java.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet3);
        java.util.Locale locale6 = dateTimeFormatter0.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale6.getExtension(':');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: :");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.time.Period period1 = java.time.Period.ofYears(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.lang.String str3 = chronology2.toString();
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int6 = localDate5.getMonthValue();
        int int7 = localDate5.getDayOfYear();
        java.time.LocalDate localDate9 = localDate5.withYear((int) ' ');
        java.time.chrono.Era era10 = localDate5.getEra();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate14 = chronology2.date(era10, 4096, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISO" + "'", str3, "ISO");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + era10 + "' != '" + java.time.chrono.IsoEra.CE + "'", era10.equals(java.time.chrono.IsoEra.CE));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.security.KeyException keyException0 = new java.security.KeyException();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = byteBuffer8.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = localTime1.minusHours(1L);
        java.time.format.DateTimeFormatter dateTimeFormatter5 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localTime1.format(dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = intStream7.spliterator();
        java.util.function.IntBinaryOperator intBinaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt10 = intStream7.reduce(intBinaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intSpliterator8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.unmappableForLength(16384);
        // The following exception was thrown during execution in test generation
        try {
            coderResult1.throwException();
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnmappableCharacterException; message: Input length = 16384");
        } catch (java.nio.charset.UnmappableCharacterException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(coderResult1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.time.Month month0 = java.time.Month.JUNE;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JUNE + "'", month0.equals(java.time.Month.JUNE));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.Period period11 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period13 = period11.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod15 = period13.multipliedBy((int) ' ');
        java.time.LocalDate localDate17 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit19 = chronoField18.getRangeUnit();
        boolean boolean20 = localDate17.isSupported(temporalUnit19);
        long long21 = chronoPeriod15.get(temporalUnit19);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal22 = localTime1.plus((long) (short) -1, temporalUnit19);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Days");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(chronoPeriod15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit19 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit19.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream7 = doubleStream5.limit(10L);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = doubleStream7.reduce((double) '4', doubleBinaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter5 = new java.io.PrintWriter(file2, "ArrayList");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ArrayList");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList2 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList2, charArray1);
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList6 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList6, charArray5);
        boolean boolean8 = charList2.removeAll((java.util.Collection<java.lang.Character>) charList6);
        java.util.ListIterator<java.lang.Character> charItor9 = charList2.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            charItor9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charItor9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList2 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList2, charArray1);
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList6 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList6, charArray5);
        boolean boolean8 = charList2.removeAll((java.util.Collection<java.lang.Character>) charList6);
        java.util.ListIterator<java.lang.Character> charItor9 = charList2.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = charItor9.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charItor9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.time.Month month0 = java.time.Month.NOVEMBER;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.NOVEMBER + "'", month0.equals(java.time.Month.NOVEMBER));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.net.MalformedURLException malformedURLException2 = new java.net.MalformedURLException();
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) malformedURLException2);
        java.security.GeneralSecurityException generalSecurityException4 = new java.security.GeneralSecurityException("ISO", (java.lang.Throwable) iOException3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream6.sequential();
        java.util.function.DoublePredicate doublePredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = doubleStream7.noneMatch(doublePredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.BCE;
        java.time.temporal.TemporalField temporalField1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = isoEra0.range(temporalField1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: field");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra0.equals(java.time.chrono.IsoEra.BCE));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        int int3 = localDate1.getDayOfYear();
        java.time.LocalDate localDate5 = localDate1.withYear((int) ' ');
        java.time.chrono.Era era6 = localDate1.getEra();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange8 = chronoField7.range();
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField7.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange10 = era6.range((java.time.temporal.TemporalField) chronoField7);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + era6 + "' != '" + java.time.chrono.IsoEra.CE + "'", era6.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange8);
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.function.UnaryOperator<java.time.DayOfWeek> dayOfWeekUnaryOperator0 = java.util.function.UnaryOperator.identity();
        org.junit.Assert.assertNotNull(dayOfWeekUnaryOperator0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.WRITE;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.WRITE + "'", accessMode0.equals(java.nio.file.AccessMode.WRITE));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.from((java.time.temporal.TemporalAccessor) localDateTime0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: -999999999-01-01T00:00 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean4 = instant1.isAfter(instant3);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.UTC;
        boolean boolean9 = chronoField7.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset8);
        java.time.format.TextStyle textStyle10 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle11 = textStyle10.asNormal();
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.lang.String str19 = zoneOffset8.getDisplayName(textStyle10, locale13);
        int int20 = zoneOffset8.getTotalSeconds();
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset8);
        java.time.LocalDateTime localDateTime23 = localDateTime21.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime25 = localDateTime23.atZone((java.time.ZoneId) zoneOffset24);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.UTC;
        boolean boolean28 = chronoField26.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.of(localDateTime23, (java.time.ZoneId) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime30 = java.time.ZonedDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset27);
        java.time.chrono.Chronology chronology31 = zonedDateTime30.getChronology();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle11 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle11.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField26.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate3 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int4 = localDate3.getMonthValue();
        int int5 = localDate3.getDayOfYear();
        boolean boolean6 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.from((java.time.temporal.TemporalAccessor) localDate3);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: 1970-01-11 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.Date date1 = new java.util.Date((long) (short) 100);
        java.lang.String str2 = date1.toGMTString();
        date1.setSeconds((int) '4');
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:52 UTC 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str2, "1 Jan 1970 00:00:00 GMT");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.parse((java.lang.CharSequence) "J", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'J' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Comparator<java.time.LocalDateTime> localDateTimeComparator0 = java.util.Comparator.reverseOrder();
        org.junit.Assert.assertNotNull(localDateTimeComparator0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.LocalTime localTime2 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime2);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange5 = chronology3.range(chronoField4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = zoneOffset0.get((java.time.temporal.TemporalField) chronoField4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField4.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange3 = java.time.temporal.ValueRange.of((long) 0, (long) 'a', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
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
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "Z", 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "J", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.Period period5 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod6 = period3.plus((java.time.temporal.TemporalAmount) period5);
        java.time.chrono.ChronoPeriod chronoPeriod8 = period5.multipliedBy((int) '#');
        java.time.temporal.TemporalUnit temporalUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronoPeriod8.get(temporalUnit9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: null");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoPeriod6);
        org.junit.Assert.assertNotNull(chronoPeriod8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate((int) (short) 1);
        float float2 = floatBuffer1.get();
        java.nio.FloatBuffer floatBuffer4 = java.nio.FloatBuffer.allocate((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer5 = floatBuffer1.put(floatBuffer4);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(floatBuffer4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.time.Month month3 = java.time.Month.JULY;
        int int4 = month3.minLength();
        java.time.Month month6 = month3.plus(0L);
        java.util.stream.DoubleStream doubleStream7 = java.util.stream.DoubleStream.empty();
        double[] doubleArray12 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream13 = java.util.stream.DoubleStream.of(doubleArray12);
        java.time.Month month14 = java.time.Month.JUNE;
        java.lang.Object[] objArray15 = new java.lang.Object[] { month6, doubleStream7, doubleStream13, month14 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "1 Jan 1970 00:00:00 GMT", objArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + month3 + "' != '" + java.time.Month.JULY + "'", month3.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.JULY + "'", month6.equals(java.time.Month.JULY));
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + month14 + "' != '" + java.time.Month.JUNE + "'", month14.equals(java.time.Month.JUNE));
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.READING;
        java.lang.String str1 = attribute0.toString();
        org.junit.Assert.assertNotNull(attribute0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.text.AttributedCharacterIterator$Attribute(reading)" + "'", str1, "java.text.AttributedCharacterIterator$Attribute(reading)");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.stream.Stream<java.security.GeneralSecurityException> generalSecurityExceptionStream0 = java.util.stream.Stream.empty();
        org.junit.Assert.assertNotNull(generalSecurityExceptionStream0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.net.URLConnection.setDefaultRequestProperty("1970-W02-7", "Z");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId1 = java.time.ZoneId.of("1969-12-27T20:00:16.000000097");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1969-12-27T20:00:16.000000097");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        boolean[] booleanArray8 = new boolean[] { true, false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "J", booleanArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, false, true, true, true]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = intStream7.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt9 = intStream7.max();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intSpliterator8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.OptionalInt optionalInt8 = intStream7.findFirst();
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt8.orElseGet(intSupplier9);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String str0 = org.apache.commons.lang3.ClassUtils.PACKAGE_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "." + "'", str0, ".");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char19 = charList7.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.security.Provider provider0 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "ISO", "Z", "1 Jan 1970 00:00:00 GMT", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.Provider.Service service13 = new java.security.Provider.Service(provider0, "ISO", "ArrayList", "$", (java.util.List<java.lang.String>) strList10, strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        java.io.File file3 = file2.getCanonicalFile();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter5 = new java.io.PrintWriter(file2, "Z");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Z");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertNotNull(file3);
// flaky:         org.junit.Assert.assertEquals(file3.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/experiment");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str0 = java.io.File.pathSeparator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        java.nio.ShortBuffer shortBuffer9 = byteBuffer8.asShortBuffer();
        java.nio.CharBuffer charBuffer10 = byteBuffer8.asCharBuffer();
        char[] charArray15 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer16 = java.nio.CharBuffer.wrap(charArray15);
        java.nio.CharBuffer charBuffer18 = charBuffer16.put('#');
        char[] charArray20 = new char[] { '#' };
        java.nio.CharBuffer charBuffer21 = charBuffer16.get(charArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer24 = charBuffer10.put(charArray20, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer16);
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4]");
        org.junit.Assert.assertNotNull(charBuffer21);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.function.Function<java.nio.DoubleBuffer, java.nio.DoubleBuffer> doubleBufferFunction0 = java.util.function.Function.identity();
        org.junit.Assert.assertNotNull(doubleBufferFunction0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.toString();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.function.IntConsumer intConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            intStream7.forEach(intConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.lang.String str21 = localDateTime18.toString();
        java.time.temporal.TemporalAmount temporalAmount22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime23 = localDateTime18.minus(temporalAmount22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amountToSubtract");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1969-12-27T20:00:16.000000097" + "'", str21, "1969-12-27T20:00:16.000000097");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap7 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean9 = charListMap7.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray11 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList12 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList12, charArray11);
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream21 = java.util.stream.IntStream.of(intArray20);
        java.util.stream.IntStream intStream22 = charListMap7.put(charList12, intStream21);
        java.util.Spliterator<java.lang.Character> charSpliterator23 = charList12.spliterator();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap26 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean28 = charListMap26.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray30 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList31 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList31, charArray30);
        int[] intArray39 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream40 = java.util.stream.IntStream.of(intArray39);
        java.util.stream.IntStream intStream41 = charListMap26.put(charList31, intStream40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream42 = charListMap2.replace(charList12, intStream41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNull(intStream22);
        org.junit.Assert.assertNotNull(charSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream40);
        org.junit.Assert.assertNull(intStream41);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.time.Month month1 = java.time.Month.JULY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of((int) ' ', month1, (int) (byte) -1, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.JULY + "'", month1.equals(java.time.Month.JULY));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange(".");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.time.LocalDate localDate0 = null;
        java.time.LocalTime localTime1 = java.time.LocalTime.now();
        java.time.LocalDate localDate3 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int4 = localDate3.getMonthValue();
        int int5 = localDate3.getDayOfYear();
        boolean boolean6 = localTime1.equals((java.lang.Object) int5);
        java.time.Instant instant8 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant10 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean11 = instant8.isAfter(instant10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        boolean boolean16 = chronoField14.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset15);
        java.time.format.TextStyle textStyle17 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle18 = textStyle17.asNormal();
        java.util.Locale locale20 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.lang.String str26 = zoneOffset15.getDisplayName(textStyle17, locale20);
        int int27 = zoneOffset15.getTotalSeconds();
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset15);
        java.time.LocalDateTime localDateTime30 = localDateTime28.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime32 = localDateTime30.atZone((java.time.ZoneId) zoneOffset31);
        java.time.temporal.ChronoField chronoField33 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.UTC;
        boolean boolean35 = chronoField33.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset34);
        java.time.ZonedDateTime zonedDateTime36 = java.time.ZonedDateTime.of(localDateTime30, (java.time.ZoneId) zoneOffset34);
        java.time.ZonedDateTime zonedDateTime37 = java.time.ZonedDateTime.ofInstant(instant8, (java.time.ZoneId) zoneOffset34);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime38 = java.time.OffsetDateTime.of(localDate0, localTime1, zoneOffset34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField14.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + textStyle17 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle17.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle18 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle18.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Z" + "'", str26, "Z");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime32);
        org.junit.Assert.assertTrue("'" + chronoField33 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField33.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertNotNull(zonedDateTime37);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate11 = java.time.chrono.ChronoLocalDate.from((java.time.temporal.TemporalAccessor) localTime1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ChronoLocalDate from TemporalAccessor: class java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.format.TextStyle textStyle24 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle25 = textStyle24.asNormal();
        java.util.Locale locale27 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("");
        java.lang.String str31 = locale30.getDisplayCountry();
        java.lang.String str32 = locale27.getDisplayScript(locale30);
        java.lang.String str33 = zoneOffset22.getDisplayName(textStyle24, locale27);
        int int34 = zoneOffset22.getTotalSeconds();
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset22);
        java.time.LocalDateTime localDateTime37 = localDateTime35.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime39 = localDateTime37.atZone((java.time.ZoneId) zoneOffset38);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.ZonedDateTime zonedDateTime43 = java.time.ZonedDateTime.of(localDateTime37, (java.time.ZoneId) zoneOffset41);
        java.time.DayOfWeek dayOfWeek44 = zonedDateTime43.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime46 = zonedDateTime43.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal47 = localDateTime16.adjustInto((java.time.temporal.Temporal) zonedDateTime46);
        java.time.temporal.ChronoField chronoField50 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset51 = java.time.ZoneOffset.UTC;
        boolean boolean52 = chronoField50.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset51);
        java.time.format.TextStyle textStyle53 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle54 = textStyle53.asNormal();
        java.util.Locale locale56 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.util.Locale locale59 = new java.util.Locale("");
        java.lang.String str60 = locale59.getDisplayCountry();
        java.lang.String str61 = locale56.getDisplayScript(locale59);
        java.lang.String str62 = zoneOffset51.getDisplayName(textStyle53, locale56);
        int int63 = zoneOffset51.getTotalSeconds();
        java.time.LocalDateTime localDateTime64 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset51);
        java.time.LocalDateTime localDateTime66 = localDateTime64.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime68 = localDateTime64.plusMonths((long) (short) 0);
        java.time.LocalDateTime localDateTime70 = localDateTime64.plusYears(10L);
        java.time.temporal.ChronoField chronoField73 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset74 = java.time.ZoneOffset.UTC;
        boolean boolean75 = chronoField73.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset74);
        java.time.format.TextStyle textStyle76 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle77 = textStyle76.asNormal();
        java.util.Locale locale79 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet80 = locale79.getExtensionKeys();
        java.util.Locale locale82 = new java.util.Locale("");
        java.lang.String str83 = locale82.getDisplayCountry();
        java.lang.String str84 = locale79.getDisplayScript(locale82);
        java.lang.String str85 = zoneOffset74.getDisplayName(textStyle76, locale79);
        int int86 = zoneOffset74.getTotalSeconds();
        java.time.LocalDateTime localDateTime87 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset74);
        java.time.LocalDateTime localDateTime89 = localDateTime87.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset90 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime91 = localDateTime89.atZone((java.time.ZoneId) zoneOffset90);
        java.time.temporal.ChronoField chronoField92 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset93 = java.time.ZoneOffset.UTC;
        boolean boolean94 = chronoField92.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset93);
        java.time.ZonedDateTime zonedDateTime95 = java.time.ZonedDateTime.of(localDateTime89, (java.time.ZoneId) zoneOffset93);
        boolean boolean96 = localDateTime70.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime89);
        boolean boolean97 = localDateTime16.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime89);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + textStyle24 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle24.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle25 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle25.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime39);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + dayOfWeek44 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek44.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertNotNull(temporal47);
        org.junit.Assert.assertTrue("'" + chronoField50 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField50.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + textStyle53 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle53.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle54 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle54.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Z" + "'", str62, "Z");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertTrue("'" + chronoField73 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField73.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + textStyle76 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle76.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle77 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle77.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertNotNull(charSet80);
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Z" + "'", str85, "Z");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(localDateTime87);
        org.junit.Assert.assertNotNull(localDateTime89);
        org.junit.Assert.assertNotNull(zoneOffset90);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime91);
        org.junit.Assert.assertTrue("'" + chronoField92 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField92.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(zonedDateTime95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = chronoField0.checkValidValue((-1L));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for AlignedDayOfWeekInMonth (valid values 1 - 7): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod5 = period3.multipliedBy((int) ' ');
        java.time.Period period7 = period3.minusYears((long) (short) 100);
        java.time.Period period9 = period7.multipliedBy((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(chronoPeriod5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        java.time.LocalTime localTime12 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology13 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime15 = localTime12.minusHours(1L);
        boolean boolean16 = localTime10.isAfter(localTime12);
        int int17 = localTime12.getMinute();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList2 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList2, charArray1);
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList6 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList6, charArray5);
        boolean boolean8 = charList2.removeAll((java.util.Collection<java.lang.Character>) charList6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = charList2.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>(0, (float) 64);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.lang.CharSequence charSequence1 = null;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor3 = dateTimeFormatter0.parse(charSequence1, parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: text");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = localTime1.minusHours(1L);
        int int5 = localTime1.getMinute();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField0.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream6.sequential();
        java.util.function.DoubleBinaryOperator doubleBinaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble9 = doubleStream7.reduce(doubleBinaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        intStream16.close();
        java.util.function.IntPredicate intPredicate19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = intStream16.noneMatch(intPredicate19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.LocalTime localTime5 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology6 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime5);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange8 = chronology6.range(chronoField7);
        java.time.Instant instant10 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant12 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean13 = instant10.isAfter(instant12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        boolean boolean16 = chronoField14.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset15);
        java.time.format.TextStyle textStyle17 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle18 = textStyle17.asNormal();
        java.util.Locale locale20 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.lang.String str26 = zoneOffset15.getDisplayName(textStyle17, locale20);
        int int27 = zoneOffset15.getTotalSeconds();
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime28 = chronology6.zonedDateTime(instant12, (java.time.ZoneId) zoneOffset15);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal29 = period3.subtractFrom((java.time.temporal.Temporal) instant12);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField14.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + textStyle17 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle17.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle18 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle18.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Z" + "'", str26, "Z");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime28);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI1 = java.net.URI.create("OptionalLong[0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 12: OptionalLong[0]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.String str0 = java.io.File.separator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/" + "'", str0, "/");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("1969-W52-6Z", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.LITTLE_ENDIAN;
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        java.time.LocalTime localTime12 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology13 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime15 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology16 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime15);
        java.time.LocalTime localTime18 = localTime15.minusHours(1L);
        boolean boolean19 = localTime12.isBefore(localTime18);
        java.time.LocalTime localTime21 = localTime12.minusMinutes((long) 0);
        java.time.LocalTime localTime23 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology24 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime23);
        java.time.LocalTime localTime26 = localTime23.minusHours(1L);
        boolean boolean27 = localTime21.isAfter(localTime23);
        int int28 = localTime1.compareTo(localTime21);
        int int29 = localTime21.getNano();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        char[] charArray4 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        java.nio.CharBuffer charBuffer7 = charBuffer5.put('#');
        char[] charArray9 = new char[] { '#' };
        java.nio.CharBuffer charBuffer10 = charBuffer5.get(charArray9);
        char[] charArray17 = new char[] { ':', ' ', 'x', 'u', 'x', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer20 = charBuffer10.put(charArray17, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), ": xux#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), ": xux#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[:,  , x, u, x, #]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream19 = intStream17.skip((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        java.lang.Runnable runnable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream19 = intStream16.onClose(runnable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.withMinute((int) (byte) 10);
        java.time.format.DateTimeFormatter dateTimeFormatter28 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray30 = new java.time.temporal.TemporalField[] { chronoField29 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet31 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet31, temporalFieldArray30);
        java.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter28.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet31);
        java.util.Locale locale34 = dateTimeFormatter28.getLocale();
        java.lang.String str35 = zonedDateTime27.format(dateTimeFormatter28);
        java.time.LocalDate localDate37 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int38 = localDate37.getMonthValue();
        java.time.LocalDate localDate40 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField41 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit42 = chronoField41.getRangeUnit();
        boolean boolean43 = localDate40.isSupported(temporalUnit42);
        boolean boolean44 = localDate37.isBefore((java.time.chrono.ChronoLocalDate) localDate40);
        java.time.format.DateTimeFormatter dateTimeFormatter45 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray47 = new java.time.temporal.TemporalField[] { chronoField46 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet48 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet48, temporalFieldArray47);
        java.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter45.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet48);
        java.lang.String str51 = localDate40.format(dateTimeFormatter45);
        java.lang.String str52 = zonedDateTime27.format(dateTimeFormatter45);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField29.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-W52-6Z" + "'", str35, "1969-W52-6Z");
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + chronoField41 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField41.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit42 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit42.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField46.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-W02-7" + "'", str51, "1970-W02-7");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1969-W52-6Z" + "'", str52, "1969-W52-6Z");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream6.sequential();
        doubleStream6.close();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = doubleStream6.onClose(runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = instant1.minusMillis((long) 'x');
        int int4 = instant1.getNano();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000000 + "'", int4 == 120000000);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.nio.DoubleBuffer doubleBuffer6 = java.nio.DoubleBuffer.wrap(doubleArray4);
        java.nio.DoubleBuffer doubleBuffer7 = doubleBuffer6.duplicate();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleBuffer6);
        org.junit.Assert.assertNotNull(doubleBuffer7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.time.Month month0 = java.time.Month.MARCH;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.MARCH + "'", month0.equals(java.time.Month.MARCH));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer3 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "/", 16, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.DayOfWeek dayOfWeek27 = dayOfWeek25.plus(10L);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertTrue("'" + dayOfWeek27 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek27.equals(java.time.DayOfWeek.TUESDAY));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(1);
        java.nio.ShortBuffer shortBuffer2 = shortBuffer1.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer3 = shortBuffer1.asReadOnlyBuffer();
        boolean boolean4 = shortBuffer3.hasArray();
        org.junit.Assert.assertNotNull(shortBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.stream.DoubleStream.Builder builder0 = java.util.stream.DoubleStream.builder();
        builder0.accept(0.0d);
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        charSet2.clear();
        java.util.Spliterator<java.lang.Character> charSpliterator4 = charSet2.spliterator();
        int int5 = charSet2.size();
        charSet2.clear();
        java.nio.file.AccessMode accessMode7 = java.nio.file.AccessMode.READ;
        java.nio.file.AccessMode[] accessModeArray8 = new java.nio.file.AccessMode[] { accessMode7 };
        java.nio.file.AccessMode[] accessModeArray9 = charSet2.toArray(accessModeArray8);
        int int10 = charSet2.size();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(charSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + accessMode7 + "' != '" + java.nio.file.AccessMode.READ + "'", accessMode7.equals(java.nio.file.AccessMode.READ));
        org.junit.Assert.assertNotNull(accessModeArray8);
        org.junit.Assert.assertNotNull(accessModeArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.Character[] charArray3 = new java.lang.Character[] { '4', 'x', 'u' };
        java.util.ArrayList<java.lang.Character> charList4 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList4, charArray3);
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = charList4.addAll(256, (java.util.Collection<java.lang.Character>) charSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 256, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        boolean boolean5 = chronoField3.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset4);
        java.time.format.TextStyle textStyle6 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle7 = textStyle6.asNormal();
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale9.getDisplayScript(locale12);
        java.lang.String str15 = zoneOffset4.getDisplayName(textStyle6, locale9);
        int int16 = zoneOffset4.getTotalSeconds();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset4);
        java.time.LocalDateTime localDateTime19 = localDateTime17.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime21 = localDateTime17.plusMonths((long) (short) 0);
        java.time.LocalTime localTime22 = localDateTime21.toLocalTime();
        java.time.Instant instant24 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant26 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean27 = instant24.isAfter(instant26);
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.UTC;
        boolean boolean32 = chronoField30.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset31);
        java.time.format.TextStyle textStyle33 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle34 = textStyle33.asNormal();
        java.util.Locale locale36 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getDisplayCountry();
        java.lang.String str41 = locale36.getDisplayScript(locale39);
        java.lang.String str42 = zoneOffset31.getDisplayName(textStyle33, locale36);
        int int43 = zoneOffset31.getTotalSeconds();
        java.time.LocalDateTime localDateTime44 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset31);
        java.time.LocalDateTime localDateTime46 = localDateTime44.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset47 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime48 = localDateTime46.atZone((java.time.ZoneId) zoneOffset47);
        java.time.temporal.ChronoField chronoField49 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset50 = java.time.ZoneOffset.UTC;
        boolean boolean51 = chronoField49.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset50);
        java.time.ZonedDateTime zonedDateTime52 = java.time.ZonedDateTime.of(localDateTime46, (java.time.ZoneId) zoneOffset50);
        java.time.ZonedDateTime zonedDateTime53 = java.time.ZonedDateTime.ofInstant(instant24, (java.time.ZoneId) zoneOffset50);
        java.time.temporal.ChronoField chronoField56 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.UTC;
        boolean boolean58 = chronoField56.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset57);
        java.time.format.TextStyle textStyle59 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle60 = textStyle59.asNormal();
        java.util.Locale locale62 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        java.util.Locale locale65 = new java.util.Locale("");
        java.lang.String str66 = locale65.getDisplayCountry();
        java.lang.String str67 = locale62.getDisplayScript(locale65);
        java.lang.String str68 = zoneOffset57.getDisplayName(textStyle59, locale62);
        int int69 = zoneOffset57.getTotalSeconds();
        java.time.LocalDateTime localDateTime70 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset57);
        java.time.LocalDateTime localDateTime71 = timeDefinition0.createDateTime(localDateTime21, zoneOffset50, zoneOffset57);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime73 = localDateTime71.withDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle7 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle7.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField30.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + textStyle33 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle33.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle34 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle34.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Z" + "'", str42, "Z");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(zoneOffset47);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime48);
        org.junit.Assert.assertTrue("'" + chronoField49 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField49.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertNotNull(zonedDateTime53);
        org.junit.Assert.assertTrue("'" + chronoField56 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField56.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + textStyle59 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle59.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle60 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle60.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(charSet63);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Z" + "'", str68, "Z");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime71);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        boolean boolean0 = java.net.URLConnection.getDefaultAllowUserInteraction();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.nio.channels.FileChannel.MapMode mapMode0 = java.nio.channels.FileChannel.MapMode.PRIVATE;
        org.junit.Assert.assertNotNull(mapMode0);
        org.junit.Assert.assertEquals(mapMode0.toString(), "PRIVATE");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.io.FileNotFoundException fileNotFoundException0 = new java.io.FileNotFoundException();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.from((java.time.temporal.TemporalAccessor) instant1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZoneOffset from TemporalAccessor: 1970-01-01T00:00:00.120Z of type java.time.Instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = intStream7.spliterator();
        java.util.function.IntPredicate intPredicate9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = intStream7.noneMatch(intPredicate9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intSpliterator8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        short short7 = byteBuffer6.getShort();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -156 + "'", short7 == (short) -156);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofPattern("1 Jan 1970 00:00:00 GMT", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = localDateTime0.plusMinutes((long) 1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(1);
        java.nio.ShortBuffer shortBuffer2 = shortBuffer1.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer3 = shortBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer5 = shortBuffer3.put((short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.lang.String str2 = localDate1.toString();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-11" + "'", str2, "1970-01-11");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        int int3 = localDate1.getDayOfYear();
        java.time.LocalDate localDate5 = localDate1.withYear((int) ' ');
        java.time.chrono.Era era6 = localDate1.getEra();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange8 = chronoField7.range();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange9 = era6.range((java.time.temporal.TemporalField) chronoField7);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + era6 + "' != '" + java.time.chrono.IsoEra.CE + "'", era6.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter9);
        java.time.LocalDateTime localDateTime16 = localDate4.atStartOfDay();
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = localDate4.getLong((java.time.temporal.TemporalField) chronoField17);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MilliOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField17.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream10 = java.util.stream.IntStream.of(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "", intArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.Character[] charArray4 = new java.lang.Character[] { ' ', '4', ':', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet5 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet5, charArray4);
        boolean boolean7 = charSet5.isEmpty();
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        charSet10.clear();
        java.util.Spliterator<java.lang.Character> charSpliterator12 = charSet10.spliterator();
        int int13 = charSet10.size();
        charSet10.clear();
        boolean boolean15 = charSet5.removeAll((java.util.Collection<java.lang.Character>) charSet10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(charSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.io.File file1 = new java.io.File("java.time");
        java.io.File file2 = file1.getAbsoluteFile();
        boolean boolean3 = file2.isHidden();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.time");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment/java.time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        boolean boolean2 = offsetTime0.isEqual(offsetTime1);
        java.time.Period period4 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period6 = period4.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod8 = period6.multipliedBy((int) ' ');
        java.time.Period period10 = period6.minusMonths((long) (short) -1);
        int int11 = period6.getYears();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime12 = offsetTime0.minus((java.time.temporal.TemporalAmount) period6);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(chronoPeriod8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        java.io.File file3 = file2.getCanonicalFile();
        boolean boolean4 = file3.isAbsolute();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertNotNull(file3);
// flaky:         org.junit.Assert.assertEquals(file3.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String str1 = java.net.URLConnection.getDefaultRequestProperty("ArrayList");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getDisplayCountry();
        java.io.File file21 = null;
        java.io.File file23 = new java.io.File(file21, "");
        java.io.File file24 = file23.getCanonicalFile();
        boolean boolean25 = charListMap2.remove((java.lang.Object) str20, (java.lang.Object) file23);
        boolean boolean26 = charListMap2.isEmpty();
        java.lang.Character[] charArray28 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList29 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList29, charArray28);
        java.lang.Character[] charArray32 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList33 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList33, charArray32);
        boolean boolean35 = charList29.removeAll((java.util.Collection<java.lang.Character>) charList33);
        int[] intArray42 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream43 = java.util.stream.IntStream.of(intArray42);
        java.util.Spliterator<java.lang.Integer> intSpliterator44 = intStream43.spliterator();
        java.util.stream.IntStream intStream45 = charListMap2.replace(charList33, intStream43);
        java.util.function.IntToDoubleFunction intToDoubleFunction46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream47 = intStream43.mapToDouble(intToDoubleFunction46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull("file23.getParent() == null", file23.getParent());
        org.junit.Assert.assertEquals(file23.toString(), "");
        org.junit.Assert.assertNotNull(file24);
// flaky:         org.junit.Assert.assertEquals(file24.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file24.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream43);
        org.junit.Assert.assertNotNull(intSpliterator44);
        org.junit.Assert.assertNull(intStream45);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int3 = localDate2.getMonthValue();
        int int4 = localDate2.getDayOfYear();
        boolean boolean5 = localTime0.equals((java.lang.Object) int4);
        int int6 = localTime0.getNano();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 452000000 + "'", int6 == 452000000);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter9);
        java.time.LocalDateTime localDateTime16 = localDate4.atStartOfDay();
        java.time.LocalDateTime localDateTime18 = localDateTime16.plusMinutes((long) 16);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.io.FileNotFoundException fileNotFoundException1 = new java.io.FileNotFoundException("P-1M");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fileNotFoundException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(writer0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        short[] shortArray2 = new short[] { (short) -156, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer5 = java.nio.ShortBuffer.wrap(shortArray2, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-156, -1]");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.security.Permission permission1 = null;
        java.security.AccessControlException accessControlException2 = new java.security.AccessControlException("Z", permission1);
        java.security.Permission permission3 = accessControlException2.getPermission();
        java.security.cert.CertificateEncodingException certificateEncodingException4 = new java.security.cert.CertificateEncodingException((java.lang.Throwable) accessControlException2);
        org.junit.Assert.assertNull(permission3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.withMinute((int) (byte) 10);
        java.time.format.DateTimeFormatter dateTimeFormatter28 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray30 = new java.time.temporal.TemporalField[] { chronoField29 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet31 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet31, temporalFieldArray30);
        java.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter28.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet31);
        java.util.Locale locale34 = dateTimeFormatter28.getLocale();
        java.lang.String str35 = zonedDateTime27.format(dateTimeFormatter28);
        long long36 = zonedDateTime27.toEpochSecond();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime38 = zonedDateTime27.minusMonths(280504143872L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -23375343353");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField29.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-W52-6Z" + "'", str35, "1969-W52-6Z");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-359384L) + "'", long36 == (-359384L));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.time.Instant instant3 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant5 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean6 = instant3.isAfter(instant5);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.UTC;
        boolean boolean11 = chronoField9.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset10);
        java.time.format.TextStyle textStyle12 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle13 = textStyle12.asNormal();
        java.util.Locale locale15 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet16 = locale15.getExtensionKeys();
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayScript(locale18);
        java.lang.String str21 = zoneOffset10.getDisplayName(textStyle12, locale15);
        int int22 = zoneOffset10.getTotalSeconds();
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset10);
        java.time.LocalDateTime localDateTime25 = localDateTime23.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime27 = localDateTime25.atZone((java.time.ZoneId) zoneOffset26);
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.UTC;
        boolean boolean30 = chronoField28.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset29);
        java.time.ZonedDateTime zonedDateTime31 = java.time.ZonedDateTime.of(localDateTime25, (java.time.ZoneId) zoneOffset29);
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.ofInstant(instant3, (java.time.ZoneId) zoneOffset29);
        java.time.Instant instant34 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant36 = instant34.minusMillis((long) 'x');
        int int37 = instant3.compareTo(instant36);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer1, (java.lang.Object) instant3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + textStyle12 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle12.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle13 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle13.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z" + "'", str21, "Z");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime27);
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField28.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 120000000 + "'", int37 == 120000000);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.nio.channels.AsynchronousCloseException asynchronousCloseException0 = new java.nio.channels.AsynchronousCloseException();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.stream.Stream<java.time.format.FormatStyle> formatStyleStream0 = java.util.stream.Stream.empty();
        org.junit.Assert.assertNotNull(formatStyleStream0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList2 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList2, charArray1);
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList6 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList6, charArray5);
        boolean boolean8 = charList2.removeAll((java.util.Collection<java.lang.Character>) charList6);
        java.util.ListIterator<java.lang.Character> charItor9 = charList2.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            charItor9.set((java.lang.Character) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charItor9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "1970-01-11", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL;
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.LocalTime localTime27 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology28 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime27);
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange30 = chronology28.range(chronoField29);
        java.time.Instant instant32 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant34 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean35 = instant32.isAfter(instant34);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset37 = java.time.ZoneOffset.UTC;
        boolean boolean38 = chronoField36.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset37);
        java.time.format.TextStyle textStyle39 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle40 = textStyle39.asNormal();
        java.util.Locale locale42 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet43 = locale42.getExtensionKeys();
        java.util.Locale locale45 = new java.util.Locale("");
        java.lang.String str46 = locale45.getDisplayCountry();
        java.lang.String str47 = locale42.getDisplayScript(locale45);
        java.lang.String str48 = zoneOffset37.getDisplayName(textStyle39, locale42);
        int int49 = zoneOffset37.getTotalSeconds();
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime50 = chronology28.zonedDateTime(instant34, (java.time.ZoneId) zoneOffset37);
        java.time.temporal.ChronoField chronoField51 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange52 = chronoField51.range();
        java.time.temporal.TemporalUnit temporalUnit53 = chronoField51.getRangeUnit();
        java.time.temporal.ValueRange valueRange54 = chronology28.range(chronoField51);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange55 = dayOfWeek25.range((java.time.temporal.TemporalField) chronoField51);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField29.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange30);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField36.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + textStyle39 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle39.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle40 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle40.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Z" + "'", str48, "Z");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime50);
        org.junit.Assert.assertTrue("'" + chronoField51 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField51.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange52);
        org.junit.Assert.assertTrue("'" + temporalUnit53 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit53.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(valueRange54);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getDisplayCountry();
        java.io.File file21 = null;
        java.io.File file23 = new java.io.File(file21, "");
        java.io.File file24 = file23.getCanonicalFile();
        boolean boolean25 = charListMap2.remove((java.lang.Object) str20, (java.lang.Object) file23);
        boolean boolean26 = charListMap2.isEmpty();
        java.lang.Character[] charArray28 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList29 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList29, charArray28);
        java.lang.Character[] charArray32 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList33 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList33, charArray32);
        boolean boolean35 = charList29.removeAll((java.util.Collection<java.lang.Character>) charList33);
        int[] intArray42 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream43 = java.util.stream.IntStream.of(intArray42);
        java.util.Spliterator<java.lang.Integer> intSpliterator44 = intStream43.spliterator();
        java.util.stream.IntStream intStream45 = charListMap2.replace(charList33, intStream43);
        boolean boolean46 = charList33.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull("file23.getParent() == null", file23.getParent());
        org.junit.Assert.assertEquals(file23.toString(), "");
        org.junit.Assert.assertNotNull(file24);
// flaky:         org.junit.Assert.assertEquals(file24.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file24.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream43);
        org.junit.Assert.assertNotNull(intSpliterator44);
        org.junit.Assert.assertNull(intStream45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        boolean boolean18 = charListMap2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.util.DoubleSummaryStatistics doubleSummaryStatistics0 = new java.util.DoubleSummaryStatistics();
        double double1 = doubleSummaryStatistics0.getAverage();
        org.junit.Assert.assertEquals(doubleSummaryStatistics0.toString(), "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.stream.IntStream intStream8 = intStream7.sequential();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = intStream8.onClose(runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod5 = period3.multipliedBy((int) ' ');
        java.time.Period period7 = period3.minusYears((long) (short) 100);
        java.time.chrono.ChronoPeriod chronoPeriod9 = period7.multipliedBy(64);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(chronoPeriod5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(chronoPeriod9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "P-1M");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'P-1M' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.nio.channels.FileChannel.MapMode mapMode0 = java.nio.channels.FileChannel.MapMode.READ_ONLY;
        org.junit.Assert.assertNotNull(mapMode0);
        org.junit.Assert.assertEquals(mapMode0.toString(), "READ_ONLY");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHoursMinutes((int) 'u', 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 117 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) zoneOffset1, "1969-12-27T20:00:16.000000097");
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.time" + "'", str4, "java.time");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.net.UnknownHostException unknownHostException0 = new java.net.UnknownHostException();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.LocalDate localDate21 = localDateChronoZonedDateTime20.toLocalDate();
        java.time.LocalTime localTime23 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology24 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime23);
        java.time.LocalTime localTime26 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology27 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime26);
        java.time.LocalTime localTime29 = localTime26.minusHours(1L);
        boolean boolean30 = localTime23.isBefore(localTime29);
        java.time.LocalTime localTime32 = localTime23.minusMinutes((long) 0);
        java.time.LocalDate localDate34 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int35 = localDate34.getMonthValue();
        int int36 = localDate34.getDayOfYear();
        java.time.LocalDate localDate38 = localDate34.withYear((int) ' ');
        java.time.LocalDateTime localDateTime39 = localTime23.atDate(localDate34);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate40 = localDate21.with((java.time.temporal.TemporalAdjuster) localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11 + "'", int36 == 11);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDateTime39);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = java.time.LocalTime.of((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.security.AccessControlException accessControlException1 = new java.security.AccessControlException("hi!");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException2 = new java.util.InvalidPropertiesFormatException((java.lang.Throwable) accessControlException1);
        java.security.cert.CertificateException certificateException3 = new java.security.cert.CertificateException((java.lang.Throwable) accessControlException1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.Instant instant20 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant22 = instant20.minusMillis((long) 'x');
        int int23 = instant22.getNano();
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit25 = chronoField24.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = localDateTime16.until((java.time.temporal.Temporal) instant22, temporalUnit25);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: 1970-01-01T00:00:00Z of type java.time.Instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField24.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit25 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit25.equals(java.time.temporal.ChronoUnit.DAYS));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        char[] charArray4 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        java.nio.CharBuffer charBuffer7 = charBuffer5.put('#');
        char[] charArray12 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer13 = java.nio.CharBuffer.wrap(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer14 = charBuffer5.put(charArray12);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer13);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate3 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int4 = localDate3.getMonthValue();
        int int5 = localDate3.getDayOfYear();
        boolean boolean6 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int9 = localDate8.getMonthValue();
        java.time.LocalDate localDate11 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit13 = chronoField12.getRangeUnit();
        boolean boolean14 = localDate11.isSupported(temporalUnit13);
        boolean boolean15 = localDate8.isBefore((java.time.chrono.ChronoLocalDate) localDate11);
        java.time.chrono.Chronology chronology16 = localDate8.getChronology();
        int int17 = localDate3.compareTo((java.time.chrono.ChronoLocalDate) localDate8);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit13 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit13.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.withMinute((int) (byte) 10);
        java.time.format.DateTimeFormatter dateTimeFormatter28 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray30 = new java.time.temporal.TemporalField[] { chronoField29 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet31 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet31, temporalFieldArray30);
        java.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter28.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet31);
        java.util.Locale locale34 = dateTimeFormatter28.getLocale();
        java.lang.String str35 = zonedDateTime27.format(dateTimeFormatter28);
        long long36 = zonedDateTime27.toEpochSecond();
        int int37 = zonedDateTime27.getSecond();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField29.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-W52-6Z" + "'", str35, "1969-W52-6Z");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-359384L) + "'", long36 == (-359384L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 16 + "'", int37 == 16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream5.parallel();
        java.util.stream.Stream<java.lang.Double> doubleStream8 = doubleStream7.boxed();
        java.util.stream.Stream<java.lang.Double> doubleStream9 = doubleStream8.sorted();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.Double> doubleStream11 = doubleStream8.limit((-359984L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -359984");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("java.time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress4 = java.net.InetAddress.getByAddress(".", byteArray3);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, -1]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.time.Period period1 = java.time.Period.ofYears((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        char[] charArray4 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer9 = charBuffer5.put("1970-W02-7", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        charSet2.clear();
        int int4 = charSet2.size();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        java.time.LocalTime localTime12 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology13 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime15 = localTime12.minusHours(1L);
        boolean boolean16 = localTime10.isAfter(localTime12);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit18 = chronoField17.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localTime12.get((java.time.temporal.TemporalField) chronoField17);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Invalid field 'NanoOfDay' for get() method, use getLong() instead");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField17.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit18 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit18.equals(java.time.temporal.ChronoUnit.DAYS));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.time.Duration duration1 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration3 = duration1.plusMillis((long) (byte) 100);
        java.time.Duration duration5 = duration3.minusMillis((long) (byte) 100);
        java.time.Duration duration7 = duration3.plusMillis((long) (short) -156);
        java.time.Duration duration9 = duration7.withNanos((int) 'x');
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime2 = java.time.OffsetTime.parse((java.lang.CharSequence) "1969-W52-6Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1969-W52-6Z' could not be parsed at index 5");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        char[] charArray4 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime6 = java.time.ZonedDateTime.parse((java.lang.CharSequence) charBuffer5);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'a4a ' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer5);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.lang.String str25 = zoneOffset22.getId();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.Hashtable<java.nio.file.AccessMode[], java.security.CodeSigner[]> accessModeArrayMap2 = new java.util.Hashtable<java.nio.file.AccessMode[], java.security.CodeSigner[]>(10, (float) 10L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("J", "1969-12-27T20:00:16.000000097", (int) (byte) 10, "java.time", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: j");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.withMinute(4096);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 4096");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.lang.Character[] charArray6 = new java.lang.Character[] { '#', 'a', ' ', ':', ':', ':' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        java.util.Iterator<java.lang.Character> charItor9 = charList7.iterator();
        boolean boolean10 = charItor9.hasNext();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime20 = localDateTime16.plusMonths((long) (short) 0);
        java.time.LocalDateTime localDateTime22 = localDateTime16.plusYears(10L);
        java.time.LocalDateTime localDateTime24 = localDateTime22.withNano((int) ':');
        java.time.Instant instant26 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant28 = instant26.minusMillis((long) 'x');
        java.time.LocalDate localDate30 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int31 = localDate30.getMonthValue();
        java.time.LocalDate localDate33 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField34 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit35 = chronoField34.getRangeUnit();
        boolean boolean36 = localDate33.isSupported(temporalUnit35);
        boolean boolean37 = localDate30.isBefore((java.time.chrono.ChronoLocalDate) localDate33);
        java.time.format.DateTimeFormatter dateTimeFormatter38 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray40 = new java.time.temporal.TemporalField[] { chronoField39 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet41 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet41, temporalFieldArray40);
        java.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter38.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet41);
        java.lang.String str44 = localDate33.format(dateTimeFormatter38);
        java.time.LocalDateTime localDateTime45 = localDate33.atStartOfDay();
        java.time.LocalDate localDate47 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int48 = localDate47.getMonthValue();
        int int49 = localDate47.getDayOfYear();
        java.time.LocalDate localDate51 = localDate47.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField52 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit53 = chronoField52.getRangeUnit();
        long long54 = localDate33.until((java.time.temporal.Temporal) localDate47, temporalUnit53);
        // The following exception was thrown during execution in test generation
        try {
            long long55 = localDateTime24.until((java.time.temporal.Temporal) instant26, temporalUnit53);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: 1970-01-01T00:00:00.120Z of type java.time.Instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + chronoField34 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField34.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit35 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit35.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField39.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-W02-7" + "'", str44, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 11 + "'", int49 == 11);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + chronoField52 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField52.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit53 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit53.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean4 = instant1.isAfter(instant3);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.UTC;
        boolean boolean9 = chronoField7.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset8);
        java.time.format.TextStyle textStyle10 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle11 = textStyle10.asNormal();
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.lang.String str19 = zoneOffset8.getDisplayName(textStyle10, locale13);
        int int20 = zoneOffset8.getTotalSeconds();
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset8);
        java.time.LocalDateTime localDateTime23 = localDateTime21.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime25 = localDateTime23.atZone((java.time.ZoneId) zoneOffset24);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.UTC;
        boolean boolean28 = chronoField26.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.of(localDateTime23, (java.time.ZoneId) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime30 = java.time.ZonedDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset27);
        java.time.Instant instant32 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant34 = instant32.minusMillis((long) 'x');
        int int35 = instant1.compareTo(instant34);
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int41 = zoneOffset36.compareTo(zoneOffset40);
        java.time.LocalDateTime localDateTime42 = java.time.LocalDateTime.ofInstant(instant34, (java.time.ZoneId) zoneOffset36);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            long long44 = instant34.getLong((java.time.temporal.TemporalField) chronoField43);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ProlepticMonth");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle11 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle11.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField26.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 120000000 + "'", int35 == 120000000);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4210 + "'", int41 == 4210);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField43.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "OptionalLong[0]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: OptionalLong[0]");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.time.format.TextStyle textStyle3 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle4 = textStyle3.asNormal();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale6.getDisplayScript(locale9);
        java.lang.String str12 = zoneOffset1.getDisplayName(textStyle3, locale6);
        java.time.LocalTime localTime13 = java.time.LocalTime.now((java.time.ZoneId) zoneOffset1);
        java.time.LocalTime localTime15 = localTime13.plusMinutes((-359984L));
        java.time.LocalDate localDate17 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int18 = localDate17.getMonthValue();
        java.time.LocalDate localDate20 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit22 = chronoField21.getRangeUnit();
        boolean boolean23 = localDate20.isSupported(temporalUnit22);
        boolean boolean24 = localDate17.isBefore((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.format.DateTimeFormatter dateTimeFormatter25 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray27 = new java.time.temporal.TemporalField[] { chronoField26 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet28 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet28, temporalFieldArray27);
        java.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter25.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet28);
        java.lang.String str31 = localDate20.format(dateTimeFormatter30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = localTime15.format(dateTimeFormatter30);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: WeekBasedYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + textStyle3 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle3.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField21.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit22 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit22.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField26.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-W02-7" + "'", str31, "1970-W02-7");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.util.List<java.nio.file.spi.FileSystemProvider> fileSystemProviderList0 = java.nio.file.spi.FileSystemProvider.installedProviders();
        org.junit.Assert.assertNotNull(fileSystemProviderList0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = intStream7.spliterator();
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream17 = java.util.stream.IntStream.concat(intStream7, intStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException("1 Jan 1970 00:00:00 GMT");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.util.Date date0 = new java.util.Date();
        java.lang.Object obj1 = date0.clone();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 09:33:59 UTC 2022");
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "Mon Feb 21 09:33:59 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Mon Feb 21 09:33:59 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Mon Feb 21 09:33:59 UTC 2022");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter9);
        char[] charArray20 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer21 = java.nio.CharBuffer.wrap(charArray20);
        java.nio.CharBuffer charBuffer23 = charBuffer21.put('#');
        char[] charArray25 = new char[] { '#' };
        java.nio.CharBuffer charBuffer26 = charBuffer21.get(charArray25);
        java.text.ParsePosition parsePosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor28 = dateTimeFormatter9.parseUnresolved((java.lang.CharSequence) charBuffer26, parsePosition27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer21);
        org.junit.Assert.assertNotNull(charBuffer23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4]");
        org.junit.Assert.assertNotNull(charBuffer26);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        int int3 = localDate1.getDayOfYear();
        java.time.LocalDate localDate5 = localDate1.withYear((int) ' ');
        java.time.chrono.Era era6 = localDate1.getEra();
        java.time.temporal.TemporalField temporalField7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate1.get(temporalField7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + era6 + "' != '" + java.time.chrono.IsoEra.CE + "'", era6.equals(java.time.chrono.IsoEra.CE));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        java.time.LocalTime localTime12 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology13 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime15 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology16 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime15);
        java.time.LocalTime localTime18 = localTime15.minusHours(1L);
        boolean boolean19 = localTime12.isBefore(localTime18);
        java.time.LocalTime localTime21 = localTime12.minusMinutes((long) 0);
        java.time.LocalTime localTime23 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology24 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime23);
        java.time.LocalTime localTime26 = localTime23.minusHours(1L);
        boolean boolean27 = localTime21.isAfter(localTime23);
        int int28 = localTime1.compareTo(localTime21);
        java.time.LocalTime localTime30 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology31 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime30);
        java.time.LocalTime localTime33 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology34 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime33);
        java.time.LocalTime localTime36 = localTime33.minusHours(1L);
        boolean boolean37 = localTime30.isBefore(localTime36);
        java.time.LocalTime localTime39 = localTime30.minusMinutes((long) 0);
        java.time.LocalTime localTime41 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology42 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime41);
        java.time.LocalTime localTime44 = localTime41.minusHours(1L);
        boolean boolean45 = localTime39.isAfter(localTime41);
        java.time.LocalTime localTime47 = localTime39.plusSeconds((long) 120000000);
        boolean boolean48 = localTime21.isBefore(localTime39);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.time.format.DecimalStyle decimalStyle0 = java.time.format.DecimalStyle.ofDefaultLocale();
        java.time.format.DecimalStyle decimalStyle2 = decimalStyle0.withDecimalSeparator('x');
        java.time.format.DecimalStyle decimalStyle4 = decimalStyle2.withPositiveSign('x');
        org.junit.Assert.assertNotNull(decimalStyle0);
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertNotNull(decimalStyle4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        java.nio.ShortBuffer shortBuffer9 = byteBuffer8.asShortBuffer();
        java.nio.CharBuffer charBuffer10 = byteBuffer8.asCharBuffer();
        java.time.format.DateTimeFormatter dateTimeFormatter11 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray13 = new java.time.temporal.TemporalField[] { chronoField12 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet14 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet14, temporalFieldArray13);
        java.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter11.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet14);
        java.util.Locale locale17 = dateTimeFormatter11.getLocale();
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter11.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime25 = java.time.OffsetTime.parse((java.lang.CharSequence) charBuffer10, dateTimeFormatter24);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'T?' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MICROSECONDS;
        long long2 = timeUnit0.toDays((long) 11);
        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.SECONDS;
        long long6 = timeUnit4.toNanos((long) 10);
        long long7 = timeUnit0.convert((-1L), timeUnit4);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(timeUnit4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10000000000L + "'", long6 == 10000000000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1000000L) + "'", long7 == (-1000000L));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        boolean boolean5 = chronoField3.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset4);
        java.time.format.TextStyle textStyle6 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle7 = textStyle6.asNormal();
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale9.getDisplayScript(locale12);
        java.lang.String str15 = zoneOffset4.getDisplayName(textStyle6, locale9);
        int int16 = zoneOffset4.getTotalSeconds();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset4);
        java.time.LocalDateTime localDateTime19 = localDateTime17.minusHours((long) (byte) 100);
        java.time.format.DateTimeFormatter dateTimeFormatter20 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.lang.String str21 = localDateTime17.format(dateTimeFormatter20);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.parse((java.lang.CharSequence) "P-1M", dateTimeFormatter20);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'P-1M' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle7 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle7.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-W01-4" + "'", str21, "1970-W01-4");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.time.Month month1 = java.time.Month.JULY;
        int int2 = month1.minLength();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.of((int) (byte) 100, month1, 4210, (int) '4', 0, 256, 16384);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 4210");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.JULY + "'", month1.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.time.Period period1 = java.time.Period.ofMonths(11);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        java.time.LocalDate localDate37 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int38 = localDate37.getMonthValue();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal39 = offsetDateTime35.adjustInto((java.time.temporal.Temporal) localDate37);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("1970-01-11", "ISO");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ISO");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = localTime1.minusHours(1L);
        int int5 = localTime4.getNano();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("java.text.AttributedCharacterIterator$Attribute(reading)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.text.attributedcharacteriterator$attribute(reading)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        boolean boolean2 = period1.isZero();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.time.format.DecimalStyle decimalStyle0 = java.time.format.DecimalStyle.ofDefaultLocale();
        java.time.format.DecimalStyle decimalStyle2 = decimalStyle0.withDecimalSeparator('x');
        java.time.format.DecimalStyle decimalStyle4 = decimalStyle0.withZeroDigit(' ');
        org.junit.Assert.assertNotNull(decimalStyle0);
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertNotNull(decimalStyle4);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = instant1.minusMillis((long) 'x');
        int int4 = instant3.getNano();
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition5 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        boolean boolean10 = chronoField8.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset9);
        java.time.format.TextStyle textStyle11 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle12 = textStyle11.asNormal();
        java.util.Locale locale14 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale14.getDisplayScript(locale17);
        java.lang.String str20 = zoneOffset9.getDisplayName(textStyle11, locale14);
        int int21 = zoneOffset9.getTotalSeconds();
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset9);
        java.time.LocalDateTime localDateTime24 = localDateTime22.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime26 = localDateTime22.plusMonths((long) (short) 0);
        java.time.LocalTime localTime27 = localDateTime26.toLocalTime();
        java.time.Instant instant29 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant31 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean32 = instant29.isAfter(instant31);
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.UTC;
        boolean boolean37 = chronoField35.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset36);
        java.time.format.TextStyle textStyle38 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle39 = textStyle38.asNormal();
        java.util.Locale locale41 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet42 = locale41.getExtensionKeys();
        java.util.Locale locale44 = new java.util.Locale("");
        java.lang.String str45 = locale44.getDisplayCountry();
        java.lang.String str46 = locale41.getDisplayScript(locale44);
        java.lang.String str47 = zoneOffset36.getDisplayName(textStyle38, locale41);
        int int48 = zoneOffset36.getTotalSeconds();
        java.time.LocalDateTime localDateTime49 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset36);
        java.time.LocalDateTime localDateTime51 = localDateTime49.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset52 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime53 = localDateTime51.atZone((java.time.ZoneId) zoneOffset52);
        java.time.temporal.ChronoField chronoField54 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.UTC;
        boolean boolean56 = chronoField54.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset55);
        java.time.ZonedDateTime zonedDateTime57 = java.time.ZonedDateTime.of(localDateTime51, (java.time.ZoneId) zoneOffset55);
        java.time.ZonedDateTime zonedDateTime58 = java.time.ZonedDateTime.ofInstant(instant29, (java.time.ZoneId) zoneOffset55);
        java.time.temporal.ChronoField chronoField61 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset62 = java.time.ZoneOffset.UTC;
        boolean boolean63 = chronoField61.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset62);
        java.time.format.TextStyle textStyle64 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle65 = textStyle64.asNormal();
        java.util.Locale locale67 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.util.Locale locale70 = new java.util.Locale("");
        java.lang.String str71 = locale70.getDisplayCountry();
        java.lang.String str72 = locale67.getDisplayScript(locale70);
        java.lang.String str73 = zoneOffset62.getDisplayName(textStyle64, locale67);
        int int74 = zoneOffset62.getTotalSeconds();
        java.time.LocalDateTime localDateTime75 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset62);
        java.time.LocalDateTime localDateTime76 = timeDefinition5.createDateTime(localDateTime26, zoneOffset55, zoneOffset62);
        java.time.Clock clock77 = java.time.Clock.fixed(instant3, (java.time.ZoneId) zoneOffset55);
        java.lang.String str78 = zoneOffset55.toString();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + timeDefinition5 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition5.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField8.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + textStyle11 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle11.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle12 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle12.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField35.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + textStyle38 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle38.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle39 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle39.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(charSet42);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Z" + "'", str47, "Z");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(zoneOffset52);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime53);
        org.junit.Assert.assertTrue("'" + chronoField54 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField54.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(zonedDateTime57);
        org.junit.Assert.assertNotNull(zonedDateTime58);
        org.junit.Assert.assertTrue("'" + chronoField61 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField61.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + textStyle64 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle64.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle65 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle65.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Z" + "'", str73, "Z");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(clock77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Z" + "'", str78, "Z");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay(4210L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.io.File file1 = new java.io.File("java.time");
        java.io.File file2 = file1.getAbsoluteFile();
        long long3 = file1.getUsableSpace();
        java.lang.String str4 = file1.toString();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.time");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment/java.time");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 280504143872L + "'", long3 == 280504143872L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.time" + "'", str4, "java.time");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.lang.String str21 = localDateTime18.toString();
        int int22 = localDateTime18.getNano();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1969-12-27T20:00:16.000000097" + "'", str21, "1969-12-27T20:00:16.000000097");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.stream.IntStream intStream8 = intStream7.sequential();
        java.util.function.IntConsumer intConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            intStream8.forEach(intConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = java.time.LocalDate.parse((java.lang.CharSequence) "java.time");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'java.time' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        java.time.LocalTime localTime12 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology13 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime15 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology16 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime15);
        java.time.LocalTime localTime18 = localTime15.minusHours(1L);
        boolean boolean19 = localTime12.isBefore(localTime18);
        java.time.LocalTime localTime21 = localTime12.minusMinutes((long) 0);
        java.time.LocalTime localTime23 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology24 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime23);
        java.time.LocalTime localTime26 = localTime23.minusHours(1L);
        boolean boolean27 = localTime21.isAfter(localTime23);
        int int28 = localTime1.compareTo(localTime21);
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange30 = chronoField29.range();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = localTime21.getLong((java.time.temporal.TemporalField) chronoField29);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField29.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange30);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        java.time.temporal.ValueRange valueRange2 = chronoField1.range();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange3 = isoEra0.range((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: AlignedDayOfWeekInMonth");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField1.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        org.junit.Assert.assertNotNull(valueRange2);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.temporal.TemporalField temporalField9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime11 = offsetDateTime8.with(temporalField9, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.net.URL uRL0 = null;
        java.security.CodeSigner[] codeSignerArray1 = new java.security.CodeSigner[] {};
        java.security.CodeSource codeSource2 = new java.security.CodeSource(uRL0, codeSignerArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) codeSignerArray1);
        org.junit.Assert.assertNotNull(codeSignerArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.UTC;
        boolean boolean3 = chronoField1.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset2);
        java.time.format.TextStyle textStyle4 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle5 = textStyle4.asNormal();
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale7.getDisplayScript(locale10);
        java.lang.String str13 = zoneOffset2.getDisplayName(textStyle4, locale7);
        java.time.LocalTime localTime14 = java.time.LocalTime.now((java.time.ZoneId) zoneOffset2);
        java.time.LocalTime localTime16 = localTime14.plusMinutes((-359984L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter0.format((java.time.temporal.TemporalAccessor) localTime16);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.util.stream.DoubleStream.Builder builder0 = java.util.stream.DoubleStream.builder();
        java.util.DoubleSummaryStatistics doubleSummaryStatistics1 = new java.util.DoubleSummaryStatistics();
        doubleSummaryStatistics1.accept(10.0d);
        java.util.function.DoubleConsumer doubleConsumer4 = builder0.andThen((java.util.function.DoubleConsumer) doubleSummaryStatistics1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertEquals(doubleSummaryStatistics1.toString(), "DoubleSummaryStatistics{count=1, sum=10.000000, min=10.000000, average=10.000000, max=10.000000}");
        org.junit.Assert.assertNotNull(doubleConsumer4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        // The following exception was thrown during execution in test generation
        try {
            java.time.DayOfWeek dayOfWeek1 = java.time.DayOfWeek.of(466000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfWeek: 466000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.stream.IntStream intStream8 = intStream7.sequential();
        java.util.stream.IntStream intStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = java.util.stream.IntStream.concat(intStream8, intStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        long long2 = chronoField0.checkValidValue((long) 16);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.UTC;
        boolean boolean7 = chronoField5.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset6);
        java.time.format.TextStyle textStyle8 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle9 = textStyle8.asNormal();
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayScript(locale14);
        java.lang.String str17 = zoneOffset6.getDisplayName(textStyle8, locale11);
        int int18 = zoneOffset6.getTotalSeconds();
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset6);
        java.time.LocalDateTime localDateTime21 = localDateTime19.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime23 = localDateTime21.atZone((java.time.ZoneId) zoneOffset22);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        boolean boolean26 = chronoField24.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset25);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.of(localDateTime21, (java.time.ZoneId) zoneOffset25);
        java.time.DayOfWeek dayOfWeek28 = zonedDateTime27.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime27.withMinute((int) (byte) 10);
        long long31 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) zonedDateTime30);
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.lang.String str33 = locale32.getCountry();
        java.lang.String str34 = chronoField0.getDisplayName(locale32);
        java.lang.String str35 = locale32.getVariant();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16L + "'", long2 == 16L);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + textStyle8 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle8.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime23);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField24.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertTrue("'" + dayOfWeek28 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek28.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 72616000L + "'", long31 == 72616000L);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "MilliOfDay" + "'", str34, "MilliOfDay");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.time.Duration duration1 = java.time.Duration.ofMinutes((long) (byte) 0);
        java.time.Duration duration3 = duration1.withSeconds(0L);
        java.time.Duration duration5 = duration3.minusMinutes((long) 472000000);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.chrono.IsoChronology isoChronology4 = period3.getChronology();
        java.time.Duration duration6 = java.time.Duration.ofSeconds((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period7 = period3.minus((java.time.temporal.TemporalAmount) duration6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(isoChronology4);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter9);
        java.time.LocalDateTime localDateTime16 = localDate4.atStartOfDay();
        java.time.Instant instant18 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant20 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean21 = instant18.isAfter(instant20);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        boolean boolean26 = chronoField24.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset25);
        java.time.format.TextStyle textStyle27 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle28 = textStyle27.asNormal();
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet31 = locale30.getExtensionKeys();
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getDisplayCountry();
        java.lang.String str35 = locale30.getDisplayScript(locale33);
        java.lang.String str36 = zoneOffset25.getDisplayName(textStyle27, locale30);
        int int37 = zoneOffset25.getTotalSeconds();
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset25);
        java.time.LocalDateTime localDateTime40 = localDateTime38.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime42 = localDateTime40.atZone((java.time.ZoneId) zoneOffset41);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset44 = java.time.ZoneOffset.UTC;
        boolean boolean45 = chronoField43.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset44);
        java.time.ZonedDateTime zonedDateTime46 = java.time.ZonedDateTime.of(localDateTime40, (java.time.ZoneId) zoneOffset44);
        java.time.ZonedDateTime zonedDateTime47 = java.time.ZonedDateTime.ofInstant(instant18, (java.time.ZoneId) zoneOffset44);
        java.time.OffsetTime offsetTime48 = java.time.OffsetTime.now();
        java.time.LocalDate localDate50 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate52 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int53 = localDate52.getMonthValue();
        int int54 = localDate52.getDayOfYear();
        boolean boolean55 = localDate50.isAfter((java.time.chrono.ChronoLocalDate) localDate52);
        java.time.OffsetDateTime offsetDateTime56 = offsetTime48.atDate(localDate50);
        java.time.LocalDate localDate58 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int59 = localDate58.getMonthValue();
        java.time.LocalDate localDate61 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField62 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit63 = chronoField62.getRangeUnit();
        boolean boolean64 = localDate61.isSupported(temporalUnit63);
        boolean boolean65 = localDate58.isBefore((java.time.chrono.ChronoLocalDate) localDate61);
        java.time.format.DateTimeFormatter dateTimeFormatter66 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField67 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray68 = new java.time.temporal.TemporalField[] { chronoField67 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet69 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet69, temporalFieldArray68);
        java.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter66.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet69);
        java.lang.String str72 = localDate61.format(dateTimeFormatter66);
        java.time.LocalDateTime localDateTime73 = localDate61.atStartOfDay();
        java.time.LocalDate localDate75 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int76 = localDate75.getMonthValue();
        int int77 = localDate75.getDayOfYear();
        java.time.LocalDate localDate79 = localDate75.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField80 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit81 = chronoField80.getRangeUnit();
        long long82 = localDate61.until((java.time.temporal.Temporal) localDate75, temporalUnit81);
        java.time.OffsetDateTime offsetDateTime83 = offsetTime48.atDate(localDate75);
        java.time.temporal.ChronoField chronoField84 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean85 = offsetDateTime83.isSupported((java.time.temporal.TemporalField) chronoField84);
        java.time.temporal.ChronoField chronoField86 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset87 = java.time.ZoneOffset.UTC;
        boolean boolean88 = chronoField86.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset87);
        java.time.zone.ZoneRules zoneRules89 = zoneOffset87.getRules();
        java.time.ZonedDateTime zonedDateTime90 = offsetDateTime83.atZoneSameInstant((java.time.ZoneId) zoneOffset87);
        java.time.ZonedDateTime zonedDateTime91 = java.time.ZonedDateTime.ofLocal(localDateTime16, (java.time.ZoneId) zoneOffset44, zoneOffset87);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField24.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + textStyle27 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle27.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle28 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle28.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Z" + "'", str36, "Z");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime42);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField43.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertNotNull(zonedDateTime47);
        org.junit.Assert.assertNotNull(offsetTime48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 11 + "'", int54 == 11);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(offsetDateTime56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertTrue("'" + chronoField62 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField62.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit63 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit63.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertTrue("'" + chronoField67 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField67.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1970-W02-7" + "'", str72, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 11 + "'", int77 == 11);
        org.junit.Assert.assertNotNull(localDate79);
        org.junit.Assert.assertTrue("'" + chronoField80 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField80.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit81 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit81.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime83);
        org.junit.Assert.assertTrue("'" + chronoField84 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField84.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + chronoField86 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField86.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(zoneRules89);
        org.junit.Assert.assertNotNull(zonedDateTime90);
        org.junit.Assert.assertNotNull(zonedDateTime91);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(1);
        java.nio.ShortBuffer shortBuffer2 = shortBuffer1.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer4 = shortBuffer1.put((short) (byte) 100);
        short[] shortArray5 = shortBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer8 = java.nio.ShortBuffer.wrap(shortArray5, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[100]");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime4 = localTime1.withSecond(4096);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 4096");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer3 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "$", (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano((int) (byte) 0);
        java.time.OffsetTime offsetTime4 = offsetTime2.withHour(0);
        java.time.Instant instant6 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant8 = instant6.minusMillis((long) 'x');
        int int9 = instant8.getNano();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.UTC;
        boolean boolean14 = chronoField12.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset13);
        java.time.format.TextStyle textStyle15 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle16 = textStyle15.asNormal();
        java.util.Locale locale18 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale18.getDisplayScript(locale21);
        java.lang.String str24 = zoneOffset13.getDisplayName(textStyle15, locale18);
        int int25 = zoneOffset13.getTotalSeconds();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset13);
        java.time.LocalDateTime localDateTime28 = localDateTime26.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime30 = localDateTime26.plusMonths((long) (short) 0);
        java.time.LocalTime localTime31 = localDateTime30.toLocalTime();
        java.time.Instant instant34 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant36 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean37 = instant34.isAfter(instant36);
        java.time.Period period39 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period41 = period39.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod43 = period41.multipliedBy((int) ' ');
        java.time.LocalDate localDate45 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit47 = chronoField46.getRangeUnit();
        boolean boolean48 = localDate45.isSupported(temporalUnit47);
        long long49 = chronoPeriod43.get(temporalUnit47);
        boolean boolean50 = instant36.isSupported(temporalUnit47);
        java.time.temporal.Temporal temporal51 = localDateTime30.minus((-359984L), temporalUnit47);
        // The following exception was thrown during execution in test generation
        try {
            long long52 = offsetTime2.until((java.time.temporal.Temporal) instant8, temporalUnit47);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetTime from TemporalAccessor: 1970-01-01T00:00:00Z of type java.time.Instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + textStyle15 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle15.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle16 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle16.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(chronoPeriod43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField46.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit47 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit47.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(temporal51);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean4 = instant1.isAfter(instant3);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.UTC;
        boolean boolean9 = chronoField7.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset8);
        java.time.format.TextStyle textStyle10 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle11 = textStyle10.asNormal();
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.lang.String str19 = zoneOffset8.getDisplayName(textStyle10, locale13);
        int int20 = zoneOffset8.getTotalSeconds();
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset8);
        java.time.LocalDateTime localDateTime23 = localDateTime21.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime25 = localDateTime23.atZone((java.time.ZoneId) zoneOffset24);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.UTC;
        boolean boolean28 = chronoField26.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.of(localDateTime23, (java.time.ZoneId) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime30 = java.time.ZonedDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset27);
        int int31 = zonedDateTime30.getDayOfMonth();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle11 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle11.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField26.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer8.putShort((int) 'x', (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale2 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayVariant(locale2);
        java.util.Optional<java.lang.Cloneable> cloneableOptional7 = java.util.Optional.of((java.lang.Cloneable) locale0);
        java.lang.Cloneable cloneable8 = cloneableOptional7.get();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(cloneableOptional7);
        org.junit.Assert.assertNotNull(cloneable8);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress1 = java.net.InetAddress.getByName(":");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: :: invalid IPv6 address");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        boolean boolean6 = file2.setWritable(true, false);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        int int3 = localDate1.getDayOfYear();
        java.time.LocalDate localDate5 = localDate1.withYear((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime9 = localDate5.atTime((int) ':', (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 58");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.time.Period period0 = java.time.Period.ZERO;
        org.junit.Assert.assertNotNull(period0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        int int3 = localDate1.getDayOfYear();
        java.time.LocalDate localDate5 = localDate1.withYear((int) ' ');
        java.time.LocalDate localDate7 = localDate1.plusWeeks((long) 0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.io.File file1 = new java.io.File("java.time");
        java.io.File file2 = file1.getAbsoluteFile();
        boolean boolean4 = file1.setLastModified((long) 10);
        boolean boolean5 = file1.isFile();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.time");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment/java.time");
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 2);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.lang.Character[] charArray4 = new java.lang.Character[] { 'u', '4', 'x', 'a' };
        java.util.ArrayList<java.lang.Character> charList5 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList5, charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = charList5.set(4096, (java.lang.Character) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4096, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit10 = chronoField9.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = localDate4.getLong((java.time.temporal.TemporalField) chronoField9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MilliOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField9.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit10 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit10.equals(java.time.temporal.ChronoUnit.DAYS));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter9);
        java.time.LocalDateTime localDateTime16 = localDate4.atStartOfDay();
        java.time.LocalDate localDate18 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int19 = localDate18.getMonthValue();
        int int20 = localDate18.getDayOfYear();
        java.time.LocalDate localDate22 = localDate18.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit24 = chronoField23.getRangeUnit();
        long long25 = localDate4.until((java.time.temporal.Temporal) localDate18, temporalUnit24);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<?> wildcardChronoZonedDateTime26 = java.time.chrono.ChronoZonedDateTime.from((java.time.temporal.TemporalAccessor) localDate4);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 1970-01-11 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField23.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit24 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit24.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.time.format.TextStyle textStyle3 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle4 = textStyle3.asNormal();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale6.getDisplayScript(locale9);
        java.lang.String str12 = zoneOffset1.getDisplayName(textStyle3, locale6);
        java.time.LocalTime localTime13 = java.time.LocalTime.now((java.time.ZoneId) zoneOffset1);
        java.time.LocalTime localTime15 = localTime13.plusMinutes((-359984L));
        boolean boolean17 = localTime15.equals((java.lang.Object) 16L);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit19 = chronoField18.getRangeUnit();
        java.time.LocalTime localTime21 = localTime15.with((java.time.temporal.TemporalField) chronoField18, (long) 'x');
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + textStyle3 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle3.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit19 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit19.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        intStream16.close();
        java.util.function.IntToDoubleFunction intToDoubleFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream20 = intStream16.mapToDouble(intToDoubleFunction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.time.zone.ZoneRules zoneRules3 = zoneOffset1.getRules();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        boolean boolean8 = chronoField6.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset7);
        java.time.format.TextStyle textStyle9 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle10 = textStyle9.asNormal();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.lang.String str18 = zoneOffset7.getDisplayName(textStyle9, locale12);
        int int19 = zoneOffset7.getTotalSeconds();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset7);
        java.time.LocalDateTime localDateTime22 = localDateTime20.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.UTC;
        boolean boolean27 = chronoField25.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset26);
        java.time.format.TextStyle textStyle28 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle29 = textStyle28.asNormal();
        java.util.Locale locale31 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet32 = locale31.getExtensionKeys();
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getDisplayCountry();
        java.lang.String str36 = locale31.getDisplayScript(locale34);
        java.lang.String str37 = zoneOffset26.getDisplayName(textStyle28, locale31);
        int int38 = zoneOffset26.getTotalSeconds();
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset26);
        java.time.LocalDateTime localDateTime41 = localDateTime39.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime43 = localDateTime41.atZone((java.time.ZoneId) zoneOffset42);
        java.time.temporal.ChronoField chronoField44 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.UTC;
        boolean boolean46 = chronoField44.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset45);
        java.time.ZonedDateTime zonedDateTime47 = java.time.ZonedDateTime.of(localDateTime41, (java.time.ZoneId) zoneOffset45);
        java.time.DayOfWeek dayOfWeek48 = zonedDateTime47.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime50 = zonedDateTime47.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal51 = localDateTime20.adjustInto((java.time.temporal.Temporal) zonedDateTime50);
        java.time.LocalDateTime localDateTime52 = zonedDateTime50.toLocalDateTime();
        java.time.ZoneOffset zoneOffset53 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int58 = zoneOffset53.compareTo(zoneOffset57);
        boolean boolean59 = zoneRules3.isValidOffset(localDateTime52, zoneOffset57);
        java.time.Instant instant61 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant63 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean64 = instant61.isAfter(instant63);
        java.time.Duration duration65 = zoneRules3.getDaylightSavings(instant63);
        java.lang.String str66 = instant63.toString();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneRules3);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField6.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z" + "'", str18, "Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField25.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + textStyle28 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle28.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle29 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle29.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(charSet32);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Z" + "'", str37, "Z");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime43);
        org.junit.Assert.assertTrue("'" + chronoField44 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField44.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zonedDateTime47);
        org.junit.Assert.assertTrue("'" + dayOfWeek48 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek48.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime50);
        org.junit.Assert.assertNotNull(temporal51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(zoneOffset53);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4210 + "'", int58 == 4210);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1970-01-01T00:00:00.120Z" + "'", str66, "1970-01-01T00:00:00.120Z");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        boolean boolean2 = offsetTime0.isEqual(offsetTime1);
        java.time.OffsetTime offsetTime4 = offsetTime0.plusSeconds((long) (short) 1);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(offsetTime4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MINUTE_OF_DAY;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.MINUTE_OF_DAY));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile(":", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime20 = localDateTime16.plusMonths((long) (short) 0);
        java.time.LocalDateTime localDateTime22 = localDateTime16.minusWeeks((long) 16384);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean4 = instant1.isAfter(instant3);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.UTC;
        boolean boolean9 = chronoField7.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset8);
        java.time.format.TextStyle textStyle10 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle11 = textStyle10.asNormal();
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.lang.String str19 = zoneOffset8.getDisplayName(textStyle10, locale13);
        int int20 = zoneOffset8.getTotalSeconds();
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset8);
        java.time.LocalDateTime localDateTime23 = localDateTime21.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime25 = localDateTime23.atZone((java.time.ZoneId) zoneOffset24);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.UTC;
        boolean boolean28 = chronoField26.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.of(localDateTime23, (java.time.ZoneId) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime30 = java.time.ZonedDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset27);
        java.time.Instant instant32 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant34 = instant32.minusMillis((long) 'x');
        int int35 = instant1.compareTo(instant34);
        java.time.Instant instant37 = instant34.minusMillis(280504143872L);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle11 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle11.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField26.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 120000000 + "'", int35 == 120000000);
        org.junit.Assert.assertNotNull(instant37);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByName("OptionalLong[0]");
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange4 = chronology2.range(chronoField3);
        java.time.Instant instant6 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant8 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean9 = instant6.isAfter(instant8);
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.UTC;
        boolean boolean12 = chronoField10.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset11);
        java.time.format.TextStyle textStyle13 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle14 = textStyle13.asNormal();
        java.util.Locale locale16 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale16.getDisplayScript(locale19);
        java.lang.String str22 = zoneOffset11.getDisplayName(textStyle13, locale16);
        int int23 = zoneOffset11.getTotalSeconds();
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime24 = chronology2.zonedDateTime(instant8, (java.time.ZoneId) zoneOffset11);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange26 = chronoField25.range();
        java.time.temporal.TemporalUnit temporalUnit27 = chronoField25.getRangeUnit();
        java.time.temporal.ValueRange valueRange28 = chronology2.range(chronoField25);
        long long29 = valueRange28.getLargestMinimum();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + textStyle13 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle13.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle14 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle14.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime24);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField25.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange26);
        org.junit.Assert.assertTrue("'" + temporalUnit27 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit27.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.LocalTime localTime10 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology11 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange13 = chronology11.range(chronoField12);
        java.time.Instant instant15 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant17 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean18 = instant15.isAfter(instant17);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.UTC;
        boolean boolean21 = chronoField19.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset20);
        java.time.format.TextStyle textStyle22 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle23 = textStyle22.asNormal();
        java.util.Locale locale25 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.util.Locale locale28 = new java.util.Locale("");
        java.lang.String str29 = locale28.getDisplayCountry();
        java.lang.String str30 = locale25.getDisplayScript(locale28);
        java.lang.String str31 = zoneOffset20.getDisplayName(textStyle22, locale25);
        int int32 = zoneOffset20.getTotalSeconds();
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime33 = chronology11.zonedDateTime(instant17, (java.time.ZoneId) zoneOffset20);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate34 = localDate1.with((java.time.temporal.TemporalAdjuster) instant17);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + textStyle22 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle22.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle23 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle23.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Z" + "'", str31, "Z");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime33);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        int int3 = localDate1.getDayOfYear();
        java.time.LocalDate localDate5 = localDate1.withYear((int) ' ');
        long long6 = localDate1.toEpochDay();
        java.time.DayOfWeek dayOfWeek7 = localDate1.getDayOfWeek();
        java.time.DayOfWeek dayOfWeek9 = dayOfWeek7.plus((long) 466000000);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + dayOfWeek7 + "' != '" + java.time.DayOfWeek.SUNDAY + "'", dayOfWeek7.equals(java.time.DayOfWeek.SUNDAY));
        org.junit.Assert.assertTrue("'" + dayOfWeek9 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek9.equals(java.time.DayOfWeek.THURSDAY));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.net.UnknownHostException unknownHostException1 = new java.net.UnknownHostException("1969-12-27T20:10:16.000000097Z");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.lang.Character[] charArray4 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList5 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList5, charArray4);
        java.lang.Character[] charArray8 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList9 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList9, charArray8);
        boolean boolean11 = charList5.removeAll((java.util.Collection<java.lang.Character>) charList9);
        java.util.ListIterator<java.lang.Character> charItor12 = charList5.listIterator();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap15 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap18 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean20 = charListMap18.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray22 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList23 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList23, charArray22);
        int[] intArray31 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream32 = java.util.stream.IntStream.of(intArray31);
        java.util.stream.IntStream intStream33 = charListMap18.put(charList23, intStream32);
        int[] intArray40 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream41 = java.util.stream.IntStream.of(intArray40);
        java.util.Spliterator<java.lang.Integer> intSpliterator42 = intStream41.spliterator();
        java.util.stream.IntStream intStream43 = charListMap15.put(charList23, intStream41);
        int[] intArray50 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream51 = java.util.stream.IntStream.of(intArray50);
        boolean boolean52 = charListMap2.replace(charList5, intStream41, intStream51);
        java.lang.Runnable runnable53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream54 = intStream51.onClose(runnable53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charItor12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNull(intStream33);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertNotNull(intSpliterator42);
        org.junit.Assert.assertNull(intStream43);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.LocalDateTime localDateTime22 = localDateTime18.withNano((int) (short) 1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        double[] doubleArray6 = new double[] { 10L, 16.0d, (-1), (byte) -1, 120000000, 120000000 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer9 = java.nio.DoubleBuffer.wrap(doubleArray6, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 16.0, -1.0, -1.0, 1.2E8, 1.2E8]");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.of("1969-12-27T20:00:16.000000097");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unknown chronology: 1969-12-27T20:00:16.000000097");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter14);
        java.lang.String str16 = dateTimeFormatter14.toString();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ParseCaseSensitive(false)Value(WeekBasedYear,4,10,EXCEEDS_PAD)'-W'Value(WeekOfWeekBasedYear,2)'-'Value(DayOfWeek,1)[Offset(+HH:MM:ss,'Z')]" + "'", str16, "ParseCaseSensitive(false)Value(WeekBasedYear,4,10,EXCEEDS_PAD)'-W'Value(WeekOfWeekBasedYear,2)'-'Value(DayOfWeek,1)[Offset(+HH:MM:ss,'Z')]");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = instant1.minusMillis((long) 'x');
        int int4 = instant3.getNano();
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition5 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        boolean boolean10 = chronoField8.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset9);
        java.time.format.TextStyle textStyle11 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle12 = textStyle11.asNormal();
        java.util.Locale locale14 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale14.getDisplayScript(locale17);
        java.lang.String str20 = zoneOffset9.getDisplayName(textStyle11, locale14);
        int int21 = zoneOffset9.getTotalSeconds();
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset9);
        java.time.LocalDateTime localDateTime24 = localDateTime22.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime26 = localDateTime22.plusMonths((long) (short) 0);
        java.time.LocalTime localTime27 = localDateTime26.toLocalTime();
        java.time.Instant instant29 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant31 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean32 = instant29.isAfter(instant31);
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.UTC;
        boolean boolean37 = chronoField35.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset36);
        java.time.format.TextStyle textStyle38 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle39 = textStyle38.asNormal();
        java.util.Locale locale41 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet42 = locale41.getExtensionKeys();
        java.util.Locale locale44 = new java.util.Locale("");
        java.lang.String str45 = locale44.getDisplayCountry();
        java.lang.String str46 = locale41.getDisplayScript(locale44);
        java.lang.String str47 = zoneOffset36.getDisplayName(textStyle38, locale41);
        int int48 = zoneOffset36.getTotalSeconds();
        java.time.LocalDateTime localDateTime49 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset36);
        java.time.LocalDateTime localDateTime51 = localDateTime49.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset52 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime53 = localDateTime51.atZone((java.time.ZoneId) zoneOffset52);
        java.time.temporal.ChronoField chronoField54 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.UTC;
        boolean boolean56 = chronoField54.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset55);
        java.time.ZonedDateTime zonedDateTime57 = java.time.ZonedDateTime.of(localDateTime51, (java.time.ZoneId) zoneOffset55);
        java.time.ZonedDateTime zonedDateTime58 = java.time.ZonedDateTime.ofInstant(instant29, (java.time.ZoneId) zoneOffset55);
        java.time.temporal.ChronoField chronoField61 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset62 = java.time.ZoneOffset.UTC;
        boolean boolean63 = chronoField61.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset62);
        java.time.format.TextStyle textStyle64 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle65 = textStyle64.asNormal();
        java.util.Locale locale67 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.util.Locale locale70 = new java.util.Locale("");
        java.lang.String str71 = locale70.getDisplayCountry();
        java.lang.String str72 = locale67.getDisplayScript(locale70);
        java.lang.String str73 = zoneOffset62.getDisplayName(textStyle64, locale67);
        int int74 = zoneOffset62.getTotalSeconds();
        java.time.LocalDateTime localDateTime75 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset62);
        java.time.LocalDateTime localDateTime76 = timeDefinition5.createDateTime(localDateTime26, zoneOffset55, zoneOffset62);
        java.time.Clock clock77 = java.time.Clock.fixed(instant3, (java.time.ZoneId) zoneOffset55);
        java.time.Duration duration79 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration81 = duration79.plusMillis((long) (byte) 100);
        java.time.Duration duration83 = duration81.minusMillis((long) (byte) 100);
        java.time.Clock clock84 = java.time.Clock.offset(clock77, duration83);
        java.time.Period period86 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period88 = period86.plusYears((long) (short) 0);
        java.time.Period period90 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod91 = period88.plus((java.time.temporal.TemporalAmount) period90);
        java.time.chrono.ChronoPeriod chronoPeriod93 = period90.multipliedBy((int) '#');
        boolean boolean94 = clock77.equals((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + timeDefinition5 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition5.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField8.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + textStyle11 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle11.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle12 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle12.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField35.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + textStyle38 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle38.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle39 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle39.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(charSet42);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Z" + "'", str47, "Z");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(zoneOffset52);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime53);
        org.junit.Assert.assertTrue("'" + chronoField54 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField54.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(zonedDateTime57);
        org.junit.Assert.assertNotNull(zonedDateTime58);
        org.junit.Assert.assertTrue("'" + chronoField61 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField61.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + textStyle64 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle64.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle65 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle65.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Z" + "'", str73, "Z");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(clock77);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(clock84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(chronoPeriod91);
        org.junit.Assert.assertNotNull(chronoPeriod93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate37 = localDate27.withMonth(0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?> wildcardClass3 = null;
        java.lang.Class[] classArray5 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        wildcardClassArray6[0] = wildcardClass3;
        boolean boolean10 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray6, false);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        long long21 = localDateChronoZonedDateTime20.toEpochSecond();
        java.time.LocalDate localDate23 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit25 = chronoField24.getRangeUnit();
        boolean boolean26 = localDate23.isSupported(temporalUnit25);
        boolean boolean27 = localDateChronoZonedDateTime20.isSupported(temporalUnit25);
        java.time.temporal.TemporalAdjuster temporalAdjuster28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal29 = localDateChronoZonedDateTime20.with(temporalAdjuster28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-359984L) + "'", long21 == (-359984L));
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField24.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit25 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit25.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange4 = java.time.temporal.ValueRange.of(16L, (long) 97, (long) 16384, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ':');
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.UTC;
        boolean boolean6 = chronoField4.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset5);
        java.time.format.TextStyle textStyle7 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle8 = textStyle7.asNormal();
        java.util.Locale locale10 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getDisplayCountry();
        java.lang.String str15 = locale10.getDisplayScript(locale13);
        java.lang.String str16 = zoneOffset5.getDisplayName(textStyle7, locale10);
        int int17 = zoneOffset5.getTotalSeconds();
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset5);
        java.time.LocalDateTime localDateTime20 = localDateTime18.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime22 = localDateTime18.plusMonths((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal23 = instant1.adjustInto((java.time.temporal.Temporal) localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + textStyle7 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle7.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle8 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle8.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        long long2 = timeUnit0.toSeconds((long) 1);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        charSet2.clear();
        java.util.Spliterator<java.lang.Character> charSpliterator4 = charSet2.spliterator();
        int int5 = charSet2.size();
        charSet2.clear();
        java.nio.file.AccessMode accessMode7 = java.nio.file.AccessMode.READ;
        java.nio.file.AccessMode[] accessModeArray8 = new java.nio.file.AccessMode[] { accessMode7 };
        java.nio.file.AccessMode[] accessModeArray9 = charSet2.toArray(accessModeArray8);
        java.lang.Character[] charArray17 = new java.lang.Character[] { 'a', 'u', '4', 'u', 'u', ' ', '#' };
        java.util.ArrayList<java.lang.Character> charList18 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList18, charArray17);
        java.util.Spliterator<java.lang.Character> charSpliterator20 = charList18.spliterator();
        java.util.Locale locale22 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        charSet23.clear();
        java.util.Spliterator<java.lang.Character> charSpliterator25 = charSet23.spliterator();
        int int26 = charSet23.size();
        charSet23.clear();
        boolean boolean28 = charList18.retainAll((java.util.Collection<java.lang.Character>) charSet23);
        boolean boolean29 = charSet2.removeAll((java.util.Collection<java.lang.Character>) charSet23);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(charSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + accessMode7 + "' != '" + java.nio.file.AccessMode.READ + "'", accessMode7.equals(java.nio.file.AccessMode.READ));
        org.junit.Assert.assertNotNull(accessModeArray8);
        org.junit.Assert.assertNotNull(accessModeArray9);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charSpliterator20);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertNotNull(charSpliterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate((int) (short) 1);
        int int2 = floatBuffer1.arrayOffset();
        boolean boolean3 = floatBuffer1.hasArray();
        java.nio.FloatBuffer floatBuffer4 = floatBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer7 = floatBuffer1.put(10, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(floatBuffer4);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer8.putInt(1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream1, true);
        // The following exception was thrown during execution in test generation
        try {
            printWriter3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.chrono.Chronology chronology21 = localDateChronoZonedDateTime20.getChronology();
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        boolean boolean26 = chronoField24.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset25);
        java.time.format.TextStyle textStyle27 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle28 = textStyle27.asNormal();
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet31 = locale30.getExtensionKeys();
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getDisplayCountry();
        java.lang.String str35 = locale30.getDisplayScript(locale33);
        java.lang.String str36 = zoneOffset25.getDisplayName(textStyle27, locale30);
        int int37 = zoneOffset25.getTotalSeconds();
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset25);
        java.time.LocalDateTime localDateTime40 = localDateTime38.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime42 = localDateTime40.atZone((java.time.ZoneId) zoneOffset41);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset44 = java.time.ZoneOffset.UTC;
        boolean boolean45 = chronoField43.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset44);
        java.time.ZonedDateTime zonedDateTime46 = java.time.ZonedDateTime.of(localDateTime40, (java.time.ZoneId) zoneOffset44);
        java.time.DayOfWeek dayOfWeek47 = zonedDateTime46.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime49 = zonedDateTime46.withMinute((int) (byte) 10);
        java.time.format.DateTimeFormatter dateTimeFormatter50 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField51 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray52 = new java.time.temporal.TemporalField[] { chronoField51 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet53 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet53, temporalFieldArray52);
        java.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter50.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet53);
        java.util.Locale locale56 = dateTimeFormatter50.getLocale();
        java.lang.String str57 = zonedDateTime49.format(dateTimeFormatter50);
        long long58 = zonedDateTime49.toEpochSecond();
        java.time.Month month59 = zonedDateTime49.getMonth();
        java.time.ZoneOffset zoneOffset60 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset64 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int65 = zoneOffset60.compareTo(zoneOffset64);
        java.time.ZonedDateTime zonedDateTime66 = zonedDateTime49.withZoneSameInstant((java.time.ZoneId) zoneOffset64);
        java.time.ZoneOffset zoneOffset67 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset71 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int72 = zoneOffset67.compareTo(zoneOffset71);
        java.time.ZonedDateTime zonedDateTime73 = zonedDateTime66.with((java.time.temporal.TemporalAdjuster) zoneOffset67);
        java.time.chrono.ChronoLocalDate chronoLocalDate74 = chronology21.dateNow((java.time.ZoneId) zoneOffset67);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField24.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + textStyle27 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle27.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle28 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle28.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Z" + "'", str36, "Z");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime42);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField43.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertTrue("'" + dayOfWeek47 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek47.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime49);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertTrue("'" + chronoField51 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField51.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1969-W52-6Z" + "'", str57, "1969-W52-6Z");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-359384L) + "'", long58 == (-359384L));
        org.junit.Assert.assertTrue("'" + month59 + "' != '" + java.time.Month.DECEMBER + "'", month59.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertNotNull(zoneOffset60);
        org.junit.Assert.assertNotNull(zoneOffset64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4210 + "'", int65 == 4210);
        org.junit.Assert.assertNotNull(zonedDateTime66);
        org.junit.Assert.assertNotNull(zoneOffset67);
        org.junit.Assert.assertNotNull(zoneOffset71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 4210 + "'", int72 == 4210);
        org.junit.Assert.assertNotNull(zonedDateTime73);
        org.junit.Assert.assertNotNull(chronoLocalDate74);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        java.time.LocalTime localTime12 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology13 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime15 = localTime12.minusHours(1L);
        boolean boolean16 = localTime10.isAfter(localTime12);
        java.time.LocalTime localTime18 = localTime10.plusSeconds((long) 120000000);
        int int19 = localTime10.getMinute();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("MilliOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: MilliOfDay");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("1970-W02-7", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 1970-W02-7");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.time.Period period3 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period5 = period3.plusYears((long) (short) 0);
        java.time.Period period7 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod8 = period5.plus((java.time.temporal.TemporalAmount) period7);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray14);
        boolean boolean16 = period7.equals((java.lang.Object) byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.write(byteArray14, 31, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(chronoPeriod8);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod5 = period3.multipliedBy((int) ' ');
        java.time.LocalDate localDate7 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField8.getRangeUnit();
        boolean boolean10 = localDate7.isSupported(temporalUnit9);
        long long11 = chronoPeriod5.get(temporalUnit9);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        boolean boolean16 = chronoField14.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset15);
        java.time.format.TextStyle textStyle17 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle18 = textStyle17.asNormal();
        java.util.Locale locale20 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.lang.String str26 = zoneOffset15.getDisplayName(textStyle17, locale20);
        int int27 = zoneOffset15.getTotalSeconds();
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset15);
        java.time.LocalDateTime localDateTime30 = localDateTime28.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime32 = localDateTime28.plusMonths((long) (short) 0);
        java.time.OffsetTime offsetTime33 = java.time.OffsetTime.now();
        java.time.LocalDate localDate35 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate37 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int38 = localDate37.getMonthValue();
        int int39 = localDate37.getDayOfYear();
        boolean boolean40 = localDate35.isAfter((java.time.chrono.ChronoLocalDate) localDate37);
        java.time.OffsetDateTime offsetDateTime41 = offsetTime33.atDate(localDate35);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = temporalUnit9.between((java.time.temporal.Temporal) localDateTime28, (java.time.temporal.Temporal) localDate35);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: 1970-01-11 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(chronoPeriod5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField8.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField14.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + textStyle17 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle17.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle18 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle18.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Z" + "'", str26, "Z");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 11 + "'", int39 == 11);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(offsetDateTime41);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.security.cert.CertificateEncodingException certificateEncodingException0 = new java.security.cert.CertificateEncodingException();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = java.time.Duration.ofMinutes(6603384152749567654L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: long overflow");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.time.Month month0 = java.time.Month.JULY;
        int int1 = month0.minLength();
        java.time.Month month3 = month0.plus(0L);
        int int5 = month3.length(false);
        int int6 = month3.getValue();
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JULY + "'", month0.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
        org.junit.Assert.assertTrue("'" + month3 + "' != '" + java.time.Month.JULY + "'", month3.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = file2.createNewFile();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.INSTANT_SECONDS;
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        boolean boolean5 = chronoField3.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset4);
        java.time.format.TextStyle textStyle6 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle7 = textStyle6.asNormal();
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale9.getDisplayScript(locale12);
        java.lang.String str15 = zoneOffset4.getDisplayName(textStyle6, locale9);
        int int16 = zoneOffset4.getTotalSeconds();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset4);
        java.time.LocalDateTime localDateTime19 = localDateTime17.minusHours((long) (byte) 100);
        java.time.format.DateTimeFormatter dateTimeFormatter20 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.lang.String str21 = localDateTime17.format(dateTimeFormatter20);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime23 = chronoField0.adjustInto(localDateTime17, (-1000000L));
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.INSTANT_SECONDS + "'", chronoField0.equals(java.time.temporal.ChronoField.INSTANT_SECONDS));
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle7 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle7.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-W01-4" + "'", str21, "1970-W01-4");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.io.File file1 = new java.io.File("java.time");
        java.io.File file2 = file1.getAbsoluteFile();
        boolean boolean4 = file1.setLastModified((long) 10);
        boolean boolean5 = file1.createNewFile();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.time");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment/java.time");
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of((int) 'u', (int) ':', 2, 64, 11, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 58");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        char[] charArray4 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        java.nio.CharBuffer charBuffer7 = charBuffer5.put('#');
        char[] charArray9 = new char[] { '#' };
        java.nio.CharBuffer charBuffer10 = charBuffer5.get(charArray9);
        java.lang.Object obj11 = null;
        boolean boolean12 = charBuffer10.equals(obj11);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray3 = new java.time.temporal.TemporalField[] { chronoField2 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet4 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet4, temporalFieldArray3);
        java.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter1.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet4);
        java.util.Locale locale7 = dateTimeFormatter1.getLocale();
        java.time.format.DateTimeFormatter dateTimeFormatter8 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray10 = new java.time.temporal.TemporalField[] { chronoField9 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet11 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet11, temporalFieldArray10);
        java.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter1.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet11);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime15 = java.time.LocalTime.parse((java.lang.CharSequence) "Z:P-1M#1970-W01-4", dateTimeFormatter14);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Z:P-1M#1970-W01-4' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.time.format.TextStyle textStyle3 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle4 = textStyle3.asNormal();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale6.getDisplayScript(locale9);
        java.lang.String str12 = zoneOffset1.getDisplayName(textStyle3, locale6);
        int int13 = zoneOffset1.getTotalSeconds();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset1);
        java.time.LocalDate localDate15 = localDateTime14.toLocalDate();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + textStyle3 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle3.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean4 = instant1.isAfter(instant3);
        java.time.Instant instant6 = instant3.plusSeconds((long) 0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.io.File file1 = new java.io.File("java.time");
        java.io.File file2 = file1.getAbsoluteFile();
        java.io.File file3 = file1.getCanonicalFile();
        boolean boolean6 = file3.setExecutable(false, false);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.time");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment/java.time");
        org.junit.Assert.assertNotNull(file3);
// flaky:         org.junit.Assert.assertEquals(file3.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/experiment/java.time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate((int) (short) 1);
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.allocate((int) (short) 1);
        float float4 = floatBuffer3.get();
        java.nio.FloatBuffer floatBuffer5 = floatBuffer1.put(floatBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatBuffer5);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.net.URI uRI3 = new java.net.URI("Z", "P-1M", "1970-W01-4");
        java.lang.String str4 = uRI3.getRawPath();
        java.lang.String str5 = uRI3.toASCIIString();
        boolean boolean6 = uRI3.isAbsolute();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Z:P-1M#1970-W01-4" + "'", str5, "Z:P-1M#1970-W01-4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.LANGUAGE;
        org.junit.Assert.assertNotNull(attribute0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        long[] longArray6 = new long[] { 10000000000L, 466000000, (-359984L), (byte) -1, (byte) 0, 0L };
        java.nio.LongBuffer longBuffer9 = java.nio.LongBuffer.wrap(longArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer11 = longBuffer9.put((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10000000000, 466000000, -359984, -1, 0, 0]");
        org.junit.Assert.assertNotNull(longBuffer9);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.util.DoubleSummaryStatistics doubleSummaryStatistics0 = new java.util.DoubleSummaryStatistics();
        doubleSummaryStatistics0.accept((double) 10);
        double double3 = doubleSummaryStatistics0.getAverage();
        java.util.stream.DoubleStream.Builder builder4 = java.util.stream.DoubleStream.builder();
        java.util.function.DoubleConsumer doubleConsumer5 = doubleSummaryStatistics0.andThen((java.util.function.DoubleConsumer) builder4);
        double double6 = doubleSummaryStatistics0.getMax();
        org.junit.Assert.assertEquals(doubleSummaryStatistics0.toString(), "DoubleSummaryStatistics{count=1, sum=10.000000, min=10.000000, average=10.000000, max=10.000000}");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(doubleConsumer5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.minusHours((long) (short) 0);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime28 = zonedDateTime24.withLaterOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.UTC;
        boolean boolean33 = chronoField31.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset32);
        java.time.format.TextStyle textStyle34 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle35 = textStyle34.asNormal();
        java.util.Locale locale37 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        java.util.Locale locale40 = new java.util.Locale("");
        java.lang.String str41 = locale40.getDisplayCountry();
        java.lang.String str42 = locale37.getDisplayScript(locale40);
        java.lang.String str43 = zoneOffset32.getDisplayName(textStyle34, locale37);
        int int44 = zoneOffset32.getTotalSeconds();
        java.time.LocalDateTime localDateTime45 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset32);
        java.time.LocalDateTime localDateTime47 = localDateTime45.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset48 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime49 = localDateTime47.atZone((java.time.ZoneId) zoneOffset48);
        java.time.temporal.ChronoField chronoField50 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset51 = java.time.ZoneOffset.UTC;
        boolean boolean52 = chronoField50.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset51);
        java.time.ZonedDateTime zonedDateTime53 = java.time.ZonedDateTime.of(localDateTime47, (java.time.ZoneId) zoneOffset51);
        java.time.DayOfWeek dayOfWeek54 = zonedDateTime53.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime56 = zonedDateTime53.withMinute((int) (byte) 10);
        java.time.Period period58 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period60 = period58.plusYears((long) (short) 0);
        java.time.Period period62 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod63 = period60.plus((java.time.temporal.TemporalAmount) period62);
        java.time.temporal.Temporal temporal64 = zonedDateTime56.minus((java.time.temporal.TemporalAmount) chronoPeriod63);
        boolean boolean65 = localDateChronoZonedDateTime28.isEqual((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime56);
        java.time.Month month66 = zonedDateTime56.getMonth();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime28);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField31.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + textStyle34 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle34.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle35 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle35.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Z" + "'", str43, "Z");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(zoneOffset48);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime49);
        org.junit.Assert.assertTrue("'" + chronoField50 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField50.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(zonedDateTime53);
        org.junit.Assert.assertTrue("'" + dayOfWeek54 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek54.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(chronoPeriod63);
        org.junit.Assert.assertNotNull(temporal64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + month66 + "' != '" + java.time.Month.DECEMBER + "'", month66.equals(java.time.Month.DECEMBER));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.wrap(byteArray5, 31, 466000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, -1, 10, 10]");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '4');
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream7 = doubleStream5.limit(10L);
        java.util.function.DoublePredicate doublePredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = doubleStream5.noneMatch(doublePredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange37 = offsetTime0.range((java.time.temporal.TemporalField) chronoField36);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField36.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream6.sequential();
        java.util.stream.DoubleStream doubleStream8 = doubleStream7.distinct();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) 10);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap4 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean6 = charListMap4.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList9 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList9, charArray8);
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream18 = java.util.stream.IntStream.of(intArray17);
        java.util.stream.IntStream intStream19 = charListMap4.put(charList9, intStream18);
        boolean boolean20 = optionalDouble1.equals((java.lang.Object) charList9);
        double double22 = optionalDouble1.orElse((double) '#');
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNull(intStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.withMinute((int) (byte) 10);
        java.time.format.DateTimeFormatter dateTimeFormatter28 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray30 = new java.time.temporal.TemporalField[] { chronoField29 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet31 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet31, temporalFieldArray30);
        java.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter28.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet31);
        java.util.Locale locale34 = dateTimeFormatter28.getLocale();
        java.lang.String str35 = zonedDateTime27.format(dateTimeFormatter28);
        long long36 = zonedDateTime27.toEpochSecond();
        java.time.Month month37 = zonedDateTime27.getMonth();
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int43 = zoneOffset38.compareTo(zoneOffset42);
        java.time.ZonedDateTime zonedDateTime44 = zonedDateTime27.withZoneSameInstant((java.time.ZoneId) zoneOffset42);
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset49 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int50 = zoneOffset45.compareTo(zoneOffset49);
        java.time.ZonedDateTime zonedDateTime51 = zonedDateTime44.with((java.time.temporal.TemporalAdjuster) zoneOffset45);
        java.time.ZonedDateTime zonedDateTime52 = zonedDateTime44.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField29.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-W52-6Z" + "'", str35, "1969-W52-6Z");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-359384L) + "'", long36 == (-359384L));
        org.junit.Assert.assertTrue("'" + month37 + "' != '" + java.time.Month.DECEMBER + "'", month37.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4210 + "'", int43 == 4210);
        org.junit.Assert.assertNotNull(zonedDateTime44);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertNotNull(zoneOffset49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4210 + "'", int50 == 4210);
        org.junit.Assert.assertNotNull(zonedDateTime51);
        org.junit.Assert.assertNotNull(zonedDateTime52);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano((int) (byte) 0);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange4 = chronoField3.range();
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField3.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime6 = offsetTime0.truncatedTo(temporalUnit5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit is too large to be used for truncation");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange4);
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayCountry();
        java.lang.String str7 = locale1.getDisplayVariant(locale3);
        java.util.Optional<java.lang.Cloneable> cloneableOptional8 = java.util.Optional.of((java.lang.Cloneable) locale1);
        java.lang.String str9 = locale0.getDisplayVariant(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(cloneableOptional8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.OptionalInt optionalInt8 = intStream7.findFirst();
        int int10 = optionalInt8.orElse(64);
        java.io.OutputStream outputStream11 = null;
        java.io.FilterOutputStream filterOutputStream12 = new java.io.FilterOutputStream(outputStream11);
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream12, true);
        boolean boolean15 = optionalInt8.equals((java.lang.Object) printWriter14);
        // The following exception was thrown during execution in test generation
        try {
            printWriter14.write("java.time", 100, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8292");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putFloat((float) 280504152064L);
        // The following exception was thrown during execution in test generation
        try {
            short short10 = byteBuffer8.getShort(64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[82, -126, -98, -77, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.Period period4 = java.time.Period.of((int) (short) 10, 97, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime5 = offsetTime0.plus((java.time.temporal.TemporalAmount) period4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.UTC;
        boolean boolean24 = chronoField22.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset23);
        java.time.format.TextStyle textStyle25 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle26 = textStyle25.asNormal();
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet29 = locale28.getExtensionKeys();
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayCountry();
        java.lang.String str33 = locale28.getDisplayScript(locale31);
        java.lang.String str34 = zoneOffset23.getDisplayName(textStyle25, locale28);
        int int35 = zoneOffset23.getTotalSeconds();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset23);
        java.time.LocalDateTime localDateTime38 = localDateTime36.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime40 = localDateTime36.plusMonths((long) (short) 0);
        java.time.LocalTime localTime41 = localDateTime40.toLocalTime();
        java.time.Instant instant44 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant46 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean47 = instant44.isAfter(instant46);
        java.time.Period period49 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period51 = period49.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod53 = period51.multipliedBy((int) ' ');
        java.time.LocalDate localDate55 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField56 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit57 = chronoField56.getRangeUnit();
        boolean boolean58 = localDate55.isSupported(temporalUnit57);
        long long59 = chronoPeriod53.get(temporalUnit57);
        boolean boolean60 = instant46.isSupported(temporalUnit57);
        java.time.temporal.Temporal temporal61 = localDateTime40.minus((-359984L), temporalUnit57);
        java.time.LocalDateTime localDateTime62 = localDateTime16.plus((long) 16, temporalUnit57);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField22.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + textStyle25 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle25.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle26 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle26.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Z" + "'", str34, "Z");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(chronoPeriod53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + chronoField56 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField56.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit57 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit57.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(temporal61);
        org.junit.Assert.assertNotNull(localDateTime62);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.nio.DoubleBuffer doubleBuffer1 = java.nio.DoubleBuffer.allocate((int) 'x');
        boolean boolean3 = doubleBuffer1.equals((java.lang.Object) (-1.0d));
        java.nio.DoubleBuffer doubleBuffer4 = doubleBuffer1.asReadOnlyBuffer();
        double double5 = doubleBuffer4.get();
        org.junit.Assert.assertNotNull(doubleBuffer1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.chrono.IsoChronology isoChronology4 = period3.getChronology();
        java.time.Instant instant6 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant8 = instant6.minusMillis((long) 'x');
        int int9 = instant8.getNano();
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition10 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        boolean boolean15 = chronoField13.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset14);
        java.time.format.TextStyle textStyle16 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle17 = textStyle16.asNormal();
        java.util.Locale locale19 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale19.getDisplayScript(locale22);
        java.lang.String str25 = zoneOffset14.getDisplayName(textStyle16, locale19);
        int int26 = zoneOffset14.getTotalSeconds();
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset14);
        java.time.LocalDateTime localDateTime29 = localDateTime27.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime31 = localDateTime27.plusMonths((long) (short) 0);
        java.time.LocalTime localTime32 = localDateTime31.toLocalTime();
        java.time.Instant instant34 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant36 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean37 = instant34.isAfter(instant36);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.format.TextStyle textStyle43 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle44 = textStyle43.asNormal();
        java.util.Locale locale46 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet47 = locale46.getExtensionKeys();
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getDisplayCountry();
        java.lang.String str51 = locale46.getDisplayScript(locale49);
        java.lang.String str52 = zoneOffset41.getDisplayName(textStyle43, locale46);
        int int53 = zoneOffset41.getTotalSeconds();
        java.time.LocalDateTime localDateTime54 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset41);
        java.time.LocalDateTime localDateTime56 = localDateTime54.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime58 = localDateTime56.atZone((java.time.ZoneId) zoneOffset57);
        java.time.temporal.ChronoField chronoField59 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset60 = java.time.ZoneOffset.UTC;
        boolean boolean61 = chronoField59.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset60);
        java.time.ZonedDateTime zonedDateTime62 = java.time.ZonedDateTime.of(localDateTime56, (java.time.ZoneId) zoneOffset60);
        java.time.ZonedDateTime zonedDateTime63 = java.time.ZonedDateTime.ofInstant(instant34, (java.time.ZoneId) zoneOffset60);
        java.time.temporal.ChronoField chronoField66 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset67 = java.time.ZoneOffset.UTC;
        boolean boolean68 = chronoField66.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset67);
        java.time.format.TextStyle textStyle69 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle70 = textStyle69.asNormal();
        java.util.Locale locale72 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet73 = locale72.getExtensionKeys();
        java.util.Locale locale75 = new java.util.Locale("");
        java.lang.String str76 = locale75.getDisplayCountry();
        java.lang.String str77 = locale72.getDisplayScript(locale75);
        java.lang.String str78 = zoneOffset67.getDisplayName(textStyle69, locale72);
        int int79 = zoneOffset67.getTotalSeconds();
        java.time.LocalDateTime localDateTime80 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset67);
        java.time.LocalDateTime localDateTime81 = timeDefinition10.createDateTime(localDateTime31, zoneOffset60, zoneOffset67);
        java.time.Clock clock82 = java.time.Clock.fixed(instant8, (java.time.ZoneId) zoneOffset60);
        java.time.Duration duration84 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration86 = duration84.plusMillis((long) (byte) 100);
        java.time.Duration duration88 = duration86.minusMillis((long) (byte) 100);
        java.time.Clock clock89 = java.time.Clock.offset(clock82, duration88);
        java.time.LocalTime localTime90 = java.time.LocalTime.now(clock89);
        java.time.LocalDate localDate91 = isoChronology4.dateNow(clock89);
        java.time.LocalDate localDate93 = localDate91.minusYears((long) (byte) 100);
        java.time.ZoneId zoneId94 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime95 = localDate93.atStartOfDay(zoneId94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(isoChronology4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + timeDefinition10 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition10.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField13.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + textStyle16 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle16.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle17 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle17.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + textStyle43 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle43.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle44 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle44.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Z" + "'", str52, "Z");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime58);
        org.junit.Assert.assertTrue("'" + chronoField59 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField59.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(zonedDateTime62);
        org.junit.Assert.assertNotNull(zonedDateTime63);
        org.junit.Assert.assertTrue("'" + chronoField66 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField66.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + textStyle69 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle69.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle70 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle70.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(charSet73);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Z" + "'", str78, "Z");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(clock82);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertNotNull(clock89);
        org.junit.Assert.assertNotNull(localTime90);
        org.junit.Assert.assertNotNull(localDate91);
        org.junit.Assert.assertNotNull(localDate93);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.time.Month month0 = java.time.Month.JANUARY;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JANUARY + "'", month0.equals(java.time.Month.JANUARY));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream4 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, true, "1969-W52-6Z");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1969-W52-6Z");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream6.sequential();
        doubleStream6.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = doubleStream6.sorted();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.util.DoubleSummaryStatistics doubleSummaryStatistics0 = new java.util.DoubleSummaryStatistics();
        doubleSummaryStatistics0.accept(10.0d);
        double double3 = doubleSummaryStatistics0.getMin();
        double double4 = doubleSummaryStatistics0.getMin();
        org.junit.Assert.assertEquals(doubleSummaryStatistics0.toString(), "DoubleSummaryStatistics{count=1, sum=10.000000, min=10.000000, average=10.000000, max=10.000000}");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.of(":");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: :");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.time.Month month0 = java.time.Month.JULY;
        int int1 = month0.minLength();
        java.time.Month month3 = month0.plus(0L);
        java.time.format.TextStyle textStyle4 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle5 = textStyle4.asNormal();
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = month3.getDisplayName(textStyle5, locale7);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        boolean boolean12 = month3.isSupported((java.time.temporal.TemporalField) chronoField11);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JULY + "'", month0.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
        org.junit.Assert.assertTrue("'" + month3 + "' != '" + java.time.Month.JULY + "'", month3.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7" + "'", str10, "7");
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField11.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.util.Locale locale2 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale2.getDisplayScript(locale5);
        java.time.chrono.Chronology chronology8 = java.time.chrono.Chronology.ofLocale(locale5);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ofPattern("1970-01-11", locale5);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter9);
        java.time.LocalDateTime localDateTime16 = localDate4.atStartOfDay();
        java.time.LocalDate localDate18 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int19 = localDate18.getMonthValue();
        int int20 = localDate18.getDayOfYear();
        java.time.LocalDate localDate22 = localDate18.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit24 = chronoField23.getRangeUnit();
        long long25 = localDate4.until((java.time.temporal.Temporal) localDate18, temporalUnit24);
        java.time.LocalDate localDate27 = localDate18.withMonth(11);
        java.time.LocalDate localDate29 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate31 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int32 = localDate31.getMonthValue();
        int int33 = localDate31.getDayOfYear();
        boolean boolean34 = localDate29.isAfter((java.time.chrono.ChronoLocalDate) localDate31);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        boolean boolean39 = chronoField37.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset38);
        java.time.format.TextStyle textStyle40 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle41 = textStyle40.asNormal();
        java.util.Locale locale43 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet44 = locale43.getExtensionKeys();
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayCountry();
        java.lang.String str48 = locale43.getDisplayScript(locale46);
        java.lang.String str49 = zoneOffset38.getDisplayName(textStyle40, locale43);
        int int50 = zoneOffset38.getTotalSeconds();
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset38);
        java.time.LocalDateTime localDateTime53 = localDateTime51.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset54 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime55 = localDateTime53.atZone((java.time.ZoneId) zoneOffset54);
        long long56 = localDateChronoZonedDateTime55.toEpochSecond();
        java.time.LocalDate localDate58 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField59 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit60 = chronoField59.getRangeUnit();
        boolean boolean61 = localDate58.isSupported(temporalUnit60);
        boolean boolean62 = localDateChronoZonedDateTime55.isSupported(temporalUnit60);
        long long63 = localDate27.until((java.time.temporal.Temporal) localDate29, temporalUnit60);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField23.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit24 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit24.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11 + "'", int33 == 11);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField37.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + textStyle40 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle40.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle41 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle41.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(charSet44);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Z" + "'", str49, "Z");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(zoneOffset54);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-359984L) + "'", long56 == (-359984L));
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertTrue("'" + chronoField59 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField59.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit60 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit60.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-304L) + "'", long63 == (-304L));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        byte[] byteArray2 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.write(byteArray2, 4210, (int) (short) -156);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean37 = offsetDateTime35.isSupported((java.time.temporal.TemporalField) chronoField36);
        java.time.temporal.ChronoField chronoField38 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset39 = java.time.ZoneOffset.UTC;
        boolean boolean40 = chronoField38.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset39);
        java.time.zone.ZoneRules zoneRules41 = zoneOffset39.getRules();
        java.time.ZonedDateTime zonedDateTime42 = offsetDateTime35.atZoneSameInstant((java.time.ZoneId) zoneOffset39);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset46 = java.time.ZoneOffset.UTC;
        boolean boolean47 = chronoField45.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset46);
        java.time.format.TextStyle textStyle48 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle49 = textStyle48.asNormal();
        java.util.Locale locale51 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet52 = locale51.getExtensionKeys();
        java.util.Locale locale54 = new java.util.Locale("");
        java.lang.String str55 = locale54.getDisplayCountry();
        java.lang.String str56 = locale51.getDisplayScript(locale54);
        java.lang.String str57 = zoneOffset46.getDisplayName(textStyle48, locale51);
        int int58 = zoneOffset46.getTotalSeconds();
        java.time.LocalDateTime localDateTime59 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset46);
        java.time.LocalDateTime localDateTime61 = localDateTime59.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset62 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime63 = localDateTime61.atZone((java.time.ZoneId) zoneOffset62);
        java.time.temporal.ChronoField chronoField64 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset65 = java.time.ZoneOffset.UTC;
        boolean boolean66 = chronoField64.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset65);
        java.time.ZonedDateTime zonedDateTime67 = java.time.ZonedDateTime.of(localDateTime61, (java.time.ZoneId) zoneOffset65);
        java.time.DayOfWeek dayOfWeek68 = zonedDateTime67.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime70 = zonedDateTime67.withMinute((int) (byte) 10);
        java.time.format.DateTimeFormatter dateTimeFormatter71 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField72 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray73 = new java.time.temporal.TemporalField[] { chronoField72 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet74 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet74, temporalFieldArray73);
        java.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter71.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet74);
        java.util.Locale locale77 = dateTimeFormatter71.getLocale();
        java.lang.String str78 = zonedDateTime70.format(dateTimeFormatter71);
        long long79 = zonedDateTime70.toEpochSecond();
        java.time.Month month80 = zonedDateTime70.getMonth();
        java.time.ZoneOffset zoneOffset81 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset85 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int86 = zoneOffset81.compareTo(zoneOffset85);
        java.time.ZonedDateTime zonedDateTime87 = zonedDateTime70.withZoneSameInstant((java.time.ZoneId) zoneOffset85);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime88 = zonedDateTime42.withZoneSameLocal((java.time.ZoneId) zoneOffset85);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField36.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + chronoField38 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField38.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(zoneRules41);
        org.junit.Assert.assertNotNull(zonedDateTime42);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField45.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + textStyle48 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle48.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle49 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle49.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNotNull(charSet52);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Z" + "'", str57, "Z");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(zoneOffset62);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime63);
        org.junit.Assert.assertTrue("'" + chronoField64 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField64.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(zonedDateTime67);
        org.junit.Assert.assertTrue("'" + dayOfWeek68 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek68.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime70);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertTrue("'" + chronoField72 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField72.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "1969-W52-6Z" + "'", str78, "1969-W52-6Z");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-359384L) + "'", long79 == (-359384L));
        org.junit.Assert.assertTrue("'" + month80 + "' != '" + java.time.Month.DECEMBER + "'", month80.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertNotNull(zoneOffset81);
        org.junit.Assert.assertNotNull(zoneOffset85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 4210 + "'", int86 == 4210);
        org.junit.Assert.assertNotNull(zonedDateTime87);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime88);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        java.util.Spliterator<java.lang.Character> charSpliterator18 = charList7.spliterator();
        java.util.Locale locale20 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        charSet21.clear();
        java.util.Spliterator<java.lang.Character> charSpliterator23 = charSet21.spliterator();
        int int24 = charSet21.size();
        charSet21.clear();
        java.time.LocalTime localTime27 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology28 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime27);
        java.time.LocalTime localTime30 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology31 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime30);
        java.time.LocalTime localTime33 = localTime30.minusHours(1L);
        boolean boolean34 = localTime27.isBefore(localTime33);
        java.time.LocalTime localTime36 = localTime27.minusMinutes((long) 0);
        java.time.LocalDate localDate38 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int39 = localDate38.getMonthValue();
        int int40 = localDate38.getDayOfYear();
        java.time.LocalDate localDate42 = localDate38.withYear((int) ' ');
        java.time.LocalDateTime localDateTime43 = localTime27.atDate(localDate38);
        boolean boolean44 = charSet21.contains((java.lang.Object) localTime27);
        boolean boolean45 = charList7.addAll((java.util.Collection<java.lang.Character>) charSet21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
        org.junit.Assert.assertNotNull(charSpliterator18);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertNotNull(charSpliterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 11 + "'", int40 == 11);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        java.nio.ShortBuffer shortBuffer9 = byteBuffer8.asShortBuffer();
        java.nio.CharBuffer charBuffer10 = byteBuffer8.asCharBuffer();
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.wrap(byteArray16);
        int int18 = byteBuffer8.compareTo(byteBuffer17);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer8.putShort((int) (short) -156, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        float[] floatArray8 = new float[] { 16L, 0, (-1.0f), (-1000000L), 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "OptionalLong[0]", floatArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[16.0, 0.0, -1.0, -1000000.0, 10.0]");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream1, true);
        printWriter3.write("1970-W02-7");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream5.sequential();
        java.util.stream.DoubleStream doubleStream9 = doubleStream5.skip((long) 4096);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = doubleStream5.distinct();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime7.minusHours(6603384152749567654L);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        intStream16.close();
        java.util.function.IntBinaryOperator intBinaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intStream16.reduce(4096, intBinaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.util.DoubleSummaryStatistics doubleSummaryStatistics0 = new java.util.DoubleSummaryStatistics();
        doubleSummaryStatistics0.accept((double) 10);
        double double3 = doubleSummaryStatistics0.getAverage();
        java.util.stream.DoubleStream.Builder builder4 = java.util.stream.DoubleStream.builder();
        java.util.function.DoubleConsumer doubleConsumer5 = doubleSummaryStatistics0.andThen((java.util.function.DoubleConsumer) builder4);
        java.util.function.DoubleConsumer[] doubleConsumerArray6 = new java.util.function.DoubleConsumer[] { doubleConsumer5 };
        java.util.stream.Stream<java.util.function.DoubleConsumer> doubleConsumerStream7 = java.util.stream.Stream.of(doubleConsumerArray6);
        org.junit.Assert.assertEquals(doubleSummaryStatistics0.toString(), "DoubleSummaryStatistics{count=1, sum=10.000000, min=10.000000, average=10.000000, max=10.000000}");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(doubleConsumer5);
        org.junit.Assert.assertNotNull(doubleConsumerArray6);
        org.junit.Assert.assertNotNull(doubleConsumerStream7);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
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
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.time.Period period3 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period5 = period3.plusYears((long) (short) 0);
        java.time.Period period7 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod8 = period5.plus((java.time.temporal.TemporalAmount) period7);
        java.time.chrono.ChronoPeriod chronoPeriod10 = period7.multipliedBy((int) '#');
        java.lang.String str11 = period7.toString();
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        boolean boolean16 = chronoField14.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset15);
        java.time.format.TextStyle textStyle17 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle18 = textStyle17.asNormal();
        java.util.Locale locale20 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.lang.String str26 = zoneOffset15.getDisplayName(textStyle17, locale20);
        int int27 = zoneOffset15.getTotalSeconds();
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset15);
        java.time.LocalDateTime localDateTime30 = localDateTime28.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime32 = localDateTime30.atZone((java.time.ZoneId) zoneOffset31);
        java.time.temporal.ChronoField chronoField33 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.UTC;
        boolean boolean35 = chronoField33.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset34);
        java.time.ZonedDateTime zonedDateTime36 = java.time.ZonedDateTime.of(localDateTime30, (java.time.ZoneId) zoneOffset34);
        java.time.DayOfWeek dayOfWeek37 = zonedDateTime36.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime39 = zonedDateTime36.withMinute((int) (byte) 10);
        int int40 = zonedDateTime39.getNano();
        java.time.temporal.Temporal temporal41 = period7.addTo((java.time.temporal.Temporal) zonedDateTime39);
        java.time.LocalDate localDate43 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int44 = localDate43.getMonthValue();
        int int45 = localDate43.getDayOfYear();
        java.time.LocalDate localDate47 = localDate43.withYear((int) ' ');
        java.time.chrono.Era era48 = localDate43.getEra();
        java.time.LocalDate localDate50 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate52 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int53 = localDate52.getMonthValue();
        int int54 = localDate52.getDayOfYear();
        boolean boolean55 = localDate50.isAfter((java.time.chrono.ChronoLocalDate) localDate52);
        boolean boolean56 = localDate43.isEqual((java.time.chrono.ChronoLocalDate) localDate52);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime57 = zonedDateTime39.with((java.time.temporal.TemporalAdjuster) localDate43);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime58 = localDateChronoZonedDateTime57.toLocalDateTime();
        java.time.ZoneOffset zoneOffset59 = localDateChronoZonedDateTime57.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer1, (java.lang.Object) zoneOffset59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(chronoPeriod8);
        org.junit.Assert.assertNotNull(chronoPeriod10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P-1M" + "'", str11, "P-1M");
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField14.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + textStyle17 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle17.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle18 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle18.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Z" + "'", str26, "Z");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime32);
        org.junit.Assert.assertTrue("'" + chronoField33 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField33.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertTrue("'" + dayOfWeek37 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek37.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(temporal41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 11 + "'", int45 == 11);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + era48 + "' != '" + java.time.chrono.IsoEra.CE + "'", era48.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 11 + "'", int54 == 11);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime57);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime58);
        org.junit.Assert.assertNotNull(zoneOffset59);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        byte byte7 = byteBuffer6.get();
        float float8 = byteBuffer6.getFloat();
        float float10 = byteBuffer6.getFloat((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.547344E21f + "'", float8 == 9.547344E21f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 9.547344E21f + "'", float10 == 9.547344E21f);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        long long0 = java.security.PublicKey.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 7187392471159151072L + "'", long0 == 7187392471159151072L);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        long long2 = timeUnit0.toMinutes((long) (short) 1);
        long long4 = timeUnit0.toDays((long) 256);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        boolean boolean2 = offsetTime0.isEqual(offsetTime1);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.UTC;
        boolean boolean7 = chronoField5.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset6);
        java.time.format.TextStyle textStyle8 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle9 = textStyle8.asNormal();
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayScript(locale14);
        java.lang.String str17 = zoneOffset6.getDisplayName(textStyle8, locale11);
        int int18 = zoneOffset6.getTotalSeconds();
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset6);
        java.time.LocalDateTime localDateTime21 = localDateTime19.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime23 = localDateTime21.atZone((java.time.ZoneId) zoneOffset22);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        boolean boolean26 = chronoField24.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset25);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.of(localDateTime21, (java.time.ZoneId) zoneOffset25);
        java.time.DayOfWeek dayOfWeek28 = zonedDateTime27.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime27.withMinute((int) (byte) 10);
        java.time.Period period32 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period34 = period32.plusYears((long) (short) 0);
        java.time.Period period36 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod37 = period34.plus((java.time.temporal.TemporalAmount) period36);
        java.time.ZonedDateTime zonedDateTime38 = zonedDateTime27.minus((java.time.temporal.TemporalAmount) chronoPeriod37);
        java.time.OffsetTime offsetTime39 = java.time.OffsetTime.from((java.time.temporal.TemporalAccessor) zonedDateTime27);
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset44 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int45 = zoneOffset40.compareTo(zoneOffset44);
        java.time.OffsetTime offsetTime46 = offsetTime39.withOffsetSameInstant(zoneOffset44);
        int int47 = offsetTime1.compareTo(offsetTime39);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + textStyle8 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle8.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime23);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField24.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertTrue("'" + dayOfWeek28 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek28.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(chronoPeriod37);
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertNotNull(offsetTime39);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertNotNull(zoneOffset44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4210 + "'", int45 == 4210);
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.security.AccessControlException accessControlException1 = new java.security.AccessControlException("hi!");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException2 = new java.util.InvalidPropertiesFormatException((java.lang.Throwable) accessControlException1);
        java.security.KeyException keyException3 = new java.security.KeyException((java.lang.Throwable) accessControlException1);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.unmappableForLength(16384);
        boolean boolean2 = coderResult1.isError();
        boolean boolean3 = coderResult1.isOverflow();
        org.junit.Assert.assertNotNull(coderResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.security.NoSuchProviderException noSuchProviderException2 = new java.security.NoSuchProviderException("");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException3 = new java.security.NoSuchAlgorithmException((java.lang.Throwable) noSuchProviderException2);
        java.io.IOException iOException4 = new java.io.IOException(".", (java.lang.Throwable) noSuchAlgorithmException3);
        java.text.ParseException parseException8 = new java.text.ParseException("Z", 0);
        java.security.SignatureException signatureException9 = new java.security.SignatureException("java.text.AttributedCharacterIterator$Attribute(reading)", (java.lang.Throwable) parseException8);
        noSuchAlgorithmException3.addSuppressed((java.lang.Throwable) parseException8);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet3 = charListMap2.entrySet();
        charListMap2.clear();
        boolean boolean5 = charListMap2.isEmpty();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap8 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean10 = charListMap8.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray12 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList13 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList13, charArray12);
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream22 = java.util.stream.IntStream.of(intArray21);
        java.util.stream.IntStream intStream23 = charListMap8.put(charList13, intStream22);
        java.util.Locale locale25 = new java.util.Locale("");
        java.lang.String str26 = locale25.getDisplayCountry();
        java.io.File file27 = null;
        java.io.File file29 = new java.io.File(file27, "");
        java.io.File file30 = file29.getCanonicalFile();
        boolean boolean31 = charListMap8.remove((java.lang.Object) str26, (java.lang.Object) file29);
        boolean boolean32 = charListMap8.isEmpty();
        java.lang.Character[] charArray34 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList35 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList35, charArray34);
        java.lang.Character[] charArray38 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList39 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList39, charArray38);
        boolean boolean41 = charList35.removeAll((java.util.Collection<java.lang.Character>) charList39);
        int[] intArray48 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream49 = java.util.stream.IntStream.of(intArray48);
        java.util.Spliterator<java.lang.Integer> intSpliterator50 = intStream49.spliterator();
        java.util.stream.IntStream intStream51 = charListMap8.replace(charList39, intStream49);
        int[] intArray58 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream59 = java.util.stream.IntStream.of(intArray58);
        java.util.stream.IntStream intStream60 = intStream59.sequential();
        java.util.stream.IntStream intStream62 = intStream60.limit((long) 97);
        java.util.stream.IntStream intStream63 = charListMap2.getOrDefault((java.lang.Object) intStream49, intStream60);
        org.junit.Assert.assertNotNull(charListEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertNull(intStream23);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull("file29.getParent() == null", file29.getParent());
        org.junit.Assert.assertEquals(file29.toString(), "");
        org.junit.Assert.assertNotNull(file30);
// flaky:         org.junit.Assert.assertEquals(file30.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file30.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream49);
        org.junit.Assert.assertNotNull(intSpliterator50);
        org.junit.Assert.assertNull(intStream51);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream59);
        org.junit.Assert.assertNotNull(intStream60);
        org.junit.Assert.assertNotNull(intStream62);
        org.junit.Assert.assertNotNull(intStream63);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean4 = instant1.isAfter(instant3);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.UTC;
        boolean boolean9 = chronoField7.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset8);
        java.time.format.TextStyle textStyle10 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle11 = textStyle10.asNormal();
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.lang.String str19 = zoneOffset8.getDisplayName(textStyle10, locale13);
        int int20 = zoneOffset8.getTotalSeconds();
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset8);
        java.time.LocalDateTime localDateTime23 = localDateTime21.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime25 = localDateTime23.atZone((java.time.ZoneId) zoneOffset24);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.UTC;
        boolean boolean28 = chronoField26.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.of(localDateTime23, (java.time.ZoneId) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime30 = java.time.ZonedDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset27);
        java.time.Instant instant32 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant34 = instant32.minusMillis((long) 'x');
        int int35 = instant1.compareTo(instant34);
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int41 = zoneOffset36.compareTo(zoneOffset40);
        java.time.LocalDateTime localDateTime42 = java.time.LocalDateTime.ofInstant(instant34, (java.time.ZoneId) zoneOffset36);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset46 = java.time.ZoneOffset.UTC;
        boolean boolean47 = chronoField45.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset46);
        java.time.format.TextStyle textStyle48 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle49 = textStyle48.asNormal();
        java.util.Locale locale51 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet52 = locale51.getExtensionKeys();
        java.util.Locale locale54 = new java.util.Locale("");
        java.lang.String str55 = locale54.getDisplayCountry();
        java.lang.String str56 = locale51.getDisplayScript(locale54);
        java.lang.String str57 = zoneOffset46.getDisplayName(textStyle48, locale51);
        int int58 = zoneOffset46.getTotalSeconds();
        java.time.LocalDateTime localDateTime59 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset46);
        java.time.LocalDateTime localDateTime61 = localDateTime59.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField64 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset65 = java.time.ZoneOffset.UTC;
        boolean boolean66 = chronoField64.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset65);
        java.time.format.TextStyle textStyle67 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle68 = textStyle67.asNormal();
        java.util.Locale locale70 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet71 = locale70.getExtensionKeys();
        java.util.Locale locale73 = new java.util.Locale("");
        java.lang.String str74 = locale73.getDisplayCountry();
        java.lang.String str75 = locale70.getDisplayScript(locale73);
        java.lang.String str76 = zoneOffset65.getDisplayName(textStyle67, locale70);
        int int77 = zoneOffset65.getTotalSeconds();
        java.time.LocalDateTime localDateTime78 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset65);
        java.time.LocalDateTime localDateTime80 = localDateTime78.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset81 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime82 = localDateTime80.atZone((java.time.ZoneId) zoneOffset81);
        java.time.temporal.ChronoField chronoField83 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset84 = java.time.ZoneOffset.UTC;
        boolean boolean85 = chronoField83.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset84);
        java.time.ZonedDateTime zonedDateTime86 = java.time.ZonedDateTime.of(localDateTime80, (java.time.ZoneId) zoneOffset84);
        java.time.DayOfWeek dayOfWeek87 = zonedDateTime86.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime89 = zonedDateTime86.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal90 = localDateTime59.adjustInto((java.time.temporal.Temporal) zonedDateTime89);
        java.time.ZonedDateTime zonedDateTime92 = zonedDateTime89.withSecond((int) (byte) 1);
        java.time.temporal.ChronoField chronoField93 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange94 = chronoField93.range();
        boolean boolean95 = zonedDateTime89.isSupported((java.time.temporal.TemporalField) chronoField93);
        boolean boolean96 = instant34.isSupported((java.time.temporal.TemporalField) chronoField93);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle11 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle11.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField26.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 120000000 + "'", int35 == 120000000);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4210 + "'", int41 == 4210);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField45.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + textStyle48 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle48.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle49 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle49.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNotNull(charSet52);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Z" + "'", str57, "Z");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + chronoField64 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField64.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + textStyle67 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle67.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle68 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle68.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertNotNull(charSet71);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Z" + "'", str76, "Z");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(zoneOffset81);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime82);
        org.junit.Assert.assertTrue("'" + chronoField83 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField83.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(zonedDateTime86);
        org.junit.Assert.assertTrue("'" + dayOfWeek87 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek87.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime89);
        org.junit.Assert.assertNotNull(temporal90);
        org.junit.Assert.assertNotNull(zonedDateTime92);
        org.junit.Assert.assertTrue("'" + chronoField93 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField93.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.format.TextStyle textStyle24 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle25 = textStyle24.asNormal();
        java.util.Locale locale27 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("");
        java.lang.String str31 = locale30.getDisplayCountry();
        java.lang.String str32 = locale27.getDisplayScript(locale30);
        java.lang.String str33 = zoneOffset22.getDisplayName(textStyle24, locale27);
        int int34 = zoneOffset22.getTotalSeconds();
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset22);
        java.time.LocalDateTime localDateTime37 = localDateTime35.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime39 = localDateTime37.atZone((java.time.ZoneId) zoneOffset38);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.ZonedDateTime zonedDateTime43 = java.time.ZonedDateTime.of(localDateTime37, (java.time.ZoneId) zoneOffset41);
        java.time.DayOfWeek dayOfWeek44 = zonedDateTime43.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime46 = zonedDateTime43.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal47 = localDateTime16.adjustInto((java.time.temporal.Temporal) zonedDateTime46);
        java.time.LocalDateTime localDateTime49 = localDateTime16.minusWeeks(0L);
        java.time.LocalDateTime localDateTime51 = localDateTime16.plusNanos(0L);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + textStyle24 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle24.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle25 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle25.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime39);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + dayOfWeek44 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek44.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertNotNull(temporal47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.time.Duration duration1 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration3 = duration1.withSeconds(6603384152749567654L);
        java.time.temporal.Temporal temporal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal5 = duration3.addTo(temporal4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.io.IOException iOException1 = new java.io.IOException("java.time");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        char char0 = org.apache.commons.lang3.ClassUtils.PACKAGE_SEPARATOR_CHAR;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '.' + "'", char0 == '.');
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("");
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        long long2 = chronoField0.checkValidValue((long) 16);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.UTC;
        boolean boolean7 = chronoField5.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset6);
        java.time.format.TextStyle textStyle8 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle9 = textStyle8.asNormal();
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayScript(locale14);
        java.lang.String str17 = zoneOffset6.getDisplayName(textStyle8, locale11);
        int int18 = zoneOffset6.getTotalSeconds();
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset6);
        java.time.LocalDateTime localDateTime21 = localDateTime19.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime23 = localDateTime21.atZone((java.time.ZoneId) zoneOffset22);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        boolean boolean26 = chronoField24.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset25);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.of(localDateTime21, (java.time.ZoneId) zoneOffset25);
        java.time.DayOfWeek dayOfWeek28 = zonedDateTime27.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime27.withMinute((int) (byte) 10);
        long long31 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) zonedDateTime30);
        java.time.temporal.ValueRange valueRange32 = chronoField0.range();
        java.lang.String str33 = chronoField0.toString();
        java.time.Instant instant35 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant37 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean38 = instant35.isAfter(instant37);
        java.time.temporal.ChronoField chronoField41 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.UTC;
        boolean boolean43 = chronoField41.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset42);
        java.time.format.TextStyle textStyle44 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle45 = textStyle44.asNormal();
        java.util.Locale locale47 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet48 = locale47.getExtensionKeys();
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getDisplayCountry();
        java.lang.String str52 = locale47.getDisplayScript(locale50);
        java.lang.String str53 = zoneOffset42.getDisplayName(textStyle44, locale47);
        int int54 = zoneOffset42.getTotalSeconds();
        java.time.LocalDateTime localDateTime55 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset42);
        java.time.LocalDateTime localDateTime57 = localDateTime55.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset58 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime59 = localDateTime57.atZone((java.time.ZoneId) zoneOffset58);
        java.time.temporal.ChronoField chronoField60 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset61 = java.time.ZoneOffset.UTC;
        boolean boolean62 = chronoField60.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset61);
        java.time.ZonedDateTime zonedDateTime63 = java.time.ZonedDateTime.of(localDateTime57, (java.time.ZoneId) zoneOffset61);
        java.time.ZonedDateTime zonedDateTime64 = java.time.ZonedDateTime.ofInstant(instant35, (java.time.ZoneId) zoneOffset61);
        java.time.Instant instant66 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant68 = instant66.minusMillis((long) 'x');
        int int69 = instant35.compareTo(instant68);
        java.time.ZoneOffset zoneOffset70 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset74 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int75 = zoneOffset70.compareTo(zoneOffset74);
        java.time.LocalDateTime localDateTime76 = java.time.LocalDateTime.ofInstant(instant68, (java.time.ZoneId) zoneOffset70);
        boolean boolean77 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) instant68);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16L + "'", long2 == 16L);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + textStyle8 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle8.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime23);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField24.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertTrue("'" + dayOfWeek28 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek28.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 72616000L + "'", long31 == 72616000L);
        org.junit.Assert.assertNotNull(valueRange32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MilliOfDay" + "'", str33, "MilliOfDay");
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + chronoField41 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField41.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + textStyle44 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle44.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle45 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle45.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertNotNull(charSet48);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Z" + "'", str53, "Z");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(zoneOffset58);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime59);
        org.junit.Assert.assertTrue("'" + chronoField60 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField60.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zonedDateTime63);
        org.junit.Assert.assertNotNull(zonedDateTime64);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertNotNull(instant68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 120000000 + "'", int69 == 120000000);
        org.junit.Assert.assertNotNull(zoneOffset70);
        org.junit.Assert.assertNotNull(zoneOffset74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 4210 + "'", int75 == 4210);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        java.nio.ShortBuffer shortBuffer9 = byteBuffer8.asShortBuffer();
        java.nio.CharBuffer charBuffer10 = byteBuffer8.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = byteBuffer8.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.util.Locale locale0 = java.util.Locale.US;
        java.nio.charset.CoderResult coderResult2 = java.nio.charset.CoderResult.unmappableForLength(16384);
        boolean boolean3 = coderResult2.isError();
        boolean boolean4 = coderResult2.isUnderflow();
        boolean boolean5 = coderResult2.isMalformed();
        boolean boolean6 = coderResult2.isUnderflow();
        boolean boolean7 = locale0.equals((java.lang.Object) boolean6);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(coderResult2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.format.TextStyle textStyle24 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle25 = textStyle24.asNormal();
        java.util.Locale locale27 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("");
        java.lang.String str31 = locale30.getDisplayCountry();
        java.lang.String str32 = locale27.getDisplayScript(locale30);
        java.lang.String str33 = zoneOffset22.getDisplayName(textStyle24, locale27);
        int int34 = zoneOffset22.getTotalSeconds();
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset22);
        java.time.LocalDateTime localDateTime37 = localDateTime35.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime39 = localDateTime37.atZone((java.time.ZoneId) zoneOffset38);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.ZonedDateTime zonedDateTime43 = java.time.ZonedDateTime.of(localDateTime37, (java.time.ZoneId) zoneOffset41);
        java.time.DayOfWeek dayOfWeek44 = zonedDateTime43.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime46 = zonedDateTime43.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal47 = localDateTime16.adjustInto((java.time.temporal.Temporal) zonedDateTime46);
        java.time.LocalDateTime localDateTime48 = zonedDateTime46.toLocalDateTime();
        java.lang.String str49 = zonedDateTime46.toString();
        java.time.ZonedDateTime zonedDateTime51 = zonedDateTime46.minusMonths((long) 4210);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + textStyle24 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle24.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle25 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle25.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime39);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + dayOfWeek44 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek44.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertNotNull(temporal47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1969-12-27T20:10:16.000000097Z" + "'", str49, "1969-12-27T20:10:16.000000097Z");
        org.junit.Assert.assertNotNull(zonedDateTime51);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("/");
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream5.parallel();
        java.util.stream.Stream<java.lang.Double> doubleStream8 = doubleStream7.boxed();
        java.util.stream.Stream<java.lang.Double> doubleStream9 = doubleStream8.sorted();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.Double> doubleStream10 = doubleStream8.distinct();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.minusHours((long) (short) 0);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime28 = zonedDateTime24.withLaterOffsetAtOverlap();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime24.withNano(64);
        java.time.temporal.ChronoField chronoField33 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.UTC;
        boolean boolean35 = chronoField33.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset34);
        java.time.format.TextStyle textStyle36 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle37 = textStyle36.asNormal();
        java.util.Locale locale39 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet40 = locale39.getExtensionKeys();
        java.util.Locale locale42 = new java.util.Locale("");
        java.lang.String str43 = locale42.getDisplayCountry();
        java.lang.String str44 = locale39.getDisplayScript(locale42);
        java.lang.String str45 = zoneOffset34.getDisplayName(textStyle36, locale39);
        int int46 = zoneOffset34.getTotalSeconds();
        java.time.LocalDateTime localDateTime47 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset34);
        java.time.LocalDateTime localDateTime49 = localDateTime47.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField52 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset53 = java.time.ZoneOffset.UTC;
        boolean boolean54 = chronoField52.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset53);
        java.time.format.TextStyle textStyle55 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle56 = textStyle55.asNormal();
        java.util.Locale locale58 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet59 = locale58.getExtensionKeys();
        java.util.Locale locale61 = new java.util.Locale("");
        java.lang.String str62 = locale61.getDisplayCountry();
        java.lang.String str63 = locale58.getDisplayScript(locale61);
        java.lang.String str64 = zoneOffset53.getDisplayName(textStyle55, locale58);
        int int65 = zoneOffset53.getTotalSeconds();
        java.time.LocalDateTime localDateTime66 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset53);
        java.time.LocalDateTime localDateTime68 = localDateTime66.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset69 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime70 = localDateTime68.atZone((java.time.ZoneId) zoneOffset69);
        java.time.temporal.ChronoField chronoField71 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset72 = java.time.ZoneOffset.UTC;
        boolean boolean73 = chronoField71.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset72);
        java.time.ZonedDateTime zonedDateTime74 = java.time.ZonedDateTime.of(localDateTime68, (java.time.ZoneId) zoneOffset72);
        java.time.DayOfWeek dayOfWeek75 = zonedDateTime74.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime77 = zonedDateTime74.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal78 = localDateTime47.adjustInto((java.time.temporal.Temporal) zonedDateTime77);
        java.time.ZonedDateTime zonedDateTime80 = zonedDateTime77.withSecond((int) (byte) 1);
        java.time.temporal.ChronoField chronoField81 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange82 = chronoField81.range();
        boolean boolean83 = zonedDateTime77.isSupported((java.time.temporal.TemporalField) chronoField81);
        java.time.temporal.TemporalUnit temporalUnit84 = chronoField81.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime85 = zonedDateTime24.truncatedTo(temporalUnit84);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit is too large to be used for truncation");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime28);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField33 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField33.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + textStyle36 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle36.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle37 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle37.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(charSet40);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Z" + "'", str45, "Z");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + chronoField52 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField52.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + textStyle55 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle55.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle56 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle56.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(charSet59);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Z" + "'", str64, "Z");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(zoneOffset69);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime70);
        org.junit.Assert.assertTrue("'" + chronoField71 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField71.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(zonedDateTime74);
        org.junit.Assert.assertTrue("'" + dayOfWeek75 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek75.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime77);
        org.junit.Assert.assertNotNull(temporal78);
        org.junit.Assert.assertNotNull(zonedDateTime80);
        org.junit.Assert.assertTrue("'" + chronoField81 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField81.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + temporalUnit84 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit84.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.nio.DoubleBuffer doubleBuffer6 = java.nio.DoubleBuffer.wrap(doubleArray4);
        double[] doubleArray7 = doubleBuffer6.array();
        java.util.stream.DoubleStream doubleStream8 = java.util.stream.DoubleStream.of(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleBuffer6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.io.File file1 = new java.io.File("java.time");
        java.io.File file2 = file1.getAbsoluteFile();
        long long3 = file1.getTotalSpace();
        long long4 = file1.length();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.time");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment/java.time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 364740218880L + "'", long3 == 364740218880L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.FRIDAY;
        java.time.Month month1 = java.time.Month.JULY;
        java.time.format.TextStyle textStyle2 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle3 = textStyle2.asNormal();
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray6 = new java.time.temporal.TemporalField[] { chronoField5 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet7 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet7, temporalFieldArray6);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet7);
        java.util.Locale locale10 = dateTimeFormatter4.getLocale();
        java.lang.String str11 = month1.getDisplayName(textStyle2, locale10);
        java.time.format.TextStyle textStyle12 = textStyle2.asStandalone();
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale15 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet16 = locale15.getExtensionKeys();
        java.lang.String str17 = locale15.getDisplayCountry();
        java.lang.String str18 = locale15.getDisplayCountry();
        java.lang.String str19 = locale13.getDisplayVariant(locale15);
        java.lang.String str20 = dayOfWeek0.getDisplayName(textStyle2, locale15);
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.FRIDAY));
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.JULY + "'", month1.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + textStyle2 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle2.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle3 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle3.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "J" + "'", str11, "J");
        org.junit.Assert.assertTrue("'" + textStyle12 + "' != '" + java.time.format.TextStyle.NARROW_STANDALONE + "'", textStyle12.equals(java.time.format.TextStyle.NARROW_STANDALONE));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "F" + "'", str20, "F");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.io.File file1 = new java.io.File("java.time");
        java.io.File file2 = file1.getAbsoluteFile();
        long long3 = file2.length();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.time");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment/java.time");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.time.format.DecimalStyle decimalStyle15 = dateTimeFormatter14.getDecimalStyle();
        java.lang.String str16 = localDate2.format(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(decimalStyle15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-W02-7" + "'", str16, "1970-W02-7");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream1, true);
        printWriter3.print((int) (byte) -1);
        java.time.format.DateTimeFormatter dateTimeFormatter6 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray8 = new java.time.temporal.TemporalField[] { chronoField7 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet9 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet9, temporalFieldArray8);
        java.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet9);
        java.util.Locale locale12 = dateTimeFormatter6.getLocale();
        java.lang.String[] strArray14 = java.util.Locale.getISOCountries();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter15 = printWriter3.printf(locale12, "1970-01-11T00:00", (java.lang.Object[]) strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.time.format.TextStyle textStyle3 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle4 = textStyle3.asNormal();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale6.getDisplayScript(locale9);
        java.lang.String str12 = zoneOffset1.getDisplayName(textStyle3, locale6);
        int int13 = zoneOffset1.getTotalSeconds();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset1);
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.AMPM_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange16 = zoneOffset1.range((java.time.temporal.TemporalField) chronoField15);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: AmPmOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + textStyle3 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle3.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.AMPM_OF_DAY + "'", chronoField15.equals(java.time.temporal.ChronoField.AMPM_OF_DAY));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.withNano((int) 'x');
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        java.time.LocalTime localTime2 = localTime0.minusNanos(280504143872L);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.nio.charset.CodingErrorAction codingErrorAction0 = java.nio.charset.CodingErrorAction.REPLACE;
        org.junit.Assert.assertNotNull(codingErrorAction0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.security.cert.CertificateException certificateException1 = new java.security.cert.CertificateException("P-1M");
        java.security.InvalidKeyException invalidKeyException2 = new java.security.InvalidKeyException((java.lang.Throwable) certificateException1);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream1, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = printWriter3.checkError();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.stream.IntStream intStream8 = intStream7.sequential();
        java.util.stream.DoubleStream doubleStream9 = intStream7.asDoubleStream();
        java.util.function.IntToDoubleFunction intToDoubleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = intStream7.mapToDouble(intToDoubleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("1 Jan 1970 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 1 Jan 1970 00:00:00 GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        charListMap2.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        boolean boolean3 = file2.exists();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        int int3 = localDate1.getDayOfYear();
        java.time.LocalDate localDate5 = localDate1.withYear((int) ' ');
        java.time.chrono.Era era6 = localDate1.getEra();
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        int int12 = localDate10.getDayOfYear();
        boolean boolean13 = localDate8.isAfter((java.time.chrono.ChronoLocalDate) localDate10);
        boolean boolean14 = localDate1.isEqual((java.time.chrono.ChronoLocalDate) localDate10);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        boolean boolean20 = chronoField18.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset19);
        java.time.format.TextStyle textStyle21 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle22 = textStyle21.asNormal();
        java.util.Locale locale24 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet25 = locale24.getExtensionKeys();
        java.util.Locale locale27 = new java.util.Locale("");
        java.lang.String str28 = locale27.getDisplayCountry();
        java.lang.String str29 = locale24.getDisplayScript(locale27);
        java.lang.String str30 = zoneOffset19.getDisplayName(textStyle21, locale24);
        int int31 = zoneOffset19.getTotalSeconds();
        java.time.LocalDateTime localDateTime32 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset19);
        java.time.LocalDateTime localDateTime34 = localDateTime32.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        boolean boolean39 = chronoField37.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset38);
        java.time.format.TextStyle textStyle40 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle41 = textStyle40.asNormal();
        java.util.Locale locale43 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet44 = locale43.getExtensionKeys();
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayCountry();
        java.lang.String str48 = locale43.getDisplayScript(locale46);
        java.lang.String str49 = zoneOffset38.getDisplayName(textStyle40, locale43);
        int int50 = zoneOffset38.getTotalSeconds();
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset38);
        java.time.LocalDateTime localDateTime53 = localDateTime51.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset54 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime55 = localDateTime53.atZone((java.time.ZoneId) zoneOffset54);
        java.time.temporal.ChronoField chronoField56 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.UTC;
        boolean boolean58 = chronoField56.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset57);
        java.time.ZonedDateTime zonedDateTime59 = java.time.ZonedDateTime.of(localDateTime53, (java.time.ZoneId) zoneOffset57);
        java.time.DayOfWeek dayOfWeek60 = zonedDateTime59.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime62 = zonedDateTime59.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal63 = localDateTime32.adjustInto((java.time.temporal.Temporal) zonedDateTime62);
        java.time.ZonedDateTime zonedDateTime65 = zonedDateTime62.withSecond((int) (byte) 1);
        java.time.temporal.ChronoField chronoField66 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange67 = chronoField66.range();
        boolean boolean68 = zonedDateTime62.isSupported((java.time.temporal.TemporalField) chronoField66);
        java.time.temporal.TemporalUnit temporalUnit69 = chronoField66.getRangeUnit();
        java.time.chrono.ChronoLocalDate chronoLocalDate70 = localDate10.plus((-359384L), temporalUnit69);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + era6 + "' != '" + java.time.chrono.IsoEra.CE + "'", era6.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField18.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + textStyle21 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle21.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle22 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle22.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Z" + "'", str30, "Z");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField37.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + textStyle40 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle40.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle41 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle41.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(charSet44);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Z" + "'", str49, "Z");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(zoneOffset54);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime55);
        org.junit.Assert.assertTrue("'" + chronoField56 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField56.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(zonedDateTime59);
        org.junit.Assert.assertTrue("'" + dayOfWeek60 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek60.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime62);
        org.junit.Assert.assertNotNull(temporal63);
        org.junit.Assert.assertNotNull(zonedDateTime65);
        org.junit.Assert.assertTrue("'" + chronoField66 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField66.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + temporalUnit69 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit69.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(chronoLocalDate70);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.io.UnsupportedEncodingException unsupportedEncodingException0 = new java.io.UnsupportedEncodingException();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.OVERFLOW;
        boolean boolean1 = coderResult0.isMalformed();
        org.junit.Assert.assertNotNull(coderResult0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Month month1 = java.time.Month.of(466000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear: 466000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream7 = doubleStream5.limit(10L);
        java.util.function.DoublePredicate doublePredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = doubleStream7.filter(doublePredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.time.Clock clock0 = java.time.Clock.systemDefaultZone();
        org.junit.Assert.assertNotNull(clock0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        charSet2.clear();
        java.util.Spliterator<java.lang.Character> charSpliterator4 = charSet2.spliterator();
        int int5 = charSet2.size();
        java.util.function.Predicate<java.util.AbstractCollection<java.lang.Character>> charCollectionPredicate7 = java.util.function.Predicate.isEqual((java.lang.Object) (short) 0);
        java.util.function.Predicate<java.util.AbstractCollection<java.lang.Character>> charCollectionPredicate9 = java.util.function.Predicate.isEqual((java.lang.Object) (short) 0);
        java.util.function.Predicate<java.util.AbstractCollection<java.lang.Character>> charCollectionPredicate10 = charCollectionPredicate7.and(charCollectionPredicate9);
        java.util.function.Predicate<java.util.AbstractCollection<java.lang.Character>> charCollectionPredicate12 = java.util.function.Predicate.isEqual((java.lang.Object) (short) 0);
        java.util.function.Predicate<java.util.AbstractCollection<java.lang.Character>> charCollectionPredicate13 = charCollectionPredicate10.or(charCollectionPredicate12);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap16 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean18 = charListMap16.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray20 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList21 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList21, charArray20);
        int[] intArray29 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream30 = java.util.stream.IntStream.of(intArray29);
        java.util.stream.IntStream intStream31 = charListMap16.put(charList21, intStream30);
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getDisplayCountry();
        java.io.File file35 = null;
        java.io.File file37 = new java.io.File(file35, "");
        java.io.File file38 = file37.getCanonicalFile();
        boolean boolean39 = charListMap16.remove((java.lang.Object) str34, (java.lang.Object) file37);
        boolean boolean40 = charListMap16.isEmpty();
        java.lang.Character[] charArray42 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList43 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList43, charArray42);
        java.lang.Character[] charArray46 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList47 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList47, charArray46);
        boolean boolean49 = charList43.removeAll((java.util.Collection<java.lang.Character>) charList47);
        int[] intArray56 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream57 = java.util.stream.IntStream.of(intArray56);
        java.util.Spliterator<java.lang.Integer> intSpliterator58 = intStream57.spliterator();
        java.util.stream.IntStream intStream59 = charListMap16.replace(charList47, intStream57);
        boolean boolean60 = charCollectionPredicate10.test((java.util.AbstractCollection<java.lang.Character>) charList47);
        boolean boolean61 = charSet2.containsAll((java.util.Collection<java.lang.Character>) charList47);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(charSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charCollectionPredicate7);
        org.junit.Assert.assertNotNull(charCollectionPredicate9);
        org.junit.Assert.assertNotNull(charCollectionPredicate10);
        org.junit.Assert.assertNotNull(charCollectionPredicate12);
        org.junit.Assert.assertNotNull(charCollectionPredicate13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertNull(intStream31);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull("file37.getParent() == null", file37.getParent());
        org.junit.Assert.assertEquals(file37.toString(), "");
        org.junit.Assert.assertNotNull(file38);
// flaky:         org.junit.Assert.assertEquals(file38.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file38.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream57);
        org.junit.Assert.assertNotNull(intSpliterator58);
        org.junit.Assert.assertNull(intStream59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putFloat((float) 280504152064L);
        java.nio.FloatBuffer floatBuffer10 = java.nio.FloatBuffer.allocate((int) (short) 1);
        int int11 = floatBuffer10.arrayOffset();
        java.nio.ByteOrder byteOrder12 = floatBuffer10.order();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer8.order(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[82, -126, -98, -77, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray2 = new java.time.temporal.TemporalField[] { chronoField1 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet3 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet3, temporalFieldArray2);
        java.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet3);
        java.time.format.DecimalStyle decimalStyle6 = dateTimeFormatter5.getDecimalStyle();
        java.util.Optional<java.time.format.DecimalStyle> decimalStyleOptional7 = java.util.Optional.of(decimalStyle6);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(decimalStyle6);
        org.junit.Assert.assertNotNull(decimalStyleOptional7);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet3 = charListMap2.entrySet();
        boolean boolean5 = charListMap2.contains((java.lang.Object) 1.0f);
        java.util.ArrayList<java.lang.Character> charList6 = null;
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream14 = java.util.stream.IntStream.of(intArray13);
        java.util.stream.IntStream intStream15 = intStream14.sequential();
        java.util.stream.IntStream intStream17 = intStream15.limit((long) 97);
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream25 = java.util.stream.IntStream.of(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = charListMap2.replace(charList6, intStream15, intStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charListEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream25);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.time.Duration duration1 = java.time.Duration.ofHours(10000000000L);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        java.time.LocalDate localDate7 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField8.getRangeUnit();
        boolean boolean10 = localDate7.isSupported(temporalUnit9);
        boolean boolean11 = localDate4.isBefore((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.format.DateTimeFormatter dateTimeFormatter12 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray14 = new java.time.temporal.TemporalField[] { chronoField13 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet15 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet15, temporalFieldArray14);
        java.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet15);
        java.lang.String str18 = localDate7.format(dateTimeFormatter12);
        java.time.LocalDateTime localDateTime19 = localDate7.atStartOfDay();
        java.time.LocalDate localDate21 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int22 = localDate21.getMonthValue();
        int int23 = localDate21.getDayOfYear();
        java.time.LocalDate localDate25 = localDate21.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit27 = chronoField26.getRangeUnit();
        long long28 = localDate7.until((java.time.temporal.Temporal) localDate21, temporalUnit27);
        java.time.Duration duration29 = duration1.plus(0L, temporalUnit27);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField8.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField13.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-W02-7" + "'", str18, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField26.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit27 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit27.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(duration29);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.stream.IntStream intStream8 = intStream7.sequential();
        java.util.function.IntUnaryOperator intUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = intStream7.map(intUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        java.time.LocalTime localTime12 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology13 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime15 = localTime12.minusHours(1L);
        boolean boolean16 = localTime10.isAfter(localTime12);
        java.time.LocalTime localTime18 = localTime10.plusSeconds((long) 120000000);
        java.time.LocalTime localTime20 = localTime18.minusSeconds((long) 7);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.now();
        java.time.LocalDate localDate23 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate25 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int26 = localDate25.getMonthValue();
        int int27 = localDate25.getDayOfYear();
        boolean boolean28 = localDate23.isAfter((java.time.chrono.ChronoLocalDate) localDate25);
        java.time.OffsetDateTime offsetDateTime29 = offsetTime21.atDate(localDate23);
        java.time.LocalDate localDate31 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int32 = localDate31.getMonthValue();
        java.time.LocalDate localDate34 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit36 = chronoField35.getRangeUnit();
        boolean boolean37 = localDate34.isSupported(temporalUnit36);
        boolean boolean38 = localDate31.isBefore((java.time.chrono.ChronoLocalDate) localDate34);
        java.time.format.DateTimeFormatter dateTimeFormatter39 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray41 = new java.time.temporal.TemporalField[] { chronoField40 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet42 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet42, temporalFieldArray41);
        java.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter39.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet42);
        java.lang.String str45 = localDate34.format(dateTimeFormatter39);
        java.time.LocalDateTime localDateTime46 = localDate34.atStartOfDay();
        java.time.LocalDate localDate48 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int49 = localDate48.getMonthValue();
        int int50 = localDate48.getDayOfYear();
        java.time.LocalDate localDate52 = localDate48.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField53 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit54 = chronoField53.getRangeUnit();
        long long55 = localDate34.until((java.time.temporal.Temporal) localDate48, temporalUnit54);
        java.time.OffsetDateTime offsetDateTime56 = offsetTime21.atDate(localDate48);
        java.time.temporal.ChronoField chronoField57 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean58 = offsetDateTime56.isSupported((java.time.temporal.TemporalField) chronoField57);
        java.time.OffsetDateTime offsetDateTime60 = offsetDateTime56.plusWeeks((long) 31);
        java.time.LocalDate localDate63 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int64 = localDate63.getMonthValue();
        java.time.LocalDate localDate66 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField67 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit68 = chronoField67.getRangeUnit();
        boolean boolean69 = localDate66.isSupported(temporalUnit68);
        boolean boolean70 = localDate63.isBefore((java.time.chrono.ChronoLocalDate) localDate66);
        java.time.format.DateTimeFormatter dateTimeFormatter71 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField72 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray73 = new java.time.temporal.TemporalField[] { chronoField72 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet74 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet74, temporalFieldArray73);
        java.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter71.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet74);
        java.lang.String str77 = localDate66.format(dateTimeFormatter71);
        java.time.LocalDateTime localDateTime78 = localDate66.atStartOfDay();
        java.time.LocalDate localDate80 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int81 = localDate80.getMonthValue();
        int int82 = localDate80.getDayOfYear();
        java.time.LocalDate localDate84 = localDate80.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField85 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit86 = chronoField85.getRangeUnit();
        long long87 = localDate66.until((java.time.temporal.Temporal) localDate80, temporalUnit86);
        java.time.OffsetDateTime offsetDateTime88 = offsetDateTime60.plus((long) 1, temporalUnit86);
        boolean boolean89 = localTime18.isSupported(temporalUnit86);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(offsetDateTime29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField35.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit36 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit36.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-W02-7" + "'", str45, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 11 + "'", int50 == 11);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + chronoField53 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField53.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit54 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit54.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime56);
        org.junit.Assert.assertTrue("'" + chronoField57 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField57.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(offsetDateTime60);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertTrue("'" + chronoField67 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField67.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit68 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit68.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertTrue("'" + chronoField72 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField72.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "1970-W02-7" + "'", str77, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 11 + "'", int82 == 11);
        org.junit.Assert.assertNotNull(localDate84);
        org.junit.Assert.assertTrue("'" + chronoField85 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField85.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit86 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit86.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor2 = dateTimeFormatter0.parse((java.lang.CharSequence) "Z");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Z' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.util.DoubleSummaryStatistics doubleSummaryStatistics0 = new java.util.DoubleSummaryStatistics();
        doubleSummaryStatistics0.accept((double) 6603384152749567654L);
        long long3 = doubleSummaryStatistics0.getCount();
        org.junit.Assert.assertEquals(doubleSummaryStatistics0.toString(), "DoubleSummaryStatistics{count=1, sum=6603384152749568000.000000, min=6603384152749568000.000000, average=6603384152749568000.000000, max=6603384152749568000.000000}");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.withMinute((int) (byte) 10);
        java.time.format.DateTimeFormatter dateTimeFormatter28 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray30 = new java.time.temporal.TemporalField[] { chronoField29 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet31 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet31, temporalFieldArray30);
        java.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter28.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet31);
        java.util.Locale locale34 = dateTimeFormatter28.getLocale();
        java.lang.String str35 = zonedDateTime27.format(dateTimeFormatter28);
        long long36 = zonedDateTime27.toEpochSecond();
        java.time.Month month37 = zonedDateTime27.getMonth();
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int43 = zoneOffset38.compareTo(zoneOffset42);
        java.time.ZonedDateTime zonedDateTime44 = zonedDateTime27.withZoneSameInstant((java.time.ZoneId) zoneOffset42);
        java.time.ZonedDateTime zonedDateTime46 = zonedDateTime44.withDayOfMonth((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField29.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-W52-6Z" + "'", str35, "1969-W52-6Z");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-359384L) + "'", long36 == (-359384L));
        org.junit.Assert.assertTrue("'" + month37 + "' != '" + java.time.Month.DECEMBER + "'", month37.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4210 + "'", int43 == 4210);
        org.junit.Assert.assertNotNull(zonedDateTime44);
        org.junit.Assert.assertNotNull(zonedDateTime46);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.chrono.IsoChronology isoChronology4 = period3.getChronology();
        java.time.Instant instant6 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant8 = instant6.minusMillis((long) 'x');
        int int9 = instant8.getNano();
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition10 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        boolean boolean15 = chronoField13.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset14);
        java.time.format.TextStyle textStyle16 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle17 = textStyle16.asNormal();
        java.util.Locale locale19 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale19.getDisplayScript(locale22);
        java.lang.String str25 = zoneOffset14.getDisplayName(textStyle16, locale19);
        int int26 = zoneOffset14.getTotalSeconds();
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset14);
        java.time.LocalDateTime localDateTime29 = localDateTime27.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime31 = localDateTime27.plusMonths((long) (short) 0);
        java.time.LocalTime localTime32 = localDateTime31.toLocalTime();
        java.time.Instant instant34 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant36 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean37 = instant34.isAfter(instant36);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.format.TextStyle textStyle43 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle44 = textStyle43.asNormal();
        java.util.Locale locale46 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet47 = locale46.getExtensionKeys();
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getDisplayCountry();
        java.lang.String str51 = locale46.getDisplayScript(locale49);
        java.lang.String str52 = zoneOffset41.getDisplayName(textStyle43, locale46);
        int int53 = zoneOffset41.getTotalSeconds();
        java.time.LocalDateTime localDateTime54 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset41);
        java.time.LocalDateTime localDateTime56 = localDateTime54.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime58 = localDateTime56.atZone((java.time.ZoneId) zoneOffset57);
        java.time.temporal.ChronoField chronoField59 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset60 = java.time.ZoneOffset.UTC;
        boolean boolean61 = chronoField59.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset60);
        java.time.ZonedDateTime zonedDateTime62 = java.time.ZonedDateTime.of(localDateTime56, (java.time.ZoneId) zoneOffset60);
        java.time.ZonedDateTime zonedDateTime63 = java.time.ZonedDateTime.ofInstant(instant34, (java.time.ZoneId) zoneOffset60);
        java.time.temporal.ChronoField chronoField66 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset67 = java.time.ZoneOffset.UTC;
        boolean boolean68 = chronoField66.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset67);
        java.time.format.TextStyle textStyle69 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle70 = textStyle69.asNormal();
        java.util.Locale locale72 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet73 = locale72.getExtensionKeys();
        java.util.Locale locale75 = new java.util.Locale("");
        java.lang.String str76 = locale75.getDisplayCountry();
        java.lang.String str77 = locale72.getDisplayScript(locale75);
        java.lang.String str78 = zoneOffset67.getDisplayName(textStyle69, locale72);
        int int79 = zoneOffset67.getTotalSeconds();
        java.time.LocalDateTime localDateTime80 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset67);
        java.time.LocalDateTime localDateTime81 = timeDefinition10.createDateTime(localDateTime31, zoneOffset60, zoneOffset67);
        java.time.Clock clock82 = java.time.Clock.fixed(instant8, (java.time.ZoneId) zoneOffset60);
        java.time.Duration duration84 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration86 = duration84.plusMillis((long) (byte) 100);
        java.time.Duration duration88 = duration86.minusMillis((long) (byte) 100);
        java.time.Clock clock89 = java.time.Clock.offset(clock82, duration88);
        java.time.LocalTime localTime90 = java.time.LocalTime.now(clock89);
        java.time.LocalDate localDate91 = isoChronology4.dateNow(clock89);
        java.util.List<java.time.chrono.Era> eraList92 = isoChronology4.eras();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(isoChronology4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + timeDefinition10 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition10.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField13.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + textStyle16 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle16.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle17 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle17.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + textStyle43 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle43.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle44 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle44.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Z" + "'", str52, "Z");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime58);
        org.junit.Assert.assertTrue("'" + chronoField59 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField59.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(zonedDateTime62);
        org.junit.Assert.assertNotNull(zonedDateTime63);
        org.junit.Assert.assertTrue("'" + chronoField66 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField66.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + textStyle69 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle69.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle70 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle70.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(charSet73);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Z" + "'", str78, "Z");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(clock82);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertNotNull(clock89);
        org.junit.Assert.assertNotNull(localTime90);
        org.junit.Assert.assertNotNull(localDate91);
        org.junit.Assert.assertNotNull(eraList92);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        java.io.File file3 = file2.getCanonicalFile();
        long long4 = file3.getUsableSpace();
        java.io.File file5 = null;
        java.io.File file7 = new java.io.File(file5, "");
        long long8 = file7.getTotalSpace();
        int int9 = file3.compareTo(file7);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertNotNull(file3);
// flaky:         org.junit.Assert.assertEquals(file3.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/experiment");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280504111104L + "'", long4 == 280504111104L);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.chrono.Chronology chronology25 = localDateTime18.getChronology();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet3 = charListMap2.entrySet();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap6 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean8 = charListMap6.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray10 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList11 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList11, charArray10);
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream20 = java.util.stream.IntStream.of(intArray19);
        java.util.stream.IntStream intStream21 = charListMap6.put(charList11, intStream20);
        boolean boolean22 = charListMap2.containsKey((java.lang.Object) charListMap6);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap25 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean27 = charListMap25.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray29 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList30 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList30, charArray29);
        int[] intArray38 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream39 = java.util.stream.IntStream.of(intArray38);
        java.util.stream.IntStream intStream40 = charListMap25.put(charList30, intStream39);
        java.util.Spliterator<java.lang.Character> charSpliterator41 = charList30.spliterator();
        int[] intArray48 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream49 = java.util.stream.IntStream.of(intArray48);
        java.util.stream.IntStream intStream50 = intStream49.sequential();
        java.util.stream.IntStream intStream52 = intStream50.limit((long) 97);
        java.util.stream.IntStream intStream53 = charListMap6.put(charList30, intStream52);
        java.util.Iterator<java.lang.Integer> intItor54 = intStream52.iterator();
        org.junit.Assert.assertNotNull(charListEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNull(intStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream39);
        org.junit.Assert.assertNull(intStream40);
        org.junit.Assert.assertNotNull(charSpliterator41);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream49);
        org.junit.Assert.assertNotNull(intStream50);
        org.junit.Assert.assertNotNull(intStream52);
        org.junit.Assert.assertNotNull(intStream53);
        org.junit.Assert.assertNotNull(intItor54);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.time.chrono.Chronology chronology7 = java.time.chrono.Chronology.ofLocale(locale4);
        java.time.LocalDate localDate9 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int10 = localDate9.getMonthValue();
        java.time.LocalDate localDate12 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getRangeUnit();
        boolean boolean15 = localDate12.isSupported(temporalUnit14);
        boolean boolean16 = localDate9.isBefore((java.time.chrono.ChronoLocalDate) localDate12);
        java.time.chrono.ChronoLocalDate chronoLocalDate17 = chronology7.date((java.time.temporal.TemporalAccessor) localDate12);
        java.time.Period period19 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period21 = period19.plusYears((long) (short) 0);
        java.time.Period period23 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod24 = period21.plus((java.time.temporal.TemporalAmount) period23);
        java.time.chrono.ChronoPeriod chronoPeriod26 = period23.multipliedBy((int) '#');
        java.lang.String str27 = period23.toString();
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.UTC;
        boolean boolean32 = chronoField30.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset31);
        java.time.format.TextStyle textStyle33 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle34 = textStyle33.asNormal();
        java.util.Locale locale36 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getDisplayCountry();
        java.lang.String str41 = locale36.getDisplayScript(locale39);
        java.lang.String str42 = zoneOffset31.getDisplayName(textStyle33, locale36);
        int int43 = zoneOffset31.getTotalSeconds();
        java.time.LocalDateTime localDateTime44 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset31);
        java.time.LocalDateTime localDateTime46 = localDateTime44.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset47 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime48 = localDateTime46.atZone((java.time.ZoneId) zoneOffset47);
        java.time.temporal.ChronoField chronoField49 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset50 = java.time.ZoneOffset.UTC;
        boolean boolean51 = chronoField49.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset50);
        java.time.ZonedDateTime zonedDateTime52 = java.time.ZonedDateTime.of(localDateTime46, (java.time.ZoneId) zoneOffset50);
        java.time.DayOfWeek dayOfWeek53 = zonedDateTime52.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime55 = zonedDateTime52.withMinute((int) (byte) 10);
        int int56 = zonedDateTime55.getNano();
        java.time.temporal.Temporal temporal57 = period23.addTo((java.time.temporal.Temporal) zonedDateTime55);
        java.time.LocalDate localDate59 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int60 = localDate59.getMonthValue();
        int int61 = localDate59.getDayOfYear();
        java.time.LocalDate localDate63 = localDate59.withYear((int) ' ');
        java.time.chrono.Era era64 = localDate59.getEra();
        java.time.LocalDate localDate66 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate68 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int69 = localDate68.getMonthValue();
        int int70 = localDate68.getDayOfYear();
        boolean boolean71 = localDate66.isAfter((java.time.chrono.ChronoLocalDate) localDate68);
        boolean boolean72 = localDate59.isEqual((java.time.chrono.ChronoLocalDate) localDate68);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime73 = zonedDateTime55.with((java.time.temporal.TemporalAdjuster) localDate59);
        boolean boolean74 = chronoLocalDate17.isAfter((java.time.chrono.ChronoLocalDate) localDate59);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField13.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronoLocalDate17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(chronoPeriod24);
        org.junit.Assert.assertNotNull(chronoPeriod26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "P-1M" + "'", str27, "P-1M");
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField30.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + textStyle33 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle33.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle34 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle34.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Z" + "'", str42, "Z");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(zoneOffset47);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime48);
        org.junit.Assert.assertTrue("'" + chronoField49 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField49.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertTrue("'" + dayOfWeek53 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek53.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 97 + "'", int56 == 97);
        org.junit.Assert.assertNotNull(temporal57);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 11 + "'", int61 == 11);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertTrue("'" + era64 + "' != '" + java.time.chrono.IsoEra.CE + "'", era64.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertNotNull(localDate68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 11 + "'", int70 == 11);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        long long2 = chronoField0.checkValidValue((long) 16);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.UTC;
        boolean boolean7 = chronoField5.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset6);
        java.time.format.TextStyle textStyle8 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle9 = textStyle8.asNormal();
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayScript(locale14);
        java.lang.String str17 = zoneOffset6.getDisplayName(textStyle8, locale11);
        int int18 = zoneOffset6.getTotalSeconds();
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset6);
        java.time.LocalDateTime localDateTime21 = localDateTime19.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime23 = localDateTime21.atZone((java.time.ZoneId) zoneOffset22);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        boolean boolean26 = chronoField24.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset25);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.of(localDateTime21, (java.time.ZoneId) zoneOffset25);
        java.time.DayOfWeek dayOfWeek28 = zonedDateTime27.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime27.withMinute((int) (byte) 10);
        long long31 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) zonedDateTime30);
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.lang.String str33 = locale32.getCountry();
        java.lang.String str34 = chronoField0.getDisplayName(locale32);
        java.time.ZoneOffset zoneOffset35 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset39 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int40 = zoneOffset35.compareTo(zoneOffset39);
        java.time.temporal.ChronoField chronoField41 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.UTC;
        boolean boolean43 = chronoField41.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset42);
        java.time.format.TextStyle textStyle44 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle45 = textStyle44.asNormal();
        java.util.Locale locale47 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet48 = locale47.getExtensionKeys();
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getDisplayCountry();
        java.lang.String str52 = locale47.getDisplayScript(locale50);
        java.lang.String str53 = zoneOffset42.getDisplayName(textStyle44, locale47);
        java.util.Locale locale55 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet56 = locale55.getExtensionKeys();
        java.lang.String str57 = locale55.getDisplayCountry();
        java.lang.String str58 = zoneOffset35.getDisplayName(textStyle44, locale55);
        java.lang.String str59 = locale32.getDisplayLanguage(locale55);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16L + "'", long2 == 16L);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + textStyle8 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle8.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime23);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField24.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertTrue("'" + dayOfWeek28 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek28.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 72616000L + "'", long31 == 72616000L);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "MilliOfDay" + "'", str34, "MilliOfDay");
        org.junit.Assert.assertNotNull(zoneOffset35);
        org.junit.Assert.assertNotNull(zoneOffset39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4210 + "'", int40 == 4210);
        org.junit.Assert.assertTrue("'" + chronoField41 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField41.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + textStyle44 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle44.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle45 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle45.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertNotNull(charSet48);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Z" + "'", str53, "Z");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(charSet56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Z" + "'", str58, "Z");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Italian" + "'", str59, "Italian");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 16);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        boolean boolean2 = instant0.isSupported((java.time.temporal.TemporalField) chronoField1);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) 10);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap4 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean6 = charListMap4.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList9 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList9, charArray8);
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream18 = java.util.stream.IntStream.of(intArray17);
        java.util.stream.IntStream intStream19 = charListMap4.put(charList9, intStream18);
        boolean boolean20 = optionalDouble1.equals((java.lang.Object) charList9);
        java.lang.String[] strArray21 = java.util.Locale.getISOCountries();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray22 = charList9.toArray((java.lang.CharSequence[]) strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNull(intStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        char[] charArray3 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, ".", charArray3, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.time.zone.ZoneRules zoneRules3 = zoneOffset1.getRules();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        boolean boolean8 = chronoField6.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset7);
        java.time.format.TextStyle textStyle9 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle10 = textStyle9.asNormal();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.lang.String str18 = zoneOffset7.getDisplayName(textStyle9, locale12);
        int int19 = zoneOffset7.getTotalSeconds();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset7);
        java.time.LocalDateTime localDateTime22 = localDateTime20.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.UTC;
        boolean boolean27 = chronoField25.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset26);
        java.time.format.TextStyle textStyle28 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle29 = textStyle28.asNormal();
        java.util.Locale locale31 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet32 = locale31.getExtensionKeys();
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getDisplayCountry();
        java.lang.String str36 = locale31.getDisplayScript(locale34);
        java.lang.String str37 = zoneOffset26.getDisplayName(textStyle28, locale31);
        int int38 = zoneOffset26.getTotalSeconds();
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset26);
        java.time.LocalDateTime localDateTime41 = localDateTime39.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime43 = localDateTime41.atZone((java.time.ZoneId) zoneOffset42);
        java.time.temporal.ChronoField chronoField44 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.UTC;
        boolean boolean46 = chronoField44.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset45);
        java.time.ZonedDateTime zonedDateTime47 = java.time.ZonedDateTime.of(localDateTime41, (java.time.ZoneId) zoneOffset45);
        java.time.DayOfWeek dayOfWeek48 = zonedDateTime47.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime50 = zonedDateTime47.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal51 = localDateTime20.adjustInto((java.time.temporal.Temporal) zonedDateTime50);
        java.time.LocalDateTime localDateTime52 = zonedDateTime50.toLocalDateTime();
        java.time.ZoneOffset zoneOffset53 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int58 = zoneOffset53.compareTo(zoneOffset57);
        boolean boolean59 = zoneRules3.isValidOffset(localDateTime52, zoneOffset57);
        java.time.Instant instant61 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant63 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean64 = instant61.isAfter(instant63);
        java.time.Duration duration65 = zoneRules3.getDaylightSavings(instant63);
        java.time.Instant instant67 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant69 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean70 = instant67.isAfter(instant69);
        java.time.Instant instant72 = instant67.plusSeconds(10000000000L);
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition73 = zoneRules3.nextTransition(instant67);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneRules3);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField6.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z" + "'", str18, "Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField25.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + textStyle28 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle28.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle29 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle29.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(charSet32);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Z" + "'", str37, "Z");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime43);
        org.junit.Assert.assertTrue("'" + chronoField44 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField44.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zonedDateTime47);
        org.junit.Assert.assertTrue("'" + dayOfWeek48 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek48.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime50);
        org.junit.Assert.assertNotNull(temporal51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(zoneOffset53);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4210 + "'", int58 == 4210);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(instant67);
        org.junit.Assert.assertNotNull(instant69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(instant72);
        org.junit.Assert.assertNull(zoneOffsetTransition73);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Date date3 = new java.util.Date((long) (short) 100);
        boolean boolean4 = charSet1.equals((java.lang.Object) date3);
        date3.setTime((long) 1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.time.format.TextStyle textStyle3 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle4 = textStyle3.asNormal();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale6.getDisplayScript(locale9);
        java.lang.String str12 = zoneOffset1.getDisplayName(textStyle3, locale6);
        java.time.LocalTime localTime13 = java.time.LocalTime.now((java.time.ZoneId) zoneOffset1);
        java.time.zone.ZoneRules zoneRules14 = java.time.zone.ZoneRules.of(zoneOffset1);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + textStyle3 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle3.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(zoneRules14);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.LocalDate localDate21 = localDateChronoZonedDateTime20.toLocalDate();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime22 = localDateChronoZonedDateTime20.toLocalDateTime();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime22);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.time.Instant instant0 = java.time.Instant.MAX;
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.lang.String str7 = locale1.getDisplayCountry();
        java.util.Locale locale8 = locale1.stripExtensions();
        java.lang.String str9 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        charSet2.clear();
        java.util.Spliterator<java.lang.Character> charSpliterator4 = charSet2.spliterator();
        int int5 = charSet2.size();
        java.lang.Object[] objArray6 = charSet2.toArray();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(charSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.LocalTime localTime2 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology3 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime2);
        java.lang.String str4 = chronology3.toString();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        boolean boolean6 = chronology3.equals((java.lang.Object) chronoField5);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = zoneOffset0.getLong((java.time.temporal.TemporalField) chronoField5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISO" + "'", str4, "ISO");
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        java.util.DoubleSummaryStatistics doubleSummaryStatistics0 = new java.util.DoubleSummaryStatistics();
        doubleSummaryStatistics0.accept(10.0d);
        double double3 = doubleSummaryStatistics0.getMax();
        org.junit.Assert.assertEquals(doubleSummaryStatistics0.toString(), "DoubleSummaryStatistics{count=1, sum=10.000000, min=10.000000, average=10.000000, max=10.000000}");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        java.util.Spliterator<java.lang.Character> charSpliterator18 = charList7.spliterator();
        boolean boolean20 = charSpliterator18.hasCharacteristics((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
        org.junit.Assert.assertNotNull(charSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        java.io.File file3 = file2.getCanonicalFile();
        boolean boolean4 = file3.createNewFile();
        java.net.URI uRI5 = file3.toURI();
        int int6 = uRI5.getPort();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertNotNull(file3);
// flaky:         org.junit.Assert.assertEquals(file3.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.stream.IntStream intStream8 = intStream7.sequential();
        java.util.PrimitiveIterator.OfInt ofInt9 = intStream7.iterator();
        int int10 = ofInt9.nextInt();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(ofInt9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.OptionalInt optionalInt8 = intStream7.findFirst();
        int int10 = optionalInt8.orElse(64);
        java.io.OutputStream outputStream11 = null;
        java.io.FilterOutputStream filterOutputStream12 = new java.io.FilterOutputStream(outputStream11);
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream12, true);
        boolean boolean15 = optionalInt8.equals((java.lang.Object) printWriter14);
        char[] charArray20 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer21 = java.nio.CharBuffer.wrap(charArray20);
        java.nio.CharBuffer charBuffer23 = charBuffer21.put('#');
        char[] charArray25 = new char[] { '#' };
        java.nio.CharBuffer charBuffer26 = charBuffer21.get(charArray25);
        char[] charArray31 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer32 = java.nio.CharBuffer.wrap(charArray31);
        java.nio.CharBuffer charBuffer34 = charBuffer32.put('#');
        char[] charArray36 = new char[] { '#' };
        java.nio.CharBuffer charBuffer37 = charBuffer32.get(charArray36);
        char[] charArray42 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer43 = java.nio.CharBuffer.wrap(charArray42);
        java.nio.CharBuffer charBuffer45 = charBuffer43.put('#');
        char[] charArray47 = new char[] { '#' };
        java.nio.CharBuffer charBuffer48 = charBuffer43.get(charArray47);
        int int49 = charBuffer37.compareTo(charBuffer43);
        int int50 = charBuffer21.compareTo(charBuffer37);
        boolean boolean51 = optionalInt8.equals((java.lang.Object) charBuffer21);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer21);
        org.junit.Assert.assertNotNull(charBuffer23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4]");
        org.junit.Assert.assertNotNull(charBuffer26);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer32);
        org.junit.Assert.assertNotNull(charBuffer34);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4]");
        org.junit.Assert.assertNotNull(charBuffer37);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer43);
        org.junit.Assert.assertNotNull(charBuffer45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4]");
        org.junit.Assert.assertNotNull(charBuffer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.text.ParseException parseException2 = new java.text.ParseException("Z", 0);
        java.security.NoSuchAlgorithmException noSuchAlgorithmException3 = new java.security.NoSuchAlgorithmException((java.lang.Throwable) parseException2);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.time.Duration duration1 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration3 = duration1.withSeconds(6603384152749567654L);
        java.time.Duration duration5 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration7 = duration5.withSeconds(6603384152749567654L);
        java.time.Duration duration8 = duration3.minus(duration7);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        java.time.LocalDate localDate12 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int13 = localDate12.getMonthValue();
        int int14 = localDate12.getDayOfYear();
        java.time.LocalDate localDate16 = localDate12.withYear((int) ' ');
        java.time.LocalDateTime localDateTime17 = localTime1.atDate(localDate12);
        java.time.LocalDateTime localDateTime19 = localDateTime17.minusSeconds(280504119296L);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }
}
