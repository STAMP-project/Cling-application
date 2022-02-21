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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dateMidnight1.get(dateTimeField3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeField must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getDisplayScript();
        boolean boolean7 = interval3.equals((java.lang.Object) str6);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.time.LocalDate localDate0 = null;
        java.time.LocalTime localTime1 = java.time.LocalTime.MIN;
        java.time.ZoneOffset zoneOffset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.of(localDate0, localTime1, zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.function.LongPredicate longPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = longStream2.anyMatch(longPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.DurationFieldType[] durationFieldTypeArray0 = new org.joda.time.DurationFieldType[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.forFields(durationFieldTypeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Types array must not be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldTypeArray0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = java.time.LocalTime.parse((java.lang.CharSequence) "", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.chrono.Chronology chronology1 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withChronology(chronology1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor5 = dateTimeFormatter2.parse((java.lang.CharSequence) "hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar1.clear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = property2.compareTo(readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("January", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.function.DoubleToIntFunction doubleToIntFunction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream2 = doubleStream0.mapToInt(doubleToIntFunction1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) dateMidnight1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateMidnight");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String str0 = java.io.File.separator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/" + "'", str0, "/");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.time.LocalTime localTime0 = java.time.LocalTime.MIN;
        java.time.LocalTime localTime2 = localTime0.minusMinutes(100L);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((java.lang.Object) localTime2, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.net.URLConnection.setDefaultRequestProperty("", "January");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("/", "/", "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: /");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = longStream2.onClose(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.function.LongUnaryOperator longUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream2 = java.util.stream.LongStream.iterate(0L, longUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.monthOfYear();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((int) '#', 100, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = java.time.LocalDate.parse((java.lang.CharSequence) "January");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'January' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.time.LocalTime localTime0 = java.time.LocalTime.MIN;
        java.time.LocalTime localTime2 = localTime0.minusMinutes(100L);
        java.time.format.DateTimeFormatter dateTimeFormatter3 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.chrono.Chronology chronology4 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localTime0.format(dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: WeekBasedYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.net.URISyntaxException uRISyntaxException2 = new java.net.URISyntaxException("hi!", "/");
        int int3 = uRISyntaxException2.getIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.TimeZone timeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        boolean boolean3 = gregorianCalendar1.before((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = gregorianCalendar1.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        boolean boolean3 = gregorianCalendar1.before((java.lang.Object) (short) 10);
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format5 = dateTimeFormatter4.toFormat();
        boolean boolean6 = gregorianCalendar1.equals((java.lang.Object) format5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("January");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.stream.Collector.Characteristics characteristics0 = java.util.stream.Collector.Characteristics.CONCURRENT;
        org.junit.Assert.assertTrue("'" + characteristics0 + "' != '" + java.util.stream.Collector.Characteristics.CONCURRENT + "'", characteristics0.equals(java.util.stream.Collector.Characteristics.CONCURRENT));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod8.setYears(100);
        int int11 = mutablePeriod8.getWeeks();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption[] openOptionArray1 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.FileChannel fileChannel2 = java.nio.channels.FileChannel.open(path0, openOptionArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        boolean boolean3 = gregorianCalendar1.before((java.lang.Object) (short) 10);
        int int5 = gregorianCalendar1.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.chrono.Chronology chronology1 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withChronology(chronology1);
        java.time.LocalTime localTime7 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        boolean boolean13 = localTime7.equals((java.lang.Object) languageRangeList9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter0.format((java.time.temporal.TemporalAccessor) localTime7);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: WeekBasedYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.chrono.Chronology chronology1 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withChronology(chronology1);
        java.time.chrono.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone11);
        org.joda.time.Period period13 = interval12.toPeriod();
        boolean boolean14 = interval8.isBefore((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Interval interval15 = interval3.gap((org.joda.time.ReadableInterval) interval8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = interval15.toPeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(interval15);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.time.format.ResolverStyle resolverStyle0 = java.time.format.ResolverStyle.STRICT;
        org.junit.Assert.assertTrue("'" + resolverStyle0 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle0.equals(java.time.format.ResolverStyle.STRICT));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.time.ZoneId zoneId0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock1 = java.time.Clock.system(zoneId0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("January");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"January\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = period4.get(durationFieldType5);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.Period period9 = period4.minusHours((int) (byte) 1);
        int int10 = period9.getYears();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType12 = periodType11.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period9.withPeriodType(periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime2 = java.time.OffsetTime.parse((java.lang.CharSequence) "hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.time.chrono.IsoEra isoEra2 = java.time.chrono.IsoEra.CE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateTimeFormatter0.format((java.time.temporal.TemporalAccessor) isoEra2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra2.equals(java.time.chrono.IsoEra.CE));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.function.LongPredicate longPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = longStream2.allMatch(longPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        long long0 = java.security.Key.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 6603384152749567654L + "'", long0 == 6603384152749567654L);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod8.setYears(100);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long13 = duration12.getStandardDays();
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod8.getFieldType(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.time.ZoneOffset zoneOffset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime5 = java.time.OffsetTime.of((int) (byte) 1, 0, (int) (byte) 1, 100, zoneOffset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = yearMonthDay2.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay2.withField(dateTimeFieldType5, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.Period period5 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean7 = period5.equals((java.lang.Object) (-1));
        java.time.Period period9 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean11 = period9.equals((java.lang.Object) (-1));
        int int12 = period9.getDays();
        java.time.Period period13 = period5.minus((java.time.temporal.TemporalAmount) period9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant14 = instant3.plus((java.time.temporal.TemporalAmount) period9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.monthOfYear();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((int) (short) 10, (-1), chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        languageRangeList4.clear();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.function.DoublePredicate doublePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = doubleStream1.noneMatch(doublePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor2 = dateTimeFormatter0.parse((java.lang.CharSequence) "2022-02-21T09:33:58.303");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '2022-02-21T09:33:58.303' could not be parsed at index 4");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.years();
        org.joda.time.DurationField durationField5 = chronology3.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = chronology3.getDateTimeMillis((long) 100, 3, 1024, (int) (short) 100, 1024);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1024 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.security.Provider provider0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.Provider.Service service9 = new java.security.Provider.Service(provider0, "/", "2022-02-21T09:33:57.064", "2022-02-21T09:33:57.064", (java.util.List<java.lang.String>) strList6, strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.OptionalLong optionalLong3 = longStream2.max();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong3.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray4, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 1, 10]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange5 = chronoField4.range();
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField4.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime7 = localDateTime1.plus((long) ' ', temporalUnit6);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange5);
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        boolean boolean3 = file2.isAbsolute();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = property2.getAsText(locale6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType9 = periodType8.withMillisRemoved();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.monthOfYear();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) property2, periodType8, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateMidnight$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "January" + "'", str7, "January");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 0);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod14.setYears(100);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long19 = duration18.getStandardDays();
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime5.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime5.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property25 = localDateTime5.property(dateTimeFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = localTime3.isEqual((org.joda.time.ReadablePartial) localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.concurrent.TimeoutException timeoutException1 = new java.util.concurrent.TimeoutException("");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.time.ZoneOffset zoneOffset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.ofEpochSecond((long) 4, 0, zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange1 = chronoField0.range();
        long long2 = valueRange1.getMinimum();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-999999999L) + "'", long2 == (-999999999L));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.net.URI uRI1 = java.net.URI.create("January");
        java.net.URI uRI3 = java.net.URI.create("January");
        java.net.URI uRI4 = uRI1.relativize(uRI3);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = new java.io.File(uRI1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URI is not absolute");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar4 = new java.util.GregorianCalendar(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = localTime1.toString("2022-02-21T09:33:57.064", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange3 = chronoField2.range();
        java.time.temporal.TemporalUnit temporalUnit4 = chronoField2.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant5 = instant0.minus((-999999999L), temporalUnit4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange3);
        org.junit.Assert.assertTrue("'" + temporalUnit4 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit4.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeOfDay1.toString("2022-02-21T09:33:57.762", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange5 = chronoField4.range();
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField4.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit7 = chronoField4.getBaseUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = instant3.getLong((java.time.temporal.TemporalField) chronoField4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange5);
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit7 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit7.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "January", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property3 = localDate0.property(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2022 + "'", int1 == 2022);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.OptionalLong optionalLong3 = longStream2.max();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = longStream2.limit((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.monthOfYear();
        org.joda.time.Chronology chronology6 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) (byte) 0, periodType1, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange1 = chronoField0.range();
        java.time.temporal.TemporalUnit temporalUnit2 = chronoField0.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant3 = new org.joda.time.Instant((java.lang.Object) temporalUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.time.temporal.ChronoUnit");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange1);
        org.junit.Assert.assertTrue("'" + temporalUnit2 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit2.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = localDateTime0.get((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Invalid field 'NanoOfDay' for get() method, use getLong() instead");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.withField(dateTimeFieldType6, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight4.withZoneRetainFields(dateTimeZone9);
        int int11 = dateMidnight10.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("2022-02-21T09:34:00.693");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: 2022-02-21T09:34:00.693");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange4 = chronoField3.range();
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField3.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal6 = localDateTime0.plus((long) (-1), temporalUnit5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange4);
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.monthOfYear();
        org.joda.time.Chronology chronology6 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((int) (short) 10, (int) (byte) 0, 2, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.OptionalLong optionalLong3 = longStream2.max();
        java.util.stream.LongStream longStream4 = longStream2.parallel();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = longStream4.count();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int int0 = org.joda.time.YearMonthDay.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = property2.setCopy((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.nativeOrder();
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.chrono.Chronology chronology3 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.String str5 = localDateTime0.format(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-W08-1" + "'", str5, "2022-W08-1");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar1.set((int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.LITTLE_ENDIAN;
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDateTime1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        java.lang.String str2 = localDateTime1.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone5);
        org.joda.time.Period period7 = interval6.toPeriod();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minus((org.joda.time.ReadablePeriod) period7);
        int int9 = localDateTime8.getHourOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T09:34:02.096" + "'", str2, "2022-02-21T09:34:02.096");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.OptionalLong optionalLong3 = longStream2.max();
        java.util.stream.LongStream longStream4 = longStream2.parallel();
        java.util.function.LongPredicate longPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = longStream4.noneMatch(longPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.time.Period period1 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean3 = period1.equals((java.lang.Object) (-1));
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        boolean boolean9 = period1.equals((java.lang.Object) strMap7);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.TUESDAY;
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.TUESDAY));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        char[] charArray3 = new char[] { '#', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray3, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a, a]");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble2 = doubleStream0.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble2 = doubleStream0.average();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.WEDNESDAY;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange2 = chronoField1.range();
        boolean boolean3 = chronoField1.isDateBased();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dayOfWeek0.getLong((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.WEDNESDAY));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = java.time.temporal.ValueRange.of((long) 2022, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value must be less than maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        char char0 = java.text.CharacterIterator.DONE;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\uffff' + "'", char0 == '\uffff');
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime10.withTime((int) ' ', (int) (short) 0, (int) (byte) -1, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        int int4 = timeZone2.getRawOffset();
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone2);
        boolean boolean6 = timeZone2.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange2 = chronoField1.range();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = offsetTime0.get((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange2);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond(1024);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1024 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = java.time.LocalDate.ofYearDay(1024, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(96, (int) (short) 0, 12, 3, 9, 64, (-1), chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 64 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.Clock clock4 = java.time.Clock.systemDefaultZone();
        boolean boolean5 = gregorianCalendar1.after((java.lang.Object) clock4);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar1.add(100, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(clock4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.NANO_OF_DAY;
        boolean boolean1 = chronoField0.isTimeBased();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.io.UnsupportedEncodingException unsupportedEncodingException1 = new java.io.UnsupportedEncodingException("January");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        java.nio.CharBuffer charBuffer7 = charBuffer5.duplicate();
        java.nio.CharBuffer charBuffer9 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer10 = charBuffer9.clear();
        int int11 = charBuffer7.compareTo(charBuffer9);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer12 = charBuffer3.put(charBuffer9);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setTime(256, 32, 10, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 256 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.time.Period period3 = java.time.Period.of(9, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        boolean boolean5 = gregorianCalendar1.after((java.lang.Object) 1.0f);
        java.nio.LongBuffer longBuffer7 = java.nio.LongBuffer.allocate(3);
        java.nio.LongBuffer longBuffer8 = longBuffer7.duplicate();
        boolean boolean9 = gregorianCalendar1.equals((java.lang.Object) longBuffer8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = new java.net.URI("January", "10", "Year", "-999999999 - 999999999");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: January://10Year#-999999999%20-%20999999999");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.plusMonths(10);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withChronology(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime17 = dateTime13.withDayOfWeek(4);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.monthOfYear();
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (short) 1);
        long long23 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight22.withField(dateTimeFieldType24, (int) ' ');
        boolean boolean27 = dateTime13.isSupported(dateTimeFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay4.withField(dateTimeFieldType24, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Comparator<java.time.OffsetDateTime> offsetDateTimeComparator0 = java.time.OffsetDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(offsetDateTimeComparator0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((int) 'a', 96, 16, (int) (short) 100, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.OptionalLong optionalLong3 = longStream2.max();
        java.util.function.LongPredicate longPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = longStream2.noneMatch(longPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "en_GB");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange2 = chronoField1.range();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = isoEra0.get((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange2);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.function.DoubleToIntFunction doubleToIntFunction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = doubleStream1.mapToInt(doubleToIntFunction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar.Builder builder4 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        int int8 = timeZone6.getRawOffset();
        java.util.Calendar.Builder builder9 = builder4.setTimeZone(timeZone6);
        boolean boolean10 = timeZone1.hasSameRules(timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = timeZone6.getDisplayName(false, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 4096");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = period4.get(durationFieldType5);
        org.joda.time.Period period7 = period4.toPeriod();
        int int8 = period4.getWeeks();
        org.joda.time.Period period10 = period4.minusHours(9);
        int int11 = period4.getHours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval12 = new org.joda.time.Interval((java.lang.Object) period4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.THURSDAY;
        java.time.DayOfWeek dayOfWeek2 = dayOfWeek0.minus((long) (short) -1);
        java.time.LocalTime localTime7 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        boolean boolean13 = localTime7.equals((java.lang.Object) languageRangeList9);
        java.time.LocalTime localTime15 = localTime7.minusMinutes((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal16 = dayOfWeek0.adjustInto((java.time.temporal.Temporal) localTime15);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfWeek");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.FRIDAY));
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        int int4 = timeZone2.getRawOffset();
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone2);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.monthOfYear();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval10 = new org.joda.time.Interval((java.lang.Object) builder0, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.util.Calendar$Builder");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL;
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.net.Proxy.Type type0 = java.net.Proxy.Type.HTTP;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + java.net.Proxy.Type.HTTP + "'", type0.equals(java.net.Proxy.Type.HTTP));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) 10, 0, 12, 7, 96);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 96 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = format1.parseObject("P35Y100MT32H97M97.001S");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Text 'P35Y100MT32H97M97.001S' could not be parsed at index 0");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = new java.net.URI("2022-02-21T09:34:00.693", "23:50:00.000000097", "/", "P35Y100MT32H97M97.001S");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Illegal character in scheme name at index 0: 2022-02-21T09:34:00.693://[23:50:00.000000097]/#P35Y100MT32H97M97.001S");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.Clock clock4 = java.time.Clock.systemDefaultZone();
        boolean boolean5 = gregorianCalendar1.after((java.lang.Object) clock4);
        java.time.ZoneId zoneId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock7 = clock4.withZone(zoneId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(clock4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType16 = timeOfDay14.getFieldType(96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        int int4 = timeZone2.getRawOffset();
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone2);
        java.util.Calendar.Builder builder7 = builder0.setInstant((long) 3);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.monthOfYear();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 1);
        long long7 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.withField(dateTimeFieldType8, (int) ' ');
        org.joda.time.Period period11 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateMidnight10);
        int int12 = dateMidnight10.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDurationAdded((long) 3, 1);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(dateMidnight15);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = new java.net.URI("2022-02-21T09:34:00.693", "2022-02-21T09:34:04.525", "Year", "-999999999 - 999999999");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: 2022-02-21T09:34:00.693://[2022-02-21T09:34:04.525]Year#-999999999%20-%20999999999");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2022-02-21T09:34:00.693", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.net.URI uRI1 = java.net.URI.create("January");
        java.net.URI uRI3 = java.net.URI.create("January");
        java.net.URI uRI4 = uRI1.relativize(uRI3);
        java.net.URI uRI6 = java.net.URI.create("January");
        java.net.URI uRI8 = java.net.URI.create("January");
        java.net.URI uRI9 = uRI6.relativize(uRI8);
        java.net.URI uRI10 = uRI4.relativize(uRI8);
        java.lang.String str11 = uRI4.getQuery();
        int int12 = uRI4.getPort();
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(uRI10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange1 = chronoField0.range();
        boolean boolean3 = valueRange1.isValidValue(100L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((java.lang.Object) valueRange1, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.time.temporal.ValueRange");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime2 = java.time.OffsetTime.parse((java.lang.CharSequence) charBuffer1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Optional.empty' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.monthOfYear();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) property21, chronology25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = dateTimeField22.getType();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.lang.String str26 = dateTimeField22.getAsText((long) 21, locale25);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = dateTimeField22.getDifference(6603384152749567654L, 88473600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 10918293757");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1" + "'", str26, "1");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.monthOfYear();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 1);
        long long7 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.withField(dateTimeFieldType8, (int) ' ');
        org.joda.time.Period period11 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateMidnight10);
        int int12 = dateMidnight10.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight14 = dateMidnight10.withWeekOfWeekyear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        java.lang.String str2 = localDateTime1.toString();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusMinutes(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withField(dateTimeFieldType5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T09:34:05.120" + "'", str2, "2022-02-21T09:34:05.120");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDay();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String[] strArray4 = new java.lang.String[] { "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z", "10", "Optional.empty", "2022-02-21T09:34:01.158" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        boolean boolean13 = languageRangeList11.contains((java.lang.Object) "");
        boolean boolean14 = languageRangeList11.isEmpty();
        boolean boolean16 = languageRangeList11.remove((java.lang.Object) 10L);
        boolean boolean17 = languageRangeList11.isEmpty();
        boolean boolean18 = strSet5.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList11.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange20 = languageRangeItor19.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeItor19);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.Throwable throwable1 = null;
        java.util.concurrent.ExecutionException executionException2 = new java.util.concurrent.ExecutionException("2022-02-21T09:33:57.762", throwable1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset2 = strMap0.remove((java.lang.Object) '\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        java.lang.String str25 = localDateTime24.toString();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.yearOfCentury();
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.dayOfWeek();
        int int28 = localDateTime24.getWeekyear();
        int[] intArray34 = new int[] { 70, 'x', 3, 256 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = dateTimeField22.set((org.joda.time.ReadablePartial) localDateTime24, (int) ' ', intArray34, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2022-02-21T09:34:05.323" + "'", str25, "2022-02-21T09:34:05.323");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2022 + "'", int28 == 2022);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[70, 120, 3, 256]");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        mutableInterval1.setEndMillis((long) 4096);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval1.setInterval((long) ' ', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = strMap0.containsKey((java.lang.Object) locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Locale cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate(3);
        java.nio.LongBuffer longBuffer2 = longBuffer1.duplicate();
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.allocate(3);
        int int5 = longBuffer2.compareTo(longBuffer4);
        long[] longArray6 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer9 = longBuffer2.get(longArray6, (-1), 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format2 = dateTimeFormatter1.toFormat();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange4 = chronoField3.range();
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField3.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField3.getBaseUnit();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange9 = chronoField8.range();
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange11 = chronoField10.range();
        java.time.temporal.TemporalUnit temporalUnit12 = chronoField10.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit13 = chronoField10.getBaseUnit();
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange15 = chronoField14.range();
        java.time.temporal.TemporalUnit temporalUnit16 = chronoField14.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField14.getBaseUnit();
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        boolean boolean19 = chronoField18.isTimeBased();
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray23 = new java.time.temporal.TemporalField[] { chronoField3, chronoField7, chronoField8, chronoField10, chronoField14, chronoField18, chronoField20, chronoField21, chronoField22 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet24 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet24, temporalFieldArray23);
        java.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter1.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet24);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime27 = java.time.OffsetDateTime.parse((java.lang.CharSequence) "2022-02-21T09:34:02.096", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '2022-02-21T09:34:02.096' could not be parsed: Unable to obtain OffsetDateTime from TemporalAccessor: {},ISO resolved to 2022-02-21T09:34:02.096 of type java.time.format.Parsed");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(format2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange4);
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField8.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange11);
        org.junit.Assert.assertTrue("'" + temporalUnit12 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit12.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit13 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit13.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField14.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertTrue("'" + temporalUnit16 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit16.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField21.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField22.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.nio.file.Path path5 = file2.toPath();
        java.io.File file8 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file10 = new java.io.File(file8, "2022-02-21T09:33:57.064");
        java.nio.file.Path path11 = file8.toPath();
        int int12 = path5.compareTo(path11);
        java.nio.file.LinkOption linkOption13 = null;
        java.nio.file.LinkOption[] linkOptionArray14 = new java.nio.file.LinkOption[] { linkOption13 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path15 = path11.toRealPath(linkOptionArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(linkOptionArray14);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putFloat(3, (float) 16);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = byteBuffer4.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.Period period4 = new org.joda.time.Period(1970, 32, 16, 1);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.net.URISyntaxException uRISyntaxException2 = new java.net.URISyntaxException("hi!", "/");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.time.Duration duration1 = java.time.Duration.ofHours(0L);
        java.time.Duration duration3 = java.time.Duration.ofHours(0L);
        int int4 = duration1.compareTo(duration3);
        java.time.Duration duration6 = duration1.minusMinutes((long) 'a');
        java.time.Duration duration8 = duration6.minusDays((long) 100);
        boolean boolean9 = duration8.isZero();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period(88473600000L, (long) (byte) 0, periodType2);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.LongStream longStream10 = intStream9.asLongStream();
        java.util.function.IntBinaryOperator intBinaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = intStream9.reduce((int) (byte) 10, intBinaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        java.time.format.DateTimeFormatter dateTimeFormatter15 = java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDate14.format(dateTimeFormatter15);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: HourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format2 = dateTimeFormatter1.toFormat();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange4 = chronoField3.range();
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField3.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField3.getBaseUnit();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange9 = chronoField8.range();
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange11 = chronoField10.range();
        java.time.temporal.TemporalUnit temporalUnit12 = chronoField10.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit13 = chronoField10.getBaseUnit();
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange15 = chronoField14.range();
        java.time.temporal.TemporalUnit temporalUnit16 = chronoField14.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField14.getBaseUnit();
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        boolean boolean19 = chronoField18.isTimeBased();
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray23 = new java.time.temporal.TemporalField[] { chronoField3, chronoField7, chronoField8, chronoField10, chronoField14, chronoField18, chronoField20, chronoField21, chronoField22 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet24 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet24, temporalFieldArray23);
        java.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter1.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet24);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "P20Y-1M", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'P20Y-1M' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(format2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange4);
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField8.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange11);
        org.junit.Assert.assertTrue("'" + temporalUnit12 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit12.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit13 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit13.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField14.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertTrue("'" + temporalUnit16 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit16.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField21.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField22.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.lang.String str24 = property21.getAsText(locale22);
        org.joda.time.LocalDateTime localDateTime26 = property21.addToCopy((long) 7);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withSecondOfMinute(16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withEra((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "8" + "'", str24, "8");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        // The following exception was thrown during execution in test generation
        try {
            java.util.DoubleSummaryStatistics doubleSummaryStatistics2 = doubleStream0.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange2 = chronoField1.range();
        boolean boolean3 = isoEra0.isSupported((java.time.temporal.TemporalField) chronoField1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = chronoField1.checkValidIntValue(8640000000L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 8640000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.String[] strArray4 = new java.lang.String[] { "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z", "10", "Optional.empty", "2022-02-21T09:34:01.158" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        boolean boolean13 = languageRangeList11.contains((java.lang.Object) "");
        boolean boolean14 = languageRangeList11.isEmpty();
        boolean boolean16 = languageRangeList11.remove((java.lang.Object) 10L);
        boolean boolean17 = languageRangeList11.isEmpty();
        boolean boolean18 = strSet5.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.time.LocalTime localTime23 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap27);
        boolean boolean29 = localTime23.equals((java.lang.Object) languageRangeList25);
        languageRangeList25.clear();
        boolean boolean31 = strSet5.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25);
        java.util.Locale.LanguageRange languageRange33 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList25.add(12, languageRange33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalTime localTime9 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        boolean boolean15 = localTime9.equals((java.lang.Object) languageRangeList11);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal16 = localDateTime4.adjustInto((java.time.temporal.Temporal) localTime9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = gregorianCalendar1.getGreatestMinimum(70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar.Builder builder4 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        int int8 = timeZone6.getRawOffset();
        java.util.Calendar.Builder builder9 = builder4.setTimeZone(timeZone6);
        boolean boolean10 = timeZone1.hasSameRules(timeZone6);
        java.time.Clock clock11 = java.time.Clock.systemUTC();
        java.time.Instant instant12 = clock11.instant();
        java.util.Date date13 = java.util.Date.from(instant12);
        date13.setHours((int) (short) 10);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.fromDateFields(date13);
        boolean boolean17 = timeZone1.inDaylightTime(date13);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Feb 21 10:34:06 UTC 2022");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("NanoOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"NanoOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.monthOfYear();
        org.joda.time.Chronology chronology4 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.halfdays();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(0L, chronology4);
        org.joda.time.DurationField durationField7 = chronology4.centuries();
        int int10 = durationField7.getDifference((long) 72, (long) (short) 10);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.parse((java.lang.CharSequence) "2022-02-21T09:33:57.762");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '2022-02-21T09:33:57.762' could not be parsed at index 23");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.MutableInterval mutableInterval6 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean8 = mutableInterval6.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone11);
        org.joda.time.Period period13 = interval12.toPeriod();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = period13.get(durationFieldType14);
        org.joda.time.Period period16 = period13.toPeriod();
        mutableInterval6.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period18 = mutableInterval6.toPeriod();
        org.joda.time.Interval interval19 = interval3.gap((org.joda.time.ReadableInterval) mutableInterval6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = interval19.getEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNull(interval19);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.NANO_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant6 = instant3.with((java.time.temporal.TemporalField) chronoField4, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField4.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.halfdays();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay2.withChronologyRetainFields(chronology7);
        boolean boolean11 = seconds0.equals((java.lang.Object) timeOfDay2);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.io.File file4 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.PrintStream printStream5 = new java.io.PrintStream(file4);
        printStream5.print('a');
        printStream5.println(false);
        char[] charArray15 = new char[] { 'a', '\uffff', '\uffff', 'x', ' ' };
        printStream5.print(charArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer17 = charBuffer1.put(charArray15);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(charArray15);
// flaky:         org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "\uffff\uffff, x,  ]");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) '4', 3, 7, (int) '\uffff', 21, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 65535 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.plusMonths(10);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay2.minusYears(0);
        org.joda.time.DateMidnight dateMidnight7 = yearMonthDay6.toDateMidnight();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.months();
        org.joda.time.Period period11 = new org.joda.time.Period((-1L), (long) (short) 0, periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) dateMidnight7, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateMidnight");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.PrintStream printStream3 = new java.io.PrintStream(file2);
        printStream3.print('a');
        printStream3.println(false);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            printStream3.write(byteArray11, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 10, 100]");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plusMonths((int) '#');
        boolean boolean5 = dateMidnight3.isAfter((long) (short) 1);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long8 = duration7.getStandardDays();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.time();
        org.joda.time.Period period11 = duration7.toPeriodTo(readableInstant9, periodType10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone14);
        org.joda.time.Period period16 = interval15.toPeriod();
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = period16.get(durationFieldType17);
        org.joda.time.Period period19 = period16.toPeriod();
        org.joda.time.Hours hours20 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType21 = hours20.getFieldType();
        org.joda.time.DurationFieldType durationFieldType22 = hours20.getFieldType();
        int int23 = period16.indexOf(durationFieldType22);
        int int24 = period11.get(durationFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadablePeriod) period11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        java.lang.String str2 = localDateTime1.toString();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T09:34:06.985" + "'", str2, "2022-02-21T09:34:06.985");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = yearMonthDay2.toInterval(dateTimeZone3);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod13.setYears(100);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long18 = duration17.getStandardDays();
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval20 = interval4.withPeriodAfterStart((org.joda.time.ReadablePeriod) mutablePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.lang.String str4 = dateTimeFieldType3.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay6 = timeOfDay1.withField(dateTimeFieldType3, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "weekyearOfCentury" + "'", str4, "weekyearOfCentury");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.LongStream longStream10 = intStream9.asLongStream();
        java.util.stream.Stream<java.lang.Long> longStream11 = longStream10.boxed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = longStream10.unordered();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        java.lang.String str2 = localDateTime1.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone5);
        org.joda.time.Period period7 = interval6.toPeriod();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Days days9 = period7.toStandardDays();
        org.joda.time.Weeks weeks10 = days9.toStandardWeeks();
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T09:34:07.194" + "'", str2, "2022-02-21T09:34:07.194");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(weeks10);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties1.load(reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 0);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(59);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime18 = dateTime14.withDayOfWeek(4);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.monthOfYear();
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 1);
        long long24 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight23.withField(dateTimeFieldType25, (int) ' ');
        boolean boolean28 = dateTime14.isSupported(dateTimeFieldType25);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = localTime3.get(dateTimeFieldType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.Clock clock4 = java.time.Clock.systemDefaultZone();
        boolean boolean5 = gregorianCalendar1.after((java.lang.Object) clock4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = gregorianCalendar1.isSet((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(clock4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (byte) -1, 2022, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        java.lang.String str14 = locale10.toString();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en_US" + "'", str14, "en_US");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = new java.net.URI("2022-02-21T09:33:57.064", "2022-W08-1", "2022-02-21T09:34:04.525", (int) '#', "2022-02-21T09:34:05.527", "2022-02-21T09:34:02.096", "2022-02-21T09:34:05.527");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: 2022-02-21T09:33:57.064://2022-W08-1@[2022-02-21T09:34:04.525]:352022-02-21T09:34:05.527?2022-02-21T09:34:02.096#2022-02-21T09:34:05.527");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI1 = java.net.URI.create("2022-02-21T09:34:04.525");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: 2022-02-21T09:34:04.525");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        boolean boolean9 = languageRangeList7.contains((java.lang.Object) "");
        boolean boolean10 = languageRangeList7.isEmpty();
        boolean boolean12 = languageRangeList7.remove((java.lang.Object) 10L);
        boolean boolean13 = strSet2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        languageRangeList7.clear();
        java.lang.String[] strArray20 = new java.lang.String[] { "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z", "10", "Optional.empty", "2022-02-21T09:34:01.158" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap26);
        boolean boolean29 = languageRangeList27.contains((java.lang.Object) "");
        boolean boolean30 = languageRangeList27.isEmpty();
        boolean boolean32 = languageRangeList27.remove((java.lang.Object) 10L);
        boolean boolean33 = languageRangeList27.isEmpty();
        boolean boolean34 = strSet21.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = languageRangeList7.addAll(64, (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 64, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = byteBuffer2.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = localDate14.atTime(96, 11, 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 96");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.PrintStream printStream3 = new java.io.PrintStream(file2);
        boolean boolean4 = printStream3.checkError();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod28.setYears((int) '#');
        mutablePeriod28.addSeconds(1);
        mutablePeriod28.addSeconds(100);
        org.joda.time.MutableInterval mutableInterval36 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        mutableInterval36.setEndMillis((long) 4096);
        org.joda.time.Duration duration39 = mutableInterval36.toDuration();
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime19.withDurationAdded((org.joda.time.ReadableDuration) duration39, 70);
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime46 = localTime44.minusSeconds((int) (short) 0);
        org.joda.time.LocalTime localTime48 = localTime46.plusMinutes(9);
        int int49 = localTime48.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = localDateTime19.isEqual((org.joda.time.ReadablePartial) localTime48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(mutableInterval36);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(locale2);
        java.util.Date date4 = gregorianCalendar3.getGregorianChange();
        int int5 = gregorianCalendar1.compareTo((java.util.Calendar) gregorianCalendar3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withDayOfYear((int) '4');
        java.lang.String str5 = dateMidnight4.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-02-21T00:00:00.000Z" + "'", str5, "1970-02-21T00:00:00.000Z");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        java.time.Instant instant6 = java.time.Instant.MAX;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime7 = zonedDateTime4.with((java.time.temporal.TemporalAdjuster) instant6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.parse((java.lang.CharSequence) "January", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        java.net.InetAddress inetAddress6 = java.net.InetAddress.getByAddress("Optional.empty", byteArray5);
        java.net.NetworkInterface networkInterface7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = inetAddress6.isReachable(networkInterface7, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(inetAddress6);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.THURSDAY;
        java.time.DayOfWeek dayOfWeek2 = dayOfWeek0.minus((long) (short) -1);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long5 = duration4.getStandardDays();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.time();
        org.joda.time.Period period8 = duration4.toPeriodTo(readableInstant6, periodType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) dayOfWeek0, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.time.DayOfWeek");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.FRIDAY));
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.monthOfYear();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 1);
        long long7 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = property4.getAsText(locale8);
        org.joda.time.DurationField durationField10 = property4.getLeapDurationField();
        long long12 = durationField10.getValueAsLong((long) 16);
        long long14 = durationField10.getMillis((long) 1024);
        boolean boolean15 = locale0.equals((java.lang.Object) durationField10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "January" + "'", str9, "January");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 88473600000L + "'", long14 == 88473600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localTime1.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.io.File file4 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.PrintStream printStream5 = new java.io.PrintStream(file4);
        printStream5.print('a');
        printStream5.println(false);
        // The following exception was thrown during execution in test generation
        try {
            properties1.storeToXML((java.io.OutputStream) printStream5, "2022-02-21T09:34:02.096", "2022-02-21T09:33:58.303");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 2022-02-21T09:33:58.303");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.String[] strArray4 = new java.lang.String[] { "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z", "10", "Optional.empty", "2022-02-21T09:34:01.158" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        boolean boolean13 = languageRangeList11.contains((java.lang.Object) "");
        boolean boolean14 = languageRangeList11.isEmpty();
        boolean boolean16 = languageRangeList11.remove((java.lang.Object) 10L);
        boolean boolean17 = languageRangeList11.isEmpty();
        boolean boolean18 = strSet5.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList11.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange20 = languageRangeItor19.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeItor19);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        long long5 = zonedDateTime4.toEpochSecond();
        java.util.GregorianCalendar gregorianCalendar6 = java.util.GregorianCalendar.from(zonedDateTime4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime8 = zonedDateTime4.withDayOfMonth(256);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 256");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645436048L + "'", long5 == 1645436048L);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.time.LocalTime localTime0 = java.time.LocalTime.MAX;
        java.time.LocalTime localTime2 = localTime0.withMinute((int) (byte) 1);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.MONTH_OF_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime5 = localTime2.with((java.time.temporal.TemporalField) chronoField3, (long) 565000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 565000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.MONTH_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.MONTH_OF_YEAR));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.secondOfMinute();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar6 = new java.util.GregorianCalendar(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar6);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.plusMonths(10);
        int[] intArray14 = new int[] { 4096, 64, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = dateTimeField4.add((org.joda.time.ReadablePartial) yearMonthDay9, 96, intArray14, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[4096, 64, 97]");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.nio.charset.CodingErrorAction codingErrorAction0 = java.nio.charset.CodingErrorAction.IGNORE;
        java.lang.String str1 = codingErrorAction0.toString();
        org.junit.Assert.assertNotNull(codingErrorAction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IGNORE" + "'", str1, "IGNORE");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = dateTimeField22.getType();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "weekOfWeekyear" + "'", str24, "weekOfWeekyear");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar4 = new java.util.GregorianCalendar(locale3);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1, locale3);
        int int6 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645436048337,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=8,MILLISECOND=337,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.time.LocalDate localDate4 = localDateTime3.toLocalDate();
        java.time.chrono.ChronoLocalDate chronoLocalDate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate4.compareTo(chronoLocalDate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.Hashtable<java.util.function.LongConsumer, org.joda.time.Duration> longConsumerMap0 = new java.util.Hashtable<java.util.function.LongConsumer, org.joda.time.Duration>();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.net.URL uRL0 = null;
        java.net.URLStreamHandler uRLStreamHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL(uRL0, "Year", uRLStreamHandler2);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: Year");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        boolean boolean4 = interval3.containsNow();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.monthOfYear();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (short) 1);
        long long10 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight9.withField(dateTimeFieldType11, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight9.withZoneRetainFields(dateTimeZone14);
        boolean boolean16 = interval3.isBefore((org.joda.time.ReadableInstant) dateMidnight15);
        boolean boolean18 = interval3.isBefore((long) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Interval interval26 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone25);
        org.joda.time.Period period27 = interval26.toPeriod();
        boolean boolean28 = interval22.isBefore((org.joda.time.ReadableInterval) interval26);
        boolean boolean29 = interval22.isBeforeNow();
        org.joda.time.Duration duration30 = interval22.toDuration();
        org.joda.time.Duration duration32 = duration30.minus((long) 21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval33 = interval3.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration32);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.Buffer buffer3 = buffer2.flip();
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(buffer3);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = localDateTime6.withDayOfMonth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.time.Month month1 = java.time.Month.JANUARY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of((int) (short) -1, month1, 1024, 12, 20, 1970);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 1024");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.JANUARY + "'", month1.equals(java.time.Month.JANUARY));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.time.LocalDate localDate4 = localDateTime3.toLocalDate();
        java.time.LocalDateTime localDateTime6 = localDateTime3.plusDays((long) 'u');
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId7 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZoneId from TemporalAccessor: 2022-06-18T09:34:08 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.stream.DoubleStream doubleStream3 = longStream2.asDoubleStream();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((java.lang.Object) longStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.stream.LongPipeline$Head");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("2022-02-21T09:33:57.064", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = localDate14.atTime(28, 70);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 28");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.util.Date date2 = java.util.Date.from(instant1);
        java.time.Clock clock3 = java.time.Clock.systemUTC();
        java.time.Instant instant4 = clock3.instant();
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.ofInstant(instant4, (java.time.ZoneId) zoneOffset6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset6);
        java.time.LocalTime localTime9 = offsetDateTime8.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime11 = offsetDateTime8.withNano((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for NanoOfSecond (valid values 0 - 999999999): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 09:34:08 UTC 2022");
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        java.time.format.DateTimeFormatter dateTimeFormatter15 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format16 = dateTimeFormatter15.toFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDate14.format(dateTimeFormatter15);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: HourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(format16);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeZone0.getOffset(2022, 10, 1970, (int) 'u', 21, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setHourOfDay(96);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 96 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime4.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange13 = chronoField12.range();
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField12.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime16 = localDateTime10.plus((long) 4096, temporalUnit15);
        java.time.LocalDate localDate17 = localDateTime10.toLocalDate();
        long long18 = localDate17.toEpochDay();
        int int19 = localDate17.lengthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate21 = localDate17.minusWeeks(6603384152749567654L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: long overflow");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 19044L + "'", long18 == 19044L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 365 + "'", int19 == 365);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange2 = chronoField1.range();
        boolean boolean3 = isoEra0.isSupported((java.time.temporal.TemporalField) chronoField1);
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(locale4);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar5);
        java.time.Instant instant7 = gregorianCalendar5.toInstant();
        java.time.ZonedDateTime zonedDateTime8 = gregorianCalendar5.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime9 = zonedDateTime8.withEarlierOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.YEAR;
        java.lang.String str11 = chronoField10.toString();
        java.time.temporal.ValueRange valueRange12 = zonedDateTime9.range((java.time.temporal.TemporalField) chronoField10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = isoEra0.getLong((java.time.temporal.TemporalField) chronoField10);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Year" + "'", str11, "Year");
        org.junit.Assert.assertNotNull(valueRange12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.time.Period period1 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean3 = period1.equals((java.lang.Object) (-1));
        java.time.Period period5 = period1.plusMonths((long) 12);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now();
        boolean boolean8 = localDateTime6.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        java.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.now();
        boolean boolean13 = localDateTime11.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        boolean boolean14 = localDateTime10.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime16 = localDateTime10.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now();
        boolean boolean19 = localDateTime17.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        java.time.LocalDateTime localDateTime21 = localDateTime17.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.now();
        boolean boolean24 = localDateTime22.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        boolean boolean25 = localDateTime21.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        boolean boolean26 = localDateTime16.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange28 = chronoField27.range();
        java.time.temporal.TemporalUnit temporalUnit29 = chronoField27.getRangeUnit();
        boolean boolean30 = localDateTime23.isSupported(temporalUnit29);
        boolean boolean31 = temporalUnit29.isDurationEstimated();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = period1.get(temporalUnit29);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField27.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertTrue("'" + temporalUnit29 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit29.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer11 = charBuffer3.append('a');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar.Builder builder4 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        int int8 = timeZone6.getRawOffset();
        java.util.Calendar.Builder builder9 = builder4.setTimeZone(timeZone6);
        boolean boolean10 = timeZone1.hasSameRules(timeZone6);
        java.lang.Object obj11 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("-999999999 - 999999999", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        doubleStream0.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = doubleStream0.skip((long) 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        int int8 = charBuffer3.position();
        java.nio.CharBuffer charBuffer10 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer11 = charBuffer10.clear();
        java.nio.CharBuffer charBuffer12 = charBuffer10.duplicate();
        int int13 = charBuffer3.compareTo(charBuffer12);
        // The following exception was thrown during execution in test generation
        try {
            char char15 = charBuffer12.get(85800);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertNotNull(charBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod8.setYears((int) '#');
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod8.add(durationFieldType11, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) '4');
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2022-02-21T09:34:02.096", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = yearMonthDay2.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) 70);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.withDayOfYear(100);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withYearOfEra((int) (byte) 1);
        long long6 = dateMidnight3.getMillis();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8553600000L + "'", long6 == 8553600000L);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("2022-02-21T09:34:01.158", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Interval interval5 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Interval interval9 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone8);
        org.joda.time.Period period10 = interval9.toPeriod();
        boolean boolean11 = interval5.isBefore((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.monthOfYear();
        org.joda.time.Chronology chronology16 = dateMidnight14.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.halfdays();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(0L, chronology16);
        org.joda.time.Interval interval19 = interval9.withChronology(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(9, (int) (short) 100, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(interval19);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone4);
        mutableDateTime5.setDayOfYear(10);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setTime(1024, 0, (int) 'x', 96);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1024 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from(instant3);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.ofInstant(instant3, zoneId8);
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.minusDays(1645436047L);
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.now();
        boolean boolean15 = localDateTime13.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime14);
        java.time.LocalDateTime localDateTime17 = localDateTime13.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.now();
        boolean boolean20 = localDateTime18.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime19);
        boolean boolean21 = localDateTime17.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime19);
        java.time.LocalDateTime localDateTime23 = localDateTime17.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.now();
        boolean boolean26 = localDateTime24.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime25);
        java.time.LocalDateTime localDateTime28 = localDateTime24.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.now();
        boolean boolean31 = localDateTime29.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime30);
        boolean boolean32 = localDateTime28.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime30);
        boolean boolean33 = localDateTime23.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime30);
        java.time.temporal.ChronoField chronoField34 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange35 = chronoField34.range();
        java.time.temporal.TemporalUnit temporalUnit36 = chronoField34.getRangeUnit();
        boolean boolean37 = localDateTime30.isSupported(temporalUnit36);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime38 = offsetDateTime11.minus(1L, temporalUnit36);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(fileTime4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + chronoField34 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField34.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange35);
        org.junit.Assert.assertTrue("'" + temporalUnit36 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit36.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("P20Y-1M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plusMonths((int) '#');
        int int4 = dateMidnight3.getMinuteOfHour();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withMillis((long) (short) -1);
        long long7 = dateMidnight3.getMillis();
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale8.getDisplayScript();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        boolean boolean17 = languageRangeList15.contains((java.lang.Object) "");
        boolean boolean18 = languageRangeList15.isEmpty();
        boolean boolean20 = languageRangeList15.remove((java.lang.Object) 10L);
        boolean boolean21 = strSet10.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        int int22 = strSet10.size();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.monthOfYear();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (short) 1);
        long long28 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight27);
        boolean boolean29 = strSet10.contains((java.lang.Object) dateMidnight27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableInstant) dateMidnight27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 92016000000L + "'", long7 == 92016000000L);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.monthOfYear();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.years();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 0, chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((java.lang.Object) 100, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now();
        boolean boolean3 = localDateTime1.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateTimeFormatter0.format((java.time.temporal.TemporalAccessor) localDateTime1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(12, 97, 256);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Collection<java.util.Locale.LanguageRange> languageRangeCollection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = languageRangeList1.retainAll(languageRangeCollection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.List<java.nio.file.spi.FileSystemProvider> fileSystemProviderList0 = java.nio.file.spi.FileSystemProvider.installedProviders();
        org.junit.Assert.assertNotNull(fileSystemProviderList0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MICROSECONDS;
        long long2 = timeUnit0.toNanos((long) (byte) 0);
        long long4 = timeUnit0.toMinutes(8553600000L);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 142L + "'", long4 == 142L);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer10 = charBuffer3.append((java.lang.CharSequence) "10");
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period5);
        mutableDateTime0.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime0.minuteOfHour();
        mutableDateTime0.setMonthOfYear(1);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.stream.Stream<java.lang.Long> longStream3 = longStream2.boxed();
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.net.URI uRI1 = java.net.URI.create("January");
        java.net.URI uRI3 = java.net.URI.create("January");
        java.net.URI uRI4 = uRI1.relativize(uRI3);
        java.net.URI uRI6 = java.net.URI.create("January");
        java.net.URI uRI8 = java.net.URI.create("January");
        java.net.URI uRI9 = uRI6.relativize(uRI8);
        java.net.URI uRI10 = uRI4.relativize(uRI8);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file11 = new java.io.File(uRI4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URI is not absolute");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(uRI10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.Throwable throwable1 = null;
        java.security.SignatureException signatureException2 = new java.security.SignatureException("23:50:00.000000097", throwable1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MINUTE_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = chronoField0.checkValidValue(8553600000L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfDay (valid values 0 - 1439): 8553600000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.MINUTE_OF_DAY));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = java.time.Instant.now(clock0);
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MONTH_OF_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = instant1.get((java.time.temporal.TemporalField) chronoField2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MonthOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MONTH_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.MONTH_OF_YEAR));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHoursMinutesSeconds(28, 11, 64);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 28 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(1, 1024, 365, 72, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 72 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.time.format.DecimalStyle decimalStyle0 = java.time.format.DecimalStyle.STANDARD;
        java.time.format.DecimalStyle decimalStyle2 = decimalStyle0.withZeroDigit('a');
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        int int5 = dateMidnight4.getDayOfMonth();
        int int6 = dateMidnight4.getYearOfEra();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.withYear(8);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long11 = duration10.getStandardDays();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.time();
        org.joda.time.Period period14 = duration10.toPeriodTo(readableInstant12, periodType13);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone17);
        org.joda.time.Period period19 = interval18.toPeriod();
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = period19.get(durationFieldType20);
        org.joda.time.Period period22 = period19.toPeriod();
        org.joda.time.Hours hours23 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType24 = hours23.getFieldType();
        org.joda.time.DurationFieldType durationFieldType25 = hours23.getFieldType();
        int int26 = period19.indexOf(durationFieldType25);
        int int27 = period14.get(durationFieldType25);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight4.withFieldAdded(durationFieldType25, 21);
        boolean boolean30 = decimalStyle0.equals((java.lang.Object) dateMidnight4);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        java.lang.String str33 = localDateTime32.toString();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withDayOfYear((int) '4');
        org.joda.time.DateTime dateTime36 = localDateTime32.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) dateTime36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight39 = dateMidnight4.withWeekOfWeekyear(36000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalStyle0);
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2022-02-21T09:34:10.478" + "'", str33, "2022-02-21T09:34:10.478");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        boolean boolean18 = localDateTime16.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        java.time.LocalDateTime localDateTime20 = localDateTime16.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.now();
        boolean boolean23 = localDateTime21.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime22);
        boolean boolean24 = localDateTime20.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime22);
        java.time.LocalDateTime localDateTime26 = localDateTime20.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.now();
        boolean boolean29 = localDateTime27.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime28);
        java.time.LocalDateTime localDateTime31 = localDateTime27.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime32 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime33 = java.time.LocalDateTime.now();
        boolean boolean34 = localDateTime32.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime33);
        boolean boolean35 = localDateTime31.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime33);
        boolean boolean36 = localDateTime26.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime33);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange38 = chronoField37.range();
        java.time.temporal.TemporalUnit temporalUnit39 = chronoField37.getRangeUnit();
        boolean boolean40 = localDateTime33.isSupported(temporalUnit39);
        boolean boolean41 = temporalUnit39.isDurationEstimated();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal42 = zonedDateTime6.minus(125L, temporalUnit39);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField37.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange38);
        org.junit.Assert.assertTrue("'" + temporalUnit39 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit39.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        int int15 = property2.getMaximumValue();
        org.joda.time.TimeOfDay timeOfDay16 = property2.getTimeOfDay();
        java.lang.String str17 = property2.getName();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "minuteOfHour" + "'", str17, "minuteOfHour");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = java.time.LocalDate.ofYearDay(6, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 0, 365);
        org.joda.time.DateTime dateTime4 = instant0.toDateTime();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        int int4 = timeZone2.getRawOffset();
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone2);
        java.time.Clock clock6 = java.time.Clock.systemUTC();
        java.time.Instant instant7 = clock6.instant();
        java.util.Date date8 = java.util.Date.from(instant7);
        date8.setHours((int) (short) 10);
        java.util.Calendar.Builder builder11 = builder5.setInstant(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder14 = builder11.setWeekDefinition(2022, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Feb 21 10:34:10 UTC 2022");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.util.TimeZone timeZone4 = gregorianCalendar1.getTimeZone();
        java.lang.String str5 = timeZone4.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset6);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransition zoneOffsetTransition10 = java.time.zone.ZoneOffsetTransition.of(localDateTime4, zoneOffset6, zoneOffset9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offsets must not be equal");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(zoneOffset9);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone4);
        java.lang.String str6 = dateTimeZone4.toString();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Etc/UTC" + "'", str6, "Etc/UTC");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.time.Period period1 = java.time.Period.ofMonths((int) (byte) -1);
        java.time.Period period3 = period1.plusYears((long) 20);
        java.time.Period period5 = period3.withMonths(96);
        java.lang.String str6 = period3.toString();
        java.time.Period period8 = period3.minusYears((long) 70);
        java.util.Properties properties9 = null;
        java.util.Properties properties10 = new java.util.Properties(properties9);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale11.getDisplayScript();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap17);
        boolean boolean20 = languageRangeList18.contains((java.lang.Object) "");
        boolean boolean21 = languageRangeList18.isEmpty();
        boolean boolean23 = languageRangeList18.remove((java.lang.Object) 10L);
        boolean boolean24 = strSet13.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        int int25 = strSet13.size();
        java.time.Duration duration26 = java.time.Duration.ZERO;
        java.lang.Object obj27 = properties10.replace((java.lang.Object) int25, (java.lang.Object) duration26);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod28 = period8.minus((java.time.temporal.TemporalAmount) duration26);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P20Y-1M" + "'", str6, "P20Y-1M");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.years();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 0, chronology7);
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar11 = new java.util.GregorianCalendar(locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 32, chronology7, locale10);
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) 11, (long) (short) 100, chronology7);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod24.setYears(100);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long29 = duration28.getStandardDays();
        mutablePeriod24.setPeriod((org.joda.time.ReadableDuration) duration28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime15.plus((org.joda.time.ReadableDuration) duration28);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval13.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.plusMonths(10);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 1);
        int int7 = dateMidnight6.getDayOfMonth();
        int int8 = dateMidnight6.getYearOfEra();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.withYear(8);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long13 = duration12.getStandardDays();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.time();
        org.joda.time.Period period16 = duration12.toPeriodTo(readableInstant14, periodType15);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Interval interval20 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone19);
        org.joda.time.Period period21 = interval20.toPeriod();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = period21.get(durationFieldType22);
        org.joda.time.Period period24 = period21.toPeriod();
        org.joda.time.Hours hours25 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType26 = hours25.getFieldType();
        org.joda.time.DurationFieldType durationFieldType27 = hours25.getFieldType();
        int int28 = period21.indexOf(durationFieldType27);
        int int29 = period16.get(durationFieldType27);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight6.withFieldAdded(durationFieldType27, 21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay2.withFieldAdded(durationFieldType27, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateMidnight31);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getMonthOfYear();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        java.lang.String str4 = localDate0.toString("10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.security.KeyException keyException0 = new java.security.KeyException();
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.junit.Assert.assertNotNull(weeks0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.io.File file6 = new java.io.File(file4, "T00:00:00.032");
        boolean boolean8 = file6.setWritable(true);
        boolean boolean9 = file6.exists();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.getParent(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064/T00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        java.util.Calendar.Builder builder4 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        int int8 = timeZone6.getRawOffset();
        java.util.Calendar.Builder builder9 = builder4.setTimeZone(timeZone6);
        java.time.Clock clock10 = java.time.Clock.systemUTC();
        java.time.Instant instant11 = clock10.instant();
        java.util.Date date12 = java.util.Date.from(instant11);
        date12.setHours((int) (short) 10);
        java.util.Calendar.Builder builder15 = builder9.setInstant(date12);
        date12.setDate(32);
        boolean boolean18 = timeZone0.inDaylightTime(date12);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(clock10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 04 10:34:11 UTC 2022");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.Optional<java.nio.CharBuffer> charBufferOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(charBufferOptional0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        java.util.Locale locale4 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap5 = gregorianCalendar1.getDisplayNames(0, 8, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.parse((java.lang.CharSequence) "weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'weekOfWeekyear' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        int int4 = timeZone2.getRawOffset();
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone2);
        java.time.Clock clock6 = java.time.Clock.systemUTC();
        java.time.Instant instant7 = clock6.instant();
        java.util.Date date8 = java.util.Date.from(instant7);
        date8.setHours((int) (short) 10);
        java.util.Calendar.Builder builder11 = builder5.setInstant(date8);
        java.util.Calendar.Builder builder13 = builder11.setInstant(125L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder18 = builder11.setTimeOfDay(20, 365, 11, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Feb 21 10:34:11 UTC 2022");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        java.util.GregorianCalendar gregorianCalendar14 = new java.util.GregorianCalendar(locale10);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.monthOfYear();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) locale10, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        char char0 = java.io.File.pathSeparatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ':' + "'", char0 == ':');
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate(3);
        java.nio.LongBuffer longBuffer2 = longBuffer1.duplicate();
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.allocate(3);
        java.nio.LongBuffer longBuffer5 = longBuffer4.duplicate();
        int int6 = longBuffer1.compareTo(longBuffer5);
        boolean boolean7 = longBuffer5.hasArray();
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.time.LocalTime localTime4 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean10 = localTime4.equals((java.lang.Object) languageRangeList6);
        java.time.LocalTime localTime12 = localTime4.minusMinutes((long) (short) 10);
        java.lang.String str13 = localTime12.toString();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar15 = new java.util.GregorianCalendar(locale14);
        org.joda.time.YearMonthDay yearMonthDay16 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar15);
        java.time.Instant instant17 = gregorianCalendar15.toInstant();
        java.time.ZonedDateTime zonedDateTime18 = gregorianCalendar15.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime20 = zonedDateTime18.plusSeconds((long) 5);
        java.time.Period period22 = java.time.Period.ofMonths((int) (byte) -1);
        java.time.temporal.Temporal temporal23 = zonedDateTime20.minus((java.time.temporal.TemporalAmount) period22);
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.now();
        boolean boolean26 = localDateTime24.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime25);
        java.time.LocalDateTime localDateTime28 = localDateTime24.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.now();
        boolean boolean31 = localDateTime29.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime30);
        boolean boolean32 = localDateTime28.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime30);
        java.time.LocalDateTime localDateTime34 = localDateTime28.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.now();
        boolean boolean37 = localDateTime35.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime36);
        java.time.LocalDateTime localDateTime39 = localDateTime35.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime40 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime41 = java.time.LocalDateTime.now();
        boolean boolean42 = localDateTime40.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime41);
        boolean boolean43 = localDateTime39.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime41);
        boolean boolean44 = localDateTime34.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime41);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange46 = chronoField45.range();
        java.time.temporal.TemporalUnit temporalUnit47 = chronoField45.getRangeUnit();
        boolean boolean48 = localDateTime41.isSupported(temporalUnit47);
        boolean boolean49 = temporalUnit47.isDurationEstimated();
        // The following exception was thrown during execution in test generation
        try {
            long long50 = localTime12.until((java.time.temporal.Temporal) zonedDateTime20, temporalUnit47);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23:50:00.000000097" + "'", str13, "23:50:00.000000097");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(temporal23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField45.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange46);
        org.junit.Assert.assertTrue("'" + temporalUnit47 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit47.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        int int15 = property2.getMaximumValue();
        org.joda.time.TimeOfDay timeOfDay16 = property2.getTimeOfDay();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.days();
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long20 = duration19.getStandardDays();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long23 = duration22.getStandardDays();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property33 = dateTime32.hourOfDay();
        org.joda.time.DateTime dateTime34 = property33.roundFloorCopy();
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime34, periodType35);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod46.setYears((int) '#');
        mutablePeriod37.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod46);
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property54 = dateMidnight53.monthOfYear();
        org.joda.time.Chronology chronology55 = dateMidnight53.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.days();
        mutablePeriod46.setPeriod((long) 3, (long) 9, chronology55);
        boolean boolean58 = durationFieldType17.isSupported(chronology55);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay60 = timeOfDay16.withFieldAdded(durationFieldType17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.net.FileNameMap fileNameMap0 = java.net.URLConnection.getFileNameMap();
        java.lang.String str2 = fileNameMap0.getContentTypeFor("January");
        org.junit.Assert.assertNotNull(fileNameMap0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.time.Period period1 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean3 = period1.equals((java.lang.Object) (-1));
        java.time.Period period5 = period1.plusMonths((long) 12);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long8 = duration7.getStandardDays();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property18 = dateTime17.hourOfDay();
        org.joda.time.DateTime dateTime19 = property18.roundFloorCopy();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) dateTime19, periodType20);
        org.joda.time.PeriodType periodType22 = periodType20.withMonthsRemoved();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property26 = dateMidnight25.monthOfYear();
        org.joda.time.Chronology chronology27 = dateMidnight25.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.halfdays();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(0L, chronology27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((java.lang.Object) period1, periodType20, chronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.YEAR;
        java.lang.String str7 = chronoField6.toString();
        java.time.temporal.ValueRange valueRange8 = zonedDateTime5.range((java.time.temporal.TemporalField) chronoField6);
        boolean boolean10 = valueRange8.isValidValue((long) 3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField6.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Year" + "'", str7, "Year");
        org.junit.Assert.assertNotNull(valueRange8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        org.joda.time.TimeOfDay timeOfDay14 = property2.getTimeOfDay();
        int int15 = property2.getMaximumValue();
        int int16 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 59 + "'", int16 == 59);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.DoubleSummaryStatistics doubleSummaryStatistics1 = doubleStream0.summaryStatistics();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble2 = doubleStream0.max();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleSummaryStatistics1);
        org.junit.Assert.assertEquals(doubleSummaryStatistics1.toString(), "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.security.AccessControlException accessControlException1 = new java.security.AccessControlException("2022-02-21T09:34:07.194");
        java.security.Permission permission2 = accessControlException1.getPermission();
        org.junit.Assert.assertNull(permission2);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Days days1 = hours0.toStandardDays();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("19:34:11.279", "0", 12, "java.text.AttributedCharacterIterator$Attribute(language)");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: 19:34:11.279");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(2, 565000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 565000000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 0);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(59);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod17.setYears(100);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long22 = duration21.getStandardDays();
        mutablePeriod17.setPeriod((org.joda.time.ReadableDuration) duration21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime8.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime8.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property28 = localDateTime8.property(dateTimeFieldType27);
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        java.util.Locale locale31 = java.util.Locale.UK;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.lang.String str33 = dateTimeField29.getAsText((long) ' ', locale31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = localTime5.toString("Optional.empty", locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        java.lang.String str2 = localDateTime1.toString();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusMinutes(9);
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.minusMonths((int) 'x');
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T09:34:11.918" + "'", str2, "2022-02-21T09:34:11.918");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("P35Y100MT32H97M97.001S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: P35Y100MT32H97M97.001S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.stream.DoubleStream doubleStream0 = null;
        java.util.stream.LongStream longStream3 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.stream.DoubleStream doubleStream4 = longStream3.asDoubleStream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.concat(doubleStream0, doubleStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getMonthOfYear();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate4 = property2.addWrapFieldToCopy(7);
        int int5 = localDate4.getCenturyOfEra();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        boolean boolean3 = file2.setReadOnly();
        long long4 = file2.length();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 13L + "'", long4 == 13L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        java.util.GregorianCalendar gregorianCalendar14 = new java.util.GregorianCalendar(locale10);
        java.lang.String str15 = gregorianCalendar14.toString();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.util.GregorianCalendar[time=1645436052229,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=12,MILLISECOND=229,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str15, "java.util.GregorianCalendar[time=1645436052229,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=12,MILLISECOND=229,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        long long5 = zonedDateTime4.toEpochSecond();
        java.util.GregorianCalendar gregorianCalendar6 = java.util.GregorianCalendar.from(zonedDateTime4);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.monthOfYear();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (short) 1);
        long long12 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight11);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        int int14 = property9.getMaximumTextLength(locale13);
        int int15 = property9.getMaximumValue();
        boolean boolean16 = property9.isLeap();
        boolean boolean17 = gregorianCalendar6.equals((java.lang.Object) boolean16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645436052L + "'", long5 == 1645436052L);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.stream.DoubleStream doubleStream3 = longStream2.asDoubleStream();
        java.util.function.LongBinaryOperator longBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = longStream2.reduce(8640000000L, longBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.time.Instant instant0 = java.time.Instant.MAX;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = instant0.toEpochMilli();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: long overflow");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.FRIDAY;
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.FRIDAY));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.of("Coordinated Universal Time", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: aliasMap");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.io.File file7 = new java.io.File("2022-02-21T09:33:57.064", "");
        boolean boolean8 = file2.renameTo(file7);
        java.io.File file9 = file7.getAbsoluteFile();
        java.nio.file.Path path10 = file7.toPath();
        boolean boolean11 = file7.createNewFile();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(file9);
// flaky:         org.junit.Assert.assertEquals(file9.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file9.toString(), "/experiment/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime4.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange13 = chronoField12.range();
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField12.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime16 = localDateTime10.plus((long) 4096, temporalUnit15);
        java.time.LocalDate localDate17 = localDateTime10.toLocalDate();
        long long18 = localDate17.toEpochDay();
        int int19 = localDate17.lengthOfYear();
        java.time.chrono.Era era20 = localDate17.getEra();
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.YEAR;
        java.lang.String str22 = chronoField21.toString();
        boolean boolean23 = localDate17.isSupported((java.time.temporal.TemporalField) chronoField21);
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar25 = new java.util.GregorianCalendar(locale24);
        org.joda.time.YearMonthDay yearMonthDay26 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar25);
        java.time.Instant instant27 = gregorianCalendar25.toInstant();
        java.nio.file.attribute.FileTime fileTime28 = java.nio.file.attribute.FileTime.from(instant27);
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        boolean boolean31 = timeZone29.hasSameRules(timeZone30);
        java.time.ZoneId zoneId32 = timeZone29.toZoneId();
        java.time.OffsetDateTime offsetDateTime33 = java.time.OffsetDateTime.ofInstant(instant27, zoneId32);
        java.time.OffsetDateTime offsetDateTime35 = offsetDateTime33.minusDays(1645436047L);
        java.time.OffsetDateTime offsetDateTime37 = offsetDateTime35.minusYears(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate38 = localDate17.with((java.time.temporal.TemporalAdjuster) offsetDateTime37);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 19044L + "'", long18 == 19044L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 365 + "'", int19 == 365);
        org.junit.Assert.assertTrue("'" + era20 + "' != '" + java.time.chrono.IsoEra.CE + "'", era20.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Year" + "'", str22, "Year");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(fileTime28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(offsetDateTime37);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone2);
        org.joda.time.Period period4 = interval3.toPeriod();
        org.joda.time.MutableInterval mutableInterval6 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean8 = mutableInterval6.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone11);
        org.joda.time.Period period13 = interval12.toPeriod();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = period13.get(durationFieldType14);
        org.joda.time.Period period16 = period13.toPeriod();
        mutableInterval6.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period18 = mutableInterval6.toPeriod();
        org.joda.time.Interval interval19 = interval3.gap((org.joda.time.ReadableInterval) mutableInterval6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = interval19.containsNow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNull(interval19);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.util.Date date2 = java.util.Date.from(instant1);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.NANO_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant5 = instant1.with((java.time.temporal.TemporalField) chronoField3, (long) 4096);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 09:34:12 UTC 2022");
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.util.Date date2 = java.util.Date.from(instant1);
        date2.setHours((int) (short) 10);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localDate5.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        int int9 = localDate5.getEra();
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 10:34:12 UTC 2022");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        double double4 = byteBuffer1.getDouble(72);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        java.net.InetAddress inetAddress11 = java.net.InetAddress.getByAddress("Optional.empty", byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer1.get(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(inetAddress11);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (byte) 100, 32, 1024, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.LocalDateTime localDateTime3 = localDateTime0.withNano(0);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone8);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime20 = property19.roundFloorCopy();
        org.joda.time.DateTime.Property property21 = dateTime20.centuryOfEra();
        int int22 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) 0, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("23:50:00.000000097");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"23:50:00.000000097\" is malformed at \":50:00.000000097\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("PT0S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=pt0s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.halfdays();
        int int7 = durationField4.getDifference((long) 96, (long) (-1));
        long long10 = durationField4.subtract((long) 35, (long) 565000000);
        long long12 = durationField4.getValueAsLong((-999999999L));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-24407999999999965L) + "'", long10 == (-24407999999999965L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-23L) + "'", long12 == (-23L));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.halfdays();
        int int7 = durationField4.getDifference((long) 96, (long) (-1));
        long long8 = durationField4.getUnitMillis();
        long long11 = durationField4.add((long) ' ', 92016000000L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 43200000L + "'", long8 == 43200000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3975091200000000032L + "'", long11 == 3975091200000000032L);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType1 = periodType0.withMillisRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMillisRemoved();
        java.lang.String str3 = periodType2.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PeriodType[Months]" + "'", str3, "PeriodType[Months]");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("19:34:11.279", "-999999999 - 999999999", (int) (short) 0, "2022-02-21T09:34:04.525");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: 19:34:11.279");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.OptionalLong optionalLong3 = longStream2.max();
        java.util.stream.LongStream longStream4 = longStream2.parallel();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalLong optionalLong5 = longStream2.max();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.time.LocalTime localTime4 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean10 = localTime4.equals((java.lang.Object) languageRangeList6);
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.now();
        boolean boolean14 = localDateTime12.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime13);
        java.time.LocalDateTime localDateTime16 = localDateTime12.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now();
        boolean boolean19 = localDateTime17.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        boolean boolean20 = localDateTime16.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        java.time.LocalDateTime localDateTime22 = localDateTime16.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.now();
        boolean boolean25 = localDateTime23.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime24);
        java.time.LocalDateTime localDateTime27 = localDateTime23.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.now();
        boolean boolean30 = localDateTime28.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime29);
        boolean boolean31 = localDateTime27.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime29);
        boolean boolean32 = localDateTime22.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime29);
        java.time.temporal.ChronoField chronoField33 = java.time.temporal.ChronoField.YEAR;
        boolean boolean34 = localDateTime22.isSupported((java.time.temporal.TemporalField) chronoField33);
        java.time.temporal.TemporalUnit temporalUnit35 = chronoField33.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal36 = localTime4.plus((long) 9, temporalUnit35);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + chronoField33 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField33.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + temporalUnit35 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit35.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.ZonedDateTime zonedDateTime3 = gregorianCalendar1.toZonedDateTime();
        java.time.DayOfWeek dayOfWeek4 = zonedDateTime3.getDayOfWeek();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.NANO_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = zonedDateTime3.get((java.time.temporal.TemporalField) chronoField5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Invalid field 'NanoOfDay' for get() method, use getLong() instead");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + dayOfWeek4 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek4.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of(12, (int) (short) -1, 0, 21, 2022, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset1);
        java.time.OffsetTime offsetTime4 = offsetTime2.plusNanos(125L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime6 = offsetTime2.withMinute(4096);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 4096");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime4);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        int int15 = localDate14.lengthOfMonth();
        java.time.LocalTime localTime20 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.time.LocalDateTime localDateTime21 = localDate14.atTime(localTime20);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime23 = localTime20.withHour(70);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 70");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime4.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.now();
        boolean boolean13 = localDateTime11.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime15 = localDateTime11.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        boolean boolean18 = localDateTime16.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        boolean boolean19 = localDateTime15.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        boolean boolean20 = localDateTime10.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.ZonedDateTime zonedDateTime25 = java.time.ZonedDateTime.ofStrict(localDateTime10, zoneOffset22, (java.time.ZoneId) zoneOffset24);
        java.time.OffsetTime offsetTime26 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset24);
        java.time.chrono.IsoEra isoEra27 = java.time.chrono.IsoEra.CE;
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange29 = chronoField28.range();
        boolean boolean30 = isoEra27.isSupported((java.time.temporal.TemporalField) chronoField28);
        boolean boolean31 = chronoField28.isDateBased();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = zoneOffset24.getLong((java.time.temporal.TemporalField) chronoField28);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertTrue("'" + isoEra27 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra27.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField28.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = yearMonthDay2.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField6 = yearMonthDay2.getField((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay2.monthOfYear();
        int int8 = yearMonthDay2.getMonthOfYear();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.time.Month month0 = java.time.Month.JANUARY;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.YEAR;
        java.lang.String str2 = chronoField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = month0.get((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JANUARY + "'", month0.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Year" + "'", str2, "Year");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.nio.file.Path path5 = file2.toPath();
        java.io.File file8 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file10 = new java.io.File(file8, "2022-02-21T09:33:57.064");
        java.nio.file.Path path11 = file8.toPath();
        int int12 = path5.compareTo(path11);
        java.nio.file.Path path13 = path5.getFileName();
        java.nio.file.WatchService watchService14 = null;
        java.nio.file.WatchEvent.Kind<?> wildcardKind15 = null;
        java.nio.file.WatchEvent.Kind[] kindArray17 = new java.nio.file.WatchEvent.Kind[1];
        @SuppressWarnings("unchecked")
        java.nio.file.WatchEvent.Kind<?>[] wildcardKindArray18 = (java.nio.file.WatchEvent.Kind<?>[]) kindArray17;
        wildcardKindArray18[0] = wildcardKind15;
        java.nio.file.WatchEvent.Modifier modifier21 = null;
        java.nio.file.WatchEvent.Modifier[] modifierArray22 = new java.nio.file.WatchEvent.Modifier[] { modifier21 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.WatchKey watchKey23 = path13.register(watchService14, wildcardKindArray18, modifierArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(path13);
        org.junit.Assert.assertNotNull(kindArray17);
        org.junit.Assert.assertNotNull(wildcardKindArray18);
        org.junit.Assert.assertNotNull(modifierArray22);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        double double4 = byteBuffer1.getDouble(72);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putInt(9);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.time.Duration duration1 = java.time.Duration.ofHours(0L);
        java.time.Duration duration3 = java.time.Duration.ofHours(0L);
        int int4 = duration1.compareTo(duration3);
        java.time.Duration duration6 = duration1.minusMinutes((long) 'a');
        long long7 = duration1.toMinutes();
        int int8 = duration1.getNano();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.time.LocalTime localTime0 = java.time.LocalTime.MIN;
        java.time.LocalTime localTime2 = localTime0.minusHours((long) '4');
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.YEAR;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime5 = localTime0.with((java.time.temporal.TemporalField) chronoField3, (long) 13);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.YEAR));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.nio.file.Path path5 = file2.toPath();
        java.io.File file8 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file10 = new java.io.File(file8, "2022-02-21T09:33:57.064");
        java.nio.file.Path path11 = file8.toPath();
        int int12 = path5.compareTo(path11);
        java.nio.file.Path path13 = path5.getFileName();
        java.nio.file.Path path14 = path5.normalize();
        java.nio.file.OpenOption openOption15 = null;
        java.nio.file.OpenOption[] openOptionArray16 = new java.nio.file.OpenOption[] { openOption15 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.FileChannel fileChannel17 = java.nio.channels.FileChannel.open(path14, openOptionArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(path13);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNotNull(openOptionArray16);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        java.time.ZoneId zoneId6 = timeZone3.toZoneId();
        java.time.ZonedDateTime zonedDateTime7 = localDateTime0.atZone(zoneId6);
        java.time.chrono.Chronology chronology8 = localDateTime0.getChronology();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime10 = localDateTime9.toLocalTime();
        java.time.LocalDateTime localDateTime12 = localDateTime9.withNano(0);
        java.time.Duration duration14 = java.time.Duration.ofHours(0L);
        java.time.Duration duration16 = java.time.Duration.ofHours(0L);
        int int17 = duration14.compareTo(duration16);
        java.time.Duration duration19 = duration14.minusMinutes((long) 'a');
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList20 = duration14.getUnits();
        java.time.temporal.Temporal temporal21 = localDateTime12.plus((java.time.temporal.TemporalAmount) duration14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime22 = chronology8.zonedDateTime((java.time.temporal.TemporalAccessor) temporal21);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 2022-02-21T09:34:14 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(temporalUnitList20);
        org.junit.Assert.assertNotNull(temporal21);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format2 = dateTimeFormatter1.toFormat();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange4 = chronoField3.range();
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField3.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField3.getBaseUnit();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange9 = chronoField8.range();
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange11 = chronoField10.range();
        java.time.temporal.TemporalUnit temporalUnit12 = chronoField10.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit13 = chronoField10.getBaseUnit();
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange15 = chronoField14.range();
        java.time.temporal.TemporalUnit temporalUnit16 = chronoField14.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField14.getBaseUnit();
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        boolean boolean19 = chronoField18.isTimeBased();
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray23 = new java.time.temporal.TemporalField[] { chronoField3, chronoField7, chronoField8, chronoField10, chronoField14, chronoField18, chronoField20, chronoField21, chronoField22 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet24 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet24, temporalFieldArray23);
        java.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter1.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet24);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.parse((java.lang.CharSequence) "Year", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Year' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(format2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange4);
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField8.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange11);
        org.junit.Assert.assertTrue("'" + temporalUnit12 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit12.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit13 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit13.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField14.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange15);
        org.junit.Assert.assertTrue("'" + temporalUnit16 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit16.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY + "'", chronoField21.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField22.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(64);
        org.junit.Assert.assertNotNull(shortBuffer1);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        org.joda.time.Hours hours3 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours4 = hours0.plus(hours3);
        org.joda.time.Hours hours6 = hours0.minus((int) (byte) 1);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        boolean boolean3 = gregorianCalendar1.before((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = gregorianCalendar1.isSet(72);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.nio.file.Path path5 = file2.toPath();
        java.nio.file.OpenOption openOption6 = null;
        java.nio.file.OpenOption[] openOptionArray7 = new java.nio.file.OpenOption[] { openOption6 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.AsynchronousFileChannel asynchronousFileChannel8 = java.nio.channels.AsynchronousFileChannel.open(path5, openOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(openOptionArray7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withChronology(chronology7);
        org.joda.time.DateMidnight dateMidnight9 = dateTime6.toDateMidnight();
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        double double4 = byteBuffer1.getDouble(72);
        java.nio.FloatBuffer floatBuffer5 = byteBuffer1.asFloatBuffer();
        java.nio.FloatBuffer floatBuffer6 = floatBuffer5.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            float float8 = floatBuffer5.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(floatBuffer5);
        org.junit.Assert.assertNotNull(floatBuffer6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.time.Instant instant0 = java.time.Instant.now();
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.DoubleSummaryStatistics doubleSummaryStatistics1 = doubleStream0.summaryStatistics();
        java.lang.String str2 = doubleSummaryStatistics1.toString();
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleSummaryStatistics1);
        org.junit.Assert.assertEquals(doubleSummaryStatistics1.toString(), "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}" + "'", str2, "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.YEAR;
        java.lang.String str7 = chronoField6.toString();
        java.time.temporal.ValueRange valueRange8 = zonedDateTime5.range((java.time.temporal.TemporalField) chronoField6);
        boolean boolean9 = valueRange8.isIntValue();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField6.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Year" + "'", str7, "Year");
        org.junit.Assert.assertNotNull(valueRange8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.LANGUAGE;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(locale1);
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay3.plusMonths(10);
        boolean boolean6 = attribute0.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(attribute0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME;
        java.nio.CharBuffer charBuffer2 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer3 = charBuffer2.clear();
        java.nio.CharBuffer charBuffer4 = charBuffer2.duplicate();
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer7 = charBuffer6.clear();
        int int8 = charBuffer4.compareTo(charBuffer6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor9 = dateTimeFormatter0.parse((java.lang.CharSequence) charBuffer6);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Optional.empty' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(charBuffer2);
        org.junit.Assert.assertNotNull(buffer3);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.nio.file.Path path5 = file2.toPath();
        java.io.File file8 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file10 = new java.io.File(file8, "2022-02-21T09:33:57.064");
        java.nio.file.Path path11 = file8.toPath();
        int int12 = path5.compareTo(path11);
        java.nio.file.OpenOption openOption13 = null;
        java.nio.file.OpenOption[] openOptionArray14 = new java.nio.file.OpenOption[] { openOption13 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.AsynchronousFileChannel asynchronousFileChannel15 = java.nio.channels.AsynchronousFileChannel.open(path5, openOptionArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file10.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(path11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(openOptionArray14);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        long long24 = dateTimeField22.roundHalfFloor((long) (short) 100);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property27 = dateMidnight26.monthOfYear();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (short) 1);
        long long30 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight29);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        int int32 = property27.getMaximumTextLength(locale31);
        java.util.Locale.setDefault(locale31);
        int int34 = dateTimeField22.getMaximumShortTextLength(locale31);
        java.lang.String str35 = dateTimeField22.toString();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-259200000L) + "'", long24 == (-259200000L));
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str35, "DateTimeField[weekOfWeekyear]");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.LongStream longStream10 = intStream9.asLongStream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = intStream9.distinct();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = dateTimeField22.getType();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.lang.String str26 = dateTimeField22.getAsText((long) 21, locale25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale30.getDisplayScript();
        java.lang.String str32 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) localDateTime28, 0, locale30);
        int int33 = localDateTime28.getMillisOfSecond();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1" + "'", str26, "1");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 403 + "'", int33 == 403);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = java.time.Instant.parse((java.lang.CharSequence) "Year");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Year' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(256);
        boolean boolean2 = intBuffer1.isDirect();
        int[] intArray3 = intBuffer1.array();
        int int5 = intBuffer1.get(70);
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod8.setYears((int) '#');
        mutablePeriod8.addSeconds(1);
        mutablePeriod8.addSeconds(100);
        org.joda.time.MutableInterval mutableInterval16 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        mutableInterval16.setEndMillis((long) 4096);
        org.joda.time.Duration duration19 = mutableInterval16.toDuration();
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration19);
        org.joda.time.format.PeriodFormatter periodFormatter21 = null;
        java.lang.String str22 = mutablePeriod8.toString(periodFormatter21);
        java.util.Optional<org.joda.time.ReadWritablePeriod> readWritablePeriodOptional23 = java.util.Optional.ofNullable((org.joda.time.ReadWritablePeriod) mutablePeriod8);
        org.junit.Assert.assertNotNull(mutableInterval16);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT4.096S" + "'", str22, "PT4.096S");
        org.junit.Assert.assertNotNull(readWritablePeriodOptional23);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from(instant3);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.ofInstant(instant3, zoneId8);
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.of(4096, 10, (int) (byte) 1, 0, 32, (int) '4');
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange18 = chronoField17.range();
        java.time.temporal.TemporalUnit temporalUnit19 = chronoField17.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit20 = chronoField17.getBaseUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = offsetDateTime9.until((java.time.temporal.Temporal) localDateTime16, temporalUnit20);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: 4096-10-01T00:32:52 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(fileTime4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField17.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange18);
        org.junit.Assert.assertTrue("'" + temporalUnit19 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit19.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit20 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit20.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) 14, 32L);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2022);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        double double4 = byteBuffer1.getDouble(72);
        java.nio.FloatBuffer floatBuffer5 = byteBuffer1.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray6 = floatBuffer5.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(floatBuffer5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(locale1);
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar2);
        java.time.Instant instant4 = gregorianCalendar2.toInstant();
        java.time.ZonedDateTime zonedDateTime5 = gregorianCalendar2.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime5.plusSeconds((long) 5);
        java.time.LocalTime localTime8 = zonedDateTime7.toLocalTime();
        java.time.DayOfWeek dayOfWeek9 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange11 = chronoField10.range();
        boolean boolean12 = chronoField10.isDateBased();
        boolean boolean13 = dayOfWeek9.isSupported((java.time.temporal.TemporalField) chronoField10);
        boolean boolean14 = zonedDateTime7.isSupported((java.time.temporal.TemporalField) chronoField10);
        java.time.LocalTime localTime19 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, strMap23);
        boolean boolean25 = localTime19.equals((java.lang.Object) languageRangeList21);
        boolean boolean26 = chronoField10.isSupportedBy((java.time.temporal.TemporalAccessor) localTime19);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange27 = isoEra0.range((java.time.temporal.TemporalField) chronoField10);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + dayOfWeek9 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek9.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.time.LocalTime localTime4 = java.time.LocalTime.of(0, 0, 0, (int) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean10 = localTime4.equals((java.lang.Object) languageRangeList6);
        java.time.LocalTime localTime12 = localTime4.minusMinutes((long) (short) 10);
        int int13 = localTime12.getNano();
        java.time.LocalTime localTime15 = localTime12.plusMinutes((-86399965L));
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.PrintStream printStream3 = new java.io.PrintStream(file2);
        printStream3.print('a');
        printStream3.println(false);
        char[] charArray13 = new char[] { 'a', '\uffff', '\uffff', 'x', ' ' };
        printStream3.print(charArray13);
        printStream3.write(1);
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        java.net.InetAddress inetAddress23 = java.net.InetAddress.getByAddress("Optional.empty", byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            printStream3.write(byteArray22, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertNotNull(charArray13);
// flaky:         org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\uffff\uffffx ");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "\uffff\uffff, x,  ]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(inetAddress23);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.io.File file2 = new java.io.File("2022-02-21T09:33:57.064", "");
        java.io.File file4 = new java.io.File(file2, "2022-02-21T09:33:57.064");
        java.io.File file6 = new java.io.File(file4, "T00:00:00.032");
        boolean boolean8 = file6.setWritable(true);
        file6.deleteOnExit();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.getParent(), "2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file4.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.getParent(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064");
        org.junit.Assert.assertEquals(file6.toString(), "2022-02-21T09:33:57.064/2022-02-21T09:33:57.064/T00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.PrimitiveIterator.OfDouble ofDouble2 = doubleStream1.iterator();
        java.util.stream.DoubleStream doubleStream3 = doubleStream1.unordered();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) doubleStream1, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.stream.ReferencePipeline$6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(ofDouble2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar8 = new java.util.GregorianCalendar(locale7);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar8);
        java.time.Instant instant10 = gregorianCalendar8.toInstant();
        java.util.TimeZone timeZone11 = gregorianCalendar8.getTimeZone();
        java.time.ZoneId zoneId12 = timeZone11.toZoneId();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime13 = java.time.ZonedDateTime.of((int) ' ', 32769, 16384, (int) (short) 0, 7, (int) (short) 10, 32769, zoneId12);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32769");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId12);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        boolean boolean11 = languageRangeList9.contains((java.lang.Object) "");
        boolean boolean12 = languageRangeList9.isEmpty();
        boolean boolean14 = languageRangeList9.remove((java.lang.Object) 10L);
        boolean boolean15 = strSet4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        int int16 = strSet4.size();
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.lang.Object obj18 = properties1.replace((java.lang.Object) int16, (java.lang.Object) duration17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now();
        mutableDateTime19.setWeekyear(0);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar23 = new java.util.GregorianCalendar(locale22);
        org.joda.time.YearMonthDay yearMonthDay24 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay24.toDateMidnight(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField28 = yearMonthDay24.getField((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = yearMonthDay24.toDateMidnight(dateTimeZone29);
        java.lang.Object obj31 = properties1.getOrDefault((java.lang.Object) 0, (java.lang.Object) dateMidnight30);
        java.util.Enumeration<java.lang.Object> objEnumeration32 = properties1.keys();
        java.lang.Object obj33 = properties1.clone();
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        java.net.InetAddress inetAddress40 = java.net.InetAddress.getByAddress("Optional.empty", byteArray39);
        boolean boolean41 = inetAddress40.isSiteLocalAddress();
        boolean boolean42 = inetAddress40.isAnyLocalAddress();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone46 = java.util.TimeZone.getDefault();
        boolean boolean47 = timeZone45.hasSameRules(timeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) 11, dateTimeZone48);
        java.lang.Object obj51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = properties1.replace((java.lang.Object) inetAddress40, (java.lang.Object) localDate50, obj51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(objEnumeration32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "{}");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(inetAddress40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTimeZone48);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.Object obj0 = null;
        java.util.function.Predicate<java.util.function.Predicate<java.lang.Enum<java.time.DayOfWeek>>> dayOfWeekEnumPredicatePredicate1 = java.util.function.Predicate.isEqual(obj0);
        org.junit.Assert.assertNotNull(dayOfWeekEnumPredicatePredicate1);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime4.minusNanos((long) 2022);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange13 = chronoField12.range();
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField12.getBaseUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime16 = localDateTime10.plus((long) 4096, temporalUnit15);
        java.time.LocalDate localDate17 = localDateTime10.toLocalDate();
        java.lang.String str18 = localDate17.toString();
        java.time.Clock clock19 = java.time.Clock.systemUTC();
        java.time.Instant instant20 = clock19.instant();
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.now(clock19);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate22 = localDate17.with((java.time.temporal.TemporalAdjuster) offsetTime21);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022-02-21" + "'", str18, "2022-02-21");
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(offsetTime21);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(2, 10, 11);
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = timeOfDay4.getFieldType(96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long2 = duration1.getStandardDays();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime13, periodType14);
        org.joda.time.PeriodType periodType16 = periodType14.withMonthsRemoved();
        java.lang.String str17 = periodType14.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PeriodType[Time]" + "'", str17, "PeriodType[Time]");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period5);
        mutableDateTime0.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime0.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.add((long) 64);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.monthOfYear();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.minus(readableDuration16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight14.minusWeeks(100);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight14, readableDuration20);
        mutableDateTime12.add((org.joda.time.ReadablePeriod) mutablePeriod21);
        mutableDateTime12.addMillis(0);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateMidnight19);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of(4096, 10, (int) (byte) 1, 0, 32, (int) '4');
        java.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = localDateTime6.withMinute(2022);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 2022");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("Etc/UTC", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        double[] doubleArray3 = new double[] { 97, 10, '#' };
        java.nio.DoubleBuffer doubleBuffer4 = java.nio.DoubleBuffer.wrap(doubleArray3);
        java.nio.DoubleBuffer doubleBuffer5 = doubleBuffer4.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer6 = doubleBuffer4.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer9 = doubleBuffer6.put(5, (double) 3000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(doubleBuffer5);
        org.junit.Assert.assertNotNull(doubleBuffer6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.years();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 0, chronology7);
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar11 = new java.util.GregorianCalendar(locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 32, chronology7, locale10);
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) 11, (long) (short) 100, chronology7);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        mutableInterval19.setEndMillis((long) 4096);
        org.joda.time.Duration duration22 = mutableInterval19.toDuration();
        org.joda.time.Interval interval23 = interval17.withDurationAfterStart((org.joda.time.ReadableDuration) duration22);
        java.time.Clock clock24 = java.time.Clock.systemUTC();
        boolean boolean25 = duration22.equals((java.lang.Object) clock24);
        mutableInterval13.setDurationAfterStart((org.joda.time.ReadableDuration) duration22);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.monthOfYear();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.minus(readableDuration30);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property34 = dateMidnight33.monthOfYear();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight33.minus(readableDuration35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight33.minusWeeks(100);
        mutableInterval13.setInterval((org.joda.time.ReadableInstant) dateMidnight31, (org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.Seconds seconds40 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Hours hours41 = seconds40.toStandardHours();
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval13.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) hours41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(clock24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(hours41);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod8.setYears(100);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long13 = duration12.getStandardDays();
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration12);
        mutablePeriod8.setPeriod(999999999L, (long) ':');
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 100);
        org.joda.time.Period period3 = period1.plusHours(35);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        boolean boolean7 = localDateTime5.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        boolean boolean8 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime4.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.now();
        boolean boolean13 = localDateTime11.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime15 = localDateTime11.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        boolean boolean18 = localDateTime16.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        boolean boolean19 = localDateTime15.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        boolean boolean20 = localDateTime10.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime17);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.ZonedDateTime zonedDateTime25 = java.time.ZonedDateTime.ofStrict(localDateTime10, zoneOffset22, (java.time.ZoneId) zoneOffset24);
        java.time.OffsetTime offsetTime26 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset24);
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.now();
        boolean boolean29 = localDateTime27.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime28);
        java.time.LocalDateTime localDateTime31 = localDateTime27.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime32 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime33 = java.time.LocalDateTime.now();
        boolean boolean34 = localDateTime32.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime33);
        boolean boolean35 = localDateTime31.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime33);
        java.time.LocalDateTime localDateTime37 = localDateTime31.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.now();
        boolean boolean40 = localDateTime38.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime39);
        java.time.LocalDateTime localDateTime42 = localDateTime38.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime43 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime44 = java.time.LocalDateTime.now();
        boolean boolean45 = localDateTime43.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime44);
        boolean boolean46 = localDateTime42.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime44);
        boolean boolean47 = localDateTime37.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime44);
        java.time.temporal.ChronoField chronoField48 = java.time.temporal.ChronoField.YEAR;
        boolean boolean49 = localDateTime37.isSupported((java.time.temporal.TemporalField) chronoField48);
        java.time.temporal.TemporalUnit temporalUnit50 = chronoField48.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long51 = zoneOffset24.getLong((java.time.temporal.TemporalField) chronoField48);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + chronoField48 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField48.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + temporalUnit50 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit50.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean3 = mutableInterval1.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone6);
        org.joda.time.Period period8 = interval7.toPeriod();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = period8.get(durationFieldType9);
        org.joda.time.Period period11 = period8.toPeriod();
        mutableInterval1.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period13 = mutableInterval1.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval1.setEndMillis((-24407999999999965L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = timeOfDay1.getFieldType(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.stream.Stream<org.joda.time.ReadWritablePeriod> readWritablePeriodStream0 = java.util.stream.Stream.empty();
        org.junit.Assert.assertNotNull(readWritablePeriodStream0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId1 = java.time.ZoneId.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        int int2 = days0.size();
        org.joda.time.Minutes minutes3 = days0.toStandardMinutes();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(minutes3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.lang.Runnable runnable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream2 = doubleStream0.onClose(runnable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.Optional<java.time.Period> periodOptional0 = java.util.Optional.empty();
        java.lang.String str1 = periodOptional0.toString();
        java.time.Period period3 = java.time.Period.ofMonths((int) (byte) -1);
        java.time.Period period5 = period3.plusYears((long) 20);
        java.time.Period period7 = period5.withMonths(96);
        java.time.Period period8 = periodOptional0.orElse(period5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period9 = periodOptional0.get();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodOptional0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Optional.empty" + "'", str1, "Optional.empty");
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.security.AccessControlContext accessControlContext0 = null;
        java.security.DomainCombiner domainCombiner1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.AccessControlContext accessControlContext2 = new java.security.AccessControlContext(accessControlContext0, domainCombiner1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTime();
        int int10 = dateTime9.getSecondOfDay();
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37930 + "'", int10 == 37930);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.monthOfYear();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((java.lang.Object) localDateTime17, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.year();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withChronology(chronology11);
        org.joda.time.DateMidnight dateMidnight13 = dateTime12.toDateMidnight();
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) dateMidnight13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay16 = property3.setCopy("java.text.AttributedCharacterIterator$Attribute(language)");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.text.AttributedCharacterIterator$Attribute(language)\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.monthOfYear();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(6, (int) '\uffff', (int) (short) 1, (int) (short) 0, 16, 171, 505000000, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 171 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime4.withEarlierOffsetAtOverlap();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now();
        boolean boolean8 = localDateTime6.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        java.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.now();
        boolean boolean13 = localDateTime11.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        boolean boolean14 = localDateTime10.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime12);
        java.time.LocalDateTime localDateTime16 = localDateTime10.minusNanos((long) 2022);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now();
        boolean boolean19 = localDateTime17.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime18);
        java.time.LocalDateTime localDateTime21 = localDateTime17.plusSeconds((long) '4');
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.now();
        boolean boolean24 = localDateTime22.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        boolean boolean25 = localDateTime21.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        boolean boolean26 = localDateTime16.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime23);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange28 = chronoField27.range();
        java.time.temporal.TemporalUnit temporalUnit29 = chronoField27.getRangeUnit();
        boolean boolean30 = localDateTime23.isSupported(temporalUnit29);
        boolean boolean31 = zonedDateTime5.isSupported(temporalUnit29);
        java.time.format.DateTimeFormatter dateTimeFormatter32 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format33 = dateTimeFormatter32.toFormat();
        java.lang.String str34 = zonedDateTime5.format(dateTimeFormatter32);
        java.lang.String str35 = zonedDateTime5.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField27.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertTrue("'" + temporalUnit29 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit29.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(format33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2022-02-21T09:34:17.111" + "'", str34, "2022-02-21T09:34:17.111");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2022-02-21T09:34:17.111Z[Etc/UTC]" + "'", str35, "2022-02-21T09:34:17.111Z[Etc/UTC]");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (short) 1);
        long long9 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        int int11 = property6.getMaximumTextLength(locale10);
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = property2.getAsText(locale10);
        int int14 = property2.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay15 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeOfDay15);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange4 = java.time.temporal.ValueRange.of(10L, 1645436047L, (long) 12, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.monthOfYear();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        long long6 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight5);
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = property3.getAsText(locale7);
        org.joda.time.DurationField durationField9 = property3.getLeapDurationField();
        long long11 = durationField9.getValueAsLong((long) 16);
        long long13 = durationField9.getMillis((long) 1024);
        boolean boolean14 = locale0.equals((java.lang.Object) durationField9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "January" + "'", str8, "January");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 88473600000L + "'", long13 == 88473600000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.security.KeyException keyException1 = new java.security.KeyException("2022-02-21T09:33:57.064");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.lang.Object obj2 = format1.clone();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of(4096, 10, (int) (byte) 1, 0, 32, (int) '4');
        java.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((long) 'a');
        java.time.Clock clock12 = java.time.Clock.systemUTC();
        java.time.Instant instant13 = clock12.instant();
        java.util.Date date14 = java.util.Date.from(instant13);
        java.time.Clock clock15 = java.time.Clock.systemUTC();
        java.time.Instant instant16 = clock15.instant();
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.ofInstant(instant16, (java.time.ZoneId) zoneOffset18);
        java.time.OffsetDateTime offsetDateTime20 = java.time.OffsetDateTime.ofInstant(instant13, (java.time.ZoneId) zoneOffset18);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime21 = localDateTime11.atZone((java.time.ZoneId) zoneOffset18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = format1.format((java.lang.Object) zoneOffset18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported field: Year");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(clock12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Feb 21 09:34:17 UTC 2022");
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime21);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) (short) 1);
        int int9 = dateTime8.getEra();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMonths((int) '\uffff');
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.monthOfYear();
        org.joda.time.Chronology chronology4 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.halfdays();
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.monthOfYear();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (short) 1);
        long long11 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight10);
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = property8.getAsText(locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology4, locale12);
        org.joda.time.DateTimeField dateTimeField15 = chronology4.dayOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "January" + "'", str13, "January");
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime12 = property9.addToCopy(43200000L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours((int) (byte) 10);
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset1);
        java.time.OffsetTime offsetTime4 = offsetTime2.plusNanos(125L);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime6 = localDateTime5.toLocalTime();
        java.time.LocalDateTime localDateTime8 = localDateTime5.withNano(0);
        java.time.Period period10 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean12 = period10.equals((java.lang.Object) (-1));
        java.time.Period period14 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean16 = period14.equals((java.lang.Object) (-1));
        int int17 = period14.getDays();
        java.time.Period period18 = period10.minus((java.time.temporal.TemporalAmount) period14);
        java.time.chrono.ChronoPeriod chronoPeriod19 = period14.normalized();
        java.time.temporal.Temporal temporal20 = localDateTime8.plus((java.time.temporal.TemporalAmount) chronoPeriod19);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime21 = offsetTime4.minus((java.time.temporal.TemporalAmount) chronoPeriod19);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(chronoPeriod19);
        org.junit.Assert.assertNotNull(temporal20);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar.Builder builder4 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        int int8 = timeZone6.getRawOffset();
        java.util.Calendar.Builder builder9 = builder4.setTimeZone(timeZone6);
        boolean boolean10 = timeZone1.hasSameRules(timeZone6);
        java.lang.String str11 = timeZone1.getID();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Etc/UTC" + "'", str11, "Etc/UTC");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.time.Period period1 = java.time.Period.ofWeeks(15);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.days();
        long long7 = durationField4.add((long) 1024, 0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1024L + "'", long7 == 1024L);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.security.cert.CertificateException certificateException0 = new java.security.cert.CertificateException();
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 0, 365);
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setDayOfMonth(171);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 171 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 'a', 100L);
        java.util.stream.Stream<java.lang.Long> longStream3 = longStream2.boxed();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = longStream2.sum();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.lang.Object obj2 = format1.clone();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) (-1L));
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.empty();
        java.util.DoubleSummaryStatistics doubleSummaryStatistics6 = doubleStream5.summaryStatistics();
        double double7 = doubleSummaryStatistics6.getMax();
        optionalDouble4.ifPresent((java.util.function.DoubleConsumer) doubleSummaryStatistics6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = format1.format((java.lang.Object) doubleSummaryStatistics6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format target must implement TemporalAccessor");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleSummaryStatistics6);
        org.junit.Assert.assertEquals(doubleSummaryStatistics6.toString(), "DoubleSummaryStatistics{count=1, sum=-1.000000, min=-1.000000, average=-1.000000, max=-1.000000}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.NEGATIVE_INFINITY + "'", double7 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        java.lang.String str8 = charBuffer3.toString();
        java.util.stream.IntStream intStream9 = charBuffer3.chars();
        java.util.stream.LongStream longStream10 = intStream9.asLongStream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = intStream9.sorted();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional.empty" + "'", str8, "Optional.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int int0 = org.joda.time.YearMonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setMinuteOfHour(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.net.URL uRL0 = null;
        java.net.URLStreamHandler uRLStreamHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL(uRL0, "java.text.AttributedCharacterIterator$Attribute(language)", uRLStreamHandler2);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: java.text.AttributedCharacterIterator$Attribute(language)");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay1.minusSeconds(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = timeOfDay1.getFieldType(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.LongSummaryStatistics longSummaryStatistics0 = new java.util.LongSummaryStatistics();
        long long1 = longSummaryStatistics0.getCount();
        java.lang.String str2 = longSummaryStatistics0.toString();
        org.junit.Assert.assertEquals(longSummaryStatistics0.toString(), "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}" + "'", str2, "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        java.nio.CharBuffer charBuffer3 = charBuffer1.duplicate();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Optional.empty");
        java.nio.Buffer buffer6 = charBuffer5.clear();
        int int7 = charBuffer3.compareTo(charBuffer5);
        int int8 = charBuffer3.position();
        java.nio.CharBuffer charBuffer9 = charBuffer3.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer13 = charBuffer9.append((java.lang.CharSequence) "hi!", 64, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -64");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charBuffer9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = yearMonthDay2.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField6 = yearMonthDay2.getField((int) (byte) 1);
        int int8 = dateTimeField6.getMinimumValue((long) 1024);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.plusHours(36000);
        java.nio.IntBuffer intBuffer15 = java.nio.IntBuffer.allocate(256);
        boolean boolean16 = intBuffer15.isDirect();
        int[] intArray17 = intBuffer15.array();
        java.util.stream.IntStream intStream18 = java.util.stream.IntStream.of(intArray17);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = dateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) timeOfDay10, 403, intArray17, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 403");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(intBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream18);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int int0 = java.util.GregorianCalendar.BC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Instant instant1 = clock0.instant();
        java.util.Date date2 = java.util.Date.from(instant1);
        date2.setHours((int) (short) 10);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localDate5.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate5.withCenturyOfEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 10:34:17 UTC 2022");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 'x');
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United States\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period5);
        mutableDateTime0.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.monthOfYear();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (short) 1);
        long long16 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight15);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        int int18 = property13.getMaximumTextLength(locale17);
        org.joda.time.DateMidnight dateMidnight19 = property13.roundHalfCeilingCopy();
        org.joda.time.Duration duration21 = org.joda.time.Duration.millis((long) 'a');
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.plus((org.joda.time.ReadableDuration) duration21);
        mutableDateTime0.setDate((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        mutableDateTime0.add(durationFieldType24, 12);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setMonthOfYear(16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(durationFieldType24);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        mutableDateTime0.add((long) (byte) 1);
        org.joda.time.MutableInterval mutableInterval6 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.010Z");
        boolean boolean8 = mutableInterval6.contains((long) 3);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(0L, (long) (short) 10, dateTimeZone11);
        org.joda.time.Period period13 = interval12.toPeriod();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = period13.get(durationFieldType14);
        org.joda.time.Period period16 = period13.toPeriod();
        mutableInterval6.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period19 = period13.plusMinutes((int) (byte) 100);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period19);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setSecondOfMinute(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.net.URLConnection.setDefaultRequestProperty("minuteOfHour", "2022-02-21T09:34:04.525");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar1);
        java.time.Instant instant3 = gregorianCalendar1.toInstant();
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar1.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime4.plusSeconds((long) 5);
        java.time.LocalTime localTime7 = zonedDateTime6.toLocalTime();
        java.time.DayOfWeek dayOfWeek8 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.YEAR;
        java.time.temporal.ValueRange valueRange10 = chronoField9.range();
        boolean boolean11 = chronoField9.isDateBased();
        boolean boolean12 = dayOfWeek8.isSupported((java.time.temporal.TemporalField) chronoField9);
        boolean boolean13 = zonedDateTime6.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.time.LocalDate localDate14 = zonedDateTime6.toLocalDate();
        int int15 = localDate14.lengthOfMonth();
        java.time.chrono.IsoChronology isoChronology16 = localDate14.getChronology();
        java.time.temporal.TemporalAccessor temporalAccessor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate18 = isoChronology16.date(temporalAccessor17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.YEAR));
        org.junit.Assert.assertNotNull(valueRange10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertNotNull(isoChronology16);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar1 = new java.util.GregorianCalendar(locale0);
        java.util.Date date2 = gregorianCalendar1.getGregorianChange();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = gregorianCalendar1.getActualMinimum((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Fri Oct 15 00:00:00 UTC 1582");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod10.setYears(100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        long long15 = duration14.getStandardDays();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime1.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.LocalDateTime localDateTime23 = property21.roundFloorCopy();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property33 = dateTime32.hourOfDay();
        org.joda.time.DateTime dateTime34 = property33.roundFloorCopy();
        boolean boolean36 = dateTime34.isAfter(1L);
        int int37 = property21.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.LocalDateTime localDateTime38 = property21.roundHalfCeilingCopy();
        java.util.Date date39 = localDateTime38.toDate();
        java.security.cert.CertPath certPath40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.Timestamp timestamp41 = new java.security.Timestamp(date39, certPath40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Mon Feb 21 00:00:00 UTC 2022");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.time.Period period1 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean3 = period1.equals((java.lang.Object) (-1));
        java.time.Period period5 = java.time.Period.ofMonths((int) (byte) -1);
        boolean boolean7 = period5.equals((java.lang.Object) (-1));
        int int8 = period5.getDays();
        java.time.Period period9 = period1.minus((java.time.temporal.TemporalAmount) period5);
        java.util.Optional<java.time.Period> periodOptional10 = java.util.Optional.empty();
        java.lang.String str11 = periodOptional10.toString();
        java.time.Period period13 = java.time.Period.ofMonths((int) (byte) -1);
        java.time.Period period15 = period13.plusYears((long) 20);
        java.time.Period period17 = period15.withMonths(96);
        java.time.Period period18 = periodOptional10.orElse(period15);
        java.time.Period period19 = period9.plus((java.time.temporal.TemporalAmount) period18);
        java.time.Duration duration21 = java.time.Duration.ofHours(0L);
        java.time.Duration duration23 = java.time.Duration.ofHours(0L);
        int int24 = duration21.compareTo(duration23);
        java.time.Duration duration26 = duration21.plusNanos((long) 36000);
        java.time.Duration duration27 = duration21.abs();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod28 = period18.minus((java.time.temporal.TemporalAmount) duration27);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodOptional10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Optional.empty" + "'", str11, "Optional.empty");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration27);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime3 = java.time.LocalTime.of(0, 256, 36000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 256");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.function.IntUnaryOperator intUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream2 = java.util.stream.IntStream.iterate((-1), intUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.DateMidnight dateMidnight8 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime9 = dateMidnight8.toDateTimeISO();
        int int10 = dateMidnight8.getDayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }
}
