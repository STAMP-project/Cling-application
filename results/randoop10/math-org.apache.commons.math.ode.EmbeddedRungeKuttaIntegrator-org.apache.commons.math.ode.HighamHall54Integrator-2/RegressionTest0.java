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
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress1 = java.net.InetAddress.getByName("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = java.time.LocalDate.parse((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.time.LocalDate localDate0 = null;
        java.time.LocalTime localTime1 = null;
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset3 = offsetDateTime2.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime4 = java.time.ZonedDateTime.of(localDate0, localTime1, (java.time.ZoneId) zoneOffset3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Month month1 = java.time.Month.of((int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear: 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.net.URLConnection.setDefaultRequestProperty("Higham-Hall 5(4)", "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.time.Month month1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.of((int) 'a', month1, (int) (byte) -1, 1, (int) (byte) 10, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset1 = java.nio.charset.Charset.forName("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("Monday, February 21, 2022");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset1 = offsetDateTime0.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate2 = java.time.chrono.ChronoLocalDate.from((java.time.temporal.TemporalAccessor) zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ChronoLocalDate from TemporalAccessor: class java.time.ZoneOffset");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.time.Month month0 = null;
        java.time.DayOfWeek dayOfWeek2 = null;
        java.time.LocalTime localTime3 = null;
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition5 = null;
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset8 = offsetDateTime7.getOffset();
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime6.withOffsetSameInstant(zoneOffset8);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTime10.withOffsetSameInstant(zoneOffset12);
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        java.time.OffsetDateTime offsetDateTime17 = offsetDateTime14.withOffsetSameInstant(zoneOffset16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransitionRule zoneOffsetTransitionRule18 = java.time.zone.ZoneOffsetTransitionRule.of(month0, 10, dayOfWeek2, localTime3, true, timeDefinition5, zoneOffset8, zoneOffset12, zoneOffset16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.WRITE;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.WRITE + "'", accessMode0.equals(java.nio.file.AccessMode.WRITE));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.lang.String str2 = localDate0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate4 = localDate0.withMonth(100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.temporal.TemporalField temporalField3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal5 = offsetDateTime0.with(temporalField3, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "Monday, February 21, 2022");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Monday, February 21, 2022");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        boolean boolean3 = localDate0.isAfter((java.time.chrono.ChronoLocalDate) localDate2);
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        int int6 = localDate5.lengthOfYear();
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        boolean boolean8 = localDate5.isAfter((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.Period period9 = localDate4.until((java.time.chrono.ChronoLocalDate) localDate5);
        java.time.temporal.TemporalUnit temporalUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = localDate0.until((java.time.temporal.Temporal) localDate4, temporalUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        java.lang.String str5 = highamHall54Integrator4.getName();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations7 = null;
        double[] doubleArray12 = new double[] { 10L, 1024 };
        double[] doubleArray20 = new double[] { (short) 100, (short) 10, 0.0f, 9L, (byte) 10, (byte) 10 };
        double[] doubleArray27 = new double[] { 0.0f, 100.0d, (-1), (-1L), (byte) 100, 10 };
        double[] doubleArray30 = new double[] { 1L, ' ' };
        double[] doubleArray37 = new double[] { 1.0f, 1.0f, 100, 100.0f, 1L, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            double double38 = highamHall54Integrator4.initializeStep(firstOrderDifferentialEquations7, false, (int) '4', doubleArray12, (double) (short) 0, doubleArray20, doubleArray27, doubleArray30, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 1024.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 10.0, 0.0, 9.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 100.0, -1.0, -1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 1.0, 100.0, 100.0, 1.0, 100.0]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.time.Period period1 = java.time.Period.ofMonths((-1));
        java.time.Period period3 = period1.minusDays((long) '#');
        java.time.temporal.Temporal temporal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal5 = period1.addTo(temporal4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.net.FileNameMap fileNameMap0 = java.net.URLConnection.getFileNameMap();
        org.junit.Assert.assertNotNull(fileNameMap0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        int int2 = localDate1.lengthOfYear();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        java.time.Period period5 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.Period period7 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology8 = period7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate9 = localDate1.plus((java.time.temporal.TemporalAmount) period7);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition1 = new java.text.FieldPosition(field0);
        fieldPosition1.setEndIndex((int) (short) 10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset3 = offsetDateTime2.getOffset();
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset5 = offsetDateTime4.getOffset();
        boolean boolean6 = offsetDateTime2.isEqual(offsetDateTime4);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long8 = offsetDateTime2.getLong((java.time.temporal.TemporalField) chronoField7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate0.get((java.time.temporal.TemporalField) chronoField7);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField7.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.DoubleSummaryStatistics doubleSummaryStatistics0 = new java.util.DoubleSummaryStatistics();
        double double1 = doubleSummaryStatistics0.getAverage();
        org.junit.Assert.assertEquals(doubleSummaryStatistics0.toString(), "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int0 = org.apache.commons.math.ode.SwitchingFunction.RESET_DERIVATIVES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        java.lang.String str5 = highamHall54Integrator4.getName();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations7 = null;
        double[] doubleArray12 = new double[] { 1, 0.0d };
        double[] doubleArray15 = new double[] { (short) 100 };
        double[] doubleArray18 = new double[] { (byte) 1, (byte) 1 };
        double[] doubleArray24 = new double[] { (-1L), 0.0d, 1.0f, 1.0d, 1 };
        double[] doubleArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = highamHall54Integrator4.initializeStep(firstOrderDifferentialEquations7, true, 1, doubleArray12, (double) (short) 10, doubleArray15, doubleArray18, doubleArray24, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[101.0, 0.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.nio.charset.CharacterCodingException characterCodingException0 = new java.nio.charset.CharacterCodingException();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.of("hi!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: aliasMap");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset4 = offsetDateTime3.getOffset();
        boolean boolean5 = offsetDateTime1.isEqual(offsetDateTime3);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long7 = offsetDateTime1.getLong((java.time.temporal.TemporalField) chronoField6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate0.get((java.time.temporal.TemporalField) chronoField6);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField6.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.FileNotFoundException fileNotFoundException1 = new java.io.FileNotFoundException("Higham-Hall 5(4)");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.temporal.TemporalAmount temporalAmount1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = localDate0.minus(temporalAmount1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amountToSubtract");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        boolean boolean3 = localDate0.isAfter((java.time.chrono.ChronoLocalDate) localDate2);
        java.time.Period period5 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate6 = localDate0.minus((java.time.temporal.TemporalAmount) period5);
        java.time.temporal.TemporalUnit temporalUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate9 = localDate0.plus((long) '#', temporalUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoLocalDate6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition1 = new java.text.FieldPosition(field0);
        fieldPosition1.setBeginIndex((int) ' ');
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.time.Period period1 = java.time.Period.ofMonths((-1));
        java.time.Period period3 = period1.minusDays((long) '#');
        java.time.temporal.Temporal temporal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal5 = period3.addTo(temporal4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        boolean boolean3 = localDate0.isAfter((java.time.chrono.ChronoLocalDate) localDate2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate5 = localDate2.plusDays((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.time.Period period1 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology2 = period1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate5 = chronology2.dateYearDay((int) (short) 0, 116000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 116000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = new java.net.URL("Subject:\n");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: subject");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.format.ResolverStyle resolverStyle1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withResolverStyle(resolverStyle1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: resolverStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getRangeUnit();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        int int3 = localDate2.lengthOfYear();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        boolean boolean5 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.Period period7 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate8 = localDate2.minus((java.time.temporal.TemporalAmount) period7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate10 = temporalUnit1.addTo(localDate2, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: HalfDays");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(chronoLocalDate8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.time.Month month0 = java.time.Month.APRIL;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.APRIL + "'", month0.equals(java.time.Month.APRIL));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        boolean boolean3 = localDate0.isAfter((java.time.chrono.ChronoLocalDate) localDate2);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate7 = localDate0.minus((long) '4', temporalUnit6);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: HalfDays");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField5.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 'a', (double) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayName();
        boolean boolean4 = locale1.equals((java.lang.Object) (-1));
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.time.temporal.ValueRange valueRange3 = java.time.temporal.ValueRange.of(0L, (long) 4, (long) 116000000);
        org.junit.Assert.assertNotNull(valueRange3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (byte) 100, (int) (short) 1, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Instant instant4 = offsetDateTime3.toInstant();
        java.time.Period period6 = java.time.Period.ofMonths((-1));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        boolean boolean12 = period6.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal13 = instant4.plus((java.time.temporal.TemporalAmount) period6);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getLanguage();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.net.MalformedURLException malformedURLException1 = new java.net.MalformedURLException("");
        java.util.concurrent.ExecutionException executionException2 = new java.util.concurrent.ExecutionException((java.lang.Throwable) malformedURLException1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList4.replaceAll(languageRangeUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.parse((java.lang.CharSequence) "-999999999-01-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '-999999999-01-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.time.Period period1 = java.time.Period.ofMonths((-1));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator6 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        boolean boolean7 = period1.equals((java.lang.Object) 10L);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules9 = zoneOffset8.getRules();
        java.time.Clock clock10 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset8);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.now(clock10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal12 = period1.addTo((java.time.temporal.Temporal) offsetTime11);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(zoneRules9);
        org.junit.Assert.assertNotNull(clock10);
        org.junit.Assert.assertNotNull(offsetTime11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        double[] doubleArray2 = new double[] { 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer5 = java.nio.DoubleBuffer.wrap(doubleArray2, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 10.0]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException1 = new java.util.InvalidPropertiesFormatException("Subject:\n");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset1 = offsetDateTime0.getOffset();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset3 = offsetDateTime2.getOffset();
        boolean boolean4 = offsetDateTime0.isEqual(offsetDateTime2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime6 = offsetDateTime2.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        org.junit.Assert.assertNotNull(optionalLong0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        long[] longArray0 = new long[] {};
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(longArray0);
        java.util.function.LongConsumer longConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            longStream1.forEach(longConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.LongStream longStream2 = intStream1.asLongStream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt3 = intStream1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        boolean boolean5 = languageRangeList1.isEmpty();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId1 = java.time.ZoneId.of("-999999999-01-01");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: -999999999-01-01");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        double[] doubleArray2 = new double[] { 1024, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer5 = java.nio.DoubleBuffer.wrap(doubleArray2, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1024.0, 1.0]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator0 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean1 = chronoField0.isTimeBased();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        // The following exception was thrown during execution in test generation
        try {
            double double1 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.time.LocalDateTime localDateTime0 = null;
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset3 = offsetDateTime2.getOffset();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime1.withOffsetSameInstant(zoneOffset3);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset6 = offsetDateTime5.getOffset();
        boolean boolean7 = zoneOffset3.equals((java.lang.Object) zoneOffset6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime8.withOffsetSameInstant(zoneOffset10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.ofLocal(localDateTime0, (java.time.ZoneId) zoneOffset6, zoneOffset10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: localDateTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.IOException iOException0 = new java.io.IOException();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset13 = zoneRules1.getOffset(localDateTime12);
        boolean boolean14 = zoneRules1.isFixedOffset();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        java.lang.String str20 = highamHall54Integrator19.getName();
        highamHall54Integrator19.setMaxGrowth((double) ' ');
        boolean boolean23 = zoneRules1.equals((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Higham-Hall 5(4)" + "'", str20, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange4 = languageRangeList1.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.time.format.DecimalStyle decimalStyle0 = java.time.format.DecimalStyle.ofDefaultLocale();
        java.time.format.DecimalStyle decimalStyle2 = decimalStyle0.withDecimalSeparator(' ');
        org.junit.Assert.assertNotNull(decimalStyle0);
        org.junit.Assert.assertNotNull(decimalStyle2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime1.withMinute((int) (short) 1);
        java.time.LocalTime localTime4 = offsetDateTime3.toLocalTime();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        int int6 = localDate5.lengthOfYear();
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        boolean boolean8 = localDate5.isAfter((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.LocalDateTime localDateTime9 = localTime4.atDate(localDate5);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset11 = offsetDateTime10.getOffset();
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset13 = offsetDateTime12.getOffset();
        boolean boolean14 = offsetDateTime10.isEqual(offsetDateTime12);
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long16 = offsetDateTime10.getLong((java.time.temporal.TemporalField) chronoField15);
        boolean boolean17 = chronoField15.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit18 = chronoField15.getRangeUnit();
        java.time.LocalTime localTime19 = localTime4.truncatedTo(temporalUnit18);
        java.time.Duration duration20 = java.time.Duration.of(0L, temporalUnit18);
        java.time.Duration duration22 = duration20.plusNanos((long) 100);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField15.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9L + "'", long16 == 9L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit18 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit18.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration22);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.time.Month month0 = java.time.Month.NOVEMBER;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.NOVEMBER + "'", month0.equals(java.time.Month.NOVEMBER));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        long[] longArray0 = new long[] {};
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(longArray0);
        java.lang.Runnable runnable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream3 = longStream1.onClose(runnable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties1.save(outputStream2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("");
        java.security.KeyException keyException2 = new java.security.KeyException((java.lang.Throwable) invalidKeyException1);
        java.security.cert.CertificateException certificateException3 = new java.security.cert.CertificateException((java.lang.Throwable) invalidKeyException1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        char char0 = java.io.File.pathSeparatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ':' + "'", char0 == ':');
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.ZonedDateTime zonedDateTime11 = localDateTime8.atZone((java.time.ZoneId) zoneOffset10);
        java.time.Period period13 = java.time.Period.ofMonths((-1));
        java.time.Period period15 = period13.minusDays((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = localDateTime8.plus((java.time.temporal.TemporalAmount) period15);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        double[] doubleArray6 = new double[] { 100.0f, 10L, 1, 365, (-1.0d), 100L };
        java.nio.DoubleBuffer doubleBuffer9 = java.nio.DoubleBuffer.wrap(doubleArray6, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer11 = doubleBuffer9.put((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0, 365.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleBuffer9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.time.Duration duration1 = java.time.Duration.ofSeconds((long) 16);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime10 = localTime3.withHour((-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.security.Provider provider0 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "Higham-Hall 5(4)", "Subject:\n", "Monday, February 21, 2022", "", "", "Monday, February 21, 2022" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.Provider.Service service14 = new java.security.Provider.Service(provider0, "hi!", "", "-999999999-01-01", (java.util.List<java.lang.String>) strList11, strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.security.cert.CertificateException certificateException1 = new java.security.cert.CertificateException("Monday, February 21, 2022");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("hi!", "Monday, February 21, 2022");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Monday, February 21, 2022");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        int int6 = languageRangeSpliterator5.characteristics();
        long long7 = languageRangeSpliterator5.estimateSize();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16464 + "'", int6 == 16464);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset4 = offsetDateTime3.getOffset();
        boolean boolean5 = offsetDateTime1.isEqual(offsetDateTime3);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long7 = offsetDateTime1.getLong((java.time.temporal.TemporalField) chronoField6);
        boolean boolean8 = chronoField6.isDateBased();
        java.time.temporal.ValueRange valueRange9 = offsetDateTime0.range((java.time.temporal.TemporalField) chronoField6);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime12 = offsetDateTime10.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime12.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset17 = offsetDateTime16.getOffset();
        java.time.OffsetDateTime offsetDateTime18 = offsetDateTime15.withOffsetSameInstant(zoneOffset17);
        java.time.OffsetDateTime offsetDateTime19 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset20 = offsetDateTime19.getOffset();
        boolean boolean21 = zoneOffset17.equals((java.lang.Object) zoneOffset20);
        java.time.ZonedDateTime zonedDateTime22 = offsetDateTime12.atZoneSimilarLocal((java.time.ZoneId) zoneOffset20);
        long long23 = chronoField6.getFrom((java.time.temporal.TemporalAccessor) offsetDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime25 = offsetDateTime12.withHour((int) ':');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 58");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField6.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer3 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Higham-Hall 5(4)", (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.security.InvalidKeyException invalidKeyException0 = new java.security.InvalidKeyException();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = localDateTime8.withMonth((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.time.Period period1 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology2 = period1.getChronology();
        boolean boolean4 = chronology2.equals((java.lang.Object) 10L);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.withMinute((int) (short) 1);
        java.time.LocalTime localTime8 = offsetDateTime7.toLocalTime();
        java.time.LocalDate localDate9 = java.time.LocalDate.MIN;
        int int10 = localDate9.lengthOfYear();
        java.time.LocalDate localDate11 = java.time.LocalDate.MIN;
        boolean boolean12 = localDate9.isAfter((java.time.chrono.ChronoLocalDate) localDate11);
        java.time.LocalDateTime localDateTime13 = localTime8.atDate(localDate9);
        java.time.chrono.ChronoLocalDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoLocalDateTime14 = chronology2.localDateTime((java.time.temporal.TemporalAccessor) localDateTime13);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules16 = zoneOffset15.getRules();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset15);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime18 = chronology2.zonedDateTime((java.time.temporal.TemporalAccessor) localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 2022-02-21T09:13:56.674 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(zoneRules16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofTotalSeconds(16);
        org.junit.Assert.assertNotNull(zoneOffset1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.nativeOrder();
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        highamHall54Integrator4.setMaxGrowth((double) 365);
        int int7 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Clock clock2 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset0);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.Period period5 = java.time.Period.ofMonths((-1));
        java.time.Period period7 = period5.minusDays((long) '#');
        boolean boolean8 = offsetTime3.equals((java.lang.Object) period5);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules10 = zoneOffset9.getRules();
        java.time.Clock clock11 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset9);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.now(clock11);
        boolean boolean13 = offsetTime3.isAfter(offsetTime12);
        java.time.OffsetTime offsetTime15 = offsetTime3.plusMinutes(0L);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.OffsetTime offsetTime18 = offsetTime3.with((java.time.temporal.TemporalField) chronoField16, (long) 16384);
        java.time.OffsetDateTime offsetDateTime19 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime21 = offsetDateTime19.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime23 = offsetDateTime21.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset26 = offsetDateTime25.getOffset();
        java.time.OffsetDateTime offsetDateTime27 = offsetDateTime24.withOffsetSameInstant(zoneOffset26);
        java.time.OffsetDateTime offsetDateTime28 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset29 = offsetDateTime28.getOffset();
        boolean boolean30 = zoneOffset26.equals((java.lang.Object) zoneOffset29);
        java.time.ZonedDateTime zonedDateTime31 = offsetDateTime21.atZoneSimilarLocal((java.time.ZoneId) zoneOffset29);
        java.time.LocalDate localDate32 = java.time.LocalDate.MIN;
        int int33 = localDate32.lengthOfYear();
        java.time.LocalDate localDate34 = java.time.LocalDate.MIN;
        boolean boolean35 = localDate32.isAfter((java.time.chrono.ChronoLocalDate) localDate34);
        java.time.Period period37 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate38 = localDate32.minus((java.time.temporal.TemporalAmount) period37);
        java.time.Period period40 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology41 = period40.getChronology();
        java.time.Period period42 = period37.plus((java.time.temporal.TemporalAmount) period40);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime43 = zonedDateTime31.minus((java.time.temporal.TemporalAmount) period42);
        long long44 = chronoField16.getFrom((java.time.temporal.TemporalAccessor) localDateChronoZonedDateTime43);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField16.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 365 + "'", int33 == 365);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(chronoLocalDate38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime43);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 792000L + "'", long44 == 792000L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.DoubleSummaryStatistics doubleSummaryStatistics0 = new java.util.DoubleSummaryStatistics();
        long long1 = doubleSummaryStatistics0.getCount();
        org.junit.Assert.assertEquals(doubleSummaryStatistics0.toString(), "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.IntStream intStream3 = intStream1.limit((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = intStream1.skip((long) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        long[] longArray3 = new long[] { 0, (short) 10, 10 };
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of(longArray3);
        java.util.OptionalLong optionalLong5 = longStream4.findFirst();
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = new java.util.Properties(properties6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.withMinute((int) (short) 1);
        java.time.LocalTime localTime11 = offsetDateTime10.toLocalTime();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        int int13 = localDate12.lengthOfYear();
        java.time.LocalDate localDate14 = java.time.LocalDate.MIN;
        boolean boolean15 = localDate12.isAfter((java.time.chrono.ChronoLocalDate) localDate14);
        java.time.LocalDateTime localDateTime16 = localTime11.atDate(localDate12);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset18 = offsetDateTime17.getOffset();
        java.time.ZonedDateTime zonedDateTime19 = localDateTime16.atZone((java.time.ZoneId) zoneOffset18);
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules21 = zoneOffset20.getRules();
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset20);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime25 = java.time.ZonedDateTime.ofStrict(localDateTime16, zoneOffset20, (java.time.ZoneId) zoneOffset24);
        javax.security.auth.Subject subject26 = new javax.security.auth.Subject();
        java.lang.Object obj27 = properties7.putIfAbsent((java.lang.Object) zoneOffset24, (java.lang.Object) subject26);
        boolean boolean28 = optionalLong5.equals((java.lang.Object) subject26);
        long long29 = optionalLong5.getAsLong();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 365 + "'", int13 == 365);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(zoneRules21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        long[] longArray3 = new long[] { 0, (short) 10, 10 };
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of(longArray3);
        java.util.OptionalLong optionalLong5 = longStream4.findFirst();
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = new java.util.Properties(properties6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.withMinute((int) (short) 1);
        java.time.LocalTime localTime11 = offsetDateTime10.toLocalTime();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        int int13 = localDate12.lengthOfYear();
        java.time.LocalDate localDate14 = java.time.LocalDate.MIN;
        boolean boolean15 = localDate12.isAfter((java.time.chrono.ChronoLocalDate) localDate14);
        java.time.LocalDateTime localDateTime16 = localTime11.atDate(localDate12);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset18 = offsetDateTime17.getOffset();
        java.time.ZonedDateTime zonedDateTime19 = localDateTime16.atZone((java.time.ZoneId) zoneOffset18);
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules21 = zoneOffset20.getRules();
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset20);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime25 = java.time.ZonedDateTime.ofStrict(localDateTime16, zoneOffset20, (java.time.ZoneId) zoneOffset24);
        javax.security.auth.Subject subject26 = new javax.security.auth.Subject();
        java.lang.Object obj27 = properties7.putIfAbsent((java.lang.Object) zoneOffset24, (java.lang.Object) subject26);
        boolean boolean28 = optionalLong5.equals((java.lang.Object) subject26);
        subject26.setReadOnly();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 365 + "'", int13 == 365);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(zoneRules21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        boolean boolean13 = offsetDateTime9.isEqual(offsetDateTime11);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long15 = offsetDateTime9.getLong((java.time.temporal.TemporalField) chronoField14);
        boolean boolean16 = chronoField14.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField14.getRangeUnit();
        java.time.LocalTime localTime18 = localTime3.truncatedTo(temporalUnit17);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.from((java.time.temporal.TemporalAccessor) localTime18);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZoneOffset from TemporalAccessor: 00:00 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Clock clock2 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset0);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.Period period5 = java.time.Period.ofMonths((-1));
        java.time.Period period7 = period5.minusDays((long) '#');
        boolean boolean8 = offsetTime3.equals((java.lang.Object) period5);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules10 = zoneOffset9.getRules();
        java.time.Clock clock11 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset9);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.now(clock11);
        boolean boolean13 = offsetTime3.isAfter(offsetTime12);
        java.time.OffsetTime offsetTime15 = offsetTime3.plusMinutes(0L);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.OffsetTime offsetTime18 = offsetTime3.with((java.time.temporal.TemporalField) chronoField16, (long) 16384);
        int int19 = offsetTime18.getNano();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField16.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16384000 + "'", int19 == 16384000);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isMCSiteLocal();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.time.Duration duration1 = java.time.Duration.ofDays((long) (short) -1);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition1 = new java.text.FieldPosition(field0);
        boolean boolean3 = fieldPosition1.equals((java.lang.Object) 365);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        int int2 = properties1.size();
        java.io.PrintStream printStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties1.list(printStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("Subject:\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.text.Format.Field field7 = null;
        java.text.FieldPosition fieldPosition8 = new java.text.FieldPosition(field7);
        java.nio.file.attribute.FileTime fileTime10 = java.nio.file.attribute.FileTime.fromMillis((long) (short) 0);
        java.lang.Object[] objArray11 = new java.lang.Object[] { '#', (byte) 10, (byte) 1, 1.0d, fieldPosition8, fileTime10 };
        java.net.UnknownHostException unknownHostException13 = new java.net.UnknownHostException("hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "Higham-Hall 5(4)", objArray11, (java.lang.Throwable) unknownHostException13);
        java.io.IOException iOException15 = new java.io.IOException("Higham-Hall 5(4)", (java.lang.Throwable) functionEvaluationException14);
        org.junit.Assert.assertNotNull(fileTime10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((long) 4096);
        java.time.temporal.TemporalAmount temporalAmount11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime12 = localDateTime10.plus(temporalAmount11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amountToAdd");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime5 = localTime3.withMinute(116000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 116000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset4 = offsetDateTime3.getOffset();
        boolean boolean5 = offsetDateTime1.isEqual(offsetDateTime3);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long7 = offsetDateTime1.getLong((java.time.temporal.TemporalField) chronoField6);
        boolean boolean8 = chronoField6.isDateBased();
        java.time.temporal.ValueRange valueRange9 = offsetDateTime0.range((java.time.temporal.TemporalField) chronoField6);
        java.time.temporal.TemporalUnit temporalUnit10 = chronoField6.getBaseUnit();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField6.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertTrue("'" + temporalUnit10 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit10.equals(java.time.temporal.ChronoUnit.HOURS));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        // The following exception was thrown during execution in test generation
        try {
            java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByIndex((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Interface index can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MINUTES;
        java.lang.Thread thread1 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeUnit0.timedJoin(thread1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeUnit0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.IntStream intStream2 = intStream1.sequential();
        java.util.Iterator<java.lang.Integer> intItor3 = intStream1.iterator();
        java.util.function.IntPredicate intPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = intStream1.anyMatch(intPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intItor3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.print((float) (-1L));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("-999999999-01-01", "", 365, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: -999999999-01-01");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Month month4 = offsetDateTime0.getMonth();
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime7.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTime10.withOffsetSameInstant(zoneOffset12);
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset15 = offsetDateTime14.getOffset();
        boolean boolean16 = zoneOffset12.equals((java.lang.Object) zoneOffset15);
        java.time.ZonedDateTime zonedDateTime17 = offsetDateTime7.atZoneSimilarLocal((java.time.ZoneId) zoneOffset15);
        java.time.Period period19 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology20 = period19.getChronology();
        java.time.Period period22 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoPeriod chronoPeriod23 = period19.minus((java.time.temporal.TemporalAmount) period22);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime24 = zonedDateTime17.minus((java.time.temporal.TemporalAmount) period22);
        java.time.temporal.Temporal temporal25 = month4.adjustInto((java.time.temporal.Temporal) zonedDateTime17);
        int int26 = month4.getValue();
        int int28 = month4.length(false);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.FEBRUARY + "'", month4.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(chronoPeriod23);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime24);
        org.junit.Assert.assertNotNull(temporal25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 28 + "'", int28 == 28);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.nio.channels.AsynchronousCloseException asynchronousCloseException0 = new java.nio.channels.AsynchronousCloseException();
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException((java.lang.Throwable) asynchronousCloseException0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress[] inetAddressArray1 = java.net.InetAddress.getAllByName("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.format.DecimalStyle decimalStyle1 = java.time.format.DecimalStyle.ofDefaultLocale();
        char char2 = decimalStyle1.getZeroDigit();
        boolean boolean4 = decimalStyle1.equals((java.lang.Object) (byte) 1);
        java.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withDecimalStyle(decimalStyle1);
        char char6 = decimalStyle1.getPositiveSign();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '+' + "'", char6 == '+');
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(16384, (int) '#');
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException("Monday, February 21, 2022");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "-999999999-01-01");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        char char0 = java.text.CharacterIterator.DONE;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\uffff' + "'", char0 == '\uffff');
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        long[] longArray3 = new long[] { 10L, 'a', 1 };
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray3);
        int int5 = longBuffer4.arrayOffset();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 97, 1]");
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Clock clock2 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset0);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.Period period5 = java.time.Period.ofMonths((-1));
        java.time.Period period7 = period5.minusDays((long) '#');
        boolean boolean8 = offsetTime3.equals((java.lang.Object) period5);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules10 = zoneOffset9.getRules();
        java.time.Clock clock11 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset9);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.now(clock11);
        boolean boolean13 = offsetTime3.isAfter(offsetTime12);
        java.time.OffsetTime offsetTime15 = offsetTime3.plusMinutes(0L);
        java.time.OffsetTime offsetTime17 = offsetTime3.plusSeconds((long) (short) 0);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertNotNull(offsetTime17);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        int[] intArray6 = new int[] { 2, 28, 'a', (short) 10, 'a', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer9 = java.nio.IntBuffer.wrap(intArray6, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[2, 28, 97, 10, 97, 0]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.lang.String str2 = localDate0.toString();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        int int4 = localDate3.lengthOfYear();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        boolean boolean6 = localDate3.isAfter((java.time.chrono.ChronoLocalDate) localDate5);
        java.time.Period period8 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate9 = localDate3.minus((java.time.temporal.TemporalAmount) period8);
        long long10 = localDate3.toEpochDay();
        java.time.LocalDate localDate11 = localDate0.with((java.time.temporal.TemporalAdjuster) localDate3);
        java.time.DayOfWeek dayOfWeek12 = localDate3.getDayOfWeek();
        java.time.temporal.TemporalField temporalField13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dayOfWeek12.get(temporalField13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: field");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(chronoLocalDate9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-365243219162L) + "'", long10 == (-365243219162L));
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + dayOfWeek12 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek12.equals(java.time.DayOfWeek.MONDAY));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime3 = java.time.LocalTime.of(4096, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 4096");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset13 = zoneRules1.getOffset(localDateTime12);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime17 = offsetDateTime15.withMinute((int) (short) 1);
        java.time.LocalTime localTime18 = offsetDateTime17.toLocalTime();
        java.time.LocalDate localDate19 = java.time.LocalDate.MIN;
        int int20 = localDate19.lengthOfYear();
        java.time.LocalDate localDate21 = java.time.LocalDate.MIN;
        boolean boolean22 = localDate19.isAfter((java.time.chrono.ChronoLocalDate) localDate21);
        java.time.LocalDateTime localDateTime23 = localTime18.atDate(localDate19);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset25 = offsetDateTime24.getOffset();
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset27 = offsetDateTime26.getOffset();
        boolean boolean28 = offsetDateTime24.isEqual(offsetDateTime26);
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long30 = offsetDateTime24.getLong((java.time.temporal.TemporalField) chronoField29);
        boolean boolean31 = chronoField29.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit32 = chronoField29.getRangeUnit();
        java.time.LocalTime localTime33 = localTime18.truncatedTo(temporalUnit32);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime34 = localDateTime12.plus(730486476412L, temporalUnit32);
        java.time.Period period36 = java.time.Period.ofMonths((-1));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        boolean boolean42 = period36.equals((java.lang.Object) 10L);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime43 = localDateTime12.plus((java.time.temporal.TemporalAmount) period36);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList44 = period36.getUnits();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 365 + "'", int20 == 365);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField29.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit32 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit32.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime43);
        org.junit.Assert.assertNotNull(temporalUnitList44);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Month month4 = offsetDateTime0.getMonth();
        int int5 = offsetDateTime0.getMinute();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.FEBRUARY + "'", month4.equals(java.time.Month.FEBRUARY));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 13 + "'", int5 == 13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap1 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet2 = formatStyleEnumMap1.keySet();
        java.time.format.FormatStyle formatStyle3 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle3);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList5 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean6 = formatStyleEnumList5.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle3);
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream7 = formatStyleEnumList5.parallelStream();
        boolean boolean8 = formatStyleEnumSet2.removeAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumList5);
        java.util.Iterator<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumItor9 = formatStyleEnumSet2.iterator();
        org.junit.Assert.assertNotNull(formatStyleEnumSet2);
        org.junit.Assert.assertTrue("'" + formatStyle3 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle3.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(formatStyleEnumStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(formatStyleEnumItor9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.Enumeration<java.net.NetworkInterface> networkInterfaceEnumeration0 = java.net.NetworkInterface.getNetworkInterfaces();
        org.junit.Assert.assertNotNull(networkInterfaceEnumeration0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset1 = offsetDateTime0.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.minusWeeks((long) 16);
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.format.DecimalStyle decimalStyle5 = java.time.format.DecimalStyle.ofDefaultLocale();
        char char6 = decimalStyle5.getZeroDigit();
        boolean boolean8 = decimalStyle5.equals((java.lang.Object) (byte) 1);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withDecimalStyle(decimalStyle5);
        java.lang.String str10 = offsetDateTime3.format(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(decimalStyle5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "09:13:58.976Z" + "'", str10, "09:13:58.976Z");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.lang.String str2 = localDate0.toString();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = localDate0.isBefore((java.time.chrono.ChronoLocalDate) localDate3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime9 = localDate0.atTime(116000000, (int) (short) 1, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 116000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MINUTES;
        long long2 = timeUnit0.toMillis((long) (short) -1);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-60000L) + "'", long2 == (-60000L));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.time.Instant instant0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = java.util.Date.from(instant0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "Higham-Hall 5(4)");
        java.io.File file3 = null;
        java.io.File file5 = new java.io.File(file3, "Higham-Hall 5(4)");
        java.lang.String str6 = file5.getParent();
        int int7 = file2.compareTo(file5);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.lang.String str2 = localDate0.toString();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        int int4 = localDate3.lengthOfYear();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        boolean boolean6 = localDate3.isAfter((java.time.chrono.ChronoLocalDate) localDate5);
        java.time.Period period8 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate9 = localDate3.minus((java.time.temporal.TemporalAmount) period8);
        long long10 = localDate3.toEpochDay();
        java.time.LocalDate localDate11 = localDate0.with((java.time.temporal.TemporalAdjuster) localDate3);
        java.time.DayOfWeek dayOfWeek12 = localDate3.getDayOfWeek();
        java.time.format.TextStyle textStyle13 = java.time.format.TextStyle.NARROW_STANDALONE;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dayOfWeek12.getDisplayName(textStyle13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: locale");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(chronoLocalDate9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-365243219162L) + "'", long10 == (-365243219162L));
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + dayOfWeek12 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek12.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + textStyle13 + "' != '" + java.time.format.TextStyle.NARROW_STANDALONE + "'", textStyle13.equals(java.time.format.TextStyle.NARROW_STANDALONE));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        doubleStream0.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble2 = doubleStream0.max();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "zh_CN");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.Set<java.time.chrono.Chronology> chronologySet0 = java.time.chrono.Chronology.getAvailableChronologies();
        org.junit.Assert.assertNotNull(chronologySet0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.lang.String str2 = localDate0.toString();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        int int4 = localDate3.lengthOfYear();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        boolean boolean6 = localDate3.isAfter((java.time.chrono.ChronoLocalDate) localDate5);
        java.time.Period period8 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate9 = localDate3.minus((java.time.temporal.TemporalAmount) period8);
        long long10 = localDate3.toEpochDay();
        java.time.LocalDate localDate11 = localDate0.with((java.time.temporal.TemporalAdjuster) localDate3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate13 = localDate3.plusDays((-31557014135564285L));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -86401170121396");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(chronoLocalDate9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-365243219162L) + "'", long10 == (-365243219162L));
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset13 = zoneRules1.getOffset(localDateTime12);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime17 = offsetDateTime15.withMinute((int) (short) 1);
        java.time.LocalTime localTime18 = offsetDateTime17.toLocalTime();
        java.time.LocalDate localDate19 = java.time.LocalDate.MIN;
        int int20 = localDate19.lengthOfYear();
        java.time.LocalDate localDate21 = java.time.LocalDate.MIN;
        boolean boolean22 = localDate19.isAfter((java.time.chrono.ChronoLocalDate) localDate21);
        java.time.LocalDateTime localDateTime23 = localTime18.atDate(localDate19);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset25 = offsetDateTime24.getOffset();
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset27 = offsetDateTime26.getOffset();
        boolean boolean28 = offsetDateTime24.isEqual(offsetDateTime26);
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long30 = offsetDateTime24.getLong((java.time.temporal.TemporalField) chronoField29);
        boolean boolean31 = chronoField29.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit32 = chronoField29.getRangeUnit();
        java.time.LocalTime localTime33 = localTime18.truncatedTo(temporalUnit32);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime34 = localDateTime12.plus(730486476412L, temporalUnit32);
        java.time.Period period36 = java.time.Period.ofMonths((-1));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        boolean boolean42 = period36.equals((java.lang.Object) 10L);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime43 = localDateTime12.plus((java.time.temporal.TemporalAmount) period36);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList44 = period36.getUnits();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 365 + "'", int20 == 365);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField29.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit32 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit32.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime43);
        org.junit.Assert.assertNotNull(temporalUnitList44);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset5 = offsetDateTime4.getOffset();
        boolean boolean6 = zoneOffset2.equals((java.lang.Object) zoneOffset5);
        java.time.Clock clock7 = java.time.Clock.system((java.time.ZoneId) zoneOffset5);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(clock7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.time.Duration duration0 = java.time.Duration.ZERO;
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList1 = duration0.getUnits();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(temporalUnitList1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress2 = java.net.InetAddress.getByAddress(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "09:13:58.976Z");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '09:13:58.976Z' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset1 = offsetDateTime0.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.minusWeeks((long) 16);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.withMinute((int) (short) 1);
        java.time.LocalTime localTime8 = offsetDateTime7.toLocalTime();
        java.time.LocalDate localDate9 = java.time.LocalDate.MIN;
        int int10 = localDate9.lengthOfYear();
        java.time.LocalDate localDate11 = java.time.LocalDate.MIN;
        boolean boolean12 = localDate9.isAfter((java.time.chrono.ChronoLocalDate) localDate11);
        java.time.LocalDateTime localDateTime13 = localTime8.atDate(localDate9);
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset15 = offsetDateTime14.getOffset();
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset17 = offsetDateTime16.getOffset();
        boolean boolean18 = offsetDateTime14.isEqual(offsetDateTime16);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long20 = offsetDateTime14.getLong((java.time.temporal.TemporalField) chronoField19);
        boolean boolean21 = chronoField19.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit22 = chronoField19.getRangeUnit();
        java.time.LocalTime localTime23 = localTime8.truncatedTo(temporalUnit22);
        java.time.Duration duration24 = java.time.Duration.of(0L, temporalUnit22);
        java.time.Duration duration26 = duration24.minusNanos(9L);
        java.time.OffsetDateTime offsetDateTime27 = offsetDateTime3.minus((java.time.temporal.TemporalAmount) duration26);
        java.time.temporal.TemporalField temporalField28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange29 = offsetDateTime27.range(temporalField28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField19.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9L + "'", long20 == 9L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit22 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit22.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        int int2 = floatBuffer1.arrayOffset();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.close();
        printWriter1.print((double) 1645434836016L);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter8 = printWriter1.append((java.lang.CharSequence) "", 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        int int2 = localDate1.lengthOfYear();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        java.time.Period period5 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate1);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList6 = period5.getUnits();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(temporalUnitList6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        boolean boolean1 = locale0.hasExtensions();
        java.time.format.FormatStyle formatStyle2 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter3 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle2);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList4 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean5 = formatStyleEnumList4.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle2);
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream6 = formatStyleEnumList4.parallelStream();
        boolean boolean8 = formatStyleEnumList4.remove((java.lang.Object) 10.0d);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap12);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator14 = languageRangeList10.spliterator();
        java.time.format.FormatStyle formatStyle15 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter16 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle15);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList17 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean18 = formatStyleEnumList17.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle15);
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream19 = formatStyleEnumList17.parallelStream();
        java.time.format.FormatStyle formatStyle20 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter21 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle20);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList22 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean23 = formatStyleEnumList22.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle20);
        java.time.format.FormatStyle formatStyle24 = java.time.format.FormatStyle.FULL;
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList25 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean26 = formatStyleEnumList25.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle24);
        boolean boolean27 = formatStyleEnumList22.retainAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumList25);
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap29 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet30 = formatStyleEnumMap29.keySet();
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap32 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet33 = formatStyleEnumMap32.keySet();
        boolean boolean34 = formatStyleEnumSet30.retainAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet33);
        boolean boolean35 = formatStyleEnumList25.containsAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet33);
        boolean boolean36 = formatStyleEnumList17.removeAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet33);
        java.util.Properties properties37 = null;
        java.util.Properties properties38 = new java.util.Properties(properties37);
        java.time.OffsetDateTime offsetDateTime39 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime41 = offsetDateTime39.withMinute((int) (short) 1);
        java.time.LocalTime localTime42 = offsetDateTime41.toLocalTime();
        java.time.LocalDate localDate43 = java.time.LocalDate.MIN;
        int int44 = localDate43.lengthOfYear();
        java.time.LocalDate localDate45 = java.time.LocalDate.MIN;
        boolean boolean46 = localDate43.isAfter((java.time.chrono.ChronoLocalDate) localDate45);
        java.time.LocalDateTime localDateTime47 = localTime42.atDate(localDate43);
        java.time.OffsetDateTime offsetDateTime48 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset49 = offsetDateTime48.getOffset();
        java.time.ZonedDateTime zonedDateTime50 = localDateTime47.atZone((java.time.ZoneId) zoneOffset49);
        java.time.ZoneOffset zoneOffset51 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules52 = zoneOffset51.getRules();
        java.time.LocalDateTime localDateTime53 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset51);
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime56 = java.time.ZonedDateTime.ofStrict(localDateTime47, zoneOffset51, (java.time.ZoneId) zoneOffset55);
        javax.security.auth.Subject subject57 = new javax.security.auth.Subject();
        java.lang.Object obj58 = properties38.putIfAbsent((java.lang.Object) zoneOffset55, (java.lang.Object) subject57);
        java.lang.Cloneable[] cloneableArray59 = new java.lang.Cloneable[] { locale0, formatStyleEnumList4, languageRangeList10, formatStyleEnumList17, properties38 };
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream60 = java.util.stream.Stream.of(cloneableArray59);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + formatStyle2 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle2.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(formatStyleEnumStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeSpliterator14);
        org.junit.Assert.assertTrue("'" + formatStyle15 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle15.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(formatStyleEnumStream19);
        org.junit.Assert.assertTrue("'" + formatStyle20 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle20.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + formatStyle24 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle24.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(formatStyleEnumSet30);
        org.junit.Assert.assertNotNull(formatStyleEnumSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(offsetDateTime39);
        org.junit.Assert.assertNotNull(offsetDateTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 365 + "'", int44 == 365);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(offsetDateTime48);
        org.junit.Assert.assertNotNull(zoneOffset49);
        org.junit.Assert.assertNotNull(zonedDateTime50);
        org.junit.Assert.assertNotNull(zoneOffset51);
        org.junit.Assert.assertNotNull(zoneRules52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertNotNull(zonedDateTime56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(cloneableArray59);
        org.junit.Assert.assertNotNull(cloneableStream60);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTime11.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        java.time.OffsetDateTime offsetDateTime17 = offsetDateTime14.withOffsetSameInstant(zoneOffset16);
        java.time.OffsetDateTime offsetDateTime18 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset19 = offsetDateTime18.getOffset();
        boolean boolean20 = zoneOffset16.equals((java.lang.Object) zoneOffset19);
        java.time.ZonedDateTime zonedDateTime21 = offsetDateTime11.atZoneSimilarLocal((java.time.ZoneId) zoneOffset19);
        java.time.LocalDate localDate22 = java.time.LocalDate.MIN;
        int int23 = localDate22.lengthOfYear();
        java.time.LocalDate localDate24 = java.time.LocalDate.MIN;
        boolean boolean25 = localDate22.isAfter((java.time.chrono.ChronoLocalDate) localDate24);
        java.time.Period period27 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate28 = localDate22.minus((java.time.temporal.TemporalAmount) period27);
        java.time.Period period30 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology31 = period30.getChronology();
        java.time.Period period32 = period27.plus((java.time.temporal.TemporalAmount) period30);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime33 = zonedDateTime21.minus((java.time.temporal.TemporalAmount) period32);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime34 = localTime3.minus((java.time.temporal.TemporalAmount) period32);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 365 + "'", int23 == 365);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(chronoLocalDate28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime33);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules6 = zoneOffset5.getRules();
        int int7 = zoneOffset4.compareTo(zoneOffset5);
        java.time.ZonedDateTime zonedDateTime8 = offsetDateTime0.atZoneSimilarLocal((java.time.ZoneId) zoneOffset4);
        java.time.chrono.Chronology chronology9 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) offsetDateTime0);
        java.time.chrono.Era era10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate13 = chronology9.dateYearDay(era10, 2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Era must be IsoEra");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(zoneRules6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException0 = new java.security.NoSuchAlgorithmException();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        double[] doubleArray6 = new double[] { 100.0f, 10L, 1, 365, (-1.0d), 100L };
        java.nio.DoubleBuffer doubleBuffer9 = java.nio.DoubleBuffer.wrap(doubleArray6, (int) (byte) 0, (int) (byte) 0);
        double[] doubleArray14 = new double[] { (-31557014135564281L), 100.0f, 100.0f, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer15 = doubleBuffer9.get(doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0, 365.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleBuffer9);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-3.155701413556428E16, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer3 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "hi!", 16464, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.ofOffset("Chinese", zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prefix should be GMT, UTC or UT, is: Chinese");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset4 = offsetDateTime3.getOffset();
        boolean boolean5 = offsetDateTime1.isEqual(offsetDateTime3);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long7 = offsetDateTime1.getLong((java.time.temporal.TemporalField) chronoField6);
        boolean boolean8 = chronoField6.isDateBased();
        java.time.temporal.ValueRange valueRange9 = offsetDateTime0.range((java.time.temporal.TemporalField) chronoField6);
        boolean boolean10 = chronoField6.isDateBased();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField6.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        // The following exception was thrown during execution in test generation
        try {
            float float3 = floatBuffer1.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange3 = java.time.temporal.ValueRange.of((long) (short) 10, 1645434836016L, (long) 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.write(byteArray4, 4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 10]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset4 = offsetDateTime3.getOffset();
        boolean boolean5 = offsetDateTime1.isEqual(offsetDateTime3);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long7 = offsetDateTime1.getLong((java.time.temporal.TemporalField) chronoField6);
        boolean boolean8 = chronoField6.isDateBased();
        java.time.temporal.ValueRange valueRange9 = offsetDateTime0.range((java.time.temporal.TemporalField) chronoField6);
        long long10 = valueRange9.getMaximum();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField6.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 12L + "'", long10 == 12L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Clock clock2 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset0);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        int int4 = offsetTime3.getHour();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayName();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.time.format.DecimalStyle decimalStyle4 = java.time.format.DecimalStyle.of(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(decimalStyle4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.time.Period period1 = java.time.Period.ofDays(0);
        java.time.Period period3 = period1.plusDays((long) 1);
        int int4 = period1.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules6 = zoneOffset5.getRules();
        int int7 = zoneOffset4.compareTo(zoneOffset5);
        java.time.ZonedDateTime zonedDateTime8 = offsetDateTime0.atZoneSimilarLocal((java.time.ZoneId) zoneOffset4);
        java.time.chrono.Chronology chronology9 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) offsetDateTime0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate12 = chronology9.dateYearDay(116000000, 16384000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 16384000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(zoneRules6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.minusHours((long) ' ');
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime0);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime0.minusSeconds((long) 4096);
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime0.withNano((int) (byte) 10);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        doubleStream0.close();
        java.util.function.DoublePredicate doublePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = doubleStream0.filter(doublePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        double[] doubleArray6 = new double[] { 100.0f, 10L, 1, 365, (-1.0d), 100L };
        java.nio.DoubleBuffer doubleBuffer9 = java.nio.DoubleBuffer.wrap(doubleArray6, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer12 = java.nio.DoubleBuffer.wrap(doubleArray6, (int) ':', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0, 365.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleBuffer9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.close();
        printWriter1.println((float) 0);
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.setDefault(locale6);
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator10 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.text.Format.Field field11 = null;
        java.text.FieldPosition fieldPosition12 = new java.text.FieldPosition(field11);
        fieldPosition12.setBeginIndex((int) ' ');
        java.nio.ByteOrder byteOrder15 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.lang.Object[] objArray16 = new java.lang.Object[] { wildcardChronoZonedDateTimeComparator10, ' ', byteOrder15 };
        java.io.PrintWriter printWriter17 = printWriter1.printf(locale6, "", objArray16);
        printWriter17.write("");
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer23 = printWriter17.append((java.lang.CharSequence) "-999999999-01-01", 1024, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator10);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(printWriter17);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.time.format.FormatStyle formatStyle5 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter6 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle5);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList7 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean8 = formatStyleEnumList7.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle5);
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream9 = formatStyleEnumList7.parallelStream();
        boolean boolean11 = formatStyleEnumList7.remove((java.lang.Object) 10.0d);
        int int12 = languageRangeList4.lastIndexOf((java.lang.Object) formatStyleEnumList7);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + formatStyle5 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle5.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(formatStyleEnumStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("-999999999-01-01", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "Higham-Hall 5(4)");
        java.lang.String str3 = file2.getParent();
        long long4 = file2.getFreeSpace();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.lang.String str2 = localDate0.toString();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        int int4 = localDate3.lengthOfYear();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        boolean boolean6 = localDate3.isAfter((java.time.chrono.ChronoLocalDate) localDate5);
        java.time.Period period8 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate9 = localDate3.minus((java.time.temporal.TemporalAmount) period8);
        long long10 = localDate3.toEpochDay();
        java.time.LocalDate localDate11 = localDate0.with((java.time.temporal.TemporalAdjuster) localDate3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = localDate11.atTime(4, (int) (short) -1, 16384);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(chronoLocalDate9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-365243219162L) + "'", long10 == (-365243219162L));
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        boolean boolean13 = offsetDateTime9.isEqual(offsetDateTime11);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long15 = offsetDateTime9.getLong((java.time.temporal.TemporalField) chronoField14);
        boolean boolean16 = chronoField14.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField14.getRangeUnit();
        java.time.LocalTime localTime18 = localTime3.truncatedTo(temporalUnit17);
        java.time.LocalTime localTime20 = localTime3.withSecond(10);
        java.time.OffsetDateTime offsetDateTime22 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset24 = offsetDateTime23.getOffset();
        java.time.OffsetDateTime offsetDateTime25 = offsetDateTime22.withOffsetSameInstant(zoneOffset24);
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules28 = zoneOffset27.getRules();
        int int29 = zoneOffset26.compareTo(zoneOffset27);
        java.time.ZonedDateTime zonedDateTime30 = offsetDateTime22.atZoneSimilarLocal((java.time.ZoneId) zoneOffset26);
        java.time.chrono.Chronology chronology31 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) offsetDateTime22);
        java.time.ZoneOffset zoneOffset33 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules34 = zoneOffset33.getRules();
        java.time.OffsetDateTime offsetDateTime35 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime37 = offsetDateTime35.withMinute((int) (short) 1);
        java.time.LocalTime localTime38 = offsetDateTime37.toLocalTime();
        java.time.LocalDate localDate39 = java.time.LocalDate.MIN;
        int int40 = localDate39.lengthOfYear();
        java.time.LocalDate localDate41 = java.time.LocalDate.MIN;
        boolean boolean42 = localDate39.isAfter((java.time.chrono.ChronoLocalDate) localDate41);
        java.time.LocalDateTime localDateTime43 = localTime38.atDate(localDate39);
        java.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset46 = zoneRules34.getOffset(localDateTime45);
        java.time.OffsetDateTime offsetDateTime48 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime50 = offsetDateTime48.withMinute((int) (short) 1);
        java.time.LocalTime localTime51 = offsetDateTime50.toLocalTime();
        java.time.LocalDate localDate52 = java.time.LocalDate.MIN;
        int int53 = localDate52.lengthOfYear();
        java.time.LocalDate localDate54 = java.time.LocalDate.MIN;
        boolean boolean55 = localDate52.isAfter((java.time.chrono.ChronoLocalDate) localDate54);
        java.time.LocalDateTime localDateTime56 = localTime51.atDate(localDate52);
        java.time.OffsetDateTime offsetDateTime57 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset58 = offsetDateTime57.getOffset();
        java.time.OffsetDateTime offsetDateTime59 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset60 = offsetDateTime59.getOffset();
        boolean boolean61 = offsetDateTime57.isEqual(offsetDateTime59);
        java.time.temporal.ChronoField chronoField62 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long63 = offsetDateTime57.getLong((java.time.temporal.TemporalField) chronoField62);
        boolean boolean64 = chronoField62.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit65 = chronoField62.getRangeUnit();
        java.time.LocalTime localTime66 = localTime51.truncatedTo(temporalUnit65);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime67 = localDateTime45.plus(730486476412L, temporalUnit65);
        java.time.OffsetDateTime offsetDateTime68 = offsetDateTime22.plus((long) 1024, temporalUnit65);
        java.time.LocalTime localTime69 = localTime3.minus((long) '4', temporalUnit65);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(zoneRules28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertNotNull(zoneRules34);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(offsetDateTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 365 + "'", int40 == 365);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(zoneOffset46);
        org.junit.Assert.assertNotNull(offsetDateTime48);
        org.junit.Assert.assertNotNull(offsetDateTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 365 + "'", int53 == 365);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(offsetDateTime57);
        org.junit.Assert.assertNotNull(zoneOffset58);
        org.junit.Assert.assertNotNull(offsetDateTime59);
        org.junit.Assert.assertNotNull(zoneOffset60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + chronoField62 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField62.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 9L + "'", long63 == 9L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit65 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit65.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime67);
        org.junit.Assert.assertNotNull(offsetDateTime68);
        org.junit.Assert.assertNotNull(localTime69);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        int int2 = localDate1.lengthOfYear();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        java.time.Period period5 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.withMinute((int) (short) 1);
        java.time.LocalTime localTime9 = offsetDateTime8.toLocalTime();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        int int11 = localDate10.lengthOfYear();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        boolean boolean13 = localDate10.isAfter((java.time.chrono.ChronoLocalDate) localDate12);
        java.time.LocalDateTime localDateTime14 = localTime9.atDate(localDate10);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset18 = offsetDateTime17.getOffset();
        boolean boolean19 = offsetDateTime15.isEqual(offsetDateTime17);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long21 = offsetDateTime15.getLong((java.time.temporal.TemporalField) chronoField20);
        boolean boolean22 = chronoField20.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit23 = chronoField20.getRangeUnit();
        java.time.LocalTime localTime24 = localTime9.truncatedTo(temporalUnit23);
        java.time.LocalDateTime localDateTime25 = localDate1.atTime(localTime24);
        java.time.LocalTime localTime27 = localTime24.plusMinutes((long) ' ');
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField20.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9L + "'", long21 == 9L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit23 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit23.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList4.spliterator();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        boolean boolean7 = languageRangeList4.equals((java.lang.Object) locale6);
        java.util.Set<java.lang.String> strSet8 = java.time.ZoneId.getAvailableZoneIds();
        java.util.Locale.FilteringMode filteringMode9 = null;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet8, filteringMode9);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        java.time.ZonedDateTime zonedDateTime13 = localDateTime10.atZone((java.time.ZoneId) zoneOffset12);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules15 = zoneOffset14.getRules();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset14);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.ofStrict(localDateTime10, zoneOffset14, (java.time.ZoneId) zoneOffset18);
        javax.security.auth.Subject subject20 = new javax.security.auth.Subject();
        java.lang.Object obj21 = properties1.putIfAbsent((java.lang.Object) zoneOffset18, (java.lang.Object) subject20);
        java.io.InputStream inputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties1.loadFromXML(inputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneRules15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress5 = java.net.InetAddress.getByAddress("Monday, February 21, 2022", byteArray4);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, 100]");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.fromMillis((long) 1024);
        org.junit.Assert.assertNotNull(fileTime1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        java.lang.String str5 = highamHall54Integrator4.getName();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations5 = null;
        double[] doubleArray12 = new double[] { 10.0f, (-1L), 1.0d, (short) 10, (byte) 10 };
        double[] doubleArray20 = new double[] { 100.0f, 10L, 1, 365, (-1.0d), 100L };
        java.nio.DoubleBuffer doubleBuffer23 = java.nio.DoubleBuffer.wrap(doubleArray20, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            highamHall54Integrator4.integrate(firstOrderDifferentialEquations5, (double) '0', doubleArray12, Double.NaN, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -1.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 10.0, 1.0, 365.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleBuffer23);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        boolean boolean3 = localDate0.isAfter((java.time.chrono.ChronoLocalDate) localDate2);
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        int int6 = localDate5.lengthOfYear();
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        boolean boolean8 = localDate5.isAfter((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.Period period10 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate11 = localDate5.minus((java.time.temporal.TemporalAmount) period10);
        java.time.chrono.ChronoPeriod chronoPeriod12 = localDate4.until(chronoLocalDate11);
        boolean boolean13 = localDate2.isEqual((java.time.chrono.ChronoLocalDate) localDate4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate15 = localDate2.minusDays((long) '#');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(chronoLocalDate11);
        org.junit.Assert.assertNotNull(chronoPeriod12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        long[] longArray3 = new long[] { 10L, 'a', 1 };
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray3);
        java.nio.LongBuffer longBuffer6 = longBuffer4.put((long) (short) 100);
        long[] longArray11 = new long[] { 9L, 16464, 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer12 = longBuffer6.put(longArray11);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 97, 1]");
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longBuffer6);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[9, 16464, 10, 100]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.minusHours((long) ' ');
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime0);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime3.withLaterOffsetAtOverlap();
        java.time.temporal.TemporalAmount temporalAmount5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime6 = localDateChronoZonedDateTime4.plus(temporalAmount5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amountToAdd");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.time.Month month0 = java.time.Month.AUGUST;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.AUGUST + "'", month0.equals(java.time.Month.AUGUST));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.security.cert.CertificateException certificateException1 = new java.security.cert.CertificateException("Chinese");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset7 = offsetDateTime6.getOffset();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime5.withOffsetSameInstant(zoneOffset7);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        boolean boolean11 = zoneOffset7.equals((java.lang.Object) zoneOffset10);
        java.time.ZonedDateTime zonedDateTime12 = offsetDateTime2.atZoneSimilarLocal((java.time.ZoneId) zoneOffset10);
        java.time.Period period14 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology15 = period14.getChronology();
        java.time.Period period17 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoPeriod chronoPeriod18 = period14.minus((java.time.temporal.TemporalAmount) period17);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime19 = zonedDateTime12.minus((java.time.temporal.TemporalAmount) period17);
        java.lang.String str20 = period17.toString();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(chronoPeriod18);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P-1M" + "'", str20, "P-1M");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        java.time.ZonedDateTime zonedDateTime13 = localDateTime10.atZone((java.time.ZoneId) zoneOffset12);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules15 = zoneOffset14.getRules();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset14);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.ofStrict(localDateTime10, zoneOffset14, (java.time.ZoneId) zoneOffset18);
        javax.security.auth.Subject subject20 = new javax.security.auth.Subject();
        java.lang.Object obj21 = properties1.putIfAbsent((java.lang.Object) zoneOffset18, (java.lang.Object) subject20);
        java.lang.Object obj22 = properties1.clone();
        java.io.OutputStream outputStream23 = null;
        java.io.FilterOutputStream filterOutputStream24 = new java.io.FilterOutputStream(outputStream23);
        // The following exception was thrown during execution in test generation
        try {
            properties1.store((java.io.OutputStream) filterOutputStream24, "BC");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.time.ZoneOffset cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneRules15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{Z=Subject:\n}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{Z=Subject:\n}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{Z=Subject:\n}");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.ZonedDateTime zonedDateTime11 = localDateTime8.atZone((java.time.ZoneId) zoneOffset10);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules13 = zoneOffset12.getRules();
        java.time.Clock clock14 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset12);
        long long15 = localDateTime8.toEpochSecond(zoneOffset12);
        java.time.LocalDateTime localDateTime17 = localDateTime8.plusNanos((long) 1024);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(zoneRules13);
        org.junit.Assert.assertNotNull(clock14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-31557014135564339L) + "'", long15 == (-31557014135564339L));
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.DoubleSummaryStatistics doubleSummaryStatistics0 = new java.util.DoubleSummaryStatistics();
        doubleSummaryStatistics0.accept((double) '#');
        doubleSummaryStatistics0.accept((double) 365);
        org.junit.Assert.assertEquals(doubleSummaryStatistics0.toString(), "DoubleSummaryStatistics{count=2, sum=400.000000, min=35.000000, average=200.000000, max=365.000000}");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        int int2 = floatBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer5 = floatBuffer1.put(16384, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) (-1), (double) (-60000L), 5);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        int int3 = languageRangeList1.size();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle0);
        java.lang.Class<?> wildcardClass2 = formatStyle0.getClass();
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle0.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.ZonedDateTime zonedDateTime11 = localDateTime8.atZone((java.time.ZoneId) zoneOffset10);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset14 = offsetDateTime13.getOffset();
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        boolean boolean17 = offsetDateTime13.isEqual(offsetDateTime15);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long19 = offsetDateTime13.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean20 = chronoField18.isDateBased();
        java.time.temporal.ValueRange valueRange21 = offsetDateTime12.range((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalUnit temporalUnit22 = chronoField18.getRangeUnit();
        java.time.ZonedDateTime zonedDateTime23 = zonedDateTime11.truncatedTo(temporalUnit22);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime25 = zonedDateTime11.withNano((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for NanoOfSecond (valid values 0 - 999999999): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField18.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(valueRange21);
        org.junit.Assert.assertTrue("'" + temporalUnit22 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit22.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(zonedDateTime23);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules6 = zoneOffset5.getRules();
        int int7 = zoneOffset4.compareTo(zoneOffset5);
        java.time.ZonedDateTime zonedDateTime8 = offsetDateTime0.atZoneSimilarLocal((java.time.ZoneId) zoneOffset4);
        java.time.temporal.TemporalField temporalField9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = offsetDateTime0.getLong(temporalField9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(zoneRules6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.stream.Collector.Characteristics characteristics0 = java.util.stream.Collector.Characteristics.UNORDERED;
        org.junit.Assert.assertTrue("'" + characteristics0 + "' != '" + java.util.stream.Collector.Characteristics.UNORDERED + "'", characteristics0.equals(java.util.stream.Collector.Characteristics.UNORDERED));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.ZonedDateTime zonedDateTime11 = localDateTime8.atZone((java.time.ZoneId) zoneOffset10);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime11.withEarlierOffsetAtOverlap();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime13 = zonedDateTime11.withEarlierOffsetAtOverlap();
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime16 = offsetDateTime14.withMinute((int) (short) 1);
        java.time.LocalTime localTime17 = offsetDateTime16.toLocalTime();
        java.time.LocalDate localDate18 = java.time.LocalDate.MIN;
        int int19 = localDate18.lengthOfYear();
        java.time.LocalDate localDate20 = java.time.LocalDate.MIN;
        boolean boolean21 = localDate18.isAfter((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.LocalDateTime localDateTime22 = localTime17.atDate(localDate18);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset24 = offsetDateTime23.getOffset();
        java.time.ZonedDateTime zonedDateTime25 = localDateTime22.atZone((java.time.ZoneId) zoneOffset24);
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules27 = zoneOffset26.getRules();
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset26);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime31 = java.time.ZonedDateTime.ofStrict(localDateTime22, zoneOffset26, (java.time.ZoneId) zoneOffset30);
        boolean boolean32 = zonedDateTime11.isEqual((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime31);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 365 + "'", int19 == 365);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(zoneRules27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.time.Month month0 = java.time.Month.JULY;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JULY + "'", month0.equals(java.time.Month.JULY));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "Higham-Hall 5(4)");
        java.nio.file.Path path3 = file2.toPath();
        java.io.File file4 = null;
        java.io.File file6 = new java.io.File(file4, "Higham-Hall 5(4)");
        java.nio.file.Path path7 = file6.toPath();
        int int8 = path3.compareTo(path7);
        java.nio.file.Path path9 = path3.getParent();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(path9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.net.URL uRL0 = null;
        java.net.URLStreamHandler uRLStreamHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL(uRL0, "Monday, February 21, 2022", uRLStreamHandler2);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: Monday, February 21, 2022");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.iterator();
        boolean boolean7 = languageRangeItor6.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.format.DecimalStyle decimalStyle1 = java.time.format.DecimalStyle.ofDefaultLocale();
        char char2 = decimalStyle1.getZeroDigit();
        boolean boolean4 = decimalStyle1.equals((java.lang.Object) (byte) 1);
        java.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withDecimalStyle(decimalStyle1);
        java.time.format.DateTimeFormatter dateTimeFormatter6 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.format.DecimalStyle decimalStyle7 = java.time.format.DecimalStyle.ofDefaultLocale();
        char char8 = decimalStyle7.getZeroDigit();
        boolean boolean10 = decimalStyle7.equals((java.lang.Object) (byte) 1);
        java.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withDecimalStyle(decimalStyle7);
        java.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter0.withDecimalStyle(decimalStyle7);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(decimalStyle1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(decimalStyle7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.lang.String str2 = localDate0.toString();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        int int4 = localDate3.lengthOfYear();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        boolean boolean6 = localDate3.isAfter((java.time.chrono.ChronoLocalDate) localDate5);
        java.time.Period period8 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate9 = localDate3.minus((java.time.temporal.TemporalAmount) period8);
        long long10 = localDate3.toEpochDay();
        java.time.LocalDate localDate11 = localDate0.with((java.time.temporal.TemporalAdjuster) localDate3);
        java.time.DayOfWeek dayOfWeek12 = localDate3.getDayOfWeek();
        java.time.chrono.Era era13 = localDate3.getEra();
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime17 = offsetDateTime15.minusHours((long) ' ');
        java.time.ZonedDateTime zonedDateTime18 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime15);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime19 = zonedDateTime18.withLaterOffsetAtOverlap();
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime22 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset23 = offsetDateTime22.getOffset();
        java.time.OffsetDateTime offsetDateTime24 = offsetDateTime21.withOffsetSameInstant(zoneOffset23);
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules27 = zoneOffset26.getRules();
        int int28 = zoneOffset25.compareTo(zoneOffset26);
        java.time.ZonedDateTime zonedDateTime29 = offsetDateTime21.atZoneSimilarLocal((java.time.ZoneId) zoneOffset25);
        java.time.chrono.Chronology chronology30 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) offsetDateTime21);
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules33 = zoneOffset32.getRules();
        java.time.OffsetDateTime offsetDateTime34 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime36 = offsetDateTime34.withMinute((int) (short) 1);
        java.time.LocalTime localTime37 = offsetDateTime36.toLocalTime();
        java.time.LocalDate localDate38 = java.time.LocalDate.MIN;
        int int39 = localDate38.lengthOfYear();
        java.time.LocalDate localDate40 = java.time.LocalDate.MIN;
        boolean boolean41 = localDate38.isAfter((java.time.chrono.ChronoLocalDate) localDate40);
        java.time.LocalDateTime localDateTime42 = localTime37.atDate(localDate38);
        java.time.LocalDateTime localDateTime44 = localDateTime42.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset45 = zoneRules33.getOffset(localDateTime44);
        java.time.OffsetDateTime offsetDateTime47 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime49 = offsetDateTime47.withMinute((int) (short) 1);
        java.time.LocalTime localTime50 = offsetDateTime49.toLocalTime();
        java.time.LocalDate localDate51 = java.time.LocalDate.MIN;
        int int52 = localDate51.lengthOfYear();
        java.time.LocalDate localDate53 = java.time.LocalDate.MIN;
        boolean boolean54 = localDate51.isAfter((java.time.chrono.ChronoLocalDate) localDate53);
        java.time.LocalDateTime localDateTime55 = localTime50.atDate(localDate51);
        java.time.OffsetDateTime offsetDateTime56 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset57 = offsetDateTime56.getOffset();
        java.time.OffsetDateTime offsetDateTime58 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset59 = offsetDateTime58.getOffset();
        boolean boolean60 = offsetDateTime56.isEqual(offsetDateTime58);
        java.time.temporal.ChronoField chronoField61 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long62 = offsetDateTime56.getLong((java.time.temporal.TemporalField) chronoField61);
        boolean boolean63 = chronoField61.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit64 = chronoField61.getRangeUnit();
        java.time.LocalTime localTime65 = localTime50.truncatedTo(temporalUnit64);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime66 = localDateTime44.plus(730486476412L, temporalUnit64);
        java.time.OffsetDateTime offsetDateTime67 = offsetDateTime21.plus((long) 1024, temporalUnit64);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime68 = zonedDateTime18.plus((long) ':', temporalUnit64);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate69 = localDate3.minus((long) 116000000, temporalUnit64);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: HalfDays");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(chronoLocalDate9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-365243219162L) + "'", long10 == (-365243219162L));
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + dayOfWeek12 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek12.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + era13 + "' != '" + java.time.chrono.IsoEra.BCE + "'", era13.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime19);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(zoneRules27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertNotNull(zoneRules33);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 365 + "'", int39 == 365);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertNotNull(offsetDateTime47);
        org.junit.Assert.assertNotNull(offsetDateTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 365 + "'", int52 == 365);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(offsetDateTime56);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertNotNull(offsetDateTime58);
        org.junit.Assert.assertNotNull(zoneOffset59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + chronoField61 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField61.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 9L + "'", long62 == 9L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit64 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit64.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime66);
        org.junit.Assert.assertNotNull(offsetDateTime67);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime68);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset5 = offsetDateTime4.getOffset();
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime3.withOffsetSameInstant(zoneOffset5);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusYears((long) 100);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime8);
        boolean boolean10 = offsetDateTime0.isEqual(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.stream.IntStream.Builder builder0 = java.util.stream.IntStream.builder();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Clock clock2 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset0);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.Period period5 = java.time.Period.ofMonths((-1));
        java.time.Period period7 = period5.minusDays((long) '#');
        boolean boolean8 = offsetTime3.equals((java.lang.Object) period5);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules10 = zoneOffset9.getRules();
        java.time.Clock clock11 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset9);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.now(clock11);
        boolean boolean13 = offsetTime3.isAfter(offsetTime12);
        java.time.OffsetTime offsetTime15 = offsetTime3.plusMinutes(0L);
        int int16 = offsetTime15.getNano();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalTime localTime5 = localTime3.plusNanos((long) (short) 1);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.LongSummaryStatistics longSummaryStatistics0 = new java.util.LongSummaryStatistics();
        long long1 = longSummaryStatistics0.getCount();
        org.junit.Assert.assertEquals(longSummaryStatistics0.toString(), "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.close();
        printWriter1.println((float) 0);
        java.util.Locale locale8 = new java.util.Locale("-999999999-01-01", "", "Higham-Hall 5(4)");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.time.format.DecimalStyle decimalStyle10 = java.time.format.DecimalStyle.of(locale8);
        printWriter1.print((java.lang.Object) decimalStyle10);
        org.junit.Assert.assertEquals(locale8.toString(), "-999999999-01-01__Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(decimalStyle10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.write(2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.IntStream intStream2 = intStream1.sequential();
        java.util.Iterator<java.lang.Integer> intItor3 = intStream1.iterator();
        boolean boolean4 = intStream1.isParallel();
        java.util.stream.IntStream intStream5 = intStream1.sequential();
        java.util.function.IntToLongFunction intToLongFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = intStream5.mapToLong(intToLongFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Clock clock2 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset0);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.Period period5 = java.time.Period.ofMonths((-1));
        java.time.Period period7 = period5.minusDays((long) '#');
        boolean boolean8 = offsetTime3.equals((java.lang.Object) period5);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules10 = zoneOffset9.getRules();
        java.time.Clock clock11 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset9);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.now(clock11);
        boolean boolean13 = offsetTime3.isAfter(offsetTime12);
        java.time.OffsetTime offsetTime15 = offsetTime3.plusMinutes(0L);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.OffsetTime offsetTime18 = offsetTime3.with((java.time.temporal.TemporalField) chronoField16, (long) 16384);
        java.time.OffsetDateTime offsetDateTime19 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime21 = offsetDateTime19.withMinute((int) (short) 1);
        java.time.LocalTime localTime22 = offsetDateTime21.toLocalTime();
        java.time.LocalDate localDate23 = java.time.LocalDate.MIN;
        int int24 = localDate23.lengthOfYear();
        java.time.LocalDate localDate25 = java.time.LocalDate.MIN;
        boolean boolean26 = localDate23.isAfter((java.time.chrono.ChronoLocalDate) localDate25);
        java.time.LocalDateTime localDateTime27 = localTime22.atDate(localDate23);
        java.time.OffsetDateTime offsetDateTime28 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime30 = offsetDateTime28.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime31 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime33 = offsetDateTime31.withMinute((int) (short) 1);
        java.time.LocalTime localTime34 = offsetDateTime33.toLocalTime();
        java.time.LocalDate localDate35 = java.time.LocalDate.MIN;
        int int36 = localDate35.lengthOfYear();
        java.time.LocalDate localDate37 = java.time.LocalDate.MIN;
        boolean boolean38 = localDate35.isAfter((java.time.chrono.ChronoLocalDate) localDate37);
        java.time.LocalDateTime localDateTime39 = localTime34.atDate(localDate35);
        java.time.OffsetDateTime offsetDateTime40 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset41 = offsetDateTime40.getOffset();
        java.time.OffsetDateTime offsetDateTime42 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset43 = offsetDateTime42.getOffset();
        boolean boolean44 = offsetDateTime40.isEqual(offsetDateTime42);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long46 = offsetDateTime40.getLong((java.time.temporal.TemporalField) chronoField45);
        boolean boolean47 = chronoField45.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit48 = chronoField45.getRangeUnit();
        java.time.LocalTime localTime49 = localTime34.truncatedTo(temporalUnit48);
        long long50 = localDateTime27.until((java.time.temporal.Temporal) offsetDateTime28, temporalUnit48);
        boolean boolean51 = offsetTime18.isSupported(temporalUnit48);
        java.time.temporal.ChronoField chronoField52 = java.time.temporal.ChronoField.ERA;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange53 = offsetTime18.range((java.time.temporal.TemporalField) chronoField52);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Era");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField16.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 365 + "'", int24 == 365);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(offsetDateTime30);
        org.junit.Assert.assertNotNull(offsetDateTime31);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 365 + "'", int36 == 365);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(offsetDateTime40);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertNotNull(offsetDateTime42);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField45.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 9L + "'", long46 == 9L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit48 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit48.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 730486476412L + "'", long50 == 730486476412L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + chronoField52 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField52.equals(java.time.temporal.ChronoField.ERA));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Instant instant4 = offsetDateTime3.toInstant();
        java.util.Optional<java.time.OffsetDateTime> offsetDateTimeOptional5 = java.util.Optional.ofNullable(offsetDateTime3);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset8 = offsetDateTime7.getOffset();
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime6.withOffsetSameInstant(zoneOffset8);
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTimeOptional5.orElse(offsetDateTime6);
        java.time.ZonedDateTime zonedDateTime11 = offsetDateTime10.toZonedDateTime();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetDateTimeOptional5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getLanguage();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayName();
        java.lang.String str6 = locale1.getDisplayVariant(locale4);
        java.util.Locale.setDefault(locale4);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException1 = new java.security.NoSuchAlgorithmException("BC");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.time.Month month0 = null;
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        int int3 = localDate2.lengthOfYear();
        java.lang.String str4 = localDate2.toString();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        int int6 = localDate5.lengthOfYear();
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        boolean boolean8 = localDate5.isAfter((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.Period period10 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate11 = localDate5.minus((java.time.temporal.TemporalAmount) period10);
        long long12 = localDate5.toEpochDay();
        java.time.LocalDate localDate13 = localDate2.with((java.time.temporal.TemporalAdjuster) localDate5);
        java.time.DayOfWeek dayOfWeek14 = localDate5.getDayOfWeek();
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules16 = zoneOffset15.getRules();
        java.time.Clock clock17 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset15);
        java.time.LocalTime localTime18 = java.time.LocalTime.now(clock17);
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition20 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL;
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime23 = offsetDateTime21.withMinute((int) (short) 1);
        java.time.LocalTime localTime24 = offsetDateTime23.toLocalTime();
        java.time.LocalDate localDate25 = java.time.LocalDate.MIN;
        int int26 = localDate25.lengthOfYear();
        java.time.LocalDate localDate27 = java.time.LocalDate.MIN;
        boolean boolean28 = localDate25.isAfter((java.time.chrono.ChronoLocalDate) localDate27);
        java.time.LocalDateTime localDateTime29 = localTime24.atDate(localDate25);
        java.time.OffsetDateTime offsetDateTime30 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset31 = offsetDateTime30.getOffset();
        java.time.ZonedDateTime zonedDateTime32 = localDateTime29.atZone((java.time.ZoneId) zoneOffset31);
        java.time.OffsetDateTime offsetDateTime33 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime34 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset35 = offsetDateTime34.getOffset();
        java.time.OffsetDateTime offsetDateTime36 = offsetDateTime33.withOffsetSameInstant(zoneOffset35);
        java.time.ZoneOffset zoneOffset37 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules39 = zoneOffset38.getRules();
        int int40 = zoneOffset37.compareTo(zoneOffset38);
        java.time.ZonedDateTime zonedDateTime41 = offsetDateTime33.atZoneSimilarLocal((java.time.ZoneId) zoneOffset37);
        java.io.UnsupportedEncodingException unsupportedEncodingException42 = new java.io.UnsupportedEncodingException();
        boolean boolean43 = zoneOffset37.equals((java.lang.Object) unsupportedEncodingException42);
        java.time.OffsetDateTime offsetDateTime44 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime46 = offsetDateTime44.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime48 = offsetDateTime46.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime49 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime50 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset51 = offsetDateTime50.getOffset();
        java.time.OffsetDateTime offsetDateTime52 = offsetDateTime49.withOffsetSameInstant(zoneOffset51);
        java.time.OffsetDateTime offsetDateTime53 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset54 = offsetDateTime53.getOffset();
        boolean boolean55 = zoneOffset51.equals((java.lang.Object) zoneOffset54);
        java.time.ZonedDateTime zonedDateTime56 = offsetDateTime46.atZoneSimilarLocal((java.time.ZoneId) zoneOffset54);
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransitionRule zoneOffsetTransitionRule57 = java.time.zone.ZoneOffsetTransitionRule.of(month0, 5, dayOfWeek14, localTime18, true, timeDefinition20, zoneOffset31, zoneOffset37, zoneOffset54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-999999999-01-01" + "'", str4, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(chronoLocalDate11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-365243219162L) + "'", long12 == (-365243219162L));
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + dayOfWeek14 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek14.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(zoneRules16);
        org.junit.Assert.assertNotNull(clock17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + timeDefinition20 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL + "'", timeDefinition20.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.WALL));
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 365 + "'", int26 == 365);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(offsetDateTime30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertNotNull(zoneOffset35);
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertNotNull(zoneOffset37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(zoneRules39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(offsetDateTime44);
        org.junit.Assert.assertNotNull(offsetDateTime46);
        org.junit.Assert.assertNotNull(offsetDateTime48);
        org.junit.Assert.assertNotNull(offsetDateTime49);
        org.junit.Assert.assertNotNull(offsetDateTime50);
        org.junit.Assert.assertNotNull(zoneOffset51);
        org.junit.Assert.assertNotNull(offsetDateTime52);
        org.junit.Assert.assertNotNull(offsetDateTime53);
        org.junit.Assert.assertNotNull(zoneOffset54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(zonedDateTime56);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of((int) (byte) 0, (int) (short) -1, 28, 21, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Clock clock2 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset0);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.Period period5 = java.time.Period.ofMonths((-1));
        java.time.Period period7 = period5.minusDays((long) '#');
        boolean boolean8 = offsetTime3.equals((java.lang.Object) period5);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules10 = zoneOffset9.getRules();
        java.time.Clock clock11 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset9);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.now(clock11);
        boolean boolean13 = offsetTime3.isAfter(offsetTime12);
        java.time.OffsetTime offsetTime15 = offsetTime3.plusMinutes(0L);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules17 = zoneOffset16.getRules();
        java.time.Clock clock18 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset16);
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.now(clock18);
        java.time.Period period21 = java.time.Period.ofMonths((-1));
        java.time.Period period23 = period21.minusDays((long) '#');
        boolean boolean24 = offsetTime19.equals((java.lang.Object) period21);
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules26 = zoneOffset25.getRules();
        java.time.Clock clock27 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset25);
        java.time.OffsetTime offsetTime28 = java.time.OffsetTime.now(clock27);
        boolean boolean29 = offsetTime19.isAfter(offsetTime28);
        java.time.OffsetTime offsetTime31 = offsetTime19.plusMinutes(0L);
        int int32 = offsetTime3.compareTo(offsetTime19);
        java.time.temporal.TemporalField temporalField33 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long34 = offsetTime3.getLong(temporalField33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(zoneRules10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneRules17);
        org.junit.Assert.assertNotNull(clock18);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(zoneRules26);
        org.junit.Assert.assertNotNull(clock27);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset13 = zoneRules1.getOffset(localDateTime12);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime17 = offsetDateTime15.withMinute((int) (short) 1);
        java.time.LocalTime localTime18 = offsetDateTime17.toLocalTime();
        java.time.LocalDate localDate19 = java.time.LocalDate.MIN;
        int int20 = localDate19.lengthOfYear();
        java.time.LocalDate localDate21 = java.time.LocalDate.MIN;
        boolean boolean22 = localDate19.isAfter((java.time.chrono.ChronoLocalDate) localDate21);
        java.time.LocalDateTime localDateTime23 = localTime18.atDate(localDate19);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset25 = offsetDateTime24.getOffset();
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset27 = offsetDateTime26.getOffset();
        boolean boolean28 = offsetDateTime24.isEqual(offsetDateTime26);
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long30 = offsetDateTime24.getLong((java.time.temporal.TemporalField) chronoField29);
        boolean boolean31 = chronoField29.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit32 = chronoField29.getRangeUnit();
        java.time.LocalTime localTime33 = localTime18.truncatedTo(temporalUnit32);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime34 = localDateTime12.plus(730486476412L, temporalUnit32);
        java.time.Period period36 = java.time.Period.ofMonths((-1));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        boolean boolean42 = period36.equals((java.lang.Object) 10L);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime43 = localDateTime12.plus((java.time.temporal.TemporalAmount) period36);
        java.time.chrono.Chronology chronology44 = localDateChronoLocalDateTime43.getChronology();
        java.time.OffsetDateTime offsetDateTime45 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime47 = offsetDateTime45.withMinute((int) (short) 1);
        java.time.LocalTime localTime48 = offsetDateTime47.toLocalTime();
        java.time.LocalDate localDate49 = java.time.LocalDate.MIN;
        int int50 = localDate49.lengthOfYear();
        java.time.LocalDate localDate51 = java.time.LocalDate.MIN;
        boolean boolean52 = localDate49.isAfter((java.time.chrono.ChronoLocalDate) localDate51);
        java.time.LocalDateTime localDateTime53 = localTime48.atDate(localDate49);
        java.time.OffsetDateTime offsetDateTime54 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset55 = offsetDateTime54.getOffset();
        java.time.ZonedDateTime zonedDateTime56 = localDateTime53.atZone((java.time.ZoneId) zoneOffset55);
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules58 = zoneOffset57.getRules();
        java.time.Clock clock59 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset57);
        long long60 = localDateTime53.toEpochSecond(zoneOffset57);
        java.time.Instant instant61 = localDateChronoLocalDateTime43.toInstant(zoneOffset57);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 365 + "'", int20 == 365);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField29.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit32 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit32.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(offsetDateTime45);
        org.junit.Assert.assertNotNull(offsetDateTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 365 + "'", int50 == 365);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(offsetDateTime54);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertNotNull(zonedDateTime56);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertNotNull(zoneRules58);
        org.junit.Assert.assertNotNull(clock59);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-31557014135564338L) + "'", long60 == (-31557014135564338L));
        org.junit.Assert.assertNotNull(instant61);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap1 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet2 = formatStyleEnumMap1.keySet();
        java.util.Iterator<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumItor3 = formatStyleEnumSet2.iterator();
        java.time.format.FormatStyle formatStyle4 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter5 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle4);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList6 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean7 = formatStyleEnumList6.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle4);
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream8 = formatStyleEnumList6.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = formatStyleEnumSet2.addAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumList6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatStyleEnumSet2);
        org.junit.Assert.assertNotNull(formatStyleEnumItor3);
        org.junit.Assert.assertTrue("'" + formatStyle4 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle4.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(formatStyleEnumStream8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Instant instant4 = offsetDateTime3.toInstant();
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset7 = offsetDateTime6.getOffset();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime5.withOffsetSameInstant(zoneOffset7);
        java.time.Instant instant9 = offsetDateTime8.toInstant();
        boolean boolean10 = instant4.isAfter(instant9);
        long long11 = instant9.toEpochMilli();
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset14 = offsetDateTime13.getOffset();
        java.time.OffsetDateTime offsetDateTime15 = offsetDateTime12.withOffsetSameInstant(zoneOffset14);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules18 = zoneOffset17.getRules();
        int int19 = zoneOffset16.compareTo(zoneOffset17);
        java.time.ZonedDateTime zonedDateTime20 = offsetDateTime12.atZoneSimilarLocal((java.time.ZoneId) zoneOffset16);
        java.io.UnsupportedEncodingException unsupportedEncodingException21 = new java.io.UnsupportedEncodingException();
        boolean boolean22 = zoneOffset16.equals((java.lang.Object) unsupportedEncodingException21);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.ofInstant(instant9, (java.time.ZoneId) zoneOffset16);
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset27 = offsetDateTime26.getOffset();
        java.time.OffsetDateTime offsetDateTime28 = offsetDateTime25.withOffsetSameInstant(zoneOffset27);
        java.time.OffsetDateTime offsetDateTime29 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset30 = offsetDateTime29.getOffset();
        boolean boolean31 = zoneOffset27.equals((java.lang.Object) zoneOffset30);
        java.time.ZoneId zoneId32 = java.time.ZoneId.ofOffset("", zoneOffset27);
        java.time.OffsetTime offsetTime33 = offsetTime23.withOffsetSameLocal(zoneOffset27);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1645434842925L + "'", long11 == 1645434842925L);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneRules18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(offsetDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertNotNull(offsetTime33);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = new java.net.URL(uRL0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray3, 2, (int) '\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 0, 0]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours((int) ':');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 58 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules6 = zoneOffset5.getRules();
        int int7 = zoneOffset4.compareTo(zoneOffset5);
        java.time.ZonedDateTime zonedDateTime8 = offsetDateTime0.atZoneSimilarLocal((java.time.ZoneId) zoneOffset4);
        java.time.chrono.Chronology chronology9 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) offsetDateTime0);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime10 = java.time.chrono.ChronoLocalDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(zoneRules6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.stream.Collector.Characteristics characteristics0 = java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
        org.junit.Assert.assertTrue("'" + characteristics0 + "' != '" + java.util.stream.Collector.Characteristics.IDENTITY_FINISH + "'", characteristics0.equals(java.util.stream.Collector.Characteristics.IDENTITY_FINISH));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset0);
        java.time.zone.ZoneRules zoneRules3 = zoneOffset0.getRules();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(zoneRules3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period1 = java.time.Period.parse((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isLoopbackAddress();
        java.util.function.Predicate<java.nio.channels.AsynchronousCloseException> asynchronousCloseExceptionPredicate2 = java.util.function.Predicate.isEqual((java.lang.Object) inetAddress0);
        boolean boolean3 = inetAddress0.isMCNodeLocal();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(asynchronousCloseExceptionPredicate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.nio.channels.FileChannel.MapMode mapMode0 = java.nio.channels.FileChannel.MapMode.READ_WRITE;
        java.lang.String str1 = mapMode0.toString();
        org.junit.Assert.assertNotNull(mapMode0);
        org.junit.Assert.assertEquals(mapMode0.toString(), "READ_WRITE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "READ_WRITE" + "'", str1, "READ_WRITE");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Instant instant4 = offsetDateTime3.toInstant();
        int int5 = instant4.getNano();
        java.time.Instant instant7 = instant4.plusSeconds((long) (byte) -1);
        java.net.InetAddress inetAddress8 = java.net.InetAddress.getLocalHost();
        boolean boolean9 = inetAddress8.isLoopbackAddress();
        boolean boolean10 = instant7.equals((java.lang.Object) boolean9);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(instant4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000000 + "'", int5 == 120000000);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(inetAddress8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.lang.String str0 = java.io.File.separator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/" + "'", str0, "/");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.time.Period period1 = java.time.Period.ofDays(0);
        java.time.Period period3 = period1.plusDays((long) 1);
        long long4 = period3.toTotalMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset13 = zoneRules1.getOffset(localDateTime12);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime17 = offsetDateTime15.withMinute((int) (short) 1);
        java.time.LocalTime localTime18 = offsetDateTime17.toLocalTime();
        java.time.LocalDate localDate19 = java.time.LocalDate.MIN;
        int int20 = localDate19.lengthOfYear();
        java.time.LocalDate localDate21 = java.time.LocalDate.MIN;
        boolean boolean22 = localDate19.isAfter((java.time.chrono.ChronoLocalDate) localDate21);
        java.time.LocalDateTime localDateTime23 = localTime18.atDate(localDate19);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset25 = offsetDateTime24.getOffset();
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset27 = offsetDateTime26.getOffset();
        boolean boolean28 = offsetDateTime24.isEqual(offsetDateTime26);
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long30 = offsetDateTime24.getLong((java.time.temporal.TemporalField) chronoField29);
        boolean boolean31 = chronoField29.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit32 = chronoField29.getRangeUnit();
        java.time.LocalTime localTime33 = localTime18.truncatedTo(temporalUnit32);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime34 = localDateTime12.plus(730486476412L, temporalUnit32);
        java.time.Period period36 = java.time.Period.ofMonths((-1));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        boolean boolean42 = period36.equals((java.lang.Object) 10L);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime43 = localDateTime12.plus((java.time.temporal.TemporalAmount) period36);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration44 = java.time.Duration.from((java.time.temporal.TemporalAmount) period36);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit must not have an estimated duration");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 365 + "'", int20 == 365);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField29.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit32 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit32.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime43);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.minusHours((long) ' ');
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime0);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime3.withLaterOffsetAtOverlap();
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset8 = offsetDateTime7.getOffset();
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime6.withOffsetSameInstant(zoneOffset8);
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules12 = zoneOffset11.getRules();
        int int13 = zoneOffset10.compareTo(zoneOffset11);
        java.time.ZonedDateTime zonedDateTime14 = offsetDateTime6.atZoneSimilarLocal((java.time.ZoneId) zoneOffset10);
        java.time.chrono.Chronology chronology15 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) offsetDateTime6);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules18 = zoneOffset17.getRules();
        java.time.OffsetDateTime offsetDateTime19 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime21 = offsetDateTime19.withMinute((int) (short) 1);
        java.time.LocalTime localTime22 = offsetDateTime21.toLocalTime();
        java.time.LocalDate localDate23 = java.time.LocalDate.MIN;
        int int24 = localDate23.lengthOfYear();
        java.time.LocalDate localDate25 = java.time.LocalDate.MIN;
        boolean boolean26 = localDate23.isAfter((java.time.chrono.ChronoLocalDate) localDate25);
        java.time.LocalDateTime localDateTime27 = localTime22.atDate(localDate23);
        java.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset30 = zoneRules18.getOffset(localDateTime29);
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime34 = offsetDateTime32.withMinute((int) (short) 1);
        java.time.LocalTime localTime35 = offsetDateTime34.toLocalTime();
        java.time.LocalDate localDate36 = java.time.LocalDate.MIN;
        int int37 = localDate36.lengthOfYear();
        java.time.LocalDate localDate38 = java.time.LocalDate.MIN;
        boolean boolean39 = localDate36.isAfter((java.time.chrono.ChronoLocalDate) localDate38);
        java.time.LocalDateTime localDateTime40 = localTime35.atDate(localDate36);
        java.time.OffsetDateTime offsetDateTime41 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset42 = offsetDateTime41.getOffset();
        java.time.OffsetDateTime offsetDateTime43 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset44 = offsetDateTime43.getOffset();
        boolean boolean45 = offsetDateTime41.isEqual(offsetDateTime43);
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long47 = offsetDateTime41.getLong((java.time.temporal.TemporalField) chronoField46);
        boolean boolean48 = chronoField46.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit49 = chronoField46.getRangeUnit();
        java.time.LocalTime localTime50 = localTime35.truncatedTo(temporalUnit49);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime51 = localDateTime29.plus(730486476412L, temporalUnit49);
        java.time.OffsetDateTime offsetDateTime52 = offsetDateTime6.plus((long) 1024, temporalUnit49);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime53 = zonedDateTime3.plus((long) ':', temporalUnit49);
        java.lang.String str54 = temporalUnit49.toString();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(zoneRules12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneRules18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 365 + "'", int24 == 365);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 365 + "'", int37 == 365);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(offsetDateTime41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(offsetDateTime43);
        org.junit.Assert.assertNotNull(zoneOffset44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField46.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 9L + "'", long47 == 9L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit49 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit49.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime51);
        org.junit.Assert.assertNotNull(offsetDateTime52);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "HalfDays" + "'", str54, "HalfDays");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime12 = offsetDateTime10.withMinute((int) (short) 1);
        java.time.LocalTime localTime13 = offsetDateTime12.toLocalTime();
        java.time.LocalDate localDate14 = java.time.LocalDate.MIN;
        int int15 = localDate14.lengthOfYear();
        java.time.LocalDate localDate16 = java.time.LocalDate.MIN;
        boolean boolean17 = localDate14.isAfter((java.time.chrono.ChronoLocalDate) localDate16);
        java.time.LocalDateTime localDateTime18 = localTime13.atDate(localDate14);
        java.time.OffsetDateTime offsetDateTime19 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset20 = offsetDateTime19.getOffset();
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset22 = offsetDateTime21.getOffset();
        boolean boolean23 = offsetDateTime19.isEqual(offsetDateTime21);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long25 = offsetDateTime19.getLong((java.time.temporal.TemporalField) chronoField24);
        boolean boolean26 = chronoField24.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit27 = chronoField24.getRangeUnit();
        java.time.LocalTime localTime28 = localTime13.truncatedTo(temporalUnit27);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime29 = localDateTime8.minus((long) 9, temporalUnit27);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 365 + "'", int15 == 365);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField24.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9L + "'", long25 == 9L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit27 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit27.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime28);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.time.Period period1 = java.time.Period.ofDays(0);
        java.time.Period period3 = period1.plusDays((long) 1);
        boolean boolean4 = period1.isNegative();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        highamHall54Integrator4.setMaxGrowth((double) 365);
        double double7 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.close();
        printWriter1.println((float) 0);
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.setDefault(locale6);
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator10 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.text.Format.Field field11 = null;
        java.text.FieldPosition fieldPosition12 = new java.text.FieldPosition(field11);
        fieldPosition12.setBeginIndex((int) ' ');
        java.nio.ByteOrder byteOrder15 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.lang.Object[] objArray16 = new java.lang.Object[] { wildcardChronoZonedDateTimeComparator10, ' ', byteOrder15 };
        java.io.PrintWriter printWriter17 = printWriter1.printf(locale6, "", objArray16);
        printWriter17.write("Subject:\n");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator10);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(printWriter17);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.IntStream intStream3 = intStream1.limit((long) ' ');
        java.util.function.IntPredicate intPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = intStream1.filter(intPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime1.withMinute((int) (short) 1);
        java.time.LocalTime localTime4 = offsetDateTime3.toLocalTime();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        int int6 = localDate5.lengthOfYear();
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        boolean boolean8 = localDate5.isAfter((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.LocalDateTime localDateTime9 = localTime4.atDate(localDate5);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset11 = offsetDateTime10.getOffset();
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset13 = offsetDateTime12.getOffset();
        boolean boolean14 = offsetDateTime10.isEqual(offsetDateTime12);
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long16 = offsetDateTime10.getLong((java.time.temporal.TemporalField) chronoField15);
        boolean boolean17 = chronoField15.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit18 = chronoField15.getRangeUnit();
        java.time.LocalTime localTime19 = localTime4.truncatedTo(temporalUnit18);
        java.time.Duration duration20 = java.time.Duration.of(0L, temporalUnit18);
        long long21 = duration20.toHours();
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField15.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9L + "'", long16 == 9L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit18 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit18.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        int int2 = properties1.size();
        java.lang.Object obj3 = properties1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.close();
        printWriter1.println((float) 0);
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.setDefault(locale6);
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator10 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.text.Format.Field field11 = null;
        java.text.FieldPosition fieldPosition12 = new java.text.FieldPosition(field11);
        fieldPosition12.setBeginIndex((int) ' ');
        java.nio.ByteOrder byteOrder15 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.lang.Object[] objArray16 = new java.lang.Object[] { wildcardChronoZonedDateTimeComparator10, ' ', byteOrder15 };
        java.io.PrintWriter printWriter17 = printWriter1.printf(locale6, "", objArray16);
        printWriter17.println((float) (byte) 1);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator10);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(printWriter17);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        java.time.ZonedDateTime zonedDateTime13 = localDateTime10.atZone((java.time.ZoneId) zoneOffset12);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules15 = zoneOffset14.getRules();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset14);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.ofStrict(localDateTime10, zoneOffset14, (java.time.ZoneId) zoneOffset18);
        javax.security.auth.Subject subject20 = new javax.security.auth.Subject();
        java.lang.Object obj21 = properties1.putIfAbsent((java.lang.Object) zoneOffset18, (java.lang.Object) subject20);
        java.time.OffsetDateTime offsetDateTime22 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset24 = offsetDateTime23.getOffset();
        java.time.OffsetDateTime offsetDateTime25 = offsetDateTime22.withOffsetSameInstant(zoneOffset24);
        java.time.Instant instant26 = offsetDateTime25.toInstant();
        java.time.OffsetDateTime offsetDateTime27 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime28 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset29 = offsetDateTime28.getOffset();
        java.time.OffsetDateTime offsetDateTime30 = offsetDateTime27.withOffsetSameInstant(zoneOffset29);
        java.time.Instant instant31 = offsetDateTime30.toInstant();
        boolean boolean32 = instant26.isAfter(instant31);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal33 = zoneOffset18.adjustInto((java.time.temporal.Temporal) instant26);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneRules15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(offsetDateTime30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.chrono.Era era1 = localDate0.getEra();
        java.util.Optional<java.time.chrono.Era> eraOptional2 = java.util.Optional.ofNullable(era1);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + era1 + "' != '" + java.time.chrono.IsoEra.BCE + "'", era1.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(eraOptional2);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        int int0 = org.apache.commons.math.ode.SwitchingFunction.STOP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap1 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Enumeration<java.lang.Object> objEnumeration2 = formatStyleEnumMap1.elements();
        java.lang.Object obj3 = formatStyleEnumMap1.clone();
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter("Subject:\n");
        printWriter5.close();
        printWriter5.println((float) 0);
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale.setDefault(locale10);
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator14 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.text.Format.Field field15 = null;
        java.text.FieldPosition fieldPosition16 = new java.text.FieldPosition(field15);
        fieldPosition16.setBeginIndex((int) ' ');
        java.nio.ByteOrder byteOrder19 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.lang.Object[] objArray20 = new java.lang.Object[] { wildcardChronoZonedDateTimeComparator14, ' ', byteOrder19 };
        java.io.PrintWriter printWriter21 = printWriter5.printf(locale10, "", objArray20);
        printWriter21.write("");
        printWriter21.close();
        boolean boolean25 = formatStyleEnumMap1.containsKey((java.lang.Object) printWriter21);
        org.junit.Assert.assertNotNull(objEnumeration2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator14);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(printWriter21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle0);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList2 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean3 = formatStyleEnumList2.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle0);
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream4 = formatStyleEnumList2.parallelStream();
        boolean boolean6 = formatStyleEnumList2.remove((java.lang.Object) 10.0d);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules8 = zoneOffset7.getRules();
        java.time.Clock clock9 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset7);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.now(clock9);
        java.time.Period period12 = java.time.Period.ofMonths((-1));
        java.time.Period period14 = period12.minusDays((long) '#');
        boolean boolean15 = offsetTime10.equals((java.lang.Object) period12);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules17 = zoneOffset16.getRules();
        java.time.Clock clock18 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset16);
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.now(clock18);
        boolean boolean20 = offsetTime10.isAfter(offsetTime19);
        java.time.OffsetTime offsetTime22 = offsetTime10.plusMinutes(0L);
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.OffsetTime offsetTime25 = offsetTime10.with((java.time.temporal.TemporalField) chronoField23, (long) 16384);
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime28 = offsetDateTime26.withMinute((int) (short) 1);
        java.time.LocalTime localTime29 = offsetDateTime28.toLocalTime();
        java.time.LocalDate localDate30 = java.time.LocalDate.MIN;
        int int31 = localDate30.lengthOfYear();
        java.time.LocalDate localDate32 = java.time.LocalDate.MIN;
        boolean boolean33 = localDate30.isAfter((java.time.chrono.ChronoLocalDate) localDate32);
        java.time.LocalDateTime localDateTime34 = localTime29.atDate(localDate30);
        java.time.OffsetDateTime offsetDateTime35 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime37 = offsetDateTime35.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime38 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime40 = offsetDateTime38.withMinute((int) (short) 1);
        java.time.LocalTime localTime41 = offsetDateTime40.toLocalTime();
        java.time.LocalDate localDate42 = java.time.LocalDate.MIN;
        int int43 = localDate42.lengthOfYear();
        java.time.LocalDate localDate44 = java.time.LocalDate.MIN;
        boolean boolean45 = localDate42.isAfter((java.time.chrono.ChronoLocalDate) localDate44);
        java.time.LocalDateTime localDateTime46 = localTime41.atDate(localDate42);
        java.time.OffsetDateTime offsetDateTime47 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset48 = offsetDateTime47.getOffset();
        java.time.OffsetDateTime offsetDateTime49 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset50 = offsetDateTime49.getOffset();
        boolean boolean51 = offsetDateTime47.isEqual(offsetDateTime49);
        java.time.temporal.ChronoField chronoField52 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long53 = offsetDateTime47.getLong((java.time.temporal.TemporalField) chronoField52);
        boolean boolean54 = chronoField52.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit55 = chronoField52.getRangeUnit();
        java.time.LocalTime localTime56 = localTime41.truncatedTo(temporalUnit55);
        long long57 = localDateTime34.until((java.time.temporal.Temporal) offsetDateTime35, temporalUnit55);
        boolean boolean58 = offsetTime25.isSupported(temporalUnit55);
        boolean boolean59 = formatStyleEnumList2.equals((java.lang.Object) offsetTime25);
        java.time.ZoneOffset zoneOffset60 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules61 = zoneOffset60.getRules();
        java.time.Clock clock62 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset60);
        java.time.OffsetTime offsetTime63 = java.time.OffsetTime.now(clock62);
        java.time.Period period65 = java.time.Period.ofMonths((-1));
        java.time.Period period67 = period65.minusDays((long) '#');
        boolean boolean68 = offsetTime63.equals((java.lang.Object) period65);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime69 = offsetTime25.minus((java.time.temporal.TemporalAmount) period65);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle0.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(formatStyleEnumStream4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(zoneRules8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneRules17);
        org.junit.Assert.assertNotNull(clock18);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField23.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 365 + "'", int31 == 365);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(offsetDateTime37);
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertNotNull(offsetDateTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 365 + "'", int43 == 365);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(offsetDateTime47);
        org.junit.Assert.assertNotNull(zoneOffset48);
        org.junit.Assert.assertNotNull(offsetDateTime49);
        org.junit.Assert.assertNotNull(zoneOffset50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + chronoField52 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField52.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 9L + "'", long53 == 9L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit55 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit55.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 730486476412L + "'", long57 == 730486476412L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zoneOffset60);
        org.junit.Assert.assertNotNull(zoneRules61);
        org.junit.Assert.assertNotNull(clock62);
        org.junit.Assert.assertNotNull(offsetTime63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "Higham-Hall 5(4)");
        java.nio.file.Path path3 = file2.toPath();
        boolean boolean4 = file2.canExecute();
        long long5 = file2.getTotalSpace();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap1 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet2 = formatStyleEnumMap1.keySet();
        java.time.format.FormatStyle formatStyle3 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle3);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList5 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean6 = formatStyleEnumList5.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle3);
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream7 = formatStyleEnumList5.parallelStream();
        boolean boolean8 = formatStyleEnumSet2.removeAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumList5);
        java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumCollection9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = formatStyleEnumList5.retainAll(formatStyleEnumCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatStyleEnumSet2);
        org.junit.Assert.assertTrue("'" + formatStyle3 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle3.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(formatStyleEnumStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.setDefault(category0, locale2);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.net.URI uRI1 = java.net.URI.create("");
        java.net.URI uRI2 = uRI1.normalize();
        java.lang.String str3 = uRI1.toASCIIString();
        java.net.URI uRI5 = java.net.URI.create("");
        int int6 = uRI1.compareTo(uRI5);
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertNotNull(uRI2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "Higham-Hall 5(4)");
        java.nio.file.Path path3 = file2.toPath();
        java.io.File file4 = null;
        java.io.File file6 = new java.io.File(file4, "Higham-Hall 5(4)");
        java.nio.file.Path path7 = file6.toPath();
        int int8 = path3.compareTo(path7);
        boolean boolean9 = path3.isAbsolute();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.net.URI uRI1 = java.net.URI.create("");
        java.net.URI uRI2 = uRI1.normalize();
        java.lang.String str3 = uRI1.getUserInfo();
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertNotNull(uRI2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        long[] longArray0 = new long[] {};
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(longArray0);
        java.util.stream.LongStream longStream2 = longStream1.sequential();
        long long3 = longStream1.sum();
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap1 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet2 = formatStyleEnumMap1.keySet();
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap4 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet5 = formatStyleEnumMap4.keySet();
        boolean boolean6 = formatStyleEnumSet2.retainAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet5);
        java.util.Spliterator<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSpliterator7 = formatStyleEnumSet5.spliterator();
        org.junit.Assert.assertNotNull(formatStyleEnumSet2);
        org.junit.Assert.assertNotNull(formatStyleEnumSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(formatStyleEnumSpliterator7);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.List<java.nio.file.spi.FileSystemProvider> fileSystemProviderList0 = java.nio.file.spi.FileSystemProvider.installedProviders();
        org.junit.Assert.assertNotNull(fileSystemProviderList0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.THURSDAY;
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.THURSDAY));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        long long1 = doubleStream0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble2 = doubleStream0.max();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Month month4 = offsetDateTime0.getMonth();
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime7.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTime10.withOffsetSameInstant(zoneOffset12);
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset15 = offsetDateTime14.getOffset();
        boolean boolean16 = zoneOffset12.equals((java.lang.Object) zoneOffset15);
        java.time.ZonedDateTime zonedDateTime17 = offsetDateTime7.atZoneSimilarLocal((java.time.ZoneId) zoneOffset15);
        java.time.Period period19 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology20 = period19.getChronology();
        java.time.Period period22 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoPeriod chronoPeriod23 = period19.minus((java.time.temporal.TemporalAmount) period22);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime24 = zonedDateTime17.minus((java.time.temporal.TemporalAmount) period22);
        java.time.temporal.Temporal temporal25 = month4.adjustInto((java.time.temporal.Temporal) zonedDateTime17);
        java.time.DayOfWeek dayOfWeek26 = zonedDateTime17.getDayOfWeek();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.FEBRUARY + "'", month4.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(chronoPeriod23);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime24);
        org.junit.Assert.assertNotNull(temporal25);
        org.junit.Assert.assertTrue("'" + dayOfWeek26 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek26.equals(java.time.DayOfWeek.MONDAY));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        int int2 = localDate1.lengthOfYear();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        java.time.Period period5 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.withMinute((int) (short) 1);
        java.time.LocalTime localTime9 = offsetDateTime8.toLocalTime();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        int int11 = localDate10.lengthOfYear();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        boolean boolean13 = localDate10.isAfter((java.time.chrono.ChronoLocalDate) localDate12);
        java.time.LocalDateTime localDateTime14 = localTime9.atDate(localDate10);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset18 = offsetDateTime17.getOffset();
        boolean boolean19 = offsetDateTime15.isEqual(offsetDateTime17);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long21 = offsetDateTime15.getLong((java.time.temporal.TemporalField) chronoField20);
        boolean boolean22 = chronoField20.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit23 = chronoField20.getRangeUnit();
        java.time.LocalTime localTime24 = localTime9.truncatedTo(temporalUnit23);
        java.time.LocalDateTime localDateTime25 = localDate1.atTime(localTime24);
        java.time.LocalTime localTime27 = localTime24.withNano((int) (byte) 100);
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH;
        java.time.temporal.TemporalUnit temporalUnit30 = chronoField29.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime31 = localTime24.plus((long) 0, temporalUnit30);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField20.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9L + "'", long21 == 9L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit23 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit23.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH + "'", chronoField29.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit30 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit30.equals(java.time.temporal.ChronoUnit.MONTHS));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Month month4 = offsetDateTime0.getMonth();
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime0.plusMinutes((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.withDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.FEBRUARY + "'", month4.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(offsetDateTime6);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.MEDIUM;
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.MEDIUM + "'", formatStyle0.equals(java.time.format.FormatStyle.MEDIUM));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        long[] longArray3 = new long[] { 10L, 'a', 1 };
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray3);
        long[] longArray11 = new long[] { (short) -1, (-1L), (-31557014135564285L), (-60000L), (short) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer12 = longBuffer4.put(longArray11);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 97, 1]");
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, -31557014135564285, -60000, 10, 100]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.close();
        printWriter1.println((float) 0);
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.setDefault(locale6);
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator10 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.text.Format.Field field11 = null;
        java.text.FieldPosition fieldPosition12 = new java.text.FieldPosition(field11);
        fieldPosition12.setBeginIndex((int) ' ');
        java.nio.ByteOrder byteOrder15 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.lang.Object[] objArray16 = new java.lang.Object[] { wildcardChronoZonedDateTimeComparator10, ' ', byteOrder15 };
        java.io.PrintWriter printWriter17 = printWriter1.printf(locale6, "", objArray16);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("Subject:\n");
        printWriter21.close();
        printWriter21.print((double) 1645434836016L);
        char[] charArray26 = new char[] { '0' };
        printWriter21.print(charArray26);
        printWriter1.write(charArray26);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator10);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(printWriter17);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[0]");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) ' ');
        org.junit.Assert.assertNotNull(longBuffer1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = locale1.getCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.lang.String str2 = localDate0.toString();
        java.time.chrono.Era era3 = localDate0.getEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
        org.junit.Assert.assertTrue("'" + era3 + "' != '" + java.time.chrono.IsoEra.BCE + "'", era3.equals(java.time.chrono.IsoEra.BCE));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean2 = subject0.equals((java.lang.Object) (-1.0f));
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objSet3);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.duplicate();
        java.nio.FloatBuffer floatBuffer3 = floatBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            float float4 = floatBuffer3.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        boolean boolean3 = localDate0.isAfter((java.time.chrono.ChronoLocalDate) localDate2);
        java.time.Period period5 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate6 = localDate0.minus((java.time.temporal.TemporalAmount) period5);
        long long7 = localDate0.toEpochDay();
        long[] longArray11 = new long[] { 0, (short) 10, 10 };
        java.util.stream.LongStream longStream12 = java.util.stream.LongStream.of(longArray11);
        java.util.OptionalLong optionalLong13 = longStream12.findFirst();
        java.util.Properties properties14 = null;
        java.util.Properties properties15 = new java.util.Properties(properties14);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime18 = offsetDateTime16.withMinute((int) (short) 1);
        java.time.LocalTime localTime19 = offsetDateTime18.toLocalTime();
        java.time.LocalDate localDate20 = java.time.LocalDate.MIN;
        int int21 = localDate20.lengthOfYear();
        java.time.LocalDate localDate22 = java.time.LocalDate.MIN;
        boolean boolean23 = localDate20.isAfter((java.time.chrono.ChronoLocalDate) localDate22);
        java.time.LocalDateTime localDateTime24 = localTime19.atDate(localDate20);
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset26 = offsetDateTime25.getOffset();
        java.time.ZonedDateTime zonedDateTime27 = localDateTime24.atZone((java.time.ZoneId) zoneOffset26);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules29 = zoneOffset28.getRules();
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset28);
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime33 = java.time.ZonedDateTime.ofStrict(localDateTime24, zoneOffset28, (java.time.ZoneId) zoneOffset32);
        javax.security.auth.Subject subject34 = new javax.security.auth.Subject();
        java.lang.Object obj35 = properties15.putIfAbsent((java.lang.Object) zoneOffset32, (java.lang.Object) subject34);
        boolean boolean36 = optionalLong13.equals((java.lang.Object) subject34);
        boolean boolean37 = localDate0.equals((java.lang.Object) boolean36);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoLocalDate6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-365243219162L) + "'", long7 == (-365243219162L));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[0, 10, 10]");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(optionalLong13);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 365 + "'", int21 == 365);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(zoneRules29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.IntStream intStream2 = intStream1.sequential();
        java.util.Iterator<java.lang.Integer> intItor3 = intStream1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            intItor3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intItor3);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        int int2 = properties1.size();
        java.io.PrintWriter printWriter4 = new java.io.PrintWriter("Subject:\n");
        printWriter4.close();
        printWriter4.print((double) 1645434836016L);
        char[] charArray9 = new char[] { '0' };
        printWriter4.print(charArray9);
        properties1.list(printWriter4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter15 = printWriter4.append((java.lang.CharSequence) "READ_WRITE", 28, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 13");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[0]");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        java.time.ZonedDateTime zonedDateTime13 = localDateTime10.atZone((java.time.ZoneId) zoneOffset12);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules15 = zoneOffset14.getRules();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset14);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.ofStrict(localDateTime10, zoneOffset14, (java.time.ZoneId) zoneOffset18);
        javax.security.auth.Subject subject20 = new javax.security.auth.Subject();
        java.lang.Object obj21 = properties1.putIfAbsent((java.lang.Object) zoneOffset18, (java.lang.Object) subject20);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules23 = zoneOffset22.getRules();
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime26 = offsetDateTime24.withMinute((int) (short) 1);
        java.time.LocalTime localTime27 = offsetDateTime26.toLocalTime();
        java.time.LocalDate localDate28 = java.time.LocalDate.MIN;
        int int29 = localDate28.lengthOfYear();
        java.time.LocalDate localDate30 = java.time.LocalDate.MIN;
        boolean boolean31 = localDate28.isAfter((java.time.chrono.ChronoLocalDate) localDate30);
        java.time.LocalDateTime localDateTime32 = localTime27.atDate(localDate28);
        java.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset35 = zoneRules23.getOffset(localDateTime34);
        boolean boolean36 = zoneRules23.isFixedOffset();
        java.time.LocalDate localDate37 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate38 = java.time.LocalDate.MIN;
        int int39 = localDate38.lengthOfYear();
        java.time.LocalDate localDate40 = java.time.LocalDate.MIN;
        boolean boolean41 = localDate38.isAfter((java.time.chrono.ChronoLocalDate) localDate40);
        java.time.Period period42 = localDate37.until((java.time.chrono.ChronoLocalDate) localDate38);
        java.time.OffsetDateTime offsetDateTime43 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime45 = offsetDateTime43.withMinute((int) (short) 1);
        java.time.LocalTime localTime46 = offsetDateTime45.toLocalTime();
        java.time.LocalDate localDate47 = java.time.LocalDate.MIN;
        int int48 = localDate47.lengthOfYear();
        java.time.LocalDate localDate49 = java.time.LocalDate.MIN;
        boolean boolean50 = localDate47.isAfter((java.time.chrono.ChronoLocalDate) localDate49);
        java.time.LocalDateTime localDateTime51 = localTime46.atDate(localDate47);
        java.time.OffsetDateTime offsetDateTime52 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset53 = offsetDateTime52.getOffset();
        java.time.OffsetDateTime offsetDateTime54 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset55 = offsetDateTime54.getOffset();
        boolean boolean56 = offsetDateTime52.isEqual(offsetDateTime54);
        java.time.temporal.ChronoField chronoField57 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long58 = offsetDateTime52.getLong((java.time.temporal.TemporalField) chronoField57);
        boolean boolean59 = chronoField57.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit60 = chronoField57.getRangeUnit();
        java.time.LocalTime localTime61 = localTime46.truncatedTo(temporalUnit60);
        java.time.LocalDateTime localDateTime62 = localDate38.atTime(localTime61);
        java.util.List<java.time.ZoneOffset> zoneOffsetList63 = zoneRules23.getValidOffsets(localDateTime62);
        boolean boolean64 = properties1.containsKey((java.lang.Object) localDateTime62);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneRules15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(zoneRules23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 365 + "'", int29 == 365);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(zoneOffset35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 365 + "'", int39 == 365);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(offsetDateTime43);
        org.junit.Assert.assertNotNull(offsetDateTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 365 + "'", int48 == 365);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(offsetDateTime52);
        org.junit.Assert.assertNotNull(zoneOffset53);
        org.junit.Assert.assertNotNull(offsetDateTime54);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + chronoField57 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField57.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 9L + "'", long58 == 9L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit60 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit60.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(zoneOffsetList63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Instant instant4 = offsetDateTime3.toInstant();
        java.util.Optional<java.time.OffsetDateTime> offsetDateTimeOptional5 = java.util.Optional.ofNullable(offsetDateTime3);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset8 = offsetDateTime7.getOffset();
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime6.withOffsetSameInstant(zoneOffset8);
        java.time.format.FormatStyle formatStyle10 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter11 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle10);
        java.lang.String str12 = offsetDateTime9.format(dateTimeFormatter11);
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTimeOptional5.orElse(offsetDateTime9);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules15 = zoneOffset14.getRules();
        java.time.Clock clock16 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset14);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.now(clock16);
        java.time.Period period19 = java.time.Period.ofMonths((-1));
        java.time.Period period21 = period19.minusDays((long) '#');
        boolean boolean22 = offsetTime17.equals((java.lang.Object) period19);
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules24 = zoneOffset23.getRules();
        java.time.Clock clock25 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset23);
        java.time.OffsetTime offsetTime26 = java.time.OffsetTime.now(clock25);
        boolean boolean27 = offsetTime17.isAfter(offsetTime26);
        java.time.OffsetTime offsetTime29 = offsetTime17.plusMinutes(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration30 = java.time.Duration.between((java.time.temporal.Temporal) offsetDateTime13, (java.time.temporal.Temporal) offsetTime29);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: 09:14:04Z of type java.time.OffsetTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetDateTimeOptional5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + formatStyle10 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle10.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Monday, February 21, 2022" + "'", str12, "Monday, February 21, 2022");
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneRules15);
        org.junit.Assert.assertNotNull(clock16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(zoneRules24);
        org.junit.Assert.assertNotNull(clock25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(offsetTime29);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle0);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList2 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean3 = formatStyleEnumList2.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle0);
        java.time.format.FormatStyle formatStyle4 = java.time.format.FormatStyle.FULL;
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList5 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean6 = formatStyleEnumList5.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle4);
        boolean boolean7 = formatStyleEnumList2.retainAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumList5);
        formatStyleEnumList5.clear();
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle0.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + formatStyle4 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle4.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.time.Period period1 = java.time.Period.ofDays(21);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period3 = period1.plusMonths(730486476412L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: integer overflow");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.io.UnsupportedEncodingException unsupportedEncodingException1 = new java.io.UnsupportedEncodingException();
        java.util.concurrent.ExecutionException executionException2 = new java.util.concurrent.ExecutionException("HalfDays", (java.lang.Throwable) unsupportedEncodingException1);
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) unsupportedEncodingException1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.time.Period period1 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology2 = period1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period4 = period1.minusMonths(1645434842925L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: integer overflow");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("-999999999-01-01");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset7 = offsetDateTime6.getOffset();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime5.withOffsetSameInstant(zoneOffset7);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        boolean boolean11 = zoneOffset7.equals((java.lang.Object) zoneOffset10);
        java.time.ZonedDateTime zonedDateTime12 = offsetDateTime2.atZoneSimilarLocal((java.time.ZoneId) zoneOffset10);
        int int13 = zonedDateTime12.getSecond();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(zonedDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.nio.channels.FileChannel.MapMode mapMode0 = java.nio.channels.FileChannel.MapMode.PRIVATE;
        org.junit.Assert.assertNotNull(mapMode0);
        org.junit.Assert.assertEquals(mapMode0.toString(), "PRIVATE");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.Date date5 = new java.util.Date(13, 365, 16384, (int) (short) 100, 559000000);
        java.util.Date date6 = new java.util.Date();
        date6.setSeconds((int) (byte) 100);
        date6.setSeconds(2);
        int int11 = date5.compareTo(date6);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Feb 13 14:40:00 UTC 3051");
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Feb 21 09:14:02 UTC 2022");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.sequential();
        java.util.function.DoublePredicate doublePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = doubleStream0.anyMatch(doublePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.util.Date date5 = new java.util.Date(13, 365, 16384, (int) (short) 100, 559000000);
        long long6 = date5.getTime();
        org.junit.Assert.assertEquals(date5.toString(), "Thu Feb 13 14:40:00 UTC 3051");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 34116820800000L + "'", long6 == 34116820800000L);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap1 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet2 = formatStyleEnumMap1.keySet();
        formatStyleEnumSet2.clear();
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream4 = formatStyleEnumSet2.parallelStream();
        org.junit.Assert.assertNotNull(formatStyleEnumSet2);
        org.junit.Assert.assertNotNull(formatStyleEnumStream4);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.security.Permission permission1 = null;
        java.security.AccessControlException accessControlException2 = new java.security.AccessControlException("-999999999-01-01", permission1);
        java.security.Permission permission3 = accessControlException2.getPermission();
        org.junit.Assert.assertNull(permission3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        int int2 = localDate1.lengthOfYear();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        java.time.Period period5 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.withMinute((int) (short) 1);
        java.time.LocalTime localTime9 = offsetDateTime8.toLocalTime();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        int int11 = localDate10.lengthOfYear();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        boolean boolean13 = localDate10.isAfter((java.time.chrono.ChronoLocalDate) localDate12);
        java.time.LocalDateTime localDateTime14 = localTime9.atDate(localDate10);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset18 = offsetDateTime17.getOffset();
        boolean boolean19 = offsetDateTime15.isEqual(offsetDateTime17);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long21 = offsetDateTime15.getLong((java.time.temporal.TemporalField) chronoField20);
        boolean boolean22 = chronoField20.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit23 = chronoField20.getRangeUnit();
        java.time.LocalTime localTime24 = localTime9.truncatedTo(temporalUnit23);
        java.time.LocalDateTime localDateTime25 = localDate1.atTime(localTime24);
        java.time.LocalDate localDate26 = java.time.LocalDate.MIN;
        int int27 = localDate26.lengthOfYear();
        java.time.LocalDate localDate28 = java.time.LocalDate.MIN;
        boolean boolean29 = localDate26.isAfter((java.time.chrono.ChronoLocalDate) localDate28);
        java.time.Period period31 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate32 = localDate26.minus((java.time.temporal.TemporalAmount) period31);
        java.time.OffsetDateTime offsetDateTime33 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime34 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset35 = offsetDateTime34.getOffset();
        java.time.OffsetDateTime offsetDateTime36 = offsetDateTime33.withOffsetSameInstant(zoneOffset35);
        boolean boolean37 = chronoLocalDate32.equals((java.lang.Object) offsetDateTime36);
        java.time.OffsetDateTime offsetDateTime38 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset39 = offsetDateTime38.getOffset();
        java.time.OffsetDateTime offsetDateTime40 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset41 = offsetDateTime40.getOffset();
        boolean boolean42 = offsetDateTime38.isEqual(offsetDateTime40);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long44 = offsetDateTime38.getLong((java.time.temporal.TemporalField) chronoField43);
        boolean boolean45 = chronoField43.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit46 = chronoField43.getRangeUnit();
        boolean boolean47 = temporalUnit46.isDurationEstimated();
        boolean boolean48 = chronoLocalDate32.isSupported(temporalUnit46);
        java.time.LocalTime localTime49 = localTime24.truncatedTo(temporalUnit46);
        java.time.OffsetDateTime offsetDateTime50 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime52 = offsetDateTime50.withMinute((int) (short) 1);
        java.time.LocalTime localTime53 = offsetDateTime52.toLocalTime();
        java.time.LocalDate localDate54 = java.time.LocalDate.MIN;
        int int55 = localDate54.lengthOfYear();
        java.time.LocalDate localDate56 = java.time.LocalDate.MIN;
        boolean boolean57 = localDate54.isAfter((java.time.chrono.ChronoLocalDate) localDate56);
        java.time.LocalDateTime localDateTime58 = localTime53.atDate(localDate54);
        java.time.OffsetDateTime offsetDateTime59 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset60 = offsetDateTime59.getOffset();
        java.time.ZonedDateTime zonedDateTime61 = localDateTime58.atZone((java.time.ZoneId) zoneOffset60);
        java.time.temporal.ChronoField chronoField62 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long63 = localDateTime58.getLong((java.time.temporal.TemporalField) chronoField62);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime65 = localTime49.with((java.time.temporal.TemporalField) chronoField62, (long) 122);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for ClockHourOfAmPm (valid values 1 - 12): 122");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField20.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9L + "'", long21 == 9L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit23 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit23.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 365 + "'", int27 == 365);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(chronoLocalDate32);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertNotNull(zoneOffset35);
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertNotNull(zoneOffset39);
        org.junit.Assert.assertNotNull(offsetDateTime40);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField43.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 9L + "'", long44 == 9L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit46 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit46.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(offsetDateTime50);
        org.junit.Assert.assertNotNull(offsetDateTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 365 + "'", int55 == 365);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(offsetDateTime59);
        org.junit.Assert.assertNotNull(zoneOffset60);
        org.junit.Assert.assertNotNull(zonedDateTime61);
        org.junit.Assert.assertTrue("'" + chronoField62 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField62.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 9L + "'", long63 == 9L);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset5 = offsetDateTime4.getOffset();
        boolean boolean6 = zoneOffset2.equals((java.lang.Object) zoneOffset5);
        java.time.ZoneId zoneId7 = zoneOffset2.normalized();
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.withMinute((int) (short) 1);
        java.time.LocalTime localTime11 = offsetDateTime10.toLocalTime();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        int int13 = localDate12.lengthOfYear();
        java.time.LocalDate localDate14 = java.time.LocalDate.MIN;
        boolean boolean15 = localDate12.isAfter((java.time.chrono.ChronoLocalDate) localDate14);
        java.time.LocalDateTime localDateTime16 = localTime11.atDate(localDate12);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset18 = offsetDateTime17.getOffset();
        java.time.ZonedDateTime zonedDateTime19 = localDateTime16.atZone((java.time.ZoneId) zoneOffset18);
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules21 = zoneOffset20.getRules();
        java.time.Clock clock22 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset20);
        long long23 = localDateTime16.toEpochSecond(zoneOffset20);
        int int24 = zoneOffset2.compareTo(zoneOffset20);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 365 + "'", int13 == 365);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(zoneRules21);
        org.junit.Assert.assertNotNull(clock22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-31557014135564335L) + "'", long23 == (-31557014135564335L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        boolean boolean3 = localDate0.isAfter((java.time.chrono.ChronoLocalDate) localDate2);
        java.time.Period period5 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate6 = localDate0.minus((java.time.temporal.TemporalAmount) period5);
        long long7 = localDate0.toEpochDay();
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime8.withOffsetSameInstant(zoneOffset10);
        java.time.Month month12 = offsetDateTime8.getMonth();
        java.time.LocalDate localDate13 = localDate0.with((java.time.temporal.TemporalAdjuster) month12);
        int int14 = month12.maxLength();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoLocalDate6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-365243219162L) + "'", long7 == (-365243219162L));
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + month12 + "' != '" + java.time.Month.FEBRUARY + "'", month12.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-31557014135564285L), (double) '#', (double) 100, (double) 1645434842474L);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.text.Format.Field field7 = null;
        java.text.FieldPosition fieldPosition8 = new java.text.FieldPosition(field7);
        java.nio.file.attribute.FileTime fileTime10 = java.nio.file.attribute.FileTime.fromMillis((long) (short) 0);
        java.lang.Object[] objArray11 = new java.lang.Object[] { '#', (byte) 10, (byte) 1, 1.0d, fieldPosition8, fileTime10 };
        java.net.UnknownHostException unknownHostException13 = new java.net.UnknownHostException("hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "Higham-Hall 5(4)", objArray11, (java.lang.Throwable) unknownHostException13);
        java.security.GeneralSecurityException generalSecurityException15 = new java.security.GeneralSecurityException("hi!", (java.lang.Throwable) unknownHostException13);
        java.util.Optional<java.io.IOException> iOExceptionOptional16 = java.util.Optional.ofNullable((java.io.IOException) unknownHostException13);
        org.junit.Assert.assertNotNull(fileTime10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertNotNull(iOExceptionOptional16);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "Higham-Hall 5(4)");
        java.nio.file.Path path3 = file2.toPath();
        java.io.File file4 = null;
        java.io.File file6 = new java.io.File(file4, "Higham-Hall 5(4)");
        java.nio.file.Path path7 = file6.toPath();
        int int8 = path3.compareTo(path7);
        java.nio.file.Path path10 = path7.resolve("/");
        java.util.Spliterator<java.nio.file.Path> pathSpliterator11 = path7.spliterator();
        java.nio.file.LinkOption[] linkOptionArray12 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path13 = path7.toRealPath(linkOptionArray12);
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: Higham-Hall 5(4)");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(path7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(pathSpliterator11);
        org.junit.Assert.assertNotNull(linkOptionArray12);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Instant instant4 = offsetDateTime3.toInstant();
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset7 = offsetDateTime6.getOffset();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime5.withOffsetSameInstant(zoneOffset7);
        java.time.Instant instant9 = offsetDateTime8.toInstant();
        boolean boolean10 = instant4.isAfter(instant9);
        long long11 = instant9.toEpochMilli();
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset14 = offsetDateTime13.getOffset();
        java.time.OffsetDateTime offsetDateTime15 = offsetDateTime12.withOffsetSameInstant(zoneOffset14);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules18 = zoneOffset17.getRules();
        int int19 = zoneOffset16.compareTo(zoneOffset17);
        java.time.ZonedDateTime zonedDateTime20 = offsetDateTime12.atZoneSimilarLocal((java.time.ZoneId) zoneOffset16);
        java.io.UnsupportedEncodingException unsupportedEncodingException21 = new java.io.UnsupportedEncodingException();
        boolean boolean22 = zoneOffset16.equals((java.lang.Object) unsupportedEncodingException21);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.ofInstant(instant9, (java.time.ZoneId) zoneOffset16);
        java.time.Clock clock24 = java.time.Clock.system((java.time.ZoneId) zoneOffset16);
        java.time.Month month25 = java.time.Month.JANUARY;
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery26 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period27 = month25.query(periodTemporalQuery26);
        java.time.Period period28 = zoneOffset16.query(periodTemporalQuery26);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1645434845681L + "'", long11 == 1645434845681L);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneRules18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(clock24);
        org.junit.Assert.assertTrue("'" + month25 + "' != '" + java.time.Month.JANUARY + "'", month25.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertNotNull(periodTemporalQuery26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset0);
        java.time.format.FormatStyle formatStyle3 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle3);
        java.lang.String str5 = localDateTime2.format(dateTimeFormatter4);
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules7 = zoneOffset6.getRules();
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.withMinute((int) (short) 1);
        java.time.LocalTime localTime11 = offsetDateTime10.toLocalTime();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        int int13 = localDate12.lengthOfYear();
        java.time.LocalDate localDate14 = java.time.LocalDate.MIN;
        boolean boolean15 = localDate12.isAfter((java.time.chrono.ChronoLocalDate) localDate14);
        java.time.LocalDateTime localDateTime16 = localTime11.atDate(localDate12);
        java.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset19 = zoneRules7.getOffset(localDateTime18);
        java.text.Format.Field field27 = null;
        java.text.FieldPosition fieldPosition28 = new java.text.FieldPosition(field27);
        java.nio.file.attribute.FileTime fileTime30 = java.nio.file.attribute.FileTime.fromMillis((long) (short) 0);
        java.lang.Object[] objArray31 = new java.lang.Object[] { '#', (byte) 10, (byte) 1, 1.0d, fieldPosition28, fileTime30 };
        java.net.UnknownHostException unknownHostException33 = new java.net.UnknownHostException("hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "Higham-Hall 5(4)", objArray31, (java.lang.Throwable) unknownHostException33);
        java.security.GeneralSecurityException generalSecurityException35 = new java.security.GeneralSecurityException("hi!", (java.lang.Throwable) unknownHostException33);
        boolean boolean36 = zoneOffset19.equals((java.lang.Object) "hi!");
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime37 = localDateTime2.atZone((java.time.ZoneId) zoneOffset19);
        java.time.OffsetDateTime offsetDateTime38 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime40 = offsetDateTime38.withMinute((int) (short) 1);
        java.time.LocalTime localTime41 = offsetDateTime40.toLocalTime();
        java.time.LocalDate localDate42 = java.time.LocalDate.MIN;
        int int43 = localDate42.lengthOfYear();
        java.time.LocalDate localDate44 = java.time.LocalDate.MIN;
        boolean boolean45 = localDate42.isAfter((java.time.chrono.ChronoLocalDate) localDate44);
        java.time.LocalDateTime localDateTime46 = localTime41.atDate(localDate42);
        java.time.OffsetDateTime offsetDateTime47 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset48 = offsetDateTime47.getOffset();
        java.time.ZonedDateTime zonedDateTime49 = localDateTime46.atZone((java.time.ZoneId) zoneOffset48);
        java.time.OffsetDateTime offsetDateTime50 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime52 = offsetDateTime50.withMinute((int) (short) 1);
        java.time.LocalTime localTime53 = offsetDateTime52.toLocalTime();
        java.time.LocalDate localDate54 = java.time.LocalDate.MIN;
        int int55 = localDate54.lengthOfYear();
        java.time.LocalDate localDate56 = java.time.LocalDate.MIN;
        boolean boolean57 = localDate54.isAfter((java.time.chrono.ChronoLocalDate) localDate56);
        java.time.LocalDateTime localDateTime58 = localTime53.atDate(localDate54);
        java.time.OffsetDateTime offsetDateTime59 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset60 = offsetDateTime59.getOffset();
        java.time.ZonedDateTime zonedDateTime61 = localDateTime58.atZone((java.time.ZoneId) zoneOffset60);
        java.time.ZoneOffset zoneOffset62 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules63 = zoneOffset62.getRules();
        java.time.LocalDateTime localDateTime64 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset62);
        java.time.ZoneOffset zoneOffset66 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime67 = java.time.ZonedDateTime.ofStrict(localDateTime58, zoneOffset62, (java.time.ZoneId) zoneOffset66);
        boolean boolean68 = zonedDateTime49.isAfter((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime67);
        int int69 = localDateChronoZonedDateTime37.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime49);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + formatStyle3 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle3.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Monday, February 21, 2022" + "'", str5, "Monday, February 21, 2022");
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(zoneRules7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 365 + "'", int13 == 365);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(fileTime30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime37);
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertNotNull(offsetDateTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 365 + "'", int43 == 365);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(offsetDateTime47);
        org.junit.Assert.assertNotNull(zoneOffset48);
        org.junit.Assert.assertNotNull(zonedDateTime49);
        org.junit.Assert.assertNotNull(offsetDateTime50);
        org.junit.Assert.assertNotNull(offsetDateTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 365 + "'", int55 == 365);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(offsetDateTime59);
        org.junit.Assert.assertNotNull(zoneOffset60);
        org.junit.Assert.assertNotNull(zonedDateTime61);
        org.junit.Assert.assertNotNull(zoneOffset62);
        org.junit.Assert.assertNotNull(zoneRules63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(zoneOffset66);
        org.junit.Assert.assertNotNull(zonedDateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Clock clock2 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset0);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.now(clock2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset5 = offsetDateTime4.getOffset();
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset7 = offsetDateTime6.getOffset();
        boolean boolean8 = offsetDateTime4.isEqual(offsetDateTime6);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long10 = offsetDateTime4.getLong((java.time.temporal.TemporalField) chronoField9);
        boolean boolean11 = chronoField9.isDateBased();
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset14 = offsetDateTime13.getOffset();
        java.time.OffsetDateTime offsetDateTime15 = offsetDateTime12.withOffsetSameInstant(zoneOffset14);
        java.time.temporal.ValueRange valueRange16 = chronoField9.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime15);
        boolean boolean17 = chronoField9.isDateBased();
        long long18 = offsetTime3.getLong((java.time.temporal.TemporalField) chronoField9);
        java.time.OffsetDateTime offsetDateTime19 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime20 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset21 = offsetDateTime20.getOffset();
        java.time.OffsetDateTime offsetDateTime22 = offsetDateTime19.withOffsetSameInstant(zoneOffset21);
        java.time.Month month23 = offsetDateTime19.getMonth();
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime26 = offsetDateTime24.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime28 = offsetDateTime26.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime29 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime30 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset31 = offsetDateTime30.getOffset();
        java.time.OffsetDateTime offsetDateTime32 = offsetDateTime29.withOffsetSameInstant(zoneOffset31);
        java.time.OffsetDateTime offsetDateTime33 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset34 = offsetDateTime33.getOffset();
        boolean boolean35 = zoneOffset31.equals((java.lang.Object) zoneOffset34);
        java.time.ZonedDateTime zonedDateTime36 = offsetDateTime26.atZoneSimilarLocal((java.time.ZoneId) zoneOffset34);
        java.time.Period period38 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology39 = period38.getChronology();
        java.time.Period period41 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoPeriod chronoPeriod42 = period38.minus((java.time.temporal.TemporalAmount) period41);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime43 = zonedDateTime36.minus((java.time.temporal.TemporalAmount) period41);
        java.time.temporal.Temporal temporal44 = month23.adjustInto((java.time.temporal.Temporal) zonedDateTime36);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        boolean boolean46 = month23.isSupported((java.time.temporal.TemporalField) chronoField45);
        int int47 = offsetTime3.get((java.time.temporal.TemporalField) chronoField45);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField9.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(valueRange16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9L + "'", long18 == 9L);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertTrue("'" + month23 + "' != '" + java.time.Month.FEBRUARY + "'", month23.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(offsetDateTime29);
        org.junit.Assert.assertNotNull(offsetDateTime30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(chronoPeriod42);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime43);
        org.junit.Assert.assertNotNull(temporal44);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField45.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        int int2 = localDate1.lengthOfYear();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        java.time.Period period5 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.withMinute((int) (short) 1);
        java.time.LocalTime localTime9 = offsetDateTime8.toLocalTime();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        int int11 = localDate10.lengthOfYear();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        boolean boolean13 = localDate10.isAfter((java.time.chrono.ChronoLocalDate) localDate12);
        java.time.LocalDateTime localDateTime14 = localTime9.atDate(localDate10);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset18 = offsetDateTime17.getOffset();
        boolean boolean19 = offsetDateTime15.isEqual(offsetDateTime17);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long21 = offsetDateTime15.getLong((java.time.temporal.TemporalField) chronoField20);
        boolean boolean22 = chronoField20.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit23 = chronoField20.getRangeUnit();
        java.time.LocalTime localTime24 = localTime9.truncatedTo(temporalUnit23);
        java.time.LocalDateTime localDateTime25 = localDate1.atTime(localTime24);
        java.time.LocalTime localTime27 = localTime24.withNano((int) (byte) 100);
        java.time.OffsetDateTime offsetDateTime29 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime31 = offsetDateTime29.withMinute((int) (short) 1);
        java.time.LocalTime localTime32 = offsetDateTime31.toLocalTime();
        java.time.LocalDate localDate33 = java.time.LocalDate.MIN;
        int int34 = localDate33.lengthOfYear();
        java.time.LocalDate localDate35 = java.time.LocalDate.MIN;
        boolean boolean36 = localDate33.isAfter((java.time.chrono.ChronoLocalDate) localDate35);
        java.time.LocalDateTime localDateTime37 = localTime32.atDate(localDate33);
        java.time.OffsetDateTime offsetDateTime38 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime40 = offsetDateTime38.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime41 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime43 = offsetDateTime41.withMinute((int) (short) 1);
        java.time.LocalTime localTime44 = offsetDateTime43.toLocalTime();
        java.time.LocalDate localDate45 = java.time.LocalDate.MIN;
        int int46 = localDate45.lengthOfYear();
        java.time.LocalDate localDate47 = java.time.LocalDate.MIN;
        boolean boolean48 = localDate45.isAfter((java.time.chrono.ChronoLocalDate) localDate47);
        java.time.LocalDateTime localDateTime49 = localTime44.atDate(localDate45);
        java.time.OffsetDateTime offsetDateTime50 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset51 = offsetDateTime50.getOffset();
        java.time.OffsetDateTime offsetDateTime52 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset53 = offsetDateTime52.getOffset();
        boolean boolean54 = offsetDateTime50.isEqual(offsetDateTime52);
        java.time.temporal.ChronoField chronoField55 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long56 = offsetDateTime50.getLong((java.time.temporal.TemporalField) chronoField55);
        boolean boolean57 = chronoField55.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit58 = chronoField55.getRangeUnit();
        java.time.LocalTime localTime59 = localTime44.truncatedTo(temporalUnit58);
        long long60 = localDateTime37.until((java.time.temporal.Temporal) offsetDateTime38, temporalUnit58);
        java.time.temporal.Temporal temporal61 = localTime24.plus((-31557014135564285L), temporalUnit58);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField20.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9L + "'", long21 == 9L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit23 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit23.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(offsetDateTime29);
        org.junit.Assert.assertNotNull(offsetDateTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 365 + "'", int34 == 365);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertNotNull(offsetDateTime40);
        org.junit.Assert.assertNotNull(offsetDateTime41);
        org.junit.Assert.assertNotNull(offsetDateTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 365 + "'", int46 == 365);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(offsetDateTime50);
        org.junit.Assert.assertNotNull(zoneOffset51);
        org.junit.Assert.assertNotNull(offsetDateTime52);
        org.junit.Assert.assertNotNull(zoneOffset53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + chronoField55 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField55.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 9L + "'", long56 == 9L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit58 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit58.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 730486476412L + "'", long60 == 730486476412L);
        org.junit.Assert.assertNotNull(temporal61);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.time.Period period1 = java.time.Period.ofDays(0);
        java.time.Period period3 = period1.plusDays((long) 1);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime4.withMinute((int) (short) 1);
        java.time.LocalTime localTime7 = offsetDateTime6.toLocalTime();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        int int9 = localDate8.lengthOfYear();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        boolean boolean11 = localDate8.isAfter((java.time.chrono.ChronoLocalDate) localDate10);
        java.time.LocalDateTime localDateTime12 = localTime7.atDate(localDate8);
        java.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((long) 4096);
        int int15 = localDateTime12.getDayOfMonth();
        java.time.temporal.Temporal temporal16 = period1.subtractFrom((java.time.temporal.Temporal) localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = localDateTime12.withSecond(100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 365 + "'", int9 == 365);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(temporal16);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap2 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>(1, (float) 12L);
        java.time.format.FormatStyle formatStyle3 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle3);
        java.time.format.DecimalStyle decimalStyle5 = java.time.format.DecimalStyle.ofDefaultLocale();
        char char6 = decimalStyle5.getZeroDigit();
        java.time.format.DecimalStyle decimalStyle8 = decimalStyle5.withNegativeSign('a');
        java.lang.Object obj9 = formatStyleEnumMap2.replace((java.lang.Enum<java.time.format.FormatStyle>) formatStyle3, (java.lang.Object) decimalStyle8);
        java.util.Set<java.util.Map.Entry<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>> formatStyleEnumEntrySet10 = formatStyleEnumMap2.entrySet();
        formatStyleEnumMap2.clear();
        org.junit.Assert.assertTrue("'" + formatStyle3 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle3.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(decimalStyle5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertNotNull(decimalStyle8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(formatStyleEnumEntrySet10);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.time.Period period1 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology2 = period1.getChronology();
        java.time.Period period4 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoPeriod chronoPeriod5 = period1.minus((java.time.temporal.TemporalAmount) period4);
        int int6 = period4.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(chronoPeriod5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.minusHours((long) ' ');
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime5 = zonedDateTime3.withHour((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int[] intArray2 = new int[] { (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer5 = java.nio.IntBuffer.wrap(intArray2, 28, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        boolean boolean3 = localDate0.isAfter((java.time.chrono.ChronoLocalDate) localDate2);
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        int int6 = localDate5.lengthOfYear();
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        boolean boolean8 = localDate5.isAfter((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.Period period10 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate11 = localDate5.minus((java.time.temporal.TemporalAmount) period10);
        java.time.chrono.ChronoPeriod chronoPeriod12 = localDate4.until(chronoLocalDate11);
        boolean boolean13 = localDate2.isEqual((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.LocalDate localDate14 = java.time.LocalDate.MIN;
        int int15 = localDate14.lengthOfYear();
        java.lang.String str16 = localDate14.toString();
        java.time.LocalDate localDate17 = java.time.LocalDate.MIN;
        int int18 = localDate17.lengthOfYear();
        java.time.LocalDate localDate19 = java.time.LocalDate.MIN;
        boolean boolean20 = localDate17.isAfter((java.time.chrono.ChronoLocalDate) localDate19);
        java.time.Period period22 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate23 = localDate17.minus((java.time.temporal.TemporalAmount) period22);
        long long24 = localDate17.toEpochDay();
        java.time.LocalDate localDate25 = localDate14.with((java.time.temporal.TemporalAdjuster) localDate17);
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime28 = offsetDateTime26.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime30 = offsetDateTime28.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime31 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset33 = offsetDateTime32.getOffset();
        java.time.OffsetDateTime offsetDateTime34 = offsetDateTime31.withOffsetSameInstant(zoneOffset33);
        java.time.OffsetDateTime offsetDateTime35 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset36 = offsetDateTime35.getOffset();
        boolean boolean37 = zoneOffset33.equals((java.lang.Object) zoneOffset36);
        java.time.ZonedDateTime zonedDateTime38 = offsetDateTime28.atZoneSimilarLocal((java.time.ZoneId) zoneOffset36);
        java.time.ZonedDateTime zonedDateTime39 = localDate25.atStartOfDay((java.time.ZoneId) zoneOffset36);
        int int40 = localDate25.getYear();
        boolean boolean41 = localDate2.isBefore((java.time.chrono.ChronoLocalDate) localDate25);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(chronoLocalDate11);
        org.junit.Assert.assertNotNull(chronoPeriod12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 365 + "'", int15 == 365);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-999999999-01-01" + "'", str16, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 365 + "'", int18 == 365);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(chronoLocalDate23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-365243219162L) + "'", long24 == (-365243219162L));
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(offsetDateTime30);
        org.junit.Assert.assertNotNull(offsetDateTime31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertNotNull(zonedDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-999999999) + "'", int40 == (-999999999));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime4.withMinute((int) (short) 1);
        java.time.LocalTime localTime7 = offsetDateTime6.toLocalTime();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        int int9 = localDate8.lengthOfYear();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        boolean boolean11 = localDate8.isAfter((java.time.chrono.ChronoLocalDate) localDate10);
        java.time.LocalDateTime localDateTime12 = localTime7.atDate(localDate8);
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset14 = offsetDateTime13.getOffset();
        java.time.ZonedDateTime zonedDateTime15 = localDateTime12.atZone((java.time.ZoneId) zoneOffset14);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules17 = zoneOffset16.getRules();
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset16);
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime21 = java.time.ZonedDateTime.ofStrict(localDateTime12, zoneOffset16, (java.time.ZoneId) zoneOffset20);
        java.time.OffsetTime offsetTime22 = java.time.OffsetTime.of(localTime3, zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 365 + "'", int9 == 365);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneRules17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(offsetTime22);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.util.Comparator<java.time.ZonedDateTime> zonedDateTimeComparator0 = java.util.Comparator.naturalOrder();
        org.junit.Assert.assertNotNull(zonedDateTimeComparator0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle0);
        java.time.format.FormatStyle formatStyle2 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter3 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle2);
        java.util.LinkedHashSet<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet4 = new java.util.LinkedHashSet<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean5 = formatStyleEnumSet4.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle0);
        boolean boolean6 = formatStyleEnumSet4.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle2);
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap8 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet9 = formatStyleEnumMap8.keySet();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        boolean boolean11 = formatStyleEnumMap8.contains((java.lang.Object) localDate10);
        boolean boolean12 = formatStyleEnumSet4.remove((java.lang.Object) boolean11);
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle0.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + formatStyle2 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle2.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(formatStyleEnumSet9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 10L, (double) '4', (double) 100);
        java.lang.String str5 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) ' ');
        int int8 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofHours(122);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 122 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap1 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Enumeration<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumEnumeration2 = formatStyleEnumMap1.keys();
        boolean boolean3 = formatStyleEnumEnumeration2.hasMoreElements();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum<java.time.format.FormatStyle> formatStyleEnum4 = formatStyleEnumEnumeration2.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatStyleEnumEnumeration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime1.withMinute((int) (short) 1);
        java.time.LocalTime localTime4 = offsetDateTime3.toLocalTime();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        int int6 = localDate5.lengthOfYear();
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        boolean boolean8 = localDate5.isAfter((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.LocalDateTime localDateTime9 = localTime4.atDate(localDate5);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset11 = offsetDateTime10.getOffset();
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset13 = offsetDateTime12.getOffset();
        boolean boolean14 = offsetDateTime10.isEqual(offsetDateTime12);
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long16 = offsetDateTime10.getLong((java.time.temporal.TemporalField) chronoField15);
        boolean boolean17 = chronoField15.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit18 = chronoField15.getRangeUnit();
        java.time.LocalTime localTime19 = localTime4.truncatedTo(temporalUnit18);
        java.time.Duration duration20 = java.time.Duration.of(0L, temporalUnit18);
        java.time.Duration duration22 = duration20.withNanos((int) (byte) 0);
        boolean boolean23 = duration20.isNegative();
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField15.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9L + "'", long16 == 9L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit18 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit18.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.lang.String str2 = localDate0.toString();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        int int4 = localDate3.lengthOfYear();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        boolean boolean6 = localDate3.isAfter((java.time.chrono.ChronoLocalDate) localDate5);
        java.time.Period period8 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate9 = localDate3.minus((java.time.temporal.TemporalAmount) period8);
        long long10 = localDate3.toEpochDay();
        java.time.LocalDate localDate11 = localDate0.with((java.time.temporal.TemporalAdjuster) localDate3);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime12.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime16 = offsetDateTime14.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime18 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset19 = offsetDateTime18.getOffset();
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime17.withOffsetSameInstant(zoneOffset19);
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset22 = offsetDateTime21.getOffset();
        boolean boolean23 = zoneOffset19.equals((java.lang.Object) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = offsetDateTime14.atZoneSimilarLocal((java.time.ZoneId) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime25 = localDate11.atStartOfDay((java.time.ZoneId) zoneOffset22);
        int int26 = localDate11.getYear();
        java.io.PrintWriter printWriter28 = new java.io.PrintWriter("Subject:\n");
        printWriter28.close();
        printWriter28.close();
        boolean boolean31 = localDate11.equals((java.lang.Object) printWriter28);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(chronoLocalDate9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-365243219162L) + "'", long10 == (-365243219162L));
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-999999999) + "'", int26 == (-999999999));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap1 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet2 = formatStyleEnumMap1.keySet();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = formatStyleEnumMap1.contains((java.lang.Object) localDate3);
        java.util.Enumeration<java.lang.Object> objEnumeration5 = formatStyleEnumMap1.elements();
        java.net.URL uRL6 = null;
        java.security.cert.Certificate[] certificateArray7 = new java.security.cert.Certificate[] {};
        java.security.CodeSource codeSource8 = new java.security.CodeSource(uRL6, certificateArray7);
        boolean boolean9 = formatStyleEnumMap1.containsKey((java.lang.Object) codeSource8);
        org.junit.Assert.assertNotNull(formatStyleEnumSet2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objEnumeration5);
        org.junit.Assert.assertNotNull(certificateArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHoursMinutes((int) (byte) 10, 120000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset minutes not in valid range: value 120000000 is not in the range -59 to 59");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap4);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator6 = languageRangeList2.spliterator();
        int int7 = languageRangeSpliterator6.characteristics();
        boolean boolean8 = attribute0.equals((java.lang.Object) languageRangeSpliterator6);
        org.junit.Assert.assertNotNull(attribute0);
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16464 + "'", int7 == 16464);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.util.Date date0 = new java.util.Date();
        java.util.Date date1 = new java.util.Date();
        date1.setHours(0);
        date1.setMinutes((int) (byte) -1);
        boolean boolean6 = date0.after(date1);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 09:14:07 UTC 2022");
        org.junit.Assert.assertEquals(date1.toString(), "Sun Feb 20 23:59:07 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        java.time.ZonedDateTime zonedDateTime13 = localDateTime10.atZone((java.time.ZoneId) zoneOffset12);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules15 = zoneOffset14.getRules();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset14);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.ofStrict(localDateTime10, zoneOffset14, (java.time.ZoneId) zoneOffset18);
        javax.security.auth.Subject subject20 = new javax.security.auth.Subject();
        java.lang.Object obj21 = properties1.putIfAbsent((java.lang.Object) zoneOffset18, (java.lang.Object) subject20);
        java.util.stream.Stream<java.net.UnknownHostException> unknownHostExceptionStream22 = java.util.stream.Stream.empty();
        java.util.stream.DoubleStream.Builder builder23 = java.util.stream.DoubleStream.builder();
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Collection<java.lang.String> strCollection27 = null;
        java.lang.String str28 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strCollection27);
        java.time.format.FormatStyle formatStyle29 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter30 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle29);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList31 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean32 = formatStyleEnumList31.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle29);
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream33 = formatStyleEnumList31.parallelStream();
        java.time.format.FormatStyle formatStyle34 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter35 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle34);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList36 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean37 = formatStyleEnumList36.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle34);
        java.time.format.FormatStyle formatStyle38 = java.time.format.FormatStyle.FULL;
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList39 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean40 = formatStyleEnumList39.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle38);
        boolean boolean41 = formatStyleEnumList36.retainAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumList39);
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap43 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet44 = formatStyleEnumMap43.keySet();
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap46 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet47 = formatStyleEnumMap46.keySet();
        boolean boolean48 = formatStyleEnumSet44.retainAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet47);
        boolean boolean49 = formatStyleEnumList39.containsAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet47);
        boolean boolean50 = formatStyleEnumList31.removeAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet47);
        boolean boolean51 = languageRangeList25.removeAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet47);
        boolean boolean52 = properties1.replace((java.lang.Object) unknownHostExceptionStream22, (java.lang.Object) builder23, (java.lang.Object) boolean51);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneRules15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(unknownHostExceptionStream22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + formatStyle29 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle29.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(formatStyleEnumStream33);
        org.junit.Assert.assertTrue("'" + formatStyle34 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle34.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + formatStyle38 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle38.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(formatStyleEnumSet44);
        org.junit.Assert.assertNotNull(formatStyleEnumSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        long[] longArray0 = new long[] {};
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(longArray0);
        java.util.stream.LongStream longStream2 = longStream1.sequential();
        java.util.stream.LongStream longStream4 = longStream2.limit((long) (short) 0);
        java.util.function.LongToIntFunction longToIntFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = longStream2.mapToInt(longToIntFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.net.Proxy proxy0 = java.net.Proxy.NO_PROXY;
        java.net.SocketAddress socketAddress1 = proxy0.address();
        org.junit.Assert.assertNotNull(proxy0);
        org.junit.Assert.assertNull(socketAddress1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Instant instant4 = offsetDateTime3.toInstant();
        java.util.Optional<java.time.OffsetDateTime> offsetDateTimeOptional5 = java.util.Optional.ofNullable(offsetDateTime3);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset8 = offsetDateTime7.getOffset();
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime6.withOffsetSameInstant(zoneOffset8);
        java.time.Month month10 = offsetDateTime6.getMonth();
        java.time.OffsetDateTime offsetDateTime12 = offsetDateTime6.plusMinutes((long) (byte) 1);
        int int13 = offsetDateTime3.compareTo(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetDateTimeOptional5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertTrue("'" + month10 + "' != '" + java.time.Month.FEBRUARY + "'", month10.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset5 = offsetDateTime4.getOffset();
        boolean boolean6 = zoneOffset2.equals((java.lang.Object) zoneOffset5);
        java.time.LocalDate localDate7 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset2);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset9 = offsetDateTime8.getOffset();
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset11 = offsetDateTime10.getOffset();
        boolean boolean12 = offsetDateTime8.isEqual(offsetDateTime10);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getRangeUnit();
        long long15 = offsetDateTime8.getLong((java.time.temporal.TemporalField) chronoField13);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = localDate7.getLong((java.time.temporal.TemporalField) chronoField13);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField13.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.lang.String str2 = localDate0.toString();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = localDate0.isBefore((java.time.chrono.ChronoLocalDate) localDate3);
        java.lang.String str5 = localDate0.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-999999999-01-01" + "'", str5, "-999999999-01-01");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_TIME;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.parse((java.lang.CharSequence) "Chinese", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Chinese' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle1 = textStyle0.asStandalone();
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle0.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.NARROW_STANDALONE + "'", textStyle1.equals(java.time.format.TextStyle.NARROW_STANDALONE));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset1 = offsetDateTime0.getOffset();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset3 = offsetDateTime2.getOffset();
        boolean boolean4 = offsetDateTime0.isEqual(offsetDateTime2);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        long long7 = offsetDateTime0.getLong((java.time.temporal.TemporalField) chronoField5);
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        int int9 = localDate8.lengthOfYear();
        java.lang.String str10 = localDate8.toString();
        java.time.LocalDate localDate11 = java.time.LocalDate.MIN;
        int int12 = localDate11.lengthOfYear();
        java.time.LocalDate localDate13 = java.time.LocalDate.MIN;
        boolean boolean14 = localDate11.isAfter((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.Period period16 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate17 = localDate11.minus((java.time.temporal.TemporalAmount) period16);
        long long18 = localDate11.toEpochDay();
        java.time.LocalDate localDate19 = localDate8.with((java.time.temporal.TemporalAdjuster) localDate11);
        java.time.LocalDate localDate21 = localDate11.withDayOfYear((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate23 = chronoField5.adjustInto(localDate11, (long) 13);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for ClockHourOfAmPm (valid values 1 - 12): 13");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField5.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 365 + "'", int9 == 365);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-999999999-01-01" + "'", str10, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 365 + "'", int12 == 365);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(chronoLocalDate17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-365243219162L) + "'", long18 == (-365243219162L));
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        long long0 = java.security.PublicKey.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 7187392471159151072L + "'", long0 == 7187392471159151072L);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusYears((long) 100);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime5);
        java.time.format.DateTimeFormatter dateTimeFormatter7 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.util.Set<java.time.temporal.TemporalField> temporalFieldSet8 = dateTimeFormatter7.getResolverFields();
        java.time.LocalDate localDate9 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        int int11 = localDate10.lengthOfYear();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        boolean boolean13 = localDate10.isAfter((java.time.chrono.ChronoLocalDate) localDate12);
        java.time.Period period15 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate16 = localDate10.minus((java.time.temporal.TemporalAmount) period15);
        java.time.chrono.ChronoPeriod chronoPeriod17 = localDate9.until(chronoLocalDate16);
        java.time.chrono.Chronology chronology18 = chronoLocalDate16.getChronology();
        java.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter7.withChronology(chronology18);
        java.lang.String str20 = offsetDateTime5.format(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(temporalFieldSet8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(chronoLocalDate16);
        org.junit.Assert.assertNotNull(chronoPeriod17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1922-02-21" + "'", str20, "1922-02-21");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        boolean boolean3 = localDate0.isAfter((java.time.chrono.ChronoLocalDate) localDate2);
        java.time.Period period5 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate6 = localDate0.minus((java.time.temporal.TemporalAmount) period5);
        java.time.Period period8 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology9 = period8.getChronology();
        java.time.Period period10 = period5.plus((java.time.temporal.TemporalAmount) period8);
        java.time.Period period12 = period10.withYears((int) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod13 = period12.normalized();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoLocalDate6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(chronoPeriod13);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "Higham-Hall 5(4)");
        boolean boolean3 = file2.isHidden();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("Saturday");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.close();
        printWriter1.println((float) 0);
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.setDefault(locale6);
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator10 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.text.Format.Field field11 = null;
        java.text.FieldPosition fieldPosition12 = new java.text.FieldPosition(field11);
        fieldPosition12.setBeginIndex((int) ' ');
        java.nio.ByteOrder byteOrder15 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.lang.Object[] objArray16 = new java.lang.Object[] { wildcardChronoZonedDateTimeComparator10, ' ', byteOrder15 };
        java.io.PrintWriter printWriter17 = printWriter1.printf(locale6, "", objArray16);
        java.lang.String str18 = locale6.getISO3Country();
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator10);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(printWriter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.OffsetDateTime offsetDateTime5 = offsetDateTime3.minusYears((long) 100);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusHours((long) ' ');
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime6);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime10 = zonedDateTime9.withLaterOffsetAtOverlap();
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset14 = offsetDateTime13.getOffset();
        java.time.OffsetDateTime offsetDateTime15 = offsetDateTime12.withOffsetSameInstant(zoneOffset14);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules18 = zoneOffset17.getRules();
        int int19 = zoneOffset16.compareTo(zoneOffset17);
        java.time.ZonedDateTime zonedDateTime20 = offsetDateTime12.atZoneSimilarLocal((java.time.ZoneId) zoneOffset16);
        java.time.chrono.Chronology chronology21 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) offsetDateTime12);
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules24 = zoneOffset23.getRules();
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime27 = offsetDateTime25.withMinute((int) (short) 1);
        java.time.LocalTime localTime28 = offsetDateTime27.toLocalTime();
        java.time.LocalDate localDate29 = java.time.LocalDate.MIN;
        int int30 = localDate29.lengthOfYear();
        java.time.LocalDate localDate31 = java.time.LocalDate.MIN;
        boolean boolean32 = localDate29.isAfter((java.time.chrono.ChronoLocalDate) localDate31);
        java.time.LocalDateTime localDateTime33 = localTime28.atDate(localDate29);
        java.time.LocalDateTime localDateTime35 = localDateTime33.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset36 = zoneRules24.getOffset(localDateTime35);
        java.time.OffsetDateTime offsetDateTime38 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime40 = offsetDateTime38.withMinute((int) (short) 1);
        java.time.LocalTime localTime41 = offsetDateTime40.toLocalTime();
        java.time.LocalDate localDate42 = java.time.LocalDate.MIN;
        int int43 = localDate42.lengthOfYear();
        java.time.LocalDate localDate44 = java.time.LocalDate.MIN;
        boolean boolean45 = localDate42.isAfter((java.time.chrono.ChronoLocalDate) localDate44);
        java.time.LocalDateTime localDateTime46 = localTime41.atDate(localDate42);
        java.time.OffsetDateTime offsetDateTime47 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset48 = offsetDateTime47.getOffset();
        java.time.OffsetDateTime offsetDateTime49 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset50 = offsetDateTime49.getOffset();
        boolean boolean51 = offsetDateTime47.isEqual(offsetDateTime49);
        java.time.temporal.ChronoField chronoField52 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long53 = offsetDateTime47.getLong((java.time.temporal.TemporalField) chronoField52);
        boolean boolean54 = chronoField52.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit55 = chronoField52.getRangeUnit();
        java.time.LocalTime localTime56 = localTime41.truncatedTo(temporalUnit55);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime57 = localDateTime35.plus(730486476412L, temporalUnit55);
        java.time.OffsetDateTime offsetDateTime58 = offsetDateTime12.plus((long) 1024, temporalUnit55);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime59 = zonedDateTime9.plus((long) ':', temporalUnit55);
        java.time.OffsetDateTime offsetDateTime60 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime61 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset62 = offsetDateTime61.getOffset();
        java.time.OffsetDateTime offsetDateTime63 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset64 = offsetDateTime63.getOffset();
        boolean boolean65 = offsetDateTime61.isEqual(offsetDateTime63);
        java.time.temporal.ChronoField chronoField66 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long67 = offsetDateTime61.getLong((java.time.temporal.TemporalField) chronoField66);
        boolean boolean68 = chronoField66.isDateBased();
        java.time.temporal.ValueRange valueRange69 = offsetDateTime60.range((java.time.temporal.TemporalField) chronoField66);
        java.time.OffsetDateTime offsetDateTime70 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime72 = offsetDateTime70.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime74 = offsetDateTime72.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime75 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime76 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset77 = offsetDateTime76.getOffset();
        java.time.OffsetDateTime offsetDateTime78 = offsetDateTime75.withOffsetSameInstant(zoneOffset77);
        java.time.OffsetDateTime offsetDateTime79 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset80 = offsetDateTime79.getOffset();
        boolean boolean81 = zoneOffset77.equals((java.lang.Object) zoneOffset80);
        java.time.ZonedDateTime zonedDateTime82 = offsetDateTime72.atZoneSimilarLocal((java.time.ZoneId) zoneOffset80);
        long long83 = chronoField66.getFrom((java.time.temporal.TemporalAccessor) offsetDateTime72);
        boolean boolean84 = temporalUnit55.isSupportedBy((java.time.temporal.Temporal) offsetDateTime72);
        boolean boolean85 = offsetDateTime5.isSupported(temporalUnit55);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneRules18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(zoneRules24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 365 + "'", int30 == 365);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertNotNull(offsetDateTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 365 + "'", int43 == 365);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(offsetDateTime47);
        org.junit.Assert.assertNotNull(zoneOffset48);
        org.junit.Assert.assertNotNull(offsetDateTime49);
        org.junit.Assert.assertNotNull(zoneOffset50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + chronoField52 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField52.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 9L + "'", long53 == 9L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit55 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit55.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime57);
        org.junit.Assert.assertNotNull(offsetDateTime58);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime59);
        org.junit.Assert.assertNotNull(offsetDateTime60);
        org.junit.Assert.assertNotNull(offsetDateTime61);
        org.junit.Assert.assertNotNull(zoneOffset62);
        org.junit.Assert.assertNotNull(offsetDateTime63);
        org.junit.Assert.assertNotNull(zoneOffset64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + chronoField66 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField66.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 9L + "'", long67 == 9L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(valueRange69);
        org.junit.Assert.assertNotNull(offsetDateTime70);
        org.junit.Assert.assertNotNull(offsetDateTime72);
        org.junit.Assert.assertNotNull(offsetDateTime74);
        org.junit.Assert.assertNotNull(offsetDateTime75);
        org.junit.Assert.assertNotNull(offsetDateTime76);
        org.junit.Assert.assertNotNull(zoneOffset77);
        org.junit.Assert.assertNotNull(offsetDateTime78);
        org.junit.Assert.assertNotNull(offsetDateTime79);
        org.junit.Assert.assertNotNull(zoneOffset80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(zonedDateTime82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 9L + "'", long83 == 9L);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset13 = zoneRules1.getOffset(localDateTime12);
        java.nio.file.attribute.FileTime fileTime15 = java.nio.file.attribute.FileTime.fromMillis((long) (short) 0);
        java.nio.file.attribute.FileTime fileTime17 = java.nio.file.attribute.FileTime.fromMillis((long) (short) 0);
        int int18 = fileTime15.compareTo(fileTime17);
        java.time.Instant instant19 = fileTime17.toInstant();
        java.time.Duration duration20 = zoneRules1.getDaylightSavings(instant19);
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime22 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset23 = offsetDateTime22.getOffset();
        java.time.OffsetDateTime offsetDateTime24 = offsetDateTime21.withOffsetSameInstant(zoneOffset23);
        java.time.Instant instant25 = offsetDateTime24.toInstant();
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime27 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset28 = offsetDateTime27.getOffset();
        java.time.OffsetDateTime offsetDateTime29 = offsetDateTime26.withOffsetSameInstant(zoneOffset28);
        java.time.Instant instant30 = offsetDateTime29.toInstant();
        boolean boolean31 = instant25.isAfter(instant30);
        long long32 = instant30.toEpochMilli();
        java.time.Instant instant34 = instant30.plusNanos((-31557014135564281L));
        java.time.ZoneOffset zoneOffset35 = zoneRules1.getStandardOffset(instant34);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(fileTime15);
        org.junit.Assert.assertNotNull(fileTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(offsetDateTime29);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1645434847867L + "'", long32 == 1645434847867L);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(zoneOffset35);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        double[] doubleArray6 = new double[] { 100.0f, 10L, 1, 365, (-1.0d), 100L };
        java.nio.DoubleBuffer doubleBuffer9 = java.nio.DoubleBuffer.wrap(doubleArray6, (int) (byte) 0, (int) (byte) 0);
        boolean boolean10 = doubleBuffer9.isDirect();
        java.lang.String str11 = doubleBuffer9.toString();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0, 365.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.nio.HeapDoubleBuffer[pos=0 lim=0 cap=6]" + "'", str11, "java.nio.HeapDoubleBuffer[pos=0 lim=0 cap=6]");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        int int2 = localDate1.lengthOfYear();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        java.time.Period period6 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate7 = localDate1.minus((java.time.temporal.TemporalAmount) period6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime8.withOffsetSameInstant(zoneOffset10);
        boolean boolean12 = chronoLocalDate7.equals((java.lang.Object) offsetDateTime11);
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset14 = offsetDateTime13.getOffset();
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        boolean boolean17 = offsetDateTime13.isEqual(offsetDateTime15);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long19 = offsetDateTime13.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean20 = chronoField18.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit21 = chronoField18.getRangeUnit();
        boolean boolean22 = temporalUnit21.isDurationEstimated();
        boolean boolean23 = chronoLocalDate7.isSupported(temporalUnit21);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration24 = java.time.Duration.of((-31557014135564285L), temporalUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: long overflow");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(chronoLocalDate7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField18.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit21 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit21.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.duplicate();
        java.nio.FloatBuffer floatBuffer3 = floatBuffer1.duplicate();
        boolean boolean4 = floatBuffer1.hasArray();
        int int5 = floatBuffer1.arrayOffset();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset1 = offsetDateTime0.getOffset();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset3 = offsetDateTime2.getOffset();
        boolean boolean4 = offsetDateTime0.isEqual(offsetDateTime2);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long6 = offsetDateTime0.getLong((java.time.temporal.TemporalField) chronoField5);
        boolean boolean7 = chronoField5.isDateBased();
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime8.withOffsetSameInstant(zoneOffset10);
        java.time.temporal.ValueRange valueRange12 = chronoField5.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime11);
        long long13 = valueRange12.getSmallestMaximum();
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.EPOCH_DAY;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = valueRange12.checkValidValue((long) 0, (java.time.temporal.TemporalField) chronoField15);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for EpochDay (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField5.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(valueRange12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 12L + "'", long13 == 12L);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.EPOCH_DAY + "'", chronoField15.equals(java.time.temporal.ChronoField.EPOCH_DAY));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Month month4 = offsetDateTime0.getMonth();
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime0.plusMinutes((long) (byte) 1);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.plusSeconds((long) 21);
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.withDayOfMonth((int) (byte) 10);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.FEBRUARY + "'", month4.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period1 = java.time.Period.parse((java.lang.CharSequence) "-999999999-01-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) 4096, "PT4H");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset1 = offsetDateTime0.getOffset();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset3 = offsetDateTime2.getOffset();
        boolean boolean4 = offsetDateTime0.isEqual(offsetDateTime2);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long6 = offsetDateTime0.getLong((java.time.temporal.TemporalField) chronoField5);
        boolean boolean7 = chronoField5.isDateBased();
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime8.withOffsetSameInstant(zoneOffset10);
        java.time.temporal.ValueRange valueRange12 = chronoField5.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime11);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = valueRange12.checkValidValue(0L, (java.time.temporal.TemporalField) chronoField14);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for ClockHourOfAmPm (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField5.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(valueRange12);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("READ_WRITE", "HalfDays", "ClockHourOfAmPm");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: read_write");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.DAYS;
        org.junit.Assert.assertNotNull(timeUnit0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        int int2 = properties1.size();
        java.io.PrintWriter printWriter4 = new java.io.PrintWriter("Subject:\n");
        printWriter4.close();
        printWriter4.print((double) 1645434836016L);
        char[] charArray9 = new char[] { '0' };
        printWriter4.print(charArray9);
        properties1.list(printWriter4);
        javax.security.auth.Subject subject12 = new javax.security.auth.Subject();
        boolean boolean14 = subject12.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = properties1.containsKey((java.lang.Object) subject12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) '\uffff', (double) 7187392471159151072L, 0.0d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        java.time.Period period1 = java.time.Period.ofDays(0);
        java.time.Period period3 = period1.plusDays((long) 1);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime4.withMinute((int) (short) 1);
        java.time.LocalTime localTime7 = offsetDateTime6.toLocalTime();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        int int9 = localDate8.lengthOfYear();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        boolean boolean11 = localDate8.isAfter((java.time.chrono.ChronoLocalDate) localDate10);
        java.time.LocalDateTime localDateTime12 = localTime7.atDate(localDate8);
        java.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((long) 4096);
        int int15 = localDateTime12.getDayOfMonth();
        java.time.temporal.Temporal temporal16 = period1.subtractFrom((java.time.temporal.Temporal) localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = localDateTime12.minusYears((long) 122);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000000121");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 365 + "'", int9 == 365);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(temporal16);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        long[] longArray3 = new long[] { 10L, 'a', 1 };
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray3);
        long long5 = longBuffer4.get();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 97, 1]");
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.minusHours((long) ' ');
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime0);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime3.withLaterOffsetAtOverlap();
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime7.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTime10.withOffsetSameInstant(zoneOffset12);
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset15 = offsetDateTime14.getOffset();
        boolean boolean16 = zoneOffset12.equals((java.lang.Object) zoneOffset15);
        java.time.ZonedDateTime zonedDateTime17 = offsetDateTime7.atZoneSimilarLocal((java.time.ZoneId) zoneOffset15);
        java.time.Period period19 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology20 = period19.getChronology();
        java.time.Period period22 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoPeriod chronoPeriod23 = period19.minus((java.time.temporal.TemporalAmount) period22);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime24 = zonedDateTime17.minus((java.time.temporal.TemporalAmount) period22);
        boolean boolean25 = localDateChronoZonedDateTime4.isAfter(localDateChronoZonedDateTime24);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(chronoPeriod23);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.fromMillis((long) (short) 0);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        long long3 = fileTime1.to(timeUnit2);
        long long5 = timeUnit2.toMinutes(792000L);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        // The following exception was thrown during execution in test generation
        try {
            timeUnit2.timedWait((java.lang.Object) optionalDouble6, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(timeUnit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 792000L + "'", long5 == 792000L);
        org.junit.Assert.assertNotNull(optionalDouble6);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.SATURDAY;
        java.time.format.TextStyle textStyle1 = java.time.format.TextStyle.FULL;
        java.util.Locale locale5 = new java.util.Locale("-999999999-01-01", "", "Higham-Hall 5(4)");
        java.lang.String str6 = dayOfWeek0.getDisplayName(textStyle1, locale5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules8 = zoneOffset7.getRules();
        java.time.Clock clock9 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset7);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.now(clock9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal11 = dayOfWeek0.adjustInto((java.time.temporal.Temporal) offsetTime10);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: DayOfWeek");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.FULL + "'", textStyle1.equals(java.time.format.TextStyle.FULL));
        org.junit.Assert.assertEquals(locale5.toString(), "-999999999-01-01__Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Saturday" + "'", str6, "Saturday");
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(zoneRules8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(offsetTime10);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isLoopbackAddress();
        java.util.function.Predicate<java.nio.channels.AsynchronousCloseException> asynchronousCloseExceptionPredicate2 = java.util.function.Predicate.isEqual((java.lang.Object) inetAddress0);
        java.lang.String str3 = inetAddress0.toString();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(asynchronousCloseExceptionPredicate2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "599b081c1808/172.17.0.2" + "'", str3, "599b081c1808/172.17.0.2");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle0);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList2 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean3 = formatStyleEnumList2.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle0);
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream4 = formatStyleEnumList2.parallelStream();
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream6 = formatStyleEnumStream4.limit((long) (short) 0);
        java.util.function.BinaryOperator<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumBinaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumOptional8 = formatStyleEnumStream6.reduce(formatStyleEnumBinaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle0.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(formatStyleEnumStream4);
        org.junit.Assert.assertNotNull(formatStyleEnumStream6);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        boolean boolean1 = locale0.hasExtensions();
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.ofLocale(locale0);
        java.lang.String str3 = chronology2.getCalendarType();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iso8601" + "'", str3, "iso8601");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        double[] doubleArray6 = new double[] { 100.0f, 10L, 1, 365, (-1.0d), 100L };
        java.nio.DoubleBuffer doubleBuffer9 = java.nio.DoubleBuffer.wrap(doubleArray6, (int) (byte) 0, (int) (byte) 0);
        boolean boolean10 = doubleBuffer9.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer13 = doubleBuffer9.put(16384000, (double) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0, 365.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        long[] longArray0 = new long[] {};
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(longArray0);
        java.util.stream.LongStream longStream2 = longStream1.sequential();
        java.util.stream.LongStream longStream4 = longStream2.limit((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalLong optionalLong5 = longStream2.max();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.time.Period period1 = java.time.Period.ofMonths((-1));
        java.time.chrono.Chronology chronology2 = period1.getChronology();
        java.time.Period period4 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoPeriod chronoPeriod5 = period1.minus((java.time.temporal.TemporalAmount) period4);
        boolean boolean6 = period1.isZero();
        int int7 = period1.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(chronoPeriod5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.util.Comparator<java.time.OffsetDateTime> offsetDateTimeComparator0 = java.time.OffsetDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(offsetDateTimeComparator0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Instant instant4 = offsetDateTime3.toInstant();
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset7 = offsetDateTime6.getOffset();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime5.withOffsetSameInstant(zoneOffset7);
        java.time.Instant instant9 = offsetDateTime8.toInstant();
        boolean boolean10 = instant4.isAfter(instant9);
        long long11 = instant9.toEpochMilli();
        java.time.Instant instant13 = instant9.plusNanos((-31557014135564281L));
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime16 = offsetDateTime14.withMinute((int) (short) 1);
        java.time.LocalTime localTime17 = offsetDateTime16.toLocalTime();
        java.time.LocalDate localDate18 = java.time.LocalDate.MIN;
        int int19 = localDate18.lengthOfYear();
        java.time.LocalDate localDate20 = java.time.LocalDate.MIN;
        boolean boolean21 = localDate18.isAfter((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.LocalDateTime localDateTime22 = localTime17.atDate(localDate18);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime25 = offsetDateTime23.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime28 = offsetDateTime26.withMinute((int) (short) 1);
        java.time.LocalTime localTime29 = offsetDateTime28.toLocalTime();
        java.time.LocalDate localDate30 = java.time.LocalDate.MIN;
        int int31 = localDate30.lengthOfYear();
        java.time.LocalDate localDate32 = java.time.LocalDate.MIN;
        boolean boolean33 = localDate30.isAfter((java.time.chrono.ChronoLocalDate) localDate32);
        java.time.LocalDateTime localDateTime34 = localTime29.atDate(localDate30);
        java.time.OffsetDateTime offsetDateTime35 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset36 = offsetDateTime35.getOffset();
        java.time.OffsetDateTime offsetDateTime37 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset38 = offsetDateTime37.getOffset();
        boolean boolean39 = offsetDateTime35.isEqual(offsetDateTime37);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long41 = offsetDateTime35.getLong((java.time.temporal.TemporalField) chronoField40);
        boolean boolean42 = chronoField40.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit43 = chronoField40.getRangeUnit();
        java.time.LocalTime localTime44 = localTime29.truncatedTo(temporalUnit43);
        long long45 = localDateTime22.until((java.time.temporal.Temporal) offsetDateTime23, temporalUnit43);
        java.time.OffsetDateTime offsetDateTime46 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime48 = offsetDateTime46.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime49 = offsetDateTime23.with((java.time.temporal.TemporalAdjuster) offsetDateTime48);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant50 = instant9.with((java.time.temporal.TemporalAdjuster) offsetDateTime49);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1645434848785L + "'", long11 == 1645434848785L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 365 + "'", int19 == 365);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 365 + "'", int31 == 365);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertNotNull(offsetDateTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField40.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 9L + "'", long41 == 9L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit43 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit43.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 730486476412L + "'", long45 == 730486476412L);
        org.junit.Assert.assertNotNull(offsetDateTime46);
        org.junit.Assert.assertNotNull(offsetDateTime48);
        org.junit.Assert.assertNotNull(offsetDateTime49);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap1 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Enumeration<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumEnumeration2 = formatStyleEnumMap1.keys();
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap4 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet5 = formatStyleEnumMap4.keySet();
        java.lang.String str6 = formatStyleEnumMap4.toString();
        formatStyleEnumMap1.putAll((java.util.Map<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>) formatStyleEnumMap4);
        org.junit.Assert.assertNotNull(formatStyleEnumEnumeration2);
        org.junit.Assert.assertNotNull(formatStyleEnumSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime1 = java.time.chrono.ChronoLocalDateTime.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.io.PrintStream printStream1 = new java.io.PrintStream("HalfDays");
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset4 = offsetDateTime3.getOffset();
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset6 = offsetDateTime5.getOffset();
        boolean boolean7 = offsetDateTime3.isEqual(offsetDateTime5);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long9 = offsetDateTime3.getLong((java.time.temporal.TemporalField) chronoField8);
        boolean boolean10 = chronoField8.isDateBased();
        java.time.temporal.ValueRange valueRange11 = offsetDateTime2.range((java.time.temporal.TemporalField) chronoField8);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime12.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime16 = offsetDateTime14.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime18 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset19 = offsetDateTime18.getOffset();
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime17.withOffsetSameInstant(zoneOffset19);
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset22 = offsetDateTime21.getOffset();
        boolean boolean23 = zoneOffset19.equals((java.lang.Object) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = offsetDateTime14.atZoneSimilarLocal((java.time.ZoneId) zoneOffset22);
        long long25 = chronoField8.getFrom((java.time.temporal.TemporalAccessor) offsetDateTime14);
        java.time.LocalDate localDate26 = java.time.LocalDate.MIN;
        java.time.chrono.Era era27 = localDate26.getEra();
        java.time.format.TextStyle textStyle28 = java.time.format.TextStyle.FULL;
        java.io.PrintWriter printWriter30 = new java.io.PrintWriter("Subject:\n");
        printWriter30.close();
        printWriter30.println((float) 0);
        java.util.Locale locale35 = new java.util.Locale("");
        java.lang.String str36 = locale35.getDisplayName();
        java.util.Locale.setDefault(locale35);
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator39 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.text.Format.Field field40 = null;
        java.text.FieldPosition fieldPosition41 = new java.text.FieldPosition(field40);
        fieldPosition41.setBeginIndex((int) ' ');
        java.nio.ByteOrder byteOrder44 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.lang.Object[] objArray45 = new java.lang.Object[] { wildcardChronoZonedDateTimeComparator39, ' ', byteOrder44 };
        java.io.PrintWriter printWriter46 = printWriter30.printf(locale35, "", objArray45);
        java.lang.String str47 = era27.getDisplayName(textStyle28, locale35);
        java.lang.String str48 = chronoField8.getDisplayName(locale35);
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter("Subject:\n");
        printWriter51.close();
        printWriter51.println((float) 0);
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale56.getDisplayName();
        java.util.Locale.setDefault(locale56);
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator60 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.text.Format.Field field61 = null;
        java.text.FieldPosition fieldPosition62 = new java.text.FieldPosition(field61);
        fieldPosition62.setBeginIndex((int) ' ');
        java.nio.ByteOrder byteOrder65 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.lang.Object[] objArray66 = new java.lang.Object[] { wildcardChronoZonedDateTimeComparator60, ' ', byteOrder65 };
        java.io.PrintWriter printWriter67 = printWriter51.printf(locale56, "", objArray66);
        java.util.Locale locale68 = java.util.Locale.ENGLISH;
        java.text.Format.Field field76 = null;
        java.text.FieldPosition fieldPosition77 = new java.text.FieldPosition(field76);
        java.nio.file.attribute.FileTime fileTime79 = java.nio.file.attribute.FileTime.fromMillis((long) (short) 0);
        java.lang.Object[] objArray80 = new java.lang.Object[] { '#', (byte) 10, (byte) 1, 1.0d, fieldPosition77, fileTime79 };
        java.net.UnknownHostException unknownHostException82 = new java.net.UnknownHostException("hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException83 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "Higham-Hall 5(4)", objArray80, (java.lang.Throwable) unknownHostException82);
        java.io.PrintWriter printWriter84 = printWriter67.printf(locale68, "P-1M", objArray80);
        java.io.PrintStream printStream85 = printStream1.format(locale35, "Higham-Hall 5(4)", objArray80);
        printStream85.println((float) (-31557014135564333L));
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField8.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(valueRange11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9L + "'", long25 == 9L);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + era27 + "' != '" + java.time.chrono.IsoEra.BCE + "'", era27.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertTrue("'" + textStyle28 + "' != '" + java.time.format.TextStyle.FULL + "'", textStyle28.equals(java.time.format.TextStyle.FULL));
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator39);
        org.junit.Assert.assertNotNull(byteOrder44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(printWriter46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "BC" + "'", str47, "BC");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ClockHourOfAmPm" + "'", str48, "ClockHourOfAmPm");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator60);
        org.junit.Assert.assertNotNull(byteOrder65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(printWriter67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en");
        org.junit.Assert.assertNotNull(fileTime79);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertNotNull(printWriter84);
        org.junit.Assert.assertNotNull(printStream85);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        int int3 = localDate2.lengthOfYear();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        boolean boolean5 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.Period period6 = localDate1.until((java.time.chrono.ChronoLocalDate) localDate2);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime7.withMinute((int) (short) 1);
        java.time.LocalTime localTime10 = offsetDateTime9.toLocalTime();
        java.time.LocalDate localDate11 = java.time.LocalDate.MIN;
        int int12 = localDate11.lengthOfYear();
        java.time.LocalDate localDate13 = java.time.LocalDate.MIN;
        boolean boolean14 = localDate11.isAfter((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.LocalDateTime localDateTime15 = localTime10.atDate(localDate11);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset17 = offsetDateTime16.getOffset();
        java.time.OffsetDateTime offsetDateTime18 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset19 = offsetDateTime18.getOffset();
        boolean boolean20 = offsetDateTime16.isEqual(offsetDateTime18);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long22 = offsetDateTime16.getLong((java.time.temporal.TemporalField) chronoField21);
        boolean boolean23 = chronoField21.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit24 = chronoField21.getRangeUnit();
        java.time.LocalTime localTime25 = localTime10.truncatedTo(temporalUnit24);
        java.time.LocalDateTime localDateTime26 = localDate2.atTime(localTime25);
        java.time.LocalDate localDate27 = java.time.LocalDate.MIN;
        int int28 = localDate27.lengthOfYear();
        java.time.LocalDate localDate29 = java.time.LocalDate.MIN;
        boolean boolean30 = localDate27.isAfter((java.time.chrono.ChronoLocalDate) localDate29);
        java.time.Period period32 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate33 = localDate27.minus((java.time.temporal.TemporalAmount) period32);
        java.time.OffsetDateTime offsetDateTime34 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime35 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset36 = offsetDateTime35.getOffset();
        java.time.OffsetDateTime offsetDateTime37 = offsetDateTime34.withOffsetSameInstant(zoneOffset36);
        boolean boolean38 = chronoLocalDate33.equals((java.lang.Object) offsetDateTime37);
        java.time.OffsetDateTime offsetDateTime39 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset40 = offsetDateTime39.getOffset();
        java.time.OffsetDateTime offsetDateTime41 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset42 = offsetDateTime41.getOffset();
        boolean boolean43 = offsetDateTime39.isEqual(offsetDateTime41);
        java.time.temporal.ChronoField chronoField44 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long45 = offsetDateTime39.getLong((java.time.temporal.TemporalField) chronoField44);
        boolean boolean46 = chronoField44.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit47 = chronoField44.getRangeUnit();
        boolean boolean48 = temporalUnit47.isDurationEstimated();
        boolean boolean49 = chronoLocalDate33.isSupported(temporalUnit47);
        java.time.LocalTime localTime50 = localTime25.truncatedTo(temporalUnit47);
        java.time.Duration duration51 = java.time.Duration.of((long) 365, temporalUnit47);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 365 + "'", int12 == 365);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField21.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9L + "'", long22 == 9L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit24 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit24.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 365 + "'", int28 == 365);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(chronoLocalDate33);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertNotNull(offsetDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(offsetDateTime39);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertNotNull(offsetDateTime41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + chronoField44 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField44.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 9L + "'", long45 == 9L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit47 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit47.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(duration51);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.close();
        printWriter1.println((float) 0);
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.setDefault(locale6);
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator10 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.text.Format.Field field11 = null;
        java.text.FieldPosition fieldPosition12 = new java.text.FieldPosition(field11);
        fieldPosition12.setBeginIndex((int) ' ');
        java.nio.ByteOrder byteOrder15 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.lang.Object[] objArray16 = new java.lang.Object[] { wildcardChronoZonedDateTimeComparator10, ' ', byteOrder15 };
        java.io.PrintWriter printWriter17 = printWriter1.printf(locale6, "", objArray16);
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.text.Format.Field field26 = null;
        java.text.FieldPosition fieldPosition27 = new java.text.FieldPosition(field26);
        java.nio.file.attribute.FileTime fileTime29 = java.nio.file.attribute.FileTime.fromMillis((long) (short) 0);
        java.lang.Object[] objArray30 = new java.lang.Object[] { '#', (byte) 10, (byte) 1, 1.0d, fieldPosition27, fileTime29 };
        java.net.UnknownHostException unknownHostException32 = new java.net.UnknownHostException("hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "Higham-Hall 5(4)", objArray30, (java.lang.Throwable) unknownHostException32);
        java.io.PrintWriter printWriter34 = printWriter17.printf(locale18, "P-1M", objArray30);
        printWriter17.flush();
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator10);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(printWriter17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertNotNull(fileTime29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertNotNull(printWriter34);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.LongStream longStream2 = intStream1.asLongStream();
        java.util.LongSummaryStatistics longSummaryStatistics3 = new java.util.LongSummaryStatistics();
        longStream2.forEachOrdered((java.util.function.LongConsumer) longSummaryStatistics3);
        int[] intArray5 = new int[] {};
        java.util.stream.IntStream intStream6 = java.util.stream.IntStream.of(intArray5);
        java.util.stream.LongStream longStream7 = intStream6.asLongStream();
        java.util.LongSummaryStatistics longSummaryStatistics8 = new java.util.LongSummaryStatistics();
        longStream7.forEachOrdered((java.util.function.LongConsumer) longSummaryStatistics8);
        java.util.stream.LongStream longStream10 = longStream7.sequential();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = java.util.stream.LongStream.concat(longStream2, longStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertEquals(longSummaryStatistics3.toString(), "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertEquals(longSummaryStatistics8.toString(), "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}");
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.time.LocalDate localDate2 = java.time.LocalDate.ofYearDay(9, 21);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.time.Period period1 = java.time.Period.ofDays(0);
        java.time.Period period3 = period1.plusDays((long) 1);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime4.withMinute((int) (short) 1);
        java.time.LocalTime localTime7 = offsetDateTime6.toLocalTime();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        int int9 = localDate8.lengthOfYear();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        boolean boolean11 = localDate8.isAfter((java.time.chrono.ChronoLocalDate) localDate10);
        java.time.LocalDateTime localDateTime12 = localTime7.atDate(localDate8);
        java.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((long) 4096);
        int int15 = localDateTime12.getDayOfMonth();
        java.time.temporal.Temporal temporal16 = period1.subtractFrom((java.time.temporal.Temporal) localDateTime12);
        java.time.chrono.Chronology chronology17 = period1.getChronology();
        java.time.Period period19 = java.time.Period.ofDays(0);
        java.time.Period period21 = period19.plusDays((long) 1);
        java.time.OffsetDateTime offsetDateTime22 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime24 = offsetDateTime22.withMinute((int) (short) 1);
        java.time.LocalTime localTime25 = offsetDateTime24.toLocalTime();
        java.time.LocalDate localDate26 = java.time.LocalDate.MIN;
        int int27 = localDate26.lengthOfYear();
        java.time.LocalDate localDate28 = java.time.LocalDate.MIN;
        boolean boolean29 = localDate26.isAfter((java.time.chrono.ChronoLocalDate) localDate28);
        java.time.LocalDateTime localDateTime30 = localTime25.atDate(localDate26);
        java.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((long) 4096);
        int int33 = localDateTime30.getDayOfMonth();
        java.time.temporal.Temporal temporal34 = period19.subtractFrom((java.time.temporal.Temporal) localDateTime30);
        java.time.chrono.ChronoLocalDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoLocalDateTime35 = chronology17.localDateTime((java.time.temporal.TemporalAccessor) localDateTime30);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 365 + "'", int9 == 365);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(temporal16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 365 + "'", int27 == 365);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(temporal34);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime35);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.time.Duration duration1 = java.time.Duration.ofDays(10L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        long[] longArray0 = new long[] {};
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(longArray0);
        java.util.stream.LongStream longStream2 = longStream1.sequential();
        java.util.stream.LongStream longStream4 = longStream2.limit((long) (short) 0);
        java.util.stream.LongStream.Builder builder5 = java.util.stream.LongStream.builder();
        // The following exception was thrown during execution in test generation
        try {
            longStream2.forEachOrdered((java.util.function.LongConsumer) builder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withOffsetSameInstant(zoneOffset2);
        java.time.Instant instant4 = offsetDateTime3.toInstant();
        java.util.Optional<java.time.OffsetDateTime> offsetDateTimeOptional5 = java.util.Optional.ofNullable(offsetDateTime3);
        java.time.Month month6 = java.time.Month.JANUARY;
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery7 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period8 = month6.query(periodTemporalQuery7);
        java.lang.String str9 = period8.toString();
        boolean boolean10 = offsetDateTimeOptional5.equals((java.lang.Object) period8);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetDateTimeOptional5);
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.JANUARY + "'", month6.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertNotNull(periodTemporalQuery7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0D" + "'", str9, "P0D");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.IntStream intStream2 = intStream1.sequential();
        java.util.Iterator<java.lang.Integer> intItor3 = intStream1.iterator();
        boolean boolean4 = intItor3.hasNext();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.IntStream intStream2 = intStream1.sequential();
        java.util.Iterator<java.lang.Integer> intItor3 = intStream1.iterator();
        boolean boolean4 = intStream1.isParallel();
        java.util.stream.IntStream intStream5 = intStream1.sequential();
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfInt ofInt6 = intStream1.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        org.junit.Assert.assertNotNull(zoneOffset0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        long long10 = localDateTime8.toEpochSecond(zoneOffset9);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset13 = offsetDateTime12.getOffset();
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset15 = offsetDateTime14.getOffset();
        boolean boolean16 = offsetDateTime12.isEqual(offsetDateTime14);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long18 = offsetDateTime12.getLong((java.time.temporal.TemporalField) chronoField17);
        boolean boolean19 = chronoField17.isDateBased();
        java.time.temporal.ValueRange valueRange20 = offsetDateTime11.range((java.time.temporal.TemporalField) chronoField17);
        java.time.temporal.TemporalUnit temporalUnit21 = chronoField17.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = zoneOffset9.getLong((java.time.temporal.TemporalField) chronoField17);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-31557014135564331L) + "'", long10 == (-31557014135564331L));
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField17.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9L + "'", long18 == 9L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(valueRange20);
        org.junit.Assert.assertTrue("'" + temporalUnit21 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit21.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        long[] longArray3 = new long[] { 0, (short) 10, 10 };
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of(longArray3);
        java.util.OptionalLong optionalLong5 = longStream4.findFirst();
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = new java.util.Properties(properties6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime8.withMinute((int) (short) 1);
        java.time.LocalTime localTime11 = offsetDateTime10.toLocalTime();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        int int13 = localDate12.lengthOfYear();
        java.time.LocalDate localDate14 = java.time.LocalDate.MIN;
        boolean boolean15 = localDate12.isAfter((java.time.chrono.ChronoLocalDate) localDate14);
        java.time.LocalDateTime localDateTime16 = localTime11.atDate(localDate12);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset18 = offsetDateTime17.getOffset();
        java.time.ZonedDateTime zonedDateTime19 = localDateTime16.atZone((java.time.ZoneId) zoneOffset18);
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules21 = zoneOffset20.getRules();
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset20);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime25 = java.time.ZonedDateTime.ofStrict(localDateTime16, zoneOffset20, (java.time.ZoneId) zoneOffset24);
        javax.security.auth.Subject subject26 = new javax.security.auth.Subject();
        java.lang.Object obj27 = properties7.putIfAbsent((java.lang.Object) zoneOffset24, (java.lang.Object) subject26);
        boolean boolean28 = optionalLong5.equals((java.lang.Object) subject26);
        java.time.format.DecimalStyle decimalStyle29 = java.time.format.DecimalStyle.ofDefaultLocale();
        char char30 = decimalStyle29.getZeroDigit();
        java.time.format.DecimalStyle decimalStyle32 = decimalStyle29.withNegativeSign('a');
        boolean boolean33 = optionalLong5.equals((java.lang.Object) decimalStyle29);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 10, 10]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 365 + "'", int13 == 365);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(zoneRules21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(decimalStyle29);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '0' + "'", char30 == '0');
        org.junit.Assert.assertNotNull(decimalStyle32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.time.LocalDate localDate0 = java.time.LocalDate.MAX;
        boolean boolean1 = localDate0.isLeapYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset13 = zoneRules1.getOffset(localDateTime12);
        boolean boolean14 = zoneRules1.isFixedOffset();
        java.time.LocalDate localDate15 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate16 = java.time.LocalDate.MIN;
        int int17 = localDate16.lengthOfYear();
        java.time.LocalDate localDate18 = java.time.LocalDate.MIN;
        boolean boolean19 = localDate16.isAfter((java.time.chrono.ChronoLocalDate) localDate18);
        java.time.Period period20 = localDate15.until((java.time.chrono.ChronoLocalDate) localDate16);
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime23 = offsetDateTime21.withMinute((int) (short) 1);
        java.time.LocalTime localTime24 = offsetDateTime23.toLocalTime();
        java.time.LocalDate localDate25 = java.time.LocalDate.MIN;
        int int26 = localDate25.lengthOfYear();
        java.time.LocalDate localDate27 = java.time.LocalDate.MIN;
        boolean boolean28 = localDate25.isAfter((java.time.chrono.ChronoLocalDate) localDate27);
        java.time.LocalDateTime localDateTime29 = localTime24.atDate(localDate25);
        java.time.OffsetDateTime offsetDateTime30 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset31 = offsetDateTime30.getOffset();
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset33 = offsetDateTime32.getOffset();
        boolean boolean34 = offsetDateTime30.isEqual(offsetDateTime32);
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long36 = offsetDateTime30.getLong((java.time.temporal.TemporalField) chronoField35);
        boolean boolean37 = chronoField35.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit38 = chronoField35.getRangeUnit();
        java.time.LocalTime localTime39 = localTime24.truncatedTo(temporalUnit38);
        java.time.LocalDateTime localDateTime40 = localDate16.atTime(localTime39);
        java.util.List<java.time.ZoneOffset> zoneOffsetList41 = zoneRules1.getValidOffsets(localDateTime40);
        java.util.List<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList42 = zoneRules1.getTransitions();
        java.util.List<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList43 = zoneRules1.getTransitions();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 365 + "'", int17 == 365);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 365 + "'", int26 == 365);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(offsetDateTime30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField35.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9L + "'", long36 == 9L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit38 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit38.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(zoneOffsetList41);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionList42);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionList43);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        int int2 = localDate1.lengthOfYear();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        java.time.Period period5 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.withMinute((int) (short) 1);
        java.time.LocalTime localTime9 = offsetDateTime8.toLocalTime();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        int int11 = localDate10.lengthOfYear();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        boolean boolean13 = localDate10.isAfter((java.time.chrono.ChronoLocalDate) localDate12);
        java.time.LocalDateTime localDateTime14 = localTime9.atDate(localDate10);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset18 = offsetDateTime17.getOffset();
        boolean boolean19 = offsetDateTime15.isEqual(offsetDateTime17);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long21 = offsetDateTime15.getLong((java.time.temporal.TemporalField) chronoField20);
        boolean boolean22 = chronoField20.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit23 = chronoField20.getRangeUnit();
        java.time.LocalTime localTime24 = localTime9.truncatedTo(temporalUnit23);
        java.time.LocalDateTime localDateTime25 = localDate1.atTime(localTime24);
        long long26 = localTime24.toNanoOfDay();
        java.time.LocalTime localTime28 = localTime24.withNano((int) (byte) 10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField20.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9L + "'", long21 == 9L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit23 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit23.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(localTime28);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.ZonedDateTime zonedDateTime11 = localDateTime8.atZone((java.time.ZoneId) zoneOffset10);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime11.withEarlierOffsetAtOverlap();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime13 = zonedDateTime11.withEarlierOffsetAtOverlap();
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules15 = zoneOffset14.getRules();
        java.time.Clock clock16 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset14);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.now(clock16);
        java.time.Period period19 = java.time.Period.ofMonths((-1));
        java.time.Period period21 = period19.minusDays((long) '#');
        boolean boolean22 = offsetTime17.equals((java.lang.Object) period19);
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules24 = zoneOffset23.getRules();
        java.time.Clock clock25 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset23);
        java.time.OffsetTime offsetTime26 = java.time.OffsetTime.now(clock25);
        boolean boolean27 = offsetTime17.isAfter(offsetTime26);
        java.time.OffsetTime offsetTime29 = offsetTime17.plusMinutes(0L);
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.OffsetTime offsetTime32 = offsetTime17.with((java.time.temporal.TemporalField) chronoField30, (long) 16384);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime34 = zonedDateTime11.with((java.time.temporal.TemporalField) chronoField30, 0L);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneRules15);
        org.junit.Assert.assertNotNull(clock16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(zoneRules24);
        org.junit.Assert.assertNotNull(clock25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(offsetTime29);
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField30.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime34);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.net.URI uRI3 = new java.net.URI("PT4H", "P0D", "READ_WRITE");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.time.Clock clock0 = java.time.Clock.systemDefaultZone();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset14 = offsetDateTime13.getOffset();
        boolean boolean15 = offsetDateTime11.isEqual(offsetDateTime13);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long17 = offsetDateTime11.getLong((java.time.temporal.TemporalField) chronoField16);
        boolean boolean18 = chronoField16.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit19 = chronoField16.getRangeUnit();
        java.time.LocalTime localTime20 = localTime5.truncatedTo(temporalUnit19);
        java.time.Duration duration21 = java.time.Duration.of(0L, temporalUnit19);
        java.time.temporal.Temporal temporal22 = null;
        java.time.temporal.Temporal temporal23 = duration21.addTo(temporal22);
        java.time.Clock clock24 = java.time.Clock.tick(clock0, duration21);
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.now(clock0);
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField16.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9L + "'", long17 == 9L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit19 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit19.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNull(temporal23);
        org.junit.Assert.assertNotNull(clock24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Collection<java.lang.String> strCollection3 = null;
        java.lang.String str4 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection3);
        java.time.format.FormatStyle formatStyle5 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter6 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle5);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList7 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean8 = formatStyleEnumList7.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle5);
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream9 = formatStyleEnumList7.parallelStream();
        java.time.format.FormatStyle formatStyle10 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter11 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle10);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList12 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean13 = formatStyleEnumList12.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle10);
        java.time.format.FormatStyle formatStyle14 = java.time.format.FormatStyle.FULL;
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList15 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean16 = formatStyleEnumList15.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle14);
        boolean boolean17 = formatStyleEnumList12.retainAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumList15);
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap19 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet20 = formatStyleEnumMap19.keySet();
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap22 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet23 = formatStyleEnumMap22.keySet();
        boolean boolean24 = formatStyleEnumSet20.retainAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet23);
        boolean boolean25 = formatStyleEnumList15.containsAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet23);
        boolean boolean26 = formatStyleEnumList7.removeAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet23);
        boolean boolean27 = languageRangeList1.removeAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet23);
        java.util.Iterator<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumItor28 = formatStyleEnumSet23.iterator();
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap30 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet31 = formatStyleEnumMap30.keySet();
        java.util.Iterator<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumItor32 = formatStyleEnumSet31.iterator();
        java.time.format.FormatStyle formatStyle33 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter34 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle33);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList35 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean36 = formatStyleEnumList35.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle33);
        java.time.format.FormatStyle formatStyle37 = java.time.format.FormatStyle.FULL;
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList38 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean39 = formatStyleEnumList38.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle37);
        boolean boolean40 = formatStyleEnumList35.retainAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumList38);
        boolean boolean41 = formatStyleEnumSet31.containsAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumList35);
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap43 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>((int) (short) 10);
        java.util.Set<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumSet44 = formatStyleEnumMap43.keySet();
        java.time.format.FormatStyle formatStyle45 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter46 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle45);
        java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumList47 = new java.util.ArrayList<java.lang.Enum<java.time.format.FormatStyle>>();
        boolean boolean48 = formatStyleEnumList47.add((java.lang.Enum<java.time.format.FormatStyle>) formatStyle45);
        java.util.stream.Stream<java.lang.Enum<java.time.format.FormatStyle>> formatStyleEnumStream49 = formatStyleEnumList47.parallelStream();
        boolean boolean50 = formatStyleEnumSet44.removeAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumList47);
        boolean boolean51 = formatStyleEnumSet31.retainAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumList47);
        boolean boolean52 = formatStyleEnumSet23.addAll((java.util.Collection<java.lang.Enum<java.time.format.FormatStyle>>) formatStyleEnumSet31);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + formatStyle5 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle5.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(formatStyleEnumStream9);
        org.junit.Assert.assertTrue("'" + formatStyle10 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle10.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + formatStyle14 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle14.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(formatStyleEnumSet20);
        org.junit.Assert.assertNotNull(formatStyleEnumSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(formatStyleEnumItor28);
        org.junit.Assert.assertNotNull(formatStyleEnumSet31);
        org.junit.Assert.assertNotNull(formatStyleEnumItor32);
        org.junit.Assert.assertTrue("'" + formatStyle33 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle33.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + formatStyle37 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle37.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(formatStyleEnumSet44);
        org.junit.Assert.assertTrue("'" + formatStyle45 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle45.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(formatStyleEnumStream49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_TIME;
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.minusHours((long) ' ');
        java.time.ZonedDateTime zonedDateTime5 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime2);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime6 = zonedDateTime5.withLaterOffsetAtOverlap();
        java.time.Month month7 = java.time.Month.JANUARY;
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery8 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period9 = month7.query(periodTemporalQuery8);
        java.time.Period period10 = zonedDateTime5.query(periodTemporalQuery8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period11 = dateTimeFormatter0.parse((java.lang.CharSequence) "iso8601", periodTemporalQuery8);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'iso8601' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime6);
        org.junit.Assert.assertTrue("'" + month7 + "' != '" + java.time.Month.JANUARY + "'", month7.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertNotNull(periodTemporalQuery8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.IntStream intStream3 = intStream1.limit((long) ' ');
        java.util.stream.IntStream intStream4 = intStream3.sequential();
        intStream4.close();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        double[] doubleArray6 = new double[] { 100.0f, 10L, 1, 365, (-1.0d), 100L };
        java.nio.DoubleBuffer doubleBuffer9 = java.nio.DoubleBuffer.wrap(doubleArray6, (int) (byte) 0, (int) (byte) 0);
        double[] doubleArray16 = new double[] { 100.0f, 10L, 1, 365, (-1.0d), 100L };
        java.nio.DoubleBuffer doubleBuffer19 = java.nio.DoubleBuffer.wrap(doubleArray16, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer20 = doubleBuffer9.get(doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0, 365.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleBuffer9);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0, 1.0, 365.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleBuffer19);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.time.Month month0 = java.time.Month.SEPTEMBER;
        java.time.Month month1 = java.time.Month.JANUARY;
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery2 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period3 = month1.query(periodTemporalQuery2);
        java.time.Period period4 = month0.query(periodTemporalQuery2);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.SEPTEMBER + "'", month0.equals(java.time.Month.SEPTEMBER));
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.JANUARY + "'", month1.equals(java.time.Month.JANUARY));
        org.junit.Assert.assertNotNull(periodTemporalQuery2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate1 = java.time.LocalDate.MIN;
        int int2 = localDate1.lengthOfYear();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        boolean boolean4 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        java.time.Period period5 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate1);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.withMinute((int) (short) 1);
        java.time.LocalTime localTime9 = offsetDateTime8.toLocalTime();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        int int11 = localDate10.lengthOfYear();
        java.time.LocalDate localDate12 = java.time.LocalDate.MIN;
        boolean boolean13 = localDate10.isAfter((java.time.chrono.ChronoLocalDate) localDate12);
        java.time.LocalDateTime localDateTime14 = localTime9.atDate(localDate10);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset18 = offsetDateTime17.getOffset();
        boolean boolean19 = offsetDateTime15.isEqual(offsetDateTime17);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long21 = offsetDateTime15.getLong((java.time.temporal.TemporalField) chronoField20);
        boolean boolean22 = chronoField20.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit23 = chronoField20.getRangeUnit();
        java.time.LocalTime localTime24 = localTime9.truncatedTo(temporalUnit23);
        java.time.LocalDateTime localDateTime25 = localDate1.atTime(localTime24);
        java.time.LocalTime localTime27 = localTime24.withNano((int) (byte) 100);
        java.time.format.DateTimeFormatter dateTimeFormatter28 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        java.util.Set<java.time.temporal.TemporalField> temporalFieldSet29 = dateTimeFormatter28.getResolverFields();
        java.time.LocalDate localDate30 = java.time.LocalDate.MIN;
        java.time.LocalDate localDate31 = java.time.LocalDate.MIN;
        int int32 = localDate31.lengthOfYear();
        java.time.LocalDate localDate33 = java.time.LocalDate.MIN;
        boolean boolean34 = localDate31.isAfter((java.time.chrono.ChronoLocalDate) localDate33);
        java.time.Period period36 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate37 = localDate31.minus((java.time.temporal.TemporalAmount) period36);
        java.time.chrono.ChronoPeriod chronoPeriod38 = localDate30.until(chronoLocalDate37);
        java.time.chrono.Chronology chronology39 = chronoLocalDate37.getChronology();
        java.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter28.withChronology(chronology39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = localTime24.format(dateTimeFormatter40);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField20.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9L + "'", long21 == 9L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit23 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit23.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(temporalFieldSet29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 365 + "'", int32 == 365);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(chronoLocalDate37);
        org.junit.Assert.assertNotNull(chronoPeriod38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "Higham-Hall 5(4)");
        java.io.File file4 = new java.io.File(file2, "09:13:58.976Z");
        boolean boolean5 = file2.canExecute();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals(file4.getParent(), "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals(file4.toString(), "Higham-Hall 5(4)/09:13:58.976Z");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.lang.String str2 = localDate0.toString();
        java.time.LocalDate localDate3 = java.time.LocalDate.MIN;
        int int4 = localDate3.lengthOfYear();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        boolean boolean6 = localDate3.isAfter((java.time.chrono.ChronoLocalDate) localDate5);
        java.time.Period period8 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate9 = localDate3.minus((java.time.temporal.TemporalAmount) period8);
        long long10 = localDate3.toEpochDay();
        java.time.LocalDate localDate11 = localDate0.with((java.time.temporal.TemporalAdjuster) localDate3);
        java.time.DayOfWeek dayOfWeek12 = localDate3.getDayOfWeek();
        int int13 = localDate3.getYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-999999999-01-01" + "'", str2, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(chronoLocalDate9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-365243219162L) + "'", long10 == (-365243219162L));
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + dayOfWeek12 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek12.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-999999999) + "'", int13 == (-999999999));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.fromMillis((long) (short) 0);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        long long3 = fileTime1.to(timeUnit2);
        timeUnit2.sleep((long) (byte) 1);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(timeUnit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.util.DoubleSummaryStatistics doubleSummaryStatistics0 = new java.util.DoubleSummaryStatistics();
        doubleSummaryStatistics0.accept((double) '#');
        double double3 = doubleSummaryStatistics0.getSum();
        double double4 = doubleSummaryStatistics0.getAverage();
        org.junit.Assert.assertEquals(doubleSummaryStatistics0.toString(), "DoubleSummaryStatistics{count=1, sum=35.000000, min=35.000000, average=35.000000, max=35.000000}");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.time.Month month0 = java.time.Month.FEBRUARY;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules2 = zoneOffset1.getRules();
        java.time.Clock clock3 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset1);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.now(clock3);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset6 = offsetDateTime5.getOffset();
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset8 = offsetDateTime7.getOffset();
        boolean boolean9 = offsetDateTime5.isEqual(offsetDateTime7);
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long11 = offsetDateTime5.getLong((java.time.temporal.TemporalField) chronoField10);
        boolean boolean12 = chronoField10.isDateBased();
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset15 = offsetDateTime14.getOffset();
        java.time.OffsetDateTime offsetDateTime16 = offsetDateTime13.withOffsetSameInstant(zoneOffset15);
        java.time.temporal.ValueRange valueRange17 = chronoField10.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime16);
        boolean boolean18 = chronoField10.isDateBased();
        long long19 = offsetTime4.getLong((java.time.temporal.TemporalField) chronoField10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange20 = month0.range((java.time.temporal.TemporalField) chronoField10);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.FEBRUARY + "'", month0.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(zoneRules2);
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField10.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9L + "'", long11 == 9L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(valueRange17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList4.spliterator();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        boolean boolean7 = languageRangeList4.equals((java.lang.Object) locale6);
        java.util.Locale.LanguageRange languageRange9 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList4.add(13, languageRange9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.util.concurrent.TimeoutException timeoutException0 = new java.util.concurrent.TimeoutException();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.of("Subject:\n");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, non numeric characters found: Subject:?");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MINUTE_OF_DAY;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.MINUTE_OF_DAY));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset13 = zoneRules1.getOffset(localDateTime12);
        java.util.List<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList14 = zoneRules1.getTransitions();
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset17 = offsetDateTime16.getOffset();
        java.time.OffsetDateTime offsetDateTime18 = offsetDateTime15.withOffsetSameInstant(zoneOffset17);
        java.time.Instant instant19 = offsetDateTime18.toInstant();
        int int20 = instant19.getNano();
        java.time.Instant instant22 = instant19.plusSeconds((long) (byte) -1);
        java.time.ZoneOffset zoneOffset23 = zoneRules1.getOffset(instant19);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant25 = instant19.minusSeconds((-31557014135564333L));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Instant exceeds minimum or maximum instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionList14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(instant19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 134000000 + "'", int20 == 134000000);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(zoneOffset23);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(16384000);
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        java.time.ZonedDateTime zonedDateTime13 = localDateTime10.atZone((java.time.ZoneId) zoneOffset12);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules15 = zoneOffset14.getRules();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset14);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.ofStrict(localDateTime10, zoneOffset14, (java.time.ZoneId) zoneOffset18);
        javax.security.auth.Subject subject20 = new javax.security.auth.Subject();
        java.lang.Object obj21 = properties1.putIfAbsent((java.lang.Object) zoneOffset18, (java.lang.Object) subject20);
        java.lang.Object obj22 = properties1.clone();
        java.util.stream.DoubleStream doubleStream23 = java.util.stream.DoubleStream.empty();
        boolean boolean24 = properties1.equals((java.lang.Object) doubleStream23);
        java.util.Enumeration<java.lang.Object> objEnumeration25 = properties1.keys();
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(zoneRules15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{Z=Subject:\n}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{Z=Subject:\n}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{Z=Subject:\n}");
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objEnumeration25);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.net.URL uRL0 = null;
        java.security.cert.Certificate[] certificateArray1 = new java.security.cert.Certificate[] {};
        java.security.CodeSource codeSource2 = new java.security.CodeSource(uRL0, certificateArray1);
        java.net.URL uRL3 = codeSource2.getLocation();
        boolean boolean5 = codeSource2.equals((java.lang.Object) 9);
        java.net.URL uRL6 = codeSource2.getLocation();
        org.junit.Assert.assertNotNull(certificateArray1);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isLoopbackAddress();
        java.util.function.Predicate<java.nio.channels.AsynchronousCloseException> asynchronousCloseExceptionPredicate2 = java.util.function.Predicate.isEqual((java.lang.Object) inetAddress0);
        java.lang.String str3 = inetAddress0.getCanonicalHostName();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(asynchronousCloseExceptionPredicate2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "599b081c1808" + "'", str3, "599b081c1808");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object> formatStyleEnumMap2 = new java.util.Hashtable<java.lang.Enum<java.time.format.FormatStyle>, java.lang.Object>(1, (float) 12L);
        java.time.format.FormatStyle formatStyle3 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle3);
        java.time.format.DecimalStyle decimalStyle5 = java.time.format.DecimalStyle.ofDefaultLocale();
        char char6 = decimalStyle5.getZeroDigit();
        java.time.format.DecimalStyle decimalStyle8 = decimalStyle5.withNegativeSign('a');
        java.lang.Object obj9 = formatStyleEnumMap2.replace((java.lang.Enum<java.time.format.FormatStyle>) formatStyle3, (java.lang.Object) decimalStyle8);
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        int int11 = localDate10.lengthOfYear();
        java.lang.String str12 = localDate10.toString();
        java.time.LocalDate localDate13 = java.time.LocalDate.MIN;
        int int14 = localDate13.lengthOfYear();
        java.time.LocalDate localDate15 = java.time.LocalDate.MIN;
        boolean boolean16 = localDate13.isAfter((java.time.chrono.ChronoLocalDate) localDate15);
        java.time.Period period18 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate19 = localDate13.minus((java.time.temporal.TemporalAmount) period18);
        long long20 = localDate13.toEpochDay();
        java.time.LocalDate localDate21 = localDate10.with((java.time.temporal.TemporalAdjuster) localDate13);
        java.time.LocalDate localDate23 = localDate13.withDayOfYear((int) 'a');
        java.time.LocalDate localDate25 = localDate13.plusDays(1L);
        boolean boolean26 = formatStyleEnumMap2.equals((java.lang.Object) localDate13);
        java.time.Duration duration28 = java.time.Duration.ofHours((long) 4);
        java.lang.String str29 = duration28.toString();
        java.lang.Object obj30 = formatStyleEnumMap2.get((java.lang.Object) duration28);
        org.junit.Assert.assertTrue("'" + formatStyle3 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle3.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(decimalStyle5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertNotNull(decimalStyle8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-999999999-01-01" + "'", str12, "-999999999-01-01");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 365 + "'", int14 == 365);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(chronoLocalDate19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-365243219162L) + "'", long20 == (-365243219162L));
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT4H" + "'", str29, "PT4H");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime1.withMinute((int) (short) 1);
        java.time.LocalTime localTime4 = offsetDateTime3.toLocalTime();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        int int6 = localDate5.lengthOfYear();
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        boolean boolean8 = localDate5.isAfter((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.LocalDateTime localDateTime9 = localTime4.atDate(localDate5);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime12 = offsetDateTime10.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime15 = offsetDateTime13.withMinute((int) (short) 1);
        java.time.LocalTime localTime16 = offsetDateTime15.toLocalTime();
        java.time.LocalDate localDate17 = java.time.LocalDate.MIN;
        int int18 = localDate17.lengthOfYear();
        java.time.LocalDate localDate19 = java.time.LocalDate.MIN;
        boolean boolean20 = localDate17.isAfter((java.time.chrono.ChronoLocalDate) localDate19);
        java.time.LocalDateTime localDateTime21 = localTime16.atDate(localDate17);
        java.time.OffsetDateTime offsetDateTime22 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset23 = offsetDateTime22.getOffset();
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset25 = offsetDateTime24.getOffset();
        boolean boolean26 = offsetDateTime22.isEqual(offsetDateTime24);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long28 = offsetDateTime22.getLong((java.time.temporal.TemporalField) chronoField27);
        boolean boolean29 = chronoField27.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit30 = chronoField27.getRangeUnit();
        java.time.LocalTime localTime31 = localTime16.truncatedTo(temporalUnit30);
        long long32 = localDateTime9.until((java.time.temporal.Temporal) offsetDateTime10, temporalUnit30);
        java.time.Instant instant33 = instant0.truncatedTo(temporalUnit30);
        // The following exception was thrown during execution in test generation
        try {
            java.time.DayOfWeek dayOfWeek34 = java.time.DayOfWeek.from((java.time.temporal.TemporalAccessor) instant33);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain DayOfWeek from TemporalAccessor: 1970-01-01T00:00:00Z of type java.time.Instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 365 + "'", int18 == 365);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField27.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9L + "'", long28 == 9L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit30 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit30.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 730486476412L + "'", long32 == 730486476412L);
        org.junit.Assert.assertNotNull(instant33);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.security.SignatureException signatureException1 = new java.security.SignatureException("Chinese");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime1.withMinute((int) (short) 1);
        java.time.LocalTime localTime4 = offsetDateTime3.toLocalTime();
        java.time.LocalDate localDate5 = java.time.LocalDate.MIN;
        int int6 = localDate5.lengthOfYear();
        java.time.LocalDate localDate7 = java.time.LocalDate.MIN;
        boolean boolean8 = localDate5.isAfter((java.time.chrono.ChronoLocalDate) localDate7);
        java.time.LocalDateTime localDateTime9 = localTime4.atDate(localDate5);
        java.time.OffsetDateTime offsetDateTime10 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset11 = offsetDateTime10.getOffset();
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset13 = offsetDateTime12.getOffset();
        boolean boolean14 = offsetDateTime10.isEqual(offsetDateTime12);
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long16 = offsetDateTime10.getLong((java.time.temporal.TemporalField) chronoField15);
        boolean boolean17 = chronoField15.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit18 = chronoField15.getRangeUnit();
        java.time.LocalTime localTime19 = localTime4.truncatedTo(temporalUnit18);
        java.time.Duration duration20 = java.time.Duration.of(0L, temporalUnit18);
        java.time.Duration duration22 = duration20.minusNanos(9L);
        java.time.Duration duration24 = duration20.minusNanos((-31557014135564285L));
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField15.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9L + "'", long16 == 9L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit18 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit18.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.util.stream.Stream<char[]> charArrayStream0 = java.util.stream.Stream.empty();
        org.junit.Assert.assertNotNull(charArrayStream0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        int int2 = properties1.size();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet3 = properties1.entrySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.ZonedDateTime zonedDateTime11 = localDateTime8.atZone((java.time.ZoneId) zoneOffset10);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset14 = offsetDateTime13.getOffset();
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        boolean boolean17 = offsetDateTime13.isEqual(offsetDateTime15);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long19 = offsetDateTime13.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean20 = chronoField18.isDateBased();
        java.time.temporal.ValueRange valueRange21 = offsetDateTime12.range((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalUnit temporalUnit22 = chronoField18.getRangeUnit();
        java.time.ZonedDateTime zonedDateTime23 = zonedDateTime11.truncatedTo(temporalUnit22);
        long long24 = zonedDateTime11.toEpochSecond();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField18.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(valueRange21);
        org.junit.Assert.assertTrue("'" + temporalUnit22 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit22.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(zonedDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-31557014135564330L) + "'", long24 == (-31557014135564330L));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLoopbackAddress();
        org.junit.Assert.assertNotNull(inetAddress0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "Higham-Hall 5(4)");
        java.nio.file.Path path3 = file2.toPath();
        boolean boolean4 = file2.canExecute();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream6 = new java.io.PrintStream(file2, "-999999999-01-01");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -999999999-01-01");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(path3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.minusHours((long) ' ');
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime0);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime3.withLaterOffsetAtOverlap();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime3.plusSeconds((-1L));
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        long[] longArray0 = new long[] {};
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(longArray0);
        java.util.stream.LongStream longStream2 = longStream1.sequential();
        java.util.stream.LongStream longStream4 = longStream2.limit((long) (short) 0);
        java.util.stream.LongStream longStream5 = longStream4.sequential();
        java.util.stream.LongStream longStream6 = longStream5.parallel();
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.time.Duration duration1 = java.time.Duration.ofHours((long) 4);
        java.time.Duration duration3 = duration1.minusMillis((long) (byte) 0);
        java.time.Duration duration5 = java.time.Duration.ofHours((long) 4);
        java.time.Duration duration7 = duration5.multipliedBy(0L);
        java.time.Duration duration8 = duration1.minus(duration7);
        java.lang.String str9 = duration8.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT4H" + "'", str9, "PT4H");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.time.Period period1 = java.time.Period.ofDays(0);
        java.time.Period period3 = period1.plusDays((long) 1);
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime6 = offsetDateTime4.withMinute((int) (short) 1);
        java.time.LocalTime localTime7 = offsetDateTime6.toLocalTime();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        int int9 = localDate8.lengthOfYear();
        java.time.LocalDate localDate10 = java.time.LocalDate.MIN;
        boolean boolean11 = localDate8.isAfter((java.time.chrono.ChronoLocalDate) localDate10);
        java.time.LocalDateTime localDateTime12 = localTime7.atDate(localDate8);
        java.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((long) 4096);
        int int15 = localDateTime12.getDayOfMonth();
        java.time.temporal.Temporal temporal16 = period1.subtractFrom((java.time.temporal.Temporal) localDateTime12);
        int int17 = period1.getMonths();
        java.time.Period period19 = period1.multipliedBy((int) 'a');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 365 + "'", int9 == 365);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(temporal16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.net.URISyntaxException uRISyntaxException2 = new java.net.URISyntaxException("", "hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) uRISyntaxException2);
        java.lang.String str4 = derivativeException3.getPattern();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!: " + "'", str4, "hi!: ");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.net.URI uRI1 = java.net.URI.create("");
        java.net.URI uRI2 = uRI1.normalize();
        java.lang.String str3 = uRI2.getRawQuery();
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertNotNull(uRI2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.duplicate();
        java.nio.FloatBuffer floatBuffer3 = floatBuffer1.duplicate();
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getDisplayName();
        java.lang.String str10 = locale5.getDisplayVariant(locale8);
        boolean boolean11 = floatBuffer3.equals((java.lang.Object) locale8);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.DoubleSummaryStatistics doubleSummaryStatistics1 = new java.util.DoubleSummaryStatistics();
        doubleStream0.forEach((java.util.function.DoubleConsumer) doubleSummaryStatistics1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = doubleStream0.toArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertEquals(doubleSummaryStatistics1.toString(), "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.ZonedDateTime zonedDateTime11 = localDateTime8.atZone((java.time.ZoneId) zoneOffset10);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime11.withEarlierOffsetAtOverlap();
        int int13 = zonedDateTime12.getMinute();
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime18 = offsetDateTime16.minusHours((long) ' ');
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime16);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = zonedDateTime19.withLaterOffsetAtOverlap();
        java.time.temporal.ValueRange valueRange21 = chronoField14.rangeRefinedBy((java.time.temporal.TemporalAccessor) localDateChronoZonedDateTime20);
        int int22 = zonedDateTime12.get((java.time.temporal.TemporalField) chronoField14);
        java.time.ZonedDateTime zonedDateTime24 = zonedDateTime12.minusNanos((-31557014135564333L));
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime26 = zonedDateTime24.withHour(559000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 559000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH + "'", chronoField14.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertNotNull(valueRange21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(zonedDateTime24);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.lang.String str1 = java.net.URLConnection.getDefaultRequestProperty("P0D");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.time.LocalDate localDate0 = java.time.LocalDate.MIN;
        int int1 = localDate0.lengthOfYear();
        java.time.LocalDate localDate2 = java.time.LocalDate.MIN;
        boolean boolean3 = localDate0.isAfter((java.time.chrono.ChronoLocalDate) localDate2);
        java.time.Period period5 = java.time.Period.ofMonths((-1));
        java.time.chrono.ChronoLocalDate chronoLocalDate6 = localDate0.minus((java.time.temporal.TemporalAmount) period5);
        long long7 = localDate0.toEpochDay();
        java.lang.String str8 = localDate0.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoLocalDate6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-365243219162L) + "'", long7 == (-365243219162L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-999999999-01-01" + "'", str8, "-999999999-01-01");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.BASIC_ISO_DATE;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset13 = zoneRules1.getOffset(localDateTime12);
        java.util.List<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList14 = zoneRules1.getTransitions();
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset17 = offsetDateTime16.getOffset();
        java.time.OffsetDateTime offsetDateTime18 = offsetDateTime15.withOffsetSameInstant(zoneOffset17);
        java.time.Instant instant19 = offsetDateTime18.toInstant();
        int int20 = instant19.getNano();
        java.time.Instant instant22 = instant19.plusSeconds((long) (byte) -1);
        java.time.ZoneOffset zoneOffset23 = zoneRules1.getOffset(instant19);
        java.time.LocalTime localTime24 = java.time.LocalTime.now((java.time.ZoneId) zoneOffset23);
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime27 = offsetDateTime25.withMinute((int) (short) 1);
        java.time.LocalTime localTime28 = offsetDateTime27.toLocalTime();
        java.time.LocalDate localDate29 = java.time.LocalDate.MIN;
        int int30 = localDate29.lengthOfYear();
        java.time.LocalDate localDate31 = java.time.LocalDate.MIN;
        boolean boolean32 = localDate29.isAfter((java.time.chrono.ChronoLocalDate) localDate31);
        java.time.LocalDateTime localDateTime33 = localTime28.atDate(localDate29);
        java.time.OffsetDateTime offsetDateTime34 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset35 = offsetDateTime34.getOffset();
        java.time.OffsetDateTime offsetDateTime36 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset37 = offsetDateTime36.getOffset();
        boolean boolean38 = offsetDateTime34.isEqual(offsetDateTime36);
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long40 = offsetDateTime34.getLong((java.time.temporal.TemporalField) chronoField39);
        boolean boolean41 = chronoField39.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit42 = chronoField39.getRangeUnit();
        java.time.LocalTime localTime43 = localTime28.truncatedTo(temporalUnit42);
        int int44 = localTime24.compareTo(localTime28);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionList14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(instant19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 552000000 + "'", int20 == 552000000);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 365 + "'", int30 == 365);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertNotNull(zoneOffset35);
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertNotNull(zoneOffset37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField39.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 9L + "'", long40 == 9L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit42 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit42.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.time.LocalTime localTime0 = java.time.LocalTime.MIN;
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.duplicate();
        java.nio.FloatBuffer floatBuffer3 = floatBuffer1.duplicate();
        java.nio.ByteOrder byteOrder4 = floatBuffer1.order();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.SATURDAY;
        java.time.format.TextStyle textStyle1 = java.time.format.TextStyle.FULL;
        java.util.Locale locale5 = new java.util.Locale("-999999999-01-01", "", "Higham-Hall 5(4)");
        java.lang.String str6 = dayOfWeek0.getDisplayName(textStyle1, locale5);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime7.withMinute((int) (short) 1);
        java.time.LocalTime localTime10 = offsetDateTime9.toLocalTime();
        java.time.LocalDate localDate11 = java.time.LocalDate.MIN;
        int int12 = localDate11.lengthOfYear();
        java.time.LocalDate localDate13 = java.time.LocalDate.MIN;
        boolean boolean14 = localDate11.isAfter((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.LocalDateTime localDateTime15 = localTime10.atDate(localDate11);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset17 = offsetDateTime16.getOffset();
        java.time.ZonedDateTime zonedDateTime18 = localDateTime15.atZone((java.time.ZoneId) zoneOffset17);
        java.time.ZonedDateTime zonedDateTime19 = zonedDateTime18.withEarlierOffsetAtOverlap();
        int int20 = zonedDateTime19.getMinute();
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH;
        java.time.temporal.TemporalUnit temporalUnit22 = chronoField21.getRangeUnit();
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime25 = offsetDateTime23.minusHours((long) ' ');
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime23);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime27 = zonedDateTime26.withLaterOffsetAtOverlap();
        java.time.temporal.ValueRange valueRange28 = chronoField21.rangeRefinedBy((java.time.temporal.TemporalAccessor) localDateChronoZonedDateTime27);
        int int29 = zonedDateTime19.get((java.time.temporal.TemporalField) chronoField21);
        boolean boolean30 = dayOfWeek0.isSupported((java.time.temporal.TemporalField) chronoField21);
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.FULL + "'", textStyle1.equals(java.time.format.TextStyle.FULL));
        org.junit.Assert.assertEquals(locale5.toString(), "-999999999-01-01__Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Saturday" + "'", str6, "Saturday");
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 365 + "'", int12 == 365);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH + "'", chronoField21.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH));
        org.junit.Assert.assertTrue("'" + temporalUnit22 + "' != '" + java.time.temporal.ChronoUnit.MONTHS + "'", temporalUnit22.equals(java.time.temporal.ChronoUnit.MONTHS));
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime27);
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor2 = dateTimeFormatter0.parse((java.lang.CharSequence) "Higham-Hall 5(4)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Higham-Hall 5(4)' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        long[] longArray3 = new long[] { 10L, 'a', 1 };
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray3);
        java.nio.LongBuffer longBuffer5 = longBuffer4.duplicate();
        boolean boolean7 = longBuffer5.equals((java.lang.Object) (-31557014135564334L));
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer10 = longBuffer5.put(9000000, (long) 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 97, 1]");
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.ZonedDateTime zonedDateTime11 = localDateTime8.atZone((java.time.ZoneId) zoneOffset10);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset14 = offsetDateTime13.getOffset();
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset16 = offsetDateTime15.getOffset();
        boolean boolean17 = offsetDateTime13.isEqual(offsetDateTime15);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long19 = offsetDateTime13.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean20 = chronoField18.isDateBased();
        java.time.temporal.ValueRange valueRange21 = offsetDateTime12.range((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalUnit temporalUnit22 = chronoField18.getRangeUnit();
        java.time.ZonedDateTime zonedDateTime23 = zonedDateTime11.truncatedTo(temporalUnit22);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset26 = offsetDateTime25.getOffset();
        java.time.OffsetDateTime offsetDateTime27 = offsetDateTime24.withOffsetSameInstant(zoneOffset26);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules30 = zoneOffset29.getRules();
        int int31 = zoneOffset28.compareTo(zoneOffset29);
        java.time.ZonedDateTime zonedDateTime32 = offsetDateTime24.atZoneSimilarLocal((java.time.ZoneId) zoneOffset28);
        boolean boolean33 = zonedDateTime11.isEqual((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime32);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField18.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(valueRange21);
        org.junit.Assert.assertTrue("'" + temporalUnit22 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit22.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(zoneRules30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "Higham-Hall 5(4)");
        java.io.File file4 = new java.io.File(file2, "09:13:58.976Z");
        java.io.File file5 = null;
        java.io.File file7 = new java.io.File(file5, "Higham-Hall 5(4)");
        java.nio.file.Path path8 = file7.toPath();
        boolean boolean9 = file7.canExecute();
        boolean boolean10 = file4.renameTo(file7);
        boolean boolean12 = file7.setWritable(false);
        long long13 = file7.getFreeSpace();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals(file4.getParent(), "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals(file4.toString(), "Higham-Hall 5(4)/09:13:58.976Z");
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 299105091584L + "'", long13 == 299105091584L);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.println((java.lang.Object) 34116820800000L);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MINUTES;
        timeUnit0.sleep(0L);
        long long4 = timeUnit0.toSeconds((long) (short) 100);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 6000L + "'", long4 == 6000L);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        float[] floatArray0 = new float[] {};
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.wrap(floatArray0);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.duplicate();
        java.nio.ByteOrder byteOrder3 = floatBuffer2.order();
        java.lang.String str4 = floatBuffer2.toString();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapFloatBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapFloatBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset7 = offsetDateTime6.getOffset();
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime5.withOffsetSameInstant(zoneOffset7);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        boolean boolean11 = zoneOffset7.equals((java.lang.Object) zoneOffset10);
        java.time.ZonedDateTime zonedDateTime12 = offsetDateTime2.atZoneSimilarLocal((java.time.ZoneId) zoneOffset10);
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime12.withHour(0);
        java.time.LocalDate localDate15 = zonedDateTime14.toLocalDate();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.IntStream intStream3 = intStream1.limit((long) ' ');
        boolean boolean4 = intStream1.isParallel();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = intStream1.toArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.SECONDS;
        long long2 = timeUnit0.toDays((long) 29);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        doubleStream0.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfDouble ofDouble2 = doubleStream0.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 'a');
        java.util.function.DoublePredicate doublePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = doubleStream1.anyMatch(doublePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period1 = java.time.Period.parse((java.lang.CharSequence) "Higham-Hall 5(4)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.io.PrintStream printStream1 = new java.io.PrintStream("HalfDays");
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset4 = offsetDateTime3.getOffset();
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset6 = offsetDateTime5.getOffset();
        boolean boolean7 = offsetDateTime3.isEqual(offsetDateTime5);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long9 = offsetDateTime3.getLong((java.time.temporal.TemporalField) chronoField8);
        boolean boolean10 = chronoField8.isDateBased();
        java.time.temporal.ValueRange valueRange11 = offsetDateTime2.range((java.time.temporal.TemporalField) chronoField8);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime12.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime16 = offsetDateTime14.plusNanos((long) 10);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime18 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset19 = offsetDateTime18.getOffset();
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime17.withOffsetSameInstant(zoneOffset19);
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset22 = offsetDateTime21.getOffset();
        boolean boolean23 = zoneOffset19.equals((java.lang.Object) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = offsetDateTime14.atZoneSimilarLocal((java.time.ZoneId) zoneOffset22);
        long long25 = chronoField8.getFrom((java.time.temporal.TemporalAccessor) offsetDateTime14);
        java.time.LocalDate localDate26 = java.time.LocalDate.MIN;
        java.time.chrono.Era era27 = localDate26.getEra();
        java.time.format.TextStyle textStyle28 = java.time.format.TextStyle.FULL;
        java.io.PrintWriter printWriter30 = new java.io.PrintWriter("Subject:\n");
        printWriter30.close();
        printWriter30.println((float) 0);
        java.util.Locale locale35 = new java.util.Locale("");
        java.lang.String str36 = locale35.getDisplayName();
        java.util.Locale.setDefault(locale35);
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator39 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.text.Format.Field field40 = null;
        java.text.FieldPosition fieldPosition41 = new java.text.FieldPosition(field40);
        fieldPosition41.setBeginIndex((int) ' ');
        java.nio.ByteOrder byteOrder44 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.lang.Object[] objArray45 = new java.lang.Object[] { wildcardChronoZonedDateTimeComparator39, ' ', byteOrder44 };
        java.io.PrintWriter printWriter46 = printWriter30.printf(locale35, "", objArray45);
        java.lang.String str47 = era27.getDisplayName(textStyle28, locale35);
        java.lang.String str48 = chronoField8.getDisplayName(locale35);
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter("Subject:\n");
        printWriter51.close();
        printWriter51.println((float) 0);
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale56.getDisplayName();
        java.util.Locale.setDefault(locale56);
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator60 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.text.Format.Field field61 = null;
        java.text.FieldPosition fieldPosition62 = new java.text.FieldPosition(field61);
        fieldPosition62.setBeginIndex((int) ' ');
        java.nio.ByteOrder byteOrder65 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.lang.Object[] objArray66 = new java.lang.Object[] { wildcardChronoZonedDateTimeComparator60, ' ', byteOrder65 };
        java.io.PrintWriter printWriter67 = printWriter51.printf(locale56, "", objArray66);
        java.util.Locale locale68 = java.util.Locale.ENGLISH;
        java.text.Format.Field field76 = null;
        java.text.FieldPosition fieldPosition77 = new java.text.FieldPosition(field76);
        java.nio.file.attribute.FileTime fileTime79 = java.nio.file.attribute.FileTime.fromMillis((long) (short) 0);
        java.lang.Object[] objArray80 = new java.lang.Object[] { '#', (byte) 10, (byte) 1, 1.0d, fieldPosition77, fileTime79 };
        java.net.UnknownHostException unknownHostException82 = new java.net.UnknownHostException("hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException83 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "Higham-Hall 5(4)", objArray80, (java.lang.Throwable) unknownHostException82);
        java.io.PrintWriter printWriter84 = printWriter67.printf(locale68, "P-1M", objArray80);
        java.io.PrintStream printStream85 = printStream1.format(locale35, "Higham-Hall 5(4)", objArray80);
        printStream85.write((int) '\uffff');
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField8.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(valueRange11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9L + "'", long25 == 9L);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + era27 + "' != '" + java.time.chrono.IsoEra.BCE + "'", era27.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertTrue("'" + textStyle28 + "' != '" + java.time.format.TextStyle.FULL + "'", textStyle28.equals(java.time.format.TextStyle.FULL));
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator39);
        org.junit.Assert.assertNotNull(byteOrder44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(printWriter46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "BC" + "'", str47, "BC");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ClockHourOfAmPm" + "'", str48, "ClockHourOfAmPm");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator60);
        org.junit.Assert.assertNotNull(byteOrder65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(printWriter67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en");
        org.junit.Assert.assertNotNull(fileTime79);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertNotNull(printWriter84);
        org.junit.Assert.assertNotNull(printStream85);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset12 = offsetDateTime11.getOffset();
        boolean boolean13 = offsetDateTime9.isEqual(offsetDateTime11);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long15 = offsetDateTime9.getLong((java.time.temporal.TemporalField) chronoField14);
        boolean boolean16 = chronoField14.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField14.getRangeUnit();
        java.time.LocalTime localTime18 = localTime3.truncatedTo(temporalUnit17);
        java.time.OffsetDateTime offsetDateTime19 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset20 = offsetDateTime19.getOffset();
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset22 = offsetDateTime21.getOffset();
        boolean boolean23 = offsetDateTime19.isEqual(offsetDateTime21);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long25 = offsetDateTime19.getLong((java.time.temporal.TemporalField) chronoField24);
        java.time.LocalTime localTime27 = localTime18.with((java.time.temporal.TemporalField) chronoField24, (long) (byte) 1);
        java.time.temporal.ValueRange valueRange28 = chronoField24.range();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField24.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9L + "'", long25 == 9L);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(valueRange28);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 21);
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset2 = offsetDateTime1.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset4 = offsetDateTime3.getOffset();
        boolean boolean5 = offsetDateTime1.isEqual(offsetDateTime3);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long7 = offsetDateTime1.getLong((java.time.temporal.TemporalField) chronoField6);
        boolean boolean8 = chronoField6.isDateBased();
        java.time.temporal.ValueRange valueRange9 = offsetDateTime0.range((java.time.temporal.TemporalField) chronoField6);
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules11 = zoneOffset10.getRules();
        java.time.Clock clock12 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset10);
        java.time.OffsetTime offsetTime13 = java.time.OffsetTime.now(clock12);
        java.time.Period period15 = java.time.Period.ofMonths((-1));
        java.time.Period period17 = period15.minusDays((long) '#');
        boolean boolean18 = offsetTime13.equals((java.lang.Object) period15);
        java.time.OffsetDateTime offsetDateTime19 = offsetDateTime0.plus((java.time.temporal.TemporalAmount) period15);
        java.time.OffsetDateTime offsetDateTime20 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset22 = offsetDateTime21.getOffset();
        java.time.OffsetDateTime offsetDateTime23 = offsetDateTime20.withOffsetSameInstant(zoneOffset22);
        java.time.OffsetDateTime offsetDateTime25 = offsetDateTime23.minusYears((long) 100);
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime26 = java.time.chrono.ChronoLocalDateTime.from((java.time.temporal.TemporalAccessor) offsetDateTime23);
        java.time.OffsetDateTime offsetDateTime28 = offsetDateTime23.minusDays((long) 116000000);
        java.time.temporal.Temporal temporal29 = period15.subtractFrom((java.time.temporal.Temporal) offsetDateTime28);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField6.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zoneRules11);
        org.junit.Assert.assertNotNull(clock12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime26);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(temporal29);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset13 = zoneRules1.getOffset(localDateTime12);
        java.util.List<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList14 = zoneRules1.getTransitions();
        java.util.List<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList15 = zoneRules1.getTransitions();
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules17 = zoneOffset16.getRules();
        java.time.OffsetDateTime offsetDateTime18 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime18.withMinute((int) (short) 1);
        java.time.LocalTime localTime21 = offsetDateTime20.toLocalTime();
        java.time.LocalDate localDate22 = java.time.LocalDate.MIN;
        int int23 = localDate22.lengthOfYear();
        java.time.LocalDate localDate24 = java.time.LocalDate.MIN;
        boolean boolean25 = localDate22.isAfter((java.time.chrono.ChronoLocalDate) localDate24);
        java.time.LocalDateTime localDateTime26 = localTime21.atDate(localDate22);
        java.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset29 = zoneRules17.getOffset(localDateTime28);
        java.time.OffsetDateTime offsetDateTime31 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime33 = offsetDateTime31.withMinute((int) (short) 1);
        java.time.LocalTime localTime34 = offsetDateTime33.toLocalTime();
        java.time.LocalDate localDate35 = java.time.LocalDate.MIN;
        int int36 = localDate35.lengthOfYear();
        java.time.LocalDate localDate37 = java.time.LocalDate.MIN;
        boolean boolean38 = localDate35.isAfter((java.time.chrono.ChronoLocalDate) localDate37);
        java.time.LocalDateTime localDateTime39 = localTime34.atDate(localDate35);
        java.time.OffsetDateTime offsetDateTime40 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset41 = offsetDateTime40.getOffset();
        java.time.OffsetDateTime offsetDateTime42 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset43 = offsetDateTime42.getOffset();
        boolean boolean44 = offsetDateTime40.isEqual(offsetDateTime42);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long46 = offsetDateTime40.getLong((java.time.temporal.TemporalField) chronoField45);
        boolean boolean47 = chronoField45.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit48 = chronoField45.getRangeUnit();
        java.time.LocalTime localTime49 = localTime34.truncatedTo(temporalUnit48);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime50 = localDateTime28.plus(730486476412L, temporalUnit48);
        java.time.LocalDateTime localDateTime52 = localDateTime28.withDayOfMonth(4);
        java.time.ZoneOffset zoneOffset53 = zoneRules1.getOffset(localDateTime52);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionList14);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionList15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneRules17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 365 + "'", int23 == 365);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(offsetDateTime31);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 365 + "'", int36 == 365);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(offsetDateTime40);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertNotNull(offsetDateTime42);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField45.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 9L + "'", long46 == 9L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit48 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit48.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(zoneOffset53);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((long) 4096);
        int int11 = localDateTime8.getDayOfMonth();
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset15 = offsetDateTime14.getOffset();
        java.time.OffsetDateTime offsetDateTime16 = offsetDateTime13.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset18 = offsetDateTime17.getOffset();
        boolean boolean19 = zoneOffset15.equals((java.lang.Object) zoneOffset18);
        java.time.ZoneId zoneId20 = java.time.ZoneId.ofOffset("", zoneOffset15);
        java.time.OffsetDateTime offsetDateTime21 = localDateTime8.atOffset(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_INSTANT;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        int[] intArray0 = new int[] {};
        java.util.stream.IntStream intStream1 = java.util.stream.IntStream.of(intArray0);
        java.util.stream.IntStream intStream3 = intStream1.limit((long) ' ');
        java.util.stream.IntStream intStream4 = intStream3.distinct();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        long[] longArray0 = new long[] {};
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(longArray0);
        java.util.stream.LongStream longStream2 = longStream1.sequential();
        java.util.function.LongConsumer longConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            longStream2.forEachOrdered(longConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.ZonedDateTime zonedDateTime11 = localDateTime8.atZone((java.time.ZoneId) zoneOffset10);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime12.withMinute((int) (short) 1);
        java.time.LocalTime localTime15 = offsetDateTime14.toLocalTime();
        java.time.LocalDate localDate16 = java.time.LocalDate.MIN;
        int int17 = localDate16.lengthOfYear();
        java.time.LocalDate localDate18 = java.time.LocalDate.MIN;
        boolean boolean19 = localDate16.isAfter((java.time.chrono.ChronoLocalDate) localDate18);
        java.time.LocalDateTime localDateTime20 = localTime15.atDate(localDate16);
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset22 = offsetDateTime21.getOffset();
        java.time.ZonedDateTime zonedDateTime23 = localDateTime20.atZone((java.time.ZoneId) zoneOffset22);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules25 = zoneOffset24.getRules();
        java.time.Clock clock26 = java.time.Clock.tickSeconds((java.time.ZoneId) zoneOffset24);
        long long27 = localDateTime20.toEpochSecond(zoneOffset24);
        java.time.LocalDateTime localDateTime28 = localDateTime8.with((java.time.temporal.TemporalAdjuster) localDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 365 + "'", int17 == 365);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(zoneRules25);
        org.junit.Assert.assertNotNull(clock26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-31557014135564329L) + "'", long27 == (-31557014135564329L));
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean2 = subject0.equals((java.lang.Object) (-1.0f));
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Subject:\n" + "'", str3, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet4);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime9.getOffset();
        java.time.ZonedDateTime zonedDateTime11 = localDateTime8.atZone((java.time.ZoneId) zoneOffset10);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules13 = zoneOffset12.getRules();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset12);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.ofTotalSeconds((int) (short) 0);
        java.time.ZonedDateTime zonedDateTime17 = java.time.ZonedDateTime.ofStrict(localDateTime8, zoneOffset12, (java.time.ZoneId) zoneOffset16);
        java.lang.String str18 = localDateTime8.toString();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(zoneRules13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-999999999-01-01T09:01:11.374" + "'", str18, "-999999999-01-01T09:01:11.374");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "Higham-Hall 5(4)");
        java.io.File file4 = new java.io.File(file2, "09:13:58.976Z");
        java.io.File file5 = null;
        java.io.File file7 = new java.io.File(file5, "Higham-Hall 5(4)");
        java.nio.file.Path path8 = file7.toPath();
        boolean boolean9 = file7.canExecute();
        boolean boolean10 = file4.renameTo(file7);
        boolean boolean12 = file7.setWritable(false);
        boolean boolean13 = file7.isDirectory();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals(file4.getParent(), "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals(file4.toString(), "Higham-Hall 5(4)/09:13:58.976Z");
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.withMinute((int) (short) 1);
        java.time.LocalTime localTime3 = offsetDateTime2.toLocalTime();
        java.time.LocalDate localDate4 = java.time.LocalDate.MIN;
        int int5 = localDate4.lengthOfYear();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        boolean boolean7 = localDate4.isAfter((java.time.chrono.ChronoLocalDate) localDate6);
        java.time.LocalDateTime localDateTime8 = localTime3.atDate(localDate4);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.withMinute((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime12.withMinute((int) (short) 1);
        java.time.LocalTime localTime15 = offsetDateTime14.toLocalTime();
        java.time.LocalDate localDate16 = java.time.LocalDate.MIN;
        int int17 = localDate16.lengthOfYear();
        java.time.LocalDate localDate18 = java.time.LocalDate.MIN;
        boolean boolean19 = localDate16.isAfter((java.time.chrono.ChronoLocalDate) localDate18);
        java.time.LocalDateTime localDateTime20 = localTime15.atDate(localDate16);
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset22 = offsetDateTime21.getOffset();
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset24 = offsetDateTime23.getOffset();
        boolean boolean25 = offsetDateTime21.isEqual(offsetDateTime23);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long27 = offsetDateTime21.getLong((java.time.temporal.TemporalField) chronoField26);
        boolean boolean28 = chronoField26.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit29 = chronoField26.getRangeUnit();
        java.time.LocalTime localTime30 = localTime15.truncatedTo(temporalUnit29);
        long long31 = localDateTime8.until((java.time.temporal.Temporal) offsetDateTime9, temporalUnit29);
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.now();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime33 = localDateTime8.with((java.time.temporal.TemporalAdjuster) offsetDateTime32);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 365 + "'", int17 == 365);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField26.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9L + "'", long27 == 9L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit29 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit29.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 730486476412L + "'", long31 == 730486476412L);
        org.junit.Assert.assertNotNull(offsetDateTime32);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("Subject:\n");
        printWriter1.close();
        printWriter1.print((double) 1645434836016L);
        char[] charArray6 = new char[] { '0' };
        printWriter1.print(charArray6);
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter("Subject:\n");
        printWriter10.close();
        printWriter10.print((double) 1645434836016L);
        printWriter10.flush();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator20 = languageRangeList19.spliterator();
        java.util.Locale locale21 = java.util.Locale.CHINA;
        boolean boolean22 = languageRangeList19.equals((java.lang.Object) locale21);
        java.text.Format.Field field30 = null;
        java.text.FieldPosition fieldPosition31 = new java.text.FieldPosition(field30);
        java.nio.file.attribute.FileTime fileTime33 = java.nio.file.attribute.FileTime.fromMillis((long) (short) 0);
        java.lang.Object[] objArray34 = new java.lang.Object[] { '#', (byte) 10, (byte) 1, 1.0d, fieldPosition31, fileTime33 };
        java.net.UnknownHostException unknownHostException36 = new java.net.UnknownHostException("hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "Higham-Hall 5(4)", objArray34, (java.lang.Throwable) unknownHostException36);
        java.io.PrintWriter printWriter38 = printWriter10.printf(locale21, "", objArray34);
        java.io.PrintWriter printWriter39 = printWriter1.printf("", objArray34);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[0]");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(languageRangeSpliterator20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fileTime33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[#, 10, 1, 1.0, java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0], 1970-01-01T00:00:00Z]");
        org.junit.Assert.assertNotNull(printWriter38);
        org.junit.Assert.assertNotNull(printWriter39);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.net.URISyntaxException uRISyntaxException2 = new java.net.URISyntaxException("", "hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) uRISyntaxException2);
        int int4 = uRISyntaxException2.getIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime2.withMinute((int) (short) 1);
        java.time.LocalTime localTime5 = offsetDateTime4.toLocalTime();
        java.time.LocalDate localDate6 = java.time.LocalDate.MIN;
        int int7 = localDate6.lengthOfYear();
        java.time.LocalDate localDate8 = java.time.LocalDate.MIN;
        boolean boolean9 = localDate6.isAfter((java.time.chrono.ChronoLocalDate) localDate8);
        java.time.LocalDateTime localDateTime10 = localTime5.atDate(localDate6);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((long) 4096);
        java.time.ZoneOffset zoneOffset13 = zoneRules1.getOffset(localDateTime12);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime17 = offsetDateTime15.withMinute((int) (short) 1);
        java.time.LocalTime localTime18 = offsetDateTime17.toLocalTime();
        java.time.LocalDate localDate19 = java.time.LocalDate.MIN;
        int int20 = localDate19.lengthOfYear();
        java.time.LocalDate localDate21 = java.time.LocalDate.MIN;
        boolean boolean22 = localDate19.isAfter((java.time.chrono.ChronoLocalDate) localDate21);
        java.time.LocalDateTime localDateTime23 = localTime18.atDate(localDate19);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset25 = offsetDateTime24.getOffset();
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset27 = offsetDateTime26.getOffset();
        boolean boolean28 = offsetDateTime24.isEqual(offsetDateTime26);
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long30 = offsetDateTime24.getLong((java.time.temporal.TemporalField) chronoField29);
        boolean boolean31 = chronoField29.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit32 = chronoField29.getRangeUnit();
        java.time.LocalTime localTime33 = localTime18.truncatedTo(temporalUnit32);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime34 = localDateTime12.plus(730486476412L, temporalUnit32);
        java.time.LocalDateTime localDateTime36 = localDateTime12.plusYears((long) 3);
        java.time.LocalDateTime localDateTime38 = localDateTime36.minusYears((long) (short) 10);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 365 + "'", int20 == 365);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField29.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit32 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit32.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset1 = offsetDateTime0.getOffset();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.minusWeeks((long) 16);
        java.time.OffsetDateTime offsetDateTime5 = java.time.OffsetDateTime.now();
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime5.withMinute((int) (short) 1);
        java.time.LocalTime localTime8 = offsetDateTime7.toLocalTime();
        java.time.LocalDate localDate9 = java.time.LocalDate.MIN;
        int int10 = localDate9.lengthOfYear();
        java.time.LocalDate localDate11 = java.time.LocalDate.MIN;
        boolean boolean12 = localDate9.isAfter((java.time.chrono.ChronoLocalDate) localDate11);
        java.time.LocalDateTime localDateTime13 = localTime8.atDate(localDate9);
        java.time.OffsetDateTime offsetDateTime14 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset15 = offsetDateTime14.getOffset();
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset17 = offsetDateTime16.getOffset();
        boolean boolean18 = offsetDateTime14.isEqual(offsetDateTime16);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        long long20 = offsetDateTime14.getLong((java.time.temporal.TemporalField) chronoField19);
        boolean boolean21 = chronoField19.isDateBased();
        java.time.temporal.TemporalUnit temporalUnit22 = chronoField19.getRangeUnit();
        java.time.LocalTime localTime23 = localTime8.truncatedTo(temporalUnit22);
        java.time.Duration duration24 = java.time.Duration.of(0L, temporalUnit22);
        java.time.Duration duration26 = duration24.minusNanos(9L);
        java.time.OffsetDateTime offsetDateTime27 = offsetDateTime3.minus((java.time.temporal.TemporalAmount) duration26);
        java.time.LocalDate localDate28 = java.time.LocalDate.from((java.time.temporal.TemporalAccessor) offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertNotNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField19.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9L + "'", long20 == 9L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit22 + "' != '" + java.time.temporal.ChronoUnit.HALF_DAYS + "'", temporalUnit22.equals(java.time.temporal.ChronoUnit.HALF_DAYS));
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(localDate28);
    }
}
